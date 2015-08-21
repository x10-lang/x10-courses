package pppp.lib.stream;

import x10.compiler.NonEscaping;
/**
 * A stream that takes successive elements from a given Rail a and then behaves
 * like the given stream b.
 */
import pppp.util.Logger;
public class FBy[T](a:Rail[T],b:Stream[T]) implements Stream[T]{
	public def this(a:T)  { this(new Rail[T](1,a));}
	public def this(a:Rail[T]){ this(a,null as Stream[T]);}

	public def this(x:IntRange){T==Int}{ 
		this(new Rail[Int](x.max-x.min+1, (i:Long)=>x.min+(i as Int)));
		}
	
	public def this(a:Rail[T], b:Stream[T]){property(a, b);}
	public def this(x:T,b:Stream[T])  { this(new Rail[T](1,x),b);}

	
	var i:Int=0n;
	public operator this():T= {
		if (i < a.size) { val item = a(i++); Logger.log("FBy " + this + "==>" + item); return item;}
		if (b !=null) { val item = b(); Logger.log("FBy " + this + "==>" + item); return item;}
		Logger.log("FBy " + this + " end of stream.");
		throw new StreamClosedException(this);
	}
	@NonEscaping
	public final def toString()= "<" + a + (b==null ? "" : " -> " + b) + ">";
}