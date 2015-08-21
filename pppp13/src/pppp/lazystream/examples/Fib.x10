package pppp.lazystream.examples;
import pppp.lazystream.*;

import x10.util.Ordered;
import pppp.util.Logger;
/**
 * The sequence X=Cons(1,Cons(2,(X+X.y()))).
 */
public class Fib {
    public static def fib():Stream[Long]= ()=>x();
    static val x:Stream[Long] = 1~ (2 ~(fib()+fib().cdr()));
    
    public static def main(args: Rail[String]) {
        val N = args.size > 0 ? Int.parseInt(args(0)) : 10n;
        Console.OUT.print("fib " + N + " = " ); 
        var time:Long = System.nanoTime();
        fib().force(N);	
        Console.OUT.println("Time:" 
                + (System.nanoTime()-time)*1.0/(1000*1000*1000)+ " s.");    
    }
}