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
    
        
        
//#line 3 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
public static void
                                                                    run__0$1x10$lang$Int$2__1$1x10$lang$Int$2(
                                                                    final x10.array.Array<x10.core.Int> a,
                                                                    final x10.array.Array<x10.core.Int> b){
            {
                
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
x10.lang.Runtime.ensureNotInAtomic();
                
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final x10.lang.FinishState x10$__var32 =
                  x10.lang.Runtime.startFinish();
                
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
try {try {{
                    {
                        
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final x10.array.Region t81162 =
                          ((x10.array.Region)(((x10.array.Array<x10.core.Int>)a).
                                                region));
                        
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final x10.lang.Iterator<x10.array.Point> id81146 =
                          t81162.iterator();
                        
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
for (;
                                                                                       true;
                                                                                       ) {
                            
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final boolean t81166 =
                              ((x10.lang.Iterator<x10.array.Point>)id81146).hasNext$O();
                            
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
if (!(t81166)) {
                                
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
break;
                            }
                            {
                                
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final x10.array.Point id68509 =
                                  ((x10.array.Point)(((x10.lang.Iterator<x10.array.Point>)id81146).next$G()));
                                
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final int i =
                                  id68509.$apply$O((int)(0));
                                
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Histogram.$Closure$84(a,
                                                                                                                                                                          i,
                                                                                                                                                                          b,(java.lang.Class<?>) null))));
                            }
                            {
                                
                            }
                        }
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__26__) {
                    
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__26__)));
                    
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
throw new x10.lang.RuntimeException();
                }finally {{
                     
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var32)));
                 }}
                }
            }
        
        
//#line 10 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
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
            
//#line 11 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
assert ((int) ((x10.array.Array<java.lang.String>)args).
                                                                                       size) ==
            ((int) 2): "Usage: Histogram <M:Int> <N:Int>";
            
//#line 12 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final java.lang.String t81167 =
              ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
            
//#line 12 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final int M =
              java.lang.Integer.parseInt(t81167);
            
//#line 12 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final java.lang.String t81168 =
              ((x10.array.Array<java.lang.String>)args).$apply$G((int)(1));
            
//#line 12 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final int N =
              java.lang.Integer.parseInt(t81168);
            
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
assert ((int) ((M) % (((int)(N))))) ==
            ((int) 0): "Usage: M must be a multiple of N.";
            
//#line 14 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final int t81169 =
              ((M) - (((int)(1))));
            
//#line 14 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final x10.lang.IntRange t81170 =
              ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(t81169)))));
            
//#line 14 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final x10.array.Region t81172 =
              ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t81170)))));
            
//#line 14 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final x10.core.fun.Fun_0_1<x10.array.Point,x10.core.Int> t81173 =
              ((x10.core.fun.Fun_0_1)(new Histogram.$Closure$85()));
            
//#line 14 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final x10.array.Array<x10.core.Int> a =
              ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((x10.array.Region)(t81172)),
                                                                                                                       ((x10.core.fun.Fun_0_1)(t81173)),(java.lang.Class<?>) null)));
            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final x10.array.Array<x10.core.Int> b =
              ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(N)),
                                                                                                                       (x10.core.Int.$box(0)),(java.lang.Class<?>[][][][][]) null)));
            
//#line 16 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
Histogram.run__0$1x10$lang$Int$2__1$1x10$lang$Int$2(((x10.array.Array)(a)),
                                                                                                                           ((x10.array.Array)(b)));
            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final int v =
              x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)b).$apply$G((int)(0)));
            {
                
//#line 18 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final x10.lang.Iterable<x10.core.Int> t81175 =
                  ((x10.lang.Iterable<x10.core.Int>)
                    ((x10.array.Array<x10.core.Int>)b).values());
                
//#line 18 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final x10.lang.Iterator<x10.core.Int> x81154 =
                  ((x10.lang.Iterator<x10.core.Int>)
                    ((x10.lang.Iterable<x10.core.Int>)t81175).iterator());
                
//#line 18 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
for (;
                                                                                true;
                                                                                ) {
                    
//#line 18 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final boolean t81176 =
                      ((x10.lang.Iterator<x10.core.Int>)x81154).hasNext$O();
                    
//#line 18 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
if (!(t81176)) {
                        
//#line 18 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
break;
                    }
                    {
                        
//#line 18 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final int x =
                          x10.core.Int.$unbox(((x10.lang.Iterator<x10.core.Int>)x81154).next$G());
                        
//#line 18 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
assert ((int) x) ==
                        ((int) v);
                    }
                    {
                        
                    }
                }
            }
            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final x10.io.Printer t81177 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
t81177.println(((java.lang.String)("Test ok.")));
        }
        
        
//#line 1 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final public Histogram
                                                                    Histogram$$Histogram$this(
                                                                    ){
            
//#line 1 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
return Histogram.this;
        }
        
        
//#line 1 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
// creation method for java code
        public static Histogram $make(){return new Histogram((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public Histogram Histogram$$init$S() { {
                                                            {
                                                                
//#line 1 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"

                                                            }
                                                            {
                                                                {
                                                                    
//#line 1 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"

                                                                }
                                                                {
                                                                    
                                                                }
                                                            }
                                                        }
                                                        return this;
                                                        }
        
        // constructor
        public Histogram $init(){return Histogram$$init$S();}
        
        
        public static class $Closure$84 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$84.class);
            
            public static final x10.rtt.RuntimeType<$Closure$84> $RTT = new x10.rtt.StaticVoidFunType<$Closure$84>(
            /* base class */$Closure$84.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$84 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$84.class + " calling"); } 
                x10.array.Array a = (x10.array.Array) $deserializer.readRef();
                $_obj.a = a;
                $_obj.i = $deserializer.readInt();
                x10.array.Array b = (x10.array.Array) $deserializer.readRef();
                $_obj.b = b;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$84 $_obj = new $Closure$84((java.lang.System[]) null);
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
                $serializer.write(this.i);
                if (b instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.b);
                } else {
                $serializer.write(this.b);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$84(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final int t81163 =
                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)this.
                                                                            a).$apply$G((int)(this.
                                                                                                i)));
                    
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final int t81164 =
                      ((x10.array.Array<x10.core.Int>)this.
                                                        b).
                        size;
                    
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final int bin =
                      ((t81163) % (((int)(t81164))));
                    
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
try {{
                        
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
x10.lang.Runtime.enterAtomic();
                        {
                            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final x10.array.Array<x10.core.Int> x81155 =
                              ((x10.array.Array)(this.
                                                   b));
                            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final int y81156 =
                              bin;
                            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
;
                            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
int ret81159 =
                               0;
                            {
                                
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final int t81165 =
                                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x81155).$apply$G((int)(y81156)));
                                
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final int r81158 =
                                  ((t81165) + (((int)(1))));
                                
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
((x10.array.Array<x10.core.Int>)x81155).$set__1x10$array$Array$$T$G((int)(y81156),
                                                                                                                                                              x10.core.Int.$box(r81158));
                                
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
ret81159 = r81158;
                            }
                        }
                    }}finally {{
                          
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
x10.lang.Runtime.exitAtomic();
                      }}
                    }
                
                public x10.array.Array<x10.core.Int> a;
                public int i;
                public x10.array.Array<x10.core.Int> b;
                
                // creation method for java code
                public static Histogram.$Closure$84 $make(final x10.array.Array<x10.core.Int> a,
                                                          final int i,
                                                          final x10.array.Array<x10.core.Int> b,java.lang.Class<?> $dummy0){return new $Closure$84(a,i,b,(java.lang.Class<?>) null);}
                public $Closure$84(final x10.array.Array<x10.core.Int> a,
                                   final int i,
                                   final x10.array.Array<x10.core.Int> b,java.lang.Class<?> $dummy0) { {
                                                                                                              this.a = ((x10.array.Array)(a));
                                                                                                              this.i = i;
                                                                                                              this.b = ((x10.array.Array)(b));
                                                                                                          }}
                
                }
                
            public static class $Closure$85 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$85.class);
                
                public static final x10.rtt.RuntimeType<$Closure$85> $RTT = new x10.rtt.StaticFunType<$Closure$85>(
                /* base class */$Closure$85.class
                , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.array.Point.$RTT, x10.rtt.Types.INT), x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$85 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$85.class + " calling"); } 
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$85 $_obj = new $Closure$85((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    
                }
                
                // constructor just for allocation
                public $Closure$85(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                return x10.core.Int.$box($apply$O((x10.array.Point)a1));
                }
                
                    
                    public int
                      $apply$O(
                      final x10.array.Point q){
                        
//#line 14 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
final int t81171 =
                          q.$apply$O((int)(0));
                        
//#line 14 "C:/eclipsews/pppp11/pppp11/src/Histogram.x10"
return t81171;
                    }
                    
                    // creation method for java code
                    public static Histogram.$Closure$85 $make(){return new $Closure$85();}
                    public $Closure$85() { {
                                                  
                                              }}
                    
                }
                
            
        }
        