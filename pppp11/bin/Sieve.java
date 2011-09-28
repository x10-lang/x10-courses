public class Sieve extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, Sieve.class);
    
    public static final x10.rtt.RuntimeType<Sieve> $RTT = new x10.rtt.NamedType<Sieve>(
    "Sieve", /* base class */Sieve.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(Sieve $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + Sieve.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        Sieve $_obj = new Sieve((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public Sieve(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 9 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        Sieve.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> s) {
            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int t77813 =
              ((x10.array.Array<java.lang.String>)s).
                size;
            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final boolean t77815 =
              ((t77813) > (((int)(0))));
            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
int t77816 =
               0;
            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
if (t77815) {
                
//#line 10 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final java.lang.String t77814 =
                  ((x10.array.Array<java.lang.String>)s).$apply$G((int)(0));
                
//#line 10 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
t77816 = java.lang.Integer.parseInt(t77814);
            } else {
                
//#line 10 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
t77816 = 100;
            }
            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int N =
              t77816;
            
//#line 11 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final long time =
              x10.lang.System.nanoTime$O();
            {
                
//#line 12 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
x10.lang.Runtime.ensureNotInAtomic();
                
//#line 12 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final x10.lang.FinishState x10$__var23 =
                  x10.lang.Runtime.startFinish();
                
//#line 12 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
try {try {{
                    {
                        
//#line 12 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Sieve.$Closure$58(N))));
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__19__) {
                    
//#line 12 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__19__)));
                    
//#line 12 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
throw new x10.lang.RuntimeException();
                }finally {{
                     
//#line 12 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var23)));
                 }}
                }
            
//#line 14 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final x10.io.Printer t77827 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final long t77818 =
              x10.lang.System.nanoTime$O();
            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final long t77819 =
              ((t77818) - (((long)(time))));
            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final double t77820 =
              ((double)(long)(((long)(t77819))));
            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final double t77823 =
              ((t77820) * (((double)(1.0))));
            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int t77821 =
              1000000;
            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int t77822 =
              1000000000;
            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final double t77824 =
              ((double)(int)(((int)(t77822))));
            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final double t77825 =
              ((t77823) / (((double)(t77824))));
            
//#line 14 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final java.lang.String t77826 =
              (("Time: ") + ((x10.core.Double.$box(t77825))));
            
//#line 14 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final java.lang.String t77828 =
              ((t77826) + (" s."));
            
//#line 14 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
t77827.println(((java.lang.String)(t77828)));
            }
        
        
//#line 21 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
public static Clocked<x10.core.Int>
                                                                 gen(
                                                                 final int N){
            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final Clocked<x10.core.Int> x =
              ((Clocked)(new Clocked<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init((x10.core.Int.$box(2)),(java.lang.Class<?>) null)));
            
//#line 23 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
x10.lang.Runtime.runAsync__0$1x10$lang$Clock$2(((x10.array.Array)(x10.core.ArrayFactory.<x10.lang.Clock> makeArrayFromJavaArray(x10.lang.Clock.$RTT, new x10.lang.Clock[] {((Clocked<x10.core.Int>)x).
                                                                                                                                                                                                                                                clock}))),
                                                                                                                  ((x10.core.fun.VoidFun_0_0)(new Sieve.$Closure$59(N,
                                                                                                                                                                    x,(java.lang.Class<?>) null))));
            
//#line 31 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
return x;
        }
        
        
//#line 37 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
public static void
                                                                 primes__0$1x10$lang$Int$2(
                                                                 final Clocked<x10.core.Int> nums){
            
//#line 38 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
x10.lang.Runtime.runAsync__0$1x10$lang$Clock$2(((x10.array.Array)(x10.core.ArrayFactory.<x10.lang.Clock> makeArrayFromJavaArray(x10.lang.Clock.$RTT, new x10.lang.Clock[] {((Clocked<x10.core.Int>)nums).
                                                                                                                                                                                                                                                clock}))),
                                                                                                                  ((x10.core.fun.VoidFun_0_0)(new Sieve.$Closure$60(nums,(java.lang.Class<?>) null))));
        }
        
        
//#line 53 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
public static Clocked<x10.core.Int>
                                                                 sieve__1$1x10$lang$Int$2(
                                                                 final int prime,
                                                                 final Clocked<x10.core.Int> nums){
            
//#line 54 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final Clocked<x10.core.Int> result;
            
//#line 56 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
int n =
              x10.core.Int.$unbox(((Clocked<x10.core.Int>)nums).$apply$G());
            
//#line 57 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
while (true) {
                
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int t77840 =
                  n;
                
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final boolean t77842 =
                  ((t77840) < (((int)(0))));
                
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
if (t77842) {
                    
//#line 59 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final Clocked<x10.core.Int> t77841 =
                      ((Clocked)(new Clocked<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init((x10.core.Int.$box(-1)),(java.lang.Class<?>) null)));
                    
//#line 59 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
return t77841;
                }
                
//#line 60 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int t77843 =
                  n;
                
//#line 60 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int t77844 =
                  ((t77843) % (((int)(prime))));
                
//#line 60 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final boolean t77847 =
                  ((int) t77844) !=
                ((int) 0);
                
//#line 60 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
if (t77847) {
                    
//#line 61 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int t77845 =
                      n;
                    
//#line 61 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final Clocked<x10.core.Int> t77846 =
                      ((Clocked)(new Clocked<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(x10.core.Int.$box(t77845),(java.lang.Class<?>) null)));
                    
//#line 61 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
result = ((Clocked)(t77846));
                    
//#line 62 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
break;
                }
                
//#line 64 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
((Clocked<x10.core.Int>)nums).next();
                
//#line 65 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int t77848 =
                  x10.core.Int.$unbox(((Clocked<x10.core.Int>)nums).$apply$G());
                
//#line 65 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
n = t77848;
            }
            
//#line 67 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
((Clocked<x10.core.Int>)nums).next();
            
//#line 70 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
x10.lang.Runtime.runAsync__0$1x10$lang$Clock$2(((x10.array.Array)(x10.core.ArrayFactory.<x10.lang.Clock> makeArrayFromJavaArray(x10.lang.Clock.$RTT, new x10.lang.Clock[] {((Clocked<x10.core.Int>)nums).
                                                                                                                                                                                                                                                clock, ((Clocked<x10.core.Int>)result).
                                                                                                                                                                                                                                                         clock}))),
                                                                                                                  ((x10.core.fun.VoidFun_0_0)(new Sieve.$Closure$61(nums,
                                                                                                                                                                    prime,
                                                                                                                                                                    result,(java.lang.Class<?>) null))));
            
//#line 84 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
return result;
        }
        
        
//#line 8 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final public Sieve
                                                                Sieve$$Sieve$this(
                                                                ){
            
//#line 8 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
return Sieve.this;
        }
        
        
//#line 8 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
// creation method for java code
        public static Sieve $make(){return new Sieve((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public Sieve Sieve$$init$S() { {
                                                    {
                                                        
//#line 8 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"

                                                    }
                                                    {
                                                        {
                                                            
//#line 8 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"

                                                        }
                                                        {
                                                            
                                                        }
                                                    }
                                                }
                                                return this;
                                                }
        
        // constructor
        public Sieve $init(){return Sieve$$init$S();}
        
        
        public static class $Closure$58 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$58.class);
            
            public static final x10.rtt.RuntimeType<$Closure$58> $RTT = new x10.rtt.StaticVoidFunType<$Closure$58>(
            /* base class */$Closure$58.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$58 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$58.class + " calling"); } 
                $_obj.N = $deserializer.readInt();
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$58 $_obj = new $Closure$58((java.lang.System[]) null);
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
            public $Closure$58(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final Clocked<x10.core.Int> t77817 =
                      Sieve.gen((int)(this.
                                        N));
                    
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
Sieve.primes__0$1x10$lang$Int$2(((Clocked)(t77817)));
                }
                
                public int N;
                
                // creation method for java code
                public static Sieve.$Closure$58 $make(final int N){return new $Closure$58(N);}
                public $Closure$58(final int N) { {
                                                         this.N = N;
                                                     }}
                
            }
            
        public static class $Closure$59 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$59.class);
            
            public static final x10.rtt.RuntimeType<$Closure$59> $RTT = new x10.rtt.StaticVoidFunType<$Closure$59>(
            /* base class */$Closure$59.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$59 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$59.class + " calling"); } 
                $_obj.N = $deserializer.readInt();
                Clocked x = (Clocked) $deserializer.readRef();
                $_obj.x = x;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$59 $_obj = new $Closure$59((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                $serializer.write(this.N);
                if (x instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.x);
                } else {
                $serializer.write(this.x);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$59(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    {
                        
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final x10.lang.IntRange t77829 =
                          ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(3)), ((int)(this.
                                                                                            N)))));
                        
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final x10.array.Region p77793 =
                          ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t77829)))));
                        
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int i77794min77795 =
                          p77793.min$O((int)(0));
                        
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int i77794max77796 =
                          p77793.max$O((int)(0));
                        {
                            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
int i77794 =
                              i77794min77795;
                            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
for (;
                                                                                        true;
                                                                                        ) {
                                
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int t77831 =
                                  i77794;
                                
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final boolean t77834 =
                                  ((t77831) <= (((int)(i77794max77796))));
                                
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
if (!(t77834)) {
                                    
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
break;
                                }
                                {
                                    
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int i =
                                      i77794;
                                    {
                                        
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
((Clocked<x10.core.Int>)this.
                                                                                                                         x).$set__0Clocked$$T(x10.core.Int.$box(i));
                                        
//#line 26 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
((Clocked<x10.core.Int>)this.
                                                                                                                         x).next();
                                    }
                                }
                                {
                                    
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int t77832 =
                                      i77794;
                                    
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int t77833 =
                                      ((t77832) + (((int)(1))));
                                    
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
i77794 = t77833;
                                }
                            }
                        }
                    }
                    
//#line 28 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
((Clocked<x10.core.Int>)this.
                                                                                                     x).$set__0Clocked$$T(x10.core.Int.$box(-1));
                    
//#line 29 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
((Clocked<x10.core.Int>)this.
                                                                                                     x).next();
                }
                
                public int N;
                public Clocked<x10.core.Int> x;
                
                // creation method for java code
                public static Sieve.$Closure$59 $make(final int N,
                                                      final Clocked<x10.core.Int> x,java.lang.Class<?> $dummy0){return new $Closure$59(N,x,(java.lang.Class<?>) null);}
                public $Closure$59(final int N,
                                   final Clocked<x10.core.Int> x,java.lang.Class<?> $dummy0) { {
                                                                                                      this.N = N;
                                                                                                      this.x = ((Clocked)(x));
                                                                                                  }}
                
            }
            
        public static class $Closure$60 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$60.class);
            
            public static final x10.rtt.RuntimeType<$Closure$60> $RTT = new x10.rtt.StaticVoidFunType<$Closure$60>(
            /* base class */$Closure$60.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$60 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$60.class + " calling"); } 
                Clocked nums = (Clocked) $deserializer.readRef();
                $_obj.nums = nums;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$60 $_obj = new $Closure$60((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (nums instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.nums);
                } else {
                $serializer.write(this.nums);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$60(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 39 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int n =
                      x10.core.Int.$unbox(((Clocked<x10.core.Int>)this.
                                                                    nums).$apply$G());
                    
//#line 40 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final boolean t77839 =
                      ((n) > (((int)(0))));
                    
//#line 40 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
if (t77839) {
                        
//#line 41 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final x10.io.Printer t77835 =
                          ((x10.io.Printer)(x10.io.Console.OUT));
                        
//#line 41 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final java.lang.String t77836 =
                          ((" ") + ((x10.core.Int.$box(n))));
                        
//#line 41 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
t77835.print(((java.lang.String)(t77836)));
                        
//#line 42 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
((Clocked<x10.core.Int>)this.
                                                                                                         nums).next();
                        
//#line 43 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final Clocked<x10.core.Int> t77837 =
                          Sieve.sieve__1$1x10$lang$Int$2((int)(n),
                                                         ((Clocked)(this.
                                                                      nums)));
                        
//#line 43 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
Sieve.primes__0$1x10$lang$Int$2(((Clocked)(t77837)));
                    } else {
                        
//#line 45 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final x10.io.Printer t77838 =
                          ((x10.io.Printer)(x10.io.Console.OUT));
                        
//#line 45 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
t77838.println();
                    }
                }
                
                public Clocked<x10.core.Int> nums;
                
                // creation method for java code
                public static Sieve.$Closure$60 $make(final Clocked<x10.core.Int> nums,java.lang.Class<?> $dummy0){return new $Closure$60(nums,(java.lang.Class<?>) null);}
                public $Closure$60(final Clocked<x10.core.Int> nums,java.lang.Class<?> $dummy0) { {
                                                                                                         this.nums = ((Clocked)(nums));
                                                                                                     }}
                
            }
            
        public static class $Closure$61 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$61.class);
            
            public static final x10.rtt.RuntimeType<$Closure$61> $RTT = new x10.rtt.StaticVoidFunType<$Closure$61>(
            /* base class */$Closure$61.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$61 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$61.class + " calling"); } 
                Clocked nums = (Clocked) $deserializer.readRef();
                $_obj.nums = nums;
                $_obj.prime = $deserializer.readInt();
                Clocked result = (Clocked) $deserializer.readRef();
                $_obj.result = result;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$61 $_obj = new $Closure$61((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (nums instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.nums);
                } else {
                $serializer.write(this.nums);
                }
                $serializer.write(this.prime);
                if (result instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.result);
                } else {
                $serializer.write(this.result);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$61(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 71 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
int m =
                      x10.core.Int.$unbox(((Clocked<x10.core.Int>)this.
                                                                    nums).$apply$G());
                    
//#line 72 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
while (true) {
                        
//#line 73 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int t77849 =
                          m;
                        
//#line 73 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final boolean t77850 =
                          ((t77849) < (((int)(0))));
                        
//#line 73 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
if (t77850) {
                            
//#line 74 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
break;
                        }
                        
//#line 75 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int t77851 =
                          m;
                        
//#line 75 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int t77852 =
                          ((t77851) % (((int)(this.
                                                prime))));
                        
//#line 75 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final boolean t77854 =
                          ((int) t77852) !=
                        ((int) 0);
                        
//#line 75 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
if (t77854) {
                            
//#line 76 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int t77853 =
                              m;
                            
//#line 76 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
((Clocked<x10.core.Int>)this.
                                                                                                             result).$set__0Clocked$$T(x10.core.Int.$box(t77853));
                            
//#line 77 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
((Clocked<x10.core.Int>)this.
                                                                                                             result).next();
                        }
                        
//#line 79 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
((Clocked<x10.core.Int>)this.
                                                                                                         nums).next();
                        
//#line 80 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
final int t77855 =
                          x10.core.Int.$unbox(((Clocked<x10.core.Int>)this.
                                                                        nums).$apply$G());
                        
//#line 80 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
m = t77855;
                    }
                    
//#line 82 "C:/eclipsews/pppp11/pppp11/src/Sieve.x10"
((Clocked<x10.core.Int>)this.
                                                                                                     result).$set__0Clocked$$T(x10.core.Int.$box(-1));
                }
                
                public Clocked<x10.core.Int> nums;
                public int prime;
                public Clocked<x10.core.Int> result;
                
                // creation method for java code
                public static Sieve.$Closure$61 $make(final Clocked<x10.core.Int> nums,
                                                      final int prime,
                                                      final Clocked<x10.core.Int> result,java.lang.Class<?> $dummy0){return new $Closure$61(nums,prime,result,(java.lang.Class<?>) null);}
                public $Closure$61(final Clocked<x10.core.Int> nums,
                                   final int prime,
                                   final Clocked<x10.core.Int> result,java.lang.Class<?> $dummy0) { {
                                                                                                           this.nums = ((Clocked)(nums));
                                                                                                           this.prime = prime;
                                                                                                           this.result = ((Clocked)(result));
                                                                                                       }}
                
            }
            
        
        }
        