package pppp.lib.lazystream;

import x10.util.Ordered;
import pppp.util.Logger;

/**
 * An implementation of Stream that produces one element at a time.
 */
public class StreamImp[T] implements Stream[T], List[T,Stream[T]] {
	val x:T;
	var y:Stream[T];
	
	public def x()=x;
	public def y()=y;
	
	public def this(x:T){ this(x,null);}
	//public def this(x:T, y:Stream[T]){ this.x=x; this.y=y;}
	public def this(x:T, y:()=>Stream[T]){ this.x=x; this.y=LazyStreamImp(y);}

	public operator this():List[T,Stream[T]]=Cons(x as T,y as Stream[T]);
	
	public operator (k:T)*this{T <: Arithmetic[T]}:StreamImp[T]=
		new StreamImp[T](k*x, ()=> y==null ? y: k*y);
	
	public operator this % (f:(T)=>Boolean){T <: Arithmetic[T]}:Stream[T] = {
		val x =this(); if (x==null) return null;
		val e = x.x(), r=x.y();
		f(e) ? r % f : new StreamImp[T](e, ()=> r%f)
	}
	
	public operator (w:Stream[T])^ this{T <: Ordered[T]}:Stream[T] = {
	    if (w==null) return this;
		val e = w.x(), r=w.y();
		x < e 
		? new StreamImp[T](x, ()=> y==null ? w : w^y)
				: (x == e) 
				? new StreamImp[T](x, ()=> y==null ? r : r^y)
						: //if (x > y) 
							new StreamImp[T](e, ()=> r^this)
	}
	public def print(n:Int):void { print(n, Stream.PRINT_N_PER_LINE);}
	public def print(n:Int, numPerLine:Int):void {
		var me:Stream[T]=this;
		for (i in 1..n) {
			if (me ==null) break;
			if ((i-1)%numPerLine==0) Console.OUT.println();
			Console.OUT.print(" "  +  me.x());
			me=me.y();
		}
		Console.OUT.println(me==null? "." : "...");
	}
}