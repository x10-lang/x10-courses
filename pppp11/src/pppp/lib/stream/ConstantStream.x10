package pppp.lib.stream;

/**
 * An infinite stream of k's.
 */
public class ConstantStream[T] {
	val k:T;
	public def this(k:T){this.k=k;}
	public operator this():T =k;
	public def toString()= "<ConstantStream " + k + ">";
}