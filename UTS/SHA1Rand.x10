import x10.compiler.*;

@NativeRep ("c++", "SHA1Rand", "SHA1Rand", null)
@NativeCPPCompilationUnit ("sha1.c")
@NativeCPPCompilationUnit ("SHA1Rand.cc")
public struct SHA1Rand {
    public def this(seed:Int) { }
    public def toString():String = "<" + hashCode()+">";
    public def this(parent:SHA1Rand) { }
    public def this(parent:SHA1Rand, spawnNumber:Int) { }
    @Native ("c++", "(#0)->__apply()")
    public operator this():Int = 0;
}

// vim: ts=2:sw=2:et
