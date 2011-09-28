
public class MontyPi2 extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, MontyPi2.class);
    
    public static final x10.rtt.RuntimeType<MontyPi2> $RTT = new x10.rtt.NamedType<MontyPi2>(
    "MontyPi2", /* base class */MontyPi2.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(MontyPi2 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + MontyPi2.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        MontyPi2 $_obj = new MontyPi2((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public MontyPi2(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 4 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        MontyPi2.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> s) {
            
//#line 5 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
assert ((((x10.array.Array<java.lang.String>)s).
                                                                                size) >= (((int)(1)))): "Usage: MontyPi [<number of points per place:Int>]";
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final int t81856 =
              ((x10.array.Array<java.lang.String>)s).
                size;
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final boolean t81858 =
              ((t81856) > (((int)(0))));
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
int t81859 =
               0;
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
if (t81858) {
                
//#line 6 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final java.lang.String t81857 =
                  ((x10.array.Array<java.lang.String>)s).$apply$G((int)(0));
                
//#line 6 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
t81859 = java.lang.Integer.parseInt(t81857);
            } else {
                
//#line 6 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
t81859 = 10000;
            }
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final int N =
              t81859;
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final long t81860 =
              x10.lang.System.nanoTime$O();
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final long t81861 =
              (-(t81860));
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
double start =
              ((double)(long)(((long)(t81861))));
            
//#line 8 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final x10.array.Dist t81862 =
              ((x10.array.Dist)(x10.array.Dist.makeUnique()));
            
//#line 8 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final x10.core.fun.Fun_0_1<x10.array.Point,x10.core.Double> t81863 =
              ((x10.core.fun.Fun_0_1)(new MontyPi2.$Closure$89()));
            
//#line 8 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final x10.array.DistArray<x10.core.Double> result =
              ((x10.array.DistArray)(x10.array.DistArray.<x10.core.Double>make__1$1x10$array$Point$3x10$array$DistArray$$T$2(x10.rtt.Types.DOUBLE, ((x10.array.Dist)(t81862)),
                                                                                                                             ((x10.core.fun.Fun_0_1)(t81863)))));
            {
                
//#line 9 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
x10.lang.Runtime.ensureNotInAtomic();
                
//#line 9 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final x10.lang.FinishState x10$__var34 =
                  x10.lang.Runtime.startFinish();
                
//#line 9 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
try {try {{
                    {
                        
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final x10.array.Dist t81865 =
                          ((x10.array.Dist)(((x10.array.DistArray<x10.core.Double>)result).
                                              dist));
                        
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final x10.array.PlaceGroup t81866 =
                          t81865.places();
                        
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final x10.lang.Iterator<x10.lang.Place> p81855 =
                          ((x10.lang.Iterable<x10.lang.Place>)t81866).iterator();
                        
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
for (;
                                                                                       true;
                                                                                       ) {
                            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final boolean t81880 =
                              ((x10.lang.Iterator<x10.lang.Place>)p81855).hasNext$O();
                            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
if (!(t81880)) {
                                
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
break;
                            }
                            {
                                
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final x10.lang.Place p =
                                  ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p81855).next$G()));
                                
//#line 11 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
x10.lang.Runtime.runAsync(((x10.lang.Place)(p)),
                                                                                                                    ((x10.core.fun.VoidFun_0_0)(new MontyPi2.$Closure$90(N,
                                                                                                                                                                         p,
                                                                                                                                                                         result,(java.lang.Class<?>) null))));
                            }
                            {
                                
                            }
                        }
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__28__) {
                    
//#line 9 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__28__)));
                    
//#line 9 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
throw new x10.lang.RuntimeException();
                }finally {{
                     
//#line 9 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var34)));
                 }}
                }
            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double t81883 =
              ((double)(int)(((int)(4))));
            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final x10.core.fun.Fun_0_2<x10.core.Double,x10.core.Double,x10.core.Double> t81882 =
              ((x10.core.fun.Fun_0_2)(new MontyPi2.$Closure$91()));
            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double t81884 =
              x10.core.Double.$unbox(((x10.array.DistArray<x10.core.Double>)result).reduce__0$1x10$array$DistArray$$T$3x10$array$DistArray$$T$3x10$array$DistArray$$T$2__1x10$array$DistArray$$T$G(((x10.core.fun.Fun_0_2)(t81882)),
                                                                                                                                                                                                   x10.core.Double.$box(0.0)));
            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double t81887 =
              ((t81883) * (((double)(t81884))));
            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final int t81885 =
              x10.lang.Place.getInitialized$MAX_PLACES();
            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final int t81886 =
              ((N) * (((int)(t81885))));
            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double t81888 =
              ((double)(int)(((int)(t81886))));
            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double pi =
              ((t81887) / (((double)(t81888))));
            
//#line 23 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double t81890 =
              start;
            
//#line 23 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final long t81889 =
              x10.lang.System.nanoTime$O();
            
//#line 23 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double t81891 =
              ((double)(long)(((long)(t81889))));
            
//#line 23 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double t81892 =
              ((t81890) + (((double)(t81891))));
            
//#line 23 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
start = t81892;
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final x10.io.Printer t81900 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final java.lang.String t81893 =
              (("The value of pi is ") + ((x10.core.Double.$box(pi))));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final java.lang.String t81897 =
              ((t81893) + (" (t="));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double t81895 =
              start;
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final int t81894 =
              1000000;
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double t81896 =
              ((double)(int)(((int)(t81894))));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double t81898 =
              ((t81895) / (((double)(t81896))));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final java.lang.String t81899 =
              ((t81897) + ((x10.core.Double.$box(t81898))));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final java.lang.String t81901 =
              ((t81899) + (" ms)."));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
t81900.println(((java.lang.String)(t81901)));
            }
        
        
//#line 3 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final public MontyPi2
                                                                   MontyPi2$$MontyPi2$this(
                                                                   ){
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
return MontyPi2.this;
        }
        
        
//#line 3 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
// creation method for java code
        public static MontyPi2 $make(){return new MontyPi2((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public MontyPi2 MontyPi2$$init$S() { {
                                                          {
                                                              
//#line 3 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"

                                                          }
                                                          {
                                                              {
                                                                  
//#line 3 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"

                                                              }
                                                              {
                                                                  
                                                              }
                                                          }
                                                      }
                                                      return this;
                                                      }
        
        // constructor
        public MontyPi2 $init(){return MontyPi2$$init$S();}
        
        
        public static class $Closure$89 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$89.class);
            
            public static final x10.rtt.RuntimeType<$Closure$89> $RTT = new x10.rtt.StaticFunType<$Closure$89>(
            /* base class */$Closure$89.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.array.Point.$RTT, x10.rtt.Types.DOUBLE), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$89 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$89.class + " calling"); } 
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$89 $_obj = new $Closure$89((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                
            }
            
            // constructor just for allocation
            public $Closure$89(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Double.$box($apply$O((x10.array.Point)a1));
            }
            
                
                public double
                  $apply$O(
                  final x10.array.Point id$68521){
                    
//#line 8 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
return 0.0;
                }
                
                // creation method for java code
                public static MontyPi2.$Closure$89 $make(){return new $Closure$89();}
                public $Closure$89() { {
                                              
                                          }}
                
            }
            
        public static class $Closure$90 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$90.class);
            
            public static final x10.rtt.RuntimeType<$Closure$90> $RTT = new x10.rtt.StaticVoidFunType<$Closure$90>(
            /* base class */$Closure$90.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$90 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$90.class + " calling"); } 
                $_obj.N = $deserializer.readInt();
                x10.lang.Place p = (x10.lang.Place) $deserializer.readRef();
                $_obj.p = p;
                x10.array.DistArray result = (x10.array.DistArray) $deserializer.readRef();
                $_obj.result = result;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$90 $_obj = new $Closure$90((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                $serializer.write(this.N);
                if (p instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.p);
                } else {
                $serializer.write(this.p);
                }
                if (result instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.result);
                } else {
                $serializer.write(this.result);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$90(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 13 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final x10.util.Random r =
                      ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).$init()));
                    
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
double a =
                      0.0;
                    {
                        
//#line 15 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final int i81839min81840 =
                          1;
                        
//#line 15 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final int i81839max81841 =
                          this.
                            N;
                        {
                            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
int i81839 =
                              i81839min81840;
                            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
for (;
                                                                                           true;
                                                                                           ) {
                                
//#line 15 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final int t81868 =
                                  i81839;
                                
//#line 15 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final boolean t81877 =
                                  ((t81868) <= (((int)(i81839max81841))));
                                
//#line 15 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
if (!(t81877)) {
                                    
//#line 15 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
break;
                                }
                                {
                                    
//#line 15 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final int j =
                                      i81839;
                                    {
                                        
//#line 16 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double x =
                                          r.nextDouble$O();
                                        
//#line 16 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double y =
                                          r.nextDouble$O();
                                        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double t81871 =
                                          ((x) * (((double)(x))));
                                        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double t81872 =
                                          ((y) * (((double)(y))));
                                        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double t81873 =
                                          ((t81871) + (((double)(t81872))));
                                        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final boolean t81876 =
                                          ((t81873) <= (((double)(1.0))));
                                        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
if (t81876) {
                                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double t81874 =
                                              a;
                                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double t81875 =
                                              ((t81874) + (((double)(1.0))));
                                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
a = t81875;
                                        }
                                    }
                                }
                                {
                                    
//#line 15 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final int t81869 =
                                      i81839;
                                    
//#line 15 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final int t81870 =
                                      ((t81869) + (((int)(1))));
                                    
//#line 15 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
i81839 = t81870;
                                }
                            }
                        }
                    }
                    
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final int t81878 =
                      this.
                        p.
                        id;
                    
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double t81879 =
                      a;
                    
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
((x10.array.DistArray<x10.core.Double>)this.
                                                                                                                       result).$set__1x10$array$DistArray$$T$G((int)(t81878),
                                                                                                                                                               x10.core.Double.$box(t81879));
                }
                
                public int N;
                public x10.lang.Place p;
                public x10.array.DistArray<x10.core.Double> result;
                
                // creation method for java code
                public static MontyPi2.$Closure$90 $make(final int N,
                                                         final x10.lang.Place p,
                                                         final x10.array.DistArray<x10.core.Double> result,java.lang.Class<?> $dummy0){return new $Closure$90(N,p,result,(java.lang.Class<?>) null);}
                public $Closure$90(final int N,
                                   final x10.lang.Place p,
                                   final x10.array.DistArray<x10.core.Double> result,java.lang.Class<?> $dummy0) { {
                                                                                                                          this.N = N;
                                                                                                                          this.p = ((x10.lang.Place)(p));
                                                                                                                          this.result = ((x10.array.DistArray)(result));
                                                                                                                      }}
                
            }
            
        public static class $Closure$91 extends x10.core.Ref implements x10.core.fun.Fun_0_2, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$91.class);
            
            public static final x10.rtt.RuntimeType<$Closure$91> $RTT = new x10.rtt.StaticFunType<$Closure$91>(
            /* base class */$Closure$91.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_2.$RTT, x10.rtt.Types.DOUBLE, x10.rtt.Types.DOUBLE, x10.rtt.Types.DOUBLE), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$91 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$91.class + " calling"); } 
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$91 $_obj = new $Closure$91((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                
            }
            
            // constructor just for allocation
            public $Closure$91(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1, a2:Z2)=>U.operator()(a1:Z1,a2:Z2):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return x10.core.Double.$box($apply$O(x10.core.Double.$unbox(a1), x10.core.Double.$unbox(a2)));
            }
            
                
                public double
                  $apply$O(
                  final double x,
                  final double y){
                    
//#line 22 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
final double t81881 =
                      ((x) + (((double)(y))));
                    
//#line 22 "C:/eclipsews/pppp11/pppp11/src/MontyPi2.x10"
return t81881;
                }
                
                // creation method for java code
                public static MontyPi2.$Closure$91 $make(){return new $Closure$91();}
                public $Closure$91() { {
                                              
                                          }}
                
            }
            
        
        }
        