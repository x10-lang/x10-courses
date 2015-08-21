package pppp.lazystream.examples;

import pppp.lazystream.*;

import x10.util.Ordered;
import pppp.util.Logger;

/**
 * The ThueMorse sequence, X=0:zip(inv(even(m)), X.tail())
 */
public class ThueMorse {
    public static def m():Stream[Int]=()=>x();
    static val x=0n~m().even()((i:Int)=>1n-i).zip(m().cdr());
    
	public static def main(args: Rail[String]) {
		val N = args.size > 0 ? Int.parseInt(args(0)) : 10n;
		val time:Long = System.nanoTime();
		Console.OUT.print("Thue Morse " + N + " = " ); 
		m().print(N);
		Console.OUT.println("Time:" 
		        + (System.nanoTime()-time)*1.0/(1000*1000*1000)+ " s."); 
	}
} 