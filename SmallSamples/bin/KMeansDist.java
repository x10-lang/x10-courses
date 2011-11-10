
public class KMeansDist extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, KMeansDist.class);
    
    public static final x10.rtt.RuntimeType<KMeansDist> $RTT = new x10.rtt.NamedType<KMeansDist>(
    "KMeansDist", /* base class */KMeansDist.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(KMeansDist $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + KMeansDist.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        KMeansDist $_obj = new KMeansDist((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public KMeansDist(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final public static int DIM = 2;
        
//#line 18 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final public static int CLUSTERS = 4;
        
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final public static int POINTS = 2000;
        
//#line 20 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final public static int ITERATIONS = 50;
        
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
public static x10.array.Region points_region;
        
        
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        KMeansDist.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> id$238899) {
            
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Dist t246211 =
              ((x10.array.Dist)(x10.array.Dist.makeUnique()));
            
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.core.fun.Fun_0_0<x10.util.Random> t246214 =
              ((x10.core.fun.Fun_0_0)(new KMeansDist.$Closure$150()));
            
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.lang.PlaceLocalHandle<x10.util.Random> rnd =
              x10.lang.PlaceLocalHandle.<x10.util.Random>make__1$1x10$lang$PlaceLocalHandle$$T$2(x10.util.Random.$RTT, ((x10.array.Dist)(t246211)),
                                                                                                 ((x10.core.fun.Fun_0_0)(t246214)));
            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Dist t246219 =
              ((x10.array.Dist)(x10.array.Dist.makeUnique()));
            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.core.fun.Fun_0_0<x10.array.Array<x10.core.Float>> t246220 =
              ((x10.core.fun.Fun_0_0)(new KMeansDist.$Closure$151()));
            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_curr_clusters =
              x10.lang.PlaceLocalHandle.<x10.array.Array<x10.core.Float>>make__1$1x10$lang$PlaceLocalHandle$$T$2(new x10.rtt.ParameterizedType(x10.array.Array.$RTT, x10.rtt.Types.FLOAT), ((x10.array.Dist)(t246219)),
                                                                                                                 ((x10.core.fun.Fun_0_0)(t246220)));
            
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Dist t246225 =
              ((x10.array.Dist)(x10.array.Dist.makeUnique()));
            
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.core.fun.Fun_0_0<x10.array.Array<x10.core.Float>> t246226 =
              ((x10.core.fun.Fun_0_0)(new KMeansDist.$Closure$152()));
            
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_new_clusters =
              x10.lang.PlaceLocalHandle.<x10.array.Array<x10.core.Float>>make__1$1x10$lang$PlaceLocalHandle$$T$2(new x10.rtt.ParameterizedType(x10.array.Array.$RTT, x10.rtt.Types.FLOAT), ((x10.array.Dist)(t246225)),
                                                                                                                 ((x10.core.fun.Fun_0_0)(t246226)));
            
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Dist t246229 =
              ((x10.array.Dist)(x10.array.Dist.makeUnique()));
            
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.core.fun.Fun_0_0<x10.array.Array<x10.core.Int>> t246230 =
              ((x10.core.fun.Fun_0_0)(new KMeansDist.$Closure$153()));
            
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Int>> local_cluster_counts =
              x10.lang.PlaceLocalHandle.<x10.array.Array<x10.core.Int>>make__1$1x10$lang$PlaceLocalHandle$$T$2(new x10.rtt.ParameterizedType(x10.array.Array.$RTT, x10.rtt.Types.INT), ((x10.array.Dist)(t246229)),
                                                                                                               ((x10.core.fun.Fun_0_0)(t246230)));
            
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Region t246231 =
              ((x10.array.Region)(KMeansDist.getInitialized$points_region()));
            
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Dist points_dist =
              ((x10.array.Dist)(x10.array.Dist.makeBlock(((x10.array.Region)(t246231)),
                                                         (int)(0))));
            
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.core.fun.Fun_0_1<x10.array.Point,x10.core.Float> t246234 =
              ((x10.core.fun.Fun_0_1)(new KMeansDist.$Closure$154(rnd,(java.lang.Class<?>) null)));
            
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.DistArray<x10.core.Float> points =
              ((x10.array.DistArray)(x10.array.DistArray.<x10.core.Float>make__1$1x10$array$Point$3x10$array$DistArray$$T$2(x10.rtt.Types.FLOAT, ((x10.array.Dist)(points_dist)),
                                                                                                                            ((x10.core.fun.Fun_0_1)(t246234)))));
            
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246235 =
              KMeansDist.CLUSTERS;
            
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246236 =
              KMeansDist.DIM;
            
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246242 =
              8;
            
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t246243 =
              ((x10.core.fun.Fun_0_1)(new KMeansDist.$Closure$156(points_dist,
                                                                  points,(java.lang.Class<?>) null)));
            
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Float> central_clusters =
              ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(t246242,
                                                                                                                           ((x10.core.fun.Fun_0_1)(t246243)),(java.lang.Class<?>[][][][]) null)));
            
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246248 =
              KMeansDist.CLUSTERS;
            
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246249 =
              KMeansDist.DIM;
            
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246303 =
              8;
            
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Float> old_central_clusters =
              ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(t246303)));
            
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246304 =
              KMeansDist.CLUSTERS;
            
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Int> central_cluster_counts =
              ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(t246304)))));
            
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int i246031min246749 =
              1;
            
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int i246031max246750 =
              KMeansDist.ITERATIONS;
            
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int i246725 =
              i246031min246749;
            
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                       true;
                                                                                                                       ) {
                
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246726 =
                  i246725;
                
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246727 =
                  ((t246726) <= (((int)(i246031max246750))));
                
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246727)) {
                    
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                }
                
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int i246722 =
                  i246725;
                
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.io.Printer t246697 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final java.lang.String t246698 =
                  (("Iteration: ") + ((x10.core.Int.$box(i246722))));
                
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
t246697.println(((java.lang.String)(t246698)));
                
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int j246673 =
                  0;
                
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                    
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246674 =
                      j246673;
                    
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246675 =
                      KMeansDist.CLUSTERS;
                    
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246676 =
                      ((t246674) < (((int)(t246675))));
                    
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246676)) {
                        
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                    }
                    
//#line 50 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Int> t246511 =
                      ((x10.array.Array)(((x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Int>>)local_cluster_counts).$apply$G()));
                    
//#line 50 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246512 =
                      j246673;
                    
//#line 50 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
((x10.array.Array<x10.core.Int>)t246511).$set__1x10$array$Array$$T$G((int)(t246512),
                                                                                                                                                                                               x10.core.Int.$box(0));
                    
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246513 =
                      j246673;
                    
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246514 =
                      ((t246513) + (((int)(1))));
                    
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
j246673 = t246514;
                }
                {
                    
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
x10.lang.Runtime.ensureNotInAtomic();
                    
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.lang.FinishState x10$__var116 =
                      x10.lang.Runtime.startFinish();
                    
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
try {try {{
                        {
                            
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.PlaceGroup t246706 =
                              points_dist.places();
                            
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.lang.Iterator<x10.lang.Place> d246707 =
                              ((x10.lang.Iterable<x10.lang.Place>)t246706).iterator();
                            
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                                       true;
                                                                                                                                       ) {
                                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246708 =
                                  ((x10.lang.Iterator<x10.lang.Place>)d246707).hasNext$O();
                                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246708)) {
                                    
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                                }
                                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.lang.Place d246538 =
                                  ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)d246707).next$G()));
                                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
x10.lang.Runtime.runAsync(((x10.lang.Place)(d246538)),
                                                                                                                                                                ((x10.core.fun.VoidFun_0_0)(new KMeansDist.$Closure$157(local_curr_clusters,
                                                                                                                                                                                                                        central_clusters,
                                                                                                                                                                                                                        local_new_clusters,
                                                                                                                                                                                                                        local_cluster_counts,(java.lang.Class<?>) null))));
                            }
                        }
                    }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__88__) {
                        
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__88__)));
                        
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
throw new x10.lang.RuntimeException();
                    }finally {{
                         
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var116)));
                     }}
                    }
                {
                    
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
x10.lang.Runtime.ensureNotInAtomic();
                    
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.lang.FinishState x10$__var117 =
                      x10.lang.Runtime.startFinish();
                    
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
try {try {{
                        {
                            
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int p_246711 =
                              0;
                            
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                                       true;
                                                                                                                                       ) {
                                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246712 =
                                  p_246711;
                                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246713 =
                                  KMeansDist.POINTS;
                                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246714 =
                                  ((t246712) < (((int)(t246713))));
                                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246714)) {
                                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                                }
                                
//#line 69 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int p246590 =
                                  p_246711;
                                
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new KMeansDist.$Closure$159(points_dist,
                                                                                                                                                                                                                        p246590,
                                                                                                                                                                                                                        points,
                                                                                                                                                                                                                        local_curr_clusters,
                                                                                                                                                                                                                        local_new_clusters,
                                                                                                                                                                                                                        local_cluster_counts,(java.lang.Class<?>) null))));
                                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246597 =
                                  p_246711;
                                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246598 =
                                  ((t246597) + (((int)(1))));
                                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
p_246711 = t246598;
                            }
                        }
                    }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__89__) {
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__89__)));
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
throw new x10.lang.RuntimeException();
                    }finally {{
                         
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var117)));
                     }}
                    }
                
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int j246677 =
                  0;
                
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                    
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246678 =
                      j246677;
                    
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246679 =
                      KMeansDist.DIM;
                    
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246680 =
                      KMeansDist.CLUSTERS;
                    
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246681 =
                      8;
                    
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246682 =
                      ((t246678) < (((int)(t246681))));
                    
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246682)) {
                        
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                    }
                    
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246599 =
                      j246677;
                    
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246600 =
                      j246677;
                    
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246601 =
                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)central_clusters).$apply$G((int)(t246600)));
                    
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
((x10.array.Array<x10.core.Float>)old_central_clusters).$set__1x10$array$Array$$T$G((int)(t246599),
                                                                                                                                                                                                              x10.core.Float.$box(t246601));
                    
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246602 =
                      j246677;
                    
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246603 =
                      ((float)(int)(((int)(0))));
                    
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
((x10.array.Array<x10.core.Float>)central_clusters).$set__1x10$array$Array$$T$G((int)(t246602),
                                                                                                                                                                                                          x10.core.Float.$box(t246603));
                    
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246604 =
                      j246677;
                    
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246605 =
                      ((t246604) + (((int)(1))));
                    
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
j246677 = t246605;
                }
                
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int j246683 =
                  0;
                
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                    
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246684 =
                      j246683;
                    
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246685 =
                      KMeansDist.CLUSTERS;
                    
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246686 =
                      ((t246684) < (((int)(t246685))));
                    
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246686)) {
                        
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                    }
                    
//#line 99 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246606 =
                      j246683;
                    
//#line 99 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
((x10.array.Array<x10.core.Int>)central_cluster_counts).$set__1x10$array$Array$$T$G((int)(t246606),
                                                                                                                                                                                                              x10.core.Int.$box(0));
                    
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246607 =
                      j246683;
                    
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246608 =
                      ((t246607) + (((int)(1))));
                    
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
j246683 = t246608;
                }
                {
                    
//#line 102 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
x10.lang.Runtime.ensureNotInAtomic();
                    
//#line 102 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.lang.FinishState x10$__var118 =
                      x10.lang.Runtime.startFinish();
                    
//#line 102 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
try {try {{
                        {
                            
//#line 103 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.core.GlobalRef<x10.array.Array<x10.core.Float>> central_clusters_gr246715 =
                              ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.array.Array<x10.core.Float>>(new x10.rtt.ParameterizedType(x10.array.Array.$RTT, x10.rtt.Types.FLOAT), central_clusters,(java.lang.Class<?>) null)));
                            
//#line 104 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.core.GlobalRef<x10.array.Array<x10.core.Int>> central_cluster_counts_gr246717 =
                              ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.array.Array<x10.core.Int>>(new x10.rtt.ParameterizedType(x10.array.Array.$RTT, x10.rtt.Types.INT), central_cluster_counts,(java.lang.Class<?>) null)));
                            
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.lang.Place there246718 =
                              ((x10.lang.Place)(x10.lang.Runtime.home()));
                            
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.PlaceGroup t246641 =
                              points_dist.places();
                            
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.lang.Iterator<x10.lang.Place> d246642 =
                              ((x10.lang.Iterable<x10.lang.Place>)t246641).iterator();
                            
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                                        true;
                                                                                                                                        ) {
                                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246643 =
                                  ((x10.lang.Iterator<x10.lang.Place>)d246642).hasNext$O();
                                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246643)) {
                                    
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                                }
                                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.lang.Place d246638 =
                                  ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)d246642).next$G()));
                                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new KMeansDist.$Closure$161(local_new_clusters,
                                                                                                                                                                                                                         local_cluster_counts,
                                                                                                                                                                                                                         there246718,
                                                                                                                                                                                                                         central_clusters_gr246715,
                                                                                                                                                                                                                         central_cluster_counts_gr246717,(java.lang.Class<?>) null))));
                            }
                        }
                    }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__90__) {
                        
//#line 102 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__90__)));
                        
//#line 102 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
throw new x10.lang.RuntimeException();
                    }finally {{
                         
//#line 102 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var118)));
                     }}
                    }
                
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int k246687 =
                  0;
                
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                            true;
                                                                                                                            ) {
                    
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246688 =
                      k246687;
                    
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246689 =
                      KMeansDist.CLUSTERS;
                    
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246690 =
                      ((t246688) < (((int)(t246689))));
                    
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246690)) {
                        
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                    }
                    
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int d246657 =
                      0;
                    
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                                true;
                                                                                                                                ) {
                        
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246658 =
                          d246657;
                        
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246659 =
                          KMeansDist.DIM;
                        
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246660 =
                          ((t246658) < (((int)(t246659))));
                        
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246660)) {
                            
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                        }
                        
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Float> x246646 =
                          ((x10.array.Array)(central_clusters));
                        
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246647 =
                          k246687;
                        
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246648 =
                          ((t246647) * (((int)(2))));
                        
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246649 =
                          d246657;
                        
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int y246650 =
                          ((t246648) + (((int)(t246649))));
                        
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246651 =
                          k246687;
                        
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246652 =
                          x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)central_cluster_counts).$apply$G((int)(t246651)));
                        
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float z246653 =
                          ((float)(int)(((int)(t246652))));
                        
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
float ret246654 =
                           0;
                        
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246644 =
                          x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)x246646).$apply$G((int)(y246650)));
                        
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float r246645 =
                          ((t246644) / (((float)(z246653))));
                        
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
((x10.array.Array<x10.core.Float>)x246646).$set__1x10$array$Array$$T$G((int)(y246650),
                                                                                                                                                                                                      x10.core.Float.$box(r246645));
                        
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
ret246654 = r246645;
                        
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246655 =
                          d246657;
                        
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246656 =
                          ((t246655) + (((int)(1))));
                        
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
d246657 = t246656;
                    }
                    
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246661 =
                      k246687;
                    
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246662 =
                      ((t246661) + (((int)(1))));
                    
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
k246687 = t246662;
                }
                
//#line 128 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
boolean b246720 =
                  true;
                
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int j246691 =
                  0;
                
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                            true;
                                                                                                                            ) {
                    
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246692 =
                      j246691;
                    
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246693 =
                      KMeansDist.CLUSTERS;
                    
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246694 =
                      KMeansDist.DIM;
                    
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246695 =
                      8;
                    
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246696 =
                      ((t246692) < (((int)(t246695))));
                    
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246696)) {
                        
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                    }
                    
//#line 130 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246663 =
                      j246691;
                    
//#line 130 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246664 =
                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)old_central_clusters).$apply$G((int)(t246663)));
                    
//#line 130 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246665 =
                      j246691;
                    
//#line 130 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246666 =
                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)central_clusters).$apply$G((int)(t246665)));
                    
//#line 130 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246667 =
                      ((t246664) - (((float)(t246666))));
                    
//#line 130 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246668 =
                      x10.lang.Math.abs$O((float)(t246667));
                    
//#line 130 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final double t246669 =
                      ((double)(float)(((float)(t246668))));
                    
//#line 130 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246670 =
                      ((t246669) > (((double)(1.0E-4))));
                    
//#line 130 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (t246670) {
                        
//#line 131 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
b246720 = false;
                        
//#line 132 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                    }
                    
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246671 =
                      j246691;
                    
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246672 =
                      ((t246671) + (((int)(1))));
                    
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
j246691 = t246672;
                }
                
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246721 =
                  b246720;
                
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (t246721) {
                    
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                }
                
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246723 =
                  i246725;
                
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246724 =
                  ((t246723) + (((int)(1))));
                
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
i246725 = t246724;
                }
                
//#line 139 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int d246751 =
                  0;
                
//#line 139 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                            true;
                                                                                                                            ) {
                    
//#line 139 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246752 =
                      d246751;
                    
//#line 139 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246753 =
                      KMeansDist.DIM;
                    
//#line 139 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246754 =
                      ((t246752) < (((int)(t246753))));
                    
//#line 139 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246754)) {
                        
//#line 139 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                    }
                    
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int k246742 =
                      0;
                    
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                                true;
                                                                                                                                ) {
                        
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246743 =
                          k246742;
                        
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246744 =
                          KMeansDist.CLUSTERS;
                        
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246745 =
                          ((t246743) < (((int)(t246744))));
                        
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246745)) {
                            
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                        }
                        
//#line 141 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246730 =
                          k246742;
                        
//#line 141 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246731 =
                          ((t246730) > (((int)(0))));
                        
//#line 141 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (t246731) {
                            
//#line 142 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.io.Printer t246732 =
                              ((x10.io.Printer)(x10.io.Console.OUT));
                            
//#line 142 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
t246732.print(((java.lang.String)(" ")));
                        }
                        
//#line 143 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.io.Printer t246733 =
                          ((x10.io.Printer)(x10.io.Console.OUT));
                        
//#line 143 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246734 =
                          k246742;
                        
//#line 143 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246735 =
                          KMeansDist.DIM;
                        
//#line 143 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246736 =
                          ((t246734) * (((int)(t246735))));
                        
//#line 143 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246737 =
                          d246751;
                        
//#line 143 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246738 =
                          ((t246736) + (((int)(t246737))));
                        
//#line 143 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246739 =
                          x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)central_clusters).$apply$G((int)(t246738)));
                        
//#line 143 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
t246733.print(x10.core.Float.$box(t246739));
                        
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246740 =
                          k246742;
                        
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246741 =
                          ((t246740) + (((int)(1))));
                        
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
k246742 = t246741;
                    }
                    
//#line 145 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.io.Printer t246746 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 145 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
t246746.println();
                    
//#line 139 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246747 =
                      d246751;
                    
//#line 139 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246748 =
                      ((t246747) + (((int)(1))));
                    
//#line 139 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
d246751 = t246748;
                }
            }
            
            
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final public KMeansDist
                                                                                                                    KMeansDist$$KMeansDist$this(
                                                                                                                    ){
                
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
return KMeansDist.this;
            }
            
            
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
// creation method for java code
            public static KMeansDist $make(){return new KMeansDist((java.lang.System[]) null).$init();}
            
            // constructor for non-virtual call
            final public KMeansDist KMeansDist$$init$S() { {
                                                                  
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"

                                                                  
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"

                                                              }
                                                              return this;
                                                              }
            
            // constructor
            public KMeansDist $init(){return KMeansDist$$init$S();}
            
            
            public static int fieldId$points_region;
            final public static x10.core.concurrent.AtomicInteger initStatus$points_region = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
            
            public static int
              getInitialized$DIM(
              ){
                return KMeansDist.DIM;
            }
            
            public static int
              getInitialized$CLUSTERS(
              ){
                return KMeansDist.CLUSTERS;
            }
            
            public static int
              getInitialized$POINTS(
              ){
                return KMeansDist.POINTS;
            }
            
            public static int
              getInitialized$ITERATIONS(
              ){
                return KMeansDist.ITERATIONS;
            }
            
            public static void
              getDeserialized$points_region(
              byte[] buf){
                if (((boolean) x10.x10rt.X10JavaSerializable.CUSTOM_JAVA_SERIALIZATION) ==
                      ((boolean) true)) {
                    KMeansDist.points_region = ((x10.array.Region)(x10.runtime.impl.java.InitDispatcher.deserializeField(((byte[])(buf)))));
                } else {
                    KMeansDist.points_region = ((x10.array.Region)(x10.rtt.Types.<x10.array.Region> cast(x10.runtime.impl.java.InitDispatcher.deserializeField(((byte[])(buf))),x10.array.Region.$RTT)));
                }
                KMeansDist.initStatus$points_region.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            }
            
            public static x10.array.Region
              getInitialized$points_region(
              ){
                if (((int) x10.lang.Runtime.hereInt$O()) ==
                    ((int) 0)) {
                    if (KMeansDist.initStatus$points_region.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED),
                                                                          (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                        KMeansDist.points_region = ((x10.array.Region)(x10.lang.IntRange.$make(((int)(0)), ((int)(1999))).$times(((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(1))))))));
                        if (((boolean) x10.x10rt.X10JavaSerializable.CUSTOM_JAVA_SERIALIZATION) ==
                              ((boolean) true)) {
                            x10.runtime.impl.java.InitDispatcher.broadcastStaticField(((java.lang.Object)(KMeansDist.points_region)),
                                                                                      (int)(KMeansDist.fieldId$points_region));
                        } else {
                            x10.runtime.impl.java.InitDispatcher.broadcastStaticField(((java.lang.Object)(KMeansDist.points_region)),
                                                                                      (int)(KMeansDist.fieldId$points_region));
                        }
                        KMeansDist.initStatus$points_region.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                        x10.runtime.impl.java.InitDispatcher.lockInitialized();
                        x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    }
                }
                if (((int) KMeansDist.initStatus$points_region.get()) !=
                    ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (((int) KMeansDist.initStatus$points_region.get()) !=
                           ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                }
                return KMeansDist.points_region;
            }
            
            static {
                       KMeansDist.fieldId$points_region = x10.runtime.impl.java.InitDispatcher.addInitializer(((java.lang.String)("KMeansDist")),
                                                                                                              ((java.lang.String)("points_region")));
                   }
            
            public static class $Closure$150 extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$150.class);
                
                public static final x10.rtt.RuntimeType<$Closure$150> $RTT = new x10.rtt.StaticFunType<$Closure$150>(
                /* base class */$Closure$150.class
                , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_0.$RTT, x10.util.Random.$RTT), x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$150 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$150.class + " calling"); } 
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$150 $_obj = new $Closure$150((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    
                }
                
                // constructor just for allocation
                public $Closure$150(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                // bridge for method abstract public ()=>U.operator()():U
                public x10.util.Random
                  $apply$G(){return $apply();}
                
                    
                    public x10.util.Random
                      $apply(
                      ){
                        
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final long t246208 =
                          ((long)(((int)(0))));
                        
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.util.Random t246209 =
                          ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).$init(t246208)));
                        
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
return t246209;
                    }
                    
                    // creation method for java code
                    public static KMeansDist.$Closure$150 $make(){return new $Closure$150();}
                    public $Closure$150() { {
                                                   
                                               }}
                    
                }
                
            public static class $Closure$151 extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$151.class);
                
                public static final x10.rtt.RuntimeType<$Closure$151> $RTT = new x10.rtt.StaticFunType<$Closure$151>(
                /* base class */$Closure$151.class
                , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_0.$RTT, new x10.rtt.ParameterizedType(x10.array.Array.$RTT, x10.rtt.Types.FLOAT)), x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$151 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$151.class + " calling"); } 
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$151 $_obj = new $Closure$151((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    
                }
                
                // constructor just for allocation
                public $Closure$151(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                // bridge for method abstract public ()=>U.operator()():U
                public x10.array.Array
                  $apply$G(){return $apply();}
                
                    
                    public x10.array.Array<x10.core.Float>
                      $apply(
                      ){
                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246215 =
                          KMeansDist.CLUSTERS;
                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246216 =
                          KMeansDist.DIM;
                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246217 =
                          8;
                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Float> t246218 =
                          ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(t246217)));
                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
return t246218;
                    }
                    
                    // creation method for java code
                    public static KMeansDist.$Closure$151 $make(){return new $Closure$151();}
                    public $Closure$151() { {
                                                   
                                               }}
                    
                }
                
            public static class $Closure$152 extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$152.class);
                
                public static final x10.rtt.RuntimeType<$Closure$152> $RTT = new x10.rtt.StaticFunType<$Closure$152>(
                /* base class */$Closure$152.class
                , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_0.$RTT, new x10.rtt.ParameterizedType(x10.array.Array.$RTT, x10.rtt.Types.FLOAT)), x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$152 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$152.class + " calling"); } 
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$152 $_obj = new $Closure$152((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    
                }
                
                // constructor just for allocation
                public $Closure$152(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                // bridge for method abstract public ()=>U.operator()():U
                public x10.array.Array
                  $apply$G(){return $apply();}
                
                    
                    public x10.array.Array<x10.core.Float>
                      $apply(
                      ){
                        
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246221 =
                          KMeansDist.CLUSTERS;
                        
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246222 =
                          KMeansDist.DIM;
                        
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246223 =
                          8;
                        
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Float> t246224 =
                          ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(t246223)));
                        
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
return t246224;
                    }
                    
                    // creation method for java code
                    public static KMeansDist.$Closure$152 $make(){return new $Closure$152();}
                    public $Closure$152() { {
                                                   
                                               }}
                    
                }
                
            public static class $Closure$153 extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$153.class);
                
                public static final x10.rtt.RuntimeType<$Closure$153> $RTT = new x10.rtt.StaticFunType<$Closure$153>(
                /* base class */$Closure$153.class
                , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_0.$RTT, new x10.rtt.ParameterizedType(x10.array.Array.$RTT, x10.rtt.Types.INT)), x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$153 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$153.class + " calling"); } 
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$153 $_obj = new $Closure$153((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    
                }
                
                // constructor just for allocation
                public $Closure$153(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                // bridge for method abstract public ()=>U.operator()():U
                public x10.array.Array
                  $apply$G(){return $apply();}
                
                    
                    public x10.array.Array<x10.core.Int>
                      $apply(
                      ){
                        
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246227 =
                          KMeansDist.CLUSTERS;
                        
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Int> t246228 =
                          ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(t246227)))));
                        
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
return t246228;
                    }
                    
                    // creation method for java code
                    public static KMeansDist.$Closure$153 $make(){return new $Closure$153();}
                    public $Closure$153() { {
                                                   
                                               }}
                    
                }
                
            public static class $Closure$154 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$154.class);
                
                public static final x10.rtt.RuntimeType<$Closure$154> $RTT = new x10.rtt.StaticFunType<$Closure$154>(
                /* base class */$Closure$154.class
                , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.array.Point.$RTT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$154 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$154.class + " calling"); } 
                    x10.lang.PlaceLocalHandle rnd = (x10.lang.PlaceLocalHandle) $deserializer.readRef();
                    $_obj.rnd = rnd;
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$154 $_obj = new $Closure$154((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    if (rnd instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.rnd);
                    } else {
                    $serializer.write(this.rnd);
                    }
                    
                }
                
                // constructor just for allocation
                public $Closure$154(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                return x10.core.Float.$box($apply$O((x10.array.Point)a1));
                }
                
                    
                    public float
                      $apply$O(
                      final x10.array.Point p){
                        
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.util.Random t246232 =
                          ((x10.lang.PlaceLocalHandle<x10.util.Random>)this.
                                                                         rnd).$apply$G();
                        
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246233 =
                          t246232.nextFloat$O();
                        
//#line 34 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
return t246233;
                    }
                    
                    public x10.lang.PlaceLocalHandle<x10.util.Random> rnd;
                    
                    // creation method for java code
                    public static KMeansDist.$Closure$154 $make(final x10.lang.PlaceLocalHandle<x10.util.Random> rnd,java.lang.Class<?> $dummy0){return new $Closure$154(rnd,(java.lang.Class<?>) null);}
                    public $Closure$154(final x10.lang.PlaceLocalHandle<x10.util.Random> rnd,java.lang.Class<?> $dummy0) { {
                                                                                                                                  this.rnd = ((x10.lang.PlaceLocalHandle)(rnd));
                                                                                                                              }}
                    
                }
                
            public static class $Closure$155 extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$155.class);
                
                public static final x10.rtt.RuntimeType<$Closure$155> $RTT = new x10.rtt.StaticFunType<$Closure$155>(
                /* base class */$Closure$155.class
                , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_0.$RTT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$155 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$155.class + " calling"); } 
                    x10.array.DistArray points = (x10.array.DistArray) $deserializer.readRef();
                    $_obj.points = points;
                    x10.array.Point p = (x10.array.Point) $deserializer.readRef();
                    $_obj.p = p;
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$155 $_obj = new $Closure$155((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    if (points instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.points);
                    } else {
                    $serializer.write(this.points);
                    }
                    if (p instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.p);
                    } else {
                    $serializer.write(this.p);
                    }
                    
                }
                
                // constructor just for allocation
                public $Closure$155(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                // bridge for method abstract public ()=>U.operator()():U
                public x10.core.Float
                  $apply$G(){return x10.core.Float.$box($apply$O());}
                
                    
                    public float
                      $apply$O(
                      ){
                        
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t245391 =
                          x10.core.Float.$unbox(((x10.array.DistArray<x10.core.Float>)this.
                                                                                        points).$apply$G(((x10.array.Point)(this.
                                                                                                                              p))));
                        
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
return t245391;
                    }
                    
                    public x10.array.DistArray<x10.core.Float> points;
                    public x10.array.Point p;
                    
                    // creation method for java code
                    public static KMeansDist.$Closure$155 $make(final x10.array.DistArray<x10.core.Float> points,
                                                                final x10.array.Point p,java.lang.Class<?> $dummy0){return new $Closure$155(points,p,(java.lang.Class<?>) null);}
                    public $Closure$155(final x10.array.DistArray<x10.core.Float> points,
                                        final x10.array.Point p,java.lang.Class<?> $dummy0) { {
                                                                                                     this.points = ((x10.array.DistArray)(points));
                                                                                                     this.p = ((x10.array.Point)(p));
                                                                                                 }}
                    
                }
                
            public static class $Closure$156 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$156.class);
                
                public static final x10.rtt.RuntimeType<$Closure$156> $RTT = new x10.rtt.StaticFunType<$Closure$156>(
                /* base class */$Closure$156.class
                , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$156 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$156.class + " calling"); } 
                    x10.array.Dist points_dist = (x10.array.Dist) $deserializer.readRef();
                    $_obj.points_dist = points_dist;
                    x10.array.DistArray points = (x10.array.DistArray) $deserializer.readRef();
                    $_obj.points = points;
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$156 $_obj = new $Closure$156((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    if (points_dist instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.points_dist);
                    } else {
                    $serializer.write(this.points_dist);
                    }
                    if (points instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.points);
                    } else {
                    $serializer.write(this.points);
                    }
                    
                }
                
                // constructor just for allocation
                public $Closure$156(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                }
                
                    
                    public float
                      $apply$O(
                      final int i){
                        
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246237 =
                          KMeansDist.DIM;
                        
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246239 =
                          ((i) / (((int)(t246237))));
                        
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246238 =
                          KMeansDist.DIM;
                        
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246240 =
                          ((i) % (((int)(t246238))));
                        
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Int> t246241 =
                          ((x10.array.Array)(x10.core.ArrayFactory.<x10.core.Int> makeArrayFromJavaArray(x10.rtt.Types.INT, new int[] {t246239, t246240})));
                        
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Point p =
                          ((x10.array.Point)(x10.array.Point.<x10.core.Int>make__0$1x10$array$Point$$T$2(x10.rtt.Types.INT, ((x10.array.Array)(t246241)))));
                        
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.lang.Place t245392 =
                          this.
                            points_dist.$apply(((x10.array.Point)(p)));
                        
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t245393 =
                          x10.core.Float.$unbox(x10.lang.Runtime.<x10.core.Float>evalAt__1$1x10$lang$Runtime$$T$2$G(x10.rtt.Types.FLOAT, ((x10.lang.Place)(t245392)),
                                                                                                                    ((x10.core.fun.Fun_0_0)(new KMeansDist.$Closure$155(((x10.array.DistArray)(this.
                                                                                                                                                                                                 points)),
                                                                                                                                                                        p,(java.lang.Class<?>) null)))));
                        
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
return t245393;
                    }
                    
                    public x10.array.Dist points_dist;
                    public x10.array.DistArray<x10.core.Float> points;
                    
                    // creation method for java code
                    public static KMeansDist.$Closure$156 $make(final x10.array.Dist points_dist,
                                                                final x10.array.DistArray<x10.core.Float> points,java.lang.Class<?> $dummy0){return new $Closure$156(points_dist,points,(java.lang.Class<?>) null);}
                    public $Closure$156(final x10.array.Dist points_dist,
                                        final x10.array.DistArray<x10.core.Float> points,java.lang.Class<?> $dummy0) { {
                                                                                                                              this.points_dist = ((x10.array.Dist)(points_dist));
                                                                                                                              this.points = ((x10.array.DistArray)(points));
                                                                                                                          }}
                    
                }
                
            public static class $Closure$157 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$157.class);
                
                public static final x10.rtt.RuntimeType<$Closure$157> $RTT = new x10.rtt.StaticVoidFunType<$Closure$157>(
                /* base class */$Closure$157.class
                , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$157 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$157.class + " calling"); } 
                    x10.lang.PlaceLocalHandle local_curr_clusters = (x10.lang.PlaceLocalHandle) $deserializer.readRef();
                    $_obj.local_curr_clusters = local_curr_clusters;
                    x10.array.Array central_clusters = (x10.array.Array) $deserializer.readRef();
                    $_obj.central_clusters = central_clusters;
                    x10.lang.PlaceLocalHandle local_new_clusters = (x10.lang.PlaceLocalHandle) $deserializer.readRef();
                    $_obj.local_new_clusters = local_new_clusters;
                    x10.lang.PlaceLocalHandle local_cluster_counts = (x10.lang.PlaceLocalHandle) $deserializer.readRef();
                    $_obj.local_cluster_counts = local_cluster_counts;
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$157 $_obj = new $Closure$157((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    if (local_curr_clusters instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.local_curr_clusters);
                    } else {
                    $serializer.write(this.local_curr_clusters);
                    }
                    if (central_clusters instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.central_clusters);
                    } else {
                    $serializer.write(this.central_clusters);
                    }
                    if (local_new_clusters instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.local_new_clusters);
                    } else {
                    $serializer.write(this.local_new_clusters);
                    }
                    if (local_cluster_counts instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.local_cluster_counts);
                    } else {
                    $serializer.write(this.local_cluster_counts);
                    }
                    
                }
                
                // constructor just for allocation
                public $Closure$157(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                
                    
                    public void
                      $apply(
                      ){
                        
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int j246528 =
                          0;
                        
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                                   true;
                                                                                                                                   ) {
                            
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246529 =
                              j246528;
                            
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246530 =
                              KMeansDist.DIM;
                            
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246531 =
                              KMeansDist.CLUSTERS;
                            
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246532 =
                              8;
                            
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246533 =
                              ((t246529) < (((int)(t246532))));
                            
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246533)) {
                                
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                            }
                            
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Float> t246515 =
                              ((x10.array.Array)(((x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>>)this.
                                                                                                                local_curr_clusters).$apply$G()));
                            
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246516 =
                              j246528;
                            
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246517 =
                              j246528;
                            
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246518 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                        central_clusters).$apply$G((int)(t246517)));
                            
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
((x10.array.Array<x10.core.Float>)t246515).$set__1x10$array$Array$$T$G((int)(t246516),
                                                                                                                                                                                                         x10.core.Float.$box(t246518));
                            
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Float> t246519 =
                              ((x10.array.Array)(((x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>>)this.
                                                                                                                local_new_clusters).$apply$G()));
                            
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246520 =
                              j246528;
                            
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246521 =
                              ((float)(int)(((int)(0))));
                            
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
((x10.array.Array<x10.core.Float>)t246519).$set__1x10$array$Array$$T$G((int)(t246520),
                                                                                                                                                                                                         x10.core.Float.$box(t246521));
                            
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246522 =
                              j246528;
                            
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246523 =
                              ((t246522) + (((int)(1))));
                            
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
j246528 = t246523;
                        }
                        
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int j246534 =
                          0;
                        
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                                   true;
                                                                                                                                   ) {
                            
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246535 =
                              j246534;
                            
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246536 =
                              KMeansDist.CLUSTERS;
                            
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246537 =
                              ((t246535) < (((int)(t246536))));
                            
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246537)) {
                                
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                            }
                            
//#line 61 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Int> t246524 =
                              ((x10.array.Array)(((x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Int>>)this.
                                                                                                              local_cluster_counts).$apply$G()));
                            
//#line 61 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246525 =
                              j246534;
                            
//#line 61 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
((x10.array.Array<x10.core.Int>)t246524).$set__1x10$array$Array$$T$G((int)(t246525),
                                                                                                                                                                                                       x10.core.Int.$box(0));
                            
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246526 =
                              j246534;
                            
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246527 =
                              ((t246526) + (((int)(1))));
                            
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
j246534 = t246527;
                        }
                    }
                    
                    public x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_curr_clusters;
                    public x10.array.Array<x10.core.Float> central_clusters;
                    public x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_new_clusters;
                    public x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Int>> local_cluster_counts;
                    
                    // creation method for java code
                    public static KMeansDist.$Closure$157 $make(final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_curr_clusters,
                                                                final x10.array.Array<x10.core.Float> central_clusters,
                                                                final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_new_clusters,
                                                                final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Int>> local_cluster_counts,java.lang.Class<?> $dummy0){return new $Closure$157(local_curr_clusters,central_clusters,local_new_clusters,local_cluster_counts,(java.lang.Class<?>) null);}
                    public $Closure$157(final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_curr_clusters,
                                        final x10.array.Array<x10.core.Float> central_clusters,
                                        final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_new_clusters,
                                        final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Int>> local_cluster_counts,java.lang.Class<?> $dummy0) { {
                                                                                                                                                                 this.local_curr_clusters = ((x10.lang.PlaceLocalHandle)(local_curr_clusters));
                                                                                                                                                                 this.central_clusters = ((x10.array.Array)(central_clusters));
                                                                                                                                                                 this.local_new_clusters = ((x10.lang.PlaceLocalHandle)(local_new_clusters));
                                                                                                                                                                 this.local_cluster_counts = ((x10.lang.PlaceLocalHandle)(local_cluster_counts));
                                                                                                                                                             }}
                    
                }
                
            public static class $Closure$158 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$158.class);
                
                public static final x10.rtt.RuntimeType<$Closure$158> $RTT = new x10.rtt.StaticVoidFunType<$Closure$158>(
                /* base class */$Closure$158.class
                , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$158 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$158.class + " calling"); } 
                    $_obj.p246590 = $deserializer.readInt();
                    x10.array.DistArray points = (x10.array.DistArray) $deserializer.readRef();
                    $_obj.points = points;
                    x10.lang.PlaceLocalHandle local_curr_clusters = (x10.lang.PlaceLocalHandle) $deserializer.readRef();
                    $_obj.local_curr_clusters = local_curr_clusters;
                    x10.lang.PlaceLocalHandle local_new_clusters = (x10.lang.PlaceLocalHandle) $deserializer.readRef();
                    $_obj.local_new_clusters = local_new_clusters;
                    x10.lang.PlaceLocalHandle local_cluster_counts = (x10.lang.PlaceLocalHandle) $deserializer.readRef();
                    $_obj.local_cluster_counts = local_cluster_counts;
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$158 $_obj = new $Closure$158((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    $serializer.write(this.p246590);
                    if (points instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.points);
                    } else {
                    $serializer.write(this.points);
                    }
                    if (local_curr_clusters instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.local_curr_clusters);
                    } else {
                    $serializer.write(this.local_curr_clusters);
                    }
                    if (local_new_clusters instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.local_new_clusters);
                    } else {
                    $serializer.write(this.local_new_clusters);
                    }
                    if (local_cluster_counts instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.local_cluster_counts);
                    } else {
                    $serializer.write(this.local_cluster_counts);
                    }
                    
                }
                
                // constructor just for allocation
                public $Closure$158(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                
                    
                    public void
                      $apply(
                      ){
                        
//#line 71 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int closest246592 =
                          -1;
                        
//#line 72 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
float closest_dist246593 =
                          java.lang.Float.MAX_VALUE;
                        
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int k246580 =
                          0;
                        
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                                   true;
                                                                                                                                   ) {
                            
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246581 =
                              k246580;
                            
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246582 =
                              KMeansDist.CLUSTERS;
                            
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246583 =
                              ((t246581) < (((int)(t246582))));
                            
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246583)) {
                                
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                            }
                            
//#line 74 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
float dist246559 =
                              ((float)(int)(((int)(0))));
                            
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int d246555 =
                              0;
                            
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                                       true;
                                                                                                                                       ) {
                                
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246556 =
                                  d246555;
                                
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246557 =
                                  KMeansDist.DIM;
                                
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246558 =
                                  ((t246556) < (((int)(t246557))));
                                
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246558)) {
                                    
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                                }
                                
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246539 =
                                  d246555;
                                
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Point t246540 =
                                  ((x10.array.Point)(x10.array.Point.make((int)(this.
                                                                                  p246590),
                                                                          (int)(t246539))));
                                
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246541 =
                                  x10.core.Float.$unbox(((x10.array.DistArray<x10.core.Float>)this.
                                                                                                points).$apply$G(((x10.array.Point)(t246540))));
                                
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Float> t246542 =
                                  ((x10.array.Array)(((x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>>)this.
                                                                                                                    local_curr_clusters).$apply$G()));
                                
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246543 =
                                  k246580;
                                
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246544 =
                                  KMeansDist.DIM;
                                
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246545 =
                                  ((t246543) * (((int)(t246544))));
                                
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246546 =
                                  d246555;
                                
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246547 =
                                  ((t246545) + (((int)(t246546))));
                                
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246548 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)t246542).$apply$G((int)(t246547)));
                                
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float tmp246549 =
                                  ((t246541) - (((float)(t246548))));
                                
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246550 =
                                  dist246559;
                                
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246551 =
                                  ((tmp246549) * (((float)(tmp246549))));
                                
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246552 =
                                  ((t246550) + (((float)(t246551))));
                                
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
dist246559 = t246552;
                                
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246553 =
                                  d246555;
                                
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246554 =
                                  ((t246553) + (((int)(1))));
                                
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
d246555 = t246554;
                            }
                            
//#line 79 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246560 =
                              dist246559;
                            
//#line 79 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246561 =
                              closest_dist246593;
                            
//#line 79 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246562 =
                              ((t246560) < (((float)(t246561))));
                            
//#line 79 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (t246562) {
                                
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246563 =
                                  dist246559;
                                
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
closest_dist246593 = t246563;
                                
//#line 81 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246564 =
                                  k246580;
                                
//#line 81 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
closest246592 = t246564;
                            }
                            
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246565 =
                              k246580;
                            
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246566 =
                              ((t246565) + (((int)(1))));
                            
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
k246580 = t246566;
                        }
                        
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int d246584 =
                          0;
                        
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                                   true;
                                                                                                                                   ) {
                            
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246585 =
                              d246584;
                            
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246586 =
                              KMeansDist.DIM;
                            
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246587 =
                              ((t246585) < (((int)(t246586))));
                            
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246587)) {
                                
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                            }
                            
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Float> x246569 =
                              ((x10.array.Array)(((x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>>)this.
                                                                                                                local_new_clusters).$apply$G()));
                            
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246570 =
                              closest246592;
                            
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246571 =
                              ((t246570) * (((int)(2))));
                            
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246572 =
                              d246584;
                            
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int y246573 =
                              ((t246571) + (((int)(t246572))));
                            
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246574 =
                              d246584;
                            
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Point t246575 =
                              ((x10.array.Point)(x10.array.Point.make((int)(this.
                                                                              p246590),
                                                                      (int)(t246574))));
                            
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float z246576 =
                              x10.core.Float.$unbox(((x10.array.DistArray<x10.core.Float>)this.
                                                                                            points).$apply$G(((x10.array.Point)(t246575))));
                            
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
float ret246577 =
                               0;
                            
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246567 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)x246569).$apply$G((int)(y246573)));
                            
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float r246568 =
                              ((t246567) + (((float)(z246576))));
                            
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
((x10.array.Array<x10.core.Float>)x246569).$set__1x10$array$Array$$T$G((int)(y246573),
                                                                                                                                                                                                         x10.core.Float.$box(r246568));
                            
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
ret246577 = r246568;
                            
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246578 =
                              d246584;
                            
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246579 =
                              ((t246578) + (((int)(1))));
                            
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
d246584 = t246579;
                        }
                        
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Int> x246594 =
                          ((x10.array.Array)(((x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Int>>)this.
                                                                                                          local_cluster_counts).$apply$G()));
                        
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int y246595 =
                          closest246592;
                        
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
;
                        
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int ret246596 =
                           0;
                        
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246588 =
                          x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x246594).$apply$G((int)(y246595)));
                        
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int r246589 =
                          ((t246588) + (((int)(1))));
                        
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
((x10.array.Array<x10.core.Int>)x246594).$set__1x10$array$Array$$T$G((int)(y246595),
                                                                                                                                                                                                   x10.core.Int.$box(r246589));
                        
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
ret246596 = r246589;
                    }
                    
                    public int p246590;
                    public x10.array.DistArray<x10.core.Float> points;
                    public x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_curr_clusters;
                    public x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_new_clusters;
                    public x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Int>> local_cluster_counts;
                    
                    // creation method for java code
                    public static KMeansDist.$Closure$158 $make(final int p246590,
                                                                final x10.array.DistArray<x10.core.Float> points,
                                                                final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_curr_clusters,
                                                                final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_new_clusters,
                                                                final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Int>> local_cluster_counts,java.lang.Class<?> $dummy0){return new $Closure$158(p246590,points,local_curr_clusters,local_new_clusters,local_cluster_counts,(java.lang.Class<?>) null);}
                    public $Closure$158(final int p246590,
                                        final x10.array.DistArray<x10.core.Float> points,
                                        final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_curr_clusters,
                                        final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_new_clusters,
                                        final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Int>> local_cluster_counts,java.lang.Class<?> $dummy0) { {
                                                                                                                                                                 this.p246590 = p246590;
                                                                                                                                                                 this.points = ((x10.array.DistArray)(points));
                                                                                                                                                                 this.local_curr_clusters = ((x10.lang.PlaceLocalHandle)(local_curr_clusters));
                                                                                                                                                                 this.local_new_clusters = ((x10.lang.PlaceLocalHandle)(local_new_clusters));
                                                                                                                                                                 this.local_cluster_counts = ((x10.lang.PlaceLocalHandle)(local_cluster_counts));
                                                                                                                                                             }}
                    
                }
                
            public static class $Closure$159 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$159.class);
                
                public static final x10.rtt.RuntimeType<$Closure$159> $RTT = new x10.rtt.StaticVoidFunType<$Closure$159>(
                /* base class */$Closure$159.class
                , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$159 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$159.class + " calling"); } 
                    x10.array.Dist points_dist = (x10.array.Dist) $deserializer.readRef();
                    $_obj.points_dist = points_dist;
                    $_obj.p246590 = $deserializer.readInt();
                    x10.array.DistArray points = (x10.array.DistArray) $deserializer.readRef();
                    $_obj.points = points;
                    x10.lang.PlaceLocalHandle local_curr_clusters = (x10.lang.PlaceLocalHandle) $deserializer.readRef();
                    $_obj.local_curr_clusters = local_curr_clusters;
                    x10.lang.PlaceLocalHandle local_new_clusters = (x10.lang.PlaceLocalHandle) $deserializer.readRef();
                    $_obj.local_new_clusters = local_new_clusters;
                    x10.lang.PlaceLocalHandle local_cluster_counts = (x10.lang.PlaceLocalHandle) $deserializer.readRef();
                    $_obj.local_cluster_counts = local_cluster_counts;
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$159 $_obj = new $Closure$159((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    if (points_dist instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.points_dist);
                    } else {
                    $serializer.write(this.points_dist);
                    }
                    $serializer.write(this.p246590);
                    if (points instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.points);
                    } else {
                    $serializer.write(this.points);
                    }
                    if (local_curr_clusters instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.local_curr_clusters);
                    } else {
                    $serializer.write(this.local_curr_clusters);
                    }
                    if (local_new_clusters instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.local_new_clusters);
                    } else {
                    $serializer.write(this.local_new_clusters);
                    }
                    if (local_cluster_counts instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.local_cluster_counts);
                    } else {
                    $serializer.write(this.local_cluster_counts);
                    }
                    
                }
                
                // constructor just for allocation
                public $Closure$159(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                
                    
                    public void
                      $apply(
                      ){
                        
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.lang.Place t246591 =
                          this.
                            points_dist.$apply((int)(this.
                                                       p246590),
                                               (int)(0));
                        
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
x10.lang.Runtime.runAt(((x10.lang.Place)(t246591)),
                                                                                                                                                     ((x10.core.fun.VoidFun_0_0)(new KMeansDist.$Closure$158(((int)(this.
                                                                                                                                                                                                                      p246590)),
                                                                                                                                                                                                             ((x10.array.DistArray)(this.
                                                                                                                                                                                                                                      points)),
                                                                                                                                                                                                             ((x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>>)(this.
                                                                                                                                                                                                                                                                             local_curr_clusters)),
                                                                                                                                                                                                             ((x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>>)(this.
                                                                                                                                                                                                                                                                             local_new_clusters)),
                                                                                                                                                                                                             ((x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Int>>)(this.
                                                                                                                                                                                                                                                                           local_cluster_counts)),(java.lang.Class<?>) null))));
                    }
                    
                    public x10.array.Dist points_dist;
                    public int p246590;
                    public x10.array.DistArray<x10.core.Float> points;
                    public x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_curr_clusters;
                    public x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_new_clusters;
                    public x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Int>> local_cluster_counts;
                    
                    // creation method for java code
                    public static KMeansDist.$Closure$159 $make(final x10.array.Dist points_dist,
                                                                final int p246590,
                                                                final x10.array.DistArray<x10.core.Float> points,
                                                                final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_curr_clusters,
                                                                final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_new_clusters,
                                                                final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Int>> local_cluster_counts,java.lang.Class<?> $dummy0){return new $Closure$159(points_dist,p246590,points,local_curr_clusters,local_new_clusters,local_cluster_counts,(java.lang.Class<?>) null);}
                    public $Closure$159(final x10.array.Dist points_dist,
                                        final int p246590,
                                        final x10.array.DistArray<x10.core.Float> points,
                                        final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_curr_clusters,
                                        final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_new_clusters,
                                        final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Int>> local_cluster_counts,java.lang.Class<?> $dummy0) { {
                                                                                                                                                                 this.points_dist = ((x10.array.Dist)(points_dist));
                                                                                                                                                                 this.p246590 = p246590;
                                                                                                                                                                 this.points = ((x10.array.DistArray)(points));
                                                                                                                                                                 this.local_curr_clusters = ((x10.lang.PlaceLocalHandle)(local_curr_clusters));
                                                                                                                                                                 this.local_new_clusters = ((x10.lang.PlaceLocalHandle)(local_new_clusters));
                                                                                                                                                                 this.local_cluster_counts = ((x10.lang.PlaceLocalHandle)(local_cluster_counts));
                                                                                                                                                             }}
                    
                }
                
            public static class $Closure$160 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$160.class);
                
                public static final x10.rtt.RuntimeType<$Closure$160> $RTT = new x10.rtt.StaticVoidFunType<$Closure$160>(
                /* base class */$Closure$160.class
                , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$160 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$160.class + " calling"); } 
                    x10.core.GlobalRef central_clusters_gr246715 = (x10.core.GlobalRef) $deserializer.readRef();
                    $_obj.central_clusters_gr246715 = central_clusters_gr246715;
                    x10.array.Array tmp_new_clusters246639 = (x10.array.Array) $deserializer.readRef();
                    $_obj.tmp_new_clusters246639 = tmp_new_clusters246639;
                    x10.core.GlobalRef central_cluster_counts_gr246717 = (x10.core.GlobalRef) $deserializer.readRef();
                    $_obj.central_cluster_counts_gr246717 = central_cluster_counts_gr246717;
                    x10.array.Array tmp_cluster_counts246640 = (x10.array.Array) $deserializer.readRef();
                    $_obj.tmp_cluster_counts246640 = tmp_cluster_counts246640;
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$160 $_obj = new $Closure$160((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    if (central_clusters_gr246715 instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.central_clusters_gr246715);
                    } else {
                    $serializer.write(this.central_clusters_gr246715);
                    }
                    if (tmp_new_clusters246639 instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.tmp_new_clusters246639);
                    } else {
                    $serializer.write(this.tmp_new_clusters246639);
                    }
                    if (central_cluster_counts_gr246717 instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.central_cluster_counts_gr246717);
                    } else {
                    $serializer.write(this.central_cluster_counts_gr246717);
                    }
                    if (tmp_cluster_counts246640 instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.tmp_cluster_counts246640);
                    } else {
                    $serializer.write(this.tmp_cluster_counts246640);
                    }
                    
                }
                
                // constructor just for allocation
                public $Closure$160(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                
                    
                    public void
                      $apply(
                      ){
                        
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
try {{
                            
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
x10.lang.Runtime.enterAtomic();
                            {
                                
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int j246628 =
                                  0;
                                
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                                            true;
                                                                                                                                            ) {
                                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246629 =
                                      j246628;
                                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246630 =
                                      KMeansDist.DIM;
                                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246631 =
                                      KMeansDist.CLUSTERS;
                                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246632 =
                                      8;
                                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246633 =
                                      ((t246629) < (((int)(t246632))));
                                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246633)) {
                                        
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                                    }
                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Float> x246611 =
                                      ((x10.array.Array)((((x10.core.GlobalRef<x10.array.Array<x10.core.Float>>)(this.
                                                                                                                   central_clusters_gr246715))).$apply$G()));
                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int y246612 =
                                      j246628;
                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246613 =
                                      j246628;
                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float z246614 =
                                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                                tmp_new_clusters246639).$apply$G((int)(t246613)));
                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
float ret246615 =
                                       0;
                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float t246609 =
                                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)x246611).$apply$G((int)(y246612)));
                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final float r246610 =
                                      ((t246609) + (((float)(z246614))));
                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
((x10.array.Array<x10.core.Float>)x246611).$set__1x10$array$Array$$T$G((int)(y246612),
                                                                                                                                                                                                                  x10.core.Float.$box(r246610));
                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
ret246615 = r246610;
                                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246616 =
                                      j246628;
                                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246617 =
                                      ((t246616) + (((int)(1))));
                                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
j246628 = t246617;
                                }
                                
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int j246634 =
                                  0;
                                
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
for (;
                                                                                                                                            true;
                                                                                                                                            ) {
                                    
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246635 =
                                      j246634;
                                    
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246636 =
                                      KMeansDist.CLUSTERS;
                                    
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final boolean t246637 =
                                      ((t246635) < (((int)(t246636))));
                                    
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
if (!(t246637)) {
                                        
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
break;
                                    }
                                    
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Int> x246620 =
                                      ((x10.array.Array)((((x10.core.GlobalRef<x10.array.Array<x10.core.Int>>)(this.
                                                                                                                 central_cluster_counts_gr246717))).$apply$G()));
                                    
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int y246621 =
                                      j246634;
                                    
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246622 =
                                      j246634;
                                    
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int z246623 =
                                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)this.
                                                                                            tmp_cluster_counts246640).$apply$G((int)(t246622)));
                                    
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
int ret246624 =
                                       0;
                                    
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246618 =
                                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x246620).$apply$G((int)(y246621)));
                                    
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int r246619 =
                                      ((t246618) + (((int)(z246623))));
                                    
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
((x10.array.Array<x10.core.Int>)x246620).$set__1x10$array$Array$$T$G((int)(y246621),
                                                                                                                                                                                                                x10.core.Int.$box(r246619));
                                    
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
ret246624 = r246619;
                                    
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246626 =
                                      j246634;
                                    
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final int t246627 =
                                      ((t246626) + (((int)(1))));
                                    
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
j246634 = t246627;
                                }
                            }
                        }}finally {{
                              
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
x10.lang.Runtime.exitAtomic();
                          }}
                        }
                    
                    public x10.core.GlobalRef<x10.array.Array<x10.core.Float>> central_clusters_gr246715;
                    public x10.array.Array<x10.core.Float> tmp_new_clusters246639;
                    public x10.core.GlobalRef<x10.array.Array<x10.core.Int>> central_cluster_counts_gr246717;
                    public x10.array.Array<x10.core.Int> tmp_cluster_counts246640;
                    
                    // creation method for java code
                    public static KMeansDist.$Closure$160 $make(final x10.core.GlobalRef<x10.array.Array<x10.core.Float>> central_clusters_gr246715,
                                                                final x10.array.Array<x10.core.Float> tmp_new_clusters246639,
                                                                final x10.core.GlobalRef<x10.array.Array<x10.core.Int>> central_cluster_counts_gr246717,
                                                                final x10.array.Array<x10.core.Int> tmp_cluster_counts246640,java.lang.Class<?> $dummy0){return new $Closure$160(central_clusters_gr246715,tmp_new_clusters246639,central_cluster_counts_gr246717,tmp_cluster_counts246640,(java.lang.Class<?>) null);}
                    public $Closure$160(final x10.core.GlobalRef<x10.array.Array<x10.core.Float>> central_clusters_gr246715,
                                        final x10.array.Array<x10.core.Float> tmp_new_clusters246639,
                                        final x10.core.GlobalRef<x10.array.Array<x10.core.Int>> central_cluster_counts_gr246717,
                                        final x10.array.Array<x10.core.Int> tmp_cluster_counts246640,java.lang.Class<?> $dummy0) { {
                                                                                                                                          this.central_clusters_gr246715 = ((x10.core.GlobalRef)(central_clusters_gr246715));
                                                                                                                                          this.tmp_new_clusters246639 = ((x10.array.Array)(tmp_new_clusters246639));
                                                                                                                                          this.central_cluster_counts_gr246717 = ((x10.core.GlobalRef)(central_cluster_counts_gr246717));
                                                                                                                                          this.tmp_cluster_counts246640 = ((x10.array.Array)(tmp_cluster_counts246640));
                                                                                                                                      }}
                    
                    }
                    
                public static class $Closure$161 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$161.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$161> $RTT = new x10.rtt.StaticVoidFunType<$Closure$161>(
                    /* base class */$Closure$161.class
                    , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$161 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$161.class + " calling"); } 
                        x10.lang.PlaceLocalHandle local_new_clusters = (x10.lang.PlaceLocalHandle) $deserializer.readRef();
                        $_obj.local_new_clusters = local_new_clusters;
                        x10.lang.PlaceLocalHandle local_cluster_counts = (x10.lang.PlaceLocalHandle) $deserializer.readRef();
                        $_obj.local_cluster_counts = local_cluster_counts;
                        x10.lang.Place there246718 = (x10.lang.Place) $deserializer.readRef();
                        $_obj.there246718 = there246718;
                        x10.core.GlobalRef central_clusters_gr246715 = (x10.core.GlobalRef) $deserializer.readRef();
                        $_obj.central_clusters_gr246715 = central_clusters_gr246715;
                        x10.core.GlobalRef central_cluster_counts_gr246717 = (x10.core.GlobalRef) $deserializer.readRef();
                        $_obj.central_cluster_counts_gr246717 = central_cluster_counts_gr246717;
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$161 $_obj = new $Closure$161((java.lang.System[]) null);
                        $deserializer.record_reference($_obj);
                        return $_deserialize_body($_obj, $deserializer);
                        
                    }
                    
                    public short $_get_serialization_id() {
                    
                         return $_serialization_id;
                        
                    }
                    
                    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                        if (local_new_clusters instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.local_new_clusters);
                        } else {
                        $serializer.write(this.local_new_clusters);
                        }
                        if (local_cluster_counts instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.local_cluster_counts);
                        } else {
                        $serializer.write(this.local_cluster_counts);
                        }
                        if (there246718 instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.there246718);
                        } else {
                        $serializer.write(this.there246718);
                        }
                        if (central_clusters_gr246715 instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.central_clusters_gr246715);
                        } else {
                        $serializer.write(this.central_clusters_gr246715);
                        }
                        if (central_cluster_counts_gr246717 instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.central_cluster_counts_gr246717);
                        } else {
                        $serializer.write(this.central_cluster_counts_gr246717);
                        }
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$161(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    
                        
                        public void
                          $apply(
                          ){
                            
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Float> tmp_new_clusters246639 =
                              ((x10.array.Array)(((x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>>)this.
                                                                                                                local_new_clusters).$apply$G()));
                            
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
final x10.array.Array<x10.core.Int> tmp_cluster_counts246640 =
                              ((x10.array.Array)(((x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Int>>)this.
                                                                                                              local_cluster_counts).$apply$G()));
                            
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansDist.x10"
x10.lang.Runtime.runAt(((x10.lang.Place)(this.
                                                                                                                                                                              there246718)),
                                                                                                                                                          ((x10.core.fun.VoidFun_0_0)(new KMeansDist.$Closure$160(((x10.core.GlobalRef<x10.array.Array<x10.core.Float>>)(this.
                                                                                                                                                                                                                                                                           central_clusters_gr246715)),
                                                                                                                                                                                                                  tmp_new_clusters246639,
                                                                                                                                                                                                                  ((x10.core.GlobalRef<x10.array.Array<x10.core.Int>>)(this.
                                                                                                                                                                                                                                                                         central_cluster_counts_gr246717)),
                                                                                                                                                                                                                  tmp_cluster_counts246640,(java.lang.Class<?>) null))));
                        }
                        
                        public x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_new_clusters;
                        public x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Int>> local_cluster_counts;
                        public x10.lang.Place there246718;
                        public x10.core.GlobalRef<x10.array.Array<x10.core.Float>> central_clusters_gr246715;
                        public x10.core.GlobalRef<x10.array.Array<x10.core.Int>> central_cluster_counts_gr246717;
                        
                        // creation method for java code
                        public static KMeansDist.$Closure$161 $make(final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_new_clusters,
                                                                    final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Int>> local_cluster_counts,
                                                                    final x10.lang.Place there246718,
                                                                    final x10.core.GlobalRef<x10.array.Array<x10.core.Float>> central_clusters_gr246715,
                                                                    final x10.core.GlobalRef<x10.array.Array<x10.core.Int>> central_cluster_counts_gr246717,java.lang.Class<?> $dummy0){return new $Closure$161(local_new_clusters,local_cluster_counts,there246718,central_clusters_gr246715,central_cluster_counts_gr246717,(java.lang.Class<?>) null);}
                        public $Closure$161(final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Float>> local_new_clusters,
                                            final x10.lang.PlaceLocalHandle<x10.array.Array<x10.core.Int>> local_cluster_counts,
                                            final x10.lang.Place there246718,
                                            final x10.core.GlobalRef<x10.array.Array<x10.core.Float>> central_clusters_gr246715,
                                            final x10.core.GlobalRef<x10.array.Array<x10.core.Int>> central_cluster_counts_gr246717,java.lang.Class<?> $dummy0) { {
                                                                                                                                                                         this.local_new_clusters = ((x10.lang.PlaceLocalHandle)(local_new_clusters));
                                                                                                                                                                         this.local_cluster_counts = ((x10.lang.PlaceLocalHandle)(local_cluster_counts));
                                                                                                                                                                         this.there246718 = ((x10.lang.Place)(there246718));
                                                                                                                                                                         this.central_clusters_gr246715 = ((x10.core.GlobalRef)(central_clusters_gr246715));
                                                                                                                                                                         this.central_cluster_counts_gr246717 = ((x10.core.GlobalRef)(central_cluster_counts_gr246717));
                                                                                                                                                                     }}
                        
                    }
                    
                
            }
            