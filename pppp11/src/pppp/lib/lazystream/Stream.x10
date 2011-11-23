package pppp.lib.lazystream;

import x10.util.Ordered;

/**
 * A Lazy stream is an immutable, potentially infinite stream
 * that is materialized on demand. 
 * Lazy streams can be recursively defined using static variables.
 * @see pppp.lib.lazystream.examples.Hamming
 */
public interface Stream[T] extends /*()=>*/List[T,Stream[T]]{
	public static val PRINT_N_PER_LINE=10;
	
	/**
	 * Materialize one cell of this stream. This means return null 
	 * (the stream is empty), or the first element of this stream, 
	 * and, recursively, a lazy stream.
	 */
	//operator this():List[T,Stream[T]];
	
	/**
	 * Multiply each element of this stream with a scalar.
	 */
	operator (t:T) * this{T <: Arithmetic[T]}:Stream[T];
	
	/**
	 * Perform an ordered merge of these streams.
	 */
	operator (t:Stream[T]) ^ this{T <: Ordered[T]}:Stream[T];
	
	/** Filter out all the elements from this stream that satisfy the 
	 * given predicate
	  * */
	operator this % ((T)=> Boolean){T <: Arithmetic[T]}:Stream[T];
	
	/**
	 * Print the first n elements of this stream.
	 */
	def print(n:Int):void;
	def print(n:Int, numPerLine:Int):void;
}