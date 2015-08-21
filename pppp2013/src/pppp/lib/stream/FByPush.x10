package pppp.lib.stream;


import x10.compiler.NonEscaping;
/**
 * A stream that takes successive elements from a given Rail a and then behaves
 * like the given stream b.
 */
import pppp.util.Logger;
public class FByPush[T](a:Rail[T],b:()=>Stream[T]){T haszero} implements Stream[T]{
	public def this(a:T){T haszero} { this(new Rail[T](1,a));}
	public def this(a:Rail[T]){T haszero} { this(a,null as Stream[T]);}

	public def this(x:IntRange){T==Int}{ 
		this(new Rail[Int](x.max-x.min+1, (i:Long)=>x.min+(i as Int)));
	}
	
	public def this(a:Rail[T], b:Stream[T]){T haszero}{this(a, ()=>b);}
	public def this(x:T,b:()=>Stream[T], s:String){T haszero} { 
		this(new Rail[T](1,x),b,s);}

	val s=new BoundedStreamImp[T]();
	var name:String=null;
	public def this(a:Rail[T],b:()=>Stream[T]){T haszero} { this(a,b,null);}
	public def this(a:Rail[T],b:()=>Stream[T], s:String){T haszero} { 
		property(a,b);
		name=s;
	}
	public def run() {
		async {
			Logger.log("Starting " + this.toString());
			for (av in a) s()=av;
			if (b==null) {
				s.close();
				throw new StreamClosedException(this);
			}
			else {
				try {
					val source= b(); // may throw an exception
					while(true) {
						val item = source();
						Logger.log(item + " FByPush ==> " + this);
						s()=item;
					}
				} catch(z: StreamClosedException) {
					Logger.debug("Input stream for " + this + " is closed.");
				} finally { s.close();}
			}
			
		}
	}
	public operator this():T= {
		val item = s();
		Logger.debug(this + " returns " + item);
		return item;
	}
	@NonEscaping
	public final def toString()= "<" + a + (b==null ? "" : " -> " + (name == null ? b : name)) + ">";
}