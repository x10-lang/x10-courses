package pppp.lib.stream.examples;
/** An implementation of the Sieve of Eratosthenes,
    using clocked variables.

    <p> Prints out prime numbers upto N.
    @author vj
 */
import pppp.lib.stream.*;
import pppp.util.Logger;
public class Sieve {
    public static def main(s:Rail[String]) {
        val N = s.size > 0 ? Int.parseInt(s(0)) : 100n;
        val time = System.nanoTime();
        finish {
        	Logger.log("Starting prime");
        	XDucer.print(primes(gen(N)), 10n);
        }
        Console.OUT.println("Time: "
                   + ((System.nanoTime()-time)*1.0)/(1000*1000*1000)
                   + " s.");
    }

    static def gen(N:Int):Stream[Int] = new FBy[Int](2n..N);
    static def primes(nums:Stream[Int]):Stream[Int] { // = sieve(nums(), nums);
    	try {
    		val prime = nums();
    		Logger.debug(()=> "Prime: " + prime);
    		val s = new FByPush[Int](prime, ()=> primes(sieve(prime, nums)), "prime(" + prime+")");
    		s.run();
    		return s;
    	} catch (z: StreamClosedException) {
    		Logger.debug(()=>"Primes(" + nums + ") throws exception.");
    		throw z;
    	}
    }

    static def sieve(prime:Int, nums:Stream[Int]):Stream[Int] {
    	val s = new BoundedStreamImp[Int]();
    	async {
    		Logger.log(()=> "Starting sieve(" + prime + ")");
    		try {
    			while (true) {
    				val item = nums();
    				if (item % prime != 0n)
    					s()=item;
    			}
    		} catch (StreamClosedException) {
    			s.close();
    		}
    	}
    	return s;
    }
     
}