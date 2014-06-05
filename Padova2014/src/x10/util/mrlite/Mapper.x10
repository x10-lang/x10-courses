package x10.util.mrlite;
import x10.util.Pair;

public interface Mapper[K1,V1,K2,V2] {
	public def mapper(K1, V1, MapperSink[K2,V2]):void;
}