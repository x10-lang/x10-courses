package pppp.lib.stream.examples;

import pppp.lib.stream.*;
import pppp.util.Logger;
import pppp.util.Utils;
public class Hamming {
	/**
	 * Output the ordered merge of the input streams. The input streams
	 * are assumed to have non-decreasing values. The output stream will
	 * be guanrateed to have non-decreasing values. 
	 */
	static def omerge(n_:Int, a:Stream[Int], b:Stream[Int]):Stream[Int] {
		val s = new BoundedStreamImp[Int]("omerge(" + a + "," + b+")");
		async {
			Logger.log("Starting " + s);
			var av:Int=a(), bv:Int=b();
			try {
				var n:Int=n_;
				while (n-- >0) {
					val item = Utils.min(av,bv);
					s()=item; // output before consuming
					if (av==item) av=a();
					if (bv==item) bv=b();
				}
			} catch (x:StreamClosedException) {
			} finally {s.close();}
		}
		return s;
	}

	static def kmult(k:Int, a:Stream[Int]):Stream[Int] {
		val s = new BoundedStreamImp[Int]("kmult(" + k + "," + a + ")"); 
		async try {
			Logger.log("Starting " + s);
			while (true) {
				val item = k*a();
				s()=item;
			}
		} catch (x: StreamClosedException) {
		} finally { s.close(); }
		return s;
	}
	static def hamming(n:Int):Stream[Int] {
		val hx:Rail[Spring[Int]] = new Rail[Spring[Int]](4, (i:Long)=>new BoundedStreamImp[Int](" hamming(" + i+")"));
		XDucer.copy(new FBy[Int](1n, 
				omerge(n-1n, kmult(2n,hx(0)),
				omerge(n-1n, kmult(3n,hx(1)), 
						    kmult(5n,hx(2))))), hx);
		return hx(3);
	}

	public static def main(args:Rail[String]) {
		if (args.size < 1) {
			Console.ERR.print("Usage: Hamming <N>\n");
			return;
		}
		finish {
			Logger.log(()=> "Starting hamming.");
			XDucer.print(hamming(Int.parseInt(args(0))));
		}
		Console.OUT.println("...done.");
	}
}