
public class MontyPiCF extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, MontyPiCF.class);
    
    public static final x10.rtt.RuntimeType<MontyPiCF> $RTT = new x10.rtt.NamedType<MontyPiCF>(
    "MontyPiCF", /* base class */MontyPiCF.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(MontyPiCF $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + MontyPiCF.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        MontyPiCF $_obj = new MontyPiCF((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public MontyPiCF(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 5 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        MontyPiCF.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> s) {
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
assert ((((x10.array.Array<java.lang.String>)s).
                                                                                 size) >= (((int)(1)))): "Usage: MontyPi [<number of points per place:Int>]";
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final int t84642 =
              ((x10.array.Array<java.lang.String>)s).
                size;
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final boolean t84644 =
              ((t84642) > (((int)(0))));
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
int t84645 =
               0;
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
if (t84644) {
                
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final java.lang.String t84643 =
                  ((x10.array.Array<java.lang.String>)s).$apply$G((int)(0));
                
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
t84645 = java.lang.Integer.parseInt(t84643);
            } else {
                
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
t84645 = 10000;
            }
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final int N =
              t84645;
            
//#line 8 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final long t84646 =
              x10.lang.System.nanoTime$O();
            
//#line 8 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final long t84647 =
              (-(t84646));
            
//#line 8 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
double start =
              ((double)(long)(((long)(t84647))));
            
//#line 9 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final MontyPiCF.Anonymous$321 reducer =
              ((MontyPiCF.Anonymous$321)(new MontyPiCF.Anonymous$321((java.lang.System[]) null).$init()));
            
//#line 13 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double result;
            {
                
//#line 13 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final x10.lang.FinishState x10$__var37 =
                  ((x10.lang.FinishState)(x10.lang.Runtime.<x10.core.Double>startCollectingFinish__0$1x10$lang$Runtime$$T$2(x10.rtt.Types.DOUBLE, ((x10.lang.Reducible)(reducer)))));
                
//#line 13 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
try {try {{
                    {
                        
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final x10.array.Dist t84649 =
                          ((x10.array.Dist)(x10.array.Dist.makeUnique()));
                        
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final x10.array.PlaceGroup t84650 =
                          t84649.places();
                        
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final x10.lang.Iterator<x10.lang.Place> p84641 =
                          ((x10.lang.Iterable<x10.lang.Place>)t84650).iterator();
                        
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
for (;
                                                                                        true;
                                                                                        ) {
                            
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final boolean t84663 =
                              ((x10.lang.Iterator<x10.lang.Place>)p84641).hasNext$O();
                            
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
if (!(t84663)) {
                                
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
break;
                            }
                            {
                                
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final x10.lang.Place p =
                                  ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p84641).next$G()));
                                
//#line 14 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
x10.lang.Runtime.runAsync(((x10.lang.Place)(p)),
                                                                                                                     ((x10.core.fun.VoidFun_0_0)(new MontyPiCF.$Closure$97(N))));
                            }
                            {
                                
                            }
                        }
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__31__) {
                    
//#line 13 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__31__)));
                    
//#line 13 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
throw new x10.lang.RuntimeException();
                }finally {{
                     
//#line 13 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
result = x10.core.Double.$unbox(x10.lang.Runtime.<x10.core.Double>stopCollectingFinish$G(x10.rtt.Types.DOUBLE, ((x10.lang.FinishState)(x10$__var37))));
                 }}
                }
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double t84664 =
              ((double)(int)(((int)(4))));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double t84667 =
              ((t84664) * (((double)(result))));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final int t84665 =
              x10.lang.Place.getInitialized$MAX_PLACES();
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final int t84666 =
              ((N) * (((int)(t84665))));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double t84668 =
              ((double)(int)(((int)(t84666))));
            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double pi =
              ((t84667) / (((double)(t84668))));
            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double t84670 =
              start;
            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final long t84669 =
              x10.lang.System.nanoTime$O();
            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double t84671 =
              ((double)(long)(((long)(t84669))));
            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double t84672 =
              ((t84670) + (((double)(t84671))));
            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
start = t84672;
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final x10.io.Printer t84680 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final java.lang.String t84673 =
              (("The value of pi is ") + ((x10.core.Double.$box(pi))));
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final java.lang.String t84677 =
              ((t84673) + (" (t="));
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double t84675 =
              start;
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final int t84674 =
              1000000;
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double t84676 =
              ((double)(int)(((int)(t84674))));
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double t84678 =
              ((t84675) / (((double)(t84676))));
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final java.lang.String t84679 =
              ((t84677) + ((x10.core.Double.$box(t84678))));
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final java.lang.String t84681 =
              ((t84679) + (" ms)."));
            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
t84680.println(((java.lang.String)(t84681)));
            }
        
        
//#line 4 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final public MontyPiCF
                                                                    MontyPiCF$$MontyPiCF$this(
                                                                    ){
            
//#line 4 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
return MontyPiCF.this;
        }
        
        
//#line 4 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
// creation method for java code
        public static MontyPiCF $make(){return new MontyPiCF((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public MontyPiCF MontyPiCF$$init$S() { {
                                                            {
                                                                
//#line 4 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"

                                                            }
                                                            {
                                                                {
                                                                    
//#line 4 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"

                                                                }
                                                                {
                                                                    
                                                                }
                                                            }
                                                        }
                                                        return this;
                                                        }
        
        // constructor
        public MontyPiCF $init(){return MontyPiCF$$init$S();}
        
        
        
//#line 9 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final public static class Anonymous$321 extends x10.core.Ref implements x10.lang.Reducible, x10.x10rt.X10JavaSerializable
                                                                  {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, Anonymous$321.class);
            
            public static final x10.rtt.RuntimeType<Anonymous$321> $RTT = new x10.rtt.NamedType<Anonymous$321>(
            "MontyPiCF.Anonymous$321", /* base class */Anonymous$321.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.lang.Reducible.$RTT, x10.rtt.Types.DOUBLE), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body(Anonymous$321 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + Anonymous$321.class + " calling"); } 
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                Anonymous$321 $_obj = new Anonymous$321((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                
            }
            
            // constructor just for allocation
            public Anonymous$321(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public x10.lang.Reducible.operator()(T,T):T
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return x10.core.Double.$box($apply$O(x10.core.Double.$unbox(a1), x10.core.Double.$unbox(a2)));
            }
            // bridge for method abstract public x10.lang.Reducible.zero():T
            public x10.core.Double
              zero$G(){return x10.core.Double.$box(zero$O());}
            
                
                
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
public double
                                                                             zero$O(
                                                                             ){
                    
//#line 10 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
return 0.0;
                }
                
                
//#line 11 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
public double
                                                                             $apply$O(
                                                                             final double a,
                                                                             final double b){
                    
//#line 11 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double t84682 =
                      ((a) + (((double)(b))));
                    
//#line 11 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
return t84682;
                }
                
                
//#line 9 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
// creation method for java code
                public static MontyPiCF.Anonymous$321 $make(){return new MontyPiCF.Anonymous$321((java.lang.System[]) null).$init();}
                
                // constructor for non-virtual call
                final public MontyPiCF.Anonymous$321 MontyPiCF$Anonymous$321$$init$S() { {
                                                                                                
//#line 9 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"

                                                                                            }
                                                                                            return this;
                                                                                            }
                
                // constructor
                public MontyPiCF.Anonymous$321 $init(){return MontyPiCF$Anonymous$321$$init$S();}
                
            
        }
        
        public static class $Closure$97 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$97.class);
            
            public static final x10.rtt.RuntimeType<$Closure$97> $RTT = new x10.rtt.StaticVoidFunType<$Closure$97>(
            /* base class */$Closure$97.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$97 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$97.class + " calling"); } 
                $_obj.N = $deserializer.readInt();
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$97 $_obj = new $Closure$97((java.lang.System[]) null);
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
            public $Closure$97(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 15 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final x10.util.Random r =
                      ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).$init()));
                    
//#line 16 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
double result =
                      0.0;
                    {
                        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final int i84625min84626 =
                          1;
                        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final int i84625max84627 =
                          this.
                            N;
                        {
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
int i84625 =
                              i84625min84626;
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
for (;
                                                                                            true;
                                                                                            ) {
                                
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final int t84652 =
                                  i84625;
                                
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final boolean t84661 =
                                  ((t84652) <= (((int)(i84625max84627))));
                                
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
if (!(t84661)) {
                                    
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
break;
                                }
                                {
                                    
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final int j =
                                      i84625;
                                    {
                                        
//#line 18 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double x =
                                          r.nextDouble$O();
                                        
//#line 18 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double y =
                                          r.nextDouble$O();
                                        
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double t84655 =
                                          ((x) * (((double)(x))));
                                        
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double t84656 =
                                          ((y) * (((double)(y))));
                                        
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double t84657 =
                                          ((t84655) + (((double)(t84656))));
                                        
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final boolean t84660 =
                                          ((t84657) <= (((double)(1.0))));
                                        
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
if (t84660) {
                                            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double t84658 =
                                              result;
                                            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double t84659 =
                                              ((t84658) + (((double)(1.0))));
                                            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
result = t84659;
                                        }
                                    }
                                }
                                {
                                    
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final int t84653 =
                                      i84625;
                                    
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final int t84654 =
                                      ((t84653) + (((int)(1))));
                                    
//#line 17 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
i84625 = t84654;
                                }
                            }
                        }
                    }
                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
final double t84662 =
                      result;
                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/MontyPiCF.x10"
x10.lang.Runtime.<x10.core.Double>makeOffer__0x10$lang$Runtime$$T(x10.rtt.Types.DOUBLE, x10.core.Double.$box(t84662));
                }
                
                public int N;
                
                // creation method for java code
                public static MontyPiCF.$Closure$97 $make(final int N){return new $Closure$97(N);}
                public $Closure$97(final int N) { {
                                                         this.N = N;
                                                     }}
                
            }
            
        
        }
        