public class NQueensPar {
    public static val expectedSolutions =
        [0, 1, 0, 0, 2, 10, 4, 40, 92, 352, 724, 2680, 14200, 73712, 365596, 2279184, 14772512];

    val N:Long, P:Long;
    def this(N:Long, P:Long) { this.N=N; this.P=P;}

    def start() {
        new Board().search();
    }

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
            for (var k:Long=0; k < n; ++k) {
                if (j == q(k) || Math.abs(n-k) == Math.abs(j-q(k)))
                    return false;
            }
            return true;
        }

        /** Search for all solutions in parallel, on finding
         * a solution update nSolutions.
         */
        def search(range:LongRange) {
            for (k in range)
                if (safe(k))
                    new Board(q, k).search();
        }

        def search() offers Int {
            if (q.size == N) {
            	offer 1n;
                return;
            }
            if (q.size == 0) {
                val R = block(0..(N-1), P);
                for(q in 0..(P-1)) async
                  search(R(q));
            } else search(0..(N-1));
        }
    }

    static val reducer = new Reducible[Long]() {
    	public def zero() = 0;
    	public operator this(i:Long,j:Long)=i+j;
    };
    public static def main(args: Rail[String])  {
        val n = args.size > 0 ? Long.parseLong(args(0)) : 12;
        Console.OUT.println("N=" + n);
        //warmup
        val x = finish (reducer) { new NQueensPar(12, 1).start(); };
        val ps = [1,2,4,8];
        for (var i:Int = 0n; i < ps.size; i++) {
            Console.OUT.println("starting " + ps(i) + " threads");
            val nq = new NQueensPar(n,ps(i));
            var start:Long = -System.nanoTime();
            val count = finish(reducer) { nq.start(); };
            val result = count==expectedSolutions(n);
            start += System.nanoTime();
            start /= 1000000;
            Console.OUT.println("NQueensPar " + nq.N + "(P=" + ps(i) +
                    ") has " + count + " solutions" +
                    (result? " (ok)" : " (wrong)") + " (t=" + start + "ms).");
        }
    }
}
