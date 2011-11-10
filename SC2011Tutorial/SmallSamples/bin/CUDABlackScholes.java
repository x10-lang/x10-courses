
public class CUDABlackScholes extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, CUDABlackScholes.class);
    
    public static final x10.rtt.RuntimeType<CUDABlackScholes> $RTT = new x10.rtt.NamedType<CUDABlackScholes>(
    "CUDABlackScholes", /* base class */CUDABlackScholes.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(CUDABlackScholes $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + CUDABlackScholes.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        CUDABlackScholes $_obj = new CUDABlackScholes((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public CUDABlackScholes(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
public static void
                                                                                                                   doBlackScholes__1$1x10$lang$Float$2__2$1x10$lang$Float$2__3$1x10$lang$Float$2__4$1x10$lang$Float$2__5$1x10$lang$Float$2(
                                                                                                                   final x10.lang.Place p,
                                                                                                                   final x10.array.RemoteArray<x10.core.Float> optionYears,
                                                                                                                   final x10.array.RemoteArray<x10.core.Float> stockPrice,
                                                                                                                   final x10.array.RemoteArray<x10.core.Float> optionStrike,
                                                                                                                   final x10.array.RemoteArray<x10.core.Float> callResult,
                                                                                                                   final x10.array.RemoteArray<x10.core.Float> putResult,
                                                                                                                   final int opt_N,
                                                                                                                   final float R,
                                                                                                                   final float V){
            
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t174595 =
              p.isCUDA$O();
            
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
int t174596 =
               0;
            
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t174595) {
                
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174596 = 480;
            } else {
                
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174596 = 1;
            }
            
//#line 38 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int blocks =
              t174596;
            
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int threads =
              128;
            {
                
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.lang.Runtime.ensureNotInAtomic();
                
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.lang.FinishState x10$__var106 =
                  x10.lang.Runtime.startFinish();
                
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
try {try {{
                    {
                        
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.lang.Runtime.runAsync(((x10.lang.Place)(p)),
                                                                                                                                                           ((x10.core.fun.VoidFun_0_0)(new CUDABlackScholes.$Closure$126(blocks,
                                                                                                                                                                                                                         threads,
                                                                                                                                                                                                                         opt_N,
                                                                                                                                                                                                                         optionYears,
                                                                                                                                                                                                                         stockPrice,
                                                                                                                                                                                                                         optionStrike,
                                                                                                                                                                                                                         V,
                                                                                                                                                                                                                         R,
                                                                                                                                                                                                                         callResult,
                                                                                                                                                                                                                         putResult,(java.lang.Class<?>) null))));
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__80__) {
                    
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__80__)));
                    
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
throw new x10.lang.RuntimeException();
                }finally {{
                     
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var106)));
                 }}
                }
            }
        
        
//#line 83 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        CUDABlackScholes.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> id$148370) {
            
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int OPT_N =
              4000000;
            
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float RISKFREE =
              0.02F;
            
//#line 88 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float VOLATILITY =
              0.3F;
            
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.Array<x10.lang.Place> t174685 =
              ((x10.array.Array)(x10.lang.Runtime.home().children()));
            
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174686 =
              ((x10.array.Array<x10.lang.Place>)t174685).
                size;
            
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t174693 =
              ((int) t174686) ==
            ((int) 0);
            
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t174693) {
                
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.io.Printer t174687 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174687.println(((java.lang.String)("Set X10RT_ACCELS=ALL to enable your GPUs if you have them.")));
                
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.io.Printer t174688 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174688.println(((java.lang.String)("Will run the test on the CPU.")));
            } else {
                
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.io.Printer t174690 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.lang.Place t174689 =
                  ((x10.lang.Place)(x10.lang.Runtime.home().child((int)(0))));
                
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final java.lang.String t174691 =
                  (("Using the GPU at place ") + (t174689));
                
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174690.println(((java.lang.String)(t174691)));
                
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.io.Printer t174692 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 95 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174692.println(((java.lang.String)("This program only supports a single GPU.")));
            }
            
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.Array<x10.lang.Place> t174694 =
              ((x10.array.Array)(x10.lang.Runtime.home().children()));
            
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174695 =
              ((x10.array.Array<x10.lang.Place>)t174694).
                size;
            
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t174696 =
              ((int) t174695) ==
            ((int) 0);
            
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.lang.Place t174697 =
               null;
            
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t174696) {
                
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174697 = x10.lang.Runtime.home();
            } else {
                
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174697 = x10.lang.Runtime.home().child((int)(0));
            }
            
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.lang.Place gpu =
              t174697;
            
//#line 99 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t174698 =
              x10.rtt.Equality.equalsequals((gpu),(x10.lang.Runtime.home()));
            
//#line 99 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
int t174699 =
               0;
            
//#line 99 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t174698) {
                
//#line 99 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174699 = 32;
            } else {
                
//#line 99 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174699 = 512;
            }
            
//#line 99 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int NUM_ITERATIONS =
              t174699;
            
//#line 100 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.lang.Place cpu =
              ((x10.lang.Place)(x10.lang.Runtime.home()));
            
//#line 101 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.util.Random rand =
              ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).$init()));
            
//#line 104 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t174701 =
              ((x10.core.fun.Fun_0_1)(new CUDABlackScholes.$Closure$127()));
            
//#line 104 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.Array<x10.core.Float> h_CallResultCPU =
              ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((int)(OPT_N)),
                                                                                                                           ((x10.core.fun.Fun_0_1)(t174701)),(java.lang.Class<?>[][][][]) null)));
            
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t174704 =
              ((x10.core.fun.Fun_0_1)(new CUDABlackScholes.$Closure$128()));
            
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.Array<x10.core.Float> h_PutResultCPU =
              ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((int)(OPT_N)),
                                                                                                                           ((x10.core.fun.Fun_0_1)(t174704)),(java.lang.Class<?>[][][][]) null)));
            
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t174706 =
              ((x10.core.fun.Fun_0_1)(new CUDABlackScholes.$Closure$129()));
            
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.Array<x10.core.Float> h_CallResultGPU =
              ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((int)(OPT_N)),
                                                                                                                           ((x10.core.fun.Fun_0_1)(t174706)),(java.lang.Class<?>[][][][]) null)));
            
//#line 107 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t174708 =
              ((x10.core.fun.Fun_0_1)(new CUDABlackScholes.$Closure$130()));
            
//#line 107 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.Array<x10.core.Float> h_PutResultGPU =
              ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((int)(OPT_N)),
                                                                                                                           ((x10.core.fun.Fun_0_1)(t174708)),(java.lang.Class<?>[][][][]) null)));
            
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t174711 =
              ((x10.core.fun.Fun_0_1)(new CUDABlackScholes.$Closure$131(rand)));
            
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.Array<x10.core.Float> h_StockPrice =
              ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((int)(OPT_N)),
                                                                                                                           ((x10.core.fun.Fun_0_1)(t174711)),(java.lang.Class<?>[][][][]) null)));
            
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t174714 =
              ((x10.core.fun.Fun_0_1)(new CUDABlackScholes.$Closure$132(rand)));
            
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.Array<x10.core.Float> h_OptionStrike =
              ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((int)(OPT_N)),
                                                                                                                           ((x10.core.fun.Fun_0_1)(t174714)),(java.lang.Class<?>[][][][]) null)));
            
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t174717 =
              ((x10.core.fun.Fun_0_1)(new CUDABlackScholes.$Closure$133(rand)));
            
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.Array<x10.core.Float> h_OptionYears =
              ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((int)(OPT_N)),
                                                                                                                           ((x10.core.fun.Fun_0_1)(t174717)),(java.lang.Class<?>[][][][]) null)));
            
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t174719 =
              ((x10.core.fun.Fun_0_1)(new CUDABlackScholes.$Closure$134()));
            
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> d_CallResult =
              ((x10.array.RemoteArray)(x10.util.CUDAUtilities.<x10.core.Float>makeRemoteArray__2$1x10$lang$Int$3x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.lang.Place)(gpu)),
                                                                                                                                            (int)(OPT_N),
                                                                                                                                            ((x10.core.fun.Fun_0_1)(t174719)))));
            
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t174721 =
              ((x10.core.fun.Fun_0_1)(new CUDABlackScholes.$Closure$135()));
            
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> d_PutResult =
              ((x10.array.RemoteArray)(x10.util.CUDAUtilities.<x10.core.Float>makeRemoteArray__2$1x10$lang$Int$3x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.lang.Place)(gpu)),
                                                                                                                                            (int)(OPT_N),
                                                                                                                                            ((x10.core.fun.Fun_0_1)(t174721)))));
            
//#line 115 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> d_StockPrice =
              ((x10.array.RemoteArray)(x10.util.CUDAUtilities.<x10.core.Float>makeRemoteArray__2$1x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.lang.Place)(gpu)),
                                                                                                                              (int)(OPT_N),
                                                                                                                              ((x10.array.Array)(h_StockPrice)))));
            
//#line 116 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> d_OptionStrike =
              ((x10.array.RemoteArray)(x10.util.CUDAUtilities.<x10.core.Float>makeRemoteArray__2$1x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.lang.Place)(gpu)),
                                                                                                                              (int)(OPT_N),
                                                                                                                              ((x10.array.Array)(h_OptionStrike)))));
            
//#line 117 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> d_OptionYears =
              ((x10.array.RemoteArray)(x10.util.CUDAUtilities.<x10.core.Float>makeRemoteArray__2$1x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.lang.Place)(gpu)),
                                                                                                                              (int)(OPT_N),
                                                                                                                              ((x10.array.Array)(h_OptionYears)))));
            
//#line 119 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.io.Printer t174724 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 119 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final java.lang.String t174722 =
              (("Running ") + ((x10.core.Int.$box(NUM_ITERATIONS))));
            
//#line 119 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final java.lang.String t174723 =
              ((t174722) + (" times on place "));
            
//#line 119 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final java.lang.String t174725 =
              ((t174723) + (gpu));
            
//#line 119 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174724.println(((java.lang.String)(t174725)));
            
//#line 120 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final long gpuTimeStart =
              x10.lang.System.nanoTime$O();
            
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
int i174975 =
              0;
            
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174976 =
                  i174975;
                
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t174977 =
                  ((t174976) < (((int)(NUM_ITERATIONS))));
                
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (!(t174977)) {
                    
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
break;
                }
                
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
CUDABlackScholes.doBlackScholes__1$1x10$lang$Float$2__2$1x10$lang$Float$2__3$1x10$lang$Float$2__4$1x10$lang$Float$2__5$1x10$lang$Float$2(((x10.lang.Place)(gpu)),
                                                                                                                                                                                                                                                                   ((x10.array.RemoteArray)(d_OptionYears)),
                                                                                                                                                                                                                                                                   ((x10.array.RemoteArray)(d_StockPrice)),
                                                                                                                                                                                                                                                                   ((x10.array.RemoteArray)(d_OptionStrike)),
                                                                                                                                                                                                                                                                   ((x10.array.RemoteArray)(d_CallResult)),
                                                                                                                                                                                                                                                                   ((x10.array.RemoteArray)(d_PutResult)),
                                                                                                                                                                                                                                                                   (int)(OPT_N),
                                                                                                                                                                                                                                                                   (float)(RISKFREE),
                                                                                                                                                                                                                                                                   (float)(VOLATILITY));
                
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174958 =
                  i174975;
                
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174959 =
                  ((t174958) + (((int)(1))));
                
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
i174975 = t174959;
            }
            
//#line 132 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final long t174731 =
              x10.lang.System.nanoTime$O();
            
//#line 132 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final long t174732 =
              ((t174731) - (((long)(gpuTimeStart))));
            
//#line 132 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
float gpuTime =
              ((float)(long)(((long)(t174732))));
            
//#line 133 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174733 =
              gpuTime;
            
//#line 133 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174734 =
              ((float)(int)(((int)(NUM_ITERATIONS))));
            
//#line 133 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174735 =
              ((t174733) / (((float)(t174734))));
            
//#line 133 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
gpuTime = t174735;
            
//#line 134 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.io.Printer t174737 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 134 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174736 =
              8000000;
            
//#line 134 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final java.lang.String t174738 =
              "Options count             : 8000000";
            
//#line 134 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174737.println(((java.lang.String)(t174738)));
            
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.io.Printer t174742 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174739 =
              gpuTime;
            
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174740 =
              ((t174739) / (((float)(1.0E-6F))));
            
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final java.lang.String t174741 =
              (("BlackScholesGPU() time    : ") + ((x10.core.Float.$box(t174740))));
            
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final java.lang.String t174743 =
              ((t174741) + (" msec"));
            
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174742.println(((java.lang.String)(t174743)));
            
//#line 136 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.io.Printer t174752 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 136 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174744 =
              20000000;
            
//#line 136 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174745 =
              80000000;
            
//#line 136 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174746 =
              ((float)(int)(((int)(t174745))));
            
//#line 136 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174748 =
              ((t174746) * (((float)(1.0E-9F))));
            
//#line 136 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174747 =
              gpuTime;
            
//#line 136 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174749 =
              ((t174747) * (((float)(1.0E-9F))));
            
//#line 136 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174750 =
              ((t174748) / (((float)(t174749))));
            
//#line 136 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final java.lang.String t174751 =
              (("Effective memory bandwidth: ") + ((x10.core.Float.$box(t174750))));
            
//#line 136 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final java.lang.String t174753 =
              ((t174751) + (" GB/s"));
            
//#line 136 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174752.println(((java.lang.String)(t174753)));
            
//#line 137 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.io.Printer t174760 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 137 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174754 =
              8000000;
            
//#line 137 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174755 =
              ((float)(int)(((int)(t174754))));
            
//#line 137 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174757 =
              ((t174755) * (((float)(1.0E-9F))));
            
//#line 137 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174756 =
              gpuTime;
            
//#line 137 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174758 =
              ((t174756) * (((float)(1.0E-9F))));
            
//#line 137 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174759 =
              ((t174757) / (((float)(t174758))));
            
//#line 137 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final java.lang.String t174761 =
              (("Gigaoptions per second    : ") + ((x10.core.Float.$box(t174759))));
            
//#line 137 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174760.println(((java.lang.String)(t174761)));
            {
                
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.lang.Runtime.ensureNotInAtomic();
                
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.lang.FinishState x10$__var107 =
                  x10.lang.Runtime.startFinish();
                
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
try {try {{
                    {
                        
//#line 141 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.array.Array.<x10.core.Float>asyncCopy__0$1x10$array$Array$$T$2__2$1x10$array$Array$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(d_CallResult)),
                                                                                                                                                                                                                              (int)(0),
                                                                                                                                                                                                                              ((x10.array.Array)(h_CallResultGPU)),
                                                                                                                                                                                                                              (int)(0),
                                                                                                                                                                                                                              (int)(OPT_N));
                        
//#line 142 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.array.Array.<x10.core.Float>asyncCopy__0$1x10$array$Array$$T$2__2$1x10$array$Array$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(d_PutResult)),
                                                                                                                                                                                                                              (int)(0),
                                                                                                                                                                                                                              ((x10.array.Array)(h_PutResultGPU)),
                                                                                                                                                                                                                              (int)(0),
                                                                                                                                                                                                                              (int)(OPT_N));
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__81__) {
                    
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__81__)));
                    
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
throw new x10.lang.RuntimeException();
                }finally {{
                     
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var107)));
                 }}
                }
            
//#line 145 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.util.CUDAUtilities.<x10.core.Float>deleteRemoteArray__0$1x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(d_CallResult)));
            
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.util.CUDAUtilities.<x10.core.Float>deleteRemoteArray__0$1x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(d_PutResult)));
            
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.util.CUDAUtilities.<x10.core.Float>deleteRemoteArray__0$1x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(d_StockPrice)));
            
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.util.CUDAUtilities.<x10.core.Float>deleteRemoteArray__0$1x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(d_OptionStrike)));
            
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.util.CUDAUtilities.<x10.core.Float>deleteRemoteArray__0$1x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(d_OptionYears)));
            
//#line 151 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.io.Printer t174762 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 151 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final java.lang.String t174763 =
              (("Generating a second set of results at place ") + (cpu));
            
//#line 151 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174762.println(((java.lang.String)(t174763)));
            
//#line 153 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> t174764 =
              ((x10.array.RemoteArray)(new x10.array.RemoteArray<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((x10.array.Array)(h_OptionYears)),(java.lang.Class<?>) null)));
            
//#line 153 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> __desugarer__var__6__174580 =
              ((x10.array.RemoteArray)(((x10.array.RemoteArray<x10.core.Float>)
                                         t174764)));
            
//#line 153 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.array.RemoteArray<x10.core.Float> ret174581 =
               null;
            
//#line 153 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.Region t174978 =
              ((x10.array.Region)(((x10.array.RemoteArray<x10.core.Float>)__desugarer__var__6__174580).
                                    region));
            
//#line 153 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174979 =
              t174978.
                rank;
            
//#line 153 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
boolean t174980 =
              ((int) t174979) ==
            ((int) 1);
            
//#line 153 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t174980) {
                
//#line 153 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.core.GlobalRef<x10.array.Array<x10.core.Float>> t174981 =
                  ((x10.core.GlobalRef)(((x10.array.RemoteArray<x10.core.Float>)__desugarer__var__6__174580).
                                          array));
                
//#line 153 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.lang.Place t174982 =
                  ((x10.lang.Place)((t174981).home));
                
//#line 153 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174980 = x10.rtt.Equality.equalsequals((t174982),(cpu));
            }
            
//#line 153 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t174983 =
              t174980;
            
//#line 153 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t174984 =
              !(t174983);
            
//#line 153 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t174984) {
                
//#line 153 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t174985 =
                  true;
                
//#line 153 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t174985) {
                    
//#line 153 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.lang.FailedDynamicCheckException t174986 =
                      new x10.lang.FailedDynamicCheckException("x10.array.RemoteArray[x10.lang.Float]{self.region.rank==1, self.array.home==cpu}");
                    
//#line 153 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
throw t174986;
                }
            }
            
//#line 153 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
ret174581 = ((x10.array.RemoteArray)(__desugarer__var__6__174580));
            
//#line 153 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> t174814 =
              ((x10.array.RemoteArray)(ret174581));
            
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> t174774 =
              ((x10.array.RemoteArray)(new x10.array.RemoteArray<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((x10.array.Array)(h_StockPrice)),(java.lang.Class<?>) null)));
            
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> __desugarer__var__7__174583 =
              ((x10.array.RemoteArray)(((x10.array.RemoteArray<x10.core.Float>)
                                         t174774)));
            
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.array.RemoteArray<x10.core.Float> ret174584 =
               null;
            
//#line 154 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.Region t174987 =
              ((x10.array.Region)(((x10.array.RemoteArray<x10.core.Float>)__desugarer__var__7__174583).
                                    region));
            
//#line 154 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174988 =
              t174987.
                rank;
            
//#line 154 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
boolean t174989 =
              ((int) t174988) ==
            ((int) 1);
            
//#line 154 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t174989) {
                
//#line 154 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.core.GlobalRef<x10.array.Array<x10.core.Float>> t174990 =
                  ((x10.core.GlobalRef)(((x10.array.RemoteArray<x10.core.Float>)__desugarer__var__7__174583).
                                          array));
                
//#line 154 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.lang.Place t174991 =
                  ((x10.lang.Place)((t174990).home));
                
//#line 154 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174989 = x10.rtt.Equality.equalsequals((t174991),(cpu));
            }
            
//#line 154 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t174992 =
              t174989;
            
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t174993 =
              !(t174992);
            
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t174993) {
                
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t174994 =
                  true;
                
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t174994) {
                    
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.lang.FailedDynamicCheckException t174995 =
                      new x10.lang.FailedDynamicCheckException("x10.array.RemoteArray[x10.lang.Float]{self.region.rank==1, self.array.home==cpu}");
                    
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
throw t174995;
                }
            }
            
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
ret174584 = ((x10.array.RemoteArray)(__desugarer__var__7__174583));
            
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> t174815 =
              ((x10.array.RemoteArray)(ret174584));
            
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> t174784 =
              ((x10.array.RemoteArray)(new x10.array.RemoteArray<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((x10.array.Array)(h_OptionStrike)),(java.lang.Class<?>) null)));
            
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> __desugarer__var__8__174586 =
              ((x10.array.RemoteArray)(((x10.array.RemoteArray<x10.core.Float>)
                                         t174784)));
            
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.array.RemoteArray<x10.core.Float> ret174587 =
               null;
            
//#line 155 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.Region t174996 =
              ((x10.array.Region)(((x10.array.RemoteArray<x10.core.Float>)__desugarer__var__8__174586).
                                    region));
            
//#line 155 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174997 =
              t174996.
                rank;
            
//#line 155 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
boolean t174998 =
              ((int) t174997) ==
            ((int) 1);
            
//#line 155 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t174998) {
                
//#line 155 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.core.GlobalRef<x10.array.Array<x10.core.Float>> t174999 =
                  ((x10.core.GlobalRef)(((x10.array.RemoteArray<x10.core.Float>)__desugarer__var__8__174586).
                                          array));
                
//#line 155 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.lang.Place t175000 =
                  ((x10.lang.Place)((t174999).home));
                
//#line 155 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174998 = x10.rtt.Equality.equalsequals((t175000),(cpu));
            }
            
//#line 155 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t175001 =
              t174998;
            
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t175002 =
              !(t175001);
            
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t175002) {
                
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t175003 =
                  true;
                
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t175003) {
                    
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.lang.FailedDynamicCheckException t175004 =
                      new x10.lang.FailedDynamicCheckException("x10.array.RemoteArray[x10.lang.Float]{self.region.rank==1, self.array.home==cpu}");
                    
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
throw t175004;
                }
            }
            
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
ret174587 = ((x10.array.RemoteArray)(__desugarer__var__8__174586));
            
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> t174816 =
              ((x10.array.RemoteArray)(ret174587));
            
//#line 156 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> t174794 =
              ((x10.array.RemoteArray)(new x10.array.RemoteArray<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((x10.array.Array)(h_CallResultCPU)),(java.lang.Class<?>) null)));
            
//#line 156 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> __desugarer__var__9__174589 =
              ((x10.array.RemoteArray)(((x10.array.RemoteArray<x10.core.Float>)
                                         t174794)));
            
//#line 156 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.array.RemoteArray<x10.core.Float> ret174590 =
               null;
            
//#line 156 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.Region t175005 =
              ((x10.array.Region)(((x10.array.RemoteArray<x10.core.Float>)__desugarer__var__9__174589).
                                    region));
            
//#line 156 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t175006 =
              t175005.
                rank;
            
//#line 156 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
boolean t175007 =
              ((int) t175006) ==
            ((int) 1);
            
//#line 156 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t175007) {
                
//#line 156 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.core.GlobalRef<x10.array.Array<x10.core.Float>> t175008 =
                  ((x10.core.GlobalRef)(((x10.array.RemoteArray<x10.core.Float>)__desugarer__var__9__174589).
                                          array));
                
//#line 156 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.lang.Place t175009 =
                  ((x10.lang.Place)((t175008).home));
                
//#line 156 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t175007 = x10.rtt.Equality.equalsequals((t175009),(cpu));
            }
            
//#line 156 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t175010 =
              t175007;
            
//#line 156 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t175011 =
              !(t175010);
            
//#line 156 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t175011) {
                
//#line 156 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t175012 =
                  true;
                
//#line 156 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t175012) {
                    
//#line 156 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.lang.FailedDynamicCheckException t175013 =
                      new x10.lang.FailedDynamicCheckException("x10.array.RemoteArray[x10.lang.Float]{self.region.rank==1, self.array.home==cpu}");
                    
//#line 156 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
throw t175013;
                }
            }
            
//#line 156 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
ret174590 = ((x10.array.RemoteArray)(__desugarer__var__9__174589));
            
//#line 156 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> t174817 =
              ((x10.array.RemoteArray)(ret174590));
            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> t174804 =
              ((x10.array.RemoteArray)(new x10.array.RemoteArray<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((x10.array.Array)(h_PutResultCPU)),(java.lang.Class<?>) null)));
            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> __desugarer__var__10__174592 =
              ((x10.array.RemoteArray)(((x10.array.RemoteArray<x10.core.Float>)
                                         t174804)));
            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.array.RemoteArray<x10.core.Float> ret174593 =
               null;
            
//#line 157 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.Region t175014 =
              ((x10.array.Region)(((x10.array.RemoteArray<x10.core.Float>)__desugarer__var__10__174592).
                                    region));
            
//#line 157 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t175015 =
              t175014.
                rank;
            
//#line 157 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
boolean t175016 =
              ((int) t175015) ==
            ((int) 1);
            
//#line 157 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t175016) {
                
//#line 157 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.core.GlobalRef<x10.array.Array<x10.core.Float>> t175017 =
                  ((x10.core.GlobalRef)(((x10.array.RemoteArray<x10.core.Float>)__desugarer__var__10__174592).
                                          array));
                
//#line 157 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.lang.Place t175018 =
                  ((x10.lang.Place)((t175017).home));
                
//#line 157 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t175016 = x10.rtt.Equality.equalsequals((t175018),(cpu));
            }
            
//#line 157 . "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t175019 =
              t175016;
            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t175020 =
              !(t175019);
            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t175020) {
                
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t175021 =
                  true;
                
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t175021) {
                    
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.lang.FailedDynamicCheckException t175022 =
                      new x10.lang.FailedDynamicCheckException("x10.array.RemoteArray[x10.lang.Float]{self.region.rank==1, self.array.home==cpu}");
                    
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
throw t175022;
                }
            }
            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
ret174593 = ((x10.array.RemoteArray)(__desugarer__var__10__174592));
            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.array.RemoteArray<x10.core.Float> t174818 =
              ((x10.array.RemoteArray)(ret174593));
            
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
CUDABlackScholes.doBlackScholes__1$1x10$lang$Float$2__2$1x10$lang$Float$2__3$1x10$lang$Float$2__4$1x10$lang$Float$2__5$1x10$lang$Float$2(((x10.lang.Place)(cpu)),
                                                                                                                                                                                                                                                               ((x10.array.RemoteArray)(t174814)),
                                                                                                                                                                                                                                                               ((x10.array.RemoteArray)(t174815)),
                                                                                                                                                                                                                                                               ((x10.array.RemoteArray)(t174816)),
                                                                                                                                                                                                                                                               ((x10.array.RemoteArray)(t174817)),
                                                                                                                                                                                                                                                               ((x10.array.RemoteArray)(t174818)),
                                                                                                                                                                                                                                                               (int)(OPT_N),
                                                                                                                                                                                                                                                               (float)(RISKFREE),
                                                                                                                                                                                                                                                               (float)(VOLATILITY));
            
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.io.Printer t174819 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174819.println(((java.lang.String)("Verifying the reuslts match...")));
            
//#line 163 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
float sum_delta =
              0.0F;
            
//#line 164 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
float sum_ref =
              0.0F;
            
//#line 165 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
float max_delta =
              0.0F;
            
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
int i175023 =
              0;
            
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
for (;
                                                                                                                           true;
                                                                                                                           ) {
                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t175024 =
                  i175023;
                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t175025 =
                  ((t175024) < (((int)(OPT_N))));
                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (!(t175025)) {
                    
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
break;
                }
                
//#line 167 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174960 =
                  i175023;
                
//#line 167 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float ref_val174961 =
                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)h_CallResultCPU).$apply$G((int)(t174960)));
                
//#line 168 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174962 =
                  i175023;
                
//#line 168 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174963 =
                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)h_CallResultGPU).$apply$G((int)(t174962)));
                
//#line 168 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174964 =
                  ((ref_val174961) - (((float)(t174963))));
                
//#line 168 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float delta174965 =
                  x10.lang.Math.abs$O((float)(t174964));
                
//#line 169 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174966 =
                  max_delta;
                
//#line 169 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t174967 =
                  ((delta174965) > (((float)(t174966))));
                
//#line 169 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t174967) {
                    
//#line 169 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
max_delta = delta174965;
                }
                
//#line 170 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174968 =
                  sum_delta;
                
//#line 170 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174969 =
                  ((t174968) + (((float)(delta174965))));
                
//#line 170 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
sum_delta = t174969;
                
//#line 171 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174970 =
                  sum_ref;
                
//#line 171 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174971 =
                  x10.lang.Math.abs$O((float)(ref_val174961));
                
//#line 171 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174972 =
                  ((t174970) + (((float)(t174971))));
                
//#line 171 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
sum_ref = t174972;
                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174973 =
                  i175023;
                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174974 =
                  ((t174973) + (((int)(1))));
                
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
i175023 = t174974;
            }
            
//#line 173 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174836 =
              sum_delta;
            
//#line 173 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174837 =
              sum_ref;
            
//#line 173 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float L1norm =
              ((t174836) / (((float)(t174837))));
            
//#line 174 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.io.Printer t174838 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 174 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final java.lang.String t174839 =
              (("L1 norm: ") + ((x10.core.Float.$box(L1norm))));
            
//#line 174 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174838.println(((java.lang.String)(t174839)));
            
//#line 175 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.io.Printer t174841 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 175 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174840 =
              max_delta;
            
//#line 175 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final java.lang.String t174842 =
              (("Max absolute error: ") + ((x10.core.Float.$box(t174840))));
            
//#line 175 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174841.println(((java.lang.String)(t174842)));
            
//#line 176 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.io.Printer t174845 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 176 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t174843 =
              ((L1norm) < (((float)(1.0E-6F))));
            
//#line 176 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
java.lang.String t174844 =
               null;
            
//#line 176 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t174843) {
                
//#line 176 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174844 = "TEST PASSED";
            } else {
                
//#line 176 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174844 = "TEST FAILED";
            }
            
//#line 176 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final java.lang.String t174846 =
              t174844;
            
//#line 176 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
t174845.println(((java.lang.String)(t174846)));
            }
        
        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final public CUDABlackScholes
                                                                                                                   CUDABlackScholes$$CUDABlackScholes$this(
                                                                                                                   ){
            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
return CUDABlackScholes.this;
        }
        
        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
// creation method for java code
        public static CUDABlackScholes $make(){return new CUDABlackScholes((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public CUDABlackScholes CUDABlackScholes$$init$S() { {
                                                                          
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"

                                                                          
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"

                                                                      }
                                                                      return this;
                                                                      }
        
        // constructor
        public CUDABlackScholes $init(){return CUDABlackScholes$$init$S();}
        
        
        public static class $Closure$124 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$124.class);
            
            public static final x10.rtt.RuntimeType<$Closure$124> $RTT = new x10.rtt.StaticVoidFunType<$Closure$124>(
            /* base class */$Closure$124.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$124 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$124.class + " calling"); } 
                $_obj.block174952 = $deserializer.readInt();
                $_obj.threads = $deserializer.readInt();
                $_obj.thread174944 = $deserializer.readInt();
                $_obj.blocks = $deserializer.readInt();
                $_obj.opt_N = $deserializer.readInt();
                x10.array.RemoteArray optionYears = (x10.array.RemoteArray) $deserializer.readRef();
                $_obj.optionYears = optionYears;
                x10.array.RemoteArray stockPrice = (x10.array.RemoteArray) $deserializer.readRef();
                $_obj.stockPrice = stockPrice;
                x10.array.RemoteArray optionStrike = (x10.array.RemoteArray) $deserializer.readRef();
                $_obj.optionStrike = optionStrike;
                $_obj.V = $deserializer.readFloat();
                $_obj.R = $deserializer.readFloat();
                x10.array.RemoteArray callResult = (x10.array.RemoteArray) $deserializer.readRef();
                $_obj.callResult = callResult;
                x10.array.RemoteArray putResult = (x10.array.RemoteArray) $deserializer.readRef();
                $_obj.putResult = putResult;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$124 $_obj = new $Closure$124((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                $serializer.write(this.block174952);
                $serializer.write(this.threads);
                $serializer.write(this.thread174944);
                $serializer.write(this.blocks);
                $serializer.write(this.opt_N);
                if (optionYears instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.optionYears);
                } else {
                $serializer.write(this.optionYears);
                }
                if (stockPrice instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.stockPrice);
                } else {
                $serializer.write(this.stockPrice);
                }
                if (optionStrike instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.optionStrike);
                } else {
                $serializer.write(this.optionStrike);
                }
                $serializer.write(this.V);
                $serializer.write(this.R);
                if (callResult instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.callResult);
                } else {
                $serializer.write(this.callResult);
                }
                if (putResult instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.putResult);
                } else {
                $serializer.write(this.putResult);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$124(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174941 =
                      ((this.
                          block174952) * (((int)(this.
                                                   threads))));
                    
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int tid174942 =
                      ((t174941) + (((int)(this.
                                             thread174944))));
                    
//#line 46 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int tids174943 =
                      ((this.
                          blocks) * (((int)(this.
                                              threads))));
                    
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
int opt174938 =
                      tid174942;
                    
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
for (;
                                                                                                                                  true;
                                                                                                                                  ) {
                        
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174939 =
                          opt174938;
                        
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t174940 =
                          ((t174939) < (((int)(this.
                                                 opt_N))));
                        
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (!(t174940)) {
                            
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
break;
                        }
                        
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float A174847 =
                          0.31938154F;
                        
//#line 50 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float A174848 =
                          -0.35656378F;
                        
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float A174849 =
                          1.7814779F;
                        
//#line 52 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float A174850 =
                          -1.8212559F;
                        
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float A174851 =
                          1.3302745F;
                        
//#line 54 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float RSQRT2PI174852 =
                          0.3989423F;
                        
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174853 =
                          opt174938;
                        
//#line 56 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float T174854 =
                          x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                          optionYears).$apply$G((int)(t174853)));
                        
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174855 =
                          opt174938;
                        
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float S174856 =
                          x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                          stockPrice).$apply$G((int)(t174855)));
                        
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174857 =
                          opt174938;
                        
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float X174858 =
                          x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                          optionStrike).$apply$G((int)(t174857)));
                        
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float sqrtT174859 =
                          (float)java.lang.Math.sqrt(((float)(T174854)));
                        
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174860 =
                          ((S174856) / (((float)(X174858))));
                        
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174861 =
                          (float)java.lang.Math.log(((float)(t174860)));
                        
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174862 =
                          ((0.5F) * (((float)(this.
                                                V))));
                        
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174863 =
                          ((t174862) * (((float)(this.
                                                   V))));
                        
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174864 =
                          ((this.
                              R) + (((float)(t174863))));
                        
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174865 =
                          ((t174864) * (((float)(T174854))));
                        
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174866 =
                          ((t174861) + (((float)(t174865))));
                        
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174867 =
                          ((this.
                              V) * (((float)(sqrtT174859))));
                        
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float d174868 =
                          ((t174866) / (((float)(t174867))));
                        
//#line 61 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174869 =
                          ((this.
                              V) * (((float)(sqrtT174859))));
                        
//#line 61 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float d174870 =
                          ((d174868) - (((float)(t174869))));
                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174871 =
                          x10.lang.Math.abs$O((float)(d174868));
                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174872 =
                          ((0.2316419F) * (((float)(t174871))));
                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174873 =
                          ((1.0F) + (((float)(t174872))));
                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float K174874 =
                          ((1.0F) / (((float)(t174873))));
                        
//#line 64 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174875 =
                          x10.lang.Math.abs$O((float)(d174870));
                        
//#line 64 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174876 =
                          ((0.2316419F) * (((float)(t174875))));
                        
//#line 64 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174877 =
                          ((1.0F) + (((float)(t174876))));
                        
//#line 64 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float K174878 =
                          ((1.0F) / (((float)(t174877))));
                        
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174879 =
                          -0.5F;
                        
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174880 =
                          ((t174879) * (((float)(d174868))));
                        
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174881 =
                          ((t174880) * (((float)(d174868))));
                        
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174882 =
                          (float)java.lang.Math.exp(((float)(t174881)));
                        
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174883 =
                          ((RSQRT2PI174852) * (((float)(t174882))));
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174884 =
                          ((K174874) * (((float)(A174851))));
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174885 =
                          ((A174850) + (((float)(t174884))));
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174886 =
                          ((K174874) * (((float)(t174885))));
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174887 =
                          ((A174849) + (((float)(t174886))));
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174888 =
                          ((K174874) * (((float)(t174887))));
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174889 =
                          ((A174848) + (((float)(t174888))));
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174890 =
                          ((K174874) * (((float)(t174889))));
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174891 =
                          ((A174847) + (((float)(t174890))));
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174892 =
                          ((K174874) * (((float)(t174891))));
                        
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
float CNDD174893 =
                          ((t174883) * (((float)(t174892))));
                        
//#line 67 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174894 =
                          -0.5F;
                        
//#line 67 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174895 =
                          ((t174894) * (((float)(d174870))));
                        
//#line 67 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174896 =
                          ((t174895) * (((float)(d174870))));
                        
//#line 67 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174897 =
                          (float)java.lang.Math.exp(((float)(t174896)));
                        
//#line 67 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174898 =
                          ((RSQRT2PI174852) * (((float)(t174897))));
                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174899 =
                          ((K174878) * (((float)(A174851))));
                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174900 =
                          ((A174850) + (((float)(t174899))));
                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174901 =
                          ((K174878) * (((float)(t174900))));
                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174902 =
                          ((A174849) + (((float)(t174901))));
                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174903 =
                          ((K174878) * (((float)(t174902))));
                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174904 =
                          ((A174848) + (((float)(t174903))));
                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174905 =
                          ((K174878) * (((float)(t174904))));
                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174906 =
                          ((A174847) + (((float)(t174905))));
                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174907 =
                          ((K174878) * (((float)(t174906))));
                        
//#line 67 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
float CNDD174908 =
                          ((t174898) * (((float)(t174907))));
                        
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174909 =
                          ((float)(int)(((int)(0))));
                        
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t174910 =
                          ((d174868) > (((float)(t174909))));
                        
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t174910) {
                            
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174911 =
                              CNDD174893;
                            
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174912 =
                              ((1.0F) - (((float)(t174911))));
                            
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
CNDD174893 = t174912;
                        }
                        
//#line 71 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174913 =
                          ((float)(int)(((int)(0))));
                        
//#line 71 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t174914 =
                          ((d174870) > (((float)(t174913))));
                        
//#line 71 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (t174914) {
                            
//#line 71 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174915 =
                              CNDD174908;
                            
//#line 71 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174916 =
                              ((1.0F) - (((float)(t174915))));
                            
//#line 71 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
CNDD174908 = t174916;
                        }
                        
//#line 74 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174917 =
                          (-(this.
                               R));
                        
//#line 74 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174918 =
                          ((t174917) * (((float)(T174854))));
                        
//#line 74 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float expRT174919 =
                          (float)java.lang.Math.exp(((float)(t174918)));
                        
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174920 =
                          opt174938;
                        
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174921 =
                          CNDD174893;
                        
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174922 =
                          ((S174856) * (((float)(t174921))));
                        
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174923 =
                          ((X174858) * (((float)(expRT174919))));
                        
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174924 =
                          CNDD174908;
                        
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174925 =
                          ((t174923) * (((float)(t174924))));
                        
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174926 =
                          ((t174922) - (((float)(t174925))));
                        
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                                                                                           callResult).$set__1x10$array$RemoteArray$$T$G((int)(t174920),
                                                                                                                                                                                                                         x10.core.Float.$box(t174926));
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174927 =
                          opt174938;
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174928 =
                          ((X174858) * (((float)(expRT174919))));
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174929 =
                          CNDD174908;
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174930 =
                          ((1.0F) - (((float)(t174929))));
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174931 =
                          ((t174928) * (((float)(t174930))));
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174932 =
                          CNDD174893;
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174933 =
                          ((1.0F) - (((float)(t174932))));
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174934 =
                          ((S174856) * (((float)(t174933))));
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174935 =
                          ((t174931) - (((float)(t174934))));
                        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                                                                                           putResult).$set__1x10$array$RemoteArray$$T$G((int)(t174927),
                                                                                                                                                                                                                        x10.core.Float.$box(t174935));
                        
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174936 =
                          opt174938;
                        
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174937 =
                          ((t174936) + (((int)(tids174943))));
                        
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
opt174938 = t174937;
                    }
                }
                
                public int block174952;
                public int threads;
                public int thread174944;
                public int blocks;
                public int opt_N;
                public x10.array.RemoteArray<x10.core.Float> optionYears;
                public x10.array.RemoteArray<x10.core.Float> stockPrice;
                public x10.array.RemoteArray<x10.core.Float> optionStrike;
                public float V;
                public float R;
                public x10.array.RemoteArray<x10.core.Float> callResult;
                public x10.array.RemoteArray<x10.core.Float> putResult;
                
                // creation method for java code
                public static CUDABlackScholes.$Closure$124 $make(final int block174952,
                                                                  final int threads,
                                                                  final int thread174944,
                                                                  final int blocks,
                                                                  final int opt_N,
                                                                  final x10.array.RemoteArray<x10.core.Float> optionYears,
                                                                  final x10.array.RemoteArray<x10.core.Float> stockPrice,
                                                                  final x10.array.RemoteArray<x10.core.Float> optionStrike,
                                                                  final float V,
                                                                  final float R,
                                                                  final x10.array.RemoteArray<x10.core.Float> callResult,
                                                                  final x10.array.RemoteArray<x10.core.Float> putResult,java.lang.Class<?> $dummy0){return new $Closure$124(block174952,threads,thread174944,blocks,opt_N,optionYears,stockPrice,optionStrike,V,R,callResult,putResult,(java.lang.Class<?>) null);}
                public $Closure$124(final int block174952,
                                    final int threads,
                                    final int thread174944,
                                    final int blocks,
                                    final int opt_N,
                                    final x10.array.RemoteArray<x10.core.Float> optionYears,
                                    final x10.array.RemoteArray<x10.core.Float> stockPrice,
                                    final x10.array.RemoteArray<x10.core.Float> optionStrike,
                                    final float V,
                                    final float R,
                                    final x10.array.RemoteArray<x10.core.Float> callResult,
                                    final x10.array.RemoteArray<x10.core.Float> putResult,java.lang.Class<?> $dummy0) { {
                                                                                                                               this.block174952 = block174952;
                                                                                                                               this.threads = threads;
                                                                                                                               this.thread174944 = thread174944;
                                                                                                                               this.blocks = blocks;
                                                                                                                               this.opt_N = opt_N;
                                                                                                                               this.optionYears = ((x10.array.RemoteArray)(optionYears));
                                                                                                                               this.stockPrice = ((x10.array.RemoteArray)(stockPrice));
                                                                                                                               this.optionStrike = ((x10.array.RemoteArray)(optionStrike));
                                                                                                                               this.V = V;
                                                                                                                               this.R = R;
                                                                                                                               this.callResult = ((x10.array.RemoteArray)(callResult));
                                                                                                                               this.putResult = ((x10.array.RemoteArray)(putResult));
                                                                                                                           }}
                
            }
            
        public static class $Closure$125 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$125.class);
            
            public static final x10.rtt.RuntimeType<$Closure$125> $RTT = new x10.rtt.StaticVoidFunType<$Closure$125>(
            /* base class */$Closure$125.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$125 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$125.class + " calling"); } 
                $_obj.threads = $deserializer.readInt();
                $_obj.block174952 = $deserializer.readInt();
                $_obj.blocks = $deserializer.readInt();
                $_obj.opt_N = $deserializer.readInt();
                x10.array.RemoteArray optionYears = (x10.array.RemoteArray) $deserializer.readRef();
                $_obj.optionYears = optionYears;
                x10.array.RemoteArray stockPrice = (x10.array.RemoteArray) $deserializer.readRef();
                $_obj.stockPrice = stockPrice;
                x10.array.RemoteArray optionStrike = (x10.array.RemoteArray) $deserializer.readRef();
                $_obj.optionStrike = optionStrike;
                $_obj.V = $deserializer.readFloat();
                $_obj.R = $deserializer.readFloat();
                x10.array.RemoteArray callResult = (x10.array.RemoteArray) $deserializer.readRef();
                $_obj.callResult = callResult;
                x10.array.RemoteArray putResult = (x10.array.RemoteArray) $deserializer.readRef();
                $_obj.putResult = putResult;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$125 $_obj = new $Closure$125((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                $serializer.write(this.threads);
                $serializer.write(this.block174952);
                $serializer.write(this.blocks);
                $serializer.write(this.opt_N);
                if (optionYears instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.optionYears);
                } else {
                $serializer.write(this.optionYears);
                }
                if (stockPrice instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.stockPrice);
                } else {
                $serializer.write(this.stockPrice);
                }
                if (optionStrike instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.optionStrike);
                } else {
                $serializer.write(this.optionStrike);
                }
                $serializer.write(this.V);
                $serializer.write(this.R);
                if (callResult instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.callResult);
                } else {
                $serializer.write(this.callResult);
                }
                if (putResult instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.putResult);
                } else {
                $serializer.write(this.putResult);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$125(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    {
                        
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.lang.Clock x10$__var103 =
                          null;
                        {
                            
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.lang.Runtime.ensureNotInAtomic();
                            
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.lang.FinishState x10$__var104 =
                              x10.lang.Runtime.startFinish();
                            
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
try {try {{
                                {
                                    
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
try {{
                                        
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.lang.Clock x10$__var102 =
                                          x10.lang.Clock.make();
                                        
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10$__var103 = x10$__var102;
                                        
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int i174549min174950 =
                                          0;
                                        
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int i174549max174951 =
                                          127;
                                        
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
int i174947 =
                                          i174549min174950;
                                        
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
for (;
                                                                                                                                                      true;
                                                                                                                                                      ) {
                                            
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174948 =
                                              i174947;
                                            
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t174949 =
                                              ((t174948) <= (((int)(i174549max174951))));
                                            
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (!(t174949)) {
                                                
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
break;
                                            }
                                            
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int thread174944 =
                                              i174947;
                                            
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.lang.Runtime.runAsync__0$1x10$lang$Clock$2(((x10.array.Array)(x10.core.ArrayFactory.<x10.lang.Clock> makeArrayFromJavaArray(x10.lang.Clock.$RTT, new x10.lang.Clock[] {x10$__var102}))),
                                                                                                                                                                                                    ((x10.core.fun.VoidFun_0_0)(new CUDABlackScholes.$Closure$124(((int)(this.
                                                                                                                                                                                                                                                                           block174952)),
                                                                                                                                                                                                                                                                  this.
                                                                                                                                                                                                                                                                    threads,
                                                                                                                                                                                                                                                                  thread174944,
                                                                                                                                                                                                                                                                  ((int)(this.
                                                                                                                                                                                                                                                                           blocks)),
                                                                                                                                                                                                                                                                  ((int)(this.
                                                                                                                                                                                                                                                                           opt_N)),
                                                                                                                                                                                                                                                                  ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                                             optionYears)),
                                                                                                                                                                                                                                                                  ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                                             stockPrice)),
                                                                                                                                                                                                                                                                  ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                                             optionStrike)),
                                                                                                                                                                                                                                                                  ((float)(this.
                                                                                                                                                                                                                                                                             V)),
                                                                                                                                                                                                                                                                  ((float)(this.
                                                                                                                                                                                                                                                                             R)),
                                                                                                                                                                                                                                                                  ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                                             callResult)),
                                                                                                                                                                                                                                                                  ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                                             putResult)),(java.lang.Class<?>) null))));
                                            
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174945 =
                                              i174947;
                                            
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174946 =
                                              ((t174945) + (((int)(1))));
                                            
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
i174947 = t174946;
                                        }
                                    }}finally {{
                                          
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (((x10$__var103) != (null))) {
                                              
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10$__var103.drop();
                                          }
                                      }}
                                    }
                                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__78__) {
                                    
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__78__)));
                                    
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
throw new x10.lang.RuntimeException();
                                }finally {{
                                     
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var104)));
                                 }}
                            }
                        }
                    }
                    
                    public int threads;
                    public int block174952;
                    public int blocks;
                    public int opt_N;
                    public x10.array.RemoteArray<x10.core.Float> optionYears;
                    public x10.array.RemoteArray<x10.core.Float> stockPrice;
                    public x10.array.RemoteArray<x10.core.Float> optionStrike;
                    public float V;
                    public float R;
                    public x10.array.RemoteArray<x10.core.Float> callResult;
                    public x10.array.RemoteArray<x10.core.Float> putResult;
                    
                    // creation method for java code
                    public static CUDABlackScholes.$Closure$125 $make(final int threads,
                                                                      final int block174952,
                                                                      final int blocks,
                                                                      final int opt_N,
                                                                      final x10.array.RemoteArray<x10.core.Float> optionYears,
                                                                      final x10.array.RemoteArray<x10.core.Float> stockPrice,
                                                                      final x10.array.RemoteArray<x10.core.Float> optionStrike,
                                                                      final float V,
                                                                      final float R,
                                                                      final x10.array.RemoteArray<x10.core.Float> callResult,
                                                                      final x10.array.RemoteArray<x10.core.Float> putResult,java.lang.Class<?> $dummy0){return new $Closure$125(threads,block174952,blocks,opt_N,optionYears,stockPrice,optionStrike,V,R,callResult,putResult,(java.lang.Class<?>) null);}
                    public $Closure$125(final int threads,
                                        final int block174952,
                                        final int blocks,
                                        final int opt_N,
                                        final x10.array.RemoteArray<x10.core.Float> optionYears,
                                        final x10.array.RemoteArray<x10.core.Float> stockPrice,
                                        final x10.array.RemoteArray<x10.core.Float> optionStrike,
                                        final float V,
                                        final float R,
                                        final x10.array.RemoteArray<x10.core.Float> callResult,
                                        final x10.array.RemoteArray<x10.core.Float> putResult,java.lang.Class<?> $dummy0) { {
                                                                                                                                   this.threads = threads;
                                                                                                                                   this.block174952 = block174952;
                                                                                                                                   this.blocks = blocks;
                                                                                                                                   this.opt_N = opt_N;
                                                                                                                                   this.optionYears = ((x10.array.RemoteArray)(optionYears));
                                                                                                                                   this.stockPrice = ((x10.array.RemoteArray)(stockPrice));
                                                                                                                                   this.optionStrike = ((x10.array.RemoteArray)(optionStrike));
                                                                                                                                   this.V = V;
                                                                                                                                   this.R = R;
                                                                                                                                   this.callResult = ((x10.array.RemoteArray)(callResult));
                                                                                                                                   this.putResult = ((x10.array.RemoteArray)(putResult));
                                                                                                                               }}
                    
                }
                
                public static class $Closure$126 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$126.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$126> $RTT = new x10.rtt.StaticVoidFunType<$Closure$126>(
                    /* base class */$Closure$126.class
                    , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$126 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$126.class + " calling"); } 
                        $_obj.blocks = $deserializer.readInt();
                        $_obj.threads = $deserializer.readInt();
                        $_obj.opt_N = $deserializer.readInt();
                        x10.array.RemoteArray optionYears = (x10.array.RemoteArray) $deserializer.readRef();
                        $_obj.optionYears = optionYears;
                        x10.array.RemoteArray stockPrice = (x10.array.RemoteArray) $deserializer.readRef();
                        $_obj.stockPrice = stockPrice;
                        x10.array.RemoteArray optionStrike = (x10.array.RemoteArray) $deserializer.readRef();
                        $_obj.optionStrike = optionStrike;
                        $_obj.V = $deserializer.readFloat();
                        $_obj.R = $deserializer.readFloat();
                        x10.array.RemoteArray callResult = (x10.array.RemoteArray) $deserializer.readRef();
                        $_obj.callResult = callResult;
                        x10.array.RemoteArray putResult = (x10.array.RemoteArray) $deserializer.readRef();
                        $_obj.putResult = putResult;
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$126 $_obj = new $Closure$126((java.lang.System[]) null);
                        $deserializer.record_reference($_obj);
                        return $_deserialize_body($_obj, $deserializer);
                        
                    }
                    
                    public short $_get_serialization_id() {
                    
                         return $_serialization_id;
                        
                    }
                    
                    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                        $serializer.write(this.blocks);
                        $serializer.write(this.threads);
                        $serializer.write(this.opt_N);
                        if (optionYears instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.optionYears);
                        } else {
                        $serializer.write(this.optionYears);
                        }
                        if (stockPrice instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.stockPrice);
                        } else {
                        $serializer.write(this.stockPrice);
                        }
                        if (optionStrike instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.optionStrike);
                        } else {
                        $serializer.write(this.optionStrike);
                        }
                        $serializer.write(this.V);
                        $serializer.write(this.R);
                        if (callResult instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.callResult);
                        } else {
                        $serializer.write(this.callResult);
                        }
                        if (putResult instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.putResult);
                        } else {
                        $serializer.write(this.putResult);
                        }
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$126(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    
                        
                        public void
                          $apply(
                          ){
                            {
                                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.lang.Runtime.ensureNotInAtomic();
                                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final x10.lang.FinishState x10$__var105 =
                                  x10.lang.Runtime.startFinish();
                                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
try {try {{
                                    {
                                        
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int i174565min174566 =
                                          0;
                                        
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int i174565max174567 =
                                          ((this.
                                              blocks) - (((int)(1))));
                                        
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
int i174955 =
                                          i174565min174566;
                                        
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
for (;
                                                                                                                                                      true;
                                                                                                                                                      ) {
                                            
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174956 =
                                              i174955;
                                            
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final boolean t174957 =
                                              ((t174956) <= (((int)(i174565max174567))));
                                            
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
if (!(t174957)) {
                                                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
break;
                                            }
                                            
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int block174952 =
                                              i174955;
                                            
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new CUDABlackScholes.$Closure$125(this.
                                                                                                                                                                                                                                               threads,
                                                                                                                                                                                                                                             block174952,
                                                                                                                                                                                                                                             ((int)(this.
                                                                                                                                                                                                                                                      blocks)),
                                                                                                                                                                                                                                             ((int)(this.
                                                                                                                                                                                                                                                      opt_N)),
                                                                                                                                                                                                                                             ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                        optionYears)),
                                                                                                                                                                                                                                             ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                        stockPrice)),
                                                                                                                                                                                                                                             ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                        optionStrike)),
                                                                                                                                                                                                                                             ((float)(this.
                                                                                                                                                                                                                                                        V)),
                                                                                                                                                                                                                                             ((float)(this.
                                                                                                                                                                                                                                                        R)),
                                                                                                                                                                                                                                             ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                        callResult)),
                                                                                                                                                                                                                                             ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                        putResult)),(java.lang.Class<?>) null))));
                                            
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174953 =
                                              i174955;
                                            
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final int t174954 =
                                              ((t174953) + (((int)(1))));
                                            
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
i174955 = t174954;
                                        }
                                    }
                                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__79__) {
                                    
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__79__)));
                                    
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
throw new x10.lang.RuntimeException();
                                }finally {{
                                     
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var105)));
                                 }}
                                }
                            }
                        
                        public int blocks;
                        public int threads;
                        public int opt_N;
                        public x10.array.RemoteArray<x10.core.Float> optionYears;
                        public x10.array.RemoteArray<x10.core.Float> stockPrice;
                        public x10.array.RemoteArray<x10.core.Float> optionStrike;
                        public float V;
                        public float R;
                        public x10.array.RemoteArray<x10.core.Float> callResult;
                        public x10.array.RemoteArray<x10.core.Float> putResult;
                        
                        // creation method for java code
                        public static CUDABlackScholes.$Closure$126 $make(final int blocks,
                                                                          final int threads,
                                                                          final int opt_N,
                                                                          final x10.array.RemoteArray<x10.core.Float> optionYears,
                                                                          final x10.array.RemoteArray<x10.core.Float> stockPrice,
                                                                          final x10.array.RemoteArray<x10.core.Float> optionStrike,
                                                                          final float V,
                                                                          final float R,
                                                                          final x10.array.RemoteArray<x10.core.Float> callResult,
                                                                          final x10.array.RemoteArray<x10.core.Float> putResult,java.lang.Class<?> $dummy0){return new $Closure$126(blocks,threads,opt_N,optionYears,stockPrice,optionStrike,V,R,callResult,putResult,(java.lang.Class<?>) null);}
                        public $Closure$126(final int blocks,
                                            final int threads,
                                            final int opt_N,
                                            final x10.array.RemoteArray<x10.core.Float> optionYears,
                                            final x10.array.RemoteArray<x10.core.Float> stockPrice,
                                            final x10.array.RemoteArray<x10.core.Float> optionStrike,
                                            final float V,
                                            final float R,
                                            final x10.array.RemoteArray<x10.core.Float> callResult,
                                            final x10.array.RemoteArray<x10.core.Float> putResult,java.lang.Class<?> $dummy0) { {
                                                                                                                                       this.blocks = blocks;
                                                                                                                                       this.threads = threads;
                                                                                                                                       this.opt_N = opt_N;
                                                                                                                                       this.optionYears = ((x10.array.RemoteArray)(optionYears));
                                                                                                                                       this.stockPrice = ((x10.array.RemoteArray)(stockPrice));
                                                                                                                                       this.optionStrike = ((x10.array.RemoteArray)(optionStrike));
                                                                                                                                       this.V = V;
                                                                                                                                       this.R = R;
                                                                                                                                       this.callResult = ((x10.array.RemoteArray)(callResult));
                                                                                                                                       this.putResult = ((x10.array.RemoteArray)(putResult));
                                                                                                                                   }}
                        
                        }
                        
                    public static class $Closure$127 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                    {
                        private static final long serialVersionUID = 1L;
                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$127.class);
                        
                        public static final x10.rtt.RuntimeType<$Closure$127> $RTT = new x10.rtt.StaticFunType<$Closure$127>(
                        /* base class */$Closure$127.class
                        , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                        );
                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                        
                        
                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$127 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$127.class + " calling"); } 
                            return $_obj;
                            
                        }
                        
                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            $Closure$127 $_obj = new $Closure$127((java.lang.System[]) null);
                            $deserializer.record_reference($_obj);
                            return $_deserialize_body($_obj, $deserializer);
                            
                        }
                        
                        public short $_get_serialization_id() {
                        
                             return $_serialization_id;
                            
                        }
                        
                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                        
                            
                        }
                        
                        // constructor just for allocation
                        public $Closure$127(final java.lang.System[] $dummy) { 
                        super($dummy);
                        }
                        // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                        return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                        }
                        
                            
                            public float
                              $apply$O(
                              final int id$148371){
                                
//#line 104 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174700 =
                                  ((float)(double)(((double)(0.0))));
                                
//#line 104 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
return t174700;
                            }
                            
                            // creation method for java code
                            public static CUDABlackScholes.$Closure$127 $make(){return new $Closure$127();}
                            public $Closure$127() { {
                                                           
                                                       }}
                            
                        }
                        
                    public static class $Closure$128 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                    {
                        private static final long serialVersionUID = 1L;
                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$128.class);
                        
                        public static final x10.rtt.RuntimeType<$Closure$128> $RTT = new x10.rtt.StaticFunType<$Closure$128>(
                        /* base class */$Closure$128.class
                        , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                        );
                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                        
                        
                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$128 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$128.class + " calling"); } 
                            return $_obj;
                            
                        }
                        
                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            $Closure$128 $_obj = new $Closure$128((java.lang.System[]) null);
                            $deserializer.record_reference($_obj);
                            return $_deserialize_body($_obj, $deserializer);
                            
                        }
                        
                        public short $_get_serialization_id() {
                        
                             return $_serialization_id;
                            
                        }
                        
                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                        
                            
                        }
                        
                        // constructor just for allocation
                        public $Closure$128(final java.lang.System[] $dummy) { 
                        super($dummy);
                        }
                        // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                        return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                        }
                        
                            
                            public float
                              $apply$O(
                              final int id$148372){
                                
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174702 =
                                  ((float)(double)(((double)(1.0))));
                                
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174703 =
                                  (-(t174702));
                                
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
return t174703;
                            }
                            
                            // creation method for java code
                            public static CUDABlackScholes.$Closure$128 $make(){return new $Closure$128();}
                            public $Closure$128() { {
                                                           
                                                       }}
                            
                        }
                        
                    public static class $Closure$129 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                    {
                        private static final long serialVersionUID = 1L;
                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$129.class);
                        
                        public static final x10.rtt.RuntimeType<$Closure$129> $RTT = new x10.rtt.StaticFunType<$Closure$129>(
                        /* base class */$Closure$129.class
                        , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                        );
                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                        
                        
                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$129 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$129.class + " calling"); } 
                            return $_obj;
                            
                        }
                        
                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            $Closure$129 $_obj = new $Closure$129((java.lang.System[]) null);
                            $deserializer.record_reference($_obj);
                            return $_deserialize_body($_obj, $deserializer);
                            
                        }
                        
                        public short $_get_serialization_id() {
                        
                             return $_serialization_id;
                            
                        }
                        
                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                        
                            
                        }
                        
                        // constructor just for allocation
                        public $Closure$129(final java.lang.System[] $dummy) { 
                        super($dummy);
                        }
                        // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                        return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                        }
                        
                            
                            public float
                              $apply$O(
                              final int id$148373){
                                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174705 =
                                  ((float)(double)(((double)(0.0))));
                                
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
return t174705;
                            }
                            
                            // creation method for java code
                            public static CUDABlackScholes.$Closure$129 $make(){return new $Closure$129();}
                            public $Closure$129() { {
                                                           
                                                       }}
                            
                        }
                        
                    public static class $Closure$130 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                    {
                        private static final long serialVersionUID = 1L;
                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$130.class);
                        
                        public static final x10.rtt.RuntimeType<$Closure$130> $RTT = new x10.rtt.StaticFunType<$Closure$130>(
                        /* base class */$Closure$130.class
                        , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                        );
                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                        
                        
                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$130 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$130.class + " calling"); } 
                            return $_obj;
                            
                        }
                        
                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            $Closure$130 $_obj = new $Closure$130((java.lang.System[]) null);
                            $deserializer.record_reference($_obj);
                            return $_deserialize_body($_obj, $deserializer);
                            
                        }
                        
                        public short $_get_serialization_id() {
                        
                             return $_serialization_id;
                            
                        }
                        
                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                        
                            
                        }
                        
                        // constructor just for allocation
                        public $Closure$130(final java.lang.System[] $dummy) { 
                        super($dummy);
                        }
                        // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                        return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                        }
                        
                            
                            public float
                              $apply$O(
                              final int id$148374){
                                
//#line 107 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174707 =
                                  ((float)(double)(((double)(0.0))));
                                
//#line 107 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
return t174707;
                            }
                            
                            // creation method for java code
                            public static CUDABlackScholes.$Closure$130 $make(){return new $Closure$130();}
                            public $Closure$130() { {
                                                           
                                                       }}
                            
                        }
                        
                    public static class $Closure$131 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                    {
                        private static final long serialVersionUID = 1L;
                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$131.class);
                        
                        public static final x10.rtt.RuntimeType<$Closure$131> $RTT = new x10.rtt.StaticFunType<$Closure$131>(
                        /* base class */$Closure$131.class
                        , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                        );
                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                        
                        
                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$131 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$131.class + " calling"); } 
                            x10.util.Random rand = (x10.util.Random) $deserializer.readRef();
                            $_obj.rand = rand;
                            return $_obj;
                            
                        }
                        
                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            $Closure$131 $_obj = new $Closure$131((java.lang.System[]) null);
                            $deserializer.record_reference($_obj);
                            return $_deserialize_body($_obj, $deserializer);
                            
                        }
                        
                        public short $_get_serialization_id() {
                        
                             return $_serialization_id;
                            
                        }
                        
                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                        
                            if (rand instanceof x10.x10rt.X10JavaSerializable) {
                            $serializer.write( (x10.x10rt.X10JavaSerializable) this.rand);
                            } else {
                            $serializer.write(this.rand);
                            }
                            
                        }
                        
                        // constructor just for allocation
                        public $Closure$131(final java.lang.System[] $dummy) { 
                        super($dummy);
                        }
                        // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                        return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                        }
                        
                            
                            public float
                              $apply$O(
                              final int id$148375){
                                
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174709 =
                                  this.
                                    rand.nextFloat$O();
                                
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174710 =
                                  t174709;
                                
//#line 108 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
return t174710;
                            }
                            
                            public x10.util.Random rand;
                            
                            // creation method for java code
                            public static CUDABlackScholes.$Closure$131 $make(final x10.util.Random rand){return new $Closure$131(rand);}
                            public $Closure$131(final x10.util.Random rand) { {
                                                                                     this.rand = ((x10.util.Random)(rand));
                                                                                 }}
                            
                        }
                        
                    public static class $Closure$132 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                    {
                        private static final long serialVersionUID = 1L;
                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$132.class);
                        
                        public static final x10.rtt.RuntimeType<$Closure$132> $RTT = new x10.rtt.StaticFunType<$Closure$132>(
                        /* base class */$Closure$132.class
                        , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                        );
                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                        
                        
                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$132 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$132.class + " calling"); } 
                            x10.util.Random rand = (x10.util.Random) $deserializer.readRef();
                            $_obj.rand = rand;
                            return $_obj;
                            
                        }
                        
                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            $Closure$132 $_obj = new $Closure$132((java.lang.System[]) null);
                            $deserializer.record_reference($_obj);
                            return $_deserialize_body($_obj, $deserializer);
                            
                        }
                        
                        public short $_get_serialization_id() {
                        
                             return $_serialization_id;
                            
                        }
                        
                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                        
                            if (rand instanceof x10.x10rt.X10JavaSerializable) {
                            $serializer.write( (x10.x10rt.X10JavaSerializable) this.rand);
                            } else {
                            $serializer.write(this.rand);
                            }
                            
                        }
                        
                        // constructor just for allocation
                        public $Closure$132(final java.lang.System[] $dummy) { 
                        super($dummy);
                        }
                        // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                        return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                        }
                        
                            
                            public float
                              $apply$O(
                              final int id$148376){
                                
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174712 =
                                  this.
                                    rand.nextFloat$O();
                                
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174713 =
                                  t174712;
                                
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
return t174713;
                            }
                            
                            public x10.util.Random rand;
                            
                            // creation method for java code
                            public static CUDABlackScholes.$Closure$132 $make(final x10.util.Random rand){return new $Closure$132(rand);}
                            public $Closure$132(final x10.util.Random rand) { {
                                                                                     this.rand = ((x10.util.Random)(rand));
                                                                                 }}
                            
                        }
                        
                    public static class $Closure$133 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                    {
                        private static final long serialVersionUID = 1L;
                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$133.class);
                        
                        public static final x10.rtt.RuntimeType<$Closure$133> $RTT = new x10.rtt.StaticFunType<$Closure$133>(
                        /* base class */$Closure$133.class
                        , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                        );
                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                        
                        
                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$133 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$133.class + " calling"); } 
                            x10.util.Random rand = (x10.util.Random) $deserializer.readRef();
                            $_obj.rand = rand;
                            return $_obj;
                            
                        }
                        
                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            $Closure$133 $_obj = new $Closure$133((java.lang.System[]) null);
                            $deserializer.record_reference($_obj);
                            return $_deserialize_body($_obj, $deserializer);
                            
                        }
                        
                        public short $_get_serialization_id() {
                        
                             return $_serialization_id;
                            
                        }
                        
                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                        
                            if (rand instanceof x10.x10rt.X10JavaSerializable) {
                            $serializer.write( (x10.x10rt.X10JavaSerializable) this.rand);
                            } else {
                            $serializer.write(this.rand);
                            }
                            
                        }
                        
                        // constructor just for allocation
                        public $Closure$133(final java.lang.System[] $dummy) { 
                        super($dummy);
                        }
                        // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                        return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                        }
                        
                            
                            public float
                              $apply$O(
                              final int id$148377){
                                
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174715 =
                                  this.
                                    rand.nextFloat$O();
                                
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174716 =
                                  t174715;
                                
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
return t174716;
                            }
                            
                            public x10.util.Random rand;
                            
                            // creation method for java code
                            public static CUDABlackScholes.$Closure$133 $make(final x10.util.Random rand){return new $Closure$133(rand);}
                            public $Closure$133(final x10.util.Random rand) { {
                                                                                     this.rand = ((x10.util.Random)(rand));
                                                                                 }}
                            
                        }
                        
                    public static class $Closure$134 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                    {
                        private static final long serialVersionUID = 1L;
                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$134.class);
                        
                        public static final x10.rtt.RuntimeType<$Closure$134> $RTT = new x10.rtt.StaticFunType<$Closure$134>(
                        /* base class */$Closure$134.class
                        , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                        );
                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                        
                        
                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$134 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$134.class + " calling"); } 
                            return $_obj;
                            
                        }
                        
                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            $Closure$134 $_obj = new $Closure$134((java.lang.System[]) null);
                            $deserializer.record_reference($_obj);
                            return $_deserialize_body($_obj, $deserializer);
                            
                        }
                        
                        public short $_get_serialization_id() {
                        
                             return $_serialization_id;
                            
                        }
                        
                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                        
                            
                        }
                        
                        // constructor just for allocation
                        public $Closure$134(final java.lang.System[] $dummy) { 
                        super($dummy);
                        }
                        // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                        return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                        }
                        
                            
                            public float
                              $apply$O(
                              final int id$148378){
                                
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174718 =
                                  ((float)(double)(((double)(0.0))));
                                
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
return t174718;
                            }
                            
                            // creation method for java code
                            public static CUDABlackScholes.$Closure$134 $make(){return new $Closure$134();}
                            public $Closure$134() { {
                                                           
                                                       }}
                            
                        }
                        
                    public static class $Closure$135 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                    {
                        private static final long serialVersionUID = 1L;
                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$135.class);
                        
                        public static final x10.rtt.RuntimeType<$Closure$135> $RTT = new x10.rtt.StaticFunType<$Closure$135>(
                        /* base class */$Closure$135.class
                        , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                        );
                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                        
                        
                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$135 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$135.class + " calling"); } 
                            return $_obj;
                            
                        }
                        
                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            $Closure$135 $_obj = new $Closure$135((java.lang.System[]) null);
                            $deserializer.record_reference($_obj);
                            return $_deserialize_body($_obj, $deserializer);
                            
                        }
                        
                        public short $_get_serialization_id() {
                        
                             return $_serialization_id;
                            
                        }
                        
                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                        
                            
                        }
                        
                        // constructor just for allocation
                        public $Closure$135(final java.lang.System[] $dummy) { 
                        super($dummy);
                        }
                        // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                        return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                        }
                        
                            
                            public float
                              $apply$O(
                              final int id$148379){
                                
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
final float t174720 =
                                  ((float)(double)(((double)(0.0))));
                                
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDABlackScholes.x10"
return t174720;
                            }
                            
                            // creation method for java code
                            public static CUDABlackScholes.$Closure$135 $make(){return new $Closure$135();}
                            public $Closure$135() { {
                                                           
                                                       }}
                            
                        }
                        
                    
                    }
                    