
public class KMeans extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, KMeans.class);
    
    public static final x10.rtt.RuntimeType<KMeans> $RTT = new x10.rtt.NamedType<KMeans>(
    "KMeans", /* base class */KMeans.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(KMeans $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + KMeans.class + " calling"); } 
        $_obj.myDim = $deserializer.readInt();
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        KMeans $_obj = new KMeans((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        $serializer.write(this.myDim);
        
    }
    
    // constructor just for allocation
    public KMeans(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
public int myDim;
        
        
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final public static int DIM = 2;
        
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final public static int K = 4;
        
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final public static int POINTS = 2000;
        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final public static int ITERATIONS = 50;
        
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final public static float EPS = 0.01F;
        
        
        
        
        
        
        
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
public static class V extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                                                                                                          {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, V.class);
            
            public static final x10.rtt.RuntimeType<V> $RTT = new x10.rtt.NamedType<V>(
            "KMeans.V", /* base class */V.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body(V $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + V.class + " calling"); } 
                x10.array.Array vec = (x10.array.Array) $deserializer.readRef();
                $_obj.vec = vec;
                $_obj.count = $deserializer.readInt();
                $_obj.dim = $deserializer.readInt();
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                V $_obj = new V((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (vec instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.vec);
                } else {
                $serializer.write(this.vec);
                }
                $serializer.write(this.count);
                $serializer.write(this.dim);
                
            }
            
            // constructor just for allocation
            public V(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1){}:U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
            }
            
                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
public int dim;
                
                
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
public x10.array.Array<x10.core.Float> vec;
                
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
public int count;
                
                
//#line 46 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
// creation method for java code
                public static KMeans.V $make(final int dim,
                                             final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> init,java.lang.Class<?> $dummy0){return new KMeans.V((java.lang.System[]) null).$init(dim,init,(java.lang.Class<?>) null);}
                
                // constructor for non-virtual call
                final public KMeans.V KMeans$V$$init$S(final int dim,
                                                       final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> init,java.lang.Class<?> $dummy0) { {
                                                                                                                                                         
//#line 46 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"

                                                                                                                                                         
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
this.dim = dim;
                                                                                                                                                         
                                                                                                                                                         
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
this.__fieldInitializers192086();
                                                                                                                                                         
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192488 =
                                                                                                                                                           this.
                                                                                                                                                             dim;
                                                                                                                                                         
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<x10.core.Float> t192489 =
                                                                                                                                                           ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((int)(t192488)),
                                                                                                                                                                                                                                                                        ((x10.core.fun.Fun_0_1)(init)),(java.lang.Class<?>[][][][]) null)));
                                                                                                                                                         
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
this.vec = ((x10.array.Array)(t192489));
                                                                                                                                                         
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
this.count = 0;
                                                                                                                                                     }
                                                                                                                                                     return this;
                                                                                                                                                     }
                
                // constructor
                public KMeans.V $init(final int dim,
                                      final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> init,java.lang.Class<?> $dummy0){return KMeans$V$$init$S(dim,init, $dummy0);}
                
                
                
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
public float
                                                                                                                    $apply$O(
                                                                                                                    final int i){
                    
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<x10.core.Float> t192490 =
                      ((x10.array.Array)(vec));
                    
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192491 =
                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)t192490).$apply$G((int)(i)));
                    
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
return t192491;
                }
                
                
//#line 52 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
public void
                                                                                                                    makeZero(
                                                                                                                    ){
                    
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192264min192655 =
                      0;
                    
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192656 =
                      dim;
                    
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192264max192657 =
                      ((t192656) - (((int)(1))));
                    
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
int i192652 =
                      i192264min192655;
                    
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                        
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192653 =
                          i192652;
                        
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192654 =
                          ((t192653) <= (((int)(i192264max192657))));
                        
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (!(t192654)) {
                            
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
break;
                        }
                        
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192649 =
                          i192652;
                        
//#line 54 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<x10.core.Float> t192648 =
                          ((x10.array.Array)(vec));
                        
//#line 54 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
((x10.array.Array<x10.core.Float>)t192648).$set__1x10$array$Array$$T$G((int)(i192649),
                                                                                                                                                                                                 x10.core.Float.$box(0.0F));
                        
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192650 =
                          i192652;
                        
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192651 =
                          ((t192650) + (((int)(1))));
                        
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
i192652 = t192651;
                    }
                    
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
this.count = 0;
                }
                
                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
public void
                                                                                                                    addIn__0$1x10$lang$Float$2(
                                                                                                                    final x10.array.Array a){
                    
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192280min192670 =
                      0;
                    
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192671 =
                      dim;
                    
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192280max192672 =
                      ((t192671) - (((int)(1))));
                    
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
int i192667 =
                      i192280min192670;
                    
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                        
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192668 =
                          i192667;
                        
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192669 =
                          ((t192668) <= (((int)(i192280max192672))));
                        
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (!(t192669)) {
                            
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
break;
                        }
                        
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192664 =
                          i192667;
                        
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<x10.core.Float> x192660 =
                          ((x10.array.Array)(vec));
                        
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int y192661 =
                          i192664;
                        
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float z192662 =
                          x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)a).$apply$G((int)(i192664)));
                        
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
float ret192663 =
                           0;
                        
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192658 =
                          x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)x192660).$apply$G((int)(y192661)));
                        
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float r192659 =
                          ((t192658) + (((float)(z192662))));
                        
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
((x10.array.Array<x10.core.Float>)x192660).$set__1x10$array$Array$$T$G((int)(y192661),
                                                                                                                                                                                                 x10.core.Float.$box(r192659));
                        
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
ret192663 = r192659;
                        
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192665 =
                          i192667;
                        
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192666 =
                          ((t192665) + (((int)(1))));
                        
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
i192667 = t192666;
                    }
                    
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final KMeans.V x192477 =
                      ((KMeans.V)(this));
                    
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
;
                    
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192506 =
                      x192477.
                        count;
                    
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192507 =
                      ((t192506) + (((int)(1))));
                    
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
x192477.count = t192507;
                }
                
                
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
public void
                                                                                                                    div(
                                                                                                                    final int f){
                    
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192296min192297 =
                      0;
                    
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192508 =
                      dim;
                    
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192296max192298 =
                      ((t192508) - (((int)(1))));
                    
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
int i192682 =
                      i192296min192297;
                    
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192683 =
                          i192682;
                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192684 =
                          ((t192683) <= (((int)(i192296max192298))));
                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (!(t192684)) {
                            
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
break;
                        }
                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192679 =
                          i192682;
                        
//#line 64 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<x10.core.Float> x192675 =
                          ((x10.array.Array)(vec));
                        
//#line 64 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int y192676 =
                          i192679;
                        
//#line 64 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float z192677 =
                          ((float)(int)(((int)(f))));
                        
//#line 64 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
float ret192678 =
                           0;
                        
//#line 64 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192673 =
                          x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)x192675).$apply$G((int)(y192676)));
                        
//#line 64 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float r192674 =
                          ((t192673) / (((float)(z192677))));
                        
//#line 64 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
((x10.array.Array<x10.core.Float>)x192675).$set__1x10$array$Array$$T$G((int)(y192676),
                                                                                                                                                                                                 x10.core.Float.$box(r192674));
                        
//#line 64 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
ret192678 = r192674;
                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192680 =
                          i192682;
                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192681 =
                          ((t192680) + (((int)(1))));
                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
i192682 = t192681;
                    }
                }
                
                
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
public float
                                                                                                                    dist__0$1x10$lang$Float$2$O(
                                                                                                                    final x10.array.Array a){
                    
//#line 67 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
float dist =
                      0.0F;
                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192312min192698 =
                      0;
                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192699 =
                      dim;
                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192312max192700 =
                      ((t192699) - (((int)(1))));
                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
int i192695 =
                      i192312min192698;
                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192696 =
                          i192695;
                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192697 =
                          ((t192696) <= (((int)(i192312max192700))));
                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (!(t192697)) {
                            
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
break;
                        }
                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192692 =
                          i192695;
                        
//#line 69 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<x10.core.Float> t192685 =
                          ((x10.array.Array)(vec));
                        
//#line 69 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192686 =
                          x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)t192685).$apply$G((int)(i192692)));
                        
//#line 69 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192687 =
                          x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)a).$apply$G((int)(i192692)));
                        
//#line 69 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float tmp192688 =
                          ((t192686) - (((float)(t192687))));
                        
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192689 =
                          dist;
                        
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192690 =
                          ((tmp192688) * (((float)(tmp192688))));
                        
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192691 =
                          ((t192689) + (((float)(t192690))));
                        
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
dist = t192691;
                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192693 =
                          i192695;
                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192694 =
                          ((t192693) + (((int)(1))));
                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
i192695 = t192694;
                    }
                    
//#line 72 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192527 =
                      dist;
                    
//#line 72 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
return t192527;
                }
                
                
//#line 74 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
public float
                                                                                                                    dist$O(
                                                                                                                    final KMeans.V a){
                    
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
float dist =
                      0.0F;
                    
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192328min192714 =
                      0;
                    
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192715 =
                      dim;
                    
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192328max192716 =
                      ((t192715) - (((int)(1))));
                    
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
int i192711 =
                      i192328min192714;
                    
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192712 =
                          i192711;
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192713 =
                          ((t192712) <= (((int)(i192328max192716))));
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (!(t192713)) {
                            
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
break;
                        }
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192708 =
                          i192711;
                        
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<x10.core.Float> t192701 =
                          ((x10.array.Array)(vec));
                        
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192702 =
                          x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)t192701).$apply$G((int)(i192708)));
                        
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192703 =
                          a.$apply$O((int)(i192708));
                        
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float tmp192704 =
                          ((t192702) - (((float)(t192703))));
                        
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192705 =
                          dist;
                        
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192706 =
                          ((tmp192704) * (((float)(tmp192704))));
                        
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192707 =
                          ((t192705) + (((float)(t192706))));
                        
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
dist = t192707;
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192709 =
                          i192711;
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192710 =
                          ((t192709) + (((int)(1))));
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
i192711 = t192710;
                    }
                    
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192540 =
                      dist;
                    
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
return t192540;
                }
                
                
//#line 82 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
public void
                                                                                                                    print(
                                                                                                                    ){
                    
//#line 83 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.io.Printer t192541 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 83 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
t192541.println();
                    
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192344min192730 =
                      0;
                    
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192731 =
                      dim;
                    
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192344max192732 =
                      ((t192731) - (((int)(1))));
                    
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
int i192727 =
                      i192344min192730;
                    
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                        
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192728 =
                          i192727;
                        
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192729 =
                          ((t192728) <= (((int)(i192344max192732))));
                        
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (!(t192729)) {
                            
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
break;
                        }
                        
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192724 =
                          i192727;
                        
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.io.Printer t192717 =
                          ((x10.io.Printer)(x10.io.Console.OUT));
                        
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192718 =
                          ((i192724) > (((int)(0))));
                        
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
java.lang.String t192719 =
                           null;
                        
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (t192718) {
                            
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
t192719 = " ";
                        } else {
                            
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
t192719 = "";
                        }
                        
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final java.lang.String t192720 =
                          t192719;
                        
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<x10.core.Float> t192721 =
                          ((x10.array.Array)(vec));
                        
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192722 =
                          x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)t192721).$apply$G((int)(i192724)));
                        
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final java.lang.String t192723 =
                          ((t192720) + ((x10.core.Float.$box(t192722))));
                        
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
t192717.print(((java.lang.String)(t192723)));
                        
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192725 =
                          i192727;
                        
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192726 =
                          ((t192725) + (((int)(1))));
                        
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
i192727 = t192726;
                    }
                }
                
                
//#line 88 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
public void
                                                                                                                    normalize(
                                                                                                                    ){
                    
//#line 88 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192555 =
                      count;
                    
//#line 88 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
this.div((int)(t192555));
                }
                
                
//#line 89 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
public int
                                                                                                                    count$O(
                                                                                                                    ){
                    
//#line 89 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192556 =
                      count;
                    
//#line 89 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
return t192556;
                }
                
                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final public KMeans.V
                                                                                                                    KMeans$V$$KMeans$V$this(
                                                                                                                    ){
                    
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
return KMeans.V.this;
                }
                
                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final private void
                                                                                                                    __fieldInitializers192086(
                                                                                                                    ){
                    
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
this.vec = null;
                    
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
this.count = 0;
                }
                
                final public static void
                  __fieldInitializers192086$P(
                  final KMeans.V V){
                    V.__fieldInitializers192086();
                }
            
        }
        
        
        
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
// creation method for java code
        public static KMeans $make(final int myDim){return new KMeans((java.lang.System[]) null).$init(myDim);}
        
        // constructor for non-virtual call
        final public KMeans KMeans$$init$S(final int myDim) { {
                                                                     
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"

                                                                     
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
this.myDim = myDim;
                                                                     
                                                                 }
                                                                 return this;
                                                                 }
        
        // constructor
        public KMeans $init(final int myDim){return KMeans$$init$S(myDim);}
        
        
        
        
        
//#line 101 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
public x10.array.Array<KMeans.V>
                                                                                                             computeMeans__1$1x10$array$Array$1x10$lang$Float$2$2(
                                                                                                             final int myK,
                                                                                                             final x10.array.Array points){
            
//#line 103 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,KMeans.V> t192562 =
              ((x10.core.fun.Fun_0_1)(new KMeans.$Closure$145(this,
                                                              myDim,
                                                              points,(java.lang.Class<?>) null)));
            
//#line 102 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
x10.array.Array<KMeans.V> redCluster =
              ((x10.array.Array)(new x10.array.Array<KMeans.V>((java.lang.System[]) null, KMeans.V.$RTT).$init(((int)(myK)),
                                                                                                               ((x10.core.fun.Fun_0_1)(t192562)),(java.lang.Class<?>[][][][]) null)));
            
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,KMeans.V> t192566 =
              ((x10.core.fun.Fun_0_1)(new KMeans.$Closure$147(this,
                                                              myDim)));
            
//#line 104 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
x10.array.Array<KMeans.V> blackCluster =
              ((x10.array.Array)(new x10.array.Array<KMeans.V>((java.lang.System[]) null, KMeans.V.$RTT).$init(((int)(myK)),
                                                                                                               ((x10.core.fun.Fun_0_1)(t192566)),(java.lang.Class<?>[][][][]) null)));
            
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192440min192844 =
              1;
            
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192440max192845 =
              KMeans.ITERATIONS;
            
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
int i192841 =
              i192440min192844;
            
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
for (;
                                                                                                                    true;
                                                                                                                    ) {
                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192842 =
                  i192841;
                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192843 =
                  ((t192842) <= (((int)(i192440max192845))));
                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (!(t192843)) {
                    
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
break;
                }
                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192838 =
                  i192841;
                
//#line 107 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<KMeans.V> tmp192832 =
                  ((x10.array.Array)(redCluster));
                
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<KMeans.V> t192833 =
                  ((x10.array.Array)(blackCluster));
                
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
redCluster = ((x10.array.Array)(t192833));
                
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
blackCluster = ((x10.array.Array)(tmp192832));
                
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192376min192811 =
                  0;
                
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192812 =
                  KMeans.POINTS;
                
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192376max192813 =
                  1999;
                
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
int i192761 =
                  i192376min192811;
                
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
for (;
                                                                                                                        true;
                                                                                                                        ) {
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192762 =
                      i192761;
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192763 =
                      ((t192762) <= (((int)(i192376max192813))));
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (!(t192763)) {
                        
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
break;
                    }
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int p192758 =
                      i192761;
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
int closest192752 =
                      -1;
                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
float closestDist192753 =
                      java.lang.Float.MAX_VALUE;
                    
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<x10.core.Float> point192754 =
                      ((x10.array.Array)(((x10.array.Array<x10.array.Array<x10.core.Float>>)points).$apply$G((int)(p192758))));
                    
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192360min192750 =
                      0;
                    
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192360max192751 =
                      ((myK) - (((int)(1))));
                    
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
int i192747 =
                      i192360min192750;
                    
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
for (;
                                                                                                                            true;
                                                                                                                            ) {
                        
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192748 =
                          i192747;
                        
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192749 =
                          ((t192748) <= (((int)(i192360max192751))));
                        
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (!(t192749)) {
                            
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
break;
                        }
                        
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int k192744 =
                          i192747;
                        
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<KMeans.V> t192739 =
                          ((x10.array.Array)(blackCluster));
                        
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final KMeans.V t192740 =
                          ((KMeans.V)(((x10.array.Array<KMeans.V>)t192739).$apply$G((int)(k192744))));
                        
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float dist192741 =
                          t192740.dist__0$1x10$lang$Float$2$O(((x10.array.Array)(point192754)));
                        
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192742 =
                          closestDist192753;
                        
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192743 =
                          ((dist192741) < (((float)(t192742))));
                        
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (t192743) {
                            
//#line 117 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
closestDist192753 = dist192741;
                            
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
closest192752 = k192744;
                        }
                        
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192745 =
                          i192747;
                        
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192746 =
                          ((t192745) + (((int)(1))));
                        
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
i192747 = t192746;
                    }
                    
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<KMeans.V> t192755 =
                      ((x10.array.Array)(redCluster));
                    
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192756 =
                      closest192752;
                    
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final KMeans.V t192757 =
                      ((KMeans.V)(((x10.array.Array<KMeans.V>)t192755).$apply$G((int)(t192756))));
                    
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
t192757.addIn__0$1x10$lang$Float$2(((x10.array.Array)(point192754)));
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192759 =
                      i192761;
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192760 =
                      ((t192759) + (((int)(1))));
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
i192761 = t192760;
                }
                
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192392min192826 =
                  0;
                
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192392max192827 =
                  ((myK) - (((int)(1))));
                
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
int i192769 =
                  i192392min192826;
                
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
for (;
                                                                                                                        true;
                                                                                                                        ) {
                    
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192770 =
                      i192769;
                    
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192771 =
                      ((t192770) <= (((int)(i192392max192827))));
                    
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (!(t192771)) {
                        
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
break;
                    }
                    
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int k192766 =
                      i192769;
                    
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<KMeans.V> t192764 =
                      ((x10.array.Array)(redCluster));
                    
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final KMeans.V t192765 =
                      ((KMeans.V)(((x10.array.Array<KMeans.V>)t192764).$apply$G((int)(k192766))));
                    
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
t192765.normalize();
                    
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192767 =
                      i192769;
                    
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192768 =
                      ((t192767) + (((int)(1))));
                    
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
i192769 = t192768;
                }
                
//#line 126 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
boolean b192836 =
                  true;
                
//#line 127 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192408min192828 =
                  0;
                
//#line 127 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192408max192829 =
                  ((myK) - (((int)(1))));
                
//#line 127 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
int i192788 =
                  i192408min192828;
                
//#line 127 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
for (;
                                                                                                                        true;
                                                                                                                        ) {
                    
//#line 127 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192789 =
                      i192788;
                    
//#line 127 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192790 =
                      ((t192789) <= (((int)(i192408max192829))));
                    
//#line 127 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (!(t192790)) {
                        
//#line 127 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
break;
                    }
                    
//#line 127 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int k192781 =
                      i192788;
                    
//#line 128 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<KMeans.V> t192772 =
                      ((x10.array.Array)(redCluster));
                    
//#line 128 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final KMeans.V t192773 =
                      ((KMeans.V)(((x10.array.Array<KMeans.V>)t192772).$apply$G((int)(k192781))));
                    
//#line 128 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<KMeans.V> t192774 =
                      ((x10.array.Array)(blackCluster));
                    
//#line 128 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final KMeans.V t192775 =
                      ((KMeans.V)(((x10.array.Array<KMeans.V>)t192774).$apply$G((int)(k192781))));
                    
//#line 128 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192776 =
                      t192773.dist$O(((KMeans.V)(t192775)));
                    
//#line 128 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192777 =
                      KMeans.EPS;
                    
//#line 128 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192778 =
                      ((t192776) > (((float)(t192777))));
                    
//#line 128 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (t192778) {
                        
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
b192836 = false;
                        
//#line 130 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
break;
                    }
                    
//#line 127 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192785 =
                      i192788;
                    
//#line 127 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192787 =
                      ((t192785) + (((int)(1))));
                    
//#line 127 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
i192788 = t192787;
                }
                
//#line 133 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192837 =
                  b192836;
                
//#line 133 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (t192837) {
                    
//#line 134 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
break;
                }
                
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192424min192830 =
                  0;
                
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192424max192831 =
                  ((myK) - (((int)(1))));
                
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
int i192807 =
                  i192424min192830;
                
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
for (;
                                                                                                                        true;
                                                                                                                        ) {
                    
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192809 =
                      i192807;
                    
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192810 =
                      ((t192809) <= (((int)(i192424max192831))));
                    
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (!(t192810)) {
                        
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
break;
                    }
                    
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int k192799 =
                      i192807;
                    
//#line 136 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<KMeans.V> t192791 =
                      ((x10.array.Array)(blackCluster));
                    
//#line 136 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final KMeans.V t192793 =
                      ((KMeans.V)(((x10.array.Array<KMeans.V>)t192791).$apply$G((int)(k192799))));
                    
//#line 136 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
t192793.makeZero();
                    
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192802 =
                      i192807;
                    
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192804 =
                      ((t192802) + (((int)(1))));
                    
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
i192807 = t192804;
                }
                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192839 =
                  i192841;
                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192840 =
                  ((t192839) + (((int)(1))));
                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
i192841 = t192840;
            }
            
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<KMeans.V> t192618 =
              ((x10.array.Array)(redCluster));
            
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
return t192618;
        }
        
        
//#line 141 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        KMeans.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> id$148385) {
            
//#line 142 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final long t192619 =
              ((long)(((int)(0))));
            
//#line 142 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.util.Random rnd =
              ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).$init(t192619)));
            
//#line 143 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192636 =
              KMeans.POINTS;
            
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.array.Array<x10.core.Float>> t192637 =
              ((x10.core.fun.Fun_0_1)(new KMeans.$Closure$149(rnd)));
            
//#line 143 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<x10.array.Array<x10.core.Float>> points =
              ((x10.array.Array)(new x10.array.Array<x10.array.Array<x10.core.Float>>((java.lang.System[]) null, new x10.rtt.ParameterizedType(x10.array.Array.$RTT, x10.rtt.Types.FLOAT)).$init(((int)(t192636)),
                                                                                                                                                                                                 ((x10.core.fun.Fun_0_1)(t192637)),(java.lang.Class<?>[][][][]) null)));
            
//#line 145 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192638 =
              KMeans.DIM;
            
//#line 145 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final KMeans t192639 =
              ((KMeans)(new KMeans((java.lang.System[]) null).$init(((int)(t192638)))));
            
//#line 145 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192640 =
              KMeans.K;
            
//#line 145 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<KMeans.V> result =
              ((x10.array.Array)(t192639.computeMeans__1$1x10$array$Array$1x10$lang$Float$2$2((int)(t192640),
                                                                                              ((x10.array.Array)(points)))));
            
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192456min192865 =
              0;
            
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192866 =
              KMeans.K;
            
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int i192456max192867 =
              3;
            
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
int i192862 =
              i192456min192865;
            
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
for (;
                                                                                                                    true;
                                                                                                                    ) {
                
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192863 =
                  i192862;
                
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192864 =
                  ((t192863) <= (((int)(i192456max192867))));
                
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (!(t192864)) {
                    
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
break;
                }
                
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int k192859 =
                  i192862;
                
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final KMeans.V t192858 =
                  ((KMeans.V)(((x10.array.Array<KMeans.V>)result).$apply$G((int)(k192859))));
                
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
t192858.print();
                
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192860 =
                  i192862;
                
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192861 =
                  ((t192860) + (((int)(1))));
                
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
i192862 = t192861;
            }
        }
        
        
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final public KMeans
                                                                                                            KMeans$$KMeans$this(
                                                                                                            ){
            
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
return KMeans.this;
        }
        
        public static int
          getInitialized$DIM(
          ){
            return KMeans.DIM;
        }
        
        public static int
          getInitialized$K(
          ){
            return KMeans.K;
        }
        
        public static int
          getInitialized$POINTS(
          ){
            return KMeans.POINTS;
        }
        
        public static int
          getInitialized$ITERATIONS(
          ){
            return KMeans.ITERATIONS;
        }
        
        public static float
          getInitialized$EPS(
          ){
            return KMeans.EPS;
        }
        
        public static class $Closure$144 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$144.class);
            
            public static final x10.rtt.RuntimeType<$Closure$144> $RTT = new x10.rtt.StaticFunType<$Closure$144>(
            /* base class */$Closure$144.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$144 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$144.class + " calling"); } 
                x10.array.Array points = (x10.array.Array) $deserializer.readRef();
                $_obj.points = points;
                $_obj.i = $deserializer.readInt();
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$144 $_obj = new $Closure$144((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (points instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.points);
                } else {
                $serializer.write(this.points);
                }
                $serializer.write(this.i);
                
            }
            
            // constructor just for allocation
            public $Closure$144(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
            }
            
                
                public float
                  $apply$O(
                  final int j){
                    
//#line 103 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<x10.core.Float> t192557 =
                      ((x10.array.Array)(((x10.array.Array<x10.array.Array<x10.core.Float>>)this.
                                                                                              points).$apply$G((int)(this.
                                                                                                                       i))));
                    
//#line 103 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192558 =
                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)t192557).$apply$G((int)(j)));
                    
//#line 103 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
return t192558;
                }
                
                public x10.array.Array<x10.array.Array<x10.core.Float>> points;
                public int i;
                
                // creation method for java code
                public static KMeans.$Closure$144 $make(final x10.array.Array<x10.array.Array<x10.core.Float>> points,
                                                        final int i,java.lang.Class<?> $dummy0){return new $Closure$144(points,i,(java.lang.Class<?>) null);}
                public $Closure$144(final x10.array.Array<x10.array.Array<x10.core.Float>> points,
                                    final int i,java.lang.Class<?> $dummy0) { {
                                                                                     this.points = ((x10.array.Array)(points));
                                                                                     this.i = i;
                                                                                 }}
                
            }
            
        public static class $Closure$145 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$145.class);
            
            public static final x10.rtt.RuntimeType<$Closure$145> $RTT = new x10.rtt.StaticFunType<$Closure$145>(
            /* base class */$Closure$145.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, KMeans.V.$RTT), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$145 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$145.class + " calling"); } 
                KMeans out$$ = (KMeans) $deserializer.readRef();
                $_obj.out$$ = out$$;
                $_obj.myDim = $deserializer.readInt();
                x10.array.Array points = (x10.array.Array) $deserializer.readRef();
                $_obj.points = points;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$145 $_obj = new $Closure$145((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (out$$ instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.out$$);
                } else {
                $serializer.write(this.out$$);
                }
                $serializer.write(this.myDim);
                if (points instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.points);
                } else {
                $serializer.write(this.points);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$145(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Int.$unbox(a1));
            }
            
                
                public KMeans.V
                  $apply(
                  final int i){
                    
//#line 103 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192559 =
                      this.
                        myDim;
                    
//#line 103 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t192560 =
                      ((x10.core.fun.Fun_0_1)(new KMeans.$Closure$144(((x10.array.Array)(this.
                                                                                           points)),
                                                                      i,(java.lang.Class<?>) null)));
                    
//#line 103 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final KMeans.V t192561 =
                      ((KMeans.V)(new KMeans.V((java.lang.System[]) null).$init(((int)(t192559)),
                                                                                ((x10.core.fun.Fun_0_1)(t192560)),(java.lang.Class<?>) null)));
                    
//#line 103 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
return t192561;
                }
                
                public KMeans out$$;
                public int myDim;
                public x10.array.Array<x10.array.Array<x10.core.Float>> points;
                
                // creation method for java code
                public static KMeans.$Closure$145 $make(final KMeans out$$,
                                                        final int myDim,
                                                        final x10.array.Array<x10.array.Array<x10.core.Float>> points,java.lang.Class<?> $dummy0){return new $Closure$145(out$$,myDim,points,(java.lang.Class<?>) null);}
                public $Closure$145(final KMeans out$$,
                                    final int myDim,
                                    final x10.array.Array<x10.array.Array<x10.core.Float>> points,java.lang.Class<?> $dummy0) { {
                                                                                                                                       this.out$$ = out$$;
                                                                                                                                       this.myDim = myDim;
                                                                                                                                       this.points = ((x10.array.Array)(points));
                                                                                                                                   }}
                
            }
            
        public static class $Closure$146 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$146.class);
            
            public static final x10.rtt.RuntimeType<$Closure$146> $RTT = new x10.rtt.StaticFunType<$Closure$146>(
            /* base class */$Closure$146.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$146 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$146.class + " calling"); } 
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$146 $_obj = new $Closure$146((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                
            }
            
            // constructor just for allocation
            public $Closure$146(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
            }
            
                
                public float
                  $apply$O(
                  final int j){
                    
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
return 0.0F;
                }
                
                // creation method for java code
                public static KMeans.$Closure$146 $make(){return new $Closure$146();}
                public $Closure$146() { {
                                               
                                           }}
                
            }
            
        public static class $Closure$147 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$147.class);
            
            public static final x10.rtt.RuntimeType<$Closure$147> $RTT = new x10.rtt.StaticFunType<$Closure$147>(
            /* base class */$Closure$147.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, KMeans.V.$RTT), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$147 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$147.class + " calling"); } 
                KMeans out$$ = (KMeans) $deserializer.readRef();
                $_obj.out$$ = out$$;
                $_obj.myDim = $deserializer.readInt();
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$147 $_obj = new $Closure$147((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (out$$ instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.out$$);
                } else {
                $serializer.write(this.out$$);
                }
                $serializer.write(this.myDim);
                
            }
            
            // constructor just for allocation
            public $Closure$147(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Int.$unbox(a1));
            }
            
                
                public KMeans.V
                  $apply(
                  final int i){
                    
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192563 =
                      this.
                        myDim;
                    
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t192564 =
                      ((x10.core.fun.Fun_0_1)(new KMeans.$Closure$146()));
                    
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final KMeans.V t192565 =
                      ((KMeans.V)(new KMeans.V((java.lang.System[]) null).$init(((int)(t192563)),
                                                                                ((x10.core.fun.Fun_0_1)(t192564)),(java.lang.Class<?>) null)));
                    
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
return t192565;
                }
                
                public KMeans out$$;
                public int myDim;
                
                // creation method for java code
                public static KMeans.$Closure$147 $make(final KMeans out$$,
                                                        final int myDim){return new $Closure$147(out$$,myDim);}
                public $Closure$147(final KMeans out$$,
                                    final int myDim) { {
                                                              this.out$$ = out$$;
                                                              this.myDim = myDim;
                                                          }}
                
            }
            
        public static class $Closure$148 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$148.class);
            
            public static final x10.rtt.RuntimeType<$Closure$148> $RTT = new x10.rtt.StaticFunType<$Closure$148>(
            /* base class */$Closure$148.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$148 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$148.class + " calling"); } 
                x10.util.Random rnd = (x10.util.Random) $deserializer.readRef();
                $_obj.rnd = rnd;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$148 $_obj = new $Closure$148((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (rnd instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.rnd);
                } else {
                $serializer.write(this.rnd);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$148(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
            }
            
                
                public float
                  $apply$O(
                  final int id$148387){
                    
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final float t192620 =
                      this.
                        rnd.nextFloat$O();
                    
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
return t192620;
                }
                
                public x10.util.Random rnd;
                
                // creation method for java code
                public static KMeans.$Closure$148 $make(final x10.util.Random rnd){return new $Closure$148(rnd);}
                public $Closure$148(final x10.util.Random rnd) { {
                                                                        this.rnd = ((x10.util.Random)(rnd));
                                                                    }}
                
            }
            
        public static class $Closure$149 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$149.class);
            
            public static final x10.rtt.RuntimeType<$Closure$149> $RTT = new x10.rtt.StaticFunType<$Closure$149>(
            /* base class */$Closure$149.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, new x10.rtt.ParameterizedType(x10.array.Array.$RTT, x10.rtt.Types.FLOAT)), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$149 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$149.class + " calling"); } 
                x10.util.Random rnd = (x10.util.Random) $deserializer.readRef();
                $_obj.rnd = rnd;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$149 $_obj = new $Closure$149((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (rnd instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.rnd);
                } else {
                $serializer.write(this.rnd);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$149(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Int.$unbox(a1));
            }
            
                
                public x10.array.Array<x10.core.Float>
                  $apply(
                  final int id$148386){
                    
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t192621 =
                      ((x10.core.fun.Fun_0_1)(new KMeans.$Closure$148(((x10.util.Random)(this.
                                                                                           rnd)))));
                    
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<x10.core.Float> t192622 =
                      ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((int)(2)),
                                                                                                                                   ((x10.core.fun.Fun_0_1)(t192621)),(java.lang.Class<?>[][][][]) null)));
                    
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<x10.core.Float> __desugarer__var__11__192485 =
                      ((x10.array.Array)(((x10.array.Array<x10.core.Float>)
                                           t192622)));
                    
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
x10.array.Array<x10.core.Float> ret192486 =
                       null;
                    
//#line 144 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192846 =
                      ((x10.array.Array<x10.core.Float>)__desugarer__var__11__192485).
                        rank;
                    
//#line 144 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
boolean t192847 =
                      ((int) t192846) ==
                    ((int) 1);
                    
//#line 144 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (t192847) {
                        
//#line 144 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final int t192848 =
                          ((x10.array.Array<x10.core.Float>)__desugarer__var__11__192485).
                            size;
                        
//#line 144 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
t192847 = ((int) t192848) ==
                        ((int) 2);
                    }
                    
//#line 144 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
boolean t192849 =
                      t192847;
                    
//#line 144 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (t192849) {
                        
//#line 144 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192850 =
                          ((x10.array.Array<x10.core.Float>)__desugarer__var__11__192485).
                            rect;
                        
//#line 144 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
t192849 = ((boolean) t192850) ==
                        ((boolean) true);
                    }
                    
//#line 144 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
boolean t192851 =
                      t192849;
                    
//#line 144 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (t192851) {
                        
//#line 144 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192852 =
                          ((x10.array.Array<x10.core.Float>)__desugarer__var__11__192485).
                            zeroBased;
                        
//#line 144 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
t192851 = ((boolean) t192852) ==
                        ((boolean) true);
                    }
                    
//#line 144 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
boolean t192853 =
                      t192851;
                    
//#line 144 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (t192853) {
                        
//#line 144 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
t192853 = true;
                    }
                    
//#line 144 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192854 =
                      t192853;
                    
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192855 =
                      !(t192854);
                    
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (t192855) {
                        
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final boolean t192856 =
                          true;
                        
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
if (t192856) {
                            
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.lang.FailedDynamicCheckException t192857 =
                              new x10.lang.FailedDynamicCheckException("x10.array.Array[x10.lang.Float]{self.rank==1, self.size==2, self.rect==true, self.zeroBased==true, KMeans.DIM==2}");
                            
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
throw t192857;
                        }
                    }
                    
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
ret192486 = ((x10.array.Array)(__desugarer__var__11__192485));
                    
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
final x10.array.Array<x10.core.Float> t192635 =
                      ((x10.array.Array)(ret192486));
                    
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeans.x10"
return t192635;
                }
                
                public x10.util.Random rnd;
                
                // creation method for java code
                public static KMeans.$Closure$149 $make(final x10.util.Random rnd){return new $Closure$149(rnd);}
                public $Closure$149(final x10.util.Random rnd) { {
                                                                        this.rnd = ((x10.util.Random)(rnd));
                                                                    }}
                
            }
            
        
        }
        