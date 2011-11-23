package pppp.lib.lazystream;

import x10.util.Ordered;
import pppp.util.Logger;

/**
 * A LazyStreamImp hides a computation that will produce a stream. 
 * It performs all the operations of a LazyStream by first computing
 * the underlying stream, and then performing the operation on it.
 */
public struct LazyStreamImp[T](s:()=>Stream[T]) implements Stream[T] {
	//public operator this()=x()();
	public def x()=s().x(); // may throw an NPE, s or s() may be null
	public def y()=s().y(); // may throw an NPE, s or s() may be null
	public operator (k:T)*this{T <: Arithmetic[T]}:Stream[T] = k*s(); 
	
	public operator (t:Stream[T])^ this{T <: Ordered[T]}:Stream[T] =t^s(); 
	
	public operator this % (f:(T)=>Boolean){T <: Arithmetic[T]}:Stream[T]=s()%f;
	
	public def print(n:Int):void { s().print(n);}
	public def print(n:Int, numPerLine:Int):void {s().print(n, Stream.PRINT_N_PER_LINE);}
}