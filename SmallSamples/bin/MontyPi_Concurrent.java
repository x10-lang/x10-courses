
public class MontyPi_Concurrent extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, MontyPi_Concurrent.class);
    
    public static final x10.rtt.RuntimeType<MontyPi_Concurrent> $RTT = new x10.rtt.NamedType<MontyPi_Concurrent>(
    "MontyPi_Concurrent", /* base class */MontyPi_Concurrent.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(MontyPi_Concurrent $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + MontyPi_Concurrent.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        MontyPi_Concurrent $_obj = new MontyPi_Concurrent((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public MontyPi_Concurrent(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        MontyPi_Concurrent.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> args) {
            
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final java.lang.String t164123 =
              ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
            
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final int N =
              java.lang.Integer.parseInt(t164123);
            
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final java.lang.String t164124 =
              ((x10.array.Array<java.lang.String>)args).$apply$G((int)(1));
            
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final int P =
              java.lang.Integer.parseInt(t164124);
            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final double t164125 =
              ((double)(int)(((int)(0))));
            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final x10.lang.Cell<x10.core.Double> result =
              ((x10.lang.Cell)(new x10.lang.Cell<x10.core.Double>((java.lang.System[]) null, x10.rtt.Types.DOUBLE).$init(x10.core.Double.$box(t164125),(java.lang.Class<?>) null)));
            {
                
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
x10.lang.Runtime.ensureNotInAtomic();
                
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final x10.lang.FinishState x10$__var58 =
                  x10.lang.Runtime.startFinish();
                
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
try {try {{
                    {
                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final int i164103min164104 =
                          1;
                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final int i164103max164105 =
                          P;
                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
int i164175 =
                          i164103min164104;
                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
for (;
                                                                                                                                   true;
                                                                                                                                   ) {
                            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final int t164176 =
                              i164175;
                            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final boolean t164177 =
                              ((t164176) <= (((int)(i164103max164105))));
                            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
if (!(t164177)) {
                                
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
break;
                            }
                            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new MontyPi_Concurrent.$Closure$75(N,
                                                                                                                                                                                                                           P,
                                                                                                                                                                                                                           result,(java.lang.Class<?>) null))));
                            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final int t164173 =
                              i164175;
                            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final int t164174 =
                              ((t164173) + (((int)(1))));
                            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
i164175 = t164174;
                        }
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__44__) {
                    
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__44__)));
                    
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
throw new x10.lang.RuntimeException();
                }finally {{
                     
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var58)));
                 }}
                }
            
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final double t164144 =
              ((double)(int)(((int)(4))));
            
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final double t164145 =
              x10.core.Double.$unbox(((x10.lang.Cell<x10.core.Double>)result).$apply$G());
            
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final double t164146 =
              ((t164144) * (((double)(t164145))));
            
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final double t164147 =
              ((double)(int)(((int)(N))));
            
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final double pi =
              ((t164146) / (((double)(t164147))));
            
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final x10.io.Printer t164148 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final java.lang.String t164149 =
              (("The value of pi is ") + ((x10.core.Double.$box(pi))));
            
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
t164148.println(((java.lang.String)(t164149)));
            }
        
        
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final public MontyPi_Concurrent
                                                                                                                MontyPi_Concurrent$$MontyPi_Concurrent$this(
                                                                                                                ){
            
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
return MontyPi_Concurrent.this;
        }
        
        
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
// creation method for java code
        public static MontyPi_Concurrent $make(){return new MontyPi_Concurrent((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public MontyPi_Concurrent MontyPi_Concurrent$$init$S() { {
                                                                              
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"

                                                                              
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"

                                                                          }
                                                                          return this;
                                                                          }
        
        // constructor
        public MontyPi_Concurrent $init(){return MontyPi_Concurrent$$init$S();}
        
        
        public static class $Closure$75 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$75.class);
            
            public static final x10.rtt.RuntimeType<$Closure$75> $RTT = new x10.rtt.StaticVoidFunType<$Closure$75>(
            /* base class */$Closure$75.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$75 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$75.class + " calling"); } 
                $_obj.N = $deserializer.readInt();
                $_obj.P = $deserializer.readInt();
                x10.lang.Cell result = (x10.lang.Cell) $deserializer.readRef();
                $_obj.result = result;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$75 $_obj = new $Closure$75((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                $serializer.write(this.N);
                $serializer.write(this.P);
                if (result instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.result);
                } else {
                $serializer.write(this.result);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$75(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final x10.util.Random r164168 =
                      ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).$init()));
                    
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
double myResult164169 =
                      ((double)(int)(((int)(0))));
                    
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final int i164087min164166 =
                      1;
                    
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final int i164087max164167 =
                      ((this.
                          N) / (((int)(this.
                                         P))));
                    
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
int i164161 =
                      i164087min164166;
                    
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
for (;
                                                                                                                               true;
                                                                                                                               ) {
                        
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final int t164162 =
                          i164161;
                        
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final boolean t164163 =
                          ((t164162) <= (((int)(i164087max164167))));
                        
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
if (!(t164163)) {
                            
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
break;
                        }
                        
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final double x164150 =
                          r164168.nextDouble$O();
                        
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final double y164151 =
                          r164168.nextDouble$O();
                        
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final double t164152 =
                          ((x164150) * (((double)(x164150))));
                        
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final double t164153 =
                          ((y164151) * (((double)(y164151))));
                        
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final double t164154 =
                          ((t164152) + (((double)(t164153))));
                        
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final double t164155 =
                          ((double)(int)(((int)(1))));
                        
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final boolean t164156 =
                          ((t164154) <= (((double)(t164155))));
                        
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
if (t164156) {
                            
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final double t164157 =
                              myResult164169;
                            
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final double t164158 =
                              ((t164157) + (((double)(1.0))));
                            
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
myResult164169 = t164158;
                        }
                        
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final int t164159 =
                          i164161;
                        
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final int t164160 =
                          ((t164159) + (((int)(1))));
                        
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
i164161 = t164160;
                    }
                    
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
try {{
                        
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
x10.lang.Runtime.enterAtomic();
                        {
                            
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final x10.lang.Cell<x10.core.Double> x164170 =
                              ((x10.lang.Cell)(this.
                                                 result));
                            
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final double z164171 =
                              myResult164169;
                            
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
double ret164172 =
                               0;
                            
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final double t164164 =
                              x10.core.Double.$unbox(((x10.lang.Cell<x10.core.Double>)x164170).$apply$G());
                            
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
final double r164165 =
                              ((t164164) + (((double)(z164171))));
                            
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
((x10.lang.Cell<x10.core.Double>)x164170).$set__0x10$lang$Cell$$T(x10.core.Double.$box(r164165));
                            
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
ret164172 = r164165;
                        }
                    }}finally {{
                          
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Concurrent.x10"
x10.lang.Runtime.exitAtomic();
                      }}
                    }
                
                public int N;
                public int P;
                public x10.lang.Cell<x10.core.Double> result;
                
                // creation method for java code
                public static MontyPi_Concurrent.$Closure$75 $make(final int N,
                                                                   final int P,
                                                                   final x10.lang.Cell<x10.core.Double> result,java.lang.Class<?> $dummy0){return new $Closure$75(N,P,result,(java.lang.Class<?>) null);}
                public $Closure$75(final int N,
                                   final int P,
                                   final x10.lang.Cell<x10.core.Double> result,java.lang.Class<?> $dummy0) { {
                                                                                                                    this.N = N;
                                                                                                                    this.P = P;
                                                                                                                    this.result = ((x10.lang.Cell)(result));
                                                                                                                }}
                
                }
                
        
        }
        