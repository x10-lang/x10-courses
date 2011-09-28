public class NQueensParAsync extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, NQueensParAsync.class);
    
    public static final x10.rtt.RuntimeType<NQueensParAsync> $RTT = new x10.rtt.NamedType<NQueensParAsync>(
    "NQueensParAsync", /* base class */NQueensParAsync.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(NQueensParAsync $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + NQueensParAsync.class + " calling"); } 
        $_obj.N = $deserializer.readInt();
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        NQueensParAsync $_obj = new NQueensParAsync((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        $serializer.write(this.N);
        
    }
    
    // constructor just for allocation
    public NQueensParAsync(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
//#line 3 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final public static x10.array.Array<x10.core.Int> expectedSolutions = ((x10.array.Array)(x10.core.ArrayFactory.<x10.core.Int> makeArrayFromJavaArray(x10.rtt.Types.INT, new int[] {0, 1, 0, 0, 2, 10, 4, 40, 92, 352, 724, 2680, 14200, 73712, 365596, 2279184, 14772512})));
        
//#line 5 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
public int N;
        
        
//#line 6 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
// creation method for java code
        public static NQueensParAsync $make(final int N){return new NQueensParAsync((java.lang.System[]) null).$init(N);}
        
        // constructor for non-virtual call
        final public NQueensParAsync NQueensParAsync$$init$S(final int N) { {
                                                                                   {
                                                                                       
//#line 6 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"

                                                                                   }
                                                                                   {
                                                                                       {
                                                                                           
//#line 6 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"

                                                                                       }
                                                                                       {
                                                                                           
                                                                                       }
                                                                                   }
                                                                                   
//#line 6 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
this.N = N;
                                                                               }
                                                                               return this;
                                                                               }
        
        // constructor
        public NQueensParAsync $init(final int N){return NQueensParAsync$$init$S(N);}
        
        
        
//#line 7 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
public void
                                                                          start(
                                                                          ){
            
//#line 8 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final NQueensParAsync.Board t78206 =
              ((NQueensParAsync.Board)(new NQueensParAsync.Board((java.lang.System[]) null).$init(this)));
            
//#line 8 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
t78206.search();
        }
        
        
//#line 10 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
public static class Board extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
                                                                         {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, Board.class);
            
            public static final x10.rtt.RuntimeType<Board> $RTT = new x10.rtt.NamedType<Board>(
            "NQueensParAsync.Board", /* base class */Board.class
            , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body(Board $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + Board.class + " calling"); } 
                x10.array.Array q = (x10.array.Array) $deserializer.readRef();
                $_obj.q = q;
                NQueensParAsync out$ = (NQueensParAsync) $deserializer.readRef();
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
            
                
//#line 1 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
public NQueensParAsync out$;
                
//#line 11 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
public x10.array.Array<x10.core.Int> q;
                
                
//#line 12 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
// creation method for java code
                public static NQueensParAsync.Board $make(final NQueensParAsync out$){return new NQueensParAsync.Board((java.lang.System[]) null).$init(out$);}
                
                // constructor for non-virtual call
                final public NQueensParAsync.Board NQueensParAsync$Board$$init$S(final NQueensParAsync out$) { {
                                                                                                                      {
                                                                                                                          
//#line 12 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"

                                                                                                                      }
                                                                                                                      
//#line 1 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
this.out$ = out$;
                                                                                                                      {
                                                                                                                          {
                                                                                                                              
//#line 12 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"

                                                                                                                          }
                                                                                                                          {
                                                                                                                              
                                                                                                                          }
                                                                                                                      }
                                                                                                                      
//#line 13 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> t78207 =
                                                                                                                        ((x10.core.fun.Fun_0_1)(new NQueensParAsync.Board.$Closure$62()));
                                                                                                                      
//#line 13 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final x10.array.Array<x10.core.Int> t78208 =
                                                                                                                        ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(0)),
                                                                                                                                                                                                                                 ((x10.core.fun.Fun_0_1)(t78207)),(java.lang.Class<?>[][][][]) null)));
                                                                                                                      
//#line 13 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
this.q = ((x10.array.Array)(t78208));
                                                                                                                  }
                                                                                                                  return this;
                                                                                                                  }
                
                // constructor
                public NQueensParAsync.Board $init(final NQueensParAsync out$){return NQueensParAsync$Board$$init$S(out$);}
                
                
                
//#line 15 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
// creation method for java code
                public static NQueensParAsync.Board $make(final NQueensParAsync out$,
                                                          final x10.array.Array<x10.core.Int> old,
                                                          final int newItem,java.lang.Class<?> $dummy0){return new NQueensParAsync.Board((java.lang.System[]) null).$init(out$,old,newItem,(java.lang.Class<?>) null);}
                
                // constructor for non-virtual call
                final public NQueensParAsync.Board NQueensParAsync$Board$$init$S(final NQueensParAsync out$,
                                                                                 final x10.array.Array<x10.core.Int> old,
                                                                                 final int newItem,java.lang.Class<?> $dummy0) { {
                                                                                                                                        {
                                                                                                                                            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"

                                                                                                                                        }
                                                                                                                                        
//#line 1 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
this.out$ = out$;
                                                                                                                                        {
                                                                                                                                            {
                                                                                                                                                
//#line 15 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"

                                                                                                                                            }
                                                                                                                                            {
                                                                                                                                                
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        
//#line 16 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int n =
                                                                                                                                          ((x10.array.Array<x10.core.Int>)old).
                                                                                                                                            size;
                                                                                                                                        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78212 =
                                                                                                                                          ((n) + (((int)(1))));
                                                                                                                                        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> t78213 =
                                                                                                                                          ((x10.core.fun.Fun_0_1)(new NQueensParAsync.Board.$Closure$63(n,
                                                                                                                                                                                                        old,
                                                                                                                                                                                                        newItem,(java.lang.Class<?>) null)));
                                                                                                                                        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final x10.array.Array<x10.core.Int> t78214 =
                                                                                                                                          ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(t78212,
                                                                                                                                                                                                                                                   ((x10.core.fun.Fun_0_1)(t78213)),(java.lang.Class<?>[][][][]) null)));
                                                                                                                                        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
this.q = ((x10.array.Array)(t78214));
                                                                                                                                    }
                                                                                                                                    return this;
                                                                                                                                    }
                
                // constructor
                public NQueensParAsync.Board $init(final NQueensParAsync out$,
                                                   final x10.array.Array<x10.core.Int> old,
                                                   final int newItem,java.lang.Class<?> $dummy0){return NQueensParAsync$Board$$init$S(out$,old,newItem, $dummy0);}
                
                
                
//#line 19 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
public boolean
                                                                                   safe$O(
                                                                                   final int j){
                    
//#line 20 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final x10.array.Array<x10.core.Int> t78215 =
                      ((x10.array.Array)(q));
                    
//#line 20 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int n =
                      ((x10.array.Array<x10.core.Int>)t78215).
                        size;
                    {
                        
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int i78175min78176 =
                          0;
                        
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int i78175max78177 =
                          ((n) - (((int)(1))));
                        {
                            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
int i78175 =
                              i78175min78176;
                            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
for (;
                                                                                                  true;
                                                                                                  ) {
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78217 =
                                  i78175;
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final boolean t78230 =
                                  ((t78217) <= (((int)(i78175max78177))));
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
if (!(t78230)) {
                                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
break;
                                }
                                {
                                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int k =
                                      i78175;
                                    {
                                        
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final x10.array.Array<x10.core.Int> t78220 =
                                          ((x10.array.Array)(q));
                                        
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78221 =
                                          x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t78220).$apply$G((int)(k)));
                                        
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
boolean t78228 =
                                          ((int) j) ==
                                        ((int) t78221);
                                        
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
if (!(t78228)) {
                                            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78222 =
                                              ((n) - (((int)(k))));
                                            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78226 =
                                              x10.lang.Math.abs$O((int)(t78222));
                                            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final x10.array.Array<x10.core.Int> t78223 =
                                              ((x10.array.Array)(q));
                                            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78224 =
                                              x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t78223).$apply$G((int)(k)));
                                            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78225 =
                                              ((j) - (((int)(t78224))));
                                            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78227 =
                                              x10.lang.Math.abs$O((int)(t78225));
                                            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
t78228 = ((int) t78226) ==
                                            ((int) t78227);
                                        }
                                        
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final boolean t78229 =
                                          t78228;
                                        
//#line 22 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
if (t78229) {
                                            
//#line 23 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
return false;
                                        }
                                    }
                                }
                                {
                                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78218 =
                                      i78175;
                                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78219 =
                                      ((t78218) + (((int)(1))));
                                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
i78175 = t78219;
                                }
                            }
                        }
                    }
                    
//#line 25 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
return true;
                }
                
                
//#line 30 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
public void
                                                                                   search(
                                                                                   final int low,
                                                                                   final int high){
                    
//#line 31 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int i78191min78192 =
                      low;
                    
//#line 31 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int i78191max78193 =
                      high;
                    {
                        
//#line 31 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
int i78191 =
                          i78191min78192;
                        
//#line 31 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
for (;
                                                                                              true;
                                                                                              ) {
                            
//#line 31 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78232 =
                              i78191;
                            
//#line 31 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final boolean t78239 =
                              ((t78232) <= (((int)(i78191max78193))));
                            
//#line 31 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
if (!(t78239)) {
                                
//#line 31 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
break;
                            }
                            {
                                
//#line 31 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int k =
                                  i78191;
                                {
                                    
//#line 32 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final boolean t78238 =
                                      this.safe$O((int)(k));
                                    
//#line 32 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
if (t78238) {
                                        
//#line 33 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new NQueensParAsync.Board.$Closure$64(this,
                                                                                                                                                                                                     q,
                                                                                                                                                                                                     k,(java.lang.Class<?>) null))));
                                    }
                                }
                            }
                            {
                                
//#line 31 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78233 =
                                  i78191;
                                
//#line 31 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78234 =
                                  ((t78233) + (((int)(1))));
                                
//#line 31 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
i78191 = t78234;
                            }
                        }
                    }
                }
                
                
//#line 37 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
public void
                                                                                   search(
                                                                                   ){
                    
//#line 38 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final x10.array.Array<x10.core.Int> t78240 =
                      ((x10.array.Array)(q));
                    
//#line 38 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78242 =
                      ((x10.array.Array<x10.core.Int>)t78240).
                        size;
                    
//#line 38 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final NQueensParAsync t78241 =
                      this.
                        out$;
                    
//#line 38 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78243 =
                      t78241.
                        N;
                    
//#line 38 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final boolean t78244 =
                      ((int) t78242) ==
                    ((int) t78243);
                    
//#line 38 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
if (t78244) {
                        
//#line 39 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
x10.lang.Runtime.<x10.core.Int>makeOffer__0x10$lang$Runtime$$T(x10.rtt.Types.INT, x10.core.Int.$box(1));
                        
//#line 40 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
return;
                    }
                    
//#line 42 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final NQueensParAsync t78245 =
                      this.
                        out$;
                    
//#line 42 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78246 =
                      t78245.
                        N;
                    
//#line 42 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78247 =
                      ((t78246) - (((int)(1))));
                    
//#line 42 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
this.search((int)(0),
                                                                                                 (int)(t78247));
                }
                
                
//#line 10 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final public NQueensParAsync.Board
                                                                                   NQueensParAsync$Board$$NQueensParAsync$Board$this(
                                                                                   ){
                    
//#line 10 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
return NQueensParAsync.Board.this;
                }
                
                
//#line 10 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final public NQueensParAsync
                                                                                   NQueensParAsync$Board$$NQueensParAsync$this(
                                                                                   ){
                    
//#line 10 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final NQueensParAsync t78248 =
                      this.
                        out$;
                    
//#line 10 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
return t78248;
                }
                
                public static class $Closure$62 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$62.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$62> $RTT = new x10.rtt.StaticFunType<$Closure$62>(
                    /* base class */$Closure$62.class
                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.INT), x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$62 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$62.class + " calling"); } 
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$62 $_obj = new $Closure$62((java.lang.System[]) null);
                        $deserializer.record_reference($_obj);
                        return $_deserialize_body($_obj, $deserializer);
                        
                    }
                    
                    public short $_get_serialization_id() {
                    
                         return $_serialization_id;
                        
                    }
                    
                    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$62(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                    return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1)));
                    }
                    
                        
                        public int
                          $apply$O(
                          final int id$68485){
                            
//#line 13 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
return 0;
                        }
                        
                        // creation method for java code
                        public static NQueensParAsync.Board.$Closure$62 $make(){return new $Closure$62();}
                        public $Closure$62() { {
                                                      
                                                  }}
                        
                    }
                    
                public static class $Closure$63 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$63.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$63> $RTT = new x10.rtt.StaticFunType<$Closure$63>(
                    /* base class */$Closure$63.class
                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.INT), x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$63 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$63.class + " calling"); } 
                        $_obj.n = $deserializer.readInt();
                        x10.array.Array old = (x10.array.Array) $deserializer.readRef();
                        $_obj.old = old;
                        $_obj.newItem = $deserializer.readInt();
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$63 $_obj = new $Closure$63((java.lang.System[]) null);
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
                    public $Closure$63(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                    return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1)));
                    }
                    
                        
                        public int
                          $apply$O(
                          final int i){
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final boolean t78209 =
                              ((i) < (((int)(this.
                                               n))));
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
int t78210 =
                               0;
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
if (t78209) {
                                
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
t78210 = x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)this.
                                                                                                                                                                old).$apply$G((int)(i)));
                            } else {
                                
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
t78210 = this.
                                                                                                            newItem;
                            }
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78211 =
                              t78210;
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
return t78211;
                        }
                        
                        public int n;
                        public x10.array.Array<x10.core.Int> old;
                        public int newItem;
                        
                        // creation method for java code
                        public static NQueensParAsync.Board.$Closure$63 $make(final int n,
                                                                              final x10.array.Array<x10.core.Int> old,
                                                                              final int newItem,java.lang.Class<?> $dummy0){return new $Closure$63(n,old,newItem,(java.lang.Class<?>) null);}
                        public $Closure$63(final int n,
                                           final x10.array.Array<x10.core.Int> old,
                                           final int newItem,java.lang.Class<?> $dummy0) { {
                                                                                                  this.n = n;
                                                                                                  this.old = ((x10.array.Array)(old));
                                                                                                  this.newItem = newItem;
                                                                                              }}
                        
                    }
                    
                public static class $Closure$64 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$64.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$64> $RTT = new x10.rtt.StaticVoidFunType<$Closure$64>(
                    /* base class */$Closure$64.class
                    , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$64 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$64.class + " calling"); } 
                        NQueensParAsync.Board out$$ = (NQueensParAsync.Board) $deserializer.readRef();
                        $_obj.out$$ = out$$;
                        x10.array.Array q = (x10.array.Array) $deserializer.readRef();
                        $_obj.q = q;
                        $_obj.k = $deserializer.readInt();
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$64 $_obj = new $Closure$64((java.lang.System[]) null);
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
                        if (q instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.q);
                        } else {
                        $serializer.write(this.q);
                        }
                        $serializer.write(this.k);
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$64(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    
                        
                        public void
                          $apply(
                          ){
                            
//#line 33 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final NQueensParAsync t78235 =
                              this.
                                out$$.
                                out$;
                            
//#line 33 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final x10.array.Array<x10.core.Int> t78236 =
                              ((x10.array.Array)(this.
                                                   q));
                            
//#line 33 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final NQueensParAsync.Board t78237 =
                              ((NQueensParAsync.Board)(new NQueensParAsync.Board((java.lang.System[]) null).$init(t78235,
                                                                                                                  ((x10.array.Array)(t78236)),
                                                                                                                  this.
                                                                                                                    k,(java.lang.Class<?>) null)));
                            
//#line 33 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
t78237.search();
                        }
                        
                        public NQueensParAsync.Board out$$;
                        public x10.array.Array<x10.core.Int> q;
                        public int k;
                        
                        // creation method for java code
                        public static NQueensParAsync.Board.$Closure$64 $make(final NQueensParAsync.Board out$$,
                                                                              final x10.array.Array<x10.core.Int> q,
                                                                              final int k,java.lang.Class<?> $dummy0){return new $Closure$64(out$$,q,k,(java.lang.Class<?>) null);}
                        public $Closure$64(final NQueensParAsync.Board out$$,
                                           final x10.array.Array<x10.core.Int> q,
                                           final int k,java.lang.Class<?> $dummy0) { {
                                                                                            this.out$$ = out$$;
                                                                                            this.q = ((x10.array.Array)(q));
                                                                                            this.k = k;
                                                                                        }}
                        
                    }
                    
                
                }
                
                
//#line 46 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
public static NQueensParAsync.Anonymous$1237 sum;
                
                
//#line 50 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
                private static final long serialVersionUID = 1L;
                public static void main(java.lang.String[] args) {
                // start native runtime
                new $Main().start(args);
                }
                
                // called by native runtime inside main x10 thread
                public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
                // call the original app-main method
                NQueensParAsync.main(args);
                }
                }
                
                // the original app-main method
                public static void main(final x10.array.Array<java.lang.String> args) {
                    
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78249 =
                      ((x10.array.Array<java.lang.String>)args).
                        size;
                    
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final boolean t78251 =
                      ((t78249) > (((int)(0))));
                    
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
int t78252 =
                       0;
                    
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
if (t78251) {
                        
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final java.lang.String t78250 =
                          ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
                        
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
t78252 = java.lang.Integer.parseInt(t78250);
                    } else {
                        
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
t78252 = 12;
                    }
                    
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int n =
                      t78252;
                    
//#line 52 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final x10.io.Printer t78253 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 52 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final java.lang.String t78254 =
                      (("N=") + ((x10.core.Int.$box(n))));
                    
//#line 52 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
t78253.println(((java.lang.String)(t78254)));
                    
//#line 54 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final NQueensParAsync nq =
                      ((NQueensParAsync)(new NQueensParAsync((java.lang.System[]) null).$init(((int)(n)))));
                    
//#line 55 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final long t78255 =
                      x10.lang.System.nanoTime$O();
                    
//#line 55 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
long start =
                      (-(t78255));
                    
//#line 56 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int count;
                    {
                        
//#line 56 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final x10.lang.FinishState x10$__var24 =
                          ((x10.lang.FinishState)(x10.lang.Runtime.<x10.core.Int>startCollectingFinish__0$1x10$lang$Runtime$$T$2(x10.rtt.Types.INT, ((x10.lang.Reducible)(NQueensParAsync.getInitialized$sum())))));
                        
//#line 56 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
try {try {{
                            {
                                
//#line 56 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
nq.start();
                            }
                        }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__20__) {
                            
//#line 56 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__20__)));
                            
//#line 56 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
throw new x10.lang.RuntimeException();
                        }finally {{
                             
//#line 56 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
count = x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int>stopCollectingFinish$G(x10.rtt.Types.INT, ((x10.lang.FinishState)(x10$__var24))));
                         }}
                        }
                    
//#line 57 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final x10.array.Array<x10.core.Int> t78256 =
                      ((x10.array.Array)(NQueensParAsync.expectedSolutions));
                    
//#line 57 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78257 =
                      nq.
                        N;
                    
//#line 57 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78258 =
                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t78256).$apply$G((int)(t78257)));
                    
//#line 57 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final boolean result =
                      ((int) count) ==
                    ((int) t78258);
                    
//#line 58 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final long t78259 =
                      start;
                    
//#line 58 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final long t78260 =
                      x10.lang.System.nanoTime$O();
                    
//#line 58 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final long t78261 =
                      ((t78259) + (((long)(t78260))));
                    
//#line 58 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
start = t78261;
                    
//#line 59 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final long t78262 =
                      start;
                    
//#line 59 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final long t78263 =
                      ((long)(((int)(1000000))));
                    
//#line 59 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final long t78264 =
                      ((t78262) / (((long)(t78263))));
                    
//#line 59 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
start = t78264;
                    
//#line 60 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final x10.io.Printer t78276 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 60 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78265 =
                      nq.
                        N;
                    
//#line 60 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final java.lang.String t78266 =
                      (("NQueensParAsync ") + ((x10.core.Int.$box(t78265))));
                    
//#line 60 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final java.lang.String t78267 =
                      ((t78266) + (") has "));
                    
//#line 60 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final java.lang.String t78268 =
                      ((t78267) + ((x10.core.Int.$box(count))));
                    
//#line 60 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final java.lang.String t78270 =
                      ((t78268) + (" solutions"));
                    
//#line 62 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
java.lang.String t78269 =
                       null;
                    
//#line 62 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
if (result) {
                        
//#line 62 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
t78269 = " (ok)";
                    } else {
                        
//#line 62 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
t78269 = " (wrong)";
                    }
                    
//#line 62 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final java.lang.String t78271 =
                      t78269;
                    
//#line 60 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final java.lang.String t78272 =
                      ((t78270) + (t78271));
                    
//#line 60 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final java.lang.String t78273 =
                      ((t78272) + (" (t="));
                    
//#line 62 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final long t78274 =
                      start;
                    
//#line 60 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final java.lang.String t78275 =
                      ((t78273) + ((x10.core.Long.$box(t78274))));
                    
//#line 60 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final java.lang.String t78277 =
                      ((t78275) + ("ms)."));
                    
//#line 60 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
t78276.println(((java.lang.String)(t78277)));
                    }
                
                
//#line 1 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final public NQueensParAsync
                                                                                  NQueensParAsync$$NQueensParAsync$this(
                                                                                  ){
                    
//#line 1 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
return NQueensParAsync.this;
                }
                
                
//#line 46 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final public static class Anonymous$1237 extends x10.core.Ref implements x10.lang.Reducible, x10.x10rt.X10JavaSerializable
                                                                                 {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, Anonymous$1237.class);
                    
                    public static final x10.rtt.RuntimeType<Anonymous$1237> $RTT = new x10.rtt.NamedType<Anonymous$1237>(
                    "NQueensParAsync.Anonymous$1237", /* base class */Anonymous$1237.class
                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.lang.Reducible.$RTT, x10.rtt.Types.INT), x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body(Anonymous$1237 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + Anonymous$1237.class + " calling"); } 
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        Anonymous$1237 $_obj = new Anonymous$1237((java.lang.System[]) null);
                        $deserializer.record_reference($_obj);
                        return $_deserialize_body($_obj, $deserializer);
                        
                    }
                    
                    public short $_get_serialization_id() {
                    
                         return $_serialization_id;
                        
                    }
                    
                    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                        
                    }
                    
                    // constructor just for allocation
                    public Anonymous$1237(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    // dispatcher for method abstract public x10.lang.Reducible.operator()(T,T):T
                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
                    return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1), x10.core.Int.$unbox(a2)));
                    }
                    // bridge for method abstract public x10.lang.Reducible.zero():T
                    public x10.core.Int
                      zero$G(){return x10.core.Int.$box(zero$O());}
                    
                        
                        
//#line 47 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
public int
                                                                                           zero$O(
                                                                                           ){
                            
//#line 47 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
return 0;
                        }
                        
                        
//#line 48 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
public int
                                                                                           $apply$O(
                                                                                           final int i,
                                                                                           final int j){
                            
//#line 48 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
final int t78278 =
                              ((i) + (((int)(j))));
                            
//#line 48 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
return t78278;
                        }
                        
                        
//#line 46 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"
// creation method for java code
                        public static NQueensParAsync.Anonymous$1237 $make(){return new NQueensParAsync.Anonymous$1237((java.lang.System[]) null).$init();}
                        
                        // constructor for non-virtual call
                        final public NQueensParAsync.Anonymous$1237 NQueensParAsync$Anonymous$1237$$init$S() { {
                                                                                                                      
//#line 46 "C:/eclipsews/pppp11/pppp11/src/NQueensParAsync.x10"

                                                                                                                  }
                                                                                                                  return this;
                                                                                                                  }
                        
                        // constructor
                        public NQueensParAsync.Anonymous$1237 $init(){return NQueensParAsync$Anonymous$1237$$init$S();}
                        
                    
                }
                
                public static int fieldId$sum;
                final public static x10.core.concurrent.AtomicInteger initStatus$sum = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
                
                public static x10.array.Array<x10.core.Int>
                  getInitialized$expectedSolutions(
                  ){
                    return NQueensParAsync.expectedSolutions;
                }
                
                public static void
                  getDeserialized$sum(
                  byte[] buf){
                    if (((boolean) x10.x10rt.X10JavaSerializable.CUSTOM_JAVA_SERIALIZATION) ==
                          ((boolean) true)) {
                        NQueensParAsync.sum = ((NQueensParAsync.Anonymous$1237)(x10.runtime.impl.java.InitDispatcher.deserializeField(((byte[])(buf)))));
                    } else {
                        NQueensParAsync.sum = ((NQueensParAsync.Anonymous$1237)(x10.rtt.Types.<NQueensParAsync.Anonymous$1237> cast(x10.runtime.impl.java.InitDispatcher.deserializeField(((byte[])(buf))),NQueensParAsync.Anonymous$1237.$RTT)));
                    }
                    NQueensParAsync.initStatus$sum.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                }
                
                public static NQueensParAsync.Anonymous$1237
                  getInitialized$sum(
                  ){
                    if (((int) x10.lang.Runtime.hereInt$O()) ==
                        ((int) 0)) {
                        if (NQueensParAsync.initStatus$sum.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED),
                                                                         (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                            NQueensParAsync.sum = ((NQueensParAsync.Anonymous$1237)(new NQueensParAsync.Anonymous$1237((java.lang.System[]) null).$init()));
                            if (((boolean) x10.x10rt.X10JavaSerializable.CUSTOM_JAVA_SERIALIZATION) ==
                                  ((boolean) true)) {
                                x10.runtime.impl.java.InitDispatcher.broadcastStaticField(((java.lang.Object)(NQueensParAsync.sum)),
                                                                                          (int)(NQueensParAsync.fieldId$sum));
                            } else {
                                x10.runtime.impl.java.InitDispatcher.broadcastStaticField(((java.lang.Object)(NQueensParAsync.sum)),
                                                                                          (int)(NQueensParAsync.fieldId$sum));
                            }
                            NQueensParAsync.initStatus$sum.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                            x10.runtime.impl.java.InitDispatcher.lockInitialized();
                            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                        }
                    }
                    if (((int) NQueensParAsync.initStatus$sum.get()) !=
                        ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                        x10.runtime.impl.java.InitDispatcher.lockInitialized();
                        while (((int) NQueensParAsync.initStatus$sum.get()) !=
                               ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                            x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                        }
                        x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    }
                    return NQueensParAsync.sum;
                }
                
                static {
                           NQueensParAsync.fieldId$sum = x10.runtime.impl.java.InitDispatcher.addInitializer(((java.lang.String)("NQueensParAsync")),
                                                                                                             ((java.lang.String)("sum")));
                       }
                
            }
            