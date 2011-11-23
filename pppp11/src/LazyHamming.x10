import pppp.lib.lazystream.*;

import x10.util.Ordered;
import pppp.util.Logger;
public class LazyHamming {
	
	/**
	 *  X = 1:omerge(2*X,omerge(3*X,5*X))
	 */
	static def hamming():LazyStream[Int] { 	
		val x = new StreamImp[Int](1);
		x.setTail(LazyStreamImp(()=> (2*x)^(3*x)^(5*x)));
		return x;
	}
	public static def main(Array[String]) {
		Console.OUT.print("hamming 10 = " ); 
		hamming().print(10);	
	}

}