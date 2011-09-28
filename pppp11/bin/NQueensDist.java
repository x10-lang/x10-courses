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
        
    }
    
    // constructor just for allocation
    public NQueensDist(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
//#line 8 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final public static x10.array.Array<x10.core.Int> expectedSolutions = ((x10.array.Array)(x10.core.ArrayFactory.<x10.core.Int> makeArrayFromJavaArray(x10.rtt.Types.INT, new int[] {0, 1, 0, 0, 2, 10, 4, 40, 92, 352, 724, 2680, 14200, 73712, 365596, 2279184, 14772512})));
        
//#line 11 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
public int N;
        
//#line 11 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
public int P;
        
        
//#line 12 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
// creation method for java code
        public static NQueensDist $make(final int N,
                                        final int P){return new NQueensDist((java.lang.System[]) null).$init(N,P);}
        
        // constructor for non-virtual call
        final public NQueensDist NQueensDist$$init$S(final int N,
                                                     final int P) { {
                                                                           {
                                                                               
//#line 12 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"

                                                                           }
                                                                           {
                                                                               {
                                                                                   
//#line 12 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"

                                                                               }
                                                                               {
                                                                                   
                                                                               }
                                                                           }
                                                                           
//#line 13 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
this.N = N;
                                                                           
//#line 14 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
this.P = P;
                                                                       }
                                                                       return this;
                                                                       }
        
        // constructor
        public NQueensDist $init(final int N,
                                 final int P){return NQueensDist$$init$S(N,P);}
        
        
        
//#line 16 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
public void
                                                                       start(
                                                                       ){
            
//#line 16 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final NQueensDist.Board t84314 =
              ((NQueensDist.Board)(new NQueensDist.Board((java.lang.System[]) null).$init(this)));
            
//#line 16 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
t84314.search();
        }
        
        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
public int
                                                                       run$O(
                                                                       ){
            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84315;
            {
                
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.lang.FinishState x10$__var36 =
                  ((x10.lang.FinishState)(x10.lang.Runtime.<x10.core.Int>startCollectingFinish__0$1x10$lang$Runtime$$T$2(x10.rtt.Types.INT, ((x10.lang.Reducible)(NQueensDist.getInitialized$reducer())))));
                
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
try {try {{
                    {
                        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
this.start();
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__30__) {
                    
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__30__)));
                    
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
throw new x10.lang.RuntimeException();
                }finally {{
                     
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
t84315 = x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int>stopCollectingFinish$G(x10.rtt.Types.INT, ((x10.lang.FinishState)(x10$__var36))));
                 }}
                }
            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
return t84315;
            }
        
        
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
public static x10.array.Array<x10.array.Region>
                                                                       block(
                                                                       final x10.array.Region R,
                                                                       final int P){
            
//#line 23 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
assert ((P) >= (((int)(0))));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> t84316 =
              R.min();
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int low =
              x10.core.Int.$unbox(((x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int>)t84316).$apply(x10.core.Int.$box(0),x10.rtt.Types.INT));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> t84317 =
              R.max();
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int high =
              x10.core.Int.$unbox(((x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int>)t84317).$apply(x10.core.Int.$box(0),x10.rtt.Types.INT));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84318 =
              ((high) - (((int)(low))));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int count =
              ((t84318) + (((int)(1))));
            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int baseSize =
              ((count) / (((int)(P))));
            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84319 =
              ((baseSize) * (((int)(P))));
            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int extra =
              ((count) - (((int)(t84319))));
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.array.Region> t84332 =
              ((x10.core.fun.Fun_0_1)(new NQueensDist.$Closure$96(baseSize,
                                                                  low,
                                                                  extra)));
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.Array<x10.array.Region> t84333 =
              ((x10.array.Array)(new x10.array.Array<x10.array.Region>((java.lang.System[]) null, x10.array.Region.$RTT).$init(((int)(P)),
                                                                                                                               ((x10.core.fun.Fun_0_1)(t84332)),(java.lang.Class<?>[][][][]) null)));
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
return t84333;
        }
        
        
//#line 32 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
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
            
                
//#line 7 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
public NQueensDist out$;
                
//#line 33 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
public x10.array.Array<x10.core.Int> q;
                
                
//#line 34 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
// creation method for java code
                public static NQueensDist.Board $make(final NQueensDist out$){return new NQueensDist.Board((java.lang.System[]) null).$init(out$);}
                
                // constructor for non-virtual call
                final public NQueensDist.Board NQueensDist$Board$$init$S(final NQueensDist out$) { {
                                                                                                          {
                                                                                                              
//#line 34 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"

                                                                                                          }
                                                                                                          
//#line 7 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
this.out$ = out$;
                                                                                                          {
                                                                                                              {
                                                                                                                  
//#line 34 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"

                                                                                                              }
                                                                                                              {
                                                                                                                  
                                                                                                              }
                                                                                                          }
                                                                                                          
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> t84334 =
                                                                                                            ((x10.core.fun.Fun_0_1)(new NQueensDist.Board.$Closure$93()));
                                                                                                          
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.Array<x10.core.Int> t84335 =
                                                                                                            ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(0)),
                                                                                                                                                                                                                     ((x10.core.fun.Fun_0_1)(t84334)),(java.lang.Class<?>[][][][]) null)));
                                                                                                          
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
this.q = ((x10.array.Array)(t84335));
                                                                                                      }
                                                                                                      return this;
                                                                                                      }
                
                // constructor
                public NQueensDist.Board $init(final NQueensDist out$){return NQueensDist$Board$$init$S(out$);}
                
                
                
//#line 37 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
// creation method for java code
                public static NQueensDist.Board $make(final NQueensDist out$,
                                                      final x10.array.Array<x10.core.Int> old,
                                                      final int newItem,java.lang.Class<?> $dummy0){return new NQueensDist.Board((java.lang.System[]) null).$init(out$,old,newItem,(java.lang.Class<?>) null);}
                
                // constructor for non-virtual call
                final public NQueensDist.Board NQueensDist$Board$$init$S(final NQueensDist out$,
                                                                         final x10.array.Array<x10.core.Int> old,
                                                                         final int newItem,java.lang.Class<?> $dummy0) { {
                                                                                                                                {
                                                                                                                                    
//#line 37 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"

                                                                                                                                }
                                                                                                                                
//#line 7 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
this.out$ = out$;
                                                                                                                                {
                                                                                                                                    {
                                                                                                                                        
//#line 37 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"

                                                                                                                                    }
                                                                                                                                    {
                                                                                                                                        
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                
//#line 38 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int n =
                                                                                                                                  ((x10.array.Array<x10.core.Int>)old).
                                                                                                                                    size;
                                                                                                                                
//#line 39 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84339 =
                                                                                                                                  ((n) + (((int)(1))));
                                                                                                                                
//#line 39 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> t84340 =
                                                                                                                                  ((x10.core.fun.Fun_0_1)(new NQueensDist.Board.$Closure$94(n,
                                                                                                                                                                                            old,
                                                                                                                                                                                            newItem,(java.lang.Class<?>) null)));
                                                                                                                                
//#line 39 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.Array<x10.core.Int> t84341 =
                                                                                                                                  ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(t84339,
                                                                                                                                                                                                                                           ((x10.core.fun.Fun_0_1)(t84340)),(java.lang.Class<?>[][][][]) null)));
                                                                                                                                
//#line 39 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
this.q = ((x10.array.Array)(t84341));
                                                                                                                            }
                                                                                                                            return this;
                                                                                                                            }
                
                // constructor
                public NQueensDist.Board $init(final NQueensDist out$,
                                               final x10.array.Array<x10.core.Int> old,
                                               final int newItem,java.lang.Class<?> $dummy0){return NQueensDist$Board$$init$S(out$,old,newItem, $dummy0);}
                
                
                
//#line 41 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
public boolean
                                                                               safe$O(
                                                                               final int j){
                    
//#line 42 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.Array<x10.core.Int> t84342 =
                      ((x10.array.Array)(q));
                    
//#line 42 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int n =
                      ((x10.array.Array<x10.core.Int>)t84342).
                        size;
                    {
                        
//#line 43 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84343 =
                          ((n) - (((int)(1))));
                        
//#line 43 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.lang.IntRange t84344 =
                          ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(t84343)))));
                        
//#line 43 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.Region p84286 =
                          ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t84344)))));
                        
//#line 43 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int k84287min84288 =
                          p84286.min$O((int)(0));
                        
//#line 43 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int k84287max84289 =
                          p84286.max$O((int)(0));
                        {
                            
//#line 43 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
int k84287 =
                              k84287min84288;
                            
//#line 43 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
for (;
                                                                                              true;
                                                                                              ) {
                                
//#line 43 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84346 =
                                  k84287;
                                
//#line 43 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final boolean t84359 =
                                  ((t84346) <= (((int)(k84287max84289))));
                                
//#line 43 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
if (!(t84359)) {
                                    
//#line 43 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
break;
                                }
                                {
                                    
//#line 43 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int k =
                                      k84287;
                                    {
                                        
//#line 44 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.Array<x10.core.Int> t84349 =
                                          ((x10.array.Array)(q));
                                        
//#line 44 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84350 =
                                          x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t84349).$apply$G((int)(k)));
                                        
//#line 44 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
boolean t84357 =
                                          ((int) j) ==
                                        ((int) t84350);
                                        
//#line 44 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
if (!(t84357)) {
                                            
//#line 44 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84351 =
                                              ((n) - (((int)(k))));
                                            
//#line 44 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84355 =
                                              x10.lang.Math.abs$O((int)(t84351));
                                            
//#line 44 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.Array<x10.core.Int> t84352 =
                                              ((x10.array.Array)(q));
                                            
//#line 44 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84353 =
                                              x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t84352).$apply$G((int)(k)));
                                            
//#line 44 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84354 =
                                              ((j) - (((int)(t84353))));
                                            
//#line 44 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84356 =
                                              x10.lang.Math.abs$O((int)(t84354));
                                            
//#line 44 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
t84357 = ((int) t84355) ==
                                            ((int) t84356);
                                        }
                                        
//#line 44 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final boolean t84358 =
                                          t84357;
                                        
//#line 44 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
if (t84358) {
                                            
//#line 45 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
return false;
                                        }
                                    }
                                }
                                {
                                    
//#line 43 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84347 =
                                      k84287;
                                    
//#line 43 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84348 =
                                      ((t84347) + (((int)(1))));
                                    
//#line 43 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
k84287 = t84348;
                                }
                            }
                        }
                    }
                    
//#line 47 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
return true;
                }
                
                
//#line 52 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
public void
                                                                               search(
                                                                               final x10.array.Region R){
                    
//#line 53 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.lang.Iterator<x10.array.Point> id84305 =
                      R.iterator();
                    
//#line 53 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
for (;
                                                                                      true;
                                                                                      ) {
                        
//#line 53 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final boolean t84365 =
                          ((x10.lang.Iterator<x10.array.Point>)id84305).hasNext$O();
                        
//#line 53 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
if (!(t84365)) {
                            
//#line 53 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
break;
                        }
                        {
                            
//#line 53 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.Point id68619 =
                              ((x10.array.Point)(((x10.lang.Iterator<x10.array.Point>)id84305).next$G()));
                            
//#line 53 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int k =
                              id68619.$apply$O((int)(0));
                            
//#line 54 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final boolean t84364 =
                              this.safe$O((int)(k));
                            
//#line 54 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
if (t84364) {
                                
//#line 55 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final NQueensDist t84361 =
                                  this.
                                    out$;
                                
//#line 55 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.Array<x10.core.Int> t84362 =
                                  ((x10.array.Array)(q));
                                
//#line 55 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final NQueensDist.Board t84363 =
                                  ((NQueensDist.Board)(new NQueensDist.Board((java.lang.System[]) null).$init(t84361,
                                                                                                              ((x10.array.Array)(t84362)),
                                                                                                              ((int)(k)),(java.lang.Class<?>) null)));
                                
//#line 55 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
t84363.search();
                            }
                        }
                        {
                            
                        }
                    }
                }
                
                
//#line 58 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
public void
                                                                               search(
                                                                               ){
                    
//#line 59 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.Array<x10.core.Int> t84366 =
                      ((x10.array.Array)(q));
                    
//#line 59 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84368 =
                      ((x10.array.Array<x10.core.Int>)t84366).
                        size;
                    
//#line 59 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final NQueensDist t84367 =
                      this.
                        out$;
                    
//#line 59 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84369 =
                      t84367.
                        N;
                    
//#line 59 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final boolean t84370 =
                      ((int) t84368) ==
                    ((int) t84369);
                    
//#line 59 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
if (t84370) {
                        
//#line 60 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
x10.lang.Runtime.<x10.core.Int>makeOffer__0x10$lang$Runtime$$T(x10.rtt.Types.INT, x10.core.Int.$box(1));
                        
//#line 61 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
return;
                    }
                    
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.Array<x10.core.Int> t84371 =
                      ((x10.array.Array)(q));
                    
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84372 =
                      ((x10.array.Array<x10.core.Int>)t84371).
                        size;
                    
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final boolean t84390 =
                      ((int) t84372) ==
                    ((int) 0);
                    
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
if (t84390) {
                        
//#line 64 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final NQueensDist t84373 =
                          this.
                            out$;
                        
//#line 64 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84374 =
                          t84373.
                            N;
                        
//#line 64 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84375 =
                          ((t84374) - (((int)(1))));
                        
//#line 64 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.lang.IntRange t84376 =
                          ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(t84375)))));
                        
//#line 64 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.Region t84378 =
                          ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t84376)))));
                        
//#line 64 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final NQueensDist t84377 =
                          this.
                            out$;
                        
//#line 64 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84379 =
                          t84377.
                            P;
                        
//#line 64 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.Array<x10.array.Region> R =
                          ((x10.array.Array)(NQueensDist.block(((x10.array.Region)(t84378)),
                                                               (int)(t84379))));
                        
//#line 65 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.Dist D =
                          ((x10.array.Dist)(x10.array.Dist.makeUnique()));
                        {
                            
//#line 66 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.PlaceGroup t84381 =
                              D.places();
                            
//#line 66 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.lang.Iterator<x10.lang.Place> p84313 =
                              ((x10.lang.Iterable<x10.lang.Place>)t84381).iterator();
                            
//#line 66 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
for (;
                                                                                              true;
                                                                                              ) {
                                
//#line 66 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final boolean t84384 =
                                  ((x10.lang.Iterator<x10.lang.Place>)p84313).hasNext$O();
                                
//#line 66 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
if (!(t84384)) {
                                    
//#line 66 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
break;
                                }
                                {
                                    
//#line 66 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.lang.Place p =
                                      ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p84313).next$G()));
                                    
//#line 67 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
x10.lang.Runtime.runAsync(((x10.lang.Place)(p)),
                                                                                                                           ((x10.core.fun.VoidFun_0_0)(new NQueensDist.Board.$Closure$95(this,
                                                                                                                                                                                         p,
                                                                                                                                                                                         R,(java.lang.Class<?>) null))));
                                }
                                {
                                    
                                }
                            }
                        }
                    } else {
                        
//#line 69 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final NQueensDist t84385 =
                          this.
                            out$;
                        
//#line 69 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84386 =
                          t84385.
                            N;
                        
//#line 69 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84387 =
                          ((t84386) - (((int)(1))));
                        
//#line 69 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.lang.IntRange t84388 =
                          ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(t84387)))));
                        
//#line 69 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.Region t84389 =
                          ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t84388)))));
                        
//#line 69 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
this.search(((x10.array.Region)(t84389)));
                    }
                }
                
                
//#line 32 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final public NQueensDist.Board
                                                                               NQueensDist$Board$$NQueensDist$Board$this(
                                                                               ){
                    
//#line 32 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
return NQueensDist.Board.this;
                }
                
                
//#line 32 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final public NQueensDist
                                                                               NQueensDist$Board$$NQueensDist$this(
                                                                               ){
                    
//#line 32 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final NQueensDist t84391 =
                      this.
                        out$;
                    
//#line 32 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
return t84391;
                }
                
                public static class $Closure$93 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$93.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$93> $RTT = new x10.rtt.StaticFunType<$Closure$93>(
                    /* base class */$Closure$93.class
                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.INT), x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$93 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$93.class + " calling"); } 
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$93 $_obj = new $Closure$93((java.lang.System[]) null);
                        $deserializer.record_reference($_obj);
                        return $_deserialize_body($_obj, $deserializer);
                        
                    }
                    
                    public short $_get_serialization_id() {
                    
                         return $_serialization_id;
                        
                    }
                    
                    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$93(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                    return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1)));
                    }
                    
                        
                        public int
                          $apply$O(
                          final int id$68617){
                            
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
return 0;
                        }
                        
                        // creation method for java code
                        public static NQueensDist.Board.$Closure$93 $make(){return new $Closure$93();}
                        public $Closure$93() { {
                                                      
                                                  }}
                        
                    }
                    
                public static class $Closure$94 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$94.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$94> $RTT = new x10.rtt.StaticFunType<$Closure$94>(
                    /* base class */$Closure$94.class
                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.INT), x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$94 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$94.class + " calling"); } 
                        $_obj.n = $deserializer.readInt();
                        x10.array.Array old = (x10.array.Array) $deserializer.readRef();
                        $_obj.old = old;
                        $_obj.newItem = $deserializer.readInt();
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$94 $_obj = new $Closure$94((java.lang.System[]) null);
                        $deserializer.record_reference($_obj);
                        return $_deserialize_body($_obj, $deserializer);
                        
                    }
                    
                    public short $_get_serialization_id() {
                    
                         return $_serialization_id;
                        
                    }
                    
                    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                        $serializer.write(this.n);
                        if (old instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.old);
                        } else {
                        $serializer.write(this.old);
                        }
                        $serializer.write(this.newItem);
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$94(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                    return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1)));
                    }
                    
                        
                        public int
                          $apply$O(
                          final int i){
                            
//#line 39 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final boolean t84336 =
                              ((i) < (((int)(this.
                                               n))));
                            
//#line 39 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
int t84337 =
                               0;
                            
//#line 39 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
if (t84336) {
                                
//#line 39 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
t84337 = x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)this.
                                                                                                                                                            old).$apply$G((int)(i)));
                            } else {
                                
//#line 39 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
t84337 = this.
                                                                                                        newItem;
                            }
                            
//#line 39 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84338 =
                              t84337;
                            
//#line 39 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
return t84338;
                        }
                        
                        public int n;
                        public x10.array.Array<x10.core.Int> old;
                        public int newItem;
                        
                        // creation method for java code
                        public static NQueensDist.Board.$Closure$94 $make(final int n,
                                                                          final x10.array.Array<x10.core.Int> old,
                                                                          final int newItem,java.lang.Class<?> $dummy0){return new $Closure$94(n,old,newItem,(java.lang.Class<?>) null);}
                        public $Closure$94(final int n,
                                           final x10.array.Array<x10.core.Int> old,
                                           final int newItem,java.lang.Class<?> $dummy0) { {
                                                                                                  this.n = n;
                                                                                                  this.old = ((x10.array.Array)(old));
                                                                                                  this.newItem = newItem;
                                                                                              }}
                        
                    }
                    
                public static class $Closure$95 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$95.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$95> $RTT = new x10.rtt.StaticVoidFunType<$Closure$95>(
                    /* base class */$Closure$95.class
                    , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$95 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$95.class + " calling"); } 
                        NQueensDist.Board out$$ = (NQueensDist.Board) $deserializer.readRef();
                        $_obj.out$$ = out$$;
                        x10.lang.Place p = (x10.lang.Place) $deserializer.readRef();
                        $_obj.p = p;
                        x10.array.Array R = (x10.array.Array) $deserializer.readRef();
                        $_obj.R = R;
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$95 $_obj = new $Closure$95((java.lang.System[]) null);
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
                        if (p instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.p);
                        } else {
                        $serializer.write(this.p);
                        }
                        if (R instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.R);
                        } else {
                        $serializer.write(this.R);
                        }
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$95(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    
                        
                        public void
                          $apply(
                          ){
                            
//#line 68 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84382 =
                              this.
                                p.
                                id;
                            
//#line 68 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.Region t84383 =
                              ((x10.array.Region)(((x10.array.Array<x10.array.Region>)this.
                                                                                        R).$apply$G((int)(t84382))));
                            
//#line 68 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
this.
                                                                                           out$$.search(((x10.array.Region)(t84383)));
                        }
                        
                        public NQueensDist.Board out$$;
                        public x10.lang.Place p;
                        public x10.array.Array<x10.array.Region> R;
                        
                        // creation method for java code
                        public static NQueensDist.Board.$Closure$95 $make(final NQueensDist.Board out$$,
                                                                          final x10.lang.Place p,
                                                                          final x10.array.Array<x10.array.Region> R,java.lang.Class<?> $dummy0){return new $Closure$95(out$$,p,R,(java.lang.Class<?>) null);}
                        public $Closure$95(final NQueensDist.Board out$$,
                                           final x10.lang.Place p,
                                           final x10.array.Array<x10.array.Region> R,java.lang.Class<?> $dummy0) { {
                                                                                                                          this.out$$ = out$$;
                                                                                                                          this.p = ((x10.lang.Place)(p));
                                                                                                                          this.R = ((x10.array.Array)(R));
                                                                                                                      }}
                        
                    }
                    
                
                }
                
                
//#line 72 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
public static NQueensDist.Anonymous$2396 reducer;
                
                
//#line 76 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
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
                    
//#line 77 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84392 =
                      ((x10.array.Array<java.lang.String>)args).
                        size;
                    
//#line 77 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final boolean t84394 =
                      ((t84392) > (((int)(0))));
                    
//#line 77 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
int t84395 =
                       0;
                    
//#line 77 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
if (t84394) {
                        
//#line 77 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final java.lang.String t84393 =
                          ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
                        
//#line 77 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
t84395 = java.lang.Integer.parseInt(t84393);
                    } else {
                        
//#line 77 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
t84395 = 8;
                    }
                    
//#line 77 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int n =
                      t84395;
                    
//#line 78 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.io.Printer t84396 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 78 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final java.lang.String t84397 =
                      (("N=") + ((x10.core.Int.$box(n))));
                    
//#line 78 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
t84396.println(((java.lang.String)(t84397)));
                    
//#line 81 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int P =
                      x10.lang.Place.getInitialized$MAX_PLACES();
                    
//#line 82 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final NQueensDist nq =
                      ((NQueensDist)(new NQueensDist((java.lang.System[]) null).$init(((int)(n)),
                                                                                      ((int)(P)))));
                    
//#line 83 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final long t84398 =
                      x10.lang.System.nanoTime$O();
                    
//#line 83 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
long start =
                      (-(t84398));
                    
//#line 84 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int answer =
                      nq.run$O();
                    
//#line 85 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.Array<x10.core.Int> t84399 =
                      ((x10.array.Array)(NQueensDist.expectedSolutions));
                    
//#line 85 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84400 =
                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t84399).$apply$G((int)(n)));
                    
//#line 85 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final boolean result =
                      ((int) answer) ==
                    ((int) t84400);
                    
//#line 86 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final long t84401 =
                      start;
                    
//#line 86 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final long t84402 =
                      x10.lang.System.nanoTime$O();
                    
//#line 86 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final long t84403 =
                      ((t84401) + (((long)(t84402))));
                    
//#line 86 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
start = t84403;
                    
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final long t84404 =
                      start;
                    
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final long t84405 =
                      ((long)(((int)(1000000))));
                    
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final long t84406 =
                      ((t84404) / (((long)(t84405))));
                    
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
start = t84406;
                    
//#line 88 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.io.Printer t84420 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 88 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84407 =
                      nq.
                        N;
                    
//#line 88 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final java.lang.String t84408 =
                      (("NQueensDist ") + ((x10.core.Int.$box(t84407))));
                    
//#line 88 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final java.lang.String t84409 =
                      ((t84408) + ("(P="));
                    
//#line 88 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final java.lang.String t84410 =
                      ((t84409) + ((x10.core.Int.$box(P))));
                    
//#line 88 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final java.lang.String t84411 =
                      ((t84410) + (") has "));
                    
//#line 88 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final java.lang.String t84412 =
                      ((t84411) + ((x10.core.Int.$box(answer))));
                    
//#line 88 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final java.lang.String t84414 =
                      ((t84412) + (" solutions"));
                    
//#line 90 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
java.lang.String t84413 =
                       null;
                    
//#line 90 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
if (result) {
                        
//#line 90 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
t84413 = " (ok)";
                    } else {
                        
//#line 90 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
t84413 = " (wrong)";
                    }
                    
//#line 90 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final java.lang.String t84415 =
                      t84413;
                    
//#line 88 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final java.lang.String t84416 =
                      ((t84414) + (t84415));
                    
//#line 88 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final java.lang.String t84417 =
                      ((t84416) + (" (t="));
                    
//#line 90 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final long t84418 =
                      start;
                    
//#line 88 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final java.lang.String t84419 =
                      ((t84417) + ((x10.core.Long.$box(t84418))));
                    
//#line 88 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final java.lang.String t84421 =
                      ((t84419) + ("ms)."));
                    
//#line 88 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
t84420.println(((java.lang.String)(t84421)));
                }
                
                
//#line 7 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final public NQueensDist
                                                                              NQueensDist$$NQueensDist$this(
                                                                              ){
                    
//#line 7 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
return NQueensDist.this;
                }
                
                
//#line 72 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final public static class Anonymous$2396 extends x10.core.Ref implements x10.lang.Reducible, x10.x10rt.X10JavaSerializable
                                                                             {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, Anonymous$2396.class);
                    
                    public static final x10.rtt.RuntimeType<Anonymous$2396> $RTT = new x10.rtt.NamedType<Anonymous$2396>(
                    "NQueensDist.Anonymous$2396", /* base class */Anonymous$2396.class
                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.lang.Reducible.$RTT, x10.rtt.Types.INT), x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body(Anonymous$2396 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + Anonymous$2396.class + " calling"); } 
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        Anonymous$2396 $_obj = new Anonymous$2396((java.lang.System[]) null);
                        $deserializer.record_reference($_obj);
                        return $_deserialize_body($_obj, $deserializer);
                        
                    }
                    
                    public short $_get_serialization_id() {
                    
                         return $_serialization_id;
                        
                    }
                    
                    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                        
                    }
                    
                    // constructor just for allocation
                    public Anonymous$2396(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    // dispatcher for method abstract public x10.lang.Reducible.operator()(T,T):T
                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
                    return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1), x10.core.Int.$unbox(a2)));
                    }
                    // bridge for method abstract public x10.lang.Reducible.zero():T
                    public x10.core.Int
                      zero$G(){return x10.core.Int.$box(zero$O());}
                    
                        
                        
//#line 73 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
public int
                                                                                       zero$O(
                                                                                       ){
                            
//#line 73 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
return 0;
                        }
                        
                        
//#line 74 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
public int
                                                                                       $apply$O(
                                                                                       final int i,
                                                                                       final int j){
                            
//#line 74 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84422 =
                              ((i) + (((int)(j))));
                            
//#line 74 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
return t84422;
                        }
                        
                        
//#line 72 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
// creation method for java code
                        public static NQueensDist.Anonymous$2396 $make(){return new NQueensDist.Anonymous$2396((java.lang.System[]) null).$init();}
                        
                        // constructor for non-virtual call
                        final public NQueensDist.Anonymous$2396 NQueensDist$Anonymous$2396$$init$S() { {
                                                                                                              
//#line 72 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"

                                                                                                          }
                                                                                                          return this;
                                                                                                          }
                        
                        // constructor
                        public NQueensDist.Anonymous$2396 $init(){return NQueensDist$Anonymous$2396$$init$S();}
                        
                    
                }
                
                public static int fieldId$reducer;
                final public static x10.core.concurrent.AtomicInteger initStatus$reducer = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
                
                public static x10.array.Array<x10.core.Int>
                  getInitialized$expectedSolutions(
                  ){
                    return NQueensDist.expectedSolutions;
                }
                
                public static void
                  getDeserialized$reducer(
                  byte[] buf){
                    if (((boolean) x10.x10rt.X10JavaSerializable.CUSTOM_JAVA_SERIALIZATION) ==
                          ((boolean) true)) {
                        NQueensDist.reducer = ((NQueensDist.Anonymous$2396)(x10.runtime.impl.java.InitDispatcher.deserializeField(((byte[])(buf)))));
                    } else {
                        NQueensDist.reducer = ((NQueensDist.Anonymous$2396)(x10.rtt.Types.<NQueensDist.Anonymous$2396> cast(x10.runtime.impl.java.InitDispatcher.deserializeField(((byte[])(buf))),NQueensDist.Anonymous$2396.$RTT)));
                    }
                    NQueensDist.initStatus$reducer.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                }
                
                public static NQueensDist.Anonymous$2396
                  getInitialized$reducer(
                  ){
                    if (((int) x10.lang.Runtime.hereInt$O()) ==
                        ((int) 0)) {
                        if (NQueensDist.initStatus$reducer.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED),
                                                                         (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                            NQueensDist.reducer = ((NQueensDist.Anonymous$2396)(new NQueensDist.Anonymous$2396((java.lang.System[]) null).$init()));
                            if (((boolean) x10.x10rt.X10JavaSerializable.CUSTOM_JAVA_SERIALIZATION) ==
                                  ((boolean) true)) {
                                x10.runtime.impl.java.InitDispatcher.broadcastStaticField(((java.lang.Object)(NQueensDist.reducer)),
                                                                                          (int)(NQueensDist.fieldId$reducer));
                            } else {
                                x10.runtime.impl.java.InitDispatcher.broadcastStaticField(((java.lang.Object)(NQueensDist.reducer)),
                                                                                          (int)(NQueensDist.fieldId$reducer));
                            }
                            NQueensDist.initStatus$reducer.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                            x10.runtime.impl.java.InitDispatcher.lockInitialized();
                            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                        }
                    }
                    if (((int) NQueensDist.initStatus$reducer.get()) !=
                        ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                        x10.runtime.impl.java.InitDispatcher.lockInitialized();
                        while (((int) NQueensDist.initStatus$reducer.get()) !=
                               ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                            x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                        }
                        x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    }
                    return NQueensDist.reducer;
                }
                
                static {
                           NQueensDist.fieldId$reducer = x10.runtime.impl.java.InitDispatcher.addInitializer(((java.lang.String)("NQueensDist")),
                                                                                                             ((java.lang.String)("reducer")));
                       }
                
                public static class $Closure$96 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$96.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$96> $RTT = new x10.rtt.StaticFunType<$Closure$96>(
                    /* base class */$Closure$96.class
                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.array.Region.$RTT), x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$96 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$96.class + " calling"); } 
                        $_obj.baseSize = $deserializer.readInt();
                        $_obj.low = $deserializer.readInt();
                        $_obj.extra = $deserializer.readInt();
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$96 $_obj = new $Closure$96((java.lang.System[]) null);
                        $deserializer.record_reference($_obj);
                        return $_deserialize_body($_obj, $deserializer);
                        
                    }
                    
                    public short $_get_serialization_id() {
                    
                         return $_serialization_id;
                        
                    }
                    
                    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                        $serializer.write(this.baseSize);
                        $serializer.write(this.low);
                        $serializer.write(this.extra);
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$96(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                    return $apply(x10.core.Int.$unbox(a1));
                    }
                    
                        
                        public x10.array.Region
                          $apply(
                          final int i){
                            
//#line 27 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84320 =
                              ((i) * (((int)(this.
                                               baseSize))));
                            
//#line 27 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84323 =
                              ((this.
                                  low) + (((int)(t84320))));
                            
//#line 27 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final boolean t84321 =
                              ((i) < (((int)(this.
                                               extra))));
                            
//#line 27 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
int t84322 =
                               0;
                            
//#line 27 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
if (t84321) {
                                
//#line 27 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
t84322 = i;
                            } else {
                                
//#line 27 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
t84322 = this.
                                                                                                        extra;
                            }
                            
//#line 27 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84324 =
                              t84322;
                            
//#line 27 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int start =
                              ((t84323) + (((int)(t84324))));
                            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84327 =
                              ((start) + (((int)(this.
                                                   baseSize))));
                            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final boolean t84325 =
                              ((i) < (((int)(this.
                                               extra))));
                            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
int t84326 =
                               0;
                            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
if (t84325) {
                                
//#line 28 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
t84326 = 0;
                            } else {
                                
//#line 28 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
t84326 = -1;
                            }
                            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84328 =
                              t84326;
                            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final int t84329 =
                              ((t84327) + (((int)(t84328))));
                            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.lang.IntRange t84330 =
                              ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(start)), ((int)(t84329)))));
                            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
final x10.array.Region t84331 =
                              ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t84330)))));
                            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/NQueensDist.x10"
return t84331;
                        }
                        
                        public int baseSize;
                        public int low;
                        public int extra;
                        
                        // creation method for java code
                        public static NQueensDist.$Closure$96 $make(final int baseSize,
                                                                    final int low,
                                                                    final int extra){return new $Closure$96(baseSize,low,extra);}
                        public $Closure$96(final int baseSize,
                                           final int low,
                                           final int extra) { {
                                                                     this.baseSize = baseSize;
                                                                     this.low = low;
                                                                     this.extra = extra;
                                                                 }}
                        
                    }
                    
                
            }
            