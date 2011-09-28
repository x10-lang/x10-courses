public class Integrate extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, Integrate.class);
    
    public static final x10.rtt.RuntimeType<Integrate> $RTT = new x10.rtt.NamedType<Integrate>(
    "Integrate", /* base class */Integrate.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(Integrate $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + Integrate.class + " calling"); } 
        x10.core.fun.Fun_0_1 fun = (x10.core.fun.Fun_0_1) $deserializer.readRef();
        $_obj.fun = fun;
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        Integrate $_obj = new Integrate((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        if (fun instanceof x10.x10rt.X10JavaSerializable) {
        $serializer.write( (x10.x10rt.X10JavaSerializable) this.fun);
        } else {
        $serializer.write(this.fun);
        }
        
    }
    
    // constructor just for allocation
    public Integrate(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
//#line 2 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final public static double epsilon = 1.0E-12;
        
//#line 3 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
public x10.core.fun.Fun_0_1<x10.core.Double,x10.core.Double> fun;
        
        
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
// creation method for java code
        public static Integrate $make(final x10.core.fun.Fun_0_1<x10.core.Double,x10.core.Double> f,java.lang.Class<?> $dummy0){return new Integrate((java.lang.System[]) null).$init(f,(java.lang.Class<?>) null);}
        
        // constructor for non-virtual call
        final public Integrate Integrate$$init$S(final x10.core.fun.Fun_0_1<x10.core.Double,x10.core.Double> f,java.lang.Class<?> $dummy0) { {
                                                                                                                                                    {
                                                                                                                                                        
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"

                                                                                                                                                    }
                                                                                                                                                    {
                                                                                                                                                        {
                                                                                                                                                            
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"

                                                                                                                                                        }
                                                                                                                                                        {
                                                                                                                                                            
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
this.fun = ((x10.core.fun.Fun_0_1)(f));
                                                                                                                                                }
                                                                                                                                                return this;
                                                                                                                                                }
        
        // constructor
        public Integrate $init(final x10.core.fun.Fun_0_1<x10.core.Double,x10.core.Double> f,java.lang.Class<?> $dummy0){return Integrate$$init$S(f, $dummy0);}
        
        
        
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
public double
                                                                    computeArea$O(
                                                                    final double left,
                                                                    final double right){
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final x10.core.fun.Fun_0_1<x10.core.Double,x10.core.Double> t85212 =
              ((x10.core.fun.Fun_0_1)(fun));
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85214 =
              x10.core.Double.$unbox(((x10.core.fun.Fun_0_1<x10.core.Double,x10.core.Double>)t85212).$apply(x10.core.Double.$box(left),x10.rtt.Types.DOUBLE));
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final x10.core.fun.Fun_0_1<x10.core.Double,x10.core.Double> t85213 =
              ((x10.core.fun.Fun_0_1)(fun));
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85215 =
              x10.core.Double.$unbox(((x10.core.fun.Fun_0_1<x10.core.Double,x10.core.Double>)t85213).$apply(x10.core.Double.$box(right),x10.rtt.Types.DOUBLE));
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85216 =
              ((double)(int)(((int)(0))));
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85217 =
              this.eval$O((double)(left),
                          (double)(t85214),
                          (double)(right),
                          (double)(t85215),
                          (double)(t85216));
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
return t85217;
        }
        
        
//#line 8 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
private double
                                                                    eval$O(
                                                                    final double l,
                                                                    final double fl,
                                                                    final double r,
                                                                    final double fr,
                                                                    final double a){
            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85218 =
              ((r) - (((double)(l))));
            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85219 =
              ((double)(int)(((int)(2))));
            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double h =
              ((t85218) / (((double)(t85219))));
            
//#line 11 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85220 =
              ((double)(int)(((int)(2))));
            
//#line 11 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double hh =
              ((h) / (((double)(t85220))));
            
//#line 12 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double c =
              ((l) + (((double)(h))));
            
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final x10.core.fun.Fun_0_1<x10.core.Double,x10.core.Double> t85221 =
              ((x10.core.fun.Fun_0_1)(fun));
            
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double fc =
              x10.core.Double.$unbox(((x10.core.fun.Fun_0_1<x10.core.Double,x10.core.Double>)t85221).$apply(x10.core.Double.$box(c),x10.rtt.Types.DOUBLE));
            
//#line 14 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85222 =
              ((fl) + (((double)(fc))));
            
//#line 14 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double al =
              ((t85222) * (((double)(hh))));
            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85223 =
              ((fr) + (((double)(fc))));
            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double ar =
              ((t85223) * (((double)(hh))));
            
//#line 16 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double alr =
              ((al) + (((double)(ar))));
            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85224 =
              ((alr) - (((double)(a))));
            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85225 =
              x10.lang.Math.abs$O((double)(t85224));
            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85226 =
              Integrate.epsilon;
            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final boolean t85229 =
              ((t85225) < (((double)(t85226))));
            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
double t85230 =
               0;
            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
if (t85229) {
                
//#line 17 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
t85230 = alr;
            } else {
                
//#line 19 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85227 =
                  this.eval$O((double)(c),
                              (double)(fc),
                              (double)(r),
                              (double)(fr),
                              (double)(ar));
                
//#line 20 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85228 =
                  this.eval$O((double)(l),
                              (double)(fl),
                              (double)(c),
                              (double)(fc),
                              (double)(al));
                
//#line 17 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
t85230 = ((t85227) + (((double)(t85228))));
            }
            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85231 =
              t85230;
            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
return t85231;
        }
        
        public static double
          eval$P$O(
          final double l,
          final double fl,
          final double r,
          final double fr,
          final double a,
          final Integrate Integrate){
            return Integrate.eval$O((double)(l),
                                    (double)(fl),
                                    (double)(r),
                                    (double)(fr),
                                    (double)(a));
        }
        
        
//#line 22 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        Integrate.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> args) {
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final x10.core.fun.Fun_0_1<x10.core.Double,x10.core.Double> t85234 =
              ((x10.core.fun.Fun_0_1)(new Integrate.$Closure$99()));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final Integrate obj =
              ((Integrate)(new Integrate((java.lang.System[]) null).$init(((x10.core.fun.Fun_0_1)(t85234)),(java.lang.Class<?>) null)));
            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final int t85235 =
              ((x10.array.Array<java.lang.String>)args).
                size;
            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final boolean t85237 =
              ((t85235) > (((int)(0))));
            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
int t85238 =
               0;
            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
if (t85237) {
                
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final java.lang.String t85236 =
                  ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
                
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
t85238 = java.lang.Integer.parseInt(t85236);
            } else {
                
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
t85238 = 10;
            }
            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final int xMax =
              t85238;
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final long t85239 =
              x10.lang.System.nanoTime$O();
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final long t85240 =
              (-(t85239));
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
double start =
              ((double)(long)(((long)(t85240))));
            
//#line 27 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85241 =
              ((double)(int)(((int)(0))));
            
//#line 27 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85242 =
              ((double)(int)(((int)(xMax))));
            
//#line 27 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double area =
              obj.computeArea$O((double)(t85241),
                                (double)(t85242));
            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85244 =
              start;
            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final long t85243 =
              x10.lang.System.nanoTime$O();
            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85245 =
              ((double)(long)(((long)(t85243))));
            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85246 =
              ((t85244) + (((double)(t85245))));
            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
start = t85246;
            
//#line 29 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final x10.io.Printer t85257 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 29 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final java.lang.String t85247 =
              (("The area of (x*x +1) * x from 0 to ") + ((x10.core.Int.$box(xMax))));
            
//#line 29 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final java.lang.String t85248 =
              ((t85247) + (" is "));
            
//#line 29 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final java.lang.String t85249 =
              ((t85248) + ((x10.core.Double.$box(area))));
            
//#line 29 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final java.lang.String t85254 =
              ((t85249) + (" (t="));
            
//#line 31 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85252 =
              start;
            
//#line 31 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final int t85250 =
              1000000;
            
//#line 31 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final float t85251 =
              ((float)(int)(((int)(t85250))));
            
//#line 31 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85253 =
              ((double)(float)(((float)(t85251))));
            
//#line 31 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85255 =
              ((t85252) / (((double)(t85253))));
            
//#line 29 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final java.lang.String t85256 =
              ((t85254) + ((x10.core.Double.$box(t85255))));
            
//#line 29 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final java.lang.String t85258 =
              ((t85256) + (" ms)."));
            
//#line 29 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
t85257.println(((java.lang.String)(t85258)));
        }
        
        
//#line 1 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final public Integrate
                                                                    Integrate$$Integrate$this(
                                                                    ){
            
//#line 1 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
return Integrate.this;
        }
        
        public static double
          getInitialized$epsilon(
          ){
            return Integrate.epsilon;
        }
        
        public static class $Closure$99 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$99.class);
            
            public static final x10.rtt.RuntimeType<$Closure$99> $RTT = new x10.rtt.StaticFunType<$Closure$99>(
            /* base class */$Closure$99.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.DOUBLE, x10.rtt.Types.DOUBLE), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$99 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$99.class + " calling"); } 
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$99 $_obj = new $Closure$99((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                
            }
            
            // constructor just for allocation
            public $Closure$99(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Double.$box($apply$O(x10.core.Double.$unbox(a1)));
            }
            
                
                public double
                  $apply$O(
                  final double x){
                    
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85232 =
                      ((x) * (((double)(x))));
                    
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
final double t85233 =
                      ((t85232) + (((double)(x))));
                    
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Integrate.x10"
return t85233;
                }
                
                // creation method for java code
                public static Integrate.$Closure$99 $make(){return new $Closure$99();}
                public $Closure$99() { {
                                              
                                          }}
                
            }
            
        
    }
    