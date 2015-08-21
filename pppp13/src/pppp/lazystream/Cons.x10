package pppp.lazystream;

public class Cons[T] {
    public val h:T;
    public val t:Stream[T];
    public def this(h:T,t:Stream[T]) {
        this.h=h; this.t=t;
    }
}