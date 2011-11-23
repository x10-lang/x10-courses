package pppp.lib.lazystream;

/**
 * Some useful functions producing lazy streams.
 */
public class Utils {
	
	/**
	 * A stream that contains precisely the elements of this rail, in 
	 * seqence. 
	 */
	public static def Stream[T](x:Rail[T]):Stream[T]=Stream(x, 0);
	
	static def Stream[T](x:Rail[T], i:Int):Stream[T]
	= i==x.size? null as Stream[T]: new StreamImp[T](x(i), ()=>Stream[T](x, i+1));
	
	/**
	 * A stream that contains precisely the elements of the given range min..max.
	 */
	public static def Stream(V:IntRange):Stream[Int]
	= new StreamImp[Int](V.min, 
			V.min==V.max ? null 
	        : ()=>Stream((V.min+1)..V.max));
	
	/**
	 * A stream that is generated from the initial number and the given 
	 * transformer.
	 */
	public static def Gen[T](t:T, f:(T)=>T):Stream[T]
	   = new StreamImp(t, ()=> Gen(f(t), f));
}