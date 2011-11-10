public class NQueensDist extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, NQueensDist.class);
    
    public static final x10.rtt.RuntimeType<NQueensDist> $RTT = new x10.rtt.NamedType<NQueensDist>(
    "NQueensDist", /* base class */NQueensDist.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(NQueensDist $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + NQueensDist.class + " calling"); } 
        $_obj.N = $deserializer.readInt();
        $_obj.P = $deserializer.readInt();
        x10.array.DistArray results = (x10.array.DistArray) $deserializer.readRef();
        $_obj.results = results;
        x10.array.Region R = (x10.array.Region) $deserializer.readRef();
        $_obj.R = R;
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        NQueensDist $_obj = new NQueensDist((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        $serializer.write(this.N);
        $serializer.write(this.P);
        if (results instanceof x10.x10rt.X10JavaSerializable) {
        $serializer.write( (x10.x10rt.X10JavaSerializable) this.results);
        } else {
        $serializer.write(this.results);
        }
        if (R instanceof x10.x10rt.X10JavaSerializable) {
        $serializer.write( (x10.x10rt.X10JavaSerializable) this.R);
        } else {
        $serializer.write(this.R);
        }
        
    }
    
    // constructor just for allocation
    public NQueensDist(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
//#line 20 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final public static x10.array.Array<x10.core.Int> EXPECTED_SOLUTIONS = ((x10.array.Array)(x10.core.ArrayFactory.<x10.core.Int> makeArrayFromJavaArray(x10.rtt.Types.INT, new int[] {0, 1, 0, 0, 2, 10, 4, 40, 92, 352, 724, 2680, 14200, 73712, 365596, 2279184, 14772512})));
        
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
public int N;
        
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
public int P;
        
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
public x10.array.DistArray<x10.core.Int> results;
        
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
public x10.array.Region R;
        
        
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
// creation method for java code
        public static NQueensDist $make(final int N,
                                        final int P){return new NQueensDist((java.lang.System[]) null).$init(N,P);}
        
        // constructor for non-virtual call
        final public NQueensDist NQueensDist$$init$S(final int N,
                                                     final int P) { {
                                                                           
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"

                                                                           
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"

                                                                           
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
this.N = N;
                                                                           
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
this.P = P;
                                                                           
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.array.Dist t164743 =
                                                                             ((x10.array.Dist)(x10.array.Dist.makeUnique()));
                                                                           
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.array.DistArray<x10.core.Int> t164744 =
                                                                             ((x10.array.DistArray)(x10.array.DistArray.<x10.core.Int>make__1x10$array$DistArray$$T(x10.rtt.Types.INT, ((x10.array.Dist)(t164743)),
                                                                                                                                                                    x10.core.Int.$box(0))));
                                                                           
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
this.results = ((x10.array.DistArray)(t164744));
                                                                           
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164745 =
                                                                             ((N) - (((int)(1))));
                                                                           
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.lang.IntRange t164746 =
                                                                             ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(t164745)))));
                                                                           
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.array.Region t164747 =
                                                                             ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t164746)))));
                                                                           
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
this.R = ((x10.array.Region)(t164747));
                                                                       }
                                                                       return this;
                                                                       }
        
        // constructor
        public NQueensDist $init(final int N,
                                 final int P){return NQueensDist$$init$S(N,P);}
        
        
        
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
public void
                                                                                                                 start(
                                                                                                                 ){
            
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final NQueensDist.Board t164748 =
              ((NQueensDist.Board)(new NQueensDist.Board((java.lang.System[]) null).$init(this)));
            
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
t164748.distSearch();
        }
        
        
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
public int
                                                                                                                 run$O(
                                                                                                                 ){
            {
                
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
x10.lang.Runtime.ensureNotInAtomic();
                
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.lang.FinishState x10$__var61 =
                  x10.lang.Runtime.startFinish();
                
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
try {try {{
                    {
                        
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
this.start();
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__47__) {
                    
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__47__)));
                    
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
throw new x10.lang.RuntimeException();
                }finally {{
                     
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var61)));
                 }}
                }
            
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.array.DistArray<x10.core.Int> t164750 =
              ((x10.array.DistArray)(results));
            
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.core.fun.Fun_0_2<x10.core.Int,x10.core.Int,x10.core.Int> t164751 =
              ((x10.core.fun.Fun_0_2)(new NQueensDist.$Closure$81()));
            
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int result =
              x10.core.Int.$unbox(((x10.array.DistArray<x10.core.Int>)t164750).reduce__0$1x10$array$DistArray$$T$3x10$array$DistArray$$T$3x10$array$DistArray$$T$2__1x10$array$DistArray$$T$G(((x10.core.fun.Fun_0_2)(t164751)),
                                                                                                                                                                                              x10.core.Int.$box(0)));
            
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
return result;
            }
        
        
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
public static class Board extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
                                                                                                               {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, Board.class);
            
            public static final x10.rtt.RuntimeType<Board> $RTT = new x10.rtt.NamedType<Board>(
            "NQueensDist.Board", /* base class */Board.class
            , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body(Board $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + Board.class + " calling"); } 
                x10.array.Array q = (x10.array.Array) $deserializer.readRef();
                $_obj.q = q;
                $_obj.fixed = $deserializer.readInt();
                NQueensDist out$ = (NQueensDist) $deserializer.readRef();
                $_obj.out$ = out$;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                Board $_obj = new Board((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (q instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.q);
                } else {
                $serializer.write(this.q);
                }
                $serializer.write(this.fixed);
                if (out$ instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.out$);
                } else {
                $serializer.write(this.out$);
                }
                
            }
            
            // constructor just for allocation
            public Board(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
public NQueensDist out$;
                
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
public x10.array.Array<x10.core.Int> q;
                
//#line 46 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
/** The number of low-rank positions that are fixed in this board for the purposes of search. */
                public int fixed;
                
                
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
// creation method for java code
                public static NQueensDist.Board $make(final NQueensDist out$){return new NQueensDist.Board((java.lang.System[]) null).$init(out$);}
                
                // constructor for non-virtual call
                final public NQueensDist.Board NQueensDist$Board$$init$S(final NQueensDist out$) { {
                                                                                                          
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"

                                                                                                          
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
this.out$ = out$;
                                                                                                          
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"

                                                                                                          
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
this.__fieldInitializers164310();
                                                                                                          
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final NQueensDist t164752 =
                                                                                                            this.
                                                                                                              out$;
                                                                                                          
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164753 =
                                                                                                            t164752.
                                                                                                              N;
                                                                                                          
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.array.Array<x10.core.Int> t164754 =
                                                                                                            ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(t164753)))));
                                                                                                          
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
this.q = ((x10.array.Array)(t164754));
                                                                                                          
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
this.fixed = 0;
                                                                                                      }
                                                                                                      return this;
                                                                                                      }
                
                // constructor
                public NQueensDist.Board $init(final NQueensDist out$){return NQueensDist$Board$$init$S(out$);}
                
                
                
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
public boolean
                                                                                                                         safe$O(
                                                                                                                         final int j){
                    
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int i164699min164844 =
                      0;
                    
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164845 =
                      fixed;
                    
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int i164699max164846 =
                      ((t164845) - (((int)(1))));
                    
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
int i164841 =
                      i164699min164844;
                    
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
for (;
                                                                                                                                true;
                                                                                                                                ) {
                        
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164842 =
                          i164841;
                        
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final boolean t164843 =
                          ((t164842) <= (((int)(i164699max164846))));
                        
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
if (!(t164843)) {
                            
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
break;
                        }
                        
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int k164838 =
                          i164841;
                        
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.array.Array<x10.core.Int> t164827 =
                          ((x10.array.Array)(q));
                        
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164828 =
                          x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t164827).$apply$G((int)(k164838)));
                        
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
boolean t164829 =
                          ((int) j) ==
                        ((int) t164828);
                        
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
if (!(t164829)) {
                            
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164830 =
                              fixed;
                            
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164831 =
                              ((t164830) - (((int)(k164838))));
                            
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164832 =
                              x10.lang.Math.abs$O((int)(t164831));
                            
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.array.Array<x10.core.Int> t164833 =
                              ((x10.array.Array)(q));
                            
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164834 =
                              x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t164833).$apply$G((int)(k164838)));
                            
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164835 =
                              ((j) - (((int)(t164834))));
                            
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164836 =
                              x10.lang.Math.abs$O((int)(t164835));
                            
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
t164829 = ((int) t164832) ==
                            ((int) t164836);
                        }
                        
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final boolean t164837 =
                          t164829;
                        
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
if (t164837) {
                            
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
return false;
                        }
                        
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164839 =
                          i164841;
                        
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164840 =
                          ((t164839) + (((int)(1))));
                        
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
i164841 = t164840;
                    }
                    
//#line 61 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
return true;
                }
                
                
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
public void
                                                                                                                         search(
                                                                                                                         ){
                    
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final NQueensDist t164772 =
                      this.
                        out$;
                    
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.array.Region p164715 =
                      ((x10.array.Region)(t164772.
                                            R));
                    
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int k164716min164717 =
                      p164715.min$O((int)(0));
                    
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int k164716max164718 =
                      p164715.max$O((int)(0));
                    
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
int k164850 =
                      k164716min164717;
                    
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
for (;
                                                                                                                                true;
                                                                                                                                ) {
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164851 =
                          k164850;
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final boolean t164852 =
                          ((t164851) <= (((int)(k164716max164718))));
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
if (!(t164852)) {
                            
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
break;
                        }
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int k164847 =
                          k164850;
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
this.searchOne((int)(k164847));
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164848 =
                          k164850;
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164849 =
                          ((t164848) + (((int)(1))));
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
k164850 = t164849;
                    }
                }
                
                
//#line 74 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
public void
                                                                                                                         searchOne(
                                                                                                                         final int k){
                    
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final boolean t164792 =
                      this.safe$O((int)(k));
                    
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
if (t164792) {
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164780 =
                          fixed;
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final NQueensDist t164778 =
                          this.
                            out$;
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164779 =
                          t164778.
                            N;
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164781 =
                          ((t164779) - (((int)(1))));
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final boolean t164791 =
                          ((int) t164780) ==
                        ((int) t164781);
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
if (t164791) {
                            
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
try {{
                                
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
x10.lang.Runtime.enterAtomic();
                                {
                                    
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final NQueensDist t164782 =
                                      this.
                                        out$;
                                    
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.array.DistArray<x10.core.Int> x164733 =
                                      ((x10.array.DistArray)(t164782.
                                                               results));
                                    
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int y164734 =
                                      x10.lang.Runtime.home().
                                        id;
                                    
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
;
                                    
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
int ret164737 =
                                       0;
                                    
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164853 =
                                      x10.core.Int.$unbox(((x10.array.DistArray<x10.core.Int>)x164733).$apply$G((int)(y164734)));
                                    
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int r164854 =
                                      ((t164853) + (((int)(1))));
                                    
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
((x10.array.DistArray<x10.core.Int>)x164733).$set__1x10$array$DistArray$$T$G((int)(y164734),
                                                                                                                                                                                                                        x10.core.Int.$box(r164854));
                                    
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
ret164737 = r164854;
                                }
                            }}finally {{
                                  
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
x10.lang.Runtime.exitAtomic();
                              }}
                            } else {
                                
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.array.Array<x10.core.Int> t164787 =
                                  ((x10.array.Array)(q));
                                
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final NQueensDist.Board x164739 =
                                  ((NQueensDist.Board)(this));
                                
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
;
                                
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164784 =
                                  x164739.
                                    fixed;
                                
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164785 =
                                  ((t164784) + (((int)(1))));
                                
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164786 =
                                  x164739.fixed = t164785;
                                
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164788 =
                                  ((t164786) - (((int)(1))));
                                
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
((x10.array.Array<x10.core.Int>)t164787).$set__1x10$array$Array$$T$G((int)(t164788),
                                                                                                                                                                                                            x10.core.Int.$box(k));
                                
//#line 81 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
this.search();
                                
//#line 82 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final NQueensDist.Board x164741 =
                                  ((NQueensDist.Board)(this));
                                
//#line 82 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
;
                                
//#line 82 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164789 =
                                  x164741.
                                    fixed;
                                
//#line 82 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164790 =
                                  ((t164789) - (((int)(1))));
                                
//#line 82 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
x164741.fixed = t164790;
                            }
                        }
                    }
                
                
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
public void
                                                                                                                         distSearch(
                                                                                                                         ){
                    
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final NQueensDist t164793 =
                      this.
                        out$;
                    
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.array.Region t164794 =
                      ((x10.array.Region)(t164793.
                                            R));
                    
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.array.Dist t164795 =
                      ((x10.array.Dist)(x10.array.Dist.makeBlock(((x10.array.Region)(t164794)))));
                    {
                        
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
x10.lang.Runtime.ensureNotInAtomic();
                        
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.array.Dist __lowerer__var__48__ =
                          ((x10.array.Dist)(t164795));
                        
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
for (
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.lang.Iterator<x10.lang.Place> __lowerer__var__49__164882 =
                                                                                                                                      ((x10.lang.Iterable<x10.lang.Place>)__lowerer__var__48__.places()).iterator();
                                                                                                                                    ((x10.lang.Iterator<x10.lang.Place>)__lowerer__var__49__164882).hasNext$O();
                                                                                                                                    ) {
                            
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.lang.Place __lowerer__var__49__ =
                              ((x10.lang.Iterator<x10.lang.Place>)__lowerer__var__49__164882).next$G();
                            
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
x10.lang.Runtime.runAsync(((x10.lang.Place)(__lowerer__var__49__)),
                                                                                                                                                             ((x10.core.fun.VoidFun_0_0)(new NQueensDist.Board.$Closure$80(this,
                                                                                                                                                                                                                           __lowerer__var__48__))));
                        }
                    }
                }
                
                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final public NQueensDist.Board
                                                                                                                         NQueensDist$Board$$NQueensDist$Board$this(
                                                                                                                         ){
                    
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
return NQueensDist.Board.this;
                }
                
                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final public NQueensDist
                                                                                                                         NQueensDist$Board$$NQueensDist$this(
                                                                                                                         ){
                    
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final NQueensDist t164796 =
                      this.
                        out$;
                    
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
return t164796;
                }
                
                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final private void
                                                                                                                         __fieldInitializers164310(
                                                                                                                         ){
                    
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
this.fixed = 0;
                }
                
                final public static void
                  __fieldInitializers164310$P(
                  final NQueensDist.Board Board){
                    Board.__fieldInitializers164310();
                }
                
                public static class $Closure$79 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$79.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$79> $RTT = new x10.rtt.StaticVoidFunType<$Closure$79>(
                    /* base class */$Closure$79.class
                    , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$79 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$79.class + " calling"); } 
                        NQueensDist.Board out$$ = (NQueensDist.Board) $deserializer.readRef();
                        $_obj.out$$ = out$$;
                        $_obj.k = $deserializer.readInt();
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$79 $_obj = new $Closure$79((java.lang.System[]) null);
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
                        $serializer.write(this.k);
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$79(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    
                        
                        public void
                          $apply(
                          ){
                            
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
this.
                                                                                                                                     out$$.searchOne((int)(this.
                                                                                                                                                             k));
                        }
                        
                        public NQueensDist.Board out$$;
                        public int k;
                        
                        // creation method for java code
                        public static NQueensDist.Board.$Closure$79 $make(final NQueensDist.Board out$$,
                                                                          final int k){return new $Closure$79(out$$,k);}
                        public $Closure$79(final NQueensDist.Board out$$,
                                           final int k) { {
                                                                 this.out$$ = out$$;
                                                                 this.k = k;
                                                             }}
                        
                    }
                    
                public static class $Closure$80 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$80.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$80> $RTT = new x10.rtt.StaticVoidFunType<$Closure$80>(
                    /* base class */$Closure$80.class
                    , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$80 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$80.class + " calling"); } 
                        NQueensDist.Board out$$ = (NQueensDist.Board) $deserializer.readRef();
                        $_obj.out$$ = out$$;
                        x10.array.Dist __lowerer__var__48__ = (x10.array.Dist) $deserializer.readRef();
                        $_obj.__lowerer__var__48__ = __lowerer__var__48__;
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$80 $_obj = new $Closure$80((java.lang.System[]) null);
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
                        if (__lowerer__var__48__ instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.__lowerer__var__48__);
                        } else {
                        $serializer.write(this.__lowerer__var__48__);
                        }
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$80(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    
                        
                        public void
                          $apply(
                          ){
                            
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
for (
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.lang.Iterator<x10.array.Point> id164874 =
                                                                                                                                          this.
                                                                                                                                            __lowerer__var__48__.restriction(((x10.lang.Place)(x10.lang.Runtime.home()))).
                                                                                                                                            region.iterator();
                                                                                                                                        ((x10.lang.Iterator<x10.array.Point>)id164874).hasNext$O();
                                                                                                                                        ) {
                                
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.array.Point id148347 =
                                  ((x10.array.Point)(((x10.lang.Iterator<x10.array.Point>)id164874).next$G()));
                                
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int k =
                                  id148347.$apply$O((int)(0));
                                
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
x10.lang.Runtime.runAsync(((x10.lang.Place)(x10.lang.Runtime.home())),
                                                                                                                                                                 ((x10.core.fun.VoidFun_0_0)(new NQueensDist.Board.$Closure$79(this.
                                                                                                                                                                                                                                 out$$,
                                                                                                                                                                                                                               k))));
                            }
                        }
                        
                        public NQueensDist.Board out$$;
                        public x10.array.Dist __lowerer__var__48__;
                        
                        // creation method for java code
                        public static NQueensDist.Board.$Closure$80 $make(final NQueensDist.Board out$$,
                                                                          final x10.array.Dist __lowerer__var__48__){return new $Closure$80(out$$,__lowerer__var__48__);}
                        public $Closure$80(final NQueensDist.Board out$$,
                                           final x10.array.Dist __lowerer__var__48__) { {
                                                                                               this.out$$ = out$$;
                                                                                               this.__lowerer__var__48__ = ((x10.array.Dist)(__lowerer__var__48__));
                                                                                           }}
                        
                    }
                    
                
                }
                
                
                
//#line 99 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
                private static final long serialVersionUID = 1L;
                public static void main(java.lang.String[] args) {
                // start native runtime
                new $Main().start(args);
                }
                
                // called by native runtime inside main x10 thread
                public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
                // call the original app-main method
                NQueensDist.main(args);
                }
                }
                
                // the original app-main method
                public static void main(final x10.array.Array<java.lang.String> args) {
                    
//#line 100 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164797 =
                      ((x10.array.Array<java.lang.String>)args).
                        size;
                    
//#line 100 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final boolean t164799 =
                      ((t164797) > (((int)(0))));
                    
//#line 100 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
int t164800 =
                       0;
                    
//#line 100 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
if (t164799) {
                        
//#line 100 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final java.lang.String t164798 =
                          ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
                        
//#line 100 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
t164800 = java.lang.Integer.parseInt(t164798);
                    } else {
                        
//#line 100 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
t164800 = 8;
                    }
                    
//#line 100 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int n =
                      t164800;
                    
//#line 101 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.io.Printer t164801 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 101 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final java.lang.String t164802 =
                      (("N=") + ((x10.core.Int.$box(n))));
                    
//#line 101 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
t164801.println(((java.lang.String)(t164802)));
                    
//#line 104 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int P =
                      x10.lang.Place.getInitialized$MAX_PLACES();
                    
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final NQueensDist nq =
                      ((NQueensDist)(new NQueensDist((java.lang.System[]) null).$init(((int)(n)),
                                                                                      ((int)(P)))));
                    
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final long t164803 =
                      x10.lang.System.nanoTime$O();
                    
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
long start =
                      (-(t164803));
                    
//#line 107 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int answer =
                      nq.run$O();
                    
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.array.Array<x10.core.Int> t164804 =
                      ((x10.array.Array)(NQueensDist.EXPECTED_SOLUTIONS));
                    
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164805 =
                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t164804).$apply$G((int)(n)));
                    
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final boolean result =
                      ((int) answer) ==
                    ((int) t164805);
                    
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final long t164806 =
                      start;
                    
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final long t164807 =
                      x10.lang.System.nanoTime$O();
                    
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final long t164808 =
                      ((t164806) + (((long)(t164807))));
                    
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
start = t164808;
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final long t164809 =
                      start;
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final long t164810 =
                      ((long)(((int)(1000000))));
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final long t164811 =
                      ((t164809) / (((long)(t164810))));
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
start = t164811;
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final x10.io.Printer t164825 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164812 =
                      nq.
                        N;
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final java.lang.String t164813 =
                      (("NQueensDist ") + ((x10.core.Int.$box(t164812))));
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final java.lang.String t164814 =
                      ((t164813) + ("(P="));
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final java.lang.String t164815 =
                      ((t164814) + ((x10.core.Int.$box(P))));
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final java.lang.String t164816 =
                      ((t164815) + (") has "));
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final java.lang.String t164817 =
                      ((t164816) + ((x10.core.Int.$box(answer))));
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final java.lang.String t164819 =
                      ((t164817) + (" solutions"));
                    
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
java.lang.String t164818 =
                       null;
                    
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
if (result) {
                        
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
t164818 = " (ok).";
                    } else {
                        
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
t164818 = " (wrong).";
                    }
                    
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final java.lang.String t164820 =
                      t164818;
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final java.lang.String t164821 =
                      ((t164819) + (t164820));
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final java.lang.String t164822 =
                      ((t164821) + ("time="));
                    
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final long t164823 =
                      start;
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final java.lang.String t164824 =
                      ((t164822) + ((x10.core.Long.$box(t164823))));
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final java.lang.String t164826 =
                      ((t164824) + ("ms"));
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
t164825.println(((java.lang.String)(t164826)));
                }
                
                
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final public NQueensDist
                                                                                                                         NQueensDist$$NQueensDist$this(
                                                                                                                         ){
                    
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
return NQueensDist.this;
                }
                
                public static x10.array.Array<x10.core.Int>
                  getInitialized$EXPECTED_SOLUTIONS(
                  ){
                    return NQueensDist.EXPECTED_SOLUTIONS;
                }
                
                public static class $Closure$81 extends x10.core.Ref implements x10.core.fun.Fun_0_2, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$81.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$81> $RTT = new x10.rtt.StaticFunType<$Closure$81>(
                    /* base class */$Closure$81.class
                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_2.$RTT, x10.rtt.Types.INT, x10.rtt.Types.INT, x10.rtt.Types.INT), x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$81 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$81.class + " calling"); } 
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$81 $_obj = new $Closure$81((java.lang.System[]) null);
                        $deserializer.record_reference($_obj);
                        return $_deserialize_body($_obj, $deserializer);
                        
                    }
                    
                    public short $_get_serialization_id() {
                    
                         return $_serialization_id;
                        
                    }
                    
                    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$81(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    // dispatcher for method abstract public (a1:Z1, a2:Z2)=>U.operator()(a1:Z1,a2:Z2):U
                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
                    return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1), x10.core.Int.$unbox(a2)));
                    }
                    
                        
                        public int
                          $apply$O(
                          final int x,
                          final int y){
                            
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
final int t164749 =
                              ((x) + (((int)(y))));
                            
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensDist.x10"
return t164749;
                        }
                        
                        // creation method for java code
                        public static NQueensDist.$Closure$81 $make(){return new $Closure$81();}
                        public $Closure$81() { {
                                                      
                                                  }}
                        
                    }
                    
                
            }
            