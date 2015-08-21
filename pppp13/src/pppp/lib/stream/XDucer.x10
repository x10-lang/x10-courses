package pppp.lib.stream;

import x10.io.Printer;
import pppp.util.Logger;

/**
 * A transducer has zero or more input streams and zero or more
 * output streams and typically works asynchronously, transforming
 * inputs to outputs.
 * 
 * <p> This class provides several transducers as static methods.
 */
public class XDucer {
	 
	/**
	 * Replicate the contents of source onto each of the sinks.
	 */
	//public static def copy[T,X](source:Stream[T], sink:X){X <: Source[T]} {
	//	copy(source, new Rail[X](1,sink));
	//}
	public static def  copy[T,X](source:Stream[T], sinks:Rail[X]){X <: Source[T]}{
		async {
			Logger.log("Starting copy " + source  + " ==> " + sinks);
			try {
				while (true) {
					val x = source();
					for (o in sinks) o()=x;
				} 
			} catch (z: StreamClosedException) {
			} finally { for (o in sinks) o.close();}
			
		}
	}
	/**
	 * Print out the given stream, k elements to a line, on the given Printer.
	 */
	public static def print[T](ix:Stream[T]):void { print(Console.OUT, ix, 10n);}
	public static def print[T](ix:Stream[T], k:Int):void { print(Console.OUT, ix, k);}
	public static def print[T](p:Printer, ix:Stream[T], k:Int):void {
		async try {
			var n:Int=0n;
			Logger.log(()=> "Starting print of " + p);
			while(true) {
				n++;
				if (n % k == 0n) p.println(ix());	
				else p.print(ix() + " ");
			}
		} catch (z: StreamClosedException) {
			Logger.log("print catches exception. Terminates.");
		}
		p.println();
	}
}