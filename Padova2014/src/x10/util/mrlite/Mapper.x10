package x10.util.mrlite;
import x10.util.Pair;

/**
 * Each Job supplies a mapper. A mapper translates a (K1, V1) pair into
 * zero or more (K2, V2) pairs which are fed to a MapperSink.
 */
public interface Mapper[K1,V1,K2,V2] {
	public def mapper(K1, V1, MapperSink[K2,V2]):void;
}