package pppp.lib.stream;

/**
 * The stream f(a,b) obtained by applying f pointwise on each element of the 
 * stream a and b.
 */
public class OpStream2[S,T](f:(S,S)=>T, aS:Stream[S],bS:Stream[S]) implements Stream[T] {
	public operator this():T =f(aS(),bS());
	public def toString()="<" + f + "(" + aS + "," + bS+")>";
}