public class AllReduceClock extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, AllReduceClock.class);
    
    public static final x10.rtt.RuntimeType<AllReduceClock> $RTT = new x10.rtt.NamedType<AllReduceClock>(
    "AllReduceClock", /* base class */AllReduceClock.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(AllReduceClock $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + AllReduceClock.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        AllReduceClock $_obj = new AllReduceClock((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public AllReduceClock(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 13 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
public static boolean
                                                                          even$O(
                                                                          final int p){
            
//#line 13 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int t79301 =
              ((p) % (((int)(2))));
            
//#line 13 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final boolean t79302 =
              ((int) t79301) ==
            ((int) 0);
            
//#line 13 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
return t79302;
        }
        
        
//#line 14 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
public static int
                                                                          allReduce__0$1x10$lang$Int$2__1$1x10$lang$Int$2$O(
                                                                          final x10.array.DistArray<x10.core.Int> red,
                                                                          final x10.array.DistArray<x10.core.Int> black){
            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int P =
              x10.lang.Place.getInitialized$MAX_PLACES();
            
//#line 16 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int phases =
              Utils.log2$O((int)(P));
            {
                
//#line 17 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
x10.lang.Clock x10$__var28 =
                  null;
                {
                    
//#line 17 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
x10.lang.Runtime.ensureNotInAtomic();
                    
//#line 17 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final x10.lang.FinishState x10$__var29 =
                      x10.lang.Runtime.startFinish();
                    
//#line 17 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
try {try {{
                        {
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
try {{
                                
//#line 17 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final x10.lang.Clock x10$__var27 =
                                  x10.lang.Clock.make();
                                
//#line 17 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
x10$__var28 = x10$__var27;
                                
//#line 18 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final x10.array.Dist t79304 =
                                  ((x10.array.Dist)(((x10.array.DistArray<x10.core.Int>)red).
                                                      dist));
                                
//#line 18 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final x10.array.PlaceGroup t79305 =
                                  t79304.places();
                                
//#line 18 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final x10.lang.Iterator<x10.lang.Place> p79300 =
                                  ((x10.lang.Iterable<x10.lang.Place>)t79305).iterator();
                                
//#line 18 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
for (;
                                                                                                     true;
                                                                                                     ) {
                                    
//#line 18 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final boolean t79324 =
                                      ((x10.lang.Iterator<x10.lang.Place>)p79300).hasNext$O();
                                    
//#line 18 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
if (!(t79324)) {
                                        
//#line 18 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
break;
                                    }
                                    {
                                        
//#line 18 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final x10.lang.Place p =
                                          ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p79300).next$G()));
                                        
//#line 18 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
x10.lang.Runtime.runAsync__1$1x10$lang$Clock$2(((x10.lang.Place)(p)),
                                                                                                                                                       ((x10.array.Array)(x10.core.ArrayFactory.<x10.lang.Clock> makeArrayFromJavaArray(x10.lang.Clock.$RTT, new x10.lang.Clock[] {x10$__var27}))),
                                                                                                                                                       ((x10.core.fun.VoidFun_0_0)(new AllReduceClock.$Closure$73(phases,
                                                                                                                                                                                                                  p,
                                                                                                                                                                                                                  P,
                                                                                                                                                                                                                  black,
                                                                                                                                                                                                                  red,(java.lang.Class<?>) null))));
                                    }
                                    {
                                        
                                    }
                                }
                            }}finally {{
                                  
//#line 17 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
if (((x10$__var28) != (null))) {
                                      
//#line 17 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
x10$__var28.drop();
                                  }
                              }}
                            }
                        }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__23__) {
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__23__)));
                            
//#line 17 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
throw new x10.lang.RuntimeException();
                        }finally {{
                             
//#line 17 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var29)));
                         }}
                    }
                }
                
//#line 38 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int t79325 =
                  ((phases) - (((int)(1))));
                
//#line 38 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final boolean t79326 =
                  AllReduceClock.even$O((int)(t79325));
                
//#line 38 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
int t79327 =
                   0;
                
//#line 38 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
if (t79326) {
                    
//#line 38 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
t79327 = x10.core.Int.$unbox(((x10.array.DistArray<x10.core.Int>)red).$apply$G((int)(0)));
                } else {
                    
//#line 38 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
t79327 = x10.core.Int.$unbox(((x10.array.DistArray<x10.core.Int>)black).$apply$G((int)(0)));
                }
                
//#line 38 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int t79328 =
                  t79327;
                
//#line 38 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
return t79328;
            }
            
            
//#line 40 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
            private static final long serialVersionUID = 1L;
            public static void main(java.lang.String[] args) {
            // start native runtime
            new $Main().start(args);
            }
            
            // called by native runtime inside main x10 thread
            public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
            // call the original app-main method
            AllReduceClock.main(args);
            }
            }
            
            // the original app-main method
            public static void main(final x10.array.Array<java.lang.String> id$68488) {
                
//#line 41 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
assert Utils.powerOf2$O((int)(x10.lang.Place.getInitialized$MAX_PLACES())): " Must run on power of 2 places.";
                
//#line 43 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final x10.array.Dist D =
                  ((x10.array.Dist)(x10.array.Dist.makeUnique()));
                
//#line 44 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final x10.core.fun.Fun_0_1<x10.array.Point,x10.core.Int> t79330 =
                  ((x10.core.fun.Fun_0_1)(new AllReduceClock.$Closure$74()));
                
//#line 44 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final x10.array.DistArray<x10.core.Int> black =
                  ((x10.array.DistArray)(x10.array.DistArray.<x10.core.Int>make__1$1x10$array$Point$3x10$array$DistArray$$T$2(x10.rtt.Types.INT, ((x10.array.Dist)(D)),
                                                                                                                              ((x10.core.fun.Fun_0_1)(t79330)))));
                
//#line 45 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final x10.core.fun.Fun_0_1<x10.array.Point,x10.core.Int> t79331 =
                  ((x10.core.fun.Fun_0_1)(new AllReduceClock.$Closure$75()));
                
//#line 45 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final x10.array.DistArray<x10.core.Int> red =
                  ((x10.array.DistArray)(x10.array.DistArray.<x10.core.Int>make__1$1x10$array$Point$3x10$array$DistArray$$T$2(x10.rtt.Types.INT, ((x10.array.Dist)(D)),
                                                                                                                              ((x10.core.fun.Fun_0_1)(t79331)))));
                
//#line 46 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int result =
                  AllReduceClock.allReduce__0$1x10$lang$Int$2__1$1x10$lang$Int$2$O(((x10.array.DistArray)(red)),
                                                                                   ((x10.array.DistArray)(black)));
                
//#line 47 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final x10.io.Printer t79332 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 47 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final java.lang.String t79333 =
                  (("allReduce = ") + ((x10.core.Int.$box(result))));
                
//#line 47 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
t79332.println(((java.lang.String)(t79333)));
            }
            
            
//#line 12 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final public AllReduceClock
                                                                              AllReduceClock$$AllReduceClock$this(
                                                                              ){
                
//#line 12 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
return AllReduceClock.this;
            }
            
            
//#line 12 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
// creation method for java code
            public static AllReduceClock $make(){return new AllReduceClock((java.lang.System[]) null).$init();}
            
            // constructor for non-virtual call
            final public AllReduceClock AllReduceClock$$init$S() { {
                                                                          {
                                                                              
//#line 12 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"

                                                                          }
                                                                          {
                                                                              {
                                                                                  
//#line 12 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"

                                                                              }
                                                                              {
                                                                                  
                                                                              }
                                                                          }
                                                                      }
                                                                      return this;
                                                                      }
            
            // constructor
            public AllReduceClock $init(){return AllReduceClock$$init$S();}
            
            
            public static class $Closure$71 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$71.class);
                
                public static final x10.rtt.RuntimeType<$Closure$71> $RTT = new x10.rtt.StaticVoidFunType<$Closure$71>(
                /* base class */$Closure$71.class
                , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$71 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$71.class + " calling"); } 
                    x10.array.DistArray black = (x10.array.DistArray) $deserializer.readRef();
                    $_obj.black = black;
                    $_obj.destId = $deserializer.readInt();
                    $_obj.elem = $deserializer.readInt();
                    x10.array.DistArray red = (x10.array.DistArray) $deserializer.readRef();
                    $_obj.red = red;
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$71 $_obj = new $Closure$71((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    if (black instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.black);
                    } else {
                    $serializer.write(this.black);
                    }
                    $serializer.write(this.destId);
                    $serializer.write(this.elem);
                    if (red instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.red);
                    } else {
                    $serializer.write(this.red);
                    }
                    
                }
                
                // constructor just for allocation
                public $Closure$71(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                
                    
                    public void
                      $apply(
                      ){
                        
//#line 26 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int t79314 =
                          x10.core.Int.$unbox(((x10.array.DistArray<x10.core.Int>)this.
                                                                                    black).$apply$G((int)(this.
                                                                                                            destId)));
                        
//#line 26 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int t79315 =
                          ((this.
                              elem) + (((int)(t79314))));
                        
//#line 26 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
((x10.array.DistArray<x10.core.Int>)this.
                                                                                                                              red).$set__1x10$array$DistArray$$T$G((int)(this.
                                                                                                                                                                           destId),
                                                                                                                                                                   x10.core.Int.$box(t79315));
                    }
                    
                    public x10.array.DistArray<x10.core.Int> black;
                    public int destId;
                    public int elem;
                    public x10.array.DistArray<x10.core.Int> red;
                    
                    // creation method for java code
                    public static AllReduceClock.$Closure$71 $make(final x10.array.DistArray<x10.core.Int> black,
                                                                   final int destId,
                                                                   final int elem,
                                                                   final x10.array.DistArray<x10.core.Int> red,java.lang.Class<?> $dummy0){return new $Closure$71(black,destId,elem,red,(java.lang.Class<?>) null);}
                    public $Closure$71(final x10.array.DistArray<x10.core.Int> black,
                                       final int destId,
                                       final int elem,
                                       final x10.array.DistArray<x10.core.Int> red,java.lang.Class<?> $dummy0) { {
                                                                                                                        this.black = ((x10.array.DistArray)(black));
                                                                                                                        this.destId = destId;
                                                                                                                        this.elem = elem;
                                                                                                                        this.red = ((x10.array.DistArray)(red));
                                                                                                                    }}
                    
                }
                
            public static class $Closure$72 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$72.class);
                
                public static final x10.rtt.RuntimeType<$Closure$72> $RTT = new x10.rtt.StaticVoidFunType<$Closure$72>(
                /* base class */$Closure$72.class
                , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$72 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$72.class + " calling"); } 
                    x10.array.DistArray red = (x10.array.DistArray) $deserializer.readRef();
                    $_obj.red = red;
                    $_obj.destId = $deserializer.readInt();
                    $_obj.elem = $deserializer.readInt();
                    x10.array.DistArray black = (x10.array.DistArray) $deserializer.readRef();
                    $_obj.black = black;
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$72 $_obj = new $Closure$72((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    if (red instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.red);
                    } else {
                    $serializer.write(this.red);
                    }
                    $serializer.write(this.destId);
                    $serializer.write(this.elem);
                    if (black instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.black);
                    } else {
                    $serializer.write(this.black);
                    }
                    
                }
                
                // constructor just for allocation
                public $Closure$72(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                
                    
                    public void
                      $apply(
                      ){
                        
//#line 30 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int t79318 =
                          x10.core.Int.$unbox(((x10.array.DistArray<x10.core.Int>)this.
                                                                                    red).$apply$G((int)(this.
                                                                                                          destId)));
                        
//#line 30 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int t79319 =
                          ((this.
                              elem) + (((int)(t79318))));
                        
//#line 30 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
((x10.array.DistArray<x10.core.Int>)this.
                                                                                                                              black).$set__1x10$array$DistArray$$T$G((int)(this.
                                                                                                                                                                             destId),
                                                                                                                                                                     x10.core.Int.$box(t79319));
                    }
                    
                    public x10.array.DistArray<x10.core.Int> red;
                    public int destId;
                    public int elem;
                    public x10.array.DistArray<x10.core.Int> black;
                    
                    // creation method for java code
                    public static AllReduceClock.$Closure$72 $make(final x10.array.DistArray<x10.core.Int> red,
                                                                   final int destId,
                                                                   final int elem,
                                                                   final x10.array.DistArray<x10.core.Int> black,java.lang.Class<?> $dummy0){return new $Closure$72(red,destId,elem,black,(java.lang.Class<?>) null);}
                    public $Closure$72(final x10.array.DistArray<x10.core.Int> red,
                                       final int destId,
                                       final int elem,
                                       final x10.array.DistArray<x10.core.Int> black,java.lang.Class<?> $dummy0) { {
                                                                                                                          this.red = ((x10.array.DistArray)(red));
                                                                                                                          this.destId = destId;
                                                                                                                          this.elem = elem;
                                                                                                                          this.black = ((x10.array.DistArray)(black));
                                                                                                                      }}
                    
                }
                
            public static class $Closure$73 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$73.class);
                
                public static final x10.rtt.RuntimeType<$Closure$73> $RTT = new x10.rtt.StaticVoidFunType<$Closure$73>(
                /* base class */$Closure$73.class
                , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$73 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$73.class + " calling"); } 
                    $_obj.phases = $deserializer.readInt();
                    x10.lang.Place p = (x10.lang.Place) $deserializer.readRef();
                    $_obj.p = p;
                    $_obj.P = $deserializer.readInt();
                    x10.array.DistArray black = (x10.array.DistArray) $deserializer.readRef();
                    $_obj.black = black;
                    x10.array.DistArray red = (x10.array.DistArray) $deserializer.readRef();
                    $_obj.red = red;
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$73 $_obj = new $Closure$73((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    $serializer.write(this.phases);
                    if (p instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.p);
                    } else {
                    $serializer.write(this.p);
                    }
                    $serializer.write(this.P);
                    if (black instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.black);
                    } else {
                    $serializer.write(this.black);
                    }
                    if (red instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.red);
                    } else {
                    $serializer.write(this.red);
                    }
                    
                }
                
                // constructor just for allocation
                public $Closure$73(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                
                    
                    public void
                      $apply(
                      ){
                        
//#line 19 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
int shift_ =
                          1;
                        {
                            
//#line 20 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int i79284min79285 =
                              0;
                            
//#line 20 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int i79284max79286 =
                              ((this.
                                  phases) - (((int)(1))));
                            {
                                
//#line 20 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
int i79284 =
                                  i79284min79285;
                                
//#line 20 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
for (;
                                                                                                     true;
                                                                                                     ) {
                                    
//#line 20 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int t79307 =
                                      i79284;
                                    
//#line 20 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final boolean t79323 =
                                      ((t79307) <= (((int)(i79284max79286))));
                                    
//#line 20 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
if (!(t79323)) {
                                        
//#line 20 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
break;
                                    }
                                    {
                                        
//#line 20 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int phase =
                                          i79284;
                                        {
                                            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final boolean e =
                                              AllReduceClock.even$O((int)(phase));
                                            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int t79310 =
                                              this.
                                                p.
                                                id;
                                            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int t79311 =
                                              shift_;
                                            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int t79312 =
                                              ((t79310) + (((int)(t79311))));
                                            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int destId =
                                              ((t79312) % (((int)(this.
                                                                    P))));
                                            
//#line 23 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
if (e) {
                                                
//#line 24 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int t79313 =
                                                  this.
                                                    p.
                                                    id;
                                                
//#line 24 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int elem =
                                                  x10.core.Int.$unbox(((x10.array.DistArray<x10.core.Int>)this.
                                                                                                            black).$apply$G((int)(t79313)));
                                                
//#line 25 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final x10.lang.Place t79316 =
                                                  ((x10.lang.Place)(x10.lang.Place.place((int)(destId))));
                                                
//#line 25 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
x10.lang.Runtime.runAt(((x10.lang.Place)(t79316)),
                                                                                                                                       ((x10.core.fun.VoidFun_0_0)(new AllReduceClock.$Closure$71(((x10.array.DistArray)(this.
                                                                                                                                                                                                                           black)),
                                                                                                                                                                                                  destId,
                                                                                                                                                                                                  elem,
                                                                                                                                                                                                  ((x10.array.DistArray)(this.
                                                                                                                                                                                                                           red)),(java.lang.Class<?>) null))));
                                            } else {
                                                
//#line 28 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int t79317 =
                                                  this.
                                                    p.
                                                    id;
                                                
//#line 28 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int elem =
                                                  x10.core.Int.$unbox(((x10.array.DistArray<x10.core.Int>)this.
                                                                                                            red).$apply$G((int)(t79317)));
                                                
//#line 29 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final x10.lang.Place t79320 =
                                                  ((x10.lang.Place)(x10.lang.Place.place((int)(destId))));
                                                
//#line 29 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
x10.lang.Runtime.runAt(((x10.lang.Place)(t79320)),
                                                                                                                                       ((x10.core.fun.VoidFun_0_0)(new AllReduceClock.$Closure$72(((x10.array.DistArray)(this.
                                                                                                                                                                                                                           red)),
                                                                                                                                                                                                  destId,
                                                                                                                                                                                                  elem,
                                                                                                                                                                                                  ((x10.array.DistArray)(this.
                                                                                                                                                                                                                           black)),(java.lang.Class<?>) null))));
                                            }
                                            
//#line 33 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int t79321 =
                                              shift_;
                                            
//#line 33 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int t79322 =
                                              ((t79321) * (((int)(2))));
                                            
//#line 33 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
shift_ = t79322;
                                            
//#line 34 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
x10.lang.Clock.advanceAll();
                                        }
                                    }
                                    {
                                        
//#line 20 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int t79308 =
                                          i79284;
                                        
//#line 20 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int t79309 =
                                          ((t79308) + (((int)(1))));
                                        
//#line 20 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
i79284 = t79309;
                                    }
                                }
                            }
                        }
                    }
                    
                    public int phases;
                    public x10.lang.Place p;
                    public int P;
                    public x10.array.DistArray<x10.core.Int> black;
                    public x10.array.DistArray<x10.core.Int> red;
                    
                    // creation method for java code
                    public static AllReduceClock.$Closure$73 $make(final int phases,
                                                                   final x10.lang.Place p,
                                                                   final int P,
                                                                   final x10.array.DistArray<x10.core.Int> black,
                                                                   final x10.array.DistArray<x10.core.Int> red,java.lang.Class<?> $dummy0){return new $Closure$73(phases,p,P,black,red,(java.lang.Class<?>) null);}
                    public $Closure$73(final int phases,
                                       final x10.lang.Place p,
                                       final int P,
                                       final x10.array.DistArray<x10.core.Int> black,
                                       final x10.array.DistArray<x10.core.Int> red,java.lang.Class<?> $dummy0) { {
                                                                                                                        this.phases = phases;
                                                                                                                        this.p = ((x10.lang.Place)(p));
                                                                                                                        this.P = P;
                                                                                                                        this.black = ((x10.array.DistArray)(black));
                                                                                                                        this.red = ((x10.array.DistArray)(red));
                                                                                                                    }}
                    
                }
                
            public static class $Closure$74 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$74.class);
                
                public static final x10.rtt.RuntimeType<$Closure$74> $RTT = new x10.rtt.StaticFunType<$Closure$74>(
                /* base class */$Closure$74.class
                , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.array.Point.$RTT, x10.rtt.Types.INT), x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$74 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$74.class + " calling"); } 
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$74 $_obj = new $Closure$74((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    
                }
                
                // constructor just for allocation
                public $Closure$74(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                return x10.core.Int.$box($apply$O((x10.array.Point)a1));
                }
                
                    
                    public int
                      $apply$O(
                      final x10.array.Point p){
                        
//#line 44 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
final int t79329 =
                          p.$apply$O((int)(0));
                        
//#line 44 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
return t79329;
                    }
                    
                    // creation method for java code
                    public static AllReduceClock.$Closure$74 $make(){return new $Closure$74();}
                    public $Closure$74() { {
                                                  
                                              }}
                    
                }
                
            public static class $Closure$75 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$75.class);
                
                public static final x10.rtt.RuntimeType<$Closure$75> $RTT = new x10.rtt.StaticFunType<$Closure$75>(
                /* base class */$Closure$75.class
                , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.array.Point.$RTT, x10.rtt.Types.INT), x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$75 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$75.class + " calling"); } 
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
                
                    
                }
                
                // constructor just for allocation
                public $Closure$75(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                return x10.core.Int.$box($apply$O((x10.array.Point)a1));
                }
                
                    
                    public int
                      $apply$O(
                      final x10.array.Point id$68489){
                        
//#line 45 "C:/eclipsews/pppp11/pppp11/src/AllReduceClock.x10"
return 0;
                    }
                    
                    // creation method for java code
                    public static AllReduceClock.$Closure$75 $make(){return new $Closure$75();}
                    public $Closure$75() { {
                                                  
                                              }}
                    
                }
                
            
            }
            