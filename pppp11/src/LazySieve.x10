//package pppp.lib.lazystream.examples;

import pppp.lazystream.*;

import x10.util.Ordered;
import pppp.util.Logger;

/**
 * The Sieve of Eratosthenes.
 */
public class LazySieve {

    static def primes()=primes(Stream.nats(2));
    
    static def primeFor(p:Int)=(x:Int):Boolean=> x%p !=0;
    
    static def primes(r:Stream[Int]):Stream[Int] = () => {
        val rc = r(), p=rc.h;
        new Cons(p, primes(rc.t % primeFor(p)))
    };
       

    public static def main(args: Array[String](1)) {
        val N = args.size > 0 ? Int.parseInt(args(0)) : 10;
        Console.OUT.print("primes " + N + " = " ); 
        var time:Long = System.nanoTime();
        primes().force(N);	
        Console.OUT.println("Time:" 
                + (System.nanoTime()-time)*1.0/(1000*1000*1000)+ " s.");   
    }
}