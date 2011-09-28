
public class MontyPi extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, MontyPi.class);
    
    public static final x10.rtt.RuntimeType<MontyPi> $RTT = new x10.rtt.NamedType<MontyPi>(
    "MontyPi", /* base class */MontyPi.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(MontyPi $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + MontyPi.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        MontyPi $_obj = new MontyPi((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public MontyPi(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 5 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        MontyPi.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> s) {
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
assert ((((x10.array.Array<java.lang.String>)s).
                                                                               size) >= (((int)(1)))): "Usage: MontyPi [<number of points per place:Int>]";
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final int t79198 =
              ((x10.array.Array<java.lang.String>)s).
                size;
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final boolean t79200 =
              ((t79198) > (((int)(0))));
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
int t79201 =
               0;
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
if (t79200) {
                
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final java.lang.String t79199 =
                  ((x10.array.Array<java.lang.String>)s).$apply$G((int)(0));
                
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
t79201 = java.lang.Integer.parseInt(t79199);
            } else {
                
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
t79201 = 10000;
            }
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final int N =
              t79201;
            
//#line 8 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final long t79202 =
              x10.lang.System.nanoTime$O();
            
//#line 8 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final long t79203 =
              (-(t79202));
            
//#line 8 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
double start =
              ((double)(long)(((long)(t79203))));
            
//#line 9 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final x10.core.fun.Fun_0_1<x10.array.Point,x10.core.Double> initializer =
              ((x10.core.fun.Fun_0_1)(new MontyPi.$Closure$69(N)));
            
//#line 18 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final x10.array.Dist t79216 =
              ((x10.array.Dist)(x10.array.Dist.makeUnique()));
            
//#line 18 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final x10.array.DistArray<x10.core.Double> result =
              ((x10.array.DistArray)(x10.array.DistArray.<x10.core.Double>make__1$1x10$array$Point$3x10$array$DistArray$$T$2(x10.rtt.Types.DOUBLE, ((x10.array.Dist)(t79216)),
                                                                                                                             ((x10.core.fun.Fun_0_1)(initializer)))));
            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double t79219 =
              ((double)(int)(((int)(4))));
            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final x10.core.fun.Fun_0_2<x10.core.Double,x10.core.Double,x10.core.Double> t79218 =
              ((x10.core.fun.Fun_0_2)(new MontyPi.$Closure$70()));
            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double t79220 =
              x10.core.Double.$unbox(((x10.array.DistArray<x10.core.Double>)result).reduce__0$1x10$array$DistArray$$T$3x10$array$DistArray$$T$3x10$array$DistArray$$T$2__1x10$array$DistArray$$T$G(((x10.core.fun.Fun_0_2)(t79218)),
                                                                                                                                                                                                   x10.core.Double.$box(0.0)));
            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double t79223 =
              ((t79219) * (((double)(t79220))));
            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final int t79221 =
              x10.lang.Place.getInitialized$MAX_PLACES();
            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final int t79222 =
              ((N) * (((int)(t79221))));
            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double t79224 =
              ((double)(int)(((int)(t79222))));
            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double pi =
              ((t79223) / (((double)(t79224))));
            
//#line 20 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double t79226 =
              start;
            
//#line 20 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final long t79225 =
              x10.lang.System.nanoTime$O();
            
//#line 20 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double t79227 =
              ((double)(long)(((long)(t79225))));
            
//#line 20 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double t79228 =
              ((t79226) + (((double)(t79227))));
            
//#line 20 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
start = t79228;
            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final x10.io.Printer t79236 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final java.lang.String t79229 =
              (("The value of pi is ") + ((x10.core.Double.$box(pi))));
            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final java.lang.String t79233 =
              ((t79229) + (" (t="));
            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double t79231 =
              start;
            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final int t79230 =
              1000000;
            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double t79232 =
              ((double)(int)(((int)(t79230))));
            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double t79234 =
              ((t79231) / (((double)(t79232))));
            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final java.lang.String t79235 =
              ((t79233) + ((x10.core.Double.$box(t79234))));
            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final java.lang.String t79237 =
              ((t79235) + (" ms)."));
            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
t79236.println(((java.lang.String)(t79237)));
        }
        
        
//#line 4 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final public MontyPi
                                                                  MontyPi$$MontyPi$this(
                                                                  ){
            
//#line 4 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
return MontyPi.this;
        }
        
        
//#line 4 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
// creation method for java code
        public static MontyPi $make(){return new MontyPi((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public MontyPi MontyPi$$init$S() { {
                                                        {
                                                            
//#line 4 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"

                                                        }
                                                        {
                                                            {
                                                                
//#line 4 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"

                                                            }
                                                            {
                                                                
                                                            }
                                                        }
                                                    }
                                                    return this;
                                                    }
        
        // constructor
        public MontyPi $init(){return MontyPi$$init$S();}
        
        
        public static class $Closure$69 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$69.class);
            
            public static final x10.rtt.RuntimeType<$Closure$69> $RTT = new x10.rtt.StaticFunType<$Closure$69>(
            /* base class */$Closure$69.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.array.Point.$RTT, x10.rtt.Types.DOUBLE), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$69 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$69.class + " calling"); } 
                $_obj.N = $deserializer.readInt();
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$69 $_obj = new $Closure$69((java.lang.System[]) null);
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
            public $Closure$69(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Double.$box($apply$O((x10.array.Point)a1));
            }
            
                
                public double
                  $apply$O(
                  final x10.array.Point i){
                    
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final x10.util.Random r =
                      ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).$init()));
                    
//#line 11 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
double result =
                      0.0;
                    {
                        
//#line 12 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final int i79183min79184 =
                          1;
                        
//#line 12 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final int i79183max79185 =
                          this.
                            N;
                        {
                            
//#line 12 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
int i79183 =
                              i79183min79184;
                            
//#line 12 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
for (;
                                                                                          true;
                                                                                          ) {
                                
//#line 12 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final int t79205 =
                                  i79183;
                                
//#line 12 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final boolean t79214 =
                                  ((t79205) <= (((int)(i79183max79185))));
                                
//#line 12 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
if (!(t79214)) {
                                    
//#line 12 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
break;
                                }
                                {
                                    
//#line 12 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final int j =
                                      i79183;
                                    {
                                        
//#line 13 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double x =
                                          r.nextDouble$O();
                                        
//#line 13 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double y =
                                          r.nextDouble$O();
                                        
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double t79208 =
                                          ((x) * (((double)(x))));
                                        
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double t79209 =
                                          ((y) * (((double)(y))));
                                        
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double t79210 =
                                          ((t79208) + (((double)(t79209))));
                                        
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final boolean t79213 =
                                          ((t79210) <= (((double)(1.0))));
                                        
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
if (t79213) {
                                            
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double t79211 =
                                              result;
                                            
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double t79212 =
                                              ((t79211) + (((double)(1.0))));
                                            
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
result = t79212;
                                        }
                                    }
                                }
                                {
                                    
//#line 12 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final int t79206 =
                                      i79183;
                                    
//#line 12 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final int t79207 =
                                      ((t79206) + (((int)(1))));
                                    
//#line 12 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
i79183 = t79207;
                                }
                            }
                        }
                    }
                    
//#line 16 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double t79215 =
                      result;
                    
//#line 16 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
return t79215;
                }
                
                public int N;
                
                // creation method for java code
                public static MontyPi.$Closure$69 $make(final int N){return new $Closure$69(N);}
                public $Closure$69(final int N) { {
                                                         this.N = N;
                                                     }}
                
            }
            
        public static class $Closure$70 extends x10.core.Ref implements x10.core.fun.Fun_0_2, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$70.class);
            
            public static final x10.rtt.RuntimeType<$Closure$70> $RTT = new x10.rtt.StaticFunType<$Closure$70>(
            /* base class */$Closure$70.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_2.$RTT, x10.rtt.Types.DOUBLE, x10.rtt.Types.DOUBLE, x10.rtt.Types.DOUBLE), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$70 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$70.class + " calling"); } 
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$70 $_obj = new $Closure$70((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                
            }
            
            // constructor just for allocation
            public $Closure$70(final java.lang.System[] $dummy) { 
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
                    
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
final double t79217 =
                      ((x) + (((double)(y))));
                    
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi.x10"
return t79217;
                }
                
                // creation method for java code
                public static MontyPi.$Closure$70 $make(){return new $Closure$70();}
                public $Closure$70() { {
                                              
                                          }}
                
            }
            
        
        }
        