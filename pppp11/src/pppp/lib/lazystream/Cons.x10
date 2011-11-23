package pppp.lib.lazystream;

public struct Cons[S,T] implements List[S,T]{
	val x:S, y:T;
	public def this(x:S,y:T){
		this.x=x; this.y=y;
	}
	public def x()=x;
	public def y()=y;
	public def toString()=x+"^"+y;
}