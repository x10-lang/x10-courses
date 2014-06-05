package x10.util.mrlite;

/**
 * The engine creates a MapperSink at each place and supplies it to the
 * mapper invocation. The user is not concerned with the details of the 
 * implementation of MapperSink.
 * 
 * @author vj
 */
public interface MapperSink[K2,V2] {
	def accept(K2,V2):void;
}