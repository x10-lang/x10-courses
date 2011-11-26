//package pppp.lazystream.examples;
import pppp.lazystream.*;

import x10.util.Ordered;
import pppp.util.Logger;

/**
 * The sequence X=1:(Nats(2)*X).
 */
public class LazyFact {
	
	public static def fact():Stream[Long]=()=>x(); // hide x in a thunk.
	static val x=1~(Stream.longNats(2)*fact());
	    
	    public static def main(args: Array[String](1)) {
	        val N = args.size > 0 ? Int.parseInt(args(0)) : 10;
	        Console.OUT.print("fact " + N + " = " ); 
	        var time:Long = System.nanoTime();
	        fact().force(N);	
	        Console.OUT.println("Time:" 
	                + (System.nanoTime()-time)*1.0/(1000*1000*1000)+ " s.");
	    }

}