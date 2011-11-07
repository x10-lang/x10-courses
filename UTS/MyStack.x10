import x10.compiler.Inline;
import x10.util.IndexedMemoryChunk;

public final class MyStack[T] {
    private var imc:IndexedMemoryChunk[T];

    private var size:Int;

    public def this(cap:Int) {
        imc = IndexedMemoryChunk.allocateUninitialized[T](cap);
        size = 0;
    }

    @Inline public def push(v:T):void {
        if (size+1 > capacity()) grow(size+1);
        imc(size++) = v;
    }

    @Inline public operator this(idx:Int):T {
        return imc(idx);
    }

    @Inline public def size():Int = size;

    @Inline public def capacity():Int = imc.length();

    @Inline public def pop():T = imc(--size);

    public def pop(n:Int):Rail[T] {
        val tmp = IndexedMemoryChunk.allocateUninitialized[T](n);
        size -= n;
        IndexedMemoryChunk.copy(imc, size, tmp, 0, n);
        return new Array[T](tmp);
    }

    private def grow(var newCapacity:Int):void {
        var oldCapacity:int = capacity();
        if (newCapacity < oldCapacity*2) {
            newCapacity = oldCapacity*2;
        }
        if (newCapacity < 8) {
            newCapacity = 8;
        }
        val tmp = IndexedMemoryChunk.allocateUninitialized[T](newCapacity);
        IndexedMemoryChunk.copy(imc, 0, tmp, 0, size);
        imc.deallocate();
        imc = tmp;
    }
}
