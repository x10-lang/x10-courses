package pppp.lazystream;

import x10.util.Ordered;
import x10.util.Pair;
import pppp.util.Logger;

/**
 * A stream is an immutable, potentially infinite, single-writer,
 * multiple reader stream that is materialized on demand (is lazy). 
 * 
 * <p> Lazy streams can be recursively defined using static variables.
 * @see pppp.lazystream.examples.Hamming
 */
public class Stream[T](s:()=>Cons[T]) implements ()=>Cons[T] {
    
    // This is the only mutable state in Stream. It is used to implement
    // cached evaluation.
    var evaluated:Boolean= false, cache: Cons[T]=null;
    public operator this(): Cons[T]{
        if (! evaluated) {
            cache = s();
            evaluated=true;
        }
        return cache;
    }

    /**
     * The implicit coercion from a <tt>Cons[T]</tt> thunk to a <tt>Stream[T]</tt>.
     */
    public static operator [T](s:()=>Cons[T])=new Stream[T](s);
    
    /**
     * The implicit coercion from a <tt>Stream[T]</tt> thunk <tt>x</tt>to a 
     * <tt>Stream[T]</tt>. Corresponds to an eta-expansion of <tt>x()</tt>.
     * Of use in settings where the evaluation of the underlying stream
     * needs to be delayed.
     */
    public static operator [T](x:()=>Stream[T])=new Stream[T](()=>x()());
   
    /**
     * The stream whose first element is t and the rest is this.
     * 
     * <p>When using <tt>e~s</tt> in the body of a recursive definition, ensure
     * that the evaluation of <tt>s</tt> does not evaluate arguments more deeply
     * than necessary. Often a <tt>new Stream(()=>Cons(e,s))</tt> may be more
     * appropriate. If the expression is to be written into a 
     * </tt>Stream[T]</tt> variable (or returned from a method of this type)
     * you may use the code <tt>()=>Cons(e,s)</tt> thereby triggering an implicit
     * conversion. 
     */
    public operator (t:T) ~ this:Stream[T]= ()=>new Cons(t,this);
    
    /**
     * The fby operator: returns the stream whose first element is the
     * first element of t, followedby the rest of this.
     */
    public operator (x:Stream[T]) -> this:Stream[T]=
        ()=> new Cons(x().h, this().t);
        
    /**
     * Return the stream obtained by applying f to every element.
     */
    public operator this(f:(T)=>T):Stream[T]= 
        () => new Cons(f(this().h), cdr()(f));
        
    /**
     * Multiply each element of this stream with a scalar.
     */
    public operator (x:T) * this{T <: Arithmetic[T]}:Stream[T]=this((y:T)=>x*y);
    public operator (x:T) / this{T <: Arithmetic[T]}:Stream[T]=this((y:T)=>x/y);
    public operator (x:T) + this{T <: Arithmetic[T]}:Stream[T]=this((y:T)=>x+y);
    public operator (x:T) - this{T <: Arithmetic[T]}:Stream[T]=this((y:T)=>x-y);
    
    /**
     * Return the stream obtained by applying 
     * <tt>f</tt> pointwise to coresponding elements 
     * of <tt>this</tt> and <tt>o</tt>.
     */
    public operator this[U,V](o:Stream[U], f:(T, U)=>V):Stream[V]=   
        ():Cons[V]=> { val tc = this(), oc=o();
        new Cons[V](f(tc.h,oc.h), tc.t[U,V](oc.t,f))};

    /*
     * Perform the given arithmetic operation pointwise on both streams.
    */
    public operator(t:Stream[T])*this{T <: Arithmetic[T]}=this(t,(a:T,b:T)=>a*b);
    public operator(t:Stream[T])/this{T <: Arithmetic[T]}=this(t,(a:T,b:T)=>a/b); 
    public operator(t:Stream[T])+this{T <: Arithmetic[T]}=this(t,(a:T,b:T)=>a+b); 
    public operator(t:Stream[T])-this{T <: Arithmetic[T]}=this(t,(a:T,b:T)=>a-b);
   
    def min[T](x:T,y:T){T <: Ordered[T]}:T=x<y?x:y;
    /**
     * Perform an ordered merge of these streams.
     */
   public operator (a:Stream[T])^this{T <: Ordered[T]}:Stream[T]=
       () => { 
               val ac=a(), sc=this(), m = min(ac.h,sc.h);
               new Cons[T](m,(m==ac.h?ac.t:a)^(m==sc.h?sc.t:this))
           };

    /** The result stream contans all elements of this which satisfy
     * the given filter predicate. 
     * */
    public operator this%(f:(T)=> Boolean):Stream[T]=
        ()=> {
            var sc:Cons[T]=this();
            while(! f(sc.h))sc=sc.t();
            new Cons[T](sc.h,sc.t%f)
        };
    
    /* Materialize the first n elements of the stream.
     * 
     */
    public def force(N:int) {
        var me:Stream[T]=this;
        for (1..N) me = me().t;
    }
    /**
     * The tail of the given stream
     */
    public def cdr()   :Stream[T]=()=>this().t;
    public def cddr()  :Stream[T]=()=>this().t().t;
    public def cdddr() :Stream[T]=()=>this().t().t().t;
    public def cddddr():Stream[T]=()=>this().t().t().t().t;
    
    /**
     * The stream containing the 2^i th elements of a, for i>=0.
     */
    public def even():Stream[T]=()=>new Cons(this().h, cddr().even());
        
    /**
     * The stream containing the 2^i+1 th elements of a, for i>=0.
    */
    public def odd()= cdr().even();
    
    /** The stream of alternating elements from a and b.
     * 
     */
    public def zip(a:Stream[T]):Stream[T]=
        ()=> new Cons(this().h, ()=>a.zip(this().t));
        
    /**
     * A stream containing pairs of corresponding elements from the input
     * streams.
     */
        // TODO: This should be an instance method, but Java codegen complains.
    public static def pair[T, U](a:Stream[T], b:Stream[U])=
         a(b, (t:T,u:U):Pair[T,U]=>Pair[T,U](t,u));
     
    public static val PRINT_N_PER_LINE=10n;
    
    /**
     * Print the first n elements of this stream.
     */
    public def print(n:Int):void { print(n, Stream.PRINT_N_PER_LINE);}
    public def print(n:Int, numPerLine:Int):void {
        var me:Stream[T]=this;
        for (i in 1..n) {
            if (me ==null) break;
            if ((i-1)%numPerLine==0) Console.OUT.println();
            Console.OUT.print(" "  +  me().h);
            me=me().t;
        }
        Console.OUT.println(me==null? "." : "...");
    }
    public def toString(){return "<Stream #" + hashCode()+">";}
  
    /**
     * A stream that contains precisely the elements of this rail, in 
     * seqence. Rail elements eagerly converted to a stream.
     */
    public static def append[T](x:Rail[T], f:Stream[T]):Stream[T]=append(x, 0n,f);
    static def append[T](x:Rail[T], i:Int,f:Stream[T]):Stream[T]=
        x(i) ~ (i<x.size? append[T](x, i+1n,f):f);
    
    /**
     * A stream that contains precisely the elements of the given range min..max.
     */
    public static def append(V:IntRange,f:Stream[Int]):Stream[Int]=
        V.min ~ (V.min==V.max ? f : append((V.min+1n)..V.max,f));
    
    /**
     * A stream that is generated from the initial number and the given 
     * transformer.
    */
    public static def gen[T](t:T, f:(T)=>T):Stream[T]= 
        ()=> new Cons[T](t, ()=>gen[T](f(t), f));
        

    /** The stream of 32-bit natural numbers.
     */
    public static def nats(i:Int):Stream[Int]=gen[Int](i, (n:Int)=>n+1n);
    public static val nats:Stream[Int]=nats(0n);
        
    /** The stream of 64-bit natural numbers*/ 
    public static def longNats(i:Long):Stream[Long]=gen[Long](i, (n:Long)=>n+1);
    public static val longNats:Stream[Long]=longNats(0L);
        
}