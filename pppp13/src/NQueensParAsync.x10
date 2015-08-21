public class NQueensParAsync {

    public static val expectedSolutions =
        [0, 1, 0, 0, 2, 10, 4, 40, 92, 352, 724, 2680, 14200, 73712, 365596, 2279184, 14772512];
    val N:Long;
    def this(N:Long) { this.N=N; }
    def start() {
        new Board().search();
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

        /** Search for all solutions in parallel.
         */
        def search(range:LongRange) {
            for (k in range)
                if (safe(k)) async new Board(q, k).search();
        }

        def search()  offers Long {
            if (q.size == N) offer 1;
            else search(0..(N-1));
        }
    }

    static val sum = new Reducible[Long]() {
    	public def zero()=0;
    	public operator this(i:Long,j:Long)=i+j;
    };
    public static def main(args: Rail[String])  {
    	val n = args.size > 0 ? Long.parseLong(args(0)) : 12;
    	Console.OUT.println("N=" + n);
    	
    	val nq = new NQueensParAsync(n);
    	var start:Long = -System.nanoTime();
    	val count = finish(sum){ nq.start();};
    	val result =count==expectedSolutions(nq.N);
    	start += System.nanoTime();
    	start /= 1000000;
    	Console.OUT.println("NQueensParAsync " + nq.N +
    			") has " + count+ " solutions" +
    			         (result? " (ok)" : " (wrong)") + " (t=" + start + "ms).");
    }
}
