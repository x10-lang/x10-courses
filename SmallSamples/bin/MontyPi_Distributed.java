
public class MontyPi_Distributed extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, MontyPi_Distributed.class);
    
    public static final x10.rtt.RuntimeType<MontyPi_Distributed> $RTT = new x10.rtt.NamedType<MontyPi_Distributed>(
    "MontyPi_Distributed", /* base class */MontyPi_Distributed.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(MontyPi_Distributed $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + MontyPi_Distributed.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        MontyPi_Distributed $_obj = new MontyPi_Distributed((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public MontyPi_Distributed(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        MontyPi_Distributed.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> args) {
            
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final java.lang.String t168971 =
              ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
            
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final int N =
              java.lang.Integer.parseInt(t168971);
            
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final double t168972 =
              ((double)(int)(((int)(0))));
            
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final x10.lang.Cell<x10.core.Double> t168973 =
              ((x10.lang.Cell)(new x10.lang.Cell<x10.core.Double>((java.lang.System[]) null, x10.rtt.Types.DOUBLE).$init(x10.core.Double.$box(t168972),(java.lang.Class<?>) null)));
            
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final x10.core.GlobalRef<x10.lang.Cell<x10.core.Double>> result =
              ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.lang.Cell<x10.core.Double>>(new x10.rtt.ParameterizedType(x10.lang.Cell.$RTT, x10.rtt.Types.DOUBLE), ((x10.lang.Cell<x10.core.Double>)(t168973)),(java.lang.Class<?>) null)));
            {
                
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
x10.lang.Runtime.ensureNotInAtomic();
                
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final x10.lang.FinishState x10$__var92 =
                  x10.lang.Runtime.startFinish();
                
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
try {try {{
                    {
                        
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final x10.lang.Sequence<x10.lang.Place> t168975 =
                          x10.lang.Place.places();
                        
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final x10.lang.Iterator<x10.lang.Place> p168965 =
                          ((x10.lang.Iterator<x10.lang.Place>)
                            ((x10.lang.Iterable<x10.lang.Place>)t168975).iterator());
                        
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
for (;
                                                                                                                                    true;
                                                                                                                                    ) {
                            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final boolean t168991 =
                              ((x10.lang.Iterator<x10.lang.Place>)p168965).hasNext$O();
                            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
if (!(t168991)) {
                                
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
break;
                            }
                            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final x10.lang.Place p169018 =
                              ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p168965).next$G()));
                            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
x10.lang.Runtime.runAsync(((x10.lang.Place)(p169018)),
                                                                                                                                                             ((x10.core.fun.VoidFun_0_0)(new MontyPi_Distributed.$Closure$112(N,
                                                                                                                                                                                                                              result,(java.lang.Class<?>) null))));
                        }
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__70__) {
                    
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__70__)));
                    
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
throw new x10.lang.RuntimeException();
                }finally {{
                     
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var92)));
                 }}
                }
            
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final double t168993 =
              ((double)(int)(((int)(4))));
            
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final x10.lang.Cell<x10.core.Double> t168992 =
              (((x10.core.GlobalRef<x10.lang.Cell<x10.core.Double>>)(result))).$apply$G();
            
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final double t168994 =
              x10.core.Double.$unbox(((x10.lang.Cell<x10.core.Double>)t168992).$apply$G());
            
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final double t168995 =
              ((t168993) * (((double)(t168994))));
            
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final double t168996 =
              ((double)(int)(((int)(N))));
            
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final double pi =
              ((t168995) / (((double)(t168996))));
            
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final x10.io.Printer t168997 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final java.lang.String t168998 =
              (("The value of pi is ") + ((x10.core.Double.$box(pi))));
            
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
t168997.println(((java.lang.String)(t168998)));
            }
        
        
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final public MontyPi_Distributed
                                                                                                                 MontyPi_Distributed$$MontyPi_Distributed$this(
                                                                                                                 ){
            
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
return MontyPi_Distributed.this;
        }
        
        
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
// creation method for java code
        public static MontyPi_Distributed $make(){return new MontyPi_Distributed((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public MontyPi_Distributed MontyPi_Distributed$$init$S() { {
                                                                                
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"

                                                                                
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"

                                                                            }
                                                                            return this;
                                                                            }
        
        // constructor
        public MontyPi_Distributed $init(){return MontyPi_Distributed$$init$S();}
        
        
        public static class $Closure$111 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$111.class);
            
            public static final x10.rtt.RuntimeType<$Closure$111> $RTT = new x10.rtt.StaticVoidFunType<$Closure$111>(
            /* base class */$Closure$111.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$111 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$111.class + " calling"); } 
                x10.core.GlobalRef result = (x10.core.GlobalRef) $deserializer.readRef();
                $_obj.result = result;
                $_obj.ans169021 = $deserializer.readDouble();
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$111 $_obj = new $Closure$111((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (result instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.result);
                } else {
                $serializer.write(this.result);
                }
                $serializer.write(this.ans169021);
                
            }
            
            // constructor just for allocation
            public $Closure$111(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
try {{
                        
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
x10.lang.Runtime.enterAtomic();
                        {
                            
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final x10.lang.Cell<x10.core.Double> x169023 =
                              ((x10.lang.Cell)((((x10.core.GlobalRef<x10.lang.Cell<x10.core.Double>>)(this.
                                                                                                        result))).$apply$G()));
                            
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final double z169024 =
                              this.
                                ans169021;
                            
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
double ret169025 =
                               0;
                            
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final double t169013 =
                              x10.core.Double.$unbox(((x10.lang.Cell<x10.core.Double>)x169023).$apply$G());
                            
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final double r169014 =
                              ((t169013) + (((double)(z169024))));
                            
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
((x10.lang.Cell<x10.core.Double>)x169023).$set__0x10$lang$Cell$$T(x10.core.Double.$box(r169014));
                            
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
ret169025 = r169014;
                        }
                    }}finally {{
                          
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
x10.lang.Runtime.exitAtomic();
                      }}
                    }
                
                public x10.core.GlobalRef<x10.lang.Cell<x10.core.Double>> result;
                public double ans169021;
                
                // creation method for java code
                public static MontyPi_Distributed.$Closure$111 $make(final x10.core.GlobalRef<x10.lang.Cell<x10.core.Double>> result,
                                                                     final double ans169021,java.lang.Class<?> $dummy0){return new $Closure$111(result,ans169021,(java.lang.Class<?>) null);}
                public $Closure$111(final x10.core.GlobalRef<x10.lang.Cell<x10.core.Double>> result,
                                    final double ans169021,java.lang.Class<?> $dummy0) { {
                                                                                                this.result = ((x10.core.GlobalRef)(result));
                                                                                                this.ans169021 = ans169021;
                                                                                            }}
                
                }
                
            public static class $Closure$112 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$112.class);
                
                public static final x10.rtt.RuntimeType<$Closure$112> $RTT = new x10.rtt.StaticVoidFunType<$Closure$112>(
                /* base class */$Closure$112.class
                , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$112 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$112.class + " calling"); } 
                    $_obj.N = $deserializer.readInt();
                    x10.core.GlobalRef result = (x10.core.GlobalRef) $deserializer.readRef();
                    $_obj.result = result;
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$112 $_obj = new $Closure$112((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    $serializer.write(this.N);
                    if (result instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.result);
                    } else {
                    $serializer.write(this.result);
                    }
                    
                }
                
                // constructor just for allocation
                public $Closure$112(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                
                    
                    public void
                      $apply(
                      ){
                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final x10.util.Random r169019 =
                          ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).$init()));
                        
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
double myResult169020 =
                          ((double)(int)(((int)(0))));
                        
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final int i168949min169015 =
                          1;
                        
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final int t169016 =
                          x10.lang.Place.getInitialized$MAX_PLACES();
                        
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final int i168949max169017 =
                          ((this.
                              N) / (((int)(t169016))));
                        
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
int i169010 =
                          i168949min169015;
                        
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
for (;
                                                                                                                                    true;
                                                                                                                                    ) {
                            
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final int t169011 =
                              i169010;
                            
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final boolean t169012 =
                              ((t169011) <= (((int)(i168949max169017))));
                            
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
if (!(t169012)) {
                                
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
break;
                            }
                            
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final double x168999 =
                              r169019.nextDouble$O();
                            
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final double y169000 =
                              r169019.nextDouble$O();
                            
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final double t169001 =
                              ((x168999) * (((double)(x168999))));
                            
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final double t169002 =
                              ((y169000) * (((double)(y169000))));
                            
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final double t169003 =
                              ((t169001) + (((double)(t169002))));
                            
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final double t169004 =
                              ((double)(int)(((int)(1))));
                            
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final boolean t169005 =
                              ((t169003) <= (((double)(t169004))));
                            
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
if (t169005) {
                                
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final double t169006 =
                                  myResult169020;
                                
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final double t169007 =
                                  ((t169006) + (((double)(1.0))));
                                
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
myResult169020 = t169007;
                            }
                            
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final int t169008 =
                              i169010;
                            
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final int t169009 =
                              ((t169008) + (((int)(1))));
                            
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
i169010 = t169009;
                        }
                        
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final double ans169021 =
                          myResult169020;
                        
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
final x10.lang.Place t169022 =
                          ((x10.lang.Place)((this.
                                               result).home));
                        
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Distributed.x10"
x10.lang.Runtime.runAt(((x10.lang.Place)(t169022)),
                                                                                                                                                      ((x10.core.fun.VoidFun_0_0)(new MontyPi_Distributed.$Closure$111(((x10.core.GlobalRef<x10.lang.Cell<x10.core.Double>>)(this.
                                                                                                                                                                                                                                                                               result)),
                                                                                                                                                                                                                       ans169021,(java.lang.Class<?>) null))));
                    }
                    
                    public int N;
                    public x10.core.GlobalRef<x10.lang.Cell<x10.core.Double>> result;
                    
                    // creation method for java code
                    public static MontyPi_Distributed.$Closure$112 $make(final int N,
                                                                         final x10.core.GlobalRef<x10.lang.Cell<x10.core.Double>> result,java.lang.Class<?> $dummy0){return new $Closure$112(N,result,(java.lang.Class<?>) null);}
                    public $Closure$112(final int N,
                                        final x10.core.GlobalRef<x10.lang.Cell<x10.core.Double>> result,java.lang.Class<?> $dummy0) { {
                                                                                                                                             this.N = N;
                                                                                                                                             this.result = ((x10.core.GlobalRef)(result));
                                                                                                                                         }}
                    
                }
                
            
        }
        