package pppp.lib.stream;
import pppp.util.Logger;
public class FilteredStream[T](f:(T)=>Boolean, a:Stream[T]) implements Stream[T] {
	public operator this():T  {
		try {
		var x:T=a();
		Logger.log(this + " reads " + x);
				 
		while (! f(x)) {
			Logger.log(this + " discards " + x);
			x=a();
		}
		Logger.log(this + " returns " + x);
		return x;
		} catch (z: StreamClosedException) {
			Logger.log(this + " input stream closed. Throwing exception");
				throw z;	
		}
	}
	public def toString()="<" + a + " filteredBy " + f +">";
}