package pppp.lib.stream;

/**
 * The stream f(a) obtained by applying f pointwise on each element of the 
 * stream as.
 */
public class OpStream1[S,T](f:(S)=>T, aS:Stream[S]) implements Stream[T] {
	public operator this():T =f(aS());
	public def toString()="<" + f + "(" + aS + ")>";
}