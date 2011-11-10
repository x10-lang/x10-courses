
public class ArraySum extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, ArraySum.class);
    
    public static final x10.rtt.RuntimeType<ArraySum> $RTT = new x10.rtt.NamedType<ArraySum>(
    "ArraySum", /* base class */ArraySum.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(ArraySum $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + ArraySum.class + " calling"); } 
        $_obj.sum = $deserializer.readInt();
        x10.array.Array data = (x10.array.Array) $deserializer.readRef();
        $_obj.data = data;
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        ArraySum $_obj = new ArraySum((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        $serializer.write(this.sum);
        if (data instanceof x10.x10rt.X10JavaSerializable) {
        $serializer.write( (x10.x10rt.X10JavaSerializable) this.data);
        } else {
        $serializer.write(this.data);
        }
        
    }
    
    // constructor just for allocation
    public ArraySum(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
//#line 20 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
public int sum;
        
//#line 21 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
public x10.array.Array<x10.core.Int> data;
        
        
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
// creation method for java code
        public static ArraySum $make(final int n){return new ArraySum((java.lang.System[]) null).$init(n);}
        
        // constructor for non-virtual call
        final public ArraySum ArraySum$$init$S(final int n) { {
                                                                     
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"

                                                                     
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"

                                                                     
//#line 18 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
this.__fieldInitializers169844();
                                                                     
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final x10.array.Array<x10.core.Int> t170245 =
                                                                       ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(n)),
                                                                                                                                                                                (x10.core.Int.$box(1)),(java.lang.Class<?>[][][][][]) null)));
                                                                     
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
this.data = ((x10.array.Array)(t170245));
                                                                     
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
this.sum = 0;
                                                                 }
                                                                 return this;
                                                                 }
        
        // constructor
        public ArraySum $init(final int n){return ArraySum$$init$S(n);}
        
        
        
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
public int
                                                                                                              sum__0$1x10$lang$Int$2$O(
                                                                                                              final x10.array.Array a,
                                                                                                              final int start,
                                                                                                              final int last){
            
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
int mySum =
              0;
            
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int i170178min170326 =
              start;
            
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int i170178max170327 =
              ((last) - (((int)(1))));
            
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
int i170323 =
              i170178min170326;
            
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
for (;
                                                                                                                     true;
                                                                                                                     ) {
                
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170324 =
                  i170323;
                
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final boolean t170325 =
                  ((t170324) <= (((int)(i170178max170327))));
                
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
if (!(t170325)) {
                    
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
break;
                }
                
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int i170320 =
                  i170323;
                
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170317 =
                  mySum;
                
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170318 =
                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)a).$apply$G((int)(i170320)));
                
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170319 =
                  ((t170317) + (((int)(t170318))));
                
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
mySum = t170319;
                
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170321 =
                  i170323;
                
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170322 =
                  ((t170321) + (((int)(1))));
                
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
i170323 = t170322;
            }
            
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170254 =
              mySum;
            
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
return t170254;
        }
        
        
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
public void
                                                                                                              sum(
                                                                                                              final int numThreads){
            
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final x10.array.Array<x10.core.Int> t170255 =
              ((x10.array.Array)(data));
            
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170256 =
              ((x10.array.Array<x10.core.Int>)t170255).
                size;
            
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int mySize =
              ((t170256) / (((int)(numThreads))));
            {
                
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
x10.lang.Runtime.ensureNotInAtomic();
                
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final x10.lang.FinishState x10$__var94 =
                  x10.lang.Runtime.startFinish();
                
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
try {try {{
                    {
                        
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int i170194min170195 =
                          0;
                        
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int i170194max170196 =
                          ((numThreads) - (((int)(1))));
                        
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
int i170340 =
                          i170194min170195;
                        
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
for (;
                                                                                                                                 true;
                                                                                                                                 ) {
                            
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170341 =
                              i170340;
                            
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final boolean t170342 =
                              ((t170341) <= (((int)(i170194max170196))));
                            
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
if (!(t170342)) {
                                
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
break;
                            }
                            
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int p170337 =
                              i170340;
                            
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new ArraySum.$Closure$114(this,
                                                                                                                                                                                                                data,
                                                                                                                                                                                                                p170337,
                                                                                                                                                                                                                mySize,(java.lang.Class<?>) null))));
                            
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170338 =
                              i170340;
                            
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170339 =
                              ((t170338) + (((int)(1))));
                            
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
i170340 = t170339;
                        }
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__72__) {
                    
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__72__)));
                    
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
throw new x10.lang.RuntimeException();
                }finally {{
                     
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var94)));
                 }}
                }
            }
        
        
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        ArraySum.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> args) {
            
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170268 =
              5000;
            
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
int size =
              5000000;
            
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170269 =
              ((x10.array.Array<java.lang.String>)args).
                size;
            
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final boolean t170272 =
              ((t170269) >= (((int)(1))));
            
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
if (t170272) {
                
//#line 50 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final java.lang.String t170270 =
                  ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
                
//#line 50 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170271 =
                  java.lang.Integer.parseInt(t170270);
                
//#line 50 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
size = t170271;
            }
            
//#line 52 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final x10.io.Printer t170273 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 52 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
t170273.println(((java.lang.String)("Initializing.")));
            
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170274 =
              size;
            
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final ArraySum a =
              ((ArraySum)(new ArraySum((java.lang.System[]) null).$init(t170274)));
            
//#line 54 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final x10.array.Array<x10.core.Int> P =
              ((x10.array.Array)(x10.core.ArrayFactory.<x10.core.Int> makeArrayFromJavaArray(x10.rtt.Types.INT, new int[] {1, 2, 4})));
            
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170275 =
              ((x10.array.Array<x10.core.Int>)P).
                size;
            
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170276 =
              ((t170275) - (((int)(1))));
            
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final x10.lang.IntRange R =
              ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(t170276)))));
            
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final x10.io.Printer t170277 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
t170277.println(((java.lang.String)("Warming up.")));
            
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final x10.lang.IntRange i170210domain170385 =
              ((x10.lang.IntRange)(R));
            
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int i170210min170386 =
              i170210domain170385.
                min;
            
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int i170210max170387 =
              i170210domain170385.
                max;
            
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
int i170347 =
              i170210min170386;
            
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
for (;
                                                                                                                     true;
                                                                                                                     ) {
                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170348 =
                  i170347;
                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final boolean t170349 =
                  ((t170348) <= (((int)(i170210max170387))));
                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
if (!(t170349)) {
                    
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
break;
                }
                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int i170344 =
                  i170347;
                
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170343 =
                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)P).$apply$G((int)(i170344)));
                
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
a.sum((int)(t170343));
                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170345 =
                  i170347;
                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170346 =
                  ((t170345) + (((int)(1))));
                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
i170347 = t170346;
            }
            
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final x10.lang.IntRange i170227domain170388 =
              ((x10.lang.IntRange)(R));
            
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int i170227min170389 =
              i170227domain170388.
                min;
            
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int i170227max170390 =
              i170227domain170388.
                max;
            
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
int i170382 =
              i170227min170389;
            
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
for (;
                                                                                                                     true;
                                                                                                                     ) {
                
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170383 =
                  i170382;
                
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final boolean t170384 =
                  ((t170383) <= (((int)(i170227max170390))));
                
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
if (!(t170384)) {
                    
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
break;
                }
                
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int i170379 =
                  i170382;
                
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final x10.io.Printer t170350 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170351 =
                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)P).$apply$G((int)(i170379)));
                
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final java.lang.String t170352 =
                  (("Starting with ") + ((x10.core.Int.$box(t170351))));
                
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final java.lang.String t170353 =
                  ((t170352) + (" threads."));
                
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
t170350.println(((java.lang.String)(t170353)));
                
//#line 64 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
a.sum = 0;
                
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final long t170354 =
                  x10.lang.System.nanoTime$O();
                
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
long time170355 =
                  (-(t170354));
                
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170356 =
                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)P).$apply$G((int)(i170379)));
                
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
a.sum((int)(t170356));
                
//#line 67 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final long t170357 =
                  time170355;
                
//#line 67 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final long t170358 =
                  x10.lang.System.nanoTime$O();
                
//#line 67 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final long t170359 =
                  ((t170357) + (((long)(t170358))));
                
//#line 67 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
time170355 = t170359;
                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final x10.io.Printer t170360 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170361 =
                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)P).$apply$G((int)(i170379)));
                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final java.lang.String t170362 =
                  (("For p=") + ((x10.core.Int.$box(t170361))));
                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final java.lang.String t170363 =
                  ((t170362) + (" result: "));
                
//#line 69 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170364 =
                  a.
                    sum;
                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final java.lang.String t170365 =
                  ((t170363) + ((x10.core.Int.$box(t170364))));
                
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170366 =
                  size;
                
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170367 =
                  a.
                    sum;
                
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final boolean t170368 =
                  ((int) t170366) ==
                ((int) t170367);
                
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
java.lang.String t170369 =
                   null;
                
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
if (t170368) {
                    
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
t170369 = " ok";
                } else {
                    
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
t170369 = "  bad";
                }
                
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final java.lang.String t170370 =
                  t170369;
                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final java.lang.String t170371 =
                  ((t170365) + (t170370));
                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final java.lang.String t170372 =
                  ((t170371) + (" (time="));
                
//#line 71 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final long t170373 =
                  time170355;
                
//#line 71 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170374 =
                  1000000;
                
//#line 71 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final long t170375 =
                  ((long)(((int)(t170374))));
                
//#line 71 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final long t170376 =
                  ((t170373) / (((long)(t170375))));
                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final java.lang.String t170377 =
                  ((t170372) + ((x10.core.Long.$box(t170376))));
                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final java.lang.String t170378 =
                  ((t170377) + (" ms)"));
                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
t170360.println(((java.lang.String)(t170378)));
                
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170380 =
                  i170382;
                
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170381 =
                  ((t170380) + (((int)(1))));
                
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
i170382 = t170381;
            }
        }
        
        
//#line 18 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final public ArraySum
                                                                                                              ArraySum$$ArraySum$this(
                                                                                                              ){
            
//#line 18 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
return ArraySum.this;
        }
        
        
//#line 18 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final private void
                                                                                                              __fieldInitializers169844(
                                                                                                              ){
            
//#line 18 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
this.sum = 0;
        }
        
        final public static void
          __fieldInitializers169844$P(
          final ArraySum ArraySum){
            ArraySum.__fieldInitializers169844();
        }
        
        public static class $Closure$114 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$114.class);
            
            public static final x10.rtt.RuntimeType<$Closure$114> $RTT = new x10.rtt.StaticVoidFunType<$Closure$114>(
            /* base class */$Closure$114.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$114 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$114.class + " calling"); } 
                ArraySum out$$ = (ArraySum) $deserializer.readRef();
                $_obj.out$$ = out$$;
                x10.array.Array data = (x10.array.Array) $deserializer.readRef();
                $_obj.data = data;
                $_obj.p170337 = $deserializer.readInt();
                $_obj.mySize = $deserializer.readInt();
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$114 $_obj = new $Closure$114((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (out$$ instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.out$$);
                } else {
                $serializer.write(this.out$$);
                }
                if (data instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.data);
                } else {
                $serializer.write(this.data);
                }
                $serializer.write(this.p170337);
                $serializer.write(this.mySize);
                
            }
            
            // constructor just for allocation
            public $Closure$114(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final x10.array.Array<x10.core.Int> t170328 =
                      ((x10.array.Array)(this.
                                           data));
                    
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170329 =
                      ((this.
                          p170337) * (((int)(this.
                                               mySize))));
                    
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170330 =
                      ((this.
                          p170337) + (((int)(1))));
                    
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170331 =
                      ((t170330) * (((int)(this.
                                             mySize))));
                    
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int mySum170332 =
                      this.
                        out$$.sum__0$1x10$lang$Int$2$O(((x10.array.Array)(t170328)),
                                                       (int)(t170329),
                                                       (int)(t170331));
                    
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
try {{
                        
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
x10.lang.Runtime.enterAtomic();
                        {
                            
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final ArraySum x170333 =
                              ((ArraySum)(this.
                                            out$$));
                            
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int y170334 =
                              mySum170332;
                            
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170335 =
                              x170333.
                                sum;
                            
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
final int t170336 =
                              ((t170335) + (((int)(y170334))));
                            
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
x170333.sum = t170336;
                        }
                    }}finally {{
                          
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/ArraySum.x10"
x10.lang.Runtime.exitAtomic();
                      }}
                    }
                
                public ArraySum out$$;
                public x10.array.Array<x10.core.Int> data;
                public int p170337;
                public int mySize;
                
                // creation method for java code
                public static ArraySum.$Closure$114 $make(final ArraySum out$$,
                                                          final x10.array.Array<x10.core.Int> data,
                                                          final int p170337,
                                                          final int mySize,java.lang.Class<?> $dummy0){return new $Closure$114(out$$,data,p170337,mySize,(java.lang.Class<?>) null);}
                public $Closure$114(final ArraySum out$$,
                                    final x10.array.Array<x10.core.Int> data,
                                    final int p170337,
                                    final int mySize,java.lang.Class<?> $dummy0) { {
                                                                                          this.out$$ = out$$;
                                                                                          this.data = ((x10.array.Array)(data));
                                                                                          this.p170337 = p170337;
                                                                                          this.mySize = mySize;
                                                                                      }}
                
                }
                
        
        }
        