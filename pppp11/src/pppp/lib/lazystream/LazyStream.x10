package pppp.lib.lazystream;

import x10.util.Ordered;
public interface LazyStream[T] {
	operator this():List[T,LazyStream[T]];
	operator (t:T) * this{T <: Arithmetic[T]}:LazyStream[T];
	operator (t:LazyStream[T]) ^ this{T <: Ordered[T]}:LazyStream[T];
	def print(n:Int):void;
}