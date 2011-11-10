
public class Histogram extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, Histogram.class);
    
    public static final x10.rtt.RuntimeType<Histogram> $RTT = new x10.rtt.NamedType<Histogram>(
    "Histogram", /* base class */Histogram.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(Histogram $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + Histogram.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        Histogram $_obj = new Histogram((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public Histogram(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 20 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
public static void
                                                                                                               run__0$1x10$lang$Int$2__1$1x10$lang$Int$2(
                                                                                                               final x10.array.Array<x10.core.Int> a,
                                                                                                               final x10.array.Array<x10.core.Int> b){
            {
                
//#line 21 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
x10.lang.Runtime.ensureNotInAtomic();
                
//#line 21 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final x10.lang.FinishState x10$__var59 =
                  x10.lang.Runtime.startFinish();
                
//#line 21 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
try {try {{
                    {
                        
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final x10.array.Region t164240 =
                          ((x10.array.Region)(((x10.array.Array<x10.core.Int>)a).
                                                region));
                        
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final x10.lang.Iterator<x10.array.Point> id164204 =
                          t164240.iterator();
                        
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
for (;
                                                                                                                                  true;
                                                                                                                                  ) {
                            
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final boolean t164244 =
                              ((x10.lang.Iterator<x10.array.Point>)id164204).hasNext$O();
                            
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
if (!(t164244)) {
                                
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
break;
                            }
                            
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final x10.array.Point id164265 =
                              ((x10.array.Point)(((x10.lang.Iterator<x10.array.Point>)id164204).next$G()));
                            
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final int i164266 =
                              id164265.$apply$O((int)(0));
                            
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Histogram.$Closure$76(a,
                                                                                                                                                                                                                 i164266,
                                                                                                                                                                                                                 b,(java.lang.Class<?>) null))));
                        }
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__45__) {
                    
//#line 21 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__45__)));
                    
//#line 21 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
throw new x10.lang.RuntimeException();
                }finally {{
                     
//#line 21 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var59)));
                 }}
                }
            }
        
        
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
public static boolean
                                                                                                               compute$O(
                                                                                                               final int N,
                                                                                                               final int S){
            
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> t164245 =
              ((x10.core.fun.Fun_0_1)(new Histogram.$Closure$77()));
            
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final x10.array.Array<x10.core.Int> a =
              ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(N)),
                                                                                                                       ((x10.core.fun.Fun_0_1)(t164245)),(java.lang.Class<?>[][][][]) null)));
            
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final x10.array.Array<x10.core.Int> b =
              ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(S)))));
            
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
Histogram.run__0$1x10$lang$Int$2__1$1x10$lang$Int$2(((x10.array.Array)(a)),
                                                                                                                                                                     ((x10.array.Array)(b)));
            
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final int v =
              x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)b).$apply$G((int)(0)));
            
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
boolean ok =
              true;
            
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final x10.array.Region p164283 =
              ((x10.array.Region)(((x10.array.Array<x10.core.Int>)b).
                                    region));
            
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final int x164214min164284 =
              p164283.min$O((int)(0));
            
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final int x164214max164285 =
              p164283.max$O((int)(0));
            
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
int x164280 =
              x164214min164284;
            
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
for (;
                                                                                                                      true;
                                                                                                                      ) {
                
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final int t164281 =
                  x164280;
                
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final boolean t164282 =
                  ((t164281) <= (((int)(x164214max164285))));
                
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
if (!(t164282)) {
                    
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
break;
                }
                
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final int x164277 =
                  x164280;
                
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final boolean t164273 =
                  ok;
                
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final int t164274 =
                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)b).$apply$G((int)(x164277)));
                
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final boolean t164275 =
                  ((int) t164274) ==
                ((int) v);
                
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final boolean t164276 =
                  ((t164273) & (((boolean)(t164275))));
                
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
ok = t164276;
                
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final int t164278 =
                  x164280;
                
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final int t164279 =
                  ((t164278) + (((int)(1))));
                
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
x164280 = t164279;
            }
            
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final boolean t164255 =
              ok;
            
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
return t164255;
        }
        
        
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        Histogram.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> args) {
            
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final int t164256 =
              ((x10.array.Array<java.lang.String>)args).
                size;
            
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final boolean t164258 =
              ((int) t164256) !=
            ((int) 2);
            
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
if (t164258) {
                
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final x10.io.Printer t164257 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
t164257.println(((java.lang.String)("Usage: Histogram SizeOfArray Buckets")));
                
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
return;
            }
            
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final java.lang.String t164259 =
              ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
            
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final int N =
              java.lang.Integer.parseInt(t164259);
            
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final java.lang.String t164260 =
              ((x10.array.Array<java.lang.String>)args).$apply$G((int)(1));
            
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final int S =
              java.lang.Integer.parseInt(t164260);
            
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final boolean ok =
              Histogram.compute$O((int)(N),
                                  (int)(S));
            
//#line 46 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
if (ok) {
                
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final x10.io.Printer t164261 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
t164261.println(((java.lang.String)("Test ok.")));
            } else {
                
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final x10.io.Printer t164262 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
t164262.println(((java.lang.String)("Test failed.")));
            }
        }
        
        
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final public Histogram
                                                                                                               Histogram$$Histogram$this(
                                                                                                               ){
            
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
return Histogram.this;
        }
        
        
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
// creation method for java code
        public static Histogram $make(){return new Histogram((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public Histogram Histogram$$init$S() { {
                                                            
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"

                                                            
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"

                                                        }
                                                        return this;
                                                        }
        
        // constructor
        public Histogram $init(){return Histogram$$init$S();}
        
        
        public static class $Closure$76 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$76.class);
            
            public static final x10.rtt.RuntimeType<$Closure$76> $RTT = new x10.rtt.StaticVoidFunType<$Closure$76>(
            /* base class */$Closure$76.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$76 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$76.class + " calling"); } 
                x10.array.Array a = (x10.array.Array) $deserializer.readRef();
                $_obj.a = a;
                $_obj.i164266 = $deserializer.readInt();
                x10.array.Array b = (x10.array.Array) $deserializer.readRef();
                $_obj.b = b;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$76 $_obj = new $Closure$76((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (a instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.a);
                } else {
                $serializer.write(this.a);
                }
                $serializer.write(this.i164266);
                if (b instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.b);
                } else {
                $serializer.write(this.b);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$76(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final int t164267 =
                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)this.
                                                                            a).$apply$G((int)(this.
                                                                                                i164266)));
                    
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final int t164268 =
                      ((x10.array.Array<x10.core.Int>)this.
                                                        b).
                        size;
                    
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final int bin164269 =
                      ((t164267) % (((int)(t164268))));
                    
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
try {{
                        
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
x10.lang.Runtime.enterAtomic();
                        {
                            
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final x10.array.Array<x10.core.Int> x164270 =
                              ((x10.array.Array)(this.
                                                   b));
                            
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final int y164271 =
                              bin164269;
                            
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
;
                            
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
int ret164272 =
                               0;
                            
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final int t164263 =
                              x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x164270).$apply$G((int)(y164271)));
                            
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
final int r164264 =
                              ((t164263) + (((int)(1))));
                            
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
((x10.array.Array<x10.core.Int>)x164270).$set__1x10$array$Array$$T$G((int)(y164271),
                                                                                                                                                                                                      x10.core.Int.$box(r164264));
                            
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
ret164272 = r164264;
                        }
                    }}finally {{
                          
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
x10.lang.Runtime.exitAtomic();
                      }}
                    }
                
                public x10.array.Array<x10.core.Int> a;
                public int i164266;
                public x10.array.Array<x10.core.Int> b;
                
                // creation method for java code
                public static Histogram.$Closure$76 $make(final x10.array.Array<x10.core.Int> a,
                                                          final int i164266,
                                                          final x10.array.Array<x10.core.Int> b,java.lang.Class<?> $dummy0){return new $Closure$76(a,i164266,b,(java.lang.Class<?>) null);}
                public $Closure$76(final x10.array.Array<x10.core.Int> a,
                                   final int i164266,
                                   final x10.array.Array<x10.core.Int> b,java.lang.Class<?> $dummy0) { {
                                                                                                              this.a = ((x10.array.Array)(a));
                                                                                                              this.i164266 = i164266;
                                                                                                              this.b = ((x10.array.Array)(b));
                                                                                                          }}
                
                }
                
            public static class $Closure$77 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$77.class);
                
                public static final x10.rtt.RuntimeType<$Closure$77> $RTT = new x10.rtt.StaticFunType<$Closure$77>(
                /* base class */$Closure$77.class
                , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.INT), x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$77 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$77.class + " calling"); } 
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$77 $_obj = new $Closure$77((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    
                }
                
                // constructor just for allocation
                public $Closure$77(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1)));
                }
                
                    
                    public int
                      $apply$O(
                      final int i){
                        
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/Histogram.x10"
return i;
                    }
                    
                    // creation method for java code
                    public static Histogram.$Closure$77 $make(){return new $Closure$77();}
                    public $Closure$77() { {
                                                  
                                              }}
                    
                }
                
            
        }
        