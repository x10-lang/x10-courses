
public class MontyPi3 extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, MontyPi3.class);
    
    public static final x10.rtt.RuntimeType<MontyPi3> $RTT = new x10.rtt.NamedType<MontyPi3>(
    "MontyPi3", /* base class */MontyPi3.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(MontyPi3 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + MontyPi3.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        MontyPi3 $_obj = new MontyPi3((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public MontyPi3(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
//#line 4 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
public static MontyPi3.Anonymous$74 summer;
        
        
//#line 8 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        MontyPi3.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> s) {
            
//#line 9 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
assert ((((x10.array.Array<java.lang.String>)s).
                                                                                size) >= (((int)(1)))): "Usage: MontyPi [<number of points per place:Int>]";
            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final int t84902 =
              ((x10.array.Array<java.lang.String>)s).
                size;
            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final boolean t84904 =
              ((t84902) > (((int)(0))));
            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
int t84905 =
               0;
            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
if (t84904) {
                
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final java.lang.String t84903 =
                  ((x10.array.Array<java.lang.String>)s).$apply$G((int)(0));
                
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
t84905 = java.lang.Integer.parseInt(t84903);
            } else {
                
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
t84905 = 10000;
            }
            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final int N =
              t84905;
            
//#line 11 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final long t84906 =
              x10.lang.System.nanoTime$O();
            
//#line 11 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final long t84907 =
              (-(t84906));
            
//#line 11 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
double start =
              ((double)(long)(((long)(t84907))));
            
//#line 12 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double sum;
            {
                
//#line 12 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final x10.lang.FinishState x10$__var38 =
                  ((x10.lang.FinishState)(x10.lang.Runtime.<x10.core.Double>startCollectingFinish__0$1x10$lang$Runtime$$T$2(x10.rtt.Types.DOUBLE, ((x10.lang.Reducible)(MontyPi3.getInitialized$summer())))));
                
//#line 12 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
try {try {{
                    {
                        
//#line 13 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final x10.lang.Sequence<x10.lang.Place> t84909 =
                          x10.lang.Place.places();
                        
//#line 13 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final x10.lang.Iterator<x10.lang.Place> p84901 =
                          ((x10.lang.Iterator<x10.lang.Place>)
                            ((x10.lang.Iterable<x10.lang.Place>)t84909).iterator());
                        
//#line 13 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
for (;
                                                                                       true;
                                                                                       ) {
                            
//#line 13 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final boolean t84922 =
                              ((x10.lang.Iterator<x10.lang.Place>)p84901).hasNext$O();
                            
//#line 13 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
if (!(t84922)) {
                                
//#line 13 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
break;
                            }
                            {
                                
//#line 13 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final x10.lang.Place p =
                                  ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p84901).next$G()));
                                
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
x10.lang.Runtime.runAsync(((x10.lang.Place)(p)),
                                                                                                                    ((x10.core.fun.VoidFun_0_0)(new MontyPi3.$Closure$98(N))));
                            }
                            {
                                
                            }
                        }
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__32__) {
                    
//#line 12 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__32__)));
                    
//#line 12 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
throw new x10.lang.RuntimeException();
                }finally {{
                     
//#line 12 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
sum = x10.core.Double.$unbox(x10.lang.Runtime.<x10.core.Double>stopCollectingFinish$G(x10.rtt.Types.DOUBLE, ((x10.lang.FinishState)(x10$__var38))));
                 }}
                }
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double t84923 =
              ((double)(int)(((int)(4))));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double t84926 =
              ((t84923) * (((double)(sum))));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final int t84924 =
              x10.lang.Place.getInitialized$MAX_PLACES();
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final int t84925 =
              ((N) * (((int)(t84924))));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double t84927 =
              ((double)(int)(((int)(t84925))));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double pi =
              ((t84926) / (((double)(t84927))));
            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double t84929 =
              start;
            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final long t84928 =
              x10.lang.System.nanoTime$O();
            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double t84930 =
              ((double)(long)(((long)(t84928))));
            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double t84931 =
              ((t84929) + (((double)(t84930))));
            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
start = t84931;
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final x10.io.Printer t84939 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final java.lang.String t84932 =
              (("The value of pi is ") + ((x10.core.Double.$box(pi))));
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final java.lang.String t84936 =
              ((t84932) + (" (t="));
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double t84934 =
              start;
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final int t84933 =
              1000000;
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double t84935 =
              ((double)(int)(((int)(t84933))));
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double t84937 =
              ((t84934) / (((double)(t84935))));
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final java.lang.String t84938 =
              ((t84936) + ((x10.core.Double.$box(t84937))));
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final java.lang.String t84940 =
              ((t84938) + (" ms)."));
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
t84939.println(((java.lang.String)(t84940)));
            }
        
        
//#line 3 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final public MontyPi3
                                                                   MontyPi3$$MontyPi3$this(
                                                                   ){
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
return MontyPi3.this;
        }
        
        
//#line 3 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
// creation method for java code
        public static MontyPi3 $make(){return new MontyPi3((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public MontyPi3 MontyPi3$$init$S() { {
                                                          {
                                                              
//#line 3 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"

                                                          }
                                                          {
                                                              {
                                                                  
//#line 3 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"

                                                              }
                                                              {
                                                                  
                                                              }
                                                          }
                                                      }
                                                      return this;
                                                      }
        
        // constructor
        public MontyPi3 $init(){return MontyPi3$$init$S();}
        
        
        
//#line 4 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final public static class Anonymous$74 extends x10.core.Ref implements x10.lang.Reducible, x10.x10rt.X10JavaSerializable
                                                                 {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, Anonymous$74.class);
            
            public static final x10.rtt.RuntimeType<Anonymous$74> $RTT = new x10.rtt.NamedType<Anonymous$74>(
            "MontyPi3.Anonymous$74", /* base class */Anonymous$74.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.lang.Reducible.$RTT, x10.rtt.Types.DOUBLE), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body(Anonymous$74 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + Anonymous$74.class + " calling"); } 
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                Anonymous$74 $_obj = new Anonymous$74((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                
            }
            
            // constructor just for allocation
            public Anonymous$74(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public x10.lang.Reducible.operator()(T,T):T
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return x10.core.Double.$box($apply$O(x10.core.Double.$unbox(a1), x10.core.Double.$unbox(a2)));
            }
            // bridge for method abstract public x10.lang.Reducible.zero():T
            public x10.core.Double
              zero$G(){return x10.core.Double.$box(zero$O());}
            
                
                
//#line 5 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
public double
                                                                           zero$O(
                                                                           ){
                    
//#line 5 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
return 0.0;
                }
                
                
//#line 6 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
public double
                                                                           $apply$O(
                                                                           final double i,
                                                                           final double j){
                    
//#line 6 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double t84941 =
                      ((i) + (((double)(j))));
                    
//#line 6 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
return t84941;
                }
                
                
//#line 4 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
// creation method for java code
                public static MontyPi3.Anonymous$74 $make(){return new MontyPi3.Anonymous$74((java.lang.System[]) null).$init();}
                
                // constructor for non-virtual call
                final public MontyPi3.Anonymous$74 MontyPi3$Anonymous$74$$init$S() { {
                                                                                            
//#line 4 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"

                                                                                        }
                                                                                        return this;
                                                                                        }
                
                // constructor
                public MontyPi3.Anonymous$74 $init(){return MontyPi3$Anonymous$74$$init$S();}
                
            
        }
        
        public static int fieldId$summer;
        final public static x10.core.concurrent.AtomicInteger initStatus$summer = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        
        public static void
          getDeserialized$summer(
          byte[] buf){
            if (((boolean) x10.x10rt.X10JavaSerializable.CUSTOM_JAVA_SERIALIZATION) ==
                  ((boolean) true)) {
                MontyPi3.summer = ((MontyPi3.Anonymous$74)(x10.runtime.impl.java.InitDispatcher.deserializeField(((byte[])(buf)))));
            } else {
                MontyPi3.summer = ((MontyPi3.Anonymous$74)(x10.rtt.Types.<MontyPi3.Anonymous$74> cast(x10.runtime.impl.java.InitDispatcher.deserializeField(((byte[])(buf))),MontyPi3.Anonymous$74.$RTT)));
            }
            MontyPi3.initStatus$summer.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        }
        
        public static MontyPi3.Anonymous$74
          getInitialized$summer(
          ){
            if (((int) x10.lang.Runtime.hereInt$O()) ==
                ((int) 0)) {
                if (MontyPi3.initStatus$summer.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED),
                                                             (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                    MontyPi3.summer = ((MontyPi3.Anonymous$74)(new MontyPi3.Anonymous$74((java.lang.System[]) null).$init()));
                    if (((boolean) x10.x10rt.X10JavaSerializable.CUSTOM_JAVA_SERIALIZATION) ==
                          ((boolean) true)) {
                        x10.runtime.impl.java.InitDispatcher.broadcastStaticField(((java.lang.Object)(MontyPi3.summer)),
                                                                                  (int)(MontyPi3.fieldId$summer));
                    } else {
                        x10.runtime.impl.java.InitDispatcher.broadcastStaticField(((java.lang.Object)(MontyPi3.summer)),
                                                                                  (int)(MontyPi3.fieldId$summer));
                    }
                    MontyPi3.initStatus$summer.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                }
            }
            if (((int) MontyPi3.initStatus$summer.get()) !=
                ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (((int) MontyPi3.initStatus$summer.get()) !=
                       ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
            }
            return MontyPi3.summer;
        }
        
        static {
                   MontyPi3.fieldId$summer = x10.runtime.impl.java.InitDispatcher.addInitializer(((java.lang.String)("MontyPi3")),
                                                                                                 ((java.lang.String)("summer")));
               }
        
        public static class $Closure$98 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$98.class);
            
            public static final x10.rtt.RuntimeType<$Closure$98> $RTT = new x10.rtt.StaticVoidFunType<$Closure$98>(
            /* base class */$Closure$98.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$98 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$98.class + " calling"); } 
                $_obj.N = $deserializer.readInt();
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$98 $_obj = new $Closure$98((java.lang.System[]) null);
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
            public $Closure$98(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 15 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final x10.util.Random r =
                      ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).$init()));
                    
//#line 16 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
double a =
                      0.0;
                    {
                        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final int i84885min84886 =
                          1;
                        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final int i84885max84887 =
                          this.
                            N;
                        {
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
int i84885 =
                              i84885min84886;
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
for (;
                                                                                           true;
                                                                                           ) {
                                
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final int t84911 =
                                  i84885;
                                
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final boolean t84920 =
                                  ((t84911) <= (((int)(i84885max84887))));
                                
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
if (!(t84920)) {
                                    
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
break;
                                }
                                {
                                    
//#line 18 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double x =
                                      r.nextDouble$O();
                                    
//#line 18 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double y =
                                      r.nextDouble$O();
                                    
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double t84914 =
                                      ((x) * (((double)(x))));
                                    
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double t84915 =
                                      ((y) * (((double)(y))));
                                    
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double t84916 =
                                      ((t84914) + (((double)(t84915))));
                                    
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final boolean t84919 =
                                      ((t84916) <= (((double)(1.0))));
                                    
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
if (t84919) {
                                        
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double t84917 =
                                          a;
                                        
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double t84918 =
                                          ((t84917) + (((double)(1.0))));
                                        
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
a = t84918;
                                    }
                                }
                                {
                                    
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final int t84912 =
                                      i84885;
                                    
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final int t84913 =
                                      ((t84912) + (((int)(1))));
                                    
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
i84885 = t84913;
                                }
                            }
                        }
                    }
                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
final double t84921 =
                      a;
                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/MontyPi3.x10"
x10.lang.Runtime.<x10.core.Double>makeOffer__0x10$lang$Runtime$$T(x10.rtt.Types.DOUBLE, x10.core.Double.$box(t84921));
                }
                
                public int N;
                
                // creation method for java code
                public static MontyPi3.$Closure$98 $make(final int N){return new $Closure$98(N);}
                public $Closure$98(final int N) { {
                                                         this.N = N;
                                                     }}
                
            }
            
        
        }
        