package x10.util.mrlite;
import x10.util.Pair;

/**
 * Each Job supplies a (distributed) DataSource used by the MRLite engine.
 * The engine will invoke the source() method in each place to obtain the data
 * at that place. 
 * The returned value may be null.
 * @author vj
 */
public interface DataSource[K1,V1]{
	def source():Iterable[Pair[K1,V1]];
}