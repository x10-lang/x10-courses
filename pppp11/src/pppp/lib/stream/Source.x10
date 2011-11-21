package pppp.lib.stream;

public interface Source[T] {
	/**
	 * Push an element onto the stream.
	 */
	operator this()=(t:T):void;
	
	/**
	 * Close the stream. Any attempt to put an element on the stream
	 * after it has been closed will reslt in a StreamClosedException.
	 */
	def close():void;
}