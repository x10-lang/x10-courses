//package pppp.lib.lazystream.examples;
import pppp.lib.lazystream.*;

import x10.util.Ordered;
import pppp.util.Logger;
public class LazyHamming {
	
	/**
	 *  X = 1:omerge(2*X,omerge(3*X,5*X))
	 */
	public static def h():Stream[Int]=x;
	static val x= new StreamImp[Int](1, ()=> (2*h())^(3*h())^(5*h()));
	
	public static def main(args: Array[String](1)) {
		val N = args.size > 0 ? Int.parseInt(args(0)) : 10;
		var time:Long = System.nanoTime();
		Console.OUT.println("h(" + N + ")=");
		h().print(N);	
		Console.OUT.println("Time:" + (System.nanoTime()-time)*1.0/(1000*1000*1000)+ " ns.");    
	}

}