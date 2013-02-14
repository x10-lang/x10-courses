package pppp.lib.stream.examples;
/** An implementation of the Sieve of Eratosthenes,
    using clocked variables.

    <p> Prints out prime numbers upto N.
    @author vj
 */
import pppp.lib.stream.*;
import pppp.util.Logger;
public class SimpleStreamExample {
    public static def main(s:Rail[String]) {
        val N = s.size > 0 ? Int.parseInt(s(0)) : 100;
        Logger.info(()=>"Starting... ");
        val time = System.nanoTime();
        finish {
        	Logger.info("Starting prime");
        	XDucer.print(twice(gen(N)), 10);
        }
        Logger.info(()=>"Time: "
                   + ((System.nanoTime()-time)*1.0)/(1000*1000*1000)
                   + " s.");
    }

    static def gen(N:Int):Stream[Int] = new FBy[Int](2..N);
    static def twice(nums:Stream[Int]):Stream[Int] {
    	val s = new BoundedStreamImp[Int]();
    	async {
	    Logger.info(()=> "Starting twice(...)");
	    try {
		while (true) {
		    val item = nums();
		    s()=2*item;
		}
	    } catch (StreamClosedException) {
		s.close();
	    }
    	}
    	return s;
    }

}