
public class KMeansCUDA extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, KMeansCUDA.class);
    
    public static final x10.rtt.RuntimeType<KMeansCUDA> $RTT = new x10.rtt.NamedType<KMeansCUDA>(
    "KMeansCUDA", /* base class */KMeansCUDA.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(KMeansCUDA $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + KMeansCUDA.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        KMeansCUDA $_obj = new KMeansCUDA((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public KMeansCUDA(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
public static void
                                                                                                             printClusters__0$1x10$lang$Float$2(
                                                                                                             final x10.array.Array<x10.core.Float> clusters,
                                                                                                             final int dims){
            
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int d =
              0;
            
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                    true;
                                                                                                                    ) {
                
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t171988 =
                  d;
                
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172008 =
                  ((t171988) < (((int)(dims))));
                
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t172008)) {
                    
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                }
                
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int k172745 =
                  0;
                
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                        true;
                                                                                                                        ) {
                    
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172746 =
                      k172745;
                    
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172747 =
                      ((x10.array.Array<x10.core.Float>)clusters).
                        size;
                    
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172748 =
                      ((t172747) / (((int)(dims))));
                    
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172749 =
                      ((t172746) < (((int)(t172748))));
                    
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t172749)) {
                        
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                    }
                    
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172734 =
                      k172745;
                    
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172735 =
                      ((t172734) > (((int)(0))));
                    
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t172735) {
                        
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Printer t172736 =
                          ((x10.io.Printer)(x10.io.Console.OUT));
                        
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t172736.print(((java.lang.String)(" ")));
                    }
                    
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Printer t172737 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172738 =
                      k172745;
                    
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172739 =
                      ((t172738) * (((int)(dims))));
                    
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172740 =
                      d;
                    
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172741 =
                      ((t172739) + (((int)(t172740))));
                    
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172742 =
                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)clusters).$apply$G((int)(t172741)));
                    
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t172737.printf(((java.lang.String)("%.2f")),
                                                                                                                                      x10.core.Float.$box(t172742));
                    
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172743 =
                      k172745;
                    
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172744 =
                      ((t172743) + (((int)(1))));
                    
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
k172745 = t172744;
                }
                
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Printer t172750 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t172750.println();
                
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172751 =
                  d;
                
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172752 =
                  ((t172751) + (((int)(1))));
                
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
d = t172752;
            }
        }
        
        
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
private static int
                                                                                                             round_up$O(
                                                                                                             final int x,
                                                                                                             final int n){
            
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172010 =
              ((x) - (((int)(1))));
            
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172009 =
              ((x) - (((int)(1))));
            
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172011 =
              ((t172009) % (((int)(n))));
            
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172012 =
              ((t172010) - (((int)(t172011))));
            
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172013 =
              ((t172012) + (((int)(n))));
            
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
return t172013;
        }
        
        public static int
          round_up$P$O(
          final int x,
          final int n){
            return KMeansCUDA.round_up$O((int)(x),
                                         (int)(n));
        }
        
        
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        KMeansCUDA.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> args) {
            
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
try {try {{
                
//#line 50 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.util.Option t172014 =
                  new x10.util.Option((java.lang.System[]) null).$init(((java.lang.String)("q")),
                                                                       ((java.lang.String)("quiet")),
                                                                       ((java.lang.String)("just print time taken")));
                
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.util.Option t172015 =
                  new x10.util.Option((java.lang.System[]) null).$init(((java.lang.String)("v")),
                                                                       ((java.lang.String)("verbose")),
                                                                       ((java.lang.String)("print out each iteration")));
                
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.array.Array<x10.util.Option> t172020 =
                  ((x10.array.Array)(x10.core.ArrayFactory.<x10.util.Option> makeArrayFromJavaArray(x10.util.Option.$RTT, new x10.util.Option[] {t172014, t172015})));
                
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.util.Option t172016 =
                  new x10.util.Option((java.lang.System[]) null).$init(((java.lang.String)("p")),
                                                                       ((java.lang.String)("points")),
                                                                       ((java.lang.String)("location of data file")));
                
//#line 54 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.util.Option t172017 =
                  new x10.util.Option((java.lang.System[]) null).$init(((java.lang.String)("i")),
                                                                       ((java.lang.String)("iterations")),
                                                                       ((java.lang.String)("quit after this many iterations")));
                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.util.Option t172018 =
                  new x10.util.Option((java.lang.System[]) null).$init(((java.lang.String)("c")),
                                                                       ((java.lang.String)("clusters")),
                                                                       ((java.lang.String)("number of clusters to find")));
                
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.util.Option t172019 =
                  new x10.util.Option((java.lang.System[]) null).$init(((java.lang.String)("n")),
                                                                       ((java.lang.String)("num")),
                                                                       ((java.lang.String)("quantity of points")));
                
//#line 52 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.array.Array<x10.util.Option> t172021 =
                  ((x10.array.Array)(x10.core.ArrayFactory.<x10.util.Option> makeArrayFromJavaArray(x10.util.Option.$RTT, new x10.util.Option[] {t172016, t172017, t172018, t172019})));
                
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.util.OptionsParser opts =
                  ((x10.util.OptionsParser)(new x10.util.OptionsParser((java.lang.System[]) null).$init(((x10.array.Array)(args)),
                                                                                                        ((x10.array.Array)(t172020)),
                                                                                                        ((x10.array.Array)(t172021)),(java.lang.Class<?>) null)));
                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String fname =
                  opts.$apply$O(((java.lang.String)("-p")),
                                ((java.lang.String)("points.dat")));
                
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int num_clusters =
                  opts.$apply$O(((java.lang.String)("-c")),
                                (int)(8));
                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int num_global_points =
                  opts.$apply$O(((java.lang.String)("-n")),
                                (int)(100000));
                
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int iterations =
                  opts.$apply$O(((java.lang.String)("-i")),
                                (int)(500));
                
//#line 61 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean verbose =
                  opts.$apply$O(((java.lang.String)("-v")));
                
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean quiet =
                  opts.$apply$O(((java.lang.String)("-q")));
                
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int dim =
                  4;
                
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int MEM_ALIGN =
                  32;
                
//#line 67 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172028 =
                  !(quiet);
                
//#line 67 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t172028) {
                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Printer t172026 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t172022 =
                      (("points: ") + ((x10.core.Int.$box(num_global_points))));
                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t172023 =
                      ((t172022) + (" clusters: "));
                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t172024 =
                      ((t172023) + ((x10.core.Int.$box(num_clusters))));
                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t172025 =
                      ((t172024) + (" dim: "));
                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t172027 =
                      ((t172025) + ((x10.core.Int.$box(dim))));
                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t172026.println(((java.lang.String)(t172027)));
                }
                
//#line 71 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.File file =
                  ((x10.io.File)(new x10.io.File((java.lang.System[]) null).$init(((java.lang.String)(fname)))));
                
//#line 72 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.FileReader fr =
                  file.openRead();
                
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> init_points =
                  ((x10.core.fun.Fun_0_1)(new KMeansCUDA.$Closure$115(fr)));
                
//#line 74 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t172033 =
                  file.size$O();
                
//#line 74 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t172034 =
                  ((long)(((int)(4))));
                
//#line 74 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t172035 =
                  ((t172033) / (((long)(t172034))));
                
//#line 74 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t172036 =
                  ((long)(((int)(dim))));
                
//#line 74 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t172037 =
                  ((t172035) / (((long)(t172036))));
                
//#line 74 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int num_file_points =
                  ((int)(long)(((long)(t172037))));
                
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172038 =
                  ((num_file_points) * (((int)(dim))));
                
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.array.Array<x10.core.Float> file_points =
                  ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(t172038,
                                                                                                                               ((x10.core.fun.Fun_0_1)(init_points)),(java.lang.Class<?>[][][][]) null)));
                
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172048 =
                  !(quiet);
                
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t172048) {
                    
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172039 =
                      x10.lang.Place.getInitialized$NUM_ACCELS();
                    
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172047 =
                      ((int) t172039) ==
                    ((int) 0);
                    
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t172047) {
                        
//#line 79 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Printer t172040 =
                          ((x10.io.Printer)(x10.io.Console.OUT));
                        
//#line 79 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t172040.println(((java.lang.String)("Running without using GPUs.  Running the kernel on the CPU.")));
                        
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Printer t172041 =
                          ((x10.io.Printer)(x10.io.Console.OUT));
                        
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t172041.println(((java.lang.String)("If that\'s not what you want, set X10RT_ACCELS=ALL to use all GPUs at each place.")));
                        
//#line 81 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Printer t172042 =
                          ((x10.io.Printer)(x10.io.Console.OUT));
                        
//#line 81 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t172042.println(((java.lang.String)("For more information, see the X10/CUDA documentation.")));
                    } else {
                        
//#line 83 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Printer t172045 =
                          ((x10.io.Printer)(x10.io.Console.OUT));
                        
//#line 83 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172043 =
                          x10.lang.Place.getInitialized$NUM_ACCELS();
                        
//#line 83 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t172044 =
                          (("Running using ") + ((x10.core.Int.$box(t172043))));
                        
//#line 83 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t172046 =
                          ((t172044) + (" GPUs."));
                        
//#line 83 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t172045.println(((java.lang.String)(t172046)));
                    }
                }
                
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172049 =
                  x10.lang.Place.getInitialized$NUM_ACCELS();
                
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172057 =
                  ((int) t172049) ==
                ((int) 0);
                
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.util.Team t172058 =
                   null;
                
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t172057) {
                    
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t172058 = x10.util.Team.getInitialized$WORLD();
                } else {
                    
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172054 =
                      x10.lang.Place.getInitialized$NUM_ACCELS();
                    
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.lang.Place> t172055 =
                      ((x10.core.fun.Fun_0_1)(new KMeansCUDA.$Closure$116()));
                    
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.array.Array<x10.lang.Place> t172056 =
                      ((x10.array.Array)(new x10.array.Array<x10.lang.Place>((java.lang.System[]) null, x10.lang.Place.$RTT).$init(((int)(t172054)),
                                                                                                                                   ((x10.core.fun.Fun_0_1)(t172055)),(java.lang.Class<?>[][][][]) null)));
                    
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t172058 = new x10.util.Team((java.lang.System[]) null).$init(((x10.array.Array)(t172056)),(java.lang.Class<?>) null);
                }
                
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.util.Team team =
                  t172058;
                {
                    
//#line 89 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.ensureNotInAtomic();
                    
//#line 89 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.lang.FinishState x10$__var101 =
                      x10.lang.Runtime.startFinish();
                    
//#line 89 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
try {try {{
                        {
                            
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.lang.Sequence<x10.lang.Place> t172060 =
                              x10.lang.Place.places();
                            
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.lang.Iterator<x10.lang.Place> h171968 =
                              ((x10.lang.Iterator<x10.lang.Place>)
                                ((x10.lang.Iterable<x10.lang.Place>)t172060).iterator());
                            
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                    true;
                                                                                                                                    ) {
                                
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172732 =
                                  ((x10.lang.Iterator<x10.lang.Place>)h171968).hasNext$O();
                                
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t172732)) {
                                    
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.lang.Place h173587 =
                                  ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)h171968).next$G()));
                                
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173588 =
                                  x10.lang.Place.getInitialized$NUM_ACCELS();
                                
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173589 =
                                  ((int) t173588) ==
                                ((int) 0);
                                
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.array.Array<x10.lang.Place> t173590 =
                                   null;
                                
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173589) {
                                    
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.lang.Place t173591 =
                                      ((x10.lang.Place)x10.rtt.Types.asStruct(x10.lang.Place.$RTT,h173587));
                                    
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t173590 = ((x10.array.Array)(x10.core.ArrayFactory.<x10.lang.Place> makeArrayFromJavaArray(x10.lang.Place.$RTT, new x10.lang.Place[] {t173591})));
                                } else {
                                    
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t173590 = ((x10.array.Array)(h173587.children()));
                                }
                                
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.array.Array<x10.lang.Place> workers173592 =
                                  ((x10.array.Array)(t173590));
                                
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.lang.Iterable<x10.lang.Place> t173584 =
                                  ((x10.lang.Iterable<x10.lang.Place>)
                                    ((x10.array.Array<x10.lang.Place>)workers173592).values());
                                
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.lang.Iterator<x10.lang.Place> gpu173585 =
                                  ((x10.lang.Iterator<x10.lang.Place>)
                                    ((x10.lang.Iterable<x10.lang.Place>)t173584).iterator());
                                
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                        true;
                                                                                                                                        ) {
                                    
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173586 =
                                      ((x10.lang.Iterator<x10.lang.Place>)gpu173585).hasNext$O();
                                    
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173586)) {
                                        
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                    }
                                    
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.lang.Place gpu173510 =
                                      ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)gpu173585).next$G()));
                                    
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.runAsync(((x10.lang.Place)(h173587)),
                                                                                                                                                                 ((x10.core.fun.VoidFun_0_0)(new KMeansCUDA.$Closure$122(gpu173510,
                                                                                                                                                                                                                         h173587,
                                                                                                                                                                                                                         team,
                                                                                                                                                                                                                         num_global_points,
                                                                                                                                                                                                                         quiet,
                                                                                                                                                                                                                         MEM_ALIGN,
                                                                                                                                                                                                                         num_file_points,
                                                                                                                                                                                                                         dim,
                                                                                                                                                                                                                         file_points,
                                                                                                                                                                                                                         num_clusters,
                                                                                                                                                                                                                         iterations,
                                                                                                                                                                                                                         verbose,(java.lang.Class<?>) null))));
                                }
                            }
                        }
                    }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__77__) {
                        
//#line 89 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__77__)));
                        
//#line 89 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
throw new x10.lang.RuntimeException();
                    }finally {{
                         
//#line 89 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var101)));
                     }}
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (final x10.core.X10Throwable e) {
                    
//#line 248 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Printer t172733 =
                      ((x10.io.Printer)(x10.io.Console.ERR));
                    
//#line 248 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
e.printStackTrace(((x10.io.Printer)(t172733)));
                }
            }
        
        
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final public KMeansCUDA
                                                                                                             KMeansCUDA$$KMeansCUDA$this(
                                                                                                             ){
            
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
return KMeansCUDA.this;
        }
        
        
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
// creation method for java code
        public static KMeansCUDA $make(){return new KMeansCUDA((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public KMeansCUDA KMeansCUDA$$init$S() { {
                                                              
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"

                                                              
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"

                                                          }
                                                          return this;
                                                          }
        
        // constructor
        public KMeansCUDA $init(){return KMeansCUDA$$init$S();}
        
        
        public static class $Closure$115 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$115.class);
            
            public static final x10.rtt.RuntimeType<$Closure$115> $RTT = new x10.rtt.StaticFunType<$Closure$115>(
            /* base class */$Closure$115.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$115 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$115.class + " calling"); } 
                x10.io.FileReader fr = (x10.io.FileReader) $deserializer.readRef();
                $_obj.fr = fr;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$115 $_obj = new $Closure$115((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (fr instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.fr);
                } else {
                $serializer.write(this.fr);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$115(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
            }
            
                
                public float
                  $apply$O(
                  final int id$148361){
                    
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Marshal.IntMarshal t172029 =
                      ((x10.io.Marshal.IntMarshal)(x10.io.Marshal.Shadow.getInitialized$INT()));
                    
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172030 =
                      t172029.read$O(((x10.io.Reader)(this.
                                                        fr)));
                    
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172031 =
                      java.lang.Integer.reverseBytes(t172030);
                    
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172032 =
                      java.lang.Float.intBitsToFloat(((int)(t172031)));
                    
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
return t172032;
                }
                
                public x10.io.FileReader fr;
                
                // creation method for java code
                public static KMeansCUDA.$Closure$115 $make(final x10.io.FileReader fr){return new $Closure$115(fr);}
                public $Closure$115(final x10.io.FileReader fr) { {
                                                                         this.fr = ((x10.io.FileReader)(fr));
                                                                     }}
                
            }
            
        public static class $Closure$116 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$116.class);
            
            public static final x10.rtt.RuntimeType<$Closure$116> $RTT = new x10.rtt.StaticFunType<$Closure$116>(
            /* base class */$Closure$116.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.lang.Place.$RTT), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$116 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$116.class + " calling"); } 
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$116 $_obj = new $Closure$116((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                
            }
            
            // constructor just for allocation
            public $Closure$116(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Int.$unbox(a1));
            }
            
                
                public x10.lang.Place
                  $apply(
                  final int i){
                    
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172050 =
                      x10.lang.Place.getInitialized$MAX_PLACES();
                    
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172051 =
                      ((t172050) + (((int)(i))));
                    
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.lang.Place t172052 =
                      ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null).$init(t172051)));
                    
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.lang.Place t172053 =
                      ((x10.lang.Place)(t172052.parent()));
                    
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
return t172053;
                }
                
                // creation method for java code
                public static KMeansCUDA.$Closure$116 $make(){return new $Closure$116();}
                public $Closure$116() { {
                                               
                                           }}
                
            }
            
        public static class $Closure$117 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$117.class);
            
            public static final x10.rtt.RuntimeType<$Closure$117> $RTT = new x10.rtt.StaticFunType<$Closure$117>(
            /* base class */$Closure$117.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$117 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$117.class + " calling"); } 
                $_obj.num_local_points_stride173519 = $deserializer.readInt();
                $_obj.num_local_points173517 = $deserializer.readInt();
                $_obj.offset173518 = $deserializer.readInt();
                $_obj.num_file_points = $deserializer.readInt();
                $_obj.dim = $deserializer.readInt();
                x10.array.Array file_points = (x10.array.Array) $deserializer.readRef();
                $_obj.file_points = file_points;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$117 $_obj = new $Closure$117((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                $serializer.write(this.num_local_points_stride173519);
                $serializer.write(this.num_local_points173517);
                $serializer.write(this.offset173518);
                $serializer.write(this.num_file_points);
                $serializer.write(this.dim);
                if (file_points instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.file_points);
                } else {
                $serializer.write(this.file_points);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$117(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
            }
            
                
                public float
                  $apply$O(
                  final int i173521){
                    
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d173522 =
                      ((i173521) / (((int)(this.
                                             num_local_points_stride173519))));
                    
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int p173523 =
                      ((i173521) % (((int)(this.
                                             num_local_points_stride173519))));
                    
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173524 =
                      ((p173523) < (((int)(this.
                                             num_local_points173517))));
                    
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float t173525 =
                       0;
                    
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173524) {
                        
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173526 =
                          ((p173523) + (((int)(this.
                                                 offset173518))));
                        
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173527 =
                          ((t173526) % (((int)(this.
                                                 num_file_points))));
                        
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173528 =
                          ((t173527) * (((int)(this.
                                                 dim))));
                        
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173529 =
                          ((t173528) + (((int)(d173522))));
                        
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t173525 = x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                                                                                                                                file_points).$apply$G((int)(t173529)));
                    } else {
                        
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t173525 = 0.0F;
                    }
                    
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173530 =
                      t173525;
                    
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
return t173530;
                }
                
                public int num_local_points_stride173519;
                public int num_local_points173517;
                public int offset173518;
                public int num_file_points;
                public int dim;
                public x10.array.Array<x10.core.Float> file_points;
                
                // creation method for java code
                public static KMeansCUDA.$Closure$117 $make(final int num_local_points_stride173519,
                                                            final int num_local_points173517,
                                                            final int offset173518,
                                                            final int num_file_points,
                                                            final int dim,
                                                            final x10.array.Array<x10.core.Float> file_points,java.lang.Class<?> $dummy0){return new $Closure$117(num_local_points_stride173519,num_local_points173517,offset173518,num_file_points,dim,file_points,(java.lang.Class<?>) null);}
                public $Closure$117(final int num_local_points_stride173519,
                                    final int num_local_points173517,
                                    final int offset173518,
                                    final int num_file_points,
                                    final int dim,
                                    final x10.array.Array<x10.core.Float> file_points,java.lang.Class<?> $dummy0) { {
                                                                                                                           this.num_local_points_stride173519 = num_local_points_stride173519;
                                                                                                                           this.num_local_points173517 = num_local_points173517;
                                                                                                                           this.offset173518 = offset173518;
                                                                                                                           this.num_file_points = num_file_points;
                                                                                                                           this.dim = dim;
                                                                                                                           this.file_points = ((x10.array.Array)(file_points));
                                                                                                                       }}
                
            }
            
        public static class $Closure$118 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$118.class);
            
            public static final x10.rtt.RuntimeType<$Closure$118> $RTT = new x10.rtt.StaticFunType<$Closure$118>(
            /* base class */$Closure$118.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$118 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$118.class + " calling"); } 
                x10.array.Array file_points = (x10.array.Array) $deserializer.readRef();
                $_obj.file_points = file_points;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$118 $_obj = new $Closure$118((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (file_points instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.file_points);
                } else {
                $serializer.write(this.file_points);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$118(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
            }
            
                
                public float
                  $apply$O(
                  final int i173539){
                    
//#line 126 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173540 =
                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                file_points).$apply$G((int)(i173539)));
                    
//#line 126 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
return t173540;
                }
                
                public x10.array.Array<x10.core.Float> file_points;
                
                // creation method for java code
                public static KMeansCUDA.$Closure$118 $make(final x10.array.Array<x10.core.Float> file_points,java.lang.Class<?> $dummy0){return new $Closure$118(file_points,(java.lang.Class<?>) null);}
                public $Closure$118(final x10.array.Array<x10.core.Float> file_points,java.lang.Class<?> $dummy0) { {
                                                                                                                           this.file_points = ((x10.array.Array)(file_points));
                                                                                                                       }}
                
            }
            
        public static class $Closure$119 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$119.class);
            
            public static final x10.rtt.RuntimeType<$Closure$119> $RTT = new x10.rtt.StaticVoidFunType<$Closure$119>(
            /* base class */$Closure$119.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$119 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$119.class + " calling"); } 
                $_obj.block173393 = $deserializer.readInt();
                $_obj.threads173462 = $deserializer.readInt();
                $_obj.thread173384 = $deserializer.readInt();
                $_obj.blocks173461 = $deserializer.readInt();
                $_obj.num_local_points173517 = $deserializer.readInt();
                $_obj.num_clusters = $deserializer.readInt();
                $_obj.dim = $deserializer.readInt();
                $_obj.num_local_points_stride173519 = $deserializer.readInt();
                x10.array.RemoteArray gpu_points173534 = (x10.array.RemoteArray) $deserializer.readRef();
                $_obj.gpu_points173534 = gpu_points173534;
                x10.array.Array clustercache173390 = (x10.array.Array) $deserializer.readRef();
                $_obj.clustercache173390 = clustercache173390;
                x10.array.RemoteArray gpu_nearest173536 = (x10.array.RemoteArray) $deserializer.readRef();
                $_obj.gpu_nearest173536 = gpu_nearest173536;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$119 $_obj = new $Closure$119((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                $serializer.write(this.block173393);
                $serializer.write(this.threads173462);
                $serializer.write(this.thread173384);
                $serializer.write(this.blocks173461);
                $serializer.write(this.num_local_points173517);
                $serializer.write(this.num_clusters);
                $serializer.write(this.dim);
                $serializer.write(this.num_local_points_stride173519);
                if (gpu_points173534 instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.gpu_points173534);
                } else {
                $serializer.write(this.gpu_points173534);
                }
                if (clustercache173390 instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.clustercache173390);
                } else {
                $serializer.write(this.clustercache173390);
                }
                if (gpu_nearest173536 instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.gpu_nearest173536);
                } else {
                $serializer.write(this.gpu_nearest173536);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$119(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173381 =
                      ((this.
                          block173393) * (((int)(this.
                                                   threads173462))));
                    
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int tid173382 =
                      ((t173381) + (((int)(this.
                                             thread173384))));
                    
//#line 151 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int tids173383 =
                      ((this.
                          blocks173461) * (((int)(this.
                                                    threads173462))));
                    
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int p173378 =
                      tid173382;
                    
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                             true;
                                                                                                                             ) {
                        
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173379 =
                          p173378;
                        
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173380 =
                          ((t173379) < (((int)(this.
                                                 num_local_points173517))));
                        
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173380)) {
                            
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                        }
                        
//#line 153 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int closest173372 =
                          -1;
                        
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float closest_dist173373 =
                          java.lang.Float.MAX_VALUE;
                        final int min173365 =
                          0;
                        final int max173366 =
                          ((this.
                              num_clusters) - (((int)(1))));
                        final int t173367 =
                          ((max173366) - (((int)(min173365))));
                        final int t173368 =
                          ((t173367) + (((int)(1))));
                        final int t173369 =
                          ((t173368) / (((int)(20))));
                        final int t173370 =
                          ((t173369) * (((int)(20))));
                        final int loopMax173371 =
                          ((t173370) + (((int)(min173365))));
                        int k173359 =
                          min173365;
                        for (;
                             true;
                             ) {
                            final int t173360 =
                              k173359;
                            final boolean t173361 =
                              ((t173360) < (((int)(loopMax173371))));
                            if (!(t173361)) {
                                break;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173189 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171598min172788 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171598max172789 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i172785 =
                              i171598min172788;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172786 =
                                  i172785;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172787 =
                                  ((t172786) <= (((int)(i171598max172789))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t172787)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d172782 =
                                  i172785;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172769 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172770 =
                                  ((d172782) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172771 =
                                  ((t172769) + (((int)(t172770))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172772 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t172771)));
                                final int t172773 =
                                  k173359;
                                final int t172774 =
                                  ((t172773) + (((int)(0))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172775 =
                                  ((t172774) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172776 =
                                  ((t172775) + (((int)(d172782))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172777 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t172776)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp172778 =
                                  ((t172772) - (((float)(t172777))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172779 =
                                  dist173189;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172780 =
                                  ((tmp172778) * (((float)(tmp172778))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172781 =
                                  ((t172779) + (((float)(t172780))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173189 = t172781;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172783 =
                                  i172785;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172784 =
                                  ((t172783) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i172785 = t172784;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173190 =
                              dist173189;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173191 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173192 =
                              ((t173190) < (((float)(t173191))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173192) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173193 =
                                  dist173189;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173193;
                                final int t173194 =
                                  k173359;
                                final int t173195 =
                                  ((t173194) + (((int)(0))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173195;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173196 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171614min172809 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171614max172810 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i172806 =
                              i171614min172809;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172807 =
                                  i172806;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172808 =
                                  ((t172807) <= (((int)(i171614max172810))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t172808)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d172803 =
                                  i172806;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172790 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172791 =
                                  ((d172803) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172792 =
                                  ((t172790) + (((int)(t172791))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172793 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t172792)));
                                final int t172794 =
                                  k173359;
                                final int t172795 =
                                  ((t172794) + (((int)(1))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172796 =
                                  ((t172795) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172797 =
                                  ((t172796) + (((int)(d172803))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172798 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t172797)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp172799 =
                                  ((t172793) - (((float)(t172798))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172800 =
                                  dist173196;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172801 =
                                  ((tmp172799) * (((float)(tmp172799))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172802 =
                                  ((t172800) + (((float)(t172801))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173196 = t172802;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172804 =
                                  i172806;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172805 =
                                  ((t172804) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i172806 = t172805;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173197 =
                              dist173196;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173198 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173199 =
                              ((t173197) < (((float)(t173198))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173199) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173200 =
                                  dist173196;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173200;
                                final int t173201 =
                                  k173359;
                                final int t173202 =
                                  ((t173201) + (((int)(1))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173202;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173203 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171630min172830 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171630max172831 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i172827 =
                              i171630min172830;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172828 =
                                  i172827;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172829 =
                                  ((t172828) <= (((int)(i171630max172831))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t172829)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d172824 =
                                  i172827;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172811 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172812 =
                                  ((d172824) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172813 =
                                  ((t172811) + (((int)(t172812))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172814 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t172813)));
                                final int t172815 =
                                  k173359;
                                final int t172816 =
                                  ((t172815) + (((int)(2))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172817 =
                                  ((t172816) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172818 =
                                  ((t172817) + (((int)(d172824))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172819 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t172818)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp172820 =
                                  ((t172814) - (((float)(t172819))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172821 =
                                  dist173203;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172822 =
                                  ((tmp172820) * (((float)(tmp172820))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172823 =
                                  ((t172821) + (((float)(t172822))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173203 = t172823;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172825 =
                                  i172827;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172826 =
                                  ((t172825) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i172827 = t172826;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173204 =
                              dist173203;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173205 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173206 =
                              ((t173204) < (((float)(t173205))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173206) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173207 =
                                  dist173203;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173207;
                                final int t173208 =
                                  k173359;
                                final int t173209 =
                                  ((t173208) + (((int)(2))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173209;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173210 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171646min172851 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171646max172852 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i172848 =
                              i171646min172851;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172849 =
                                  i172848;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172850 =
                                  ((t172849) <= (((int)(i171646max172852))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t172850)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d172845 =
                                  i172848;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172832 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172833 =
                                  ((d172845) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172834 =
                                  ((t172832) + (((int)(t172833))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172835 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t172834)));
                                final int t172836 =
                                  k173359;
                                final int t172837 =
                                  ((t172836) + (((int)(3))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172838 =
                                  ((t172837) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172839 =
                                  ((t172838) + (((int)(d172845))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172840 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t172839)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp172841 =
                                  ((t172835) - (((float)(t172840))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172842 =
                                  dist173210;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172843 =
                                  ((tmp172841) * (((float)(tmp172841))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172844 =
                                  ((t172842) + (((float)(t172843))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173210 = t172844;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172846 =
                                  i172848;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172847 =
                                  ((t172846) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i172848 = t172847;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173211 =
                              dist173210;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173212 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173213 =
                              ((t173211) < (((float)(t173212))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173213) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173214 =
                                  dist173210;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173214;
                                final int t173215 =
                                  k173359;
                                final int t173216 =
                                  ((t173215) + (((int)(3))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173216;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173217 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171662min172872 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171662max172873 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i172869 =
                              i171662min172872;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172870 =
                                  i172869;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172871 =
                                  ((t172870) <= (((int)(i171662max172873))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t172871)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d172866 =
                                  i172869;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172853 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172854 =
                                  ((d172866) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172855 =
                                  ((t172853) + (((int)(t172854))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172856 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t172855)));
                                final int t172857 =
                                  k173359;
                                final int t172858 =
                                  ((t172857) + (((int)(4))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172859 =
                                  ((t172858) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172860 =
                                  ((t172859) + (((int)(d172866))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172861 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t172860)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp172862 =
                                  ((t172856) - (((float)(t172861))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172863 =
                                  dist173217;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172864 =
                                  ((tmp172862) * (((float)(tmp172862))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172865 =
                                  ((t172863) + (((float)(t172864))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173217 = t172865;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172867 =
                                  i172869;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172868 =
                                  ((t172867) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i172869 = t172868;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173218 =
                              dist173217;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173219 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173220 =
                              ((t173218) < (((float)(t173219))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173220) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173221 =
                                  dist173217;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173221;
                                final int t173222 =
                                  k173359;
                                final int t173223 =
                                  ((t173222) + (((int)(4))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173223;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173224 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171678min172893 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171678max172894 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i172890 =
                              i171678min172893;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172891 =
                                  i172890;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172892 =
                                  ((t172891) <= (((int)(i171678max172894))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t172892)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d172887 =
                                  i172890;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172874 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172875 =
                                  ((d172887) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172876 =
                                  ((t172874) + (((int)(t172875))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172877 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t172876)));
                                final int t172878 =
                                  k173359;
                                final int t172879 =
                                  ((t172878) + (((int)(5))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172880 =
                                  ((t172879) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172881 =
                                  ((t172880) + (((int)(d172887))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172882 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t172881)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp172883 =
                                  ((t172877) - (((float)(t172882))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172884 =
                                  dist173224;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172885 =
                                  ((tmp172883) * (((float)(tmp172883))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172886 =
                                  ((t172884) + (((float)(t172885))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173224 = t172886;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172888 =
                                  i172890;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172889 =
                                  ((t172888) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i172890 = t172889;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173225 =
                              dist173224;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173226 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173227 =
                              ((t173225) < (((float)(t173226))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173227) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173228 =
                                  dist173224;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173228;
                                final int t173229 =
                                  k173359;
                                final int t173230 =
                                  ((t173229) + (((int)(5))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173230;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173231 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171694min172914 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171694max172915 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i172911 =
                              i171694min172914;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172912 =
                                  i172911;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172913 =
                                  ((t172912) <= (((int)(i171694max172915))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t172913)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d172908 =
                                  i172911;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172895 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172896 =
                                  ((d172908) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172897 =
                                  ((t172895) + (((int)(t172896))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172898 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t172897)));
                                final int t172899 =
                                  k173359;
                                final int t172900 =
                                  ((t172899) + (((int)(6))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172901 =
                                  ((t172900) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172902 =
                                  ((t172901) + (((int)(d172908))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172903 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t172902)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp172904 =
                                  ((t172898) - (((float)(t172903))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172905 =
                                  dist173231;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172906 =
                                  ((tmp172904) * (((float)(tmp172904))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172907 =
                                  ((t172905) + (((float)(t172906))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173231 = t172907;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172909 =
                                  i172911;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172910 =
                                  ((t172909) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i172911 = t172910;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173232 =
                              dist173231;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173233 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173234 =
                              ((t173232) < (((float)(t173233))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173234) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173235 =
                                  dist173231;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173235;
                                final int t173236 =
                                  k173359;
                                final int t173237 =
                                  ((t173236) + (((int)(6))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173237;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173238 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171710min172935 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171710max172936 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i172932 =
                              i171710min172935;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172933 =
                                  i172932;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172934 =
                                  ((t172933) <= (((int)(i171710max172936))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t172934)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d172929 =
                                  i172932;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172916 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172917 =
                                  ((d172929) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172918 =
                                  ((t172916) + (((int)(t172917))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172919 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t172918)));
                                final int t172920 =
                                  k173359;
                                final int t172921 =
                                  ((t172920) + (((int)(7))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172922 =
                                  ((t172921) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172923 =
                                  ((t172922) + (((int)(d172929))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172924 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t172923)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp172925 =
                                  ((t172919) - (((float)(t172924))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172926 =
                                  dist173238;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172927 =
                                  ((tmp172925) * (((float)(tmp172925))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172928 =
                                  ((t172926) + (((float)(t172927))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173238 = t172928;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172930 =
                                  i172932;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172931 =
                                  ((t172930) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i172932 = t172931;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173239 =
                              dist173238;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173240 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173241 =
                              ((t173239) < (((float)(t173240))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173241) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173242 =
                                  dist173238;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173242;
                                final int t173243 =
                                  k173359;
                                final int t173244 =
                                  ((t173243) + (((int)(7))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173244;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173245 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171726min172956 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171726max172957 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i172953 =
                              i171726min172956;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172954 =
                                  i172953;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172955 =
                                  ((t172954) <= (((int)(i171726max172957))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t172955)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d172950 =
                                  i172953;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172937 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172938 =
                                  ((d172950) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172939 =
                                  ((t172937) + (((int)(t172938))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172940 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t172939)));
                                final int t172941 =
                                  k173359;
                                final int t172942 =
                                  ((t172941) + (((int)(8))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172943 =
                                  ((t172942) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172944 =
                                  ((t172943) + (((int)(d172950))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172945 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t172944)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp172946 =
                                  ((t172940) - (((float)(t172945))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172947 =
                                  dist173245;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172948 =
                                  ((tmp172946) * (((float)(tmp172946))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172949 =
                                  ((t172947) + (((float)(t172948))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173245 = t172949;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172951 =
                                  i172953;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172952 =
                                  ((t172951) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i172953 = t172952;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173246 =
                              dist173245;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173247 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173248 =
                              ((t173246) < (((float)(t173247))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173248) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173249 =
                                  dist173245;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173249;
                                final int t173250 =
                                  k173359;
                                final int t173251 =
                                  ((t173250) + (((int)(8))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173251;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173252 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171742min172977 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171742max172978 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i172974 =
                              i171742min172977;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172975 =
                                  i172974;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172976 =
                                  ((t172975) <= (((int)(i171742max172978))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t172976)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d172971 =
                                  i172974;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172958 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172959 =
                                  ((d172971) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172960 =
                                  ((t172958) + (((int)(t172959))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172961 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t172960)));
                                final int t172962 =
                                  k173359;
                                final int t172963 =
                                  ((t172962) + (((int)(9))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172964 =
                                  ((t172963) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172965 =
                                  ((t172964) + (((int)(d172971))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172966 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t172965)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp172967 =
                                  ((t172961) - (((float)(t172966))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172968 =
                                  dist173252;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172969 =
                                  ((tmp172967) * (((float)(tmp172967))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172970 =
                                  ((t172968) + (((float)(t172969))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173252 = t172970;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172972 =
                                  i172974;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172973 =
                                  ((t172972) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i172974 = t172973;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173253 =
                              dist173252;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173254 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173255 =
                              ((t173253) < (((float)(t173254))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173255) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173256 =
                                  dist173252;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173256;
                                final int t173257 =
                                  k173359;
                                final int t173258 =
                                  ((t173257) + (((int)(9))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173258;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173259 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171758min172998 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171758max172999 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i172995 =
                              i171758min172998;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172996 =
                                  i172995;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172997 =
                                  ((t172996) <= (((int)(i171758max172999))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t172997)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d172992 =
                                  i172995;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172979 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172980 =
                                  ((d172992) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172981 =
                                  ((t172979) + (((int)(t172980))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172982 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t172981)));
                                final int t172983 =
                                  k173359;
                                final int t172984 =
                                  ((t172983) + (((int)(10))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172985 =
                                  ((t172984) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172986 =
                                  ((t172985) + (((int)(d172992))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172987 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t172986)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp172988 =
                                  ((t172982) - (((float)(t172987))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172989 =
                                  dist173259;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172990 =
                                  ((tmp172988) * (((float)(tmp172988))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t172991 =
                                  ((t172989) + (((float)(t172990))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173259 = t172991;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172993 =
                                  i172995;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172994 =
                                  ((t172993) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i172995 = t172994;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173260 =
                              dist173259;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173261 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173262 =
                              ((t173260) < (((float)(t173261))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173262) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173263 =
                                  dist173259;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173263;
                                final int t173264 =
                                  k173359;
                                final int t173265 =
                                  ((t173264) + (((int)(10))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173265;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173266 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171774min173019 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171774max173020 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i173016 =
                              i171774min173019;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173017 =
                                  i173016;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173018 =
                                  ((t173017) <= (((int)(i171774max173020))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173018)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d173013 =
                                  i173016;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173000 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173001 =
                                  ((d173013) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173002 =
                                  ((t173000) + (((int)(t173001))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173003 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t173002)));
                                final int t173004 =
                                  k173359;
                                final int t173005 =
                                  ((t173004) + (((int)(11))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173006 =
                                  ((t173005) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173007 =
                                  ((t173006) + (((int)(d173013))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173008 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t173007)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp173009 =
                                  ((t173003) - (((float)(t173008))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173010 =
                                  dist173266;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173011 =
                                  ((tmp173009) * (((float)(tmp173009))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173012 =
                                  ((t173010) + (((float)(t173011))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173266 = t173012;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173014 =
                                  i173016;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173015 =
                                  ((t173014) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i173016 = t173015;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173267 =
                              dist173266;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173268 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173269 =
                              ((t173267) < (((float)(t173268))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173269) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173270 =
                                  dist173266;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173270;
                                final int t173271 =
                                  k173359;
                                final int t173272 =
                                  ((t173271) + (((int)(11))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173272;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173273 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171790min173040 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171790max173041 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i173037 =
                              i171790min173040;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173038 =
                                  i173037;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173039 =
                                  ((t173038) <= (((int)(i171790max173041))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173039)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d173034 =
                                  i173037;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173021 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173022 =
                                  ((d173034) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173023 =
                                  ((t173021) + (((int)(t173022))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173024 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t173023)));
                                final int t173025 =
                                  k173359;
                                final int t173026 =
                                  ((t173025) + (((int)(12))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173027 =
                                  ((t173026) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173028 =
                                  ((t173027) + (((int)(d173034))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173029 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t173028)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp173030 =
                                  ((t173024) - (((float)(t173029))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173031 =
                                  dist173273;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173032 =
                                  ((tmp173030) * (((float)(tmp173030))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173033 =
                                  ((t173031) + (((float)(t173032))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173273 = t173033;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173035 =
                                  i173037;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173036 =
                                  ((t173035) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i173037 = t173036;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173274 =
                              dist173273;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173275 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173276 =
                              ((t173274) < (((float)(t173275))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173276) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173277 =
                                  dist173273;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173277;
                                final int t173278 =
                                  k173359;
                                final int t173279 =
                                  ((t173278) + (((int)(12))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173279;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173280 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171806min173061 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171806max173062 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i173058 =
                              i171806min173061;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173059 =
                                  i173058;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173060 =
                                  ((t173059) <= (((int)(i171806max173062))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173060)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d173055 =
                                  i173058;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173042 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173043 =
                                  ((d173055) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173044 =
                                  ((t173042) + (((int)(t173043))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173045 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t173044)));
                                final int t173046 =
                                  k173359;
                                final int t173047 =
                                  ((t173046) + (((int)(13))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173048 =
                                  ((t173047) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173049 =
                                  ((t173048) + (((int)(d173055))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173050 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t173049)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp173051 =
                                  ((t173045) - (((float)(t173050))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173052 =
                                  dist173280;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173053 =
                                  ((tmp173051) * (((float)(tmp173051))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173054 =
                                  ((t173052) + (((float)(t173053))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173280 = t173054;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173056 =
                                  i173058;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173057 =
                                  ((t173056) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i173058 = t173057;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173281 =
                              dist173280;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173282 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173283 =
                              ((t173281) < (((float)(t173282))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173283) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173284 =
                                  dist173280;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173284;
                                final int t173285 =
                                  k173359;
                                final int t173286 =
                                  ((t173285) + (((int)(13))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173286;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173287 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171822min173082 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171822max173083 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i173079 =
                              i171822min173082;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173080 =
                                  i173079;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173081 =
                                  ((t173080) <= (((int)(i171822max173083))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173081)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d173076 =
                                  i173079;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173063 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173064 =
                                  ((d173076) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173065 =
                                  ((t173063) + (((int)(t173064))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173066 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t173065)));
                                final int t173067 =
                                  k173359;
                                final int t173068 =
                                  ((t173067) + (((int)(14))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173069 =
                                  ((t173068) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173070 =
                                  ((t173069) + (((int)(d173076))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173071 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t173070)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp173072 =
                                  ((t173066) - (((float)(t173071))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173073 =
                                  dist173287;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173074 =
                                  ((tmp173072) * (((float)(tmp173072))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173075 =
                                  ((t173073) + (((float)(t173074))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173287 = t173075;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173077 =
                                  i173079;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173078 =
                                  ((t173077) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i173079 = t173078;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173288 =
                              dist173287;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173289 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173290 =
                              ((t173288) < (((float)(t173289))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173290) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173291 =
                                  dist173287;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173291;
                                final int t173292 =
                                  k173359;
                                final int t173293 =
                                  ((t173292) + (((int)(14))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173293;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173294 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171838min173103 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171838max173104 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i173100 =
                              i171838min173103;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173101 =
                                  i173100;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173102 =
                                  ((t173101) <= (((int)(i171838max173104))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173102)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d173097 =
                                  i173100;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173084 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173085 =
                                  ((d173097) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173086 =
                                  ((t173084) + (((int)(t173085))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173087 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t173086)));
                                final int t173088 =
                                  k173359;
                                final int t173089 =
                                  ((t173088) + (((int)(15))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173090 =
                                  ((t173089) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173091 =
                                  ((t173090) + (((int)(d173097))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173092 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t173091)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp173093 =
                                  ((t173087) - (((float)(t173092))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173094 =
                                  dist173294;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173095 =
                                  ((tmp173093) * (((float)(tmp173093))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173096 =
                                  ((t173094) + (((float)(t173095))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173294 = t173096;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173098 =
                                  i173100;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173099 =
                                  ((t173098) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i173100 = t173099;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173295 =
                              dist173294;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173296 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173297 =
                              ((t173295) < (((float)(t173296))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173297) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173298 =
                                  dist173294;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173298;
                                final int t173299 =
                                  k173359;
                                final int t173300 =
                                  ((t173299) + (((int)(15))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173300;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173301 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171854min173124 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171854max173125 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i173121 =
                              i171854min173124;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173122 =
                                  i173121;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173123 =
                                  ((t173122) <= (((int)(i171854max173125))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173123)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d173118 =
                                  i173121;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173105 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173106 =
                                  ((d173118) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173107 =
                                  ((t173105) + (((int)(t173106))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173108 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t173107)));
                                final int t173109 =
                                  k173359;
                                final int t173110 =
                                  ((t173109) + (((int)(16))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173111 =
                                  ((t173110) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173112 =
                                  ((t173111) + (((int)(d173118))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173113 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t173112)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp173114 =
                                  ((t173108) - (((float)(t173113))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173115 =
                                  dist173301;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173116 =
                                  ((tmp173114) * (((float)(tmp173114))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173117 =
                                  ((t173115) + (((float)(t173116))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173301 = t173117;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173119 =
                                  i173121;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173120 =
                                  ((t173119) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i173121 = t173120;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173302 =
                              dist173301;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173303 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173304 =
                              ((t173302) < (((float)(t173303))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173304) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173305 =
                                  dist173301;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173305;
                                final int t173306 =
                                  k173359;
                                final int t173307 =
                                  ((t173306) + (((int)(16))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173307;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173308 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171870min173145 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171870max173146 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i173142 =
                              i171870min173145;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173143 =
                                  i173142;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173144 =
                                  ((t173143) <= (((int)(i171870max173146))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173144)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d173139 =
                                  i173142;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173126 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173127 =
                                  ((d173139) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173128 =
                                  ((t173126) + (((int)(t173127))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173129 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t173128)));
                                final int t173130 =
                                  k173359;
                                final int t173131 =
                                  ((t173130) + (((int)(17))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173132 =
                                  ((t173131) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173133 =
                                  ((t173132) + (((int)(d173139))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173134 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t173133)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp173135 =
                                  ((t173129) - (((float)(t173134))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173136 =
                                  dist173308;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173137 =
                                  ((tmp173135) * (((float)(tmp173135))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173138 =
                                  ((t173136) + (((float)(t173137))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173308 = t173138;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173140 =
                                  i173142;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173141 =
                                  ((t173140) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i173142 = t173141;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173309 =
                              dist173308;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173310 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173311 =
                              ((t173309) < (((float)(t173310))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173311) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173312 =
                                  dist173308;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173312;
                                final int t173313 =
                                  k173359;
                                final int t173314 =
                                  ((t173313) + (((int)(17))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173314;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173315 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171886min173166 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171886max173167 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i173163 =
                              i171886min173166;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173164 =
                                  i173163;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173165 =
                                  ((t173164) <= (((int)(i171886max173167))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173165)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d173160 =
                                  i173163;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173147 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173148 =
                                  ((d173160) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173149 =
                                  ((t173147) + (((int)(t173148))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173150 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t173149)));
                                final int t173151 =
                                  k173359;
                                final int t173152 =
                                  ((t173151) + (((int)(18))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173153 =
                                  ((t173152) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173154 =
                                  ((t173153) + (((int)(d173160))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173155 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t173154)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp173156 =
                                  ((t173150) - (((float)(t173155))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173157 =
                                  dist173315;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173158 =
                                  ((tmp173156) * (((float)(tmp173156))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173159 =
                                  ((t173157) + (((float)(t173158))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173315 = t173159;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173161 =
                                  i173163;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173162 =
                                  ((t173161) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i173163 = t173162;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173316 =
                              dist173315;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173317 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173318 =
                              ((t173316) < (((float)(t173317))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173318) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173319 =
                                  dist173315;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173319;
                                final int t173320 =
                                  k173359;
                                final int t173321 =
                                  ((t173320) + (((int)(18))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173321;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173322 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171902min173187 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171902max173188 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i173184 =
                              i171902min173187;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173185 =
                                  i173184;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173186 =
                                  ((t173185) <= (((int)(i171902max173188))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173186)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d173181 =
                                  i173184;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173168 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173169 =
                                  ((d173181) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173170 =
                                  ((t173168) + (((int)(t173169))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173171 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t173170)));
                                final int t173172 =
                                  k173359;
                                final int t173173 =
                                  ((t173172) + (((int)(19))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173174 =
                                  ((t173173) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173175 =
                                  ((t173174) + (((int)(d173181))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173176 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t173175)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp173177 =
                                  ((t173171) - (((float)(t173176))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173178 =
                                  dist173322;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173179 =
                                  ((tmp173177) * (((float)(tmp173177))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173180 =
                                  ((t173178) + (((float)(t173179))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173322 = t173180;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173182 =
                                  i173184;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173183 =
                                  ((t173182) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i173184 = t173183;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173323 =
                              dist173322;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173324 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173325 =
                              ((t173323) < (((float)(t173324))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173325) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173326 =
                                  dist173322;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173326;
                                final int t173327 =
                                  k173359;
                                final int t173328 =
                                  ((t173327) + (((int)(19))));
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173328;
                            }
                            final int t173329 =
                              k173359;
                            final int t173330 =
                              ((t173329) + (((int)(20))));
                            k173359 = t173330;
                        }
                        int k173362 =
                          loopMax173371;
                        for (;
                             true;
                             ) {
                            final int t173363 =
                              k173362;
                            final boolean t173364 =
                              ((t173363) <= (((int)(max173366))));
                            if (!(t173364)) {
                                break;
                            }
                            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float dist173351 =
                              ((float)(int)(((int)(0))));
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171918min173349 =
                              0;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171918max173350 =
                              3;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i173346 =
                              i171918min173349;
                            
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173347 =
                                  i173346;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173348 =
                                  ((t173347) <= (((int)(i171918max173350))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173348)) {
                                    
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                }
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int d173343 =
                                  i173346;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173331 =
                                  p173378;
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173332 =
                                  ((d173343) * (((int)(this.
                                                         num_local_points_stride173519))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173333 =
                                  ((t173331) + (((int)(t173332))));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173334 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  gpu_points173534).$apply$G((int)(t173333)));
                                final int t173335 =
                                  k173362;
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173336 =
                                  ((t173335) * (((int)(this.
                                                         dim))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173337 =
                                  ((t173336) + (((int)(d173343))));
                                
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173338 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                            clustercache173390).$apply$G((int)(t173337)));
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float tmp173339 =
                                  ((t173334) - (((float)(t173338))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173340 =
                                  dist173351;
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173341 =
                                  ((tmp173339) * (((float)(tmp173339))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173342 =
                                  ((t173340) + (((float)(t173341))));
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
dist173351 = t173342;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173344 =
                                  i173346;
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173345 =
                                  ((t173344) + (((int)(1))));
                                
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i173346 = t173345;
                            }
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173352 =
                              dist173351;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173353 =
                              closest_dist173373;
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173354 =
                              ((t173352) < (((float)(t173353))));
                            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173354) {
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173355 =
                                  dist173351;
                                
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest_dist173373 = t173355;
                                final int t173356 =
                                  k173362;
                                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
closest173372 = t173356;
                            }
                            final int t173357 =
                              k173362;
                            final int t173358 =
                              ((t173357) + (((int)(1))));
                            k173362 = t173358;
                        }
                        
//#line 169 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173374 =
                          p173378;
                        
//#line 169 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173375 =
                          closest173372;
                        
//#line 169 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
((x10.array.RemoteArray<x10.core.Int>)this.
                                                                                                                                                                    gpu_nearest173536).$set__1x10$array$RemoteArray$$T$G((int)(t173374),
                                                                                                                                                                                                                         x10.core.Int.$box(t173375));
                        
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173376 =
                          p173378;
                        
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173377 =
                          ((t173376) + (((int)(tids173383))));
                        
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
p173378 = t173377;
                    }
                }
                
                public int block173393;
                public int threads173462;
                public int thread173384;
                public int blocks173461;
                public int num_local_points173517;
                public int num_clusters;
                public int dim;
                public int num_local_points_stride173519;
                public x10.array.RemoteArray<x10.core.Float> gpu_points173534;
                public x10.array.Array<x10.core.Float> clustercache173390;
                public x10.array.RemoteArray<x10.core.Int> gpu_nearest173536;
                
                // creation method for java code
                public static KMeansCUDA.$Closure$119 $make(final int block173393,
                                                            final int threads173462,
                                                            final int thread173384,
                                                            final int blocks173461,
                                                            final int num_local_points173517,
                                                            final int num_clusters,
                                                            final int dim,
                                                            final int num_local_points_stride173519,
                                                            final x10.array.RemoteArray<x10.core.Float> gpu_points173534,
                                                            final x10.array.Array<x10.core.Float> clustercache173390,
                                                            final x10.array.RemoteArray<x10.core.Int> gpu_nearest173536,java.lang.Class<?> $dummy0){return new $Closure$119(block173393,threads173462,thread173384,blocks173461,num_local_points173517,num_clusters,dim,num_local_points_stride173519,gpu_points173534,clustercache173390,gpu_nearest173536,(java.lang.Class<?>) null);}
                public $Closure$119(final int block173393,
                                    final int threads173462,
                                    final int thread173384,
                                    final int blocks173461,
                                    final int num_local_points173517,
                                    final int num_clusters,
                                    final int dim,
                                    final int num_local_points_stride173519,
                                    final x10.array.RemoteArray<x10.core.Float> gpu_points173534,
                                    final x10.array.Array<x10.core.Float> clustercache173390,
                                    final x10.array.RemoteArray<x10.core.Int> gpu_nearest173536,java.lang.Class<?> $dummy0) { {
                                                                                                                                     this.block173393 = block173393;
                                                                                                                                     this.threads173462 = threads173462;
                                                                                                                                     this.thread173384 = thread173384;
                                                                                                                                     this.blocks173461 = blocks173461;
                                                                                                                                     this.num_local_points173517 = num_local_points173517;
                                                                                                                                     this.num_clusters = num_clusters;
                                                                                                                                     this.dim = dim;
                                                                                                                                     this.num_local_points_stride173519 = num_local_points_stride173519;
                                                                                                                                     this.gpu_points173534 = ((x10.array.RemoteArray)(gpu_points173534));
                                                                                                                                     this.clustercache173390 = ((x10.array.Array)(clustercache173390));
                                                                                                                                     this.gpu_nearest173536 = ((x10.array.RemoteArray)(gpu_nearest173536));
                                                                                                                                 }}
                
            }
            
        public static class $Closure$120 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$120.class);
            
            public static final x10.rtt.RuntimeType<$Closure$120> $RTT = new x10.rtt.StaticVoidFunType<$Closure$120>(
            /* base class */$Closure$120.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$120 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$120.class + " calling"); } 
                x10.array.Array clusters_copy173545 = (x10.array.Array) $deserializer.readRef();
                $_obj.clusters_copy173545 = clusters_copy173545;
                $_obj.threads173462 = $deserializer.readInt();
                $_obj.block173393 = $deserializer.readInt();
                $_obj.blocks173461 = $deserializer.readInt();
                $_obj.num_local_points173517 = $deserializer.readInt();
                $_obj.num_clusters = $deserializer.readInt();
                $_obj.dim = $deserializer.readInt();
                $_obj.num_local_points_stride173519 = $deserializer.readInt();
                x10.array.RemoteArray gpu_points173534 = (x10.array.RemoteArray) $deserializer.readRef();
                $_obj.gpu_points173534 = gpu_points173534;
                x10.array.RemoteArray gpu_nearest173536 = (x10.array.RemoteArray) $deserializer.readRef();
                $_obj.gpu_nearest173536 = gpu_nearest173536;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$120 $_obj = new $Closure$120((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (clusters_copy173545 instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.clusters_copy173545);
                } else {
                $serializer.write(this.clusters_copy173545);
                }
                $serializer.write(this.threads173462);
                $serializer.write(this.block173393);
                $serializer.write(this.blocks173461);
                $serializer.write(this.num_local_points173517);
                $serializer.write(this.num_clusters);
                $serializer.write(this.dim);
                $serializer.write(this.num_local_points_stride173519);
                if (gpu_points173534 instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.gpu_points173534);
                } else {
                $serializer.write(this.gpu_points173534);
                }
                if (gpu_nearest173536 instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.gpu_nearest173536);
                } else {
                $serializer.write(this.gpu_nearest173536);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$120(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.array.Array<x10.core.Float> clustercache173390 =
                      ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((x10.array.Array)(this.
                                                                                                                                                        clusters_copy173545)),(java.lang.Class<?>[][][][][][]) null)));
                    {
                        
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Clock x10$__var96 =
                          null;
                        {
                            
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.ensureNotInAtomic();
                            
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.lang.FinishState x10$__var97 =
                              x10.lang.Runtime.startFinish();
                            
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
try {try {{
                                {
                                    
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
try {{
                                        
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.lang.Clock x10$__var95 =
                                          x10.lang.Clock.make();
                                        
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10$__var96 = x10$__var95;
                                        
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171934min173391 =
                                          0;
                                        
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171934max173392 =
                                          ((this.
                                              threads173462) - (((int)(1))));
                                        
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i173387 =
                                          i171934min173391;
                                        
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                                 true;
                                                                                                                                                 ) {
                                            
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173388 =
                                              i173387;
                                            
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173389 =
                                              ((t173388) <= (((int)(i171934max173392))));
                                            
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173389)) {
                                                
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                            }
                                            
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int thread173384 =
                                              i173387;
                                            
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.runAsync__0$1x10$lang$Clock$2(((x10.array.Array)(x10.core.ArrayFactory.<x10.lang.Clock> makeArrayFromJavaArray(x10.lang.Clock.$RTT, new x10.lang.Clock[] {x10$__var95}))),
                                                                                                                                                                                               ((x10.core.fun.VoidFun_0_0)(new KMeansCUDA.$Closure$119(((int)(this.
                                                                                                                                                                                                                                                                block173393)),
                                                                                                                                                                                                                                                       ((int)(this.
                                                                                                                                                                                                                                                                threads173462)),
                                                                                                                                                                                                                                                       thread173384,
                                                                                                                                                                                                                                                       ((int)(this.
                                                                                                                                                                                                                                                                blocks173461)),
                                                                                                                                                                                                                                                       ((int)(this.
                                                                                                                                                                                                                                                                num_local_points173517)),
                                                                                                                                                                                                                                                       ((int)(this.
                                                                                                                                                                                                                                                                num_clusters)),
                                                                                                                                                                                                                                                       this.
                                                                                                                                                                                                                                                         dim,
                                                                                                                                                                                                                                                       ((int)(this.
                                                                                                                                                                                                                                                                num_local_points_stride173519)),
                                                                                                                                                                                                                                                       ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                                  gpu_points173534)),
                                                                                                                                                                                                                                                       clustercache173390,
                                                                                                                                                                                                                                                       ((x10.array.RemoteArray<x10.core.Int>)(this.
                                                                                                                                                                                                                                                                                                gpu_nearest173536)),(java.lang.Class<?>) null))));
                                            
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173385 =
                                              i173387;
                                            
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173386 =
                                              ((t173385) + (((int)(1))));
                                            
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i173387 = t173386;
                                        }
                                    }}finally {{
                                          
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (((x10$__var96) != (null))) {
                                              
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10$__var96.drop();
                                          }
                                      }}
                                    }
                                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__73__) {
                                    
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__73__)));
                                    
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
throw new x10.lang.RuntimeException();
                                }finally {{
                                     
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var97)));
                                 }}
                            }
                        }
                    }
                    
                    public x10.array.Array<x10.core.Float> clusters_copy173545;
                    public int threads173462;
                    public int block173393;
                    public int blocks173461;
                    public int num_local_points173517;
                    public int num_clusters;
                    public int dim;
                    public int num_local_points_stride173519;
                    public x10.array.RemoteArray<x10.core.Float> gpu_points173534;
                    public x10.array.RemoteArray<x10.core.Int> gpu_nearest173536;
                    
                    // creation method for java code
                    public static KMeansCUDA.$Closure$120 $make(final x10.array.Array<x10.core.Float> clusters_copy173545,
                                                                final int threads173462,
                                                                final int block173393,
                                                                final int blocks173461,
                                                                final int num_local_points173517,
                                                                final int num_clusters,
                                                                final int dim,
                                                                final int num_local_points_stride173519,
                                                                final x10.array.RemoteArray<x10.core.Float> gpu_points173534,
                                                                final x10.array.RemoteArray<x10.core.Int> gpu_nearest173536,java.lang.Class<?> $dummy0){return new $Closure$120(clusters_copy173545,threads173462,block173393,blocks173461,num_local_points173517,num_clusters,dim,num_local_points_stride173519,gpu_points173534,gpu_nearest173536,(java.lang.Class<?>) null);}
                    public $Closure$120(final x10.array.Array<x10.core.Float> clusters_copy173545,
                                        final int threads173462,
                                        final int block173393,
                                        final int blocks173461,
                                        final int num_local_points173517,
                                        final int num_clusters,
                                        final int dim,
                                        final int num_local_points_stride173519,
                                        final x10.array.RemoteArray<x10.core.Float> gpu_points173534,
                                        final x10.array.RemoteArray<x10.core.Int> gpu_nearest173536,java.lang.Class<?> $dummy0) { {
                                                                                                                                         this.clusters_copy173545 = ((x10.array.Array)(clusters_copy173545));
                                                                                                                                         this.threads173462 = threads173462;
                                                                                                                                         this.block173393 = block173393;
                                                                                                                                         this.blocks173461 = blocks173461;
                                                                                                                                         this.num_local_points173517 = num_local_points173517;
                                                                                                                                         this.num_clusters = num_clusters;
                                                                                                                                         this.dim = dim;
                                                                                                                                         this.num_local_points_stride173519 = num_local_points_stride173519;
                                                                                                                                         this.gpu_points173534 = ((x10.array.RemoteArray)(gpu_points173534));
                                                                                                                                         this.gpu_nearest173536 = ((x10.array.RemoteArray)(gpu_nearest173536));
                                                                                                                                     }}
                    
                }
                
                public static class $Closure$121 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$121.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$121> $RTT = new x10.rtt.StaticVoidFunType<$Closure$121>(
                    /* base class */$Closure$121.class
                    , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$121 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$121.class + " calling"); } 
                        x10.array.Array clusters_copy173545 = (x10.array.Array) $deserializer.readRef();
                        $_obj.clusters_copy173545 = clusters_copy173545;
                        $_obj.num_local_points173517 = $deserializer.readInt();
                        $_obj.num_clusters = $deserializer.readInt();
                        $_obj.dim = $deserializer.readInt();
                        $_obj.num_local_points_stride173519 = $deserializer.readInt();
                        x10.array.RemoteArray gpu_points173534 = (x10.array.RemoteArray) $deserializer.readRef();
                        $_obj.gpu_points173534 = gpu_points173534;
                        x10.array.RemoteArray gpu_nearest173536 = (x10.array.RemoteArray) $deserializer.readRef();
                        $_obj.gpu_nearest173536 = gpu_nearest173536;
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$121 $_obj = new $Closure$121((java.lang.System[]) null);
                        $deserializer.record_reference($_obj);
                        return $_deserialize_body($_obj, $deserializer);
                        
                    }
                    
                    public short $_get_serialization_id() {
                    
                         return $_serialization_id;
                        
                    }
                    
                    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                        if (clusters_copy173545 instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.clusters_copy173545);
                        } else {
                        $serializer.write(this.clusters_copy173545);
                        }
                        $serializer.write(this.num_local_points173517);
                        $serializer.write(this.num_clusters);
                        $serializer.write(this.dim);
                        $serializer.write(this.num_local_points_stride173519);
                        if (gpu_points173534 instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.gpu_points173534);
                        } else {
                        $serializer.write(this.gpu_points173534);
                        }
                        if (gpu_nearest173536 instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.gpu_nearest173536);
                        } else {
                        $serializer.write(this.gpu_nearest173536);
                        }
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$121(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    
                        
                        public void
                          $apply(
                          ){
                            
//#line 145 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int blocks173461 =
                              x10.util.CUDAUtilities.autoBlocks$O();
                            
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int threads173462 =
                              x10.util.CUDAUtilities.autoThreads$O();
                            {
                                
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.ensureNotInAtomic();
                                
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.lang.FinishState x10$__var98 =
                                  x10.lang.Runtime.startFinish();
                                
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
try {try {{
                                    {
                                        
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171950min173463 =
                                          0;
                                        
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171950max173464 =
                                          ((blocks173461) - (((int)(1))));
                                        
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i173396 =
                                          i171950min173463;
                                        
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                                 true;
                                                                                                                                                 ) {
                                            
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173397 =
                                              i173396;
                                            
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173398 =
                                              ((t173397) <= (((int)(i171950max173464))));
                                            
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173398)) {
                                                
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                            }
                                            
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int block173393 =
                                              i173396;
                                            
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new KMeansCUDA.$Closure$120(((x10.array.Array)(this.
                                                                                                                                                                                                                                                       clusters_copy173545)),
                                                                                                                                                                                                                                  threads173462,
                                                                                                                                                                                                                                  block173393,
                                                                                                                                                                                                                                  blocks173461,
                                                                                                                                                                                                                                  ((int)(this.
                                                                                                                                                                                                                                           num_local_points173517)),
                                                                                                                                                                                                                                  ((int)(this.
                                                                                                                                                                                                                                           num_clusters)),
                                                                                                                                                                                                                                  this.
                                                                                                                                                                                                                                    dim,
                                                                                                                                                                                                                                  ((int)(this.
                                                                                                                                                                                                                                           num_local_points_stride173519)),
                                                                                                                                                                                                                                  ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                             gpu_points173534)),
                                                                                                                                                                                                                                  ((x10.array.RemoteArray<x10.core.Int>)(this.
                                                                                                                                                                                                                                                                           gpu_nearest173536)),(java.lang.Class<?>) null))));
                                            
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173394 =
                                              i173396;
                                            
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173395 =
                                              ((t173394) + (((int)(1))));
                                            
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i173396 = t173395;
                                        }
                                    }
                                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__74__) {
                                    
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__74__)));
                                    
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
throw new x10.lang.RuntimeException();
                                }finally {{
                                     
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var98)));
                                 }}
                                }
                            }
                        
                        public x10.array.Array<x10.core.Float> clusters_copy173545;
                        public int num_local_points173517;
                        public int num_clusters;
                        public int dim;
                        public int num_local_points_stride173519;
                        public x10.array.RemoteArray<x10.core.Float> gpu_points173534;
                        public x10.array.RemoteArray<x10.core.Int> gpu_nearest173536;
                        
                        // creation method for java code
                        public static KMeansCUDA.$Closure$121 $make(final x10.array.Array<x10.core.Float> clusters_copy173545,
                                                                    final int num_local_points173517,
                                                                    final int num_clusters,
                                                                    final int dim,
                                                                    final int num_local_points_stride173519,
                                                                    final x10.array.RemoteArray<x10.core.Float> gpu_points173534,
                                                                    final x10.array.RemoteArray<x10.core.Int> gpu_nearest173536,java.lang.Class<?> $dummy0){return new $Closure$121(clusters_copy173545,num_local_points173517,num_clusters,dim,num_local_points_stride173519,gpu_points173534,gpu_nearest173536,(java.lang.Class<?>) null);}
                        public $Closure$121(final x10.array.Array<x10.core.Float> clusters_copy173545,
                                            final int num_local_points173517,
                                            final int num_clusters,
                                            final int dim,
                                            final int num_local_points_stride173519,
                                            final x10.array.RemoteArray<x10.core.Float> gpu_points173534,
                                            final x10.array.RemoteArray<x10.core.Int> gpu_nearest173536,java.lang.Class<?> $dummy0) { {
                                                                                                                                             this.clusters_copy173545 = ((x10.array.Array)(clusters_copy173545));
                                                                                                                                             this.num_local_points173517 = num_local_points173517;
                                                                                                                                             this.num_clusters = num_clusters;
                                                                                                                                             this.dim = dim;
                                                                                                                                             this.num_local_points_stride173519 = num_local_points_stride173519;
                                                                                                                                             this.gpu_points173534 = ((x10.array.RemoteArray)(gpu_points173534));
                                                                                                                                             this.gpu_nearest173536 = ((x10.array.RemoteArray)(gpu_nearest173536));
                                                                                                                                         }}
                        
                        }
                        
                    public static class $Closure$122 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                    {
                        private static final long serialVersionUID = 1L;
                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$122.class);
                        
                        public static final x10.rtt.RuntimeType<$Closure$122> $RTT = new x10.rtt.StaticVoidFunType<$Closure$122>(
                        /* base class */$Closure$122.class
                        , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                        );
                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                        
                        
                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$122 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$122.class + " calling"); } 
                            x10.lang.Place gpu173510 = (x10.lang.Place) $deserializer.readRef();
                            $_obj.gpu173510 = gpu173510;
                            x10.lang.Place h173587 = (x10.lang.Place) $deserializer.readRef();
                            $_obj.h173587 = h173587;
                            x10.util.Team team = (x10.util.Team) $deserializer.readRef();
                            $_obj.team = team;
                            $_obj.num_global_points = $deserializer.readInt();
                            $_obj.quiet = $deserializer.readBoolean();
                            $_obj.MEM_ALIGN = $deserializer.readInt();
                            $_obj.num_file_points = $deserializer.readInt();
                            $_obj.dim = $deserializer.readInt();
                            x10.array.Array file_points = (x10.array.Array) $deserializer.readRef();
                            $_obj.file_points = file_points;
                            $_obj.num_clusters = $deserializer.readInt();
                            $_obj.iterations = $deserializer.readInt();
                            $_obj.verbose = $deserializer.readBoolean();
                            return $_obj;
                            
                        }
                        
                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            $Closure$122 $_obj = new $Closure$122((java.lang.System[]) null);
                            $deserializer.record_reference($_obj);
                            return $_deserialize_body($_obj, $deserializer);
                            
                        }
                        
                        public short $_get_serialization_id() {
                        
                             return $_serialization_id;
                            
                        }
                        
                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                        
                            if (gpu173510 instanceof x10.x10rt.X10JavaSerializable) {
                            $serializer.write( (x10.x10rt.X10JavaSerializable) this.gpu173510);
                            } else {
                            $serializer.write(this.gpu173510);
                            }
                            if (h173587 instanceof x10.x10rt.X10JavaSerializable) {
                            $serializer.write( (x10.x10rt.X10JavaSerializable) this.h173587);
                            } else {
                            $serializer.write(this.h173587);
                            }
                            if (team instanceof x10.x10rt.X10JavaSerializable) {
                            $serializer.write( (x10.x10rt.X10JavaSerializable) this.team);
                            } else {
                            $serializer.write(this.team);
                            }
                            $serializer.write(this.num_global_points);
                            $serializer.write(this.quiet);
                            $serializer.write(this.MEM_ALIGN);
                            $serializer.write(this.num_file_points);
                            $serializer.write(this.dim);
                            if (file_points instanceof x10.x10rt.X10JavaSerializable) {
                            $serializer.write( (x10.x10rt.X10JavaSerializable) this.file_points);
                            } else {
                            $serializer.write(this.file_points);
                            }
                            $serializer.write(this.num_clusters);
                            $serializer.write(this.iterations);
                            $serializer.write(this.verbose);
                            
                        }
                        
                        // constructor just for allocation
                        public $Closure$122(final java.lang.System[] $dummy) { 
                        super($dummy);
                        }
                        
                            
                            public void
                              $apply(
                              ){
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173511 =
                                  x10.rtt.Equality.equalsequals((this.
                                                                   gpu173510),(this.
                                                                                 h173587));
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int t173512 =
                                   0;
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173511) {
                                    
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t173512 = this.
                                                                                                                                                   h173587.
                                                                                                                                                   id;
                                } else {
                                    
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173513 =
                                      this.
                                        gpu173510.
                                        id;
                                    
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173514 =
                                      x10.lang.Place.getInitialized$MAX_PLACES();
                                    
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t173512 = ((t173513) - (((int)(t173514))));
                                }
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int role173515 =
                                  t173512;
                                
//#line 99 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
this.
                                                                                                                                     team.barrier((int)(role173515));
                                
//#line 103 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173516 =
                                  this.
                                    team.size$O();
                                
//#line 103 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int num_local_points173517 =
                                  ((this.
                                      num_global_points) / (((int)(t173516))));
                                
//#line 104 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int offset173518 =
                                  ((role173515) * (((int)(num_local_points173517))));
                                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171582min173504 =
                                  0;
                                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173505 =
                                  this.
                                    team.size$O();
                                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int i171582max173506 =
                                  ((t173505) - (((int)(1))));
                                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int i172766 =
                                  i171582min173504;
                                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                         true;
                                                                                                                                         ) {
                                    
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172767 =
                                      i172766;
                                    
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172768 =
                                      ((t172767) <= (((int)(i171582max173506))));
                                    
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t172768)) {
                                        
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                    }
                                    
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int p172763 =
                                      i172766;
                                    
//#line 107 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
boolean t172753 =
                                      ((int) p172763) ==
                                    ((int) role173515);
                                    
//#line 107 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t172753) {
                                        
//#line 107 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t172753 = !(this.
                                                                                                                                                          quiet);
                                    }
                                    
//#line 107 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t172754 =
                                      t172753;
                                    
//#line 107 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t172754) {
                                        
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Printer t172755 =
                                          ((x10.io.Printer)(x10.io.Console.OUT));
                                        
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t172756 =
                                          (("GPU known as ") + (this.
                                                                  gpu173510));
                                        
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t172757 =
                                          ((t172756) + (" gets role "));
                                        
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t172758 =
                                          ((t172757) + ((x10.core.Int.$box(role173515))));
                                        
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t172759 =
                                          ((t172758) + (" offset "));
                                        
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t172760 =
                                          ((t172759) + ((x10.core.Int.$box(offset173518))));
                                        
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t172761 =
                                          ((t172760) + (" len "));
                                        
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t172762 =
                                          ((t172761) + ((x10.core.Int.$box(num_local_points173517))));
                                        
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t172755.println(((java.lang.String)(t172762)));
                                    }
                                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
this.
                                                                                                                                          team.barrier((int)(role173515));
                                    
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172764 =
                                      i172766;
                                    
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t172765 =
                                      ((t172764) + (((int)(1))));
                                    
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
i172766 = t172765;
                                }
                                
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int num_local_points_stride173519 =
                                  KMeansCUDA.round_up$O((int)(num_local_points173517),
                                                        (int)(this.
                                                                MEM_ALIGN));
                                
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> init173520 =
                                  ((x10.core.fun.Fun_0_1)(new KMeansCUDA.$Closure$117(num_local_points_stride173519,
                                                                                      num_local_points173517,
                                                                                      offset173518,
                                                                                      ((int)(this.
                                                                                               num_file_points)),
                                                                                      this.
                                                                                        dim,
                                                                                      ((x10.array.Array)(this.
                                                                                                           file_points)),(java.lang.Class<?>) null)));
                                
//#line 120 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173531 =
                                  ((num_local_points_stride173519) * (((int)(this.
                                                                               dim))));
                                
//#line 120 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.array.Array<x10.core.Float> host_points173532 =
                                  ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(t173531,
                                                                                                                                               ((x10.core.fun.Fun_0_1)(init173520)),(java.lang.Class<?>[][][][]) null)));
                                
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173533 =
                                  ((num_local_points_stride173519) * (((int)(this.
                                                                               dim))));
                                
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.array.RemoteArray<x10.core.Float> gpu_points173534 =
                                  ((x10.array.RemoteArray)(x10.util.CUDAUtilities.<x10.core.Float>makeRemoteArray__2$1x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.lang.Place)(this.
                                                                                                                                                                                           gpu173510)),
                                                                                                                                                  (int)(t173533),
                                                                                                                                                  ((x10.array.Array)(host_points173532)))));
                                
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.array.Array<x10.core.Int> host_nearest173535 =
                                  ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(num_local_points173517)),
                                                                                                                                           (x10.core.Int.$box(0)),(java.lang.Class<?>[][][][][]) null)));
                                
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.array.RemoteArray<x10.core.Int> gpu_nearest173536 =
                                  ((x10.array.RemoteArray)(x10.util.CUDAUtilities.<x10.core.Int>makeRemoteArray__2x10$util$CUDAUtilities$$T(x10.rtt.Types.INT, ((x10.lang.Place)(this.
                                                                                                                                                                                   gpu173510)),
                                                                                                                                            (int)(num_local_points173517),
                                                                                                                                            x10.core.Int.$box(0))));
                                
//#line 126 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173537 =
                                  ((this.
                                      num_clusters) * (((int)(this.
                                                                dim))));
                                
//#line 126 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t173538 =
                                  ((x10.core.fun.Fun_0_1)(new KMeansCUDA.$Closure$118(((x10.array.Array)(this.
                                                                                                           file_points)),(java.lang.Class<?>) null)));
                                
//#line 126 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.array.Array<x10.core.Float> host_clusters173541 =
                                  ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(t173537,
                                                                                                                                               ((x10.core.fun.Fun_0_1)(t173538)),(java.lang.Class<?>[][][][]) null)));
                                
//#line 127 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.array.Array<x10.core.Int> host_cluster_counts173542 =
                                  ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(this.
                                                                                                                                             num_clusters,
                                                                                                                                           (x10.core.Int.$box(0)),(java.lang.Class<?>[][][][][]) null)));
                                
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long toplevel_start_time173543 =
                                  x10.lang.System.currentTimeMillis$O();
                                
//#line 131 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173544 =
                                  ((this.
                                      num_clusters) * (((int)(this.
                                                                dim))));
                                
//#line 131 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.array.Array<x10.core.Float> clusters_copy173545 =
                                  ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(t173544)));
                                
//#line 133 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
long k_time173546 =
                                  ((long)(((int)(0))));
                                
//#line 134 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
long c_time173547 =
                                  ((long)(((int)(0))));
                                
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
long d_time173548 =
                                  ((long)(((int)(0))));
                                
//#line 136 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
long r_time173549 =
                                  ((long)(((int)(0))));
                                
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int iter173507 =
                                  0;
                                
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                         true;
                                                                                                                                         ) {
                                    
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173508 =
                                      iter173507;
                                    
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173509 =
                                      ((t173508) < (((int)(this.
                                                             iterations))));
                                    
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173509)) {
                                        
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                    }
                                    
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173459 =
                                      ((this.
                                          num_clusters) * (((int)(this.
                                                                    dim))));
                                    
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.array.Array.<x10.core.Float>copy__0$1x10$array$Array$$T$2__2$1x10$array$Array$$T$2(x10.rtt.Types.FLOAT, ((x10.array.Array)(host_clusters173541)),
                                                                                                                                                                                                                               (int)(0),
                                                                                                                                                                                                                               ((x10.array.Array)(clusters_copy173545)),
                                                                                                                                                                                                                               (int)(0),
                                                                                                                                                                                                                               (int)(t173459));
                                    
//#line 142 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
long start_time173460 =
                                      x10.lang.System.currentTimeMillis$O();
                                    {
                                        
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.ensureNotInAtomic();
                                        
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.lang.FinishState x10$__var99 =
                                          x10.lang.Runtime.startFinish();
                                        
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
try {try {{
                                            {
                                                
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.runAsync(((x10.lang.Place)(this.
                                                                                                                                                                                                  gpu173510)),
                                                                                                                                                                              ((x10.core.fun.VoidFun_0_0)(new KMeansCUDA.$Closure$121(clusters_copy173545,
                                                                                                                                                                                                                                      num_local_points173517,
                                                                                                                                                                                                                                      ((int)(this.
                                                                                                                                                                                                                                               num_clusters)),
                                                                                                                                                                                                                                      this.
                                                                                                                                                                                                                                        dim,
                                                                                                                                                                                                                                      num_local_points_stride173519,
                                                                                                                                                                                                                                      gpu_points173534,
                                                                                                                                                                                                                                      gpu_nearest173536,(java.lang.Class<?>) null))));
                                            }
                                        }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__75__) {
                                            
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__75__)));
                                            
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
throw new x10.lang.RuntimeException();
                                        }finally {{
                                             
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var99)));
                                         }}
                                        }
                                    
//#line 174 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173465 =
                                      k_time173546;
                                    
//#line 174 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173466 =
                                      x10.lang.System.currentTimeMillis$O();
                                    
//#line 174 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173467 =
                                      start_time173460;
                                    
//#line 174 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173468 =
                                      ((t173466) - (((long)(t173467))));
                                    
//#line 174 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173469 =
                                      ((t173465) + (((long)(t173468))));
                                    
//#line 174 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
k_time173546 = t173469;
                                    
//#line 178 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173470 =
                                      x10.lang.System.currentTimeMillis$O();
                                    
//#line 178 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
start_time173460 = t173470;
                                    {
                                        
//#line 179 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.ensureNotInAtomic();
                                        
//#line 179 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.lang.FinishState x10$__var100 =
                                          x10.lang.Runtime.startFinish();
                                        
//#line 179 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
try {try {{
                                            {
                                                
//#line 179 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.array.Array.<x10.core.Int>asyncCopy__0$1x10$array$Array$$T$2__2$1x10$array$Array$$T$2(x10.rtt.Types.INT, ((x10.array.RemoteArray)(gpu_nearest173536)),
                                                                                                                                                                                                                                              (int)(0),
                                                                                                                                                                                                                                              ((x10.array.Array)(host_nearest173535)),
                                                                                                                                                                                                                                              (int)(0),
                                                                                                                                                                                                                                              (int)(num_local_points173517));
                                            }
                                        }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__76__) {
                                            
//#line 179 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__76__)));
                                            
//#line 179 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
throw new x10.lang.RuntimeException();
                                        }finally {{
                                             
//#line 179 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var100)));
                                         }}
                                        }
                                    
//#line 180 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173471 =
                                      d_time173548;
                                    
//#line 180 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173472 =
                                      x10.lang.System.currentTimeMillis$O();
                                    
//#line 180 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173473 =
                                      start_time173460;
                                    
//#line 180 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173474 =
                                      ((t173472) - (((long)(t173473))));
                                    
//#line 180 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173475 =
                                      ((t173471) + (((long)(t173474))));
                                    
//#line 180 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
d_time173548 = t173475;
                                    
//#line 184 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173476 =
                                      ((float)(int)(((int)(0))));
                                    
//#line 184 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
((x10.array.Array<x10.core.Float>)host_clusters173541).fill__0x10$array$Array$$T(x10.core.Float.$box(t173476));
                                    
//#line 185 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
((x10.array.Array<x10.core.Int>)host_cluster_counts173542).fill__0x10$array$Array$$T(x10.core.Int.$box(0));
                                    
//#line 187 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.core.IndexedMemoryChunk<x10.core.Int> host_nearest_raw173477 =
                                      ((x10.core.IndexedMemoryChunk)(((x10.array.Array<x10.core.Int>)host_nearest173535).raw()));
                                    
//#line 188 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.core.IndexedMemoryChunk<x10.core.Float> host_clusters_raw173478 =
                                      ((x10.core.IndexedMemoryChunk)(((x10.array.Array<x10.core.Float>)host_clusters173541).raw()));
                                    
//#line 189 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.core.IndexedMemoryChunk<x10.core.Float> host_points_raw173479 =
                                      ((x10.core.IndexedMemoryChunk)(((x10.array.Array<x10.core.Float>)host_points173532).raw()));
                                    
//#line 190 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.core.IndexedMemoryChunk<x10.core.Int> host_cluster_counts_raw173480 =
                                      ((x10.core.IndexedMemoryChunk)(((x10.array.Array<x10.core.Int>)host_cluster_counts173542).raw()));
                                    
//#line 191 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173481 =
                                      x10.lang.System.currentTimeMillis$O();
                                    
//#line 191 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
start_time173460 = t173481;
                                    
//#line 192 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int p173453 =
                                      0;
                                    {
                                        
//#line 192 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float[] host_points_raw173479$value173610 =
                                          ((float[])host_points_raw173479.value);
                                        
//#line 192 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int[] host_nearest_raw173477$value173611 =
                                          ((int[])host_nearest_raw173477.value);
                                        
//#line 192 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                                 true;
                                                                                                                                                 ) {
                                            
//#line 192 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173454 =
                                              p173453;
                                            
//#line 192 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173455 =
                                              ((t173454) < (((int)(num_local_points173517))));
                                            
//#line 192 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173455)) {
                                                
//#line 192 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                            }
                                            
//#line 193 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173418 =
                                              p173453;
                                            
//#line 193 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int closest173419 =
                                              ((int)host_nearest_raw173477$value173611[t173418]);
                                            
//#line 194 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int d173413 =
                                              0;
                                            {
                                                
//#line 194 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                                         true;
                                                                                                                                                         ) {
                                                    
//#line 194 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173414 =
                                                      d173413;
                                                    
//#line 194 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173415 =
                                                      ((t173414) < (((int)(this.
                                                                             dim))));
                                                    
//#line 194 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173415)) {
                                                        
//#line 194 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                                    }
                                                    
//#line 195 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.core.IndexedMemoryChunk<x10.core.Float> x173401 =
                                                      ((x10.core.IndexedMemoryChunk)(host_clusters_raw173478));
                                                    
//#line 195 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173402 =
                                                      ((closest173419) * (((int)(4))));
                                                    
//#line 195 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173403 =
                                                      d173413;
                                                    
//#line 195 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int y173404 =
                                                      ((t173402) + (((int)(t173403))));
                                                    
//#line 195 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173405 =
                                                      p173453;
                                                    
//#line 195 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173406 =
                                                      d173413;
                                                    
//#line 195 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173407 =
                                                      ((t173406) * (((int)(num_local_points_stride173519))));
                                                    
//#line 195 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173408 =
                                                      ((t173405) + (((int)(t173407))));
                                                    
//#line 195 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float z173409 =
                                                      ((float)host_points_raw173479$value173610[t173408]);
                                                    
//#line 195 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float ret173410 =
                                                       0;
                                                    
//#line 195 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173399 =
                                                      ((float[])x173401.value)[y173404];
                                                    
//#line 195 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float r173400 =
                                                      ((t173399) + (((float)(z173409))));
                                                    
//#line 195 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
((float[])x173401.value)[y173404] = r173400;
                                                    
//#line 195 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
ret173410 = r173400;
                                                    
//#line 194 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173411 =
                                                      d173413;
                                                    
//#line 194 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173412 =
                                                      ((t173411) + (((int)(1))));
                                                    
//#line 194 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
d173413 = t173412;
                                                }
                                            }
                                            
//#line 196 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.core.IndexedMemoryChunk<x10.core.Int> x173420 =
                                              ((x10.core.IndexedMemoryChunk)(host_cluster_counts_raw173480));
                                            
//#line 196 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int y173421 =
                                              closest173419;
                                            
//#line 196 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
;
                                            
//#line 196 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int ret173422 =
                                               0;
                                            
//#line 196 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173416 =
                                              ((int[])x173420.value)[y173421];
                                            
//#line 196 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int r173417 =
                                              ((t173416) + (((int)(1))));
                                            
//#line 196 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
((int[])x173420.value)[y173421] = r173417;
                                            
//#line 196 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
ret173422 = r173417;
                                            
//#line 192 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173423 =
                                              p173453;
                                            
//#line 192 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173424 =
                                              ((t173423) + (((int)(1))));
                                            
//#line 192 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
p173453 = t173424;
                                        }
                                    }
                                    
//#line 198 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173482 =
                                      c_time173547;
                                    
//#line 198 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173483 =
                                      x10.lang.System.currentTimeMillis$O();
                                    
//#line 198 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173484 =
                                      start_time173460;
                                    
//#line 198 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173485 =
                                      ((t173483) - (((long)(t173484))));
                                    
//#line 198 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173486 =
                                      ((t173482) + (((long)(t173485))));
                                    
//#line 198 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
c_time173547 = t173486;
                                    
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173487 =
                                      x10.lang.System.currentTimeMillis$O();
                                    
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
start_time173460 = t173487;
                                    
//#line 202 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173488 =
                                      ((x10.array.Array<x10.core.Float>)host_clusters173541).
                                        size;
                                    
//#line 202 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173489 =
                                      x10.util.Team.ADD;
                                    
//#line 202 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
((x10.util.Team)this.
                                                                                                                                                          team).<x10.core.Float>allreduce__1$1x10$util$Team$$T$2__3$1x10$util$Team$$T$2(x10.rtt.Types.FLOAT, (int)(role173515),
                                                                                                                                                                                                                                        ((x10.array.Array)(host_clusters173541)),
                                                                                                                                                                                                                                        (int)(0),
                                                                                                                                                                                                                                        ((x10.array.Array)(host_clusters173541)),
                                                                                                                                                                                                                                        (int)(0),
                                                                                                                                                                                                                                        (int)(t173488),
                                                                                                                                                                                                                                        (int)(t173489));
                                    
//#line 203 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173490 =
                                      ((x10.array.Array<x10.core.Int>)host_cluster_counts173542).
                                        size;
                                    
//#line 203 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173491 =
                                      x10.util.Team.ADD;
                                    
//#line 203 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
((x10.util.Team)this.
                                                                                                                                                          team).<x10.core.Int>allreduce__1$1x10$util$Team$$T$2__3$1x10$util$Team$$T$2(x10.rtt.Types.INT, (int)(role173515),
                                                                                                                                                                                                                                      ((x10.array.Array)(host_cluster_counts173542)),
                                                                                                                                                                                                                                      (int)(0),
                                                                                                                                                                                                                                      ((x10.array.Array)(host_cluster_counts173542)),
                                                                                                                                                                                                                                      (int)(0),
                                                                                                                                                                                                                                      (int)(t173490),
                                                                                                                                                                                                                                      (int)(t173491));
                                    
//#line 204 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173492 =
                                      r_time173549;
                                    
//#line 204 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173493 =
                                      x10.lang.System.currentTimeMillis$O();
                                    
//#line 204 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173494 =
                                      start_time173460;
                                    
//#line 204 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173495 =
                                      ((t173493) - (((long)(t173494))));
                                    
//#line 204 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173496 =
                                      ((t173492) + (((long)(t173495))));
                                    
//#line 204 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
r_time173549 = t173496;
                                    
//#line 206 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int k173456 =
                                      0;
                                    
//#line 206 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                             true;
                                                                                                                                             ) {
                                        
//#line 206 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173457 =
                                          k173456;
                                        
//#line 206 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173458 =
                                          ((t173457) < (((int)(this.
                                                                 num_clusters))));
                                        
//#line 206 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173458)) {
                                            
//#line 206 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                        }
                                        
//#line 207 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173441 =
                                          k173456;
                                        
//#line 207 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173442 =
                                          x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)host_cluster_counts173542).$apply$G((int)(t173441)));
                                        
//#line 207 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173443 =
                                          ((t173442) <= (((int)(0))));
                                        
//#line 207 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173443) {
                                            
//#line 207 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Printer t173444 =
                                              ((x10.io.Printer)(x10.io.Console.ERR));
                                            
//#line 207 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173445 =
                                              k173456;
                                            
//#line 207 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t173446 =
                                              (("host_cluster_counts(") + ((x10.core.Int.$box(t173445))));
                                            
//#line 207 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t173447 =
                                              ((t173446) + (") = "));
                                            
//#line 207 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173448 =
                                              k173456;
                                            
//#line 207 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173449 =
                                              x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)host_cluster_counts173542).$apply$G((int)(t173448)));
                                            
//#line 207 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t173450 =
                                              ((t173447) + ((x10.core.Int.$box(t173449))));
                                            
//#line 207 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t173444.println(((java.lang.String)(t173450)));
                                        }
                                        
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
int d173438 =
                                          0;
                                        
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
for (;
                                                                                                                                                 true;
                                                                                                                                                 ) {
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173439 =
                                              d173438;
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173440 =
                                              ((t173439) < (((int)(this.
                                                                     dim))));
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (!(t173440)) {
                                                
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
break;
                                            }
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.array.Array<x10.core.Float> x173427 =
                                              ((x10.array.Array)(host_clusters173541));
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173428 =
                                              k173456;
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173429 =
                                              ((t173428) * (((int)(4))));
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173430 =
                                              d173438;
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int y173431 =
                                              ((t173429) + (((int)(t173430))));
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173432 =
                                              k173456;
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173433 =
                                              x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)host_cluster_counts173542).$apply$G((int)(t173432)));
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float z173434 =
                                              ((float)(int)(((int)(t173433))));
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
float ret173435 =
                                               0;
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float t173425 =
                                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)x173427).$apply$G((int)(y173431)));
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final float r173426 =
                                              ((t173425) / (((float)(z173434))));
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
((x10.array.Array<x10.core.Float>)x173427).$set__1x10$array$Array$$T$G((int)(y173431),
                                                                                                                                                                                                                       x10.core.Float.$box(r173426));
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
ret173435 = r173426;
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173436 =
                                              d173438;
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173437 =
                                              ((t173436) + (((int)(1))));
                                            
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
d173438 = t173437;
                                        }
                                        
//#line 206 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173451 =
                                          k173456;
                                        
//#line 206 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173452 =
                                          ((t173451) + (((int)(1))));
                                        
//#line 206 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
k173456 = t173452;
                                    }
                                    
//#line 211 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
boolean t173497 =
                                      ((int) offset173518) ==
                                    ((int) 0);
                                    
//#line 211 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173497) {
                                        
//#line 211 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t173497 = this.
                                                                                                                                                        verbose;
                                    }
                                    
//#line 211 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173498 =
                                      t173497;
                                    
//#line 211 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173498) {
                                        
//#line 212 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Printer t173499 =
                                          ((x10.io.Printer)(x10.io.Console.OUT));
                                        
//#line 212 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173500 =
                                          iter173507;
                                        
//#line 212 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t173501 =
                                          (("Iteration: ") + ((x10.core.Int.$box(t173500))));
                                        
//#line 212 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t173499.println(((java.lang.String)(t173501)));
                                        
//#line 213 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
KMeansCUDA.printClusters__0$1x10$lang$Float$2(((x10.array.Array)(host_clusters173541)),
                                                                                                                                                                                          (int)(this.
                                                                                                                                                                                                  dim));
                                    }
                                    
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173502 =
                                      iter173507;
                                    
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final int t173503 =
                                      ((t173502) + (((int)(1))));
                                    
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
iter173507 = t173503;
                                    }
                                    
//#line 228 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173550 =
                                      ((int) offset173518) ==
                                    ((int) 0);
                                    
//#line 228 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173550) {
                                        
//#line 229 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long toplevel_stop_time173551 =
                                          x10.lang.System.currentTimeMillis$O();
                                        
//#line 230 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final boolean t173552 =
                                          !(this.
                                              quiet);
                                        
//#line 230 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
if (t173552) {
                                            
//#line 230 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Printer t173553 =
                                              ((x10.io.Printer)(x10.io.Console.OUT));
                                            
//#line 230 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t173554 =
                                              (("") + ((x10.core.Int.$box(this.
                                                                            num_global_points))));
                                            
//#line 230 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t173555 =
                                              ((t173554) + (" "));
                                            
//#line 230 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t173556 =
                                              ((t173555) + ((x10.core.Int.$box(this.
                                                                                 num_clusters))));
                                            
//#line 230 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t173557 =
                                              ((t173556) + (" "));
                                            
//#line 230 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t173558 =
                                              ((t173557) + ((x10.core.Int.$box(this.
                                                                                 dim))));
                                            
//#line 230 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t173559 =
                                              ((t173558) + (" "));
                                            
//#line 230 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t173553.print(((java.lang.String)(t173559)));
                                        }
                                        
//#line 231 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Printer t173560 =
                                          ((x10.io.Printer)(x10.io.Console.OUT));
                                        
//#line 231 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173561 =
                                          ((toplevel_stop_time173551) - (((long)(toplevel_start_time173543))));
                                        
//#line 231 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final double t173562 =
                                          ((double)(long)(((long)(t173561))));
                                        
//#line 231 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final double t173563 =
                                          ((t173562) / (((double)(1000.0))));
                                        
//#line 231 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t173560.println(x10.core.Double.$box(t173563));
                                        
//#line 232 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Printer t173564 =
                                          ((x10.io.Printer)(x10.io.Console.OUT));
                                        
//#line 232 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173565 =
                                          k_time173546;
                                        
//#line 232 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final double t173566 =
                                          ((double)(long)(((long)(t173565))));
                                        
//#line 232 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final double t173567 =
                                          ((t173566) / (((double)(1000.0))));
                                        
//#line 232 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t173568 =
                                          (("kernel: ") + ((x10.core.Double.$box(t173567))));
                                        
//#line 232 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t173564.println(((java.lang.String)(t173568)));
                                        
//#line 233 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Printer t173569 =
                                          ((x10.io.Printer)(x10.io.Console.OUT));
                                        
//#line 233 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173570 =
                                          d_time173548;
                                        
//#line 233 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final double t173571 =
                                          ((double)(long)(((long)(t173570))));
                                        
//#line 233 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final double t173572 =
                                          ((t173571) / (((double)(1000.0))));
                                        
//#line 233 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t173573 =
                                          (("dma: ") + ((x10.core.Double.$box(t173572))));
                                        
//#line 233 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t173569.println(((java.lang.String)(t173573)));
                                        
//#line 234 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Printer t173574 =
                                          ((x10.io.Printer)(x10.io.Console.OUT));
                                        
//#line 234 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173575 =
                                          c_time173547;
                                        
//#line 234 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final double t173576 =
                                          ((double)(long)(((long)(t173575))));
                                        
//#line 234 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final double t173577 =
                                          ((t173576) / (((double)(1000.0))));
                                        
//#line 234 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t173578 =
                                          (("cpu: ") + ((x10.core.Double.$box(t173577))));
                                        
//#line 234 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t173574.println(((java.lang.String)(t173578)));
                                        
//#line 235 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final x10.io.Printer t173579 =
                                          ((x10.io.Printer)(x10.io.Console.OUT));
                                        
//#line 235 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final long t173580 =
                                          r_time173549;
                                        
//#line 235 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final double t173581 =
                                          ((double)(long)(((long)(t173580))));
                                        
//#line 235 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final double t173582 =
                                          ((t173581) / (((double)(1000.0))));
                                        
//#line 235 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
final java.lang.String t173583 =
                                          (("reduce: ") + ((x10.core.Double.$box(t173582))));
                                        
//#line 235 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
t173579.println(((java.lang.String)(t173583)));
                                    }
                                    
//#line 238 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.util.CUDAUtilities.<x10.core.Float>deleteRemoteArray__0$1x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(gpu_points173534)));
                                    
//#line 239 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/KMeansCUDA.x10"
x10.util.CUDAUtilities.<x10.core.Int>deleteRemoteArray__0$1x10$util$CUDAUtilities$$T$2(x10.rtt.Types.INT, ((x10.array.RemoteArray)(gpu_nearest173536)));
                                }
                                
                                public x10.lang.Place gpu173510;
                                public x10.lang.Place h173587;
                                public x10.util.Team team;
                                public int num_global_points;
                                public boolean quiet;
                                public int MEM_ALIGN;
                                public int num_file_points;
                                public int dim;
                                public x10.array.Array<x10.core.Float> file_points;
                                public int num_clusters;
                                public int iterations;
                                public boolean verbose;
                                
                                // creation method for java code
                                public static KMeansCUDA.$Closure$122 $make(final x10.lang.Place gpu173510,
                                                                            final x10.lang.Place h173587,
                                                                            final x10.util.Team team,
                                                                            final int num_global_points,
                                                                            final boolean quiet,
                                                                            final int MEM_ALIGN,
                                                                            final int num_file_points,
                                                                            final int dim,
                                                                            final x10.array.Array<x10.core.Float> file_points,
                                                                            final int num_clusters,
                                                                            final int iterations,
                                                                            final boolean verbose,java.lang.Class<?> $dummy0){return new $Closure$122(gpu173510,h173587,team,num_global_points,quiet,MEM_ALIGN,num_file_points,dim,file_points,num_clusters,iterations,verbose,(java.lang.Class<?>) null);}
                                public $Closure$122(final x10.lang.Place gpu173510,
                                                    final x10.lang.Place h173587,
                                                    final x10.util.Team team,
                                                    final int num_global_points,
                                                    final boolean quiet,
                                                    final int MEM_ALIGN,
                                                    final int num_file_points,
                                                    final int dim,
                                                    final x10.array.Array<x10.core.Float> file_points,
                                                    final int num_clusters,
                                                    final int iterations,
                                                    final boolean verbose,java.lang.Class<?> $dummy0) { {
                                                                                                               this.gpu173510 = ((x10.lang.Place)(gpu173510));
                                                                                                               this.h173587 = ((x10.lang.Place)(h173587));
                                                                                                               this.team = ((x10.util.Team)(team));
                                                                                                               this.num_global_points = num_global_points;
                                                                                                               this.quiet = quiet;
                                                                                                               this.MEM_ALIGN = MEM_ALIGN;
                                                                                                               this.num_file_points = num_file_points;
                                                                                                               this.dim = dim;
                                                                                                               this.file_points = ((x10.array.Array)(file_points));
                                                                                                               this.num_clusters = num_clusters;
                                                                                                               this.iterations = iterations;
                                                                                                               this.verbose = verbose;
                                                                                                           }}
                                
                            }
                            
                        
                    }
                    