public class ClockedFib extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, ClockedFib.class);
    
    public static final x10.rtt.RuntimeType<ClockedFib> $RTT = new x10.rtt.NamedType<ClockedFib>(
    "ClockedFib", /* base class */ClockedFib.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(ClockedFib $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + ClockedFib.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        ClockedFib $_obj = new ClockedFib((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public ClockedFib(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 2 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        ClockedFib.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> s) {
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final int t77650 =
              ((x10.array.Array<java.lang.String>)s).
                size;
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final boolean t77652 =
              ((t77650) > (((int)(0))));
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
int t77653 =
               0;
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
if (t77652) {
                
//#line 3 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final java.lang.String t77651 =
                  ((x10.array.Array<java.lang.String>)s).$apply$G((int)(0));
                
//#line 3 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
t77653 = java.lang.Integer.parseInt(t77651);
            } else {
                
//#line 3 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
t77653 = 1000;
            }
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final int N =
              t77653;
            {
                
//#line 4 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
x10.lang.Runtime.ensureNotInAtomic();
                
//#line 4 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final x10.lang.FinishState x10$__var22 =
                  x10.lang.Runtime.startFinish();
                
//#line 4 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
try {try {{
                    {
                        
//#line 4 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new ClockedFib.$Closure$57(N))));
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__18__) {
                    
//#line 4 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__18__)));
                    
//#line 4 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
throw new x10.lang.RuntimeException();
                }finally {{
                     
//#line 4 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var22)));
                 }}
                }
            }
        
        
//#line 1 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final public ClockedFib
                                                                     ClockedFib$$ClockedFib$this(
                                                                     ){
            
//#line 1 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
return ClockedFib.this;
        }
        
        
//#line 1 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
// creation method for java code
        public static ClockedFib $make(){return new ClockedFib((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public ClockedFib ClockedFib$$init$S() { {
                                                              {
                                                                  
//#line 1 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"

                                                              }
                                                              {
                                                                  {
                                                                      
//#line 1 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"

                                                                  }
                                                                  {
                                                                      
                                                                  }
                                                              }
                                                          }
                                                          return this;
                                                          }
        
        // constructor
        public ClockedFib $init(){return ClockedFib$$init$S();}
        
        
        public static class $Closure$55 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$55.class);
            
            public static final x10.rtt.RuntimeType<$Closure$55> $RTT = new x10.rtt.StaticVoidFunType<$Closure$55>(
            /* base class */$Closure$55.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$55 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$55.class + " calling"); } 
                Clocked y = (Clocked) $deserializer.readRef();
                $_obj.y = y;
                $_obj.N = $deserializer.readInt();
                Clocked x = (Clocked) $deserializer.readRef();
                $_obj.x = x;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$55 $_obj = new $Closure$55((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (y instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.y);
                } else {
                $serializer.write(this.y);
                }
                $serializer.write(this.N);
                if (x instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.x);
                } else {
                $serializer.write(this.x);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$55(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 8 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
while (true) {
                        
//#line 8 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final int t77654 =
                          x10.core.Int.$unbox(((Clocked<x10.core.Int>)this.
                                                                        y).$apply$G());
                        
//#line 8 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final boolean t77658 =
                          ((t77654) < (((int)(this.
                                                N))));
                        
//#line 8 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
if (!(t77658)) {
                            
//#line 8 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
break;
                        }
                        {
                            
//#line 9 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final int t77655 =
                              x10.core.Int.$unbox(((Clocked<x10.core.Int>)this.
                                                                            x).$apply$G());
                            
//#line 9 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final int t77656 =
                              x10.core.Int.$unbox(((Clocked<x10.core.Int>)this.
                                                                            y).$apply$G());
                            
//#line 9 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final int t77657 =
                              ((t77655) + (((int)(t77656))));
                            
//#line 9 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
((Clocked<x10.core.Int>)this.
                                                                                                                 x).$set__0Clocked$$T(x10.core.Int.$box(t77657));
                            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
((Clocked<x10.core.Int>)this.
                                                                                                                  x).next();
                            
//#line 11 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
((Clocked<x10.core.Int>)this.
                                                                                                                  y).next();
                        }
                    }
                    
//#line 13 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final int t77659 =
                      java.lang.Integer.MAX_VALUE;
                    
//#line 13 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
((Clocked<x10.core.Int>)this.
                                                                                                          x).$set__0Clocked$$T(x10.core.Int.$box(t77659));
                }
                
                public Clocked<x10.core.Int> y;
                public int N;
                public Clocked<x10.core.Int> x;
                
                // creation method for java code
                public static ClockedFib.$Closure$55 $make(final Clocked<x10.core.Int> y,
                                                           final int N,
                                                           final Clocked<x10.core.Int> x,java.lang.Class<?> $dummy0){return new $Closure$55(y,N,x,(java.lang.Class<?>) null);}
                public $Closure$55(final Clocked<x10.core.Int> y,
                                   final int N,
                                   final Clocked<x10.core.Int> x,java.lang.Class<?> $dummy0) { {
                                                                                                      this.y = ((Clocked)(y));
                                                                                                      this.N = N;
                                                                                                      this.x = ((Clocked)(x));
                                                                                                  }}
                
            }
            
        public static class $Closure$56 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$56.class);
            
            public static final x10.rtt.RuntimeType<$Closure$56> $RTT = new x10.rtt.StaticVoidFunType<$Closure$56>(
            /* base class */$Closure$56.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$56 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$56.class + " calling"); } 
                Clocked x = (Clocked) $deserializer.readRef();
                $_obj.x = x;
                $_obj.N = $deserializer.readInt();
                Clocked y = (Clocked) $deserializer.readRef();
                $_obj.y = y;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$56 $_obj = new $Closure$56((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (x instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.x);
                } else {
                $serializer.write(this.x);
                }
                $serializer.write(this.N);
                if (y instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.y);
                } else {
                $serializer.write(this.y);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$56(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 16 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
while (true) {
                        
//#line 16 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final int t77660 =
                          x10.core.Int.$unbox(((Clocked<x10.core.Int>)this.
                                                                        x).$apply$G());
                        
//#line 16 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final boolean t77665 =
                          ((t77660) < (((int)(this.
                                                N))));
                        
//#line 16 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
if (!(t77665)) {
                            
//#line 16 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
break;
                        }
                        {
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final int t77661 =
                              x10.core.Int.$unbox(((Clocked<x10.core.Int>)this.
                                                                            x).$apply$G());
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
((Clocked<x10.core.Int>)this.
                                                                                                                  y).$set__0Clocked$$T(x10.core.Int.$box(t77661));
                            
//#line 18 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final x10.io.Printer t77663 =
                              ((x10.io.Printer)(x10.io.Console.OUT));
                            
//#line 18 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final int t77662 =
                              x10.core.Int.$unbox(((Clocked<x10.core.Int>)this.
                                                                            x).$apply$G());
                            
//#line 18 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final java.lang.String t77664 =
                              ((" ") + ((x10.core.Int.$box(t77662))));
                            
//#line 18 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
t77663.print(((java.lang.String)(t77664)));
                            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
((Clocked<x10.core.Int>)this.
                                                                                                                  x).next();
                            
//#line 20 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
((Clocked<x10.core.Int>)this.
                                                                                                                  y).next();
                        }
                    }
                    
//#line 22 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final int t77666 =
                      java.lang.Integer.MAX_VALUE;
                    
//#line 22 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
((Clocked<x10.core.Int>)this.
                                                                                                          y).$set__0Clocked$$T(x10.core.Int.$box(t77666));
                    
//#line 23 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final x10.io.Printer t77667 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 23 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
t77667.println();
                }
                
                public Clocked<x10.core.Int> x;
                public int N;
                public Clocked<x10.core.Int> y;
                
                // creation method for java code
                public static ClockedFib.$Closure$56 $make(final Clocked<x10.core.Int> x,
                                                           final int N,
                                                           final Clocked<x10.core.Int> y,java.lang.Class<?> $dummy0){return new $Closure$56(x,N,y,(java.lang.Class<?>) null);}
                public $Closure$56(final Clocked<x10.core.Int> x,
                                   final int N,
                                   final Clocked<x10.core.Int> y,java.lang.Class<?> $dummy0) { {
                                                                                                      this.x = ((Clocked)(x));
                                                                                                      this.N = N;
                                                                                                      this.y = ((Clocked)(y));
                                                                                                  }}
                
            }
            
        public static class $Closure$57 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$57.class);
            
            public static final x10.rtt.RuntimeType<$Closure$57> $RTT = new x10.rtt.StaticVoidFunType<$Closure$57>(
            /* base class */$Closure$57.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$57 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$57.class + " calling"); } 
                $_obj.N = $deserializer.readInt();
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$57 $_obj = new $Closure$57((java.lang.System[]) null);
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
            public $Closure$57(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 5 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final Clocked<x10.core.Int> x =
                      ((Clocked)(new Clocked<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init((x10.core.Int.$box(1)),(java.lang.Class<?>) null)));
                    
//#line 6 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
final Clocked<x10.core.Int> y =
                      ((Clocked)(new Clocked<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init((x10.core.Int.$box(1)),(java.lang.Class<?>) null)));
                    
//#line 7 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
x10.lang.Runtime.runAsync__0$1x10$lang$Clock$2(((x10.array.Array)(x10.core.ArrayFactory.<x10.lang.Clock> makeArrayFromJavaArray(x10.lang.Clock.$RTT, new x10.lang.Clock[] {((Clocked<x10.core.Int>)x).
                                                                                                                                                                                                                                                            clock, ((Clocked<x10.core.Int>)y).
                                                                                                                                                                                                                                                                     clock}))),
                                                                                                                              ((x10.core.fun.VoidFun_0_0)(new ClockedFib.$Closure$55(y,
                                                                                                                                                                                     ((int)(this.
                                                                                                                                                                                              N)),
                                                                                                                                                                                     x,(java.lang.Class<?>) null))));
                    
//#line 15 "C:/eclipsews/pppp11/pppp11/src/ClockedFib.x10"
x10.lang.Runtime.runAsync__0$1x10$lang$Clock$2(((x10.array.Array)(x10.core.ArrayFactory.<x10.lang.Clock> makeArrayFromJavaArray(x10.lang.Clock.$RTT, new x10.lang.Clock[] {((Clocked<x10.core.Int>)x).
                                                                                                                                                                                                                                                             clock, ((Clocked<x10.core.Int>)y).
                                                                                                                                                                                                                                                                      clock}))),
                                                                                                                               ((x10.core.fun.VoidFun_0_0)(new ClockedFib.$Closure$56(x,
                                                                                                                                                                                      ((int)(this.
                                                                                                                                                                                               N)),
                                                                                                                                                                                      y,(java.lang.Class<?>) null))));
                }
                
                public int N;
                
                // creation method for java code
                public static ClockedFib.$Closure$57 $make(final int N){return new $Closure$57(N);}
                public $Closure$57(final int N) { {
                                                         this.N = N;
                                                     }}
                
            }
            
        
        }
        