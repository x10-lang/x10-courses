public class NQueensPar {
    public static val expectedSolutions =
        [0, 1, 0, 0, 2, 10, 4, 40, 92, 352, 724, 2680, 14200, 73712, 365596, 2279184, 14772512];

    val N:Int, P:Int;
    def this(N:Int, P:Int) { this.N=N; this.P=P;}

    def start() {
        new Board().search();
    }

    /**
     * Return an array of P regions, which together block divide the 1-D region R.
     */
    public static def block(R: Region(1), P: Int): Rail[Region(1)] = {
        assert P >= 0;
        val low = R.min()(0), high = R.max()(0), count = high-low+1;
        val baseSize = count/P, extra = count - baseSize*P;
        new Rail[Region(1)](P, (i:Int):Region(1) => {
            val start = low+i*baseSize+ (i < extra? i:extra);
            start..(start+baseSize+(i < extra?0:-1))
        })
    }

    class Board {

        val q: Rail[Int];

        def this() {
            q = new Rail[Int](0, (Int)=>0);
        }

        def this(old: Rail[Int], newItem:Int) {
            val n = old.size;
            q = new Rail[Int](n+1, (i:Int)=> (i < n? old(i) : newItem));
        }

        def safe(j: int) {
            val n = q.size;
            for (var k:int=0; k < n; ++k) {
                if (j == q(k) || Math.abs(n-k) == Math.abs(j-q(k)))
                    return false;
            }
            return true;
        }

        /** Search for all solutions in parallel, on finding
         * a solution update nSolutions.
         */
        def search(low:int, high:int) {
            for (k in low..high)
                if (safe(k))
                    new Board(q, k).search();
        }

        def search() offers Int {
            if (q.size == N) {
            	offer 1;
                return;
            }
            if (q.size == 0) {
                val R = block(0..(N-1), P);
                for([q] in 0..(P-1)) async
                  search(R(q).min()(0), R(q).max()(0));
            } else search(0, N-1);
        }
    }

    static val reducer = new Reducible[Int]() {
    	public def zero() = 0;
    	public operator this(i:Int,j:Int)=i+j;
    };
    public static def main(args: Array[String](1))  {
        val n = args.size > 0 ? Int.parseInt(args(0)) : 12;
        Console.OUT.println("N=" + n);
        //warmup
        val x = finish (reducer) { new NQueensPar(12, 1).start(); };
        val ps = [1,2,4,8];
        for (var i:Int = 0; i < ps.size; i++) {
            Console.OUT.println("starting " + ps(i) + " threads");
            val nq = new NQueensPar(n,ps(i));
            var start:Long = -System.nanoTime();
            val count = finish(reducer) { nq.start(); };
            val result = count==expectedSolutions(nq.N);
            start += System.nanoTime();
            start /= 1000000;
            Console.OUT.println("NQueensPar " + nq.N + "(P=" + ps(i) +
                    ") has " + count + " solutions" +
                    (result? " (ok)" : " (wrong)") + " (t=" + start + "ms).");
        }
    }
}
