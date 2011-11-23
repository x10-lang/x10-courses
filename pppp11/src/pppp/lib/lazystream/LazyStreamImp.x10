package pppp.lib.lazystream;

import x10.util.Ordered;
import pppp.util.Logger;

public struct LazyStreamImp[T](x:()=>LazyStream[T]) implements LazyStream[T] {
	public operator this()=x()();
	public operator (k:T)*this{T <: Arithmetic[T]}:LazyStream[T] = k*(x()); 
	public operator (s:LazyStream[T])^ this{T <: Ordered[T]}:LazyStream[T] =s^x(); 
	public def print(n:Int):void { x().print(n);}
}