package pppp.lib.lazystream;

import x10.util.Ordered;
import pppp.util.Logger;

/**
 * A LazyStreamImp hides a computation that will produce a stream. 
 * It performs all the operations of a LazyStream by first computing
 * the underlying stream, and then performing the operation on it.
 */
public class LazyStreamImp[T](s:()=>Stream[T]) implements Stream[T] {
    var evaluated:Boolean= false;
    var cache: Stream[T];
    def get():Stream[T] {
        if (! evaluated) {
            cache = s();
            evaluated=true;
        }
        return cache;
    }
    //public operator this()=x()();
    public def x()=get().x(); // may throw an NPE, s or s() may be null
    public def y()=get().y(); // may throw an NPE, s or s() may be null
    public operator (k:T)*this{T <: Arithmetic[T]}:Stream[T] = k*get(); 
    
    public operator (t:Stream[T])^ this{T <: Ordered[T]}:Stream[T] =t^get(); 
    
    public operator this % (f:(T)=>Boolean){T <: Arithmetic[T]}:Stream[T]=get()%f;
    
    public def print(n:Int):void { get().print(n);}
    public def print(n:Int, numPerLine:Int):void {get().print(n, Stream.PRINT_N_PER_LINE);}
}