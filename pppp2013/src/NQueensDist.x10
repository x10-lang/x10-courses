/**
 * A distributed version of NQueens. Runs over NUM_PLACES.
 * Identical to NQueensPar, except that it runs over multiple placs.
 * 
 * @author vj
 */
public class NQueensDist {
    public static val expectedSolutions =
        [0, 1, 0, 0, 2, 10, 4, 40, 92, 352, 724, 2680, 14200, 73712, 365596, 2279184, 14772512];
	
    val N:Long, P:Long;
    def this(N:Long, P:Long) { 
        this.N=N; 
        this.P=P;
    }
    def start() { new Board().search();}
    def run() = finish (reducer) {start();};
	
    /**
     * Return an array of P regions, which together block divide the 1-D region R.
     */
    public static def block(R: LongRange, P: Long): Rail[LongRange] = {
        assert P >= 0;
        val low = R.min, high = R.max, count = high-low+1n;
        val baseSize = count/P, extra = count - baseSize*P;
        new Rail[LongRange](P, (i:Long):LongRange => {
                val start = low+i*baseSize+ (i < extra? i:extra);
                start..(start+baseSize+(i < extra?0:-1))
            })
    }
	
	class Board {
            val q: Rail[Long];
            def this() {
                q = new Rail[Long](0, (Long)=>0);
            }
            def this(old: Rail[Long], newItem:Long) {
                val n = old.size;
                q = new Rail[Long](n+1, (i:Long)=> (i < n? old(i) : newItem));
            }
            def safe(j: Long) {
                val n = q.size;
                for (k in 0..(n-1)) {
                    if (j == q(k) || Math.abs(n-k) == Math.abs(j-q(k)))
                        return false;
                }
                return true;
            }
            /** Search for all solutions in parallel, on finding
             * a solution update nSolutions.
             */
            def search(R: LongRange) {
                for (k in R)
                    if (safe(k))
                        new Board(q, k).search();
            }
		
            def search()  offers Int {
                if (q.size == N) {
                    offer 1n;
                    return;
                }
                if (q.size == 0) {
                    val R = block(0..(N-1), P);
                    for (p in Place.places())
                        async at(p) 
                            search(R(p.id));
                } else search(0..(N-1));
            }
	}
    static val reducer = new Reducible[Int]() {
        public def zero() = 0n;
        public operator this(i:Int,j:Int)=i+j;
    };
    public static def main(args: Rail[String])  {
        val n = args.size > 0 ? Long.parseLong(args(0)) : 8;
        Console.OUT.println("N=" + n);
        //warmup
        //finish new NQueensPar(12, 1).start();
        val P = Place.MAX_PLACES;
        val nq = new NQueensDist(n,P);
        var start:Long = -System.nanoTime();
        val answer = nq.run() as Long;
        val result = answer==expectedSolutions(n);
        start += System.nanoTime();
        start /= 1000000;
        Console.OUT.println("NQueensDist " + nq.N + "(P=" + P +
                ") has " + answer + " solutions" +
                (result? " (ok)" : " (wrong)") + " (t=" + start + "ms).");
    }
    

}
