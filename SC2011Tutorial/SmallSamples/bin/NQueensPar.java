public class NQueensPar extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, NQueensPar.class);
    
    public static final x10.rtt.RuntimeType<NQueensPar> $RTT = new x10.rtt.NamedType<NQueensPar>(
    "NQueensPar", /* base class */NQueensPar.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(NQueensPar $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + NQueensPar.class + " calling"); } 
        $_obj.N = $deserializer.readInt();
        $_obj.P = $deserializer.readInt();
        $_obj.nSolutions = $deserializer.readInt();
        x10.array.Region R = (x10.array.Region) $deserializer.readRef();
        $_obj.R = R;
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        NQueensPar $_obj = new NQueensPar((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        $serializer.write(this.N);
        $serializer.write(this.P);
        $serializer.write(this.nSolutions);
        if (R instanceof x10.x10rt.X10JavaSerializable) {
        $serializer.write( (x10.x10rt.X10JavaSerializable) this.R);
        } else {
        $serializer.write(this.R);
        }
        
    }
    
    // constructor just for allocation
    public NQueensPar(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
//#line 18 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final public static x10.array.Array<x10.core.Int> EXPECTED_SOLUTIONS = ((x10.array.Array)(x10.core.ArrayFactory.<x10.core.Int> makeArrayFromJavaArray(x10.rtt.Types.INT, new int[] {0, 1, 0, 0, 2, 10, 4, 40, 92, 352, 724, 2680, 14200, 73712, 365596, 2279184, 14772512})));
        
//#line 21 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
public int N;
        
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
public int P;
        
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
public int nSolutions;
        
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
public x10.array.Region R;
        
        
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
// creation method for java code
        public static NQueensPar $make(final int N,
                                       final int P){return new NQueensPar((java.lang.System[]) null).$init(N,P);}
        
        // constructor for non-virtual call
        final public NQueensPar NQueensPar$$init$S(final int N,
                                                   final int P) { {
                                                                         
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"

                                                                         
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"

                                                                         
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
this.__fieldInitializers169033();
                                                                         
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
this.N = N;
                                                                         
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
this.P = P;
                                                                         
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169611 =
                                                                           ((N) - (((int)(1))));
                                                                         
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final x10.lang.IntRange t169612 =
                                                                           ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(t169611)))));
                                                                         
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final x10.array.Region t169613 =
                                                                           ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t169612)))));
                                                                         
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
this.R = ((x10.array.Region)(t169613));
                                                                     }
                                                                     return this;
                                                                     }
        
        // constructor
        public NQueensPar $init(final int N,
                                final int P){return NQueensPar$$init$S(N,P);}
        
        
        
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
public void
                                                                                                                start(
                                                                                                                ){
            
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final NQueensPar.Board t169614 =
              ((NQueensPar.Board)(new NQueensPar.Board((java.lang.System[]) null).$init(this)));
            
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
t169614.parSearch();
        }
        
        
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
public static class Board extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
                                                                                                              {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, Board.class);
            
            public static final x10.rtt.RuntimeType<Board> $RTT = new x10.rtt.NamedType<Board>(
            "NQueensPar.Board", /* base class */Board.class
            , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body(Board $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + Board.class + " calling"); } 
                x10.array.Array q = (x10.array.Array) $deserializer.readRef();
                $_obj.q = q;
                $_obj.fixed = $deserializer.readInt();
                NQueensPar out$ = (NQueensPar) $deserializer.readRef();
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
            
                
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
public NQueensPar out$;
                
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
public x10.array.Array<x10.core.Int> q;
                
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
/** The number of low-rank positions that are fixed in this board for the purposes of search. */
                public int fixed;
                
                
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
// creation method for java code
                public static NQueensPar.Board $make(final NQueensPar out$){return new NQueensPar.Board((java.lang.System[]) null).$init(out$);}
                
                // constructor for non-virtual call
                final public NQueensPar.Board NQueensPar$Board$$init$S(final NQueensPar out$) { {
                                                                                                       
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"

                                                                                                       
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
this.out$ = out$;
                                                                                                       
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"

                                                                                                       
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
this.__fieldInitializers169032();
                                                                                                       
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final NQueensPar t169615 =
                                                                                                         this.
                                                                                                           out$;
                                                                                                       
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169616 =
                                                                                                         t169615.
                                                                                                           N;
                                                                                                       
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final x10.array.Array<x10.core.Int> t169617 =
                                                                                                         ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(t169616)))));
                                                                                                       
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
this.q = ((x10.array.Array)(t169617));
                                                                                                       
//#line 42 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
this.fixed = 0;
                                                                                                   }
                                                                                                   return this;
                                                                                                   }
                
                // constructor
                public NQueensPar.Board $init(final NQueensPar out$){return NQueensPar$Board$$init$S(out$);}
                
                
                
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
// creation method for java code
                public static NQueensPar.Board $make(final NQueensPar out$,
                                                     final NQueensPar.Board b){return new NQueensPar.Board((java.lang.System[]) null).$init(out$,b);}
                
                // constructor for non-virtual call
                final public NQueensPar.Board NQueensPar$Board$$init$S(final NQueensPar out$,
                                                                       final NQueensPar.Board b) { {
                                                                                                          
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"

                                                                                                          
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
this.out$ = out$;
                                                                                                          
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"

                                                                                                          
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
this.__fieldInitializers169032();
                                                                                                          
//#line 46 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final NQueensPar t169618 =
                                                                                                            this.
                                                                                                              out$;
                                                                                                          
//#line 46 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169619 =
                                                                                                            t169618.
                                                                                                              N;
                                                                                                          
//#line 46 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final x10.array.Array<x10.core.Int> t169620 =
                                                                                                            ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(t169619)))));
                                                                                                          
//#line 46 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
this.q = ((x10.array.Array)(t169620));
                                                                                                          
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final x10.array.Array<x10.core.Int> t169621 =
                                                                                                            ((x10.array.Array)(b.
                                                                                                                                 q));
                                                                                                          
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final x10.array.Array<x10.core.Int> t169622 =
                                                                                                            ((x10.array.Array)(q));
                                                                                                          
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
x10.array.Array.<x10.core.Int>copy__0$1x10$array$Array$$T$2__1$1x10$array$Array$$T$2(x10.rtt.Types.INT, ((x10.array.Array)(t169621)),
                                                                                                                                                                                                                                                                                                     ((x10.array.Array)(t169622)));
                                                                                                          
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169623 =
                                                                                                            b.
                                                                                                              fixed;
                                                                                                          
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
this.fixed = t169623;
                                                                                                      }
                                                                                                      return this;
                                                                                                      }
                
                // constructor
                public NQueensPar.Board $init(final NQueensPar out$,
                                              final NQueensPar.Board b){return NQueensPar$Board$$init$S(out$,b);}
                
                
                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
public boolean
                                                                                                                        safe$O(
                                                                                                                        final int j){
                    
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int i169539min169757 =
                      0;
                    
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169758 =
                      fixed;
                    
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int i169539max169759 =
                      ((t169758) - (((int)(1))));
                    
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
int i169754 =
                      i169539min169757;
                    
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
for (;
                                                                                                                               true;
                                                                                                                               ) {
                        
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169755 =
                          i169754;
                        
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final boolean t169756 =
                          ((t169755) <= (((int)(i169539max169759))));
                        
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
if (!(t169756)) {
                            
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
break;
                        }
                        
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int k169751 =
                          i169754;
                        
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final x10.array.Array<x10.core.Int> t169740 =
                          ((x10.array.Array)(q));
                        
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169741 =
                          x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t169740).$apply$G((int)(k169751)));
                        
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
boolean t169742 =
                          ((int) j) ==
                        ((int) t169741);
                        
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
if (!(t169742)) {
                            
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169743 =
                              fixed;
                            
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169744 =
                              ((t169743) - (((int)(k169751))));
                            
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169745 =
                              x10.lang.Math.abs$O((int)(t169744));
                            
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final x10.array.Array<x10.core.Int> t169746 =
                              ((x10.array.Array)(q));
                            
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169747 =
                              x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t169746).$apply$G((int)(k169751)));
                            
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169748 =
                              ((j) - (((int)(t169747))));
                            
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169749 =
                              x10.lang.Math.abs$O((int)(t169748));
                            
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
t169742 = ((int) t169745) ==
                            ((int) t169749);
                        }
                        
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final boolean t169750 =
                          t169742;
                        
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
if (t169750) {
                            
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
return false;
                        }
                        
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169752 =
                          i169754;
                        
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169753 =
                          ((t169752) + (((int)(1))));
                        
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
i169754 = t169753;
                    }
                    
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
return true;
                }
                
                
//#line 64 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
public void
                                                                                                                        search(
                                                                                                                        ){
                    
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final NQueensPar t169641 =
                      this.
                        out$;
                    
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final x10.array.Region p169555 =
                      ((x10.array.Region)(t169641.
                                            R));
                    
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int k169556min169557 =
                      p169555.min$O((int)(0));
                    
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int k169556max169558 =
                      p169555.max$O((int)(0));
                    
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
int k169763 =
                      k169556min169557;
                    
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
for (;
                                                                                                                               true;
                                                                                                                               ) {
                        
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169764 =
                          k169763;
                        
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final boolean t169765 =
                          ((t169764) <= (((int)(k169556max169558))));
                        
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
if (!(t169765)) {
                            
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
break;
                        }
                        
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int k169760 =
                          k169763;
                        
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
this.searchOne((int)(k169760));
                        
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169761 =
                          k169763;
                        
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169762 =
                          ((t169761) + (((int)(1))));
                        
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
k169763 = t169762;
                    }
                }
                
                
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
public void
                                                                                                                        searchOne(
                                                                                                                        final int k){
                    
//#line 74 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final boolean t169661 =
                      this.safe$O((int)(k));
                    
//#line 74 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
if (t169661) {
                        
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169649 =
                          fixed;
                        
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final NQueensPar t169647 =
                          this.
                            out$;
                        
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169648 =
                          t169647.
                            N;
                        
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169650 =
                          ((t169648) - (((int)(1))));
                        
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final boolean t169660 =
                          ((int) t169649) ==
                        ((int) t169650);
                        
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
if (t169660) {
                            
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
try {{
                                
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
x10.lang.Runtime.enterAtomic();
                                {
                                    
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final NQueensPar x169605 =
                                      ((NQueensPar)(this.
                                                      out$));
                                    
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
;
                                    
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169651 =
                                      x169605.
                                        nSolutions;
                                    
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169652 =
                                      ((t169651) + (((int)(1))));
                                    
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
x169605.nSolutions = t169652;
                                }
                            }}finally {{
                                  
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
x10.lang.Runtime.exitAtomic();
                              }}
                            } else {
                                
//#line 79 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final x10.array.Array<x10.core.Int> t169656 =
                                  ((x10.array.Array)(q));
                                
//#line 79 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final NQueensPar.Board x169607 =
                                  ((NQueensPar.Board)(this));
                                
//#line 79 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
;
                                
//#line 79 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169653 =
                                  x169607.
                                    fixed;
                                
//#line 79 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169654 =
                                  ((t169653) + (((int)(1))));
                                
//#line 79 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169655 =
                                  x169607.fixed = t169654;
                                
//#line 79 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169657 =
                                  ((t169655) - (((int)(1))));
                                
//#line 79 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
((x10.array.Array<x10.core.Int>)t169656).$set__1x10$array$Array$$T$G((int)(t169657),
                                                                                                                                                                                                           x10.core.Int.$box(k));
                                
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
this.search();
                                
//#line 81 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final NQueensPar.Board x169609 =
                                  ((NQueensPar.Board)(this));
                                
//#line 81 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
;
                                
//#line 81 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169658 =
                                  x169609.
                                    fixed;
                                
//#line 81 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169659 =
                                  ((t169658) - (((int)(1))));
                                
//#line 81 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
x169609.fixed = t169659;
                            }
                        }
                    }
                
                
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
public void
                                                                                                                        parSearch(
                                                                                                                        ){
                    
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final NQueensPar t169662 =
                      this.
                        out$;
                    
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169664 =
                      t169662.
                        N;
                    
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final NQueensPar t169663 =
                      this.
                        out$;
                    
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169665 =
                      t169663.
                        P;
                    
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int count =
                      ((t169664) / (((int)(t169665))));
                    
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final NQueensPar t169666 =
                      this.
                        out$;
                    
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169668 =
                      t169666.
                        N;
                    
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final NQueensPar t169667 =
                      this.
                        out$;
                    
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169669 =
                      t169667.
                        P;
                    
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int extra =
                      ((t169668) % (((int)(t169669))));
                    
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int i169590min169792 =
                      0;
                    
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final NQueensPar t169793 =
                      this.
                        out$;
                    
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169794 =
                      t169793.
                        P;
                    
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int i169590max169795 =
                      ((t169794) - (((int)(1))));
                    
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
int i169789 =
                      i169590min169792;
                    
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
for (;
                                                                                                                               true;
                                                                                                                               ) {
                        
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169790 =
                          i169789;
                        
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final boolean t169791 =
                          ((t169790) <= (((int)(i169590max169795))));
                        
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
if (!(t169791)) {
                            
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
break;
                        }
                        
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int thread169786 =
                          i169789;
                        
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new NQueensPar.Board.$Closure$113(this,
                                                                                                                                                                                                                      thread169786,
                                                                                                                                                                                                                      extra,
                                                                                                                                                                                                                      count))));
                        
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169787 =
                          i169789;
                        
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169788 =
                          ((t169787) + (((int)(1))));
                        
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
i169789 = t169788;
                    }
                }
                
                
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final public NQueensPar.Board
                                                                                                                        NQueensPar$Board$$NQueensPar$Board$this(
                                                                                                                        ){
                    
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
return NQueensPar.Board.this;
                }
                
                
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final public NQueensPar
                                                                                                                        NQueensPar$Board$$NQueensPar$this(
                                                                                                                        ){
                    
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final NQueensPar t169691 =
                      this.
                        out$;
                    
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
return t169691;
                }
                
                
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final private void
                                                                                                                        __fieldInitializers169032(
                                                                                                                        ){
                    
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
this.fixed = 0;
                }
                
                final public static void
                  __fieldInitializers169032$P(
                  final NQueensPar.Board Board){
                    Board.__fieldInitializers169032();
                }
                
                public static class $Closure$113 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$113.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$113> $RTT = new x10.rtt.StaticVoidFunType<$Closure$113>(
                    /* base class */$Closure$113.class
                    , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$113 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$113.class + " calling"); } 
                        NQueensPar.Board out$$ = (NQueensPar.Board) $deserializer.readRef();
                        $_obj.out$$ = out$$;
                        $_obj.thread169786 = $deserializer.readInt();
                        $_obj.extra = $deserializer.readInt();
                        $_obj.count = $deserializer.readInt();
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$113 $_obj = new $Closure$113((java.lang.System[]) null);
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
                        $serializer.write(this.thread169786);
                        $serializer.write(this.extra);
                        $serializer.write(this.count);
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$113(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    
                        
                        public void
                          $apply(
                          ){
                            
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final NQueensPar t169774 =
                              this.
                                out$$.
                                out$;
                            
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final NQueensPar.Board board169775 =
                              ((NQueensPar.Board)(new NQueensPar.Board((java.lang.System[]) null).$init(t169774,
                                                                                                        this.
                                                                                                          out$$)));
                            
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final boolean t169776 =
                              ((this.
                                  thread169786) <= (((int)(this.
                                                             extra))));
                            
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
int t169777 =
                               0;
                            
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
if (t169776) {
                                
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169778 =
                                  ((this.
                                      count) + (((int)(1))));
                                
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
t169777 = ((this.
                                                                                                                                                    thread169786) * (((int)(t169778))));
                            } else {
                                
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169779 =
                                  ((this.
                                      thread169786) * (((int)(this.
                                                                count))));
                                
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
t169777 = ((t169779) + (((int)(this.
                                                                                                                                                                       extra))));
                            }
                            
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int start169780 =
                              t169777;
                            
//#line 96 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final boolean t169781 =
                              ((this.
                                  thread169786) < (((int)(this.
                                                            extra))));
                            
//#line 96 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
int t169782 =
                               0;
                            
//#line 96 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
if (t169781) {
                                
//#line 96 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
t169782 = ((this.
                                                                                                                                                    count) + (((int)(1))));
                            } else {
                                
//#line 96 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
t169782 = this.
                                                                                                                                                  count;
                            }
                            
//#line 96 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169783 =
                              t169782;
                            
//#line 96 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169784 =
                              ((start169780) + (((int)(t169783))));
                            
//#line 96 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int end169785 =
                              ((t169784) - (((int)(1))));
                            
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int i169574min169772 =
                              start169780;
                            
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int i169574max169773 =
                              end169785;
                            
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
int i169769 =
                              i169574min169772;
                            
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
for (;
                                                                                                                                       true;
                                                                                                                                       ) {
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169770 =
                                  i169769;
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final boolean t169771 =
                                  ((t169770) <= (((int)(i169574max169773))));
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
if (!(t169771)) {
                                    
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
break;
                                }
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int k169766 =
                                  i169769;
                                
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
board169775.searchOne((int)(k169766));
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169767 =
                                  i169769;
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169768 =
                                  ((t169767) + (((int)(1))));
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
i169769 = t169768;
                            }
                        }
                        
                        public NQueensPar.Board out$$;
                        public int thread169786;
                        public int extra;
                        public int count;
                        
                        // creation method for java code
                        public static NQueensPar.Board.$Closure$113 $make(final NQueensPar.Board out$$,
                                                                          final int thread169786,
                                                                          final int extra,
                                                                          final int count){return new $Closure$113(out$$,thread169786,extra,count);}
                        public $Closure$113(final NQueensPar.Board out$$,
                                            final int thread169786,
                                            final int extra,
                                            final int count) { {
                                                                      this.out$$ = out$$;
                                                                      this.thread169786 = thread169786;
                                                                      this.extra = extra;
                                                                      this.count = count;
                                                                  }}
                        
                    }
                    
                
                }
                
            
            
//#line 104 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
            private static final long serialVersionUID = 1L;
            public static void main(java.lang.String[] args) {
            // start native runtime
            new $Main().start(args);
            }
            
            // called by native runtime inside main x10 thread
            public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
            // call the original app-main method
            NQueensPar.main(args);
            }
            }
            
            // the original app-main method
            public static void main(final x10.array.Array<java.lang.String> args) {
                
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169692 =
                  ((x10.array.Array<java.lang.String>)args).
                    size;
                
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final boolean t169694 =
                  ((t169692) > (((int)(0))));
                
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
int t169695 =
                   0;
                
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
if (t169694) {
                    
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final java.lang.String t169693 =
                      ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
                    
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
t169695 = java.lang.Integer.parseInt(t169693);
                } else {
                    
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
t169695 = 8;
                }
                
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int n =
                  t169695;
                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final x10.io.Printer t169696 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final java.lang.String t169697 =
                  (("N=") + ((x10.core.Int.$box(n))));
                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
t169696.println(((java.lang.String)(t169697)));
                
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final x10.array.Array<x10.core.Int> ps =
                  ((x10.array.Array)(x10.core.ArrayFactory.<x10.core.Int> makeArrayFromJavaArray(x10.rtt.Types.INT, new int[] {1, 2, 4})));
                
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
int i169837 =
                  0;
                
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
for (;
                                                                                                                            true;
                                                                                                                            ) {
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169838 =
                      i169837;
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169839 =
                      ((x10.array.Array<x10.core.Int>)ps).
                        size;
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final boolean t169840 =
                      ((t169838) < (((int)(t169839))));
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
if (!(t169840)) {
                        
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
break;
                    }
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final x10.io.Printer t169796 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169797 =
                      i169837;
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169798 =
                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)ps).$apply$G((int)(t169797)));
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final java.lang.String t169799 =
                      (("starting ") + ((x10.core.Int.$box(t169798))));
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final java.lang.String t169800 =
                      ((t169799) + (" threads"));
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
t169796.println(((java.lang.String)(t169800)));
                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169801 =
                      i169837;
                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169802 =
                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)ps).$apply$G((int)(t169801)));
                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final NQueensPar nq169803 =
                      ((NQueensPar)(new NQueensPar((java.lang.System[]) null).$init(((int)(n)),
                                                                                    t169802)));
                    
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final long t169804 =
                      x10.lang.System.nanoTime$O();
                    
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
long start169805 =
                      (-(t169804));
                    {
                        
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
x10.lang.Runtime.ensureNotInAtomic();
                        
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final x10.lang.FinishState x10$__var93 =
                          x10.lang.Runtime.startFinish();
                        
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
try {try {{
                            {
                                
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
nq169803.start();
                            }
                        }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__71__) {
                            
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__71__)));
                            
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
throw new x10.lang.RuntimeException();
                        }finally {{
                             
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var93)));
                         }}
                        }
                    
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169806 =
                      nq169803.
                        nSolutions;
                    
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final x10.array.Array<x10.core.Int> t169807 =
                      ((x10.array.Array)(NQueensPar.EXPECTED_SOLUTIONS));
                    
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169808 =
                      nq169803.
                        N;
                    
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169809 =
                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t169807).$apply$G((int)(t169808)));
                    
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final boolean result169810 =
                      ((int) t169806) ==
                    ((int) t169809);
                    
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final long t169811 =
                      start169805;
                    
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final long t169812 =
                      x10.lang.System.nanoTime$O();
                    
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final long t169813 =
                      ((t169811) + (((long)(t169812))));
                    
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
start169805 = t169813;
                    
//#line 117 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final long t169814 =
                      start169805;
                    
//#line 117 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final long t169815 =
                      ((long)(((int)(1000000))));
                    
//#line 117 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final long t169816 =
                      ((t169814) / (((long)(t169815))));
                    
//#line 117 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
start169805 = t169816;
                    
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final x10.io.Printer t169817 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169818 =
                      nq169803.
                        N;
                    
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final java.lang.String t169819 =
                      (("NQueensPar ") + ((x10.core.Int.$box(t169818))));
                    
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final java.lang.String t169820 =
                      ((t169819) + ("(P="));
                    
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169821 =
                      i169837;
                    
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169822 =
                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)ps).$apply$G((int)(t169821)));
                    
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final java.lang.String t169823 =
                      ((t169820) + ((x10.core.Int.$box(t169822))));
                    
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final java.lang.String t169824 =
                      ((t169823) + (") has "));
                    
//#line 119 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169825 =
                      nq169803.
                        nSolutions;
                    
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final java.lang.String t169826 =
                      ((t169824) + ((x10.core.Int.$box(t169825))));
                    
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final java.lang.String t169827 =
                      ((t169826) + (" solutions"));
                    
//#line 120 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
java.lang.String t169828 =
                       null;
                    
//#line 120 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
if (result169810) {
                        
//#line 120 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
t169828 = " (ok).";
                    } else {
                        
//#line 120 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
t169828 = " (wrong).";
                    }
                    
//#line 120 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final java.lang.String t169829 =
                      t169828;
                    
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final java.lang.String t169830 =
                      ((t169827) + (t169829));
                    
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final java.lang.String t169831 =
                      ((t169830) + ("time="));
                    
//#line 120 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final long t169832 =
                      start169805;
                    
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final java.lang.String t169833 =
                      ((t169831) + ((x10.core.Long.$box(t169832))));
                    
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final java.lang.String t169834 =
                      ((t169833) + ("ms"));
                    
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
t169817.println(((java.lang.String)(t169834)));
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169835 =
                      i169837;
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final int t169836 =
                      ((t169835) + (((int)(1))));
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
i169837 = t169836;
                    }
                }
            
            
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final public NQueensPar
                                                                                                                    NQueensPar$$NQueensPar$this(
                                                                                                                    ){
                
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
return NQueensPar.this;
            }
            
            
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
final private void
                                                                                                                    __fieldInitializers169033(
                                                                                                                    ){
                
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/NQueensPar.x10"
this.nSolutions = 0;
            }
            
            final public static void
              __fieldInitializers169033$P(
              final NQueensPar NQueensPar){
                NQueensPar.__fieldInitializers169033();
            }
            
            public static x10.array.Array<x10.core.Int>
              getInitialized$EXPECTED_SOLUTIONS(
              ){
                return NQueensPar.EXPECTED_SOLUTIONS;
            }
            
        }
        