import x10.util.Random;
import x10.compiler.Inline;
import x10.compiler.Uncounted;

final class ParUTSBin {
    val thieves:FixedSizeStack[Int];
    
    val width:Int;
    val stack = new MyStack[SHA1Rand](65536);
    val lifelines:Rail[Int];
    
    // Which of the lifelines have I actually activated?
    val lifelinesActivated:Rail[Boolean];
    
    val b0:Int; // root branching factor
    val q:Long;
    val m:Int;
    val k:Int;
    val nu:Int; // For the binomial tree
    
    val l:Int; 
    val z:Int;
    val myRandom = new Random();
    public val counter:Counter;
    var active:Boolean=false;
    @x10.compiler.Volatile transient var empty:Boolean;
    @x10.compiler.Volatile transient var waiting:Boolean;
    public def counters()=[counter as Counter];
    
    /** Initialize the state. Executed at all places when executing the 
     * PlaceLocalHandle.make command in main (of UTS). BINOMIAL
     */
    public def this (b0:Int, 
            q:Long, 
            m:Int, 
            k:Int, 
            nu:Int, 
            w:Int, 
            e:Boolean, 
            l:Int,
            lifelineNetwork:Rail[Int]) {
        this.b0 = b0;
        this.q = q; 
        this.m = m; 
        this.k = k; 
        this.nu = nu; 
        this.l = l;
        this.lifelines = lifelineNetwork;
        this.z = lifelineNetwork.size;
        this.width = w;
        this.counter = new Counter(false);
        thieves = new FixedSizeStack[Int](z);
        lifelinesActivated = new Rail[Boolean](Place.MAX_PLACES);
    }
    
    @Inline final def processLoot(loot:Rail[SHA1Rand], lifeline:Boolean) {
        counter.incRx(lifeline, loot.size);
        for (var i:Int=0; i<loot.size; ++i) {
        	val node = loot(i);
        	if (node() < q) for (var ii:Int=0; ii<m; ++ii) stack.push(SHA1Rand (node, ii));
        }
        counter.nodesCounter += loot.size;
    }
    
    @Inline final def processAtMostN() {
        val n = min(stack.size(), nu);
    	for (var i:Int=0; i<n; ++i) {
        	val node = stack.pop();
        	if (node() < q) for (var ii:Int=0; ii<m; ++ii) stack.push(SHA1Rand (node, ii));
        }
        counter.nodesCounter += n;
        return n > 0;
    }
    
    /** A trivial function to calculate minimum of 2 integers */
    @Inline def min(i:int,j:int) = i < j ? i : j;
    
    /** Go through each element in the stack, process it (generate its
     * children, and add them to the stack) until there is nothing left
     * on the stack. At this point, attempt to steal. If nothing can be 
     * stolen, terminate for now. Also, after processing a particular 
     * number of nodes, check if there are any outstanding messages to
     * handle and also, distribute a chunk of the local stack (work) to 
     * our lifeline buddy.
     */
    final def processStack(st:PlaceLocalHandle[ParUTSBin]) {
        do {
            while (processAtMostN()) {
                Runtime.probe();
                distribute(st);
            }
        } while (steal(st));
    }
    
    /** If our buddy/buddies have requested a lifeline, and we have ample supply 
     * of nodes, give him half (i.e, launch a remote async). We are not timing this 
     * section because it ultimately turns around and calls the distribute() function
     * below, which is timed.
     */
    @Inline def distribute(st:PlaceLocalHandle[ParUTSBin]) {
        var numThieves:Int = thieves.size();
        if (numThieves == 0) return;
        val lootSize = stack.size();
        if (lootSize >= 2) {
            numThieves = min(numThieves+1, lootSize);
            val numToSteal = lootSize/numThieves;
            val victim = Runtime.hereInt();
            for (var i:Int=1; i < numThieves; ++i) {
                val thief = thieves.pop();
                val loot = stack.pop(numToSteal);
                counter.incTxNodes(numToSteal);
                async at(Place(thief)) st().deal(st, loot, victim);
            }
        }
    }
    
    /** This is the code invoked locally by each node when there are no 
     * more nodes left on the stack. In other words, this function is 
     * the basis of all pull-based stealing. The push based stealing 
     * happens through the lifeline system. First, we attempt to get 
     * work from randomly chosen neighbors (for a certain number of 
     * tries). If we are not successful, we invoke our lifeline system.
     */
    def steal(st:PlaceLocalHandle[ParUTSBin]) {
        val P = Place.MAX_PLACES;
        if (P == 1) return false;
        val p = Runtime.hereInt();
        empty = true;
        for (var i:Int=0; i < width && empty; ++i) {
            var q_:Int = 0;
            while ((q_ = myRandom.nextInt(P)) == p);
            val q = q_;
            counter.incStealsAttempted();
            waiting = true;
            @Uncounted async at(Place(q)) st().request(st, p, false);
            while (waiting) Runtime.probe();
        }
        for (var i:Int=0; (i<lifelines.size) && empty && (0<=lifelines(i)); ++i) {
            val lifeline:Int = lifelines(i);
            if (!lifelinesActivated(lifeline)) {
                lifelinesActivated(lifeline) = true;
                waiting = true;
                @Uncounted async at(Place(lifeline)) st().request(st, p, true);
                while (waiting) Runtime.probe();
            }
        }
        return !empty;
    }
    
    /** Try to steal from the local stack --- invoked by either a 
     * theif at a remote place using asyncs (during attemptSteal) 
     * or by the owning place itself when it wants to give work to 
     * a fallen buddy.
     */
    def request(st:PlaceLocalHandle[ParUTSBin], thief:Int, isLifeLine:Boolean) {
        ++counter.stealsReceived;
        val length = stack.size();
        val numSteals = k==0 ? (length >= 2 ? length/2 : 0) : (k < length ? k : (k/2 < length ? k/2 : 0));
        if (numSteals==0) {
            if (isLifeLine) thieves.push(thief);
            @Uncounted async at (Place(thief)) { st().waiting = false; }
        } else {
            val loot = stack.pop(numSteals);
            counter.nodesGiven += numSteals;
            ++counter.stealsSuffered;
            val victim = isLifeLine ? Runtime.hereInt() : -1;
            @Uncounted async at (Place(thief)) { st().deal(st, loot, victim); st().waiting = false; }
        }
    }
    
    def deal(st:PlaceLocalHandle[ParUTSBin], loot:Rail[SHA1Rand], source:Int) {
        val isLifeLine = source >= 0;
        try {
            if (isLifeLine) lifelinesActivated(source) = false;
            if (active) {
                empty = false;
                processLoot(loot, isLifeLine);
            } else {
                active = true;
                counter.startLive();
                processLoot(loot, isLifeLine);
                //distribute(st);
                processStack(st);
                counter.stopLive();
                active = false;
            }
        } catch (v:Throwable) {
            Console.OUT.println("Exception at " + here);
            v.printStackTrace();
        }
    }
    
    /** Called only for the root node. Processes all the children of 
     * the root node and then proceeds to divide these children up 
     * evenly amongst all the places. This is the bootstrap mechanism
     * for distributed UTS.
     */
    def main(st:PlaceLocalHandle[ParUTSBin], rootNode:SHA1Rand) {
        val P = Place.MAX_PLACES;
        finish {
            active = true;
            counter.startLive();
            for (var i:Int=0; i<b0; ++i) stack.push(SHA1Rand (rootNode, i));
            ++counter.nodesCounter; // root node is never pushed on the stack.
            
            val lootSize = stack.size()/P;
            for (var pi:Int=1 ; pi<P ; ++pi) {
                val loot = stack.pop(lootSize);
                val pi_ = pi;
                async at(Place(pi_)) {
                    st().deal(st, loot, 0);
                }
                counter.incTxNodes(lootSize);
            }
            processStack(st);
            counter.stopLive();
            active = false;
        } 
    }
}

