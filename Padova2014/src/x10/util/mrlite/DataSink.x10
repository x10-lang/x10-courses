package x10.util.mrlite;
import x10.util.Pair;

/**
 * Each Job supplies a DataSink. This consumes the (K3, V3) pairs supplied
 * by the reduce at each place. 
 * 
 * @author vj
 * 
 */
public interface DataSink[K,V] {
	def sink(Iterable[Pair[K,V]]):void;
}