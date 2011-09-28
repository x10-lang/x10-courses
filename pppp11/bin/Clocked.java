public class Clocked<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, Clocked.class);
    
    public static final x10.rtt.RuntimeType<Clocked> $RTT = new x10.rtt.NamedType<Clocked>(
    "Clocked", /* base class */Clocked.class, 
    /* variances */ new x10.rtt.RuntimeType.Variance[] {x10.rtt.RuntimeType.Variance.INVARIANT}
    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_0.$RTT, x10.rtt.UnresolvedType.PARAM(0)), x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {if (i ==0)return $T;return null;}
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(Clocked $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + Clocked.class + " calling"); } 
        $_obj.$T = ( x10.rtt.Type ) $deserializer.readRef();
        x10.array.Array a = (x10.array.Array) $deserializer.readRef();
        $_obj.a = a;
        java.lang.String name = (java.lang.String) $deserializer.readRef();
        $_obj.name = name;
        x10.lang.Clock clock = (x10.lang.Clock) $deserializer.readRef();
        $_obj.clock = clock;
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        Clocked $_obj = new Clocked((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        $serializer.write( (x10.x10rt.X10JavaSerializable) this.$T);
        if (a instanceof x10.x10rt.X10JavaSerializable) {
        $serializer.write( (x10.x10rt.X10JavaSerializable) this.a);
        } else {
        $serializer.write(this.a);
        }
        $serializer.write(this.name);
        if (clock instanceof x10.x10rt.X10JavaSerializable) {
        $serializer.write( (x10.x10rt.X10JavaSerializable) this.clock);
        } else {
        $serializer.write(this.clock);
        }
        
    }
    
    // constructor just for allocation
    public Clocked(final java.lang.System[] $dummy, final x10.rtt.Type $T) { 
    super($dummy);
    Clocked.$initParams(this, $T);
    }
    
        private x10.rtt.Type $T;
        // initializer of type parameters
        public static void $initParams(final Clocked $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        }
        
        
//#line 20 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
public x10.lang.Clock clock;
        
        
//#line 21 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
public x10.array.Array<$T> a;
        
//#line 22 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
public java.lang.String name;
        
        
//#line 27 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
// creation method for java code
        public static <$T>Clocked $make(final x10.rtt.Type $T,
                                        final $T x,java.lang.Class<?> $dummy0){return new Clocked<$T>((java.lang.System[]) null, $T).$init(x,(java.lang.Class<?>) null);}
        
        // constructor for non-virtual call
        final public Clocked<$T> Clocked$$init$S(final $T x,java.lang.Class<?> $dummy0) { {
                                                                                                 
//#line 28 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final x10.lang.Clock t81945 =
                                                                                                   x10.lang.Clock.make();
                                                                                                 
//#line 28 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
this.$init((($T)(x)),
                                                                                                                                                                     t81945,
                                                                                                                                                                     ((java.lang.String)("")),(java.lang.Class<?>[][]) null);
                                                                                             }
                                                                                             return this;
                                                                                             }
        
        // constructor
        public Clocked<$T> $init(final $T x,java.lang.Class<?> $dummy0){return Clocked$$init$S(x, $dummy0);}
        
        
        
//#line 33 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
// creation method for java code
        public static <$T>Clocked $make(final x10.rtt.Type $T,
                                        final $T x,
                                        final x10.lang.Clock c,java.lang.Class<?>[] $dummy0){return new Clocked<$T>((java.lang.System[]) null, $T).$init(x,c,(java.lang.Class<?>[]) null);}
        
        // constructor for non-virtual call
        final public Clocked<$T> Clocked$$init$S(final $T x,
                                                 final x10.lang.Clock c,java.lang.Class<?>[] $dummy0) { {
                                                                                                               
//#line 34 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
this.$init((($T)(x)),
                                                                                                                                                                                   ((x10.lang.Clock)(c)),
                                                                                                                                                                                   ((java.lang.String)("")),(java.lang.Class<?>[][]) null);
                                                                                                           }
                                                                                                           return this;
                                                                                                           }
        
        // constructor
        public Clocked<$T> $init(final $T x,
                                 final x10.lang.Clock c,java.lang.Class<?>[] $dummy0){return Clocked$$init$S(x,c, $dummy0);}
        
        
        
//#line 39 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
// creation method for java code
        public static <$T>Clocked $make(final x10.rtt.Type $T,
                                        final $T x,
                                        final x10.lang.Clock c,
                                        final java.lang.String s,java.lang.Class<?>[][] $dummy0){return new Clocked<$T>((java.lang.System[]) null, $T).$init(x,c,s,(java.lang.Class<?>[][]) null);}
        
        // constructor for non-virtual call
        final public Clocked<$T> Clocked$$init$S(final $T x,
                                                 final x10.lang.Clock c,
                                                 final java.lang.String s,java.lang.Class<?>[][] $dummy0) { {
                                                                                                                   {
                                                                                                                       
//#line 39 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"

                                                                                                                   }
                                                                                                                   {
                                                                                                                       {
                                                                                                                           
//#line 40 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
this.clock = c;
                                                                                                                           
                                                                                                                       }
                                                                                                                       
//#line 20 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
this.__fieldInitializers81906();
                                                                                                                   }
                                                                                                                   
//#line 41 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final $T t81946 =
                                                                                                                     (($T)((($T)
                                                                                                                             x)));
                                                                                                                   
//#line 41 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final x10.array.Array<$T> t81947 =
                                                                                                                     ((x10.array.Array)(x10.core.ArrayFactory.<$T> makeArrayFromJavaArray($T, $T.makeArray(t81946, x))));
                                                                                                                   
//#line 41 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
this.a = ((x10.array.Array)(t81947));
                                                                                                                   
//#line 42 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
this.name = ((java.lang.String)(s));
                                                                                                               }
                                                                                                               return this;
                                                                                                               }
        
        // constructor
        public Clocked<$T> $init(final $T x,
                                 final x10.lang.Clock c,
                                 final java.lang.String s,java.lang.Class<?>[][] $dummy0){return Clocked$$init$S(x,c,s, $dummy0);}
        
        
        
//#line 49 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
public void
                                                                   next(
                                                                   ){
            
//#line 50 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final x10.lang.Clock t81948 =
              ((x10.lang.Clock)(clock));
            
//#line 50 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
t81948.advance();
            
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final x10.array.Array<$T> p$81923 =
              ((x10.array.Array)(a));
            
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
;
            
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final x10.array.Array<$T> p$81917 =
              ((x10.array.Array)(a));
            
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
;
            
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
$T ret81921 =
               null;
            {
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final x10.array.Array<$T> x$81919 =
                  p$81917;
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final int t81949 =
                  ((x10.array.Array<$T>)x$81919).
                    rank;
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final boolean t81950 =
                  ((int) t81949) ==
                ((int) 1);
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final boolean t81953 =
                  !(t81950);
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
if (t81953) {
                    
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final boolean t81952 =
                      true;
                    
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
if (t81952) {
                        
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final x10.lang.FailedDynamicCheckException t81951 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
throw t81951;
                    }
                }
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final $T t81954 =
                  (($T)(((x10.array.Array<$T>)x$81919).$apply$G((int)(1))));
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
ret81921 = (($T)(t81954));
            }
            
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final $T p$81925 =
              (($T)(ret81921));
            
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
$T ret81929 =
               null;
            {
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final x10.array.Array<$T> x$81926 =
                  p$81923;
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final $T x$v81928 =
                  (($T)(p$81925));
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final int t81955 =
                  ((x10.array.Array<$T>)x$81926).
                    rank;
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final boolean t81956 =
                  ((int) t81955) ==
                ((int) 1);
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final boolean t81959 =
                  !(t81956);
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
if (t81959) {
                    
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final boolean t81958 =
                      true;
                    
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
if (t81958) {
                        
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final x10.lang.FailedDynamicCheckException t81957 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
throw t81957;
                    }
                }
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final $T t81960 =
                  (($T)(((x10.array.Array<$T>)x$81926).$set__1x10$array$Array$$T$G((int)(0),
                                                                                   (($T)(x$v81928)))));
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
ret81929 = (($T)(t81960));
            }
            
//#line 52 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final x10.lang.Clock t81961 =
              ((x10.lang.Clock)(clock));
            
//#line 52 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
t81961.advance();
        }
        
        
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
public $T
                                                                   $apply$G(
                                                                   ){
            
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final x10.array.Array<$T> p$81931 =
              ((x10.array.Array)(a));
            
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
;
            
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
$T ret81935 =
               null;
            {
                
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final x10.array.Array<$T> x$81933 =
                  p$81931;
                
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final int t81962 =
                  ((x10.array.Array<$T>)x$81933).
                    rank;
                
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final boolean t81963 =
                  ((int) t81962) ==
                ((int) 1);
                
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final boolean t81966 =
                  !(t81963);
                
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
if (t81966) {
                    
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final boolean t81965 =
                      true;
                    
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
if (t81965) {
                        
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final x10.lang.FailedDynamicCheckException t81964 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
throw t81964;
                    }
                }
                
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final $T t81967 =
                  (($T)(((x10.array.Array<$T>)x$81933).$apply$G((int)(0))));
                
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
ret81935 = (($T)(t81967));
            }
            
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final $T t81968 =
              (($T)(ret81935));
            
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
return t81968;
        }
        
        
//#line 62 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
public void
                                                                   $set__0Clocked$$T(
                                                                   final $T x){
            
//#line 62 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final x10.array.Array<$T> p$81937 =
              ((x10.array.Array)(a));
            
//#line 62 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
;
            
//#line 62 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final $T p$81939 =
              (($T)(x));
            
//#line 62 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
$T ret81943 =
               null;
            {
                
//#line 62 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final x10.array.Array<$T> x$81940 =
                  p$81937;
                
//#line 62 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final $T x$v81942 =
                  (($T)(p$81939));
                
//#line 62 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final int t81969 =
                  ((x10.array.Array<$T>)x$81940).
                    rank;
                
//#line 62 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final boolean t81970 =
                  ((int) t81969) ==
                ((int) 1);
                
//#line 62 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final boolean t81973 =
                  !(t81970);
                
//#line 62 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
if (t81973) {
                    
//#line 62 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final boolean t81972 =
                      true;
                    
//#line 62 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
if (t81972) {
                        
//#line 62 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final x10.lang.FailedDynamicCheckException t81971 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 62 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
throw t81971;
                    }
                }
                
//#line 62 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final $T t81974 =
                  (($T)(((x10.array.Array<$T>)x$81940).$set__1x10$array$Array$$T$G((int)(1),
                                                                                   (($T)(x$v81942)))));
                
//#line 62 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
ret81943 = (($T)(t81974));
            }
        }
        
        
//#line 63 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
public java.lang.String
                                                                   toString(
                                                                   ){
            
//#line 63 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final java.lang.String t81975 =
              ((java.lang.String)(name));
            
//#line 63 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
return t81975;
        }
        
        
//#line 20 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final public Clocked<$T>
                                                                   Clocked$$Clocked$this(
                                                                   ){
            
//#line 20 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
return Clocked.this;
        }
        
        
//#line 20 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
final private void
                                                                   __fieldInitializers81906(
                                                                   ){
            
//#line 20 "C:/eclipsews/pppp11/pppp11/src/Clocked.x10"
this.a = null;
        }
        
        final public static <$T>void
          __fieldInitializers81906$P__0$1Clocked$$T$2(
          final x10.rtt.Type $T,
          final Clocked<$T> Clocked){
            ((Clocked<$T>)Clocked).__fieldInitializers81906();
        }
    
}
