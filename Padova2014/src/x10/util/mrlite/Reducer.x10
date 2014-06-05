package x10.util.mrlite;
import x10.util.Pair;
import x10.util.ArrayList;
/**
 * A reducer takes a K2 key and a sequence of V2 values, and adds resulting
 * (K3, V3) pairs, if any to the supplied ArrayList.
 * 
 * @author vj
 */
public interface Reducer[K2,V2,K3,V3] {
	def reducer(K2,Iterable[V2], ArrayList[Pair[K3,V3]]):void;
}