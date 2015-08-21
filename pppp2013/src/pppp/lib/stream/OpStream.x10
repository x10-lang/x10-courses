package pppp.lib.stream;

/**
 * The stream f(a,b) obtained by applying f pointwise on each element of the 
 * stream a and b.
 */
public class OpStream[S,T](f:(S,S)=>T, a:Stream[S],b:Stream[S]) implements Stream[T] {
	public operator this():T =f(a(),b());
	public def toString()="<" + f + "(" + a + "," + b+")>";
}