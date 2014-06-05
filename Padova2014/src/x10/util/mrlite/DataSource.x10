package x10.util.mrlite;
import x10.util.Pair;
public interface DataSource[K1,V1]{
	def source():Iterable[Pair[K1,V1]];
}