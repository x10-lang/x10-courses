package pppp.lib.lazystream;

import x10.util.Ordered;
import pppp.util.Logger;
public class StreamImp[T] implements LazyStream[T], LazyList[T] {
	val x:T;
	var y:LazyStream[T];
	public def x()=x;
	public def y()=y;
	public def this(x:T){ this(x,null);}
	public def this(x:T, y:LazyStream[T]){ this.x=x; this.y=y;}
	public def setTail(y:LazyStream[T]) { this.y=y;}
	public operator this():List[T,LazyStream[T]]=Cons(x as T,y as LazyStream[T]);
	public operator (k:T)*this{T <: Arithmetic[T]}:StreamImp[T]=
		new StreamImp[T](k*x, LazyStreamImp(()=> y==null ? y: k*y));
	
	public operator (s:LazyStream[T])^ this{T <: Ordered[T]}:LazyStream[T] {
		if (s==null) return this;
		val w = s(); if (w==null) return this;
		if (x < w.x())  return new StreamImp[T](x, LazyStreamImp(()=> y==null ? s : s^y));
		if (x == w.x()) return new StreamImp[T](x, LazyStreamImp(()=> y==null ? w.y() : w.y()^y));
		//if (v.x() > w.x()) 
		return new StreamImp[T](w.x(), LazyStreamImp(()=> w.y()^ this));
	}
	public def print(n:Int):void {
		var me:LazyStream[T]=this;
		for (1..n) {
			if (me ==null) break;
			Console.OUT.print(" "  +  me().x());
			me=me().y();
		}
		Console.OUT.println();
	}
}