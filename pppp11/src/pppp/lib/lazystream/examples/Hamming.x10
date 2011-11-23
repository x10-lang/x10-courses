package pppp.lib.lazystream.examples;
import pppp.lib.lazystream.*;

import x10.util.Ordered;
import pppp.util.Logger;
public class Hamming {
	
	/**
	 *  X = 1:omerge(2*X,omerge(3*X,5*X))
	 */
	public static def h():Stream[Int]=x;
	static val x= new StreamImp[Int](1, ()=> (2*h())^(3*h())^(5*h()));
	
	public static def main(args: Array[String](1)) {
		val N = args.size > 0 ? Int.parseInt(args(0)) : 10;
		Console.OUT.print("hamming " + N + " = " ); 
		h().print(N);	
	}

}