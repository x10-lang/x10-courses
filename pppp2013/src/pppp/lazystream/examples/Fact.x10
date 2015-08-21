package pppp.lazystream.examples;
import pppp.lazystream.*;

import x10.util.Ordered;
import pppp.util.Logger;
/**
 * The sequence X=1:(Nats(2)*X).
 */
public class Fact {
	
    public static def fact():Stream[Long]=()=>(x());
    static val x=1~(Stream.longNats(2)*fact());

    public static def fact2():Stream[Long]=
        ()=> new Cons[Long](1, Stream.longNats(2)*fact2());

    
    public static def main(args: Rail[String]) {
        val N = args.size > 0 ? Int.parseInt(args(0)) : 10n;
        Console.OUT.print("fact " + N + " = " ); 
        var time:Long = System.nanoTime();
        fact().force(N);	
        Console.OUT.println("Time:" 
                + (System.nanoTime()-time)*1.0/(1000*1000*1000)+ " s.");
        Console.OUT.print("fact2 " + N + " = " ); 
        
        time = System.nanoTime();
        fact2().force(N);	
        Console.OUT.println("Time:" 
                + (System.nanoTime()-time)*1.0/(1000*1000*1000)+ " s.");    
    }

}