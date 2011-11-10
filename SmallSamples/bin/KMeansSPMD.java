
public class KMeansSPMD extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, KMeansSPMD.class);
    
    public static final x10.rtt.RuntimeType<KMeansSPMD> $RTT = new x10.rtt.NamedType<KMeansSPMD>(
    "KMeansSPMD", /* base class */KMeansSPMD.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(KMeansSPMD $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + KMeansSPMD.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        KMeansSPMD $_obj = new KMeansSPMD((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public KMeansSPMD(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
public static void
                                                                                                                printClusters__0$1x10$lang$Float$2(
                                                                                                                final x10.array.Array<x10.core.Float> clusters,
                                                                                                                final int dims){
            
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
int d =
              0;
            
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
for (;
                                                                                                                       true;
                                                                                                                       ) {
                
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191588 =
                  d;
                
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191609 =
                  ((t191588) < (((int)(dims))));
                
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (!(t191609)) {
                    
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
break;
                }
                
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
int k191839 =
                  0;
                
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                    
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191840 =
                      k191839;
                    
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191841 =
                      ((x10.array.Array<x10.core.Float>)clusters).
                        size;
                    
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191842 =
                      ((t191841) / (((int)(dims))));
                    
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191843 =
                      ((t191840) < (((int)(t191842))));
                    
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (!(t191843)) {
                        
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
break;
                    }
                    
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191827 =
                      k191839;
                    
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191828 =
                      ((t191827) > (((int)(0))));
                    
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (t191828) {
                        
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.io.Printer t191829 =
                          ((x10.io.Printer)(x10.io.Console.OUT));
                        
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
t191829.print(((java.lang.String)(" ")));
                    }
                    
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.io.Printer t191830 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191831 =
                      k191839;
                    
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191832 =
                      ((t191831) * (((int)(dims))));
                    
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191833 =
                      d;
                    
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191834 =
                      ((t191832) + (((int)(t191833))));
                    
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float t191835 =
                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)clusters).$apply$G((int)(t191834)));
                    
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t191836 =
                      java.lang.Float.toString(t191835);
                    
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
t191830.print(((java.lang.String)(t191836)));
                    
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191837 =
                      k191839;
                    
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191838 =
                      ((t191837) + (((int)(1))));
                    
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
k191839 = t191838;
                }
                
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.io.Printer t191844 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 35 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
t191844.println();
                
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191845 =
                  d;
                
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191846 =
                  ((t191845) + (((int)(1))));
                
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
d = t191846;
            }
        }
        
        
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        KMeansSPMD.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> args) {
            
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
try {try {{
                
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.util.Option t191611 =
                  new x10.util.Option((java.lang.System[]) null).$init(((java.lang.String)("q")),
                                                                       ((java.lang.String)("quiet")),
                                                                       ((java.lang.String)("just print time taken")));
                
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.util.Option t191612 =
                  new x10.util.Option((java.lang.System[]) null).$init(((java.lang.String)("v")),
                                                                       ((java.lang.String)("verbose")),
                                                                       ((java.lang.String)("print out each iteration")));
                
//#line 46 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.util.Option t191613 =
                  new x10.util.Option((java.lang.System[]) null).$init(((java.lang.String)("h")),
                                                                       ((java.lang.String)("help")),
                                                                       ((java.lang.String)("this information")));
                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.array.Array<x10.util.Option> t191620 =
                  ((x10.array.Array)(x10.core.ArrayFactory.<x10.util.Option> makeArrayFromJavaArray(x10.util.Option.$RTT, new x10.util.Option[] {t191611, t191612, t191613})));
                
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.util.Option t191614 =
                  new x10.util.Option((java.lang.System[]) null).$init(((java.lang.String)("p")),
                                                                       ((java.lang.String)("points")),
                                                                       ((java.lang.String)("location of data file")));
                
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.util.Option t191615 =
                  new x10.util.Option((java.lang.System[]) null).$init(((java.lang.String)("i")),
                                                                       ((java.lang.String)("iterations")),
                                                                       ((java.lang.String)("quit after this many iterations")));
                
//#line 50 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.util.Option t191616 =
                  new x10.util.Option((java.lang.System[]) null).$init(((java.lang.String)("c")),
                                                                       ((java.lang.String)("clusters")),
                                                                       ((java.lang.String)("number of clusters to find")));
                
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.util.Option t191617 =
                  new x10.util.Option((java.lang.System[]) null).$init(((java.lang.String)("d")),
                                                                       ((java.lang.String)("dim")),
                                                                       ((java.lang.String)("number of dimensions")));
                
//#line 52 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.util.Option t191618 =
                  new x10.util.Option((java.lang.System[]) null).$init(((java.lang.String)("s")),
                                                                       ((java.lang.String)("slices")),
                                                                       ((java.lang.String)("factor by which to oversubscribe computational resources")));
                
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.util.Option t191619 =
                  new x10.util.Option((java.lang.System[]) null).$init(((java.lang.String)("n")),
                                                                       ((java.lang.String)("num")),
                                                                       ((java.lang.String)("quantity of points")));
                
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.array.Array<x10.util.Option> t191621 =
                  ((x10.array.Array)(x10.core.ArrayFactory.<x10.util.Option> makeArrayFromJavaArray(x10.util.Option.$RTT, new x10.util.Option[] {t191614, t191615, t191616, t191617, t191618, t191619})));
                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.util.OptionsParser opts =
                  ((x10.util.OptionsParser)(new x10.util.OptionsParser((java.lang.System[]) null).$init(((x10.array.Array)(args)),
                                                                                                        ((x10.array.Array)(t191620)),
                                                                                                        ((x10.array.Array)(t191621)),(java.lang.Class<?>) null)));
                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.array.Array<java.lang.String> t191622 =
                  ((x10.array.Array)(opts.filteredArgs()));
                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191623 =
                  ((x10.array.Array<java.lang.String>)t191622).
                    size;
                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191628 =
                  ((int) t191623) !=
                ((int) 0);
                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (t191628) {
                    
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.io.Printer t191625 =
                      ((x10.io.Printer)(x10.io.Console.ERR));
                    
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.array.Array<java.lang.String> t191624 =
                      ((x10.array.Array)(opts.filteredArgs()));
                    
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t191626 =
                      (("Unexpected arguments: ") + (t191624));
                    
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
t191625.println(((java.lang.String)(t191626)));
                    
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.io.Printer t191627 =
                      ((x10.io.Printer)(x10.io.Console.ERR));
                    
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
t191627.println(((java.lang.String)("Use -h or --help.")));
                    
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
x10.runtime.impl.java.Runtime.setExitCode(((int)(1)));
                    
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
return;
                }
                
//#line 61 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191631 =
                  opts.$apply$O(((java.lang.String)("-h")));
                
//#line 61 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (t191631) {
                    
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.io.Printer t191629 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t191630 =
                      opts.usage$O();
                    
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
t191629.println(((java.lang.String)(t191630)));
                    
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
return;
                }
                
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String fname =
                  opts.$apply$O(((java.lang.String)("-p")),
                                ((java.lang.String)("points.dat")));
                
//#line 67 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int num_clusters =
                  opts.$apply$O(((java.lang.String)("-c")),
                                (int)(4));
                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int num_slices =
                  opts.$apply$O(((java.lang.String)("-s")),
                                (int)(1));
                
//#line 69 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int num_global_points =
                  opts.$apply$O(((java.lang.String)("-n")),
                                (int)(2000));
                
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int iterations =
                  opts.$apply$O(((java.lang.String)("-i")),
                                (int)(50));
                
//#line 71 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int dim =
                  opts.$apply$O(((java.lang.String)("-d")),
                                (int)(4));
                
//#line 72 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean verbose =
                  opts.$apply$O(((java.lang.String)("-v")));
                
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean quiet =
                  opts.$apply$O(((java.lang.String)("-q")));
                
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191638 =
                  !(quiet);
                
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (t191638) {
                    
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.io.Printer t191636 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t191632 =
                      (("points: ") + ((x10.core.Int.$box(num_global_points))));
                    
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t191633 =
                      ((t191632) + (" clusters: "));
                    
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t191634 =
                      ((t191633) + ((x10.core.Int.$box(num_clusters))));
                    
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t191635 =
                      ((t191634) + (" dim: "));
                    
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t191637 =
                      ((t191635) + ((x10.core.Int.$box(dim))));
                    
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
t191636.println(((java.lang.String)(t191637)));
                }
                
//#line 79 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.io.File file =
                  ((x10.io.File)(new x10.io.File((java.lang.System[]) null).$init(((java.lang.String)(fname)))));
                
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.io.FileReader fr =
                  file.openRead();
                
//#line 81 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> init_points =
                  ((x10.core.fun.Fun_0_1)(new KMeansSPMD.$Closure$139(fr)));
                
//#line 82 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long t191643 =
                  file.size$O();
                
//#line 82 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long t191644 =
                  ((long)(((int)(dim))));
                
//#line 82 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long t191645 =
                  ((t191643) / (((long)(t191644))));
                
//#line 82 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long t191646 =
                  ((long)(((int)(4))));
                
//#line 82 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long t191647 =
                  ((t191645) / (((long)(t191646))));
                
//#line 82 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int num_file_points =
                  ((int)(long)(((long)(t191647))));
                
//#line 83 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191648 =
                  ((num_file_points) * (((int)(dim))));
                
//#line 83 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.array.Array<x10.core.Float> file_points =
                  ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(t191648,
                                                                                                                               ((x10.core.fun.Fun_0_1)(init_points)),(java.lang.Class<?>[][][][]) null)));
                
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191649 =
                  x10.lang.Place.getInitialized$MAX_PLACES();
                
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191652 =
                  ((num_slices) * (((int)(t191649))));
                
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.lang.Place> t191653 =
                  ((x10.core.fun.Fun_0_1)(new KMeansSPMD.$Closure$140(num_slices)));
                
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.array.Array<x10.lang.Place> t191654 =
                  ((x10.array.Array)(new x10.array.Array<x10.lang.Place>((java.lang.System[]) null, x10.lang.Place.$RTT).$init(t191652,
                                                                                                                               ((x10.core.fun.Fun_0_1)(t191653)),(java.lang.Class<?>[][][][]) null)));
                
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.util.Team team =
                  new x10.util.Team((java.lang.System[]) null).$init(((x10.array.Array)(t191654)),(java.lang.Class<?>) null);
                
//#line 88 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191655 =
                  ((num_global_points) / (((int)(num_slices))));
                
//#line 88 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191656 =
                  x10.lang.Place.getInitialized$MAX_PLACES();
                
//#line 88 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int num_slice_points =
                  ((t191655) / (((int)(t191656))));
                {
                    
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
x10.lang.Runtime.ensureNotInAtomic();
                    
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.lang.FinishState x10$__var115 =
                      x10.lang.Runtime.startFinish();
                    
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
try {try {{
                        {
                            
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int i191554min191555 =
                              0;
                            
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int i191554max191556 =
                              ((num_slices) - (((int)(1))));
                            
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
int i192058 =
                              i191554min191555;
                            
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
for (;
                                                                                                                                       true;
                                                                                                                                       ) {
                                
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t192059 =
                                  i192058;
                                
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t192060 =
                                  ((t192059) <= (((int)(i191554max191556))));
                                
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (!(t192060)) {
                                    
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
break;
                                }
                                
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int slice192055 =
                                  i192058;
                                
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.lang.Sequence<x10.lang.Place> t192052 =
                                  x10.lang.Place.places();
                                
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.lang.Iterator<x10.lang.Place> h192053 =
                                  ((x10.lang.Iterator<x10.lang.Place>)
                                    ((x10.lang.Iterable<x10.lang.Place>)t192052).iterator());
                                
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
for (;
                                                                                                                                           true;
                                                                                                                                           ) {
                                    
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t192054 =
                                      ((x10.lang.Iterator<x10.lang.Place>)h192053).hasNext$O();
                                    
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (!(t192054)) {
                                        
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
break;
                                    }
                                    
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.lang.Place h191994 =
                                      ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)h192053).next$G()));
                                    
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
x10.lang.Runtime.runAsync(((x10.lang.Place)(h191994)),
                                                                                                                                                                    ((x10.core.fun.VoidFun_0_0)(new KMeansSPMD.$Closure$143(num_slices,
                                                                                                                                                                                                                            slice192055,
                                                                                                                                                                                                                            num_slice_points,
                                                                                                                                                                                                                            quiet,
                                                                                                                                                                                                                            h191994,
                                                                                                                                                                                                                            num_file_points,
                                                                                                                                                                                                                            dim,
                                                                                                                                                                                                                            file_points,
                                                                                                                                                                                                                            num_clusters,
                                                                                                                                                                                                                            team,
                                                                                                                                                                                                                            iterations,
                                                                                                                                                                                                                            verbose,
                                                                                                                                                                                                                            num_global_points,(java.lang.Class<?>) null))));
                                }
                                
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t192056 =
                                  i192058;
                                
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t192057 =
                                  ((t192056) + (((int)(1))));
                                
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
i192058 = t192057;
                            }
                        }
                    }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__87__) {
                        
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__87__)));
                        
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
throw new x10.lang.RuntimeException();
                    }finally {{
                         
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var115)));
                     }}
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (final x10.core.X10Throwable e) {
                    
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
e.printStackTrace();
                }
            }
        
        
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final public KMeansSPMD
                                                                                                                KMeansSPMD$$KMeansSPMD$this(
                                                                                                                ){
            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
return KMeansSPMD.this;
        }
        
        
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
// creation method for java code
        public static KMeansSPMD $make(){return new KMeansSPMD((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public KMeansSPMD KMeansSPMD$$init$S() { {
                                                              
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"

                                                              
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"

                                                          }
                                                          return this;
                                                          }
        
        // constructor
        public KMeansSPMD $init(){return KMeansSPMD$$init$S();}
        
        
        public static class $Closure$139 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$139.class);
            
            public static final x10.rtt.RuntimeType<$Closure$139> $RTT = new x10.rtt.StaticFunType<$Closure$139>(
            /* base class */$Closure$139.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$139 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$139.class + " calling"); } 
                x10.io.FileReader fr = (x10.io.FileReader) $deserializer.readRef();
                $_obj.fr = fr;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$139 $_obj = new $Closure$139((java.lang.System[]) null);
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
            public $Closure$139(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
            }
            
                
                public float
                  $apply$O(
                  final int id$148382){
                    
//#line 81 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.io.Marshal.IntMarshal t191639 =
                      ((x10.io.Marshal.IntMarshal)(x10.io.Marshal.Shadow.getInitialized$INT()));
                    
//#line 81 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191640 =
                      t191639.read$O(((x10.io.Reader)(this.
                                                        fr)));
                    
//#line 81 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191641 =
                      java.lang.Integer.reverseBytes(t191640);
                    
//#line 81 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float t191642 =
                      java.lang.Float.intBitsToFloat(((int)(t191641)));
                    
//#line 81 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
return t191642;
                }
                
                public x10.io.FileReader fr;
                
                // creation method for java code
                public static KMeansSPMD.$Closure$139 $make(final x10.io.FileReader fr){return new $Closure$139(fr);}
                public $Closure$139(final x10.io.FileReader fr) { {
                                                                         this.fr = ((x10.io.FileReader)(fr));
                                                                     }}
                
            }
            
        public static class $Closure$140 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$140.class);
            
            public static final x10.rtt.RuntimeType<$Closure$140> $RTT = new x10.rtt.StaticFunType<$Closure$140>(
            /* base class */$Closure$140.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.lang.Place.$RTT), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$140 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$140.class + " calling"); } 
                $_obj.num_slices = $deserializer.readInt();
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$140 $_obj = new $Closure$140((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                $serializer.write(this.num_slices);
                
            }
            
            // constructor just for allocation
            public $Closure$140(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Int.$unbox(a1));
            }
            
                
                public x10.lang.Place
                  $apply(
                  final int i){
                    
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191650 =
                      ((i) / (((int)(this.
                                       num_slices))));
                    
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.lang.Place t191651 =
                      ((x10.lang.Place)(x10.lang.Place.place((int)(t191650))));
                    
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
return t191651;
                }
                
                public int num_slices;
                
                // creation method for java code
                public static KMeansSPMD.$Closure$140 $make(final int num_slices){return new $Closure$140(num_slices);}
                public $Closure$140(final int num_slices) { {
                                                                   this.num_slices = num_slices;
                                                               }}
                
            }
            
        public static class $Closure$141 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$141.class);
            
            public static final x10.rtt.RuntimeType<$Closure$141> $RTT = new x10.rtt.StaticFunType<$Closure$141>(
            /* base class */$Closure$141.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$141 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$141.class + " calling"); } 
                $_obj.num_slice_points_stride192010 = $deserializer.readInt();
                $_obj.num_slice_points = $deserializer.readInt();
                $_obj.offset192002 = $deserializer.readInt();
                $_obj.num_file_points = $deserializer.readInt();
                $_obj.dim = $deserializer.readInt();
                x10.array.Array file_points = (x10.array.Array) $deserializer.readRef();
                $_obj.file_points = file_points;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$141 $_obj = new $Closure$141((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                $serializer.write(this.num_slice_points_stride192010);
                $serializer.write(this.num_slice_points);
                $serializer.write(this.offset192002);
                $serializer.write(this.num_file_points);
                $serializer.write(this.dim);
                if (file_points instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.file_points);
                } else {
                $serializer.write(this.file_points);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$141(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
            }
            
                
                public float
                  $apply$O(
                  final int i192012){
                    
//#line 104 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int d192013 =
                      ((i192012) / (((int)(this.
                                             num_slice_points_stride192010))));
                    
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int p192014 =
                      ((i192012) % (((int)(this.
                                             num_slice_points_stride192010))));
                    
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t192015 =
                      ((p192014) < (((int)(this.
                                             num_slice_points))));
                    
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
float t192016 =
                       0;
                    
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (t192015) {
                        
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t192017 =
                          ((p192014) + (((int)(this.
                                                 offset192002))));
                        
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t192018 =
                          ((t192017) % (((int)(this.
                                                 num_file_points))));
                        
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t192019 =
                          ((t192018) * (((int)(this.
                                                 dim))));
                        
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t192020 =
                          ((t192019) + (((int)(d192013))));
                        
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
t192016 = x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                                                                                                                                   file_points).$apply$G((int)(t192020)));
                    } else {
                        
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
t192016 = 0.0F;
                    }
                    
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float t192021 =
                      t192016;
                    
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
return t192021;
                }
                
                public int num_slice_points_stride192010;
                public int num_slice_points;
                public int offset192002;
                public int num_file_points;
                public int dim;
                public x10.array.Array<x10.core.Float> file_points;
                
                // creation method for java code
                public static KMeansSPMD.$Closure$141 $make(final int num_slice_points_stride192010,
                                                            final int num_slice_points,
                                                            final int offset192002,
                                                            final int num_file_points,
                                                            final int dim,
                                                            final x10.array.Array<x10.core.Float> file_points,java.lang.Class<?> $dummy0){return new $Closure$141(num_slice_points_stride192010,num_slice_points,offset192002,num_file_points,dim,file_points,(java.lang.Class<?>) null);}
                public $Closure$141(final int num_slice_points_stride192010,
                                    final int num_slice_points,
                                    final int offset192002,
                                    final int num_file_points,
                                    final int dim,
                                    final x10.array.Array<x10.core.Float> file_points,java.lang.Class<?> $dummy0) { {
                                                                                                                           this.num_slice_points_stride192010 = num_slice_points_stride192010;
                                                                                                                           this.num_slice_points = num_slice_points;
                                                                                                                           this.offset192002 = offset192002;
                                                                                                                           this.num_file_points = num_file_points;
                                                                                                                           this.dim = dim;
                                                                                                                           this.file_points = ((x10.array.Array)(file_points));
                                                                                                                       }}
                
            }
            
        public static class $Closure$142 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$142.class);
            
            public static final x10.rtt.RuntimeType<$Closure$142> $RTT = new x10.rtt.StaticFunType<$Closure$142>(
            /* base class */$Closure$142.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$142 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$142.class + " calling"); } 
                x10.array.Array file_points = (x10.array.Array) $deserializer.readRef();
                $_obj.file_points = file_points;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$142 $_obj = new $Closure$142((java.lang.System[]) null);
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
            public $Closure$142(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
            }
            
                
                public float
                  $apply$O(
                  final int i192027){
                    
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float t192028 =
                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                file_points).$apply$G((int)(i192027)));
                    
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
return t192028;
                }
                
                public x10.array.Array<x10.core.Float> file_points;
                
                // creation method for java code
                public static KMeansSPMD.$Closure$142 $make(final x10.array.Array<x10.core.Float> file_points,java.lang.Class<?> $dummy0){return new $Closure$142(file_points,(java.lang.Class<?>) null);}
                public $Closure$142(final x10.array.Array<x10.core.Float> file_points,java.lang.Class<?> $dummy0) { {
                                                                                                                           this.file_points = ((x10.array.Array)(file_points));
                                                                                                                       }}
                
            }
            
        public static class $Closure$143 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$143.class);
            
            public static final x10.rtt.RuntimeType<$Closure$143> $RTT = new x10.rtt.StaticVoidFunType<$Closure$143>(
            /* base class */$Closure$143.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$143 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$143.class + " calling"); } 
                $_obj.num_slices = $deserializer.readInt();
                $_obj.slice192055 = $deserializer.readInt();
                $_obj.num_slice_points = $deserializer.readInt();
                $_obj.quiet = $deserializer.readBoolean();
                x10.lang.Place h191994 = (x10.lang.Place) $deserializer.readRef();
                $_obj.h191994 = h191994;
                $_obj.num_file_points = $deserializer.readInt();
                $_obj.dim = $deserializer.readInt();
                x10.array.Array file_points = (x10.array.Array) $deserializer.readRef();
                $_obj.file_points = file_points;
                $_obj.num_clusters = $deserializer.readInt();
                x10.util.Team team = (x10.util.Team) $deserializer.readRef();
                $_obj.team = team;
                $_obj.iterations = $deserializer.readInt();
                $_obj.verbose = $deserializer.readBoolean();
                $_obj.num_global_points = $deserializer.readInt();
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$143 $_obj = new $Closure$143((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                $serializer.write(this.num_slices);
                $serializer.write(this.slice192055);
                $serializer.write(this.num_slice_points);
                $serializer.write(this.quiet);
                if (h191994 instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.h191994);
                } else {
                $serializer.write(this.h191994);
                }
                $serializer.write(this.num_file_points);
                $serializer.write(this.dim);
                if (file_points instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.file_points);
                } else {
                $serializer.write(this.file_points);
                }
                $serializer.write(this.num_clusters);
                if (team instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.team);
                } else {
                $serializer.write(this.team);
                }
                $serializer.write(this.iterations);
                $serializer.write(this.verbose);
                $serializer.write(this.num_global_points);
                
            }
            
            // constructor just for allocation
            public $Closure$143(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 96 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191995 =
                      x10.lang.Runtime.home().
                        id;
                    
//#line 96 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191996 =
                      ((t191995) * (((int)(this.
                                             num_slices))));
                    
//#line 96 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int role191997 =
                      ((t191996) + (((int)(this.
                                             slice192055))));
                    
//#line 99 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191998 =
                      x10.lang.Runtime.home().
                        id;
                    
//#line 99 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191999 =
                      ((t191998) * (((int)(this.
                                             num_slices))));
                    
//#line 99 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t192000 =
                      ((t191999) * (((int)(this.
                                             num_slice_points))));
                    
//#line 99 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t192001 =
                      ((this.
                          slice192055) * (((int)(this.
                                                   num_slice_points))));
                    
//#line 99 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int offset192002 =
                      ((t192000) + (((int)(t192001))));
                    
//#line 100 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t192003 =
                      !(this.
                          quiet);
                    
//#line 100 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (t192003) {
                        
//#line 101 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.io.Printer t192004 =
                          ((x10.io.Printer)(x10.io.Console.OUT));
                        
//#line 101 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t192005 =
                          this.
                            h191994.toString();
                        
//#line 101 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t192006 =
                          ((t192005) + (" gets "));
                        
//#line 101 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t192007 =
                          ((t192006) + ((x10.core.Int.$box(offset192002))));
                        
//#line 101 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t192008 =
                          ((t192007) + (" len "));
                        
//#line 101 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t192009 =
                          ((t192008) + ((x10.core.Int.$box(this.
                                                             num_slice_points))));
                        
//#line 101 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
t192004.println(((java.lang.String)(t192009)));
                    }
                    
//#line 102 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int num_slice_points_stride192010 =
                      this.
                        num_slice_points;
                    
//#line 103 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> init192011 =
                      ((x10.core.fun.Fun_0_1)(new KMeansSPMD.$Closure$141(num_slice_points_stride192010,
                                                                          ((int)(this.
                                                                                   num_slice_points)),
                                                                          offset192002,
                                                                          ((int)(this.
                                                                                   num_file_points)),
                                                                          ((int)(this.
                                                                                   dim)),
                                                                          ((x10.array.Array)(this.
                                                                                               file_points)),(java.lang.Class<?>) null)));
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t192022 =
                      ((num_slice_points_stride192010) * (((int)(this.
                                                                   dim))));
                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.array.Array<x10.core.Float> host_points192023 =
                      ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(t192022,
                                                                                                                                   ((x10.core.fun.Fun_0_1)(init192011)),(java.lang.Class<?>[][][][]) null)));
                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.array.Array<x10.core.Float> host_nearest192024 =
                      ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(this.
                                                                                                                                     num_slice_points)));
                    
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t192025 =
                      ((this.
                          num_clusters) * (((int)(this.
                                                    dim))));
                    
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t192026 =
                      ((x10.core.fun.Fun_0_1)(new KMeansSPMD.$Closure$142(((x10.array.Array)(this.
                                                                                               file_points)),(java.lang.Class<?>) null)));
                    
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.array.Array<x10.core.Float> host_clusters192029 =
                      ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(t192025,
                                                                                                                                   ((x10.core.fun.Fun_0_1)(t192026)),(java.lang.Class<?>[][][][]) null)));
                    
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.array.Array<x10.core.Int> host_cluster_counts192030 =
                      ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(this.
                                                                                                                                 num_clusters)));
                    
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long start_time192031 =
                      x10.lang.System.currentTimeMillis$O();
                    
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
long compute_time192032 =
                      ((long)(((int)(0))));
                    
//#line 119 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
long comm_time192033 =
                      ((long)(((int)(0))));
                    
//#line 120 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
long barrier_time192034 =
                      ((long)(((int)(0))));
                    
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
this.
                                                                                                                             team.barrier((int)(role191997));
                    
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
int iter191963 =
                      0;
                    
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
for (;
                                                                                                                                true;
                                                                                                                                ) {
                        
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191964 =
                          iter191963;
                        
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191965 =
                          ((t191964) < (((int)(this.
                                                 iterations))));
                        
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (!(t191965)) {
                            
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
break;
                        }
                        
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
L191966: {
//#line 128 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191967 =
                          ((x10.array.Array<x10.core.Float>)host_clusters192029).
                            size;
//#line 128 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.array.Array<x10.core.Float> old_clusters191968 =
                          ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((int)(t191967)))));
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191969 =
                          ((x10.array.Array<x10.core.Float>)host_clusters192029).
                            size;
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
x10.array.Array.<x10.core.Float>copy__0$1x10$array$Array$$T$2__2$1x10$array$Array$$T$2(x10.rtt.Types.FLOAT, ((x10.array.Array)(host_clusters192029)),
                                                                                                                                                                                                                               (int)(0),
                                                                                                                                                                                                                               ((x10.array.Array)(old_clusters191968)),
                                                                                                                                                                                                                               (int)(0),
                                                                                                                                                                                                                               (int)(t191969));
//#line 131 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float t191970 =
                          ((float)(int)(((int)(0))));
//#line 131 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
((x10.array.Array<x10.core.Float>)host_clusters192029).fill__0x10$array$Array$$T(x10.core.Float.$box(t191970));
//#line 132 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
((x10.array.Array<x10.core.Int>)host_cluster_counts192030).fill__0x10$array$Array$$T(x10.core.Int.$box(0));
//#line 134 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long compute_start191971 =
                          x10.lang.System.nanoTime$O();
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
int p191924 =
                          0;
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
for (;
                                                                                                                                        true;
                                                                                                                                        ) {
                            
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191925 =
                              p191924;
                            
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191926 =
                              ((t191925) < (((int)(this.
                                                     num_slice_points))));
                            
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (!(t191926)) {
                                
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
break;
                            }
                            
//#line 136 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
int closest191897 =
                              -1;
                            
//#line 137 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
float closest_dist191898 =
                              java.lang.Float.MAX_VALUE;
                            
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
int k191889 =
                              0;
                            
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
for (;
                                                                                                                                        true;
                                                                                                                                        ) {
                                
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191890 =
                                  k191889;
                                
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191891 =
                                  ((t191890) < (((int)(this.
                                                         num_clusters))));
                                
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (!(t191891)) {
                                    
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
break;
                                }
                                
//#line 139 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
float dist191866 =
                                  ((float)(int)(((int)(0))));
                                
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
int d191863 =
                                  0;
                                
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
for (;
                                                                                                                                            true;
                                                                                                                                            ) {
                                    
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191864 =
                                      d191863;
                                    
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191865 =
                                      ((t191864) < (((int)(this.
                                                             dim))));
                                    
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (!(t191865)) {
                                        
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
break;
                                    }
                                    
//#line 141 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191847 =
                                      p191924;
                                    
//#line 141 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191848 =
                                      d191863;
                                    
//#line 141 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191849 =
                                      ((t191848) * (((int)(num_slice_points_stride192010))));
                                    
//#line 141 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191850 =
                                      ((t191847) + (((int)(t191849))));
                                    
//#line 141 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float t191851 =
                                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)host_points192023).$apply$G((int)(t191850)));
                                    
//#line 141 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191852 =
                                      k191889;
                                    
//#line 141 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191853 =
                                      ((t191852) * (((int)(this.
                                                             dim))));
                                    
//#line 141 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191854 =
                                      d191863;
                                    
//#line 141 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191855 =
                                      ((t191853) + (((int)(t191854))));
                                    
//#line 141 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float t191856 =
                                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)old_clusters191968).$apply$G((int)(t191855)));
                                    
//#line 141 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float tmp191857 =
                                      ((t191851) - (((float)(t191856))));
                                    
//#line 142 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float t191858 =
                                      dist191866;
                                    
//#line 142 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float t191859 =
                                      ((tmp191857) * (((float)(tmp191857))));
                                    
//#line 142 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float t191860 =
                                      ((t191858) + (((float)(t191859))));
                                    
//#line 142 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
dist191866 = t191860;
                                    
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191861 =
                                      d191863;
                                    
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191862 =
                                      ((t191861) + (((int)(1))));
                                    
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
d191863 = t191862;
                                }
                                
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float t191867 =
                                  dist191866;
                                
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float t191868 =
                                  closest_dist191898;
                                
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191869 =
                                  ((t191867) < (((float)(t191868))));
                                
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (t191869) {
                                    
//#line 145 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float t191870 =
                                      dist191866;
                                    
//#line 145 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
closest_dist191898 = t191870;
                                    
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191871 =
                                      k191889;
                                    
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
closest191897 = t191871;
                                }
                                
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191872 =
                                  k191889;
                                
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191873 =
                                  ((t191872) + (((int)(1))));
                                
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
k191889 = t191873;
                            }
                            
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
int d191892 =
                              0;
                            
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
for (;
                                                                                                                                        true;
                                                                                                                                        ) {
                                
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191893 =
                                  d191892;
                                
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191894 =
                                  ((t191893) < (((int)(this.
                                                         dim))));
                                
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (!(t191894)) {
                                    
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
break;
                                }
                                
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.array.Array<x10.core.Float> x191876 =
                                  ((x10.array.Array)(host_clusters192029));
                                
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191877 =
                                  closest191897;
                                
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191878 =
                                  ((t191877) * (((int)(this.
                                                         dim))));
                                
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191879 =
                                  d191892;
                                
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int y191880 =
                                  ((t191878) + (((int)(t191879))));
                                
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191881 =
                                  p191924;
                                
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191882 =
                                  d191892;
                                
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191883 =
                                  ((t191882) * (((int)(num_slice_points_stride192010))));
                                
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191884 =
                                  ((t191881) + (((int)(t191883))));
                                
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float z191885 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)host_points192023).$apply$G((int)(t191884)));
                                
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
float ret191886 =
                                   0;
                                
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float t191874 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)x191876).$apply$G((int)(y191880)));
                                
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float r191875 =
                                  ((t191874) + (((float)(z191885))));
                                
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
((x10.array.Array<x10.core.Float>)x191876).$set__1x10$array$Array$$T$G((int)(y191880),
                                                                                                                                                                                                              x10.core.Float.$box(r191875));
                                
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
ret191886 = r191875;
                                
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191887 =
                                  d191892;
                                
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191888 =
                                  ((t191887) + (((int)(1))));
                                
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
d191892 = t191888;
                            }
                            
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.array.Array<x10.core.Int> x191899 =
                              ((x10.array.Array)(host_cluster_counts192030));
                            
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int y191900 =
                              closest191897;
                            
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
;
                            
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
int ret191901 =
                               0;
                            
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191895 =
                              x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x191899).$apply$G((int)(y191900)));
                            
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int r191896 =
                              ((t191895) + (((int)(1))));
                            
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
((x10.array.Array<x10.core.Int>)x191899).$set__1x10$array$Array$$T$G((int)(y191900),
                                                                                                                                                                                                        x10.core.Int.$box(r191896));
                            
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
ret191901 = r191896;
                            
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191902 =
                              p191924;
                            
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191903 =
                              ((t191902) + (((int)(1))));
                            
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
p191924 = t191903;
                        }
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long t191972 =
                          compute_time192032;
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long t191973 =
                          x10.lang.System.nanoTime$O();
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long t191974 =
                          ((t191973) - (((long)(compute_start191971))));
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long t191975 =
                          ((t191972) + (((long)(t191974))));
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
compute_time192032 = t191975;
//#line 156 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long comm_start191976 =
                          x10.lang.System.nanoTime$O();
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191977 =
                          ((x10.array.Array<x10.core.Float>)host_clusters192029).
                            size;
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191978 =
                          x10.util.Team.ADD;
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
((x10.util.Team)this.
                                                                                                                                                                     team).<x10.core.Float>allreduce__1$1x10$util$Team$$T$2__3$1x10$util$Team$$T$2(x10.rtt.Types.FLOAT, (int)(role191997),
                                                                                                                                                                                                                                                   ((x10.array.Array)(host_clusters192029)),
                                                                                                                                                                                                                                                   (int)(0),
                                                                                                                                                                                                                                                   ((x10.array.Array)(host_clusters192029)),
                                                                                                                                                                                                                                                   (int)(0),
                                                                                                                                                                                                                                                   (int)(t191977),
                                                                                                                                                                                                                                                   (int)(t191978));
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191979 =
                          ((x10.array.Array<x10.core.Int>)host_cluster_counts192030).
                            size;
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191980 =
                          x10.util.Team.ADD;
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
((x10.util.Team)this.
                                                                                                                                                                     team).<x10.core.Int>allreduce__1$1x10$util$Team$$T$2__3$1x10$util$Team$$T$2(x10.rtt.Types.INT, (int)(role191997),
                                                                                                                                                                                                                                                 ((x10.array.Array)(host_cluster_counts192030)),
                                                                                                                                                                                                                                                 (int)(0),
                                                                                                                                                                                                                                                 ((x10.array.Array)(host_cluster_counts192030)),
                                                                                                                                                                                                                                                 (int)(0),
                                                                                                                                                                                                                                                 (int)(t191979),
                                                                                                                                                                                                                                                 (int)(t191980));
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long t191981 =
                          comm_time192033;
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long t191982 =
                          x10.lang.System.nanoTime$O();
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long t191983 =
                          ((t191982) - (((long)(comm_start191976))));
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long t191984 =
                          ((t191981) + (((long)(t191983))));
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
comm_time192033 = t191984;
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
int k191927 =
                          0;
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
for (;
                                                                                                                                        true;
                                                                                                                                        ) {
                            
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191928 =
                              k191927;
                            
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191929 =
                              ((t191928) < (((int)(this.
                                                     num_clusters))));
                            
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (!(t191929)) {
                                
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
break;
                            }
                            
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
int d191917 =
                              0;
                            
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
for (;
                                                                                                                                        true;
                                                                                                                                        ) {
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191918 =
                                  d191917;
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191919 =
                                  ((t191918) < (((int)(this.
                                                         dim))));
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (!(t191919)) {
                                    
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
break;
                                }
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.array.Array<x10.core.Float> x191906 =
                                  ((x10.array.Array)(host_clusters192029));
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191907 =
                                  k191927;
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191908 =
                                  ((t191907) * (((int)(this.
                                                         dim))));
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191909 =
                                  d191917;
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int y191910 =
                                  ((t191908) + (((int)(t191909))));
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191911 =
                                  k191927;
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191912 =
                                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)host_cluster_counts192030).$apply$G((int)(t191911)));
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float z191913 =
                                  ((float)(int)(((int)(t191912))));
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
float ret191914 =
                                   0;
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float t191904 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)x191906).$apply$G((int)(y191910)));
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final float r191905 =
                                  ((t191904) / (((float)(z191913))));
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
((x10.array.Array<x10.core.Float>)x191906).$set__1x10$array$Array$$T$G((int)(y191910),
                                                                                                                                                                                                              x10.core.Float.$box(r191905));
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
ret191914 = r191905;
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191915 =
                                  d191917;
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191916 =
                                  ((t191915) + (((int)(1))));
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
d191917 = t191916;
                            }
                            
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191920 =
                              k191927;
                            
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191921 =
                              ((t191920) + (((int)(1))));
                            
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
k191927 = t191921;
                        }
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
boolean t191985 =
                          ((int) offset192002) ==
                        ((int) 0);
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (t191985) {
                            
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
t191985 = this.
                                                                                                                                               verbose;
                        }
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191986 =
                          t191985;
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (t191986) {
                            
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.io.Printer t191987 =
                              ((x10.io.Printer)(x10.io.Console.OUT));
                            
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191988 =
                              iter191963;
                            
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t191989 =
                              (("Iteration: ") + ((x10.core.Int.$box(t191988))));
                            
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
t191987.println(((java.lang.String)(t191989)));
                            
//#line 167 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
KMeansSPMD.printClusters__0$1x10$lang$Float$2(((x10.array.Array)(host_clusters192029)),
                                                                                                                                                                                 (int)(this.
                                                                                                                                                                                         dim));
                        }
//#line 171 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
int j191930 =
                          0;
//#line 171 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
for (;
                                                                                                                                        true;
                                                                                                                                        ) {
                            
//#line 171 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191931 =
                              j191930;
                            
//#line 171 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191932 =
                              ((this.
                                  num_clusters) * (((int)(this.
                                                            dim))));
                            
//#line 171 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191933 =
                              ((t191931) < (((int)(t191932))));
                            
//#line 171 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (!(t191933)) {
                                
//#line 171 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
break;
                            }
                            
//#line 172 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (true) {
                                
//#line 172 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
break L191966;
                            }
                            
//#line 171 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191922 =
                              j191930;
                            
//#line 171 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191923 =
                              ((t191922) + (((int)(1))));
                            
//#line 171 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
j191930 = t191923;
                        }
//#line 175 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
break;}
                        
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191934 =
                          iter191963;
                        
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191935 =
                          ((t191934) + (((int)(1))));
                        
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
iter191963 = t191935;
                    }
                    
//#line 179 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t192038 =
                      ((int) offset192002) ==
                    ((int) 0);
                    
//#line 179 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (t192038) {
                        
//#line 180 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long stop_time192039 =
                          x10.lang.System.currentTimeMillis$O();
                        
//#line 181 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t192040 =
                          !(this.
                              quiet);
                        
//#line 181 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (t192040) {
                            
//#line 181 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.io.Printer t192041 =
                              ((x10.io.Printer)(x10.io.Console.OUT));
                            
//#line 181 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t192042 =
                              java.lang.Integer.toString(this.
                                                           num_global_points);
                            
//#line 181 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t192043 =
                              ((t192042) + (" "));
                            
//#line 181 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t192044 =
                              ((t192043) + ((x10.core.Int.$box(this.
                                                                 num_clusters))));
                            
//#line 181 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t192045 =
                              ((t192044) + (" "));
                            
//#line 181 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t192046 =
                              ((t192045) + ((x10.core.Int.$box(this.
                                                                 dim))));
                            
//#line 181 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t192047 =
                              ((t192046) + (" "));
                            
//#line 181 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
t192041.print(((java.lang.String)(t192047)));
                        }
                        
//#line 182 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.io.Printer t192048 =
                          ((x10.io.Printer)(x10.io.Console.OUT));
                        
//#line 182 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long t192049 =
                          ((stop_time192039) - (((long)(start_time192031))));
                        
//#line 182 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final double t192050 =
                          ((double)(long)(((long)(t192049))));
                        
//#line 182 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final double t192051 =
                          ((t192050) / (((double)(1000.0))));
                        
//#line 182 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
t192048.println(x10.core.Double.$box(t192051));
                    }
                    
//#line 184 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
int i191990 =
                      0;
                    
//#line 184 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
for (;
                                                                                                                                true;
                                                                                                                                ) {
                        
//#line 184 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191991 =
                          i191990;
                        
//#line 184 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191992 =
                          this.
                            team.size$O();
                        
//#line 184 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191993 =
                          ((t191991) < (((int)(t191992))));
                        
//#line 184 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (!(t191993)) {
                            
//#line 184 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
break;
                        }
                        
//#line 185 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191936 =
                          i191990;
                        
//#line 185 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191937 =
                          ((int) role191997) ==
                        ((int) t191936);
                        
//#line 185 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (t191937) {
                            
//#line 186 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.io.Printer t191938 =
                              ((x10.io.Printer)(x10.io.Console.OUT));
                            
//#line 186 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t191939 =
                              java.lang.Integer.toString(role191997);
                            
//#line 186 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t191940 =
                              ((t191939) + (": Computation time: "));
                            
//#line 186 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long t191941 =
                              compute_time192032;
                            
//#line 186 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final double t191942 =
                              ((double)(long)(((long)(t191941))));
                            
//#line 186 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final double t191943 =
                              ((t191942) / (((double)(1.0E9))));
                            
//#line 186 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t191944 =
                              ((t191940) + ((x10.core.Double.$box(t191943))));
                            
//#line 186 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
t191938.println(((java.lang.String)(t191944)));
                            
//#line 187 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.io.Printer t191945 =
                              ((x10.io.Printer)(x10.io.Console.OUT));
                            
//#line 187 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t191946 =
                              java.lang.Integer.toString(role191997);
                            
//#line 187 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t191947 =
                              ((t191946) + (": barrier time: "));
                            
//#line 187 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long t191948 =
                              barrier_time192034;
                            
//#line 187 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final double t191949 =
                              ((double)(long)(((long)(t191948))));
                            
//#line 187 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final double t191950 =
                              ((t191949) / (((double)(1.0E9))));
                            
//#line 187 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t191951 =
                              ((t191947) + ((x10.core.Double.$box(t191950))));
                            
//#line 187 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
t191945.println(((java.lang.String)(t191951)));
                            
//#line 188 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.io.Printer t191952 =
                              ((x10.io.Printer)(x10.io.Console.OUT));
                            
//#line 188 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t191953 =
                              java.lang.Integer.toString(role191997);
                            
//#line 188 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t191954 =
                              ((t191953) + (": Communication time: "));
                            
//#line 188 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final long t191955 =
                              comm_time192033;
                            
//#line 188 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final double t191956 =
                              ((double)(long)(((long)(t191955))));
                            
//#line 188 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final double t191957 =
                              ((t191956) / (((double)(1.0E9))));
                            
//#line 188 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final java.lang.String t191958 =
                              ((t191954) + ((x10.core.Double.$box(t191957))));
                            
//#line 188 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
t191952.println(((java.lang.String)(t191958)));
                        }
                        
//#line 190 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
this.
                                                                                                                                 team.barrier((int)(role191997));
                        
//#line 191 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final boolean t191959 =
                          ((int) role191997) ==
                        ((int) 0);
                        
//#line 191 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
if (t191959) {
                            
//#line 192 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final x10.io.Printer t191960 =
                              ((x10.io.Printer)(x10.io.Console.OUT));
                            
//#line 192 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
t191960.println(((java.lang.String)("\nFinal results:")));
                            
//#line 193 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
KMeansSPMD.printClusters__0$1x10$lang$Float$2(((x10.array.Array)(host_clusters192029)),
                                                                                                                                                                                 (int)(this.
                                                                                                                                                                                         dim));
                        }
                        
//#line 184 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191961 =
                          i191990;
                        
//#line 184 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
final int t191962 =
                          ((t191961) + (((int)(1))));
                        
//#line 184 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
i191990 = t191962;
                    }
                    
//#line 198 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-x10dist/KMeansSPMD.x10"
this.
                                                                                                                             team.del((int)(role191997));
                }
                
                public int num_slices;
                public int slice192055;
                public int num_slice_points;
                public boolean quiet;
                public x10.lang.Place h191994;
                public int num_file_points;
                public int dim;
                public x10.array.Array<x10.core.Float> file_points;
                public int num_clusters;
                public x10.util.Team team;
                public int iterations;
                public boolean verbose;
                public int num_global_points;
                
                // creation method for java code
                public static KMeansSPMD.$Closure$143 $make(final int num_slices,
                                                            final int slice192055,
                                                            final int num_slice_points,
                                                            final boolean quiet,
                                                            final x10.lang.Place h191994,
                                                            final int num_file_points,
                                                            final int dim,
                                                            final x10.array.Array<x10.core.Float> file_points,
                                                            final int num_clusters,
                                                            final x10.util.Team team,
                                                            final int iterations,
                                                            final boolean verbose,
                                                            final int num_global_points,java.lang.Class<?> $dummy0){return new $Closure$143(num_slices,slice192055,num_slice_points,quiet,h191994,num_file_points,dim,file_points,num_clusters,team,iterations,verbose,num_global_points,(java.lang.Class<?>) null);}
                public $Closure$143(final int num_slices,
                                    final int slice192055,
                                    final int num_slice_points,
                                    final boolean quiet,
                                    final x10.lang.Place h191994,
                                    final int num_file_points,
                                    final int dim,
                                    final x10.array.Array<x10.core.Float> file_points,
                                    final int num_clusters,
                                    final x10.util.Team team,
                                    final int iterations,
                                    final boolean verbose,
                                    final int num_global_points,java.lang.Class<?> $dummy0) { {
                                                                                                     this.num_slices = num_slices;
                                                                                                     this.slice192055 = slice192055;
                                                                                                     this.num_slice_points = num_slice_points;
                                                                                                     this.quiet = quiet;
                                                                                                     this.h191994 = ((x10.lang.Place)(h191994));
                                                                                                     this.num_file_points = num_file_points;
                                                                                                     this.dim = dim;
                                                                                                     this.file_points = ((x10.array.Array)(file_points));
                                                                                                     this.num_clusters = num_clusters;
                                                                                                     this.team = ((x10.util.Team)(team));
                                                                                                     this.iterations = iterations;
                                                                                                     this.verbose = verbose;
                                                                                                     this.num_global_points = num_global_points;
                                                                                                 }}
                
            }
            
        
        }
        