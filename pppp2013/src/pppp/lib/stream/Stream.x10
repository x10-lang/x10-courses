package pppp.lib.stream;


/** A stream of values of type T. 
 */
public interface Stream[T] {

	/**
	 * Return next element from the stream, waiting until it has one.
	 * Throw StreamClosedException if the stream is closed.
	 */
	operator this():T;
}