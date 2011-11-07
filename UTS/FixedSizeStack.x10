import x10.util.IndexedMemoryChunk;
import x10.compiler.Inline;

final class FixedSizeStack[T] {
    val data:IndexedMemoryChunk[T];
    private var size:Int;
    def this(n:Int) {
        data = IndexedMemoryChunk.allocateUninitialized[T](n);
        size = 0;
    }
    @Inline def pop():T = data(--size);
    @Inline def push(t:T) { data(size++) = t; }
    @Inline def size() = size;
}
