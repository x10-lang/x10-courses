public class NQueens extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, NQueens.class);
    
    public static final x10.rtt.RuntimeType<NQueens> $RTT = new x10.rtt.NamedType<NQueens>(
    "NQueens", /* base class */NQueens.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(NQueens $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + NQueens.class + " calling"); } 
        $_obj.nSolutions = $deserializer.readInt();
        $_obj.N = $deserializer.readInt();
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        NQueens $_obj = new NQueens((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        $serializer.write(this.nSolutions);
        $serializer.write(this.N);
        
    }
    
    // constructor just for allocation
    public NQueens(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
//#line 2 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
public int nSolutions;
        
//#line 3 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final public static x10.array.Array<x10.core.Int> expectedSolutions = ((x10.array.Array)(x10.core.ArrayFactory.<x10.core.Int> makeArrayFromJavaArray(x10.rtt.Types.INT, new int[] {0, 1, 0, 0, 2, 10, 4, 40, 92, 352, 724, 2680, 14200, 73712, 365596, 2279184, 14772512})));
        
//#line 5 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
public int N;
        
        
//#line 6 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
// creation method for java code
        public static NQueens $make(final int N){return new NQueens((java.lang.System[]) null).$init(N);}
        
        // constructor for non-virtual call
        final public NQueens NQueens$$init$S(final int N) { {
                                                                   {
                                                                       
//#line 6 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"

                                                                   }
                                                                   {
                                                                       {
                                                                           
//#line 6 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"

                                                                       }
                                                                       
//#line 1 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
this.__fieldInitializers80693();
                                                                   }
                                                                   
//#line 6 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
this.N = N;
                                                               }
                                                               return this;
                                                               }
        
        // constructor
        public NQueens $init(final int N){return NQueens$$init$S(N);}
        
        
        
//#line 7 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
public void
                                                                  start(
                                                                  ){
            
//#line 8 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final NQueens.Board t81045 =
              ((NQueens.Board)(new NQueens.Board((java.lang.System[]) null).$init(this)));
            
//#line 8 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
t81045.search();
        }
        
        
//#line 10 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
public static class Board extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
                                                                 {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, Board.class);
            
            public static final x10.rtt.RuntimeType<Board> $RTT = new x10.rtt.NamedType<Board>(
            "NQueens.Board", /* base class */Board.class
            , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body(Board $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + Board.class + " calling"); } 
                x10.array.Array q = (x10.array.Array) $deserializer.readRef();
                $_obj.q = q;
                NQueens out$ = (NQueens) $deserializer.readRef();
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
            
                
//#line 1 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
public NQueens out$;
                
//#line 11 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
public x10.array.Array<x10.core.Int> q;
                
                
//#line 12 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
// creation method for java code
                public static NQueens.Board $make(final NQueens out$){return new NQueens.Board((java.lang.System[]) null).$init(out$);}
                
                // constructor for non-virtual call
                final public NQueens.Board NQueens$Board$$init$S(final NQueens out$) { {
                                                                                              {
                                                                                                  
//#line 12 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"

                                                                                              }
                                                                                              
//#line 1 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
this.out$ = out$;
                                                                                              {
                                                                                                  {
                                                                                                      
//#line 12 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"

                                                                                                  }
                                                                                                  {
                                                                                                      
                                                                                                  }
                                                                                              }
                                                                                              
//#line 13 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> t81046 =
                                                                                                ((x10.core.fun.Fun_0_1)(new NQueens.Board.$Closure$82()));
                                                                                              
//#line 13 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final x10.array.Array<x10.core.Int> t81047 =
                                                                                                ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(0)),
                                                                                                                                                                                                         ((x10.core.fun.Fun_0_1)(t81046)),(java.lang.Class<?>[][][][]) null)));
                                                                                              
//#line 13 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
this.q = ((x10.array.Array)(t81047));
                                                                                          }
                                                                                          return this;
                                                                                          }
                
                // constructor
                public NQueens.Board $init(final NQueens out$){return NQueens$Board$$init$S(out$);}
                
                
                
//#line 15 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
// creation method for java code
                public static NQueens.Board $make(final NQueens out$,
                                                  final x10.array.Array<x10.core.Int> old,
                                                  final int newItem,java.lang.Class<?> $dummy0){return new NQueens.Board((java.lang.System[]) null).$init(out$,old,newItem,(java.lang.Class<?>) null);}
                
                // constructor for non-virtual call
                final public NQueens.Board NQueens$Board$$init$S(final NQueens out$,
                                                                 final x10.array.Array<x10.core.Int> old,
                                                                 final int newItem,java.lang.Class<?> $dummy0) { {
                                                                                                                        {
                                                                                                                            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"

                                                                                                                        }
                                                                                                                        
//#line 1 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
this.out$ = out$;
                                                                                                                        {
                                                                                                                            {
                                                                                                                                
//#line 15 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"

                                                                                                                            }
                                                                                                                            {
                                                                                                                                
                                                                                                                            }
                                                                                                                        }
                                                                                                                        
//#line 16 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int n =
                                                                                                                          ((x10.array.Array<x10.core.Int>)old).
                                                                                                                            size;
                                                                                                                        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81051 =
                                                                                                                          ((n) + (((int)(1))));
                                                                                                                        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> t81052 =
                                                                                                                          ((x10.core.fun.Fun_0_1)(new NQueens.Board.$Closure$83(n,
                                                                                                                                                                                old,
                                                                                                                                                                                newItem,(java.lang.Class<?>) null)));
                                                                                                                        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final x10.array.Array<x10.core.Int> t81053 =
                                                                                                                          ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(t81051,
                                                                                                                                                                                                                                   ((x10.core.fun.Fun_0_1)(t81052)),(java.lang.Class<?>[][][][]) null)));
                                                                                                                        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
this.q = ((x10.array.Array)(t81053));
                                                                                                                    }
                                                                                                                    return this;
                                                                                                                    }
                
                // constructor
                public NQueens.Board $init(final NQueens out$,
                                           final x10.array.Array<x10.core.Int> old,
                                           final int newItem,java.lang.Class<?> $dummy0){return NQueens$Board$$init$S(out$,old,newItem, $dummy0);}
                
                
                
//#line 19 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
public boolean
                                                                           safe$O(
                                                                           final int j){
                    
//#line 20 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final x10.array.Array<x10.core.Int> t81054 =
                      ((x10.array.Array)(q));
                    
//#line 20 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int n =
                      ((x10.array.Array<x10.core.Int>)t81054).
                        size;
                    {
                        
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81055 =
                          ((n) - (((int)(1))));
                        
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final x10.lang.IntRange t81056 =
                          ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(t81055)))));
                        
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final x10.array.Region p81016 =
                          ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t81056)))));
                        
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int k81017min81018 =
                          p81016.min$O((int)(0));
                        
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int k81017max81019 =
                          p81016.max$O((int)(0));
                        {
                            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
int k81017 =
                              k81017min81018;
                            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
for (;
                                                                                          true;
                                                                                          ) {
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81058 =
                                  k81017;
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final boolean t81071 =
                                  ((t81058) <= (((int)(k81017max81019))));
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
if (!(t81071)) {
                                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
break;
                                }
                                {
                                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int k =
                                      k81017;
                                    {
                                        
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final x10.array.Array<x10.core.Int> t81061 =
                                          ((x10.array.Array)(q));
                                        
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81062 =
                                          x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t81061).$apply$G((int)(k)));
                                        
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
boolean t81069 =
                                          ((int) j) ==
                                        ((int) t81062);
                                        
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
if (!(t81069)) {
                                            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81063 =
                                              ((n) - (((int)(k))));
                                            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81067 =
                                              x10.lang.Math.abs$O((int)(t81063));
                                            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final x10.array.Array<x10.core.Int> t81064 =
                                              ((x10.array.Array)(q));
                                            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81065 =
                                              x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t81064).$apply$G((int)(k)));
                                            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81066 =
                                              ((j) - (((int)(t81065))));
                                            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81068 =
                                              x10.lang.Math.abs$O((int)(t81066));
                                            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
t81069 = ((int) t81067) ==
                                            ((int) t81068);
                                        }
                                        
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final boolean t81070 =
                                          t81069;
                                        
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
if (t81070) {
                                            
//#line 23 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
return false;
                                        }
                                    }
                                }
                                {
                                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81059 =
                                      k81017;
                                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81060 =
                                      ((t81059) + (((int)(1))));
                                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
k81017 = t81060;
                                }
                            }
                        }
                    }
                    
//#line 25 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
return true;
                }
                
                
//#line 27 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
public void
                                                                           search(
                                                                           final x10.array.Region R){
                    
//#line 28 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final x10.lang.Iterator<x10.array.Point> id81035 =
                      R.iterator();
                    
//#line 28 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
for (;
                                                                                  true;
                                                                                  ) {
                        
//#line 28 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final boolean t81077 =
                          ((x10.lang.Iterator<x10.array.Point>)id81035).hasNext$O();
                        
//#line 28 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
if (!(t81077)) {
                            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
break;
                        }
                        {
                            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final x10.array.Point id68503 =
                              ((x10.array.Point)(((x10.lang.Iterator<x10.array.Point>)id81035).next$G()));
                            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int k =
                              id68503.$apply$O((int)(0));
                            
//#line 29 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final boolean t81076 =
                              this.safe$O((int)(k));
                            
//#line 29 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
if (t81076) {
                                
//#line 30 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final NQueens t81073 =
                                  this.
                                    out$;
                                
//#line 30 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final x10.array.Array<x10.core.Int> t81074 =
                                  ((x10.array.Array)(q));
                                
//#line 30 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final NQueens.Board t81075 =
                                  ((NQueens.Board)(new NQueens.Board((java.lang.System[]) null).$init(t81073,
                                                                                                      ((x10.array.Array)(t81074)),
                                                                                                      ((int)(k)),(java.lang.Class<?>) null)));
                                
//#line 30 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
t81075.search();
                            }
                        }
                        {
                            
                        }
                    }
                }
                
                
//#line 33 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
public void
                                                                           search(
                                                                           ){
                    
//#line 34 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final x10.array.Array<x10.core.Int> t81078 =
                      ((x10.array.Array)(q));
                    
//#line 34 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81080 =
                      ((x10.array.Array<x10.core.Int>)t81078).
                        size;
                    
//#line 34 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final NQueens t81079 =
                      this.
                        out$;
                    
//#line 34 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81081 =
                      t81079.
                        N;
                    
//#line 34 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final boolean t81084 =
                      ((int) t81080) ==
                    ((int) t81081);
                    
//#line 34 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
if (t81084) {
                        
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final NQueens x81043 =
                          ((NQueens)(this.
                                       out$));
                        
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
;
                        
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81082 =
                          x81043.
                            nSolutions;
                        
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81083 =
                          ((t81082) + (((int)(1))));
                        
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
x81043.nSolutions = t81083;
                        
//#line 36 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
return;
                    }
                    
//#line 38 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final NQueens t81085 =
                      this.
                        out$;
                    
//#line 38 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81086 =
                      t81085.
                        N;
                    
//#line 38 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81087 =
                      ((t81086) - (((int)(1))));
                    
//#line 38 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final x10.lang.IntRange t81088 =
                      ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(t81087)))));
                    
//#line 38 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final x10.array.Region t81089 =
                      ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t81088)))));
                    
//#line 38 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
this.search(((x10.array.Region)(t81089)));
                }
                
                
//#line 10 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final public NQueens.Board
                                                                           NQueens$Board$$NQueens$Board$this(
                                                                           ){
                    
//#line 10 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
return NQueens.Board.this;
                }
                
                
//#line 10 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final public NQueens
                                                                           NQueens$Board$$NQueens$this(
                                                                           ){
                    
//#line 10 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final NQueens t81090 =
                      this.
                        out$;
                    
//#line 10 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
return t81090;
                }
                
                public static class $Closure$82 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$82.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$82> $RTT = new x10.rtt.StaticFunType<$Closure$82>(
                    /* base class */$Closure$82.class
                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.INT), x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$82 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$82.class + " calling"); } 
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$82 $_obj = new $Closure$82((java.lang.System[]) null);
                        $deserializer.record_reference($_obj);
                        return $_deserialize_body($_obj, $deserializer);
                        
                    }
                    
                    public short $_get_serialization_id() {
                    
                         return $_serialization_id;
                        
                    }
                    
                    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$82(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                    return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1)));
                    }
                    
                        
                        public int
                          $apply$O(
                          final int id$68501){
                            
//#line 13 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
return 0;
                        }
                        
                        // creation method for java code
                        public static NQueens.Board.$Closure$82 $make(){return new $Closure$82();}
                        public $Closure$82() { {
                                                      
                                                  }}
                        
                    }
                    
                public static class $Closure$83 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$83.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$83> $RTT = new x10.rtt.StaticFunType<$Closure$83>(
                    /* base class */$Closure$83.class
                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.INT), x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$83 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$83.class + " calling"); } 
                        $_obj.n = $deserializer.readInt();
                        x10.array.Array old = (x10.array.Array) $deserializer.readRef();
                        $_obj.old = old;
                        $_obj.newItem = $deserializer.readInt();
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$83 $_obj = new $Closure$83((java.lang.System[]) null);
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
                    public $Closure$83(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                    return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1)));
                    }
                    
                        
                        public int
                          $apply$O(
                          final int i){
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final boolean t81048 =
                              ((i) < (((int)(this.
                                               n))));
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
int t81049 =
                               0;
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
if (t81048) {
                                
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
t81049 = x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)this.
                                                                                                                                                        old).$apply$G((int)(i)));
                            } else {
                                
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
t81049 = this.
                                                                                                    newItem;
                            }
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81050 =
                              t81049;
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
return t81050;
                        }
                        
                        public int n;
                        public x10.array.Array<x10.core.Int> old;
                        public int newItem;
                        
                        // creation method for java code
                        public static NQueens.Board.$Closure$83 $make(final int n,
                                                                      final x10.array.Array<x10.core.Int> old,
                                                                      final int newItem,java.lang.Class<?> $dummy0){return new $Closure$83(n,old,newItem,(java.lang.Class<?>) null);}
                        public $Closure$83(final int n,
                                           final x10.array.Array<x10.core.Int> old,
                                           final int newItem,java.lang.Class<?> $dummy0) { {
                                                                                                  this.n = n;
                                                                                                  this.old = ((x10.array.Array)(old));
                                                                                                  this.newItem = newItem;
                                                                                              }}
                        
                    }
                    
                
                }
                
            
            
//#line 41 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
            private static final long serialVersionUID = 1L;
            public static void main(java.lang.String[] args) {
            // start native runtime
            new $Main().start(args);
            }
            
            // called by native runtime inside main x10 thread
            public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
            // call the original app-main method
            NQueens.main(args);
            }
            }
            
            // the original app-main method
            public static void main(final x10.array.Array<java.lang.String> args) {
                
//#line 42 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81091 =
                  ((x10.array.Array<java.lang.String>)args).
                    size;
                
//#line 42 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final boolean t81093 =
                  ((t81091) > (((int)(0))));
                
//#line 42 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
int t81094 =
                   0;
                
//#line 42 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
if (t81093) {
                    
//#line 42 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final java.lang.String t81092 =
                      ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
                    
//#line 42 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
t81094 = java.lang.Integer.parseInt(t81092);
                } else {
                    
//#line 42 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
t81094 = 8;
                }
                
//#line 42 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int n =
                  t81094;
                
//#line 43 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final java.lang.String t81095 =
                  (("N=") + ((x10.core.Int.$box(n))));
                
//#line 43 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
NQueens.println(((java.lang.String)(t81095)));
                
//#line 45 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final NQueens nq =
                  ((NQueens)(new NQueens((java.lang.System[]) null).$init(((int)(n)))));
                
//#line 46 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final long t81096 =
                  x10.lang.System.nanoTime$O();
                
//#line 46 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
long start =
                  (-(t81096));
                
//#line 47 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
nq.start();
                
//#line 48 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81099 =
                  nq.
                    nSolutions;
                
//#line 48 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final x10.array.Array<x10.core.Int> t81097 =
                  ((x10.array.Array)(NQueens.expectedSolutions));
                
//#line 48 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81098 =
                  nq.
                    N;
                
//#line 48 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81100 =
                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t81097).$apply$G((int)(t81098)));
                
//#line 48 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final boolean result =
                  ((int) t81099) ==
                ((int) t81100);
                
//#line 49 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final long t81101 =
                  start;
                
//#line 49 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final long t81102 =
                  x10.lang.System.nanoTime$O();
                
//#line 49 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final long t81103 =
                  ((t81101) + (((long)(t81102))));
                
//#line 49 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
start = t81103;
                
//#line 50 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final long t81104 =
                  start;
                
//#line 50 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final long t81105 =
                  ((long)(((int)(1000000))));
                
//#line 50 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final long t81106 =
                  ((t81104) / (((long)(t81105))));
                
//#line 50 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
start = t81106;
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81107 =
                  nq.
                    N;
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final java.lang.String t81108 =
                  (("NQueens ") + ((x10.core.Int.$box(t81107))));
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final java.lang.String t81109 =
                  ((t81108) + (" has "));
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final int t81110 =
                  nq.
                    nSolutions;
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final java.lang.String t81111 =
                  ((t81109) + ((x10.core.Int.$box(t81110))));
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final java.lang.String t81113 =
                  ((t81111) + (" solutions"));
                
//#line 52 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
java.lang.String t81112 =
                   null;
                
//#line 52 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
if (result) {
                    
//#line 52 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
t81112 = " (ok)";
                } else {
                    
//#line 52 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
t81112 = " (wrong)";
                }
                
//#line 52 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final java.lang.String t81114 =
                  t81112;
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final java.lang.String t81115 =
                  ((t81113) + (t81114));
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final java.lang.String t81116 =
                  ((t81115) + (" (t="));
                
//#line 52 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final long t81117 =
                  start;
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final java.lang.String t81118 =
                  ((t81116) + ((x10.core.Long.$box(t81117))));
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final java.lang.String t81119 =
                  ((t81118) + ("ms)."));
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
NQueens.println(((java.lang.String)(t81119)));
            }
            
            
//#line 55 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
public static void
                                                                       println(
                                                                       final java.lang.String s){
                
//#line 56 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final x10.io.Printer t81120 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 56 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
t81120.println(((java.lang.String)(s)));
            }
            
            
//#line 1 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final public NQueens
                                                                      NQueens$$NQueens$this(
                                                                      ){
                
//#line 1 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
return NQueens.this;
            }
            
            
//#line 1 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
final private void
                                                                      __fieldInitializers80693(
                                                                      ){
                
//#line 1 "C:/eclipsews/pppp11/pppp11/src/NQueens.x10"
this.nSolutions = 0;
            }
            
            final public static void
              __fieldInitializers80693$P(
              final NQueens NQueens){
                NQueens.__fieldInitializers80693();
            }
            
            public static x10.array.Array<x10.core.Int>
              getInitialized$expectedSolutions(
              ){
                return NQueens.expectedSolutions;
            }
        
        }
        