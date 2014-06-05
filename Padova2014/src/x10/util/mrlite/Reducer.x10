package x10.util.mrlite;
import x10.util.Pair;
import x10.util.ArrayList;
public interface Reducer[K2,V2,K3,V3] {
	
	def reducer(K2,Iterable[V2], ArrayList[Pair[K3,V3]]):void;
}