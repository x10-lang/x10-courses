/**
   A distributed version of NQueens. Runs over NUM_PLACES.
   Identical to NQueensPar, except that it runs over multiple placs.

   @author vj
 */
public class NQueensDist {
    public static val expectedSolutions =
        [0, 1, 0, 0, 2, 10, 4, 40, 92, 352, 724, 2680, 14200, 73712, 365596, 2279184, 14772512];

    val N:Int, P:Int;
    val results:DistArray[Int](1);
    def this(N:Int, P:Int) { 
        this.N=N; 
        this.P=P;
        this.results = DistArray.make[Int](Dist.makeUnique(), (Point)=>0);
}
    def start() = 
        new Board().search();
    
    def run():Int {
        finish start();
        val result = results.reduce(Int.+,0);
        return result;
    }

    /**
     * Return an array of P regions, which together block divide the 1-D region R.
     */
    public static def block(R: Region(1), P: Int): ValRail[Region(1)](P) = {
        assert P >= 0;
        val low = R.min()(0), high = R.max()(0), count = high-low+1;
        val baseSize = count/P, extra = count - baseSize*P;
        ValRail.make[Region(1)](P, (i:Int):Region(1) => {
            val start = low+i*baseSize+ (i < extra? i:extra);
            start..start+baseSize+(i < extra?0:-1)
        })
    }

    class Board {
        val q: ValRail[Int];
        def this() {
            q = ValRail.make[Int](0, (Int)=>0);
        }
        def this(old: ValRail[Int], newItem:Int) {
            val n = old.length;
            q = ValRail.make[Int](n+1, (i:Int)=> (i < n? old(i) : newItem));
        }
        def safe(j: int) {
            val n = q.length;
            for ((k) in 0..n-1) {
                if (j == q(k) || Math.abs(n-k) == Math.abs(j-q(k)))
                    return false;
            }
            return true;
        }
        /** Search for all solutions in parallel, on finding
         * a solution update nSolutions.
         */
        def search(R: Region(1)) {
            for ((k) in R)
                if (safe(k))
                    new Board(q, k).search();
        }

        def search()  {
            if (q.length == N) {
                atomic NQueensDist.this.results(here.id)++;
                return;
            }
            if (q.length == 0) {
                val R = block(0..N-1, P);
                val D = Dist.makeUnique();
                for (p in D.places()) async at(p) 
                  search(R(p.id));
            } else search(0..N-1);
        }
    }

    public static def main(args: Rail[String])  {
        val n = args.length > 0 ? Int.parseInt(args(0)) : 8;
        println("N=" + n);
        //warmup
        //finish new NQueensPar(12, 1).start();
        val P = Place.MAX_PLACES;
        val nq = new NQueensDist(n,P);
        var start:Long = -System.nanoTime();
        val answer = nq.run();
        val result = answer==expectedSolutions(n);
        start += System.nanoTime();
        start /= 1000000;
        println("NQueensDist " + nq.N + "(P=" + P +
                ") has " + answer + " solutions" +
                (result? " (ok)." : " (wrong).") + "time=" + start + "ms");
    }

    static def println(s:String) = Console.OUT.println(s);
}
