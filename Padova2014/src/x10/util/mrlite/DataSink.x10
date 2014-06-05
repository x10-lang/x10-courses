package x10.util.mrlite;
import x10.util.Pair;
public interface DataSink[K,V] {
	def sink(Iterable[Pair[K,V]]):void;
}