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
        
    }
    
    // constructor just for allocation
    public NQueensPar(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
//#line 2 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final public static x10.array.Array<x10.core.Int> expectedSolutions = ((x10.array.Array)(x10.core.ArrayFactory.<x10.core.Int> makeArrayFromJavaArray(x10.rtt.Types.INT, new int[] {0, 1, 0, 0, 2, 10, 4, 40, 92, 352, 724, 2680, 14200, 73712, 365596, 2279184, 14772512})));
        
//#line 5 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
public int N;
        
//#line 5 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
public int P;
        
        
//#line 6 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
// creation method for java code
        public static NQueensPar $make(final int N,
                                       final int P){return new NQueensPar((java.lang.System[]) null).$init(N,P);}
        
        // constructor for non-virtual call
        final public NQueensPar NQueensPar$$init$S(final int N,
                                                   final int P) { {
                                                                         {
                                                                             
//#line 6 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"

                                                                         }
                                                                         {
                                                                             {
                                                                                 
//#line 6 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"

                                                                             }
                                                                             {
                                                                                 
                                                                             }
                                                                         }
                                                                         
//#line 6 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
this.N = N;
                                                                         
//#line 6 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
this.P = P;
                                                                     }
                                                                     return this;
                                                                     }
        
        // constructor
        public NQueensPar $init(final int N,
                                final int P){return NQueensPar$$init$S(N,P);}
        
        
        
//#line 8 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
public void
                                                                     start(
                                                                     ){
            
//#line 9 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final NQueensPar.Board t78842 =
              ((NQueensPar.Board)(new NQueensPar.Board((java.lang.System[]) null).$init(this)));
            
//#line 9 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
t78842.search();
        }
        
        
//#line 15 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
public static x10.array.Array<x10.array.Region>
                                                                      block(
                                                                      final x10.array.Region R,
                                                                      final int P){
            
//#line 16 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
assert ((P) >= (((int)(0))));
            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> t78843 =
              R.min();
            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int low =
              x10.core.Int.$unbox(((x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int>)t78843).$apply(x10.core.Int.$box(0),x10.rtt.Types.INT));
            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> t78844 =
              R.max();
            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int high =
              x10.core.Int.$unbox(((x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int>)t78844).$apply(x10.core.Int.$box(0),x10.rtt.Types.INT));
            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78845 =
              ((high) - (((int)(low))));
            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int count =
              ((t78845) + (((int)(1))));
            
//#line 18 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int baseSize =
              ((count) / (((int)(P))));
            
//#line 18 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78846 =
              ((baseSize) * (((int)(P))));
            
//#line 18 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int extra =
              ((count) - (((int)(t78846))));
            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.array.Region> t78859 =
              ((x10.core.fun.Fun_0_1)(new NQueensPar.$Closure$68(baseSize,
                                                                 low,
                                                                 extra)));
            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.array.Array<x10.array.Region> t78860 =
              ((x10.array.Array)(new x10.array.Array<x10.array.Region>((java.lang.System[]) null, x10.array.Region.$RTT).$init(((int)(P)),
                                                                                                                               ((x10.core.fun.Fun_0_1)(t78859)),(java.lang.Class<?>[][][][]) null)));
            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
return t78860;
        }
        
        
//#line 25 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
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
            
                
//#line 1 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
public NQueensPar out$;
                
//#line 27 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
public x10.array.Array<x10.core.Int> q;
                
                
//#line 29 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
// creation method for java code
                public static NQueensPar.Board $make(final NQueensPar out$){return new NQueensPar.Board((java.lang.System[]) null).$init(out$);}
                
                // constructor for non-virtual call
                final public NQueensPar.Board NQueensPar$Board$$init$S(final NQueensPar out$) { {
                                                                                                       {
                                                                                                           
//#line 29 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"

                                                                                                       }
                                                                                                       
//#line 1 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
this.out$ = out$;
                                                                                                       {
                                                                                                           {
                                                                                                               
//#line 29 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"

                                                                                                           }
                                                                                                           {
                                                                                                               
                                                                                                           }
                                                                                                       }
                                                                                                       
//#line 30 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> t78861 =
                                                                                                         ((x10.core.fun.Fun_0_1)(new NQueensPar.Board.$Closure$65()));
                                                                                                       
//#line 30 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.array.Array<x10.core.Int> t78862 =
                                                                                                         ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(0)),
                                                                                                                                                                                                                  ((x10.core.fun.Fun_0_1)(t78861)),(java.lang.Class<?>[][][][]) null)));
                                                                                                       
//#line 30 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
this.q = ((x10.array.Array)(t78862));
                                                                                                   }
                                                                                                   return this;
                                                                                                   }
                
                // constructor
                public NQueensPar.Board $init(final NQueensPar out$){return NQueensPar$Board$$init$S(out$);}
                
                
                
//#line 33 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
// creation method for java code
                public static NQueensPar.Board $make(final NQueensPar out$,
                                                     final x10.array.Array<x10.core.Int> old,
                                                     final int newItem,java.lang.Class<?> $dummy0){return new NQueensPar.Board((java.lang.System[]) null).$init(out$,old,newItem,(java.lang.Class<?>) null);}
                
                // constructor for non-virtual call
                final public NQueensPar.Board NQueensPar$Board$$init$S(final NQueensPar out$,
                                                                       final x10.array.Array<x10.core.Int> old,
                                                                       final int newItem,java.lang.Class<?> $dummy0) { {
                                                                                                                              {
                                                                                                                                  
//#line 33 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"

                                                                                                                              }
                                                                                                                              
//#line 1 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
this.out$ = out$;
                                                                                                                              {
                                                                                                                                  {
                                                                                                                                      
//#line 33 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"

                                                                                                                                  }
                                                                                                                                  {
                                                                                                                                      
                                                                                                                                  }
                                                                                                                              }
                                                                                                                              
//#line 34 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int n =
                                                                                                                                ((x10.array.Array<x10.core.Int>)old).
                                                                                                                                  size;
                                                                                                                              
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78866 =
                                                                                                                                ((n) + (((int)(1))));
                                                                                                                              
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> t78867 =
                                                                                                                                ((x10.core.fun.Fun_0_1)(new NQueensPar.Board.$Closure$66(n,
                                                                                                                                                                                         old,
                                                                                                                                                                                         newItem,(java.lang.Class<?>) null)));
                                                                                                                              
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.array.Array<x10.core.Int> t78868 =
                                                                                                                                ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(t78866,
                                                                                                                                                                                                                                         ((x10.core.fun.Fun_0_1)(t78867)),(java.lang.Class<?>[][][][]) null)));
                                                                                                                              
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
this.q = ((x10.array.Array)(t78868));
                                                                                                                          }
                                                                                                                          return this;
                                                                                                                          }
                
                // constructor
                public NQueensPar.Board $init(final NQueensPar out$,
                                              final x10.array.Array<x10.core.Int> old,
                                              final int newItem,java.lang.Class<?> $dummy0){return NQueensPar$Board$$init$S(out$,old,newItem, $dummy0);}
                
                
                
//#line 38 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
public boolean
                                                                              safe$O(
                                                                              final int j){
                    
//#line 39 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.array.Array<x10.core.Int> t78869 =
                      ((x10.array.Array)(q));
                    
//#line 39 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int n =
                      ((x10.array.Array<x10.core.Int>)t78869).
                        size;
                    {
                        
//#line 40 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
int k =
                          0;
                        
//#line 40 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
for (;
                                                                                         true;
                                                                                         ) {
                            
//#line 40 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78871 =
                              k;
                            
//#line 40 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final boolean t78887 =
                              ((t78871) < (((int)(n))));
                            
//#line 40 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
if (!(t78887)) {
                                
//#line 40 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
break;
                            }
                            {
                                
//#line 41 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.array.Array<x10.core.Int> t78874 =
                                  ((x10.array.Array)(q));
                                
//#line 41 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78875 =
                                  k;
                                
//#line 41 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78876 =
                                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t78874).$apply$G((int)(t78875)));
                                
//#line 41 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
boolean t78885 =
                                  ((int) j) ==
                                ((int) t78876);
                                
//#line 41 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
if (!(t78885)) {
                                    
//#line 41 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78877 =
                                      k;
                                    
//#line 41 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78878 =
                                      ((n) - (((int)(t78877))));
                                    
//#line 41 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78883 =
                                      x10.lang.Math.abs$O((int)(t78878));
                                    
//#line 41 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.array.Array<x10.core.Int> t78879 =
                                      ((x10.array.Array)(q));
                                    
//#line 41 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78880 =
                                      k;
                                    
//#line 41 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78881 =
                                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t78879).$apply$G((int)(t78880)));
                                    
//#line 41 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78882 =
                                      ((j) - (((int)(t78881))));
                                    
//#line 41 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78884 =
                                      x10.lang.Math.abs$O((int)(t78882));
                                    
//#line 41 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
t78885 = ((int) t78883) ==
                                    ((int) t78884);
                                }
                                
//#line 41 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final boolean t78886 =
                                  t78885;
                                
//#line 41 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
if (t78886) {
                                    
//#line 42 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
return false;
                                }
                            }
                            {
                                
//#line 40 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78872 =
                                  k;
                                
//#line 40 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78873 =
                                  ((t78872) + (((int)(1))));
                                
//#line 40 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
k = t78873;
                            }
                        }
                    }
                    
//#line 44 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
return true;
                }
                
                
//#line 50 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
public void
                                                                              search(
                                                                              final int low,
                                                                              final int high){
                    
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int i78808min78809 =
                      low;
                    
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int i78808max78810 =
                      high;
                    {
                        
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
int i78808 =
                          i78808min78809;
                        
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
for (;
                                                                                         true;
                                                                                         ) {
                            
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78889 =
                              i78808;
                            
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final boolean t78896 =
                              ((t78889) <= (((int)(i78808max78810))));
                            
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
if (!(t78896)) {
                                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
break;
                            }
                            {
                                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int k =
                                  i78808;
                                {
                                    
//#line 52 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final boolean t78895 =
                                      this.safe$O((int)(k));
                                    
//#line 52 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
if (t78895) {
                                        
//#line 53 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final NQueensPar t78892 =
                                          this.
                                            out$;
                                        
//#line 53 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.array.Array<x10.core.Int> t78893 =
                                          ((x10.array.Array)(q));
                                        
//#line 53 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final NQueensPar.Board t78894 =
                                          ((NQueensPar.Board)(new NQueensPar.Board((java.lang.System[]) null).$init(t78892,
                                                                                                                    ((x10.array.Array)(t78893)),
                                                                                                                    ((int)(k)),(java.lang.Class<?>) null)));
                                        
//#line 53 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
t78894.search();
                                    }
                                }
                            }
                            {
                                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78890 =
                                  i78808;
                                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78891 =
                                  ((t78890) + (((int)(1))));
                                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
i78808 = t78891;
                            }
                        }
                    }
                }
                
                
//#line 56 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
public void
                                                                              search(
                                                                              ){
                    
//#line 57 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.array.Array<x10.core.Int> t78897 =
                      ((x10.array.Array)(q));
                    
//#line 57 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78899 =
                      ((x10.array.Array<x10.core.Int>)t78897).
                        size;
                    
//#line 57 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final NQueensPar t78898 =
                      this.
                        out$;
                    
//#line 57 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78900 =
                      t78898.
                        N;
                    
//#line 57 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final boolean t78901 =
                      ((int) t78899) ==
                    ((int) t78900);
                    
//#line 57 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
if (t78901) {
                        
//#line 58 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
x10.lang.Runtime.<x10.core.Int>makeOffer__0x10$lang$Runtime$$T(x10.rtt.Types.INT, x10.core.Int.$box(1));
                        
//#line 59 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
return;
                    }
                    
//#line 61 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.array.Array<x10.core.Int> t78902 =
                      ((x10.array.Array)(q));
                    
//#line 61 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78903 =
                      ((x10.array.Array<x10.core.Int>)t78902).
                        size;
                    
//#line 61 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final boolean t78929 =
                      ((int) t78903) ==
                    ((int) 0);
                    
//#line 61 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
if (t78929) {
                        
//#line 62 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final NQueensPar t78904 =
                          this.
                            out$;
                        
//#line 62 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78905 =
                          t78904.
                            N;
                        
//#line 62 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78906 =
                          ((t78905) - (((int)(1))));
                        
//#line 62 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.lang.IntRange t78907 =
                          ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(t78906)))));
                        
//#line 62 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.array.Region t78909 =
                          ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t78907)))));
                        
//#line 62 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final NQueensPar t78908 =
                          this.
                            out$;
                        
//#line 62 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78910 =
                          t78908.
                            P;
                        
//#line 62 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.array.Array<x10.array.Region> R =
                          ((x10.array.Array)(NQueensPar.block(((x10.array.Region)(t78909)),
                                                              (int)(t78910))));
                        {
                            
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final NQueensPar t78911 =
                              this.
                                out$;
                            
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78912 =
                              t78911.
                                P;
                            
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78913 =
                              ((t78912) - (((int)(1))));
                            
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.lang.IntRange t78914 =
                              ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(t78913)))));
                            
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.array.Region p78824 =
                              ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t78914)))));
                            
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int q78825min78826 =
                              p78824.min$O((int)(0));
                            
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int q78825max78827 =
                              p78824.max$O((int)(0));
                            {
                                
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
int q78825 =
                                  q78825min78826;
                                
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
for (;
                                                                                                 true;
                                                                                                 ) {
                                    
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78916 =
                                      q78825;
                                    
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final boolean t78925 =
                                      ((t78916) <= (((int)(q78825max78827))));
                                    
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
if (!(t78925)) {
                                        
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
break;
                                    }
                                    {
                                        
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int q =
                                          q78825;
                                        {
                                            
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new NQueensPar.Board.$Closure$67(this,
                                                                                                                                                                                               R,
                                                                                                                                                                                               q,(java.lang.Class<?>) null))));
                                        }
                                    }
                                    {
                                        
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78917 =
                                          q78825;
                                        
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78918 =
                                          ((t78917) + (((int)(1))));
                                        
//#line 63 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
q78825 = t78918;
                                    }
                                }
                            }
                        }
                    } else {
                        
//#line 65 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final NQueensPar t78926 =
                          this.
                            out$;
                        
//#line 65 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78927 =
                          t78926.
                            N;
                        
//#line 65 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78928 =
                          ((t78927) - (((int)(1))));
                        
//#line 65 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
this.search((int)(0),
                                                                                                (int)(t78928));
                    }
                }
                
                
//#line 25 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final public NQueensPar.Board
                                                                              NQueensPar$Board$$NQueensPar$Board$this(
                                                                              ){
                    
//#line 25 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
return NQueensPar.Board.this;
                }
                
                
//#line 25 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final public NQueensPar
                                                                              NQueensPar$Board$$NQueensPar$this(
                                                                              ){
                    
//#line 25 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final NQueensPar t78930 =
                      this.
                        out$;
                    
//#line 25 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
return t78930;
                }
                
                public static class $Closure$65 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$65.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$65> $RTT = new x10.rtt.StaticFunType<$Closure$65>(
                    /* base class */$Closure$65.class
                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.INT), x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$65 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$65.class + " calling"); } 
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$65 $_obj = new $Closure$65((java.lang.System[]) null);
                        $deserializer.record_reference($_obj);
                        return $_deserialize_body($_obj, $deserializer);
                        
                    }
                    
                    public short $_get_serialization_id() {
                    
                         return $_serialization_id;
                        
                    }
                    
                    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$65(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                    return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1)));
                    }
                    
                        
                        public int
                          $apply$O(
                          final int id$68486){
                            
//#line 30 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
return 0;
                        }
                        
                        // creation method for java code
                        public static NQueensPar.Board.$Closure$65 $make(){return new $Closure$65();}
                        public $Closure$65() { {
                                                      
                                                  }}
                        
                    }
                    
                public static class $Closure$66 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$66.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$66> $RTT = new x10.rtt.StaticFunType<$Closure$66>(
                    /* base class */$Closure$66.class
                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.INT), x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$66 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$66.class + " calling"); } 
                        $_obj.n = $deserializer.readInt();
                        x10.array.Array old = (x10.array.Array) $deserializer.readRef();
                        $_obj.old = old;
                        $_obj.newItem = $deserializer.readInt();
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$66 $_obj = new $Closure$66((java.lang.System[]) null);
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
                    public $Closure$66(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                    return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1)));
                    }
                    
                        
                        public int
                          $apply$O(
                          final int i){
                            
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final boolean t78863 =
                              ((i) < (((int)(this.
                                               n))));
                            
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
int t78864 =
                               0;
                            
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
if (t78863) {
                                
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
t78864 = x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)this.
                                                                                                                                                           old).$apply$G((int)(i)));
                            } else {
                                
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
t78864 = this.
                                                                                                       newItem;
                            }
                            
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78865 =
                              t78864;
                            
//#line 35 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
return t78865;
                        }
                        
                        public int n;
                        public x10.array.Array<x10.core.Int> old;
                        public int newItem;
                        
                        // creation method for java code
                        public static NQueensPar.Board.$Closure$66 $make(final int n,
                                                                         final x10.array.Array<x10.core.Int> old,
                                                                         final int newItem,java.lang.Class<?> $dummy0){return new $Closure$66(n,old,newItem,(java.lang.Class<?>) null);}
                        public $Closure$66(final int n,
                                           final x10.array.Array<x10.core.Int> old,
                                           final int newItem,java.lang.Class<?> $dummy0) { {
                                                                                                  this.n = n;
                                                                                                  this.old = ((x10.array.Array)(old));
                                                                                                  this.newItem = newItem;
                                                                                              }}
                        
                    }
                    
                public static class $Closure$67 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$67.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$67> $RTT = new x10.rtt.StaticVoidFunType<$Closure$67>(
                    /* base class */$Closure$67.class
                    , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$67 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$67.class + " calling"); } 
                        NQueensPar.Board out$$ = (NQueensPar.Board) $deserializer.readRef();
                        $_obj.out$$ = out$$;
                        x10.array.Array R = (x10.array.Array) $deserializer.readRef();
                        $_obj.R = R;
                        $_obj.q = $deserializer.readInt();
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$67 $_obj = new $Closure$67((java.lang.System[]) null);
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
                        if (R instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.R);
                        } else {
                        $serializer.write(this.R);
                        }
                        $serializer.write(this.q);
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$67(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    
                        
                        public void
                          $apply(
                          ){
                            
//#line 64 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.array.Region t78919 =
                              ((x10.array.Region)(((x10.array.Array<x10.array.Region>)this.
                                                                                        R).$apply$G((int)(this.
                                                                                                            q))));
                            
//#line 64 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> t78920 =
                              t78919.min();
                            
//#line 64 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78923 =
                              x10.core.Int.$unbox(((x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int>)t78920).$apply(x10.core.Int.$box(0),x10.rtt.Types.INT));
                            
//#line 64 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.array.Region t78921 =
                              ((x10.array.Region)(((x10.array.Array<x10.array.Region>)this.
                                                                                        R).$apply$G((int)(this.
                                                                                                            q))));
                            
//#line 64 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> t78922 =
                              t78921.max();
                            
//#line 64 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78924 =
                              x10.core.Int.$unbox(((x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int>)t78922).$apply(x10.core.Int.$box(0),x10.rtt.Types.INT));
                            
//#line 64 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
this.
                                                                                          out$$.search((int)(t78923),
                                                                                                       (int)(t78924));
                        }
                        
                        public NQueensPar.Board out$$;
                        public x10.array.Array<x10.array.Region> R;
                        public int q;
                        
                        // creation method for java code
                        public static NQueensPar.Board.$Closure$67 $make(final NQueensPar.Board out$$,
                                                                         final x10.array.Array<x10.array.Region> R,
                                                                         final int q,java.lang.Class<?> $dummy0){return new $Closure$67(out$$,R,q,(java.lang.Class<?>) null);}
                        public $Closure$67(final NQueensPar.Board out$$,
                                           final x10.array.Array<x10.array.Region> R,
                                           final int q,java.lang.Class<?> $dummy0) { {
                                                                                            this.out$$ = out$$;
                                                                                            this.R = ((x10.array.Array)(R));
                                                                                            this.q = q;
                                                                                        }}
                        
                    }
                    
                
                }
                
                
//#line 69 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
public static NQueensPar.Anonymous$1987 reducer;
                
                
//#line 73 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
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
                    
//#line 74 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78931 =
                      ((x10.array.Array<java.lang.String>)args).
                        size;
                    
//#line 74 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final boolean t78933 =
                      ((t78931) > (((int)(0))));
                    
//#line 74 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
int t78934 =
                       0;
                    
//#line 74 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
if (t78933) {
                        
//#line 74 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final java.lang.String t78932 =
                          ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
                        
//#line 74 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
t78934 = java.lang.Integer.parseInt(t78932);
                    } else {
                        
//#line 74 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
t78934 = 12;
                    }
                    
//#line 74 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int n =
                      t78934;
                    
//#line 75 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.io.Printer t78935 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 75 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final java.lang.String t78936 =
                      (("N=") + ((x10.core.Int.$box(n))));
                    
//#line 75 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
t78935.println(((java.lang.String)(t78936)));
                    
//#line 77 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int x;
                    {
                        
//#line 77 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.lang.FinishState x10$__var25 =
                          ((x10.lang.FinishState)(x10.lang.Runtime.<x10.core.Int>startCollectingFinish__0$1x10$lang$Runtime$$T$2(x10.rtt.Types.INT, ((x10.lang.Reducible)(NQueensPar.getInitialized$reducer())))));
                        
//#line 77 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
try {try {{
                            {
                                
//#line 77 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final NQueensPar t78937 =
                                  ((NQueensPar)(new NQueensPar((java.lang.System[]) null).$init(((int)(12)),
                                                                                                ((int)(1)))));
                                
//#line 77 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
t78937.start();
                            }
                        }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__21__) {
                            
//#line 77 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__21__)));
                            
//#line 77 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
throw new x10.lang.RuntimeException();
                        }finally {{
                             
//#line 77 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
x = x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int>stopCollectingFinish$G(x10.rtt.Types.INT, ((x10.lang.FinishState)(x10$__var25))));
                         }}
                        }
                    
//#line 78 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.array.Array<x10.core.Int> ps =
                      ((x10.array.Array)(x10.core.ArrayFactory.<x10.core.Int> makeArrayFromJavaArray(x10.rtt.Types.INT, new int[] {1, 2, 4, 8})));
                    {
                        
//#line 79 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
int i =
                          0;
                        
//#line 79 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
for (;
                                                                                         true;
                                                                                         ) {
                            
//#line 79 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78939 =
                              i;
                            
//#line 79 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78940 =
                              ((x10.array.Array<x10.core.Int>)ps).
                                size;
                            
//#line 79 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final boolean t78977 =
                              ((t78939) < (((int)(t78940))));
                            
//#line 79 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
if (!(t78977)) {
                                
//#line 79 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
break;
                            }
                            {
                                
//#line 80 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.io.Printer t78946 =
                                  ((x10.io.Printer)(x10.io.Console.OUT));
                                
//#line 80 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78943 =
                                  i;
                                
//#line 80 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78944 =
                                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)ps).$apply$G((int)(t78943)));
                                
//#line 80 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final java.lang.String t78945 =
                                  (("starting ") + ((x10.core.Int.$box(t78944))));
                                
//#line 80 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final java.lang.String t78947 =
                                  ((t78945) + (" threads"));
                                
//#line 80 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
t78946.println(((java.lang.String)(t78947)));
                                
//#line 81 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78948 =
                                  i;
                                
//#line 81 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78949 =
                                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)ps).$apply$G((int)(t78948)));
                                
//#line 81 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final NQueensPar nq =
                                  ((NQueensPar)(new NQueensPar((java.lang.System[]) null).$init(((int)(n)),
                                                                                                t78949)));
                                
//#line 82 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final long t78950 =
                                  x10.lang.System.nanoTime$O();
                                
//#line 82 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
long start =
                                  (-(t78950));
                                
//#line 83 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int count;
                                {
                                    
//#line 83 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.lang.FinishState x10$__var26 =
                                      ((x10.lang.FinishState)(x10.lang.Runtime.<x10.core.Int>startCollectingFinish__0$1x10$lang$Runtime$$T$2(x10.rtt.Types.INT, ((x10.lang.Reducible)(NQueensPar.getInitialized$reducer())))));
                                    
//#line 83 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
try {try {{
                                        {
                                            
//#line 83 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
nq.start();
                                        }
                                    }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__22__) {
                                        
//#line 83 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__22__)));
                                        
//#line 83 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
throw new x10.lang.RuntimeException();
                                    }finally {{
                                         
//#line 83 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
count = x10.core.Int.$unbox(x10.lang.Runtime.<x10.core.Int>stopCollectingFinish$G(x10.rtt.Types.INT, ((x10.lang.FinishState)(x10$__var26))));
                                     }}
                                    }
                                
//#line 84 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.array.Array<x10.core.Int> t78951 =
                                  ((x10.array.Array)(NQueensPar.expectedSolutions));
                                
//#line 84 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78952 =
                                  nq.
                                    N;
                                
//#line 84 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78953 =
                                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t78951).$apply$G((int)(t78952)));
                                
//#line 84 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final boolean result =
                                  ((int) count) ==
                                ((int) t78953);
                                
//#line 85 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final long t78954 =
                                  start;
                                
//#line 85 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final long t78955 =
                                  x10.lang.System.nanoTime$O();
                                
//#line 85 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final long t78956 =
                                  ((t78954) + (((long)(t78955))));
                                
//#line 85 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
start = t78956;
                                
//#line 86 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final long t78957 =
                                  start;
                                
//#line 86 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final long t78958 =
                                  ((long)(((int)(1000000))));
                                
//#line 86 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final long t78959 =
                                  ((t78957) / (((long)(t78958))));
                                
//#line 86 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
start = t78959;
                                
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.io.Printer t78975 =
                                  ((x10.io.Printer)(x10.io.Console.OUT));
                                
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78960 =
                                  nq.
                                    N;
                                
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final java.lang.String t78961 =
                                  (("NQueensPar ") + ((x10.core.Int.$box(t78960))));
                                
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final java.lang.String t78963 =
                                  ((t78961) + ("(P="));
                                
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78962 =
                                  i;
                                
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78964 =
                                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)ps).$apply$G((int)(t78962)));
                                
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final java.lang.String t78965 =
                                  ((t78963) + ((x10.core.Int.$box(t78964))));
                                
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final java.lang.String t78966 =
                                  ((t78965) + (") has "));
                                
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final java.lang.String t78967 =
                                  ((t78966) + ((x10.core.Int.$box(count))));
                                
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final java.lang.String t78969 =
                                  ((t78967) + (" solutions"));
                                
//#line 89 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
java.lang.String t78968 =
                                   null;
                                
//#line 89 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
if (result) {
                                    
//#line 89 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
t78968 = " (ok)";
                                } else {
                                    
//#line 89 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
t78968 = " (wrong)";
                                }
                                
//#line 89 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final java.lang.String t78970 =
                                  t78968;
                                
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final java.lang.String t78971 =
                                  ((t78969) + (t78970));
                                
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final java.lang.String t78972 =
                                  ((t78971) + (" (t="));
                                
//#line 89 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final long t78973 =
                                  start;
                                
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final java.lang.String t78974 =
                                  ((t78972) + ((x10.core.Long.$box(t78973))));
                                
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final java.lang.String t78976 =
                                  ((t78974) + ("ms)."));
                                
//#line 87 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
t78975.println(((java.lang.String)(t78976)));
                                }
                            {
                                
//#line 79 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78941 =
                                  i;
                                
//#line 79 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78942 =
                                  ((t78941) + (((int)(1))));
                                
//#line 79 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
i = t78942;
                            }
                            }
                        }
                    }
                    
                    
//#line 1 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final public NQueensPar
                                                                                 NQueensPar$$NQueensPar$this(
                                                                                 ){
                        
//#line 1 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
return NQueensPar.this;
                    }
                    
                    
//#line 69 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final public static class Anonymous$1987 extends x10.core.Ref implements x10.lang.Reducible, x10.x10rt.X10JavaSerializable
                                                                                {
                        private static final long serialVersionUID = 1L;
                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, Anonymous$1987.class);
                        
                        public static final x10.rtt.RuntimeType<Anonymous$1987> $RTT = new x10.rtt.NamedType<Anonymous$1987>(
                        "NQueensPar.Anonymous$1987", /* base class */Anonymous$1987.class
                        , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.lang.Reducible.$RTT, x10.rtt.Types.INT), x10.rtt.Types.OBJECT}
                        );
                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                        
                        
                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                        public static x10.x10rt.X10JavaSerializable $_deserialize_body(Anonymous$1987 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + Anonymous$1987.class + " calling"); } 
                            return $_obj;
                            
                        }
                        
                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            Anonymous$1987 $_obj = new Anonymous$1987((java.lang.System[]) null);
                            $deserializer.record_reference($_obj);
                            return $_deserialize_body($_obj, $deserializer);
                            
                        }
                        
                        public short $_get_serialization_id() {
                        
                             return $_serialization_id;
                            
                        }
                        
                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                        
                            
                        }
                        
                        // constructor just for allocation
                        public Anonymous$1987(final java.lang.System[] $dummy) { 
                        super($dummy);
                        }
                        // dispatcher for method abstract public x10.lang.Reducible.operator()(T,T):T
                        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
                        return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1), x10.core.Int.$unbox(a2)));
                        }
                        // bridge for method abstract public x10.lang.Reducible.zero():T
                        public x10.core.Int
                          zero$G(){return x10.core.Int.$box(zero$O());}
                        
                            
                            
//#line 70 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
public int
                                                                                          zero$O(
                                                                                          ){
                                
//#line 70 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
return 0;
                            }
                            
                            
//#line 71 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
public int
                                                                                          $apply$O(
                                                                                          final int i,
                                                                                          final int j){
                                
//#line 71 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78978 =
                                  ((i) + (((int)(j))));
                                
//#line 71 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
return t78978;
                            }
                            
                            
//#line 69 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
// creation method for java code
                            public static NQueensPar.Anonymous$1987 $make(){return new NQueensPar.Anonymous$1987((java.lang.System[]) null).$init();}
                            
                            // constructor for non-virtual call
                            final public NQueensPar.Anonymous$1987 NQueensPar$Anonymous$1987$$init$S() { {
                                                                                                                
//#line 69 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"

                                                                                                            }
                                                                                                            return this;
                                                                                                            }
                            
                            // constructor
                            public NQueensPar.Anonymous$1987 $init(){return NQueensPar$Anonymous$1987$$init$S();}
                            
                        
                    }
                    
                    public static int fieldId$reducer;
                    final public static x10.core.concurrent.AtomicInteger initStatus$reducer = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
                    
                    public static x10.array.Array<x10.core.Int>
                      getInitialized$expectedSolutions(
                      ){
                        return NQueensPar.expectedSolutions;
                    }
                    
                    public static void
                      getDeserialized$reducer(
                      byte[] buf){
                        if (((boolean) x10.x10rt.X10JavaSerializable.CUSTOM_JAVA_SERIALIZATION) ==
                              ((boolean) true)) {
                            NQueensPar.reducer = ((NQueensPar.Anonymous$1987)(x10.runtime.impl.java.InitDispatcher.deserializeField(((byte[])(buf)))));
                        } else {
                            NQueensPar.reducer = ((NQueensPar.Anonymous$1987)(x10.rtt.Types.<NQueensPar.Anonymous$1987> cast(x10.runtime.impl.java.InitDispatcher.deserializeField(((byte[])(buf))),NQueensPar.Anonymous$1987.$RTT)));
                        }
                        NQueensPar.initStatus$reducer.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                        x10.runtime.impl.java.InitDispatcher.lockInitialized();
                        x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    }
                    
                    public static NQueensPar.Anonymous$1987
                      getInitialized$reducer(
                      ){
                        if (((int) x10.lang.Runtime.hereInt$O()) ==
                            ((int) 0)) {
                            if (NQueensPar.initStatus$reducer.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED),
                                                                            (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                                NQueensPar.reducer = ((NQueensPar.Anonymous$1987)(new NQueensPar.Anonymous$1987((java.lang.System[]) null).$init()));
                                if (((boolean) x10.x10rt.X10JavaSerializable.CUSTOM_JAVA_SERIALIZATION) ==
                                      ((boolean) true)) {
                                    x10.runtime.impl.java.InitDispatcher.broadcastStaticField(((java.lang.Object)(NQueensPar.reducer)),
                                                                                              (int)(NQueensPar.fieldId$reducer));
                                } else {
                                    x10.runtime.impl.java.InitDispatcher.broadcastStaticField(((java.lang.Object)(NQueensPar.reducer)),
                                                                                              (int)(NQueensPar.fieldId$reducer));
                                }
                                NQueensPar.initStatus$reducer.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                            }
                        }
                        if (((int) NQueensPar.initStatus$reducer.get()) !=
                            ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                            x10.runtime.impl.java.InitDispatcher.lockInitialized();
                            while (((int) NQueensPar.initStatus$reducer.get()) !=
                                   ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                                x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                            }
                            x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                        }
                        return NQueensPar.reducer;
                    }
                    
                    static {
                               NQueensPar.fieldId$reducer = x10.runtime.impl.java.InitDispatcher.addInitializer(((java.lang.String)("NQueensPar")),
                                                                                                                ((java.lang.String)("reducer")));
                           }
                    
                    public static class $Closure$68 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                    {
                        private static final long serialVersionUID = 1L;
                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$68.class);
                        
                        public static final x10.rtt.RuntimeType<$Closure$68> $RTT = new x10.rtt.StaticFunType<$Closure$68>(
                        /* base class */$Closure$68.class
                        , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.array.Region.$RTT), x10.rtt.Types.OBJECT}
                        );
                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                        
                        
                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$68 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$68.class + " calling"); } 
                            $_obj.baseSize = $deserializer.readInt();
                            $_obj.low = $deserializer.readInt();
                            $_obj.extra = $deserializer.readInt();
                            return $_obj;
                            
                        }
                        
                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            $Closure$68 $_obj = new $Closure$68((java.lang.System[]) null);
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
                        public $Closure$68(final java.lang.System[] $dummy) { 
                        super($dummy);
                        }
                        // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                        return $apply(x10.core.Int.$unbox(a1));
                        }
                        
                            
                            public x10.array.Region
                              $apply(
                              final int i){
                                
//#line 20 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78847 =
                                  ((i) * (((int)(this.
                                                   baseSize))));
                                
//#line 20 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78850 =
                                  ((this.
                                      low) + (((int)(t78847))));
                                
//#line 20 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final boolean t78848 =
                                  ((i) < (((int)(this.
                                                   extra))));
                                
//#line 20 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
int t78849 =
                                   0;
                                
//#line 20 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
if (t78848) {
                                    
//#line 20 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
t78849 = i;
                                } else {
                                    
//#line 20 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
t78849 = this.
                                                                                                           extra;
                                }
                                
//#line 20 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78851 =
                                  t78849;
                                
//#line 20 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int start =
                                  ((t78850) + (((int)(t78851))));
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78854 =
                                  ((start) + (((int)(this.
                                                       baseSize))));
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final boolean t78852 =
                                  ((i) < (((int)(this.
                                                   extra))));
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
int t78853 =
                                   0;
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
if (t78852) {
                                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
t78853 = 0;
                                } else {
                                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
t78853 = -1;
                                }
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78855 =
                                  t78853;
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final int t78856 =
                                  ((t78854) + (((int)(t78855))));
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.lang.IntRange t78857 =
                                  ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(start)), ((int)(t78856)))));
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
final x10.array.Region t78858 =
                                  ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t78857)))));
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/NQueensPar.x10"
return t78858;
                            }
                            
                            public int baseSize;
                            public int low;
                            public int extra;
                            
                            // creation method for java code
                            public static NQueensPar.$Closure$68 $make(final int baseSize,
                                                                       final int low,
                                                                       final int extra){return new $Closure$68(baseSize,low,extra);}
                            public $Closure$68(final int baseSize,
                                               final int low,
                                               final int extra) { {
                                                                         this.baseSize = baseSize;
                                                                         this.low = low;
                                                                         this.extra = extra;
                                                                     }}
                            
                        }
                        
                    
                }
                