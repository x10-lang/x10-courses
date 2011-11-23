//package pppp.lib.lazystream.examples;

import pppp.lib.lazystream.*;

import x10.util.Ordered;
import pppp.util.Logger;
import pppp.lib.lazystream.Utils;
/**
 * The Sieve of Eratosthenes.
 */
public class LazySieve {
	
	static def primes()=primes(Utils.Gen(2 as Int, (n:Int)=>n+1));
	
	static def multiple(p:Int)=(x:Int):Boolean=>x%p==0;
	
	static def primes(r:Stream[Int]):Stream[Int] = {
		val p = r.x(), s=r.y();
		new StreamImp[Int](p, ()=>primes(s % multiple(p)))
	}
	public static def main(args: Array[String](1)) {
		val N = args.size > 0 ? Int.parseInt(args(0)) : 10;
		Console.OUT.print("primes " + N + " = " ); 
		primes().print(N);	
	}
}