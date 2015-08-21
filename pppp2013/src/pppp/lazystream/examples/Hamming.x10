package pppp.lazystream.examples;
import pppp.lazystream.*;

import x10.util.Ordered;
import pppp.util.Logger;
/**
 * Generate the Hamming sequence lazily, defined by
 *  X = 1:omerge(2*X,omerge(3*X,5*X))
 */
public class Hamming {
    public static def h():Stream[Long]=()=>x();
    static val x= 1 ~ ((2*h())^(3*h())^(5*h()));
    
    public static def main(args: Rail[String]) {
        val N = args.size > 0 ? Int.parseInt(args(0)) : 10n;
        Console.OUT.print("hamming " + N + " = " ); 
        var time:Long = System.nanoTime();
        h().force(N);	
        Console.OUT.println("Time:" 
                + (System.nanoTime()-time)*1.0/(1000*1000*1000)+ " s.");    
    }
}