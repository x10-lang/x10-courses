
public class CUDATopology extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, CUDATopology.class);
    
    public static final x10.rtt.RuntimeType<CUDATopology> $RTT = new x10.rtt.NamedType<CUDATopology>(
    "CUDATopology", /* base class */CUDATopology.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(CUDATopology $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + CUDATopology.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        CUDATopology $_obj = new CUDATopology((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public CUDATopology(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 16 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        CUDATopology.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> id$148363) {
            
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.lang.Sequence<x10.lang.Place> t173711 =
              x10.lang.Place.places();
            
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.lang.Iterator<x10.lang.Place> p173709 =
              ((x10.lang.Iterator<x10.lang.Place>)
                ((x10.lang.Iterable<x10.lang.Place>)t173711).iterator());
            
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
for (;
                                                                                                                      true;
                                                                                                                      ) {
                
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final boolean t173752 =
                  ((x10.lang.Iterator<x10.lang.Place>)p173709).hasNext$O();
                
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
if (!(t173752)) {
                    
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
break;
                }
                
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.lang.Place p173793 =
                  ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p173709).next$G()));
                
//#line 18 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
x10.lang.Runtime.runAt(((x10.lang.Place)(p173793)),
                                                                                                                                            ((x10.core.fun.VoidFun_0_0)(new CUDATopology.$Closure$123(p173793))));
            }
        }
        
        
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final public CUDATopology
                                                                                                               CUDATopology$$CUDATopology$this(
                                                                                                               ){
            
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
return CUDATopology.this;
        }
        
        
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
// creation method for java code
        public static CUDATopology $make(){return new CUDATopology((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public CUDATopology CUDATopology$$init$S() { {
                                                                  
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"

                                                                  
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"

                                                              }
                                                              return this;
                                                              }
        
        // constructor
        public CUDATopology $init(){return CUDATopology$$init$S();}
        
        
        public static class $Closure$123 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$123.class);
            
            public static final x10.rtt.RuntimeType<$Closure$123> $RTT = new x10.rtt.StaticVoidFunType<$Closure$123>(
            /* base class */$Closure$123.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$123 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$123.class + " calling"); } 
                x10.lang.Place p173793 = (x10.lang.Place) $deserializer.readRef();
                $_obj.p173793 = p173793;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$123 $_obj = new $Closure$123((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (p173793 instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.p173793);
                } else {
                $serializer.write(this.p173793);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$123(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.io.Printer t173794 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final java.lang.String t173795 =
                      (("Dumping places at place: ") + (this.
                                                          p173793));
                    
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
t173794.println(((java.lang.String)(t173795)));
                    
//#line 20 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.lang.Sequence<x10.lang.Place> t173790 =
                      x10.lang.Place.places();
                    
//#line 20 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.lang.Iterator<x10.lang.Place> p173791 =
                      ((x10.lang.Iterator<x10.lang.Place>)
                        ((x10.lang.Iterable<x10.lang.Place>)t173790).iterator());
                    
//#line 20 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
for (;
                                                                                                                              true;
                                                                                                                              ) {
                        
//#line 20 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final boolean t173792 =
                          ((x10.lang.Iterator<x10.lang.Place>)p173791).hasNext$O();
                        
//#line 20 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
if (!(t173792)) {
                            
//#line 20 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
break;
                        }
                        
//#line 20 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.lang.Place p173774 =
                          ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p173791).next$G()));
                        
//#line 21 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.io.Printer t173775 =
                          ((x10.io.Printer)(x10.io.Console.OUT));
                        
//#line 21 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final java.lang.String t173776 =
                          (("Place: ") + (p173774));
                        
//#line 21 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
t173775.println(((java.lang.String)(t173776)));
                        
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.io.Printer t173777 =
                          ((x10.io.Printer)(x10.io.Console.OUT));
                        
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.lang.Place t173778 =
                          ((x10.lang.Place)(p173774.parent()));
                        
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final java.lang.String t173779 =
                          (("  Parent: ") + (t173778));
                        
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
t173777.println(((java.lang.String)(t173779)));
                        
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.io.Printer t173780 =
                          ((x10.io.Printer)(x10.io.Console.OUT));
                        
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final int t173781 =
                          p173774.numChildren$O();
                        
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final java.lang.String t173782 =
                          (("  NumChildren: ") + ((x10.core.Int.$box(t173781))));
                        
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
t173780.println(((java.lang.String)(t173782)));
                        
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final boolean t173783 =
                          p173774.isCUDA$O();
                        
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
if (t173783) {
                            
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.io.Printer t173784 =
                              ((x10.io.Printer)(x10.io.Console.OUT));
                            
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
t173784.println(((java.lang.String)("  Is a CUDA place")));
                        }
                        
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final boolean t173785 =
                          p173774.isHost$O();
                        
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
if (t173785) {
                            
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.io.Printer t173786 =
                              ((x10.io.Printer)(x10.io.Console.OUT));
                            
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
t173786.println(((java.lang.String)("  Is a Host place")));
                        }
                        
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final boolean t173787 =
                          p173774.isSPE$O();
                        
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
if (t173787) {
                            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.io.Printer t173788 =
                              ((x10.io.Printer)(x10.io.Console.OUT));
                            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
t173788.println(((java.lang.String)("  Is a SPE place")));
                        }
                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.array.Array<x10.lang.Place> children173789 =
                          ((x10.array.Array)(p173774.children()));
                        
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.lang.Iterable<x10.lang.Place> t173771 =
                          ((x10.lang.Iterable<x10.lang.Place>)
                            ((x10.array.Array<x10.lang.Place>)children173789).values());
                        
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.lang.Iterator<x10.lang.Place> c173772 =
                          ((x10.lang.Iterator<x10.lang.Place>)
                            ((x10.lang.Iterable<x10.lang.Place>)t173771).iterator());
                        
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
for (;
                                                                                                                                  true;
                                                                                                                                  ) {
                            
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final boolean t173773 =
                              ((x10.lang.Iterator<x10.lang.Place>)c173772).hasNext$O();
                            
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
if (!(t173773)) {
                                
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
break;
                            }
                            
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.lang.Place c173753 =
                              ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)c173772).next$G()));
                            
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.io.Printer t173754 =
                              ((x10.io.Printer)(x10.io.Console.OUT));
                            
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final int t173755 =
                              c173753.childIndex$O();
                            
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final java.lang.String t173756 =
                              (("  Child ") + ((x10.core.Int.$box(t173755))));
                            
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final java.lang.String t173757 =
                              ((t173756) + (": "));
                            
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final java.lang.String t173758 =
                              ((t173757) + (c173753));
                            
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
t173754.println(((java.lang.String)(t173758)));
                            
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.io.Printer t173759 =
                              ((x10.io.Printer)(x10.io.Console.OUT));
                            
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.lang.Place t173760 =
                              ((x10.lang.Place)(c173753.parent()));
                            
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final java.lang.String t173761 =
                              (("    Parent: ") + (t173760));
                            
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
t173759.println(((java.lang.String)(t173761)));
                            
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.io.Printer t173762 =
                              ((x10.io.Printer)(x10.io.Console.OUT));
                            
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final int t173763 =
                              c173753.numChildren$O();
                            
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final java.lang.String t173764 =
                              (("    NumChildren: ") + ((x10.core.Int.$box(t173763))));
                            
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
t173762.println(((java.lang.String)(t173764)));
                            
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final boolean t173765 =
                              c173753.isCUDA$O();
                            
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
if (t173765) {
                                
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.io.Printer t173766 =
                                  ((x10.io.Printer)(x10.io.Console.OUT));
                                
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
t173766.println(((java.lang.String)("    Is a CUDA place")));
                            }
                            
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final boolean t173767 =
                              c173753.isHost$O();
                            
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
if (t173767) {
                                
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.io.Printer t173768 =
                                  ((x10.io.Printer)(x10.io.Console.OUT));
                                
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
t173768.println(((java.lang.String)("    Is a Host place")));
                            }
                            
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final boolean t173769 =
                              c173753.isSPE$O();
                            
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
if (t173769) {
                                
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.io.Printer t173770 =
                                  ((x10.io.Printer)(x10.io.Console.OUT));
                                
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
t173770.println(((java.lang.String)("    Is a SPE place")));
                            }
                        }
                    }
                    
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
final x10.io.Printer t173796 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDATopology.x10"
t173796.println();
                }
                
                public x10.lang.Place p173793;
                
                // creation method for java code
                public static CUDATopology.$Closure$123 $make(final x10.lang.Place p173793){return new $Closure$123(p173793);}
                public $Closure$123(final x10.lang.Place p173793) { {
                                                                           this.p173793 = ((x10.lang.Place)(p173793));
                                                                       }}
                
            }
            
        
    }
    