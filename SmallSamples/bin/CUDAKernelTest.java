
public class CUDAKernelTest extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, CUDAKernelTest.class);
    
    public static final x10.rtt.RuntimeType<CUDAKernelTest> $RTT = new x10.rtt.NamedType<CUDAKernelTest>(
    "CUDAKernelTest", /* base class */CUDAKernelTest.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(CUDAKernelTest $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + CUDAKernelTest.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        CUDAKernelTest $_obj = new CUDAKernelTest((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public CUDAKernelTest(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 21 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
public static void
                                                                                                                 doTest1__0$1x10$lang$Float$2__1$1x10$lang$Float$2(
                                                                                                                 final x10.array.Array<x10.core.Float> init,
                                                                                                                 final x10.array.Array<x10.core.Float> recv,
                                                                                                                 final x10.lang.Place p,
                                                                                                                 final int len){
            
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t168411 =
              ((x10.core.fun.Fun_0_1)(new CUDAKernelTest.$Closure$86()));
            
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.RemoteArray<x10.core.Float> remote =
              ((x10.array.RemoteArray)(x10.util.CUDAUtilities.<x10.core.Float>makeRemoteArray__2$1x10$lang$Int$3x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.lang.Place)(p)),
                                                                                                                                            (int)(len),
                                                                                                                                            ((x10.core.fun.Fun_0_1)(t168411)))));
            {
                
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.ensureNotInAtomic();
                
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.FinishState x10$__var72 =
                  x10.lang.Runtime.startFinish();
                
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {try {{
                    {
                        
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.runAsync(((x10.lang.Place)(p)),
                                                                                                                                                         ((x10.core.fun.VoidFun_0_0)(new CUDAKernelTest.$Closure$89(len,
                                                                                                                                                                                                                    init,
                                                                                                                                                                                                                    remote,(java.lang.Class<?>) null))));
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__56__) {
                    
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__56__)));
                    
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
throw new x10.lang.RuntimeException();
                }finally {{
                     
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var72)));
                 }}
                }
            {
                
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.ensureNotInAtomic();
                
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.FinishState x10$__var73 =
                  x10.lang.Runtime.startFinish();
                
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {try {{
                    {
                        
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.array.Array.<x10.core.Float>asyncCopy__0$1x10$array$Array$$T$2__2$1x10$array$Array$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(remote)),
                                                                                                                                                                                                                           (int)(0),
                                                                                                                                                                                                                           ((x10.array.Array)(recv)),
                                                                                                                                                                                                                           (int)(0),
                                                                                                                                                                                                                           (int)(len));
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__57__) {
                    
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__57__)));
                    
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
throw new x10.lang.RuntimeException();
                }finally {{
                     
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var73)));
                 }}
                }
            
//#line 40 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
boolean success =
              true;
            
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.Region t168670 =
              ((x10.array.Region)(((x10.array.Array<x10.core.Float>)recv).
                                    region));
            
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.Iterator<x10.array.Point> id168671 =
              t168670.iterator();
            
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
for (;
                                                                                                                        true;
                                                                                                                        ) {
                
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168672 =
                  ((x10.lang.Iterator<x10.array.Point>)id168671).hasNext$O();
                
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (!(t168672)) {
                    
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
break;
                }
                
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.Point id168646 =
                  ((x10.array.Point)(((x10.lang.Iterator<x10.array.Point>)id168671).next$G()));
                
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168647 =
                  id168646.$apply$O((int)(0));
                
//#line 42 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float oracle168648 =
                  ((float)(int)(((int)(i168647))));
                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168649 =
                  ((float)(int)(((int)(1))));
                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168650 =
                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)recv).$apply$G((int)(i168647)));
                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168651 =
                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)recv).$apply$G((int)(i168647)));
                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168652 =
                  ((t168650) * (((float)(t168651))));
                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168653 =
                  ((t168652) / (((float)(oracle168648))));
                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168654 =
                  ((t168649) - (((float)(t168653))));
                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168655 =
                  x10.lang.Math.abs$O((float)(t168654));
                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168656 =
                  ((t168655) > (((float)(1.0E-6F))));
                
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (t168656) {
                    
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.io.Printer t168657 =
                      ((x10.io.Printer)(x10.io.Console.ERR));
                    
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168658 =
                      (("recv(") + ((x10.core.Int.$box(i168647))));
                    
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168659 =
                      ((t168658) + ("): "));
                    
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168660 =
                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)recv).$apply$G((int)(i168647)));
                    
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168661 =
                      ((t168659) + ((x10.core.Float.$box(t168660))));
                    
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168662 =
                      ((t168661) + (" * "));
                    
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168663 =
                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)recv).$apply$G((int)(i168647)));
                    
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168664 =
                      ((t168662) + ((x10.core.Float.$box(t168663))));
                    
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168665 =
                      ((t168664) + (" = "));
                    
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168666 =
                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)recv).$apply$G((int)(i168647)));
                    
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168667 =
                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)recv).$apply$G((int)(i168647)));
                    
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168668 =
                      ((t168666) * (((float)(t168667))));
                    
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168669 =
                      ((t168665) + ((x10.core.Float.$box(t168668))));
                    
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168657.println(((java.lang.String)(t168669)));
                    
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
success = false;
                }
            }
            
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.io.Printer t168460 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168456 =
              success;
            
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
java.lang.String t168457 =
               null;
            
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (t168456) {
                
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168457 = "SUCCESS";
            } else {
                
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168457 = "FAIL";
            }
            
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168458 =
              t168457;
            
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168459 =
              ((t168458) + (" at "));
            
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168461 =
              ((t168459) + (p));
            
//#line 48 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168460.println(((java.lang.String)(t168461)));
            
//#line 50 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.util.CUDAUtilities.<x10.core.Float>deleteRemoteArray__0$1x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(remote)));
            }
            
            
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
public static void
                                                                                                                     doTest2(
                                                                                                                     final x10.lang.Place p){
                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t168462 =
                  ((x10.core.fun.Fun_0_1)(new CUDAKernelTest.$Closure$90()));
                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.Array<x10.core.Float> recv =
                  ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((int)(64)),
                                                                                                                               ((x10.core.fun.Fun_0_1)(t168462)),(java.lang.Class<?>[][][][]) null)));
                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t168463 =
                  ((x10.core.fun.Fun_0_1)(new CUDAKernelTest.$Closure$91()));
                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.RemoteArray<x10.core.Float> remote =
                  ((x10.array.RemoteArray)(x10.util.CUDAUtilities.<x10.core.Float>makeRemoteArray__2$1x10$lang$Int$3x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.lang.Place)(p)),
                                                                                                                                                (int)(64),
                                                                                                                                                ((x10.core.fun.Fun_0_1)(t168463)))));
                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.Array<x10.core.Float> arr1 =
                  ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((int)(64)))));
                
//#line 60 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.Array<x10.core.Int> arr2 =
                  ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(64)))));
                {
                    
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.ensureNotInAtomic();
                    
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.FinishState x10$__var78 =
                      x10.lang.Runtime.startFinish();
                    
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {try {{
                        {
                            
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.runAsync(((x10.lang.Place)(p)),
                                                                                                                                                             ((x10.core.fun.VoidFun_0_0)(new CUDAKernelTest.$Closure$96(arr1,
                                                                                                                                                                                                                        remote,(java.lang.Class<?>) null))));
                        }
                    }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__60__) {
                        
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__60__)));
                        
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
throw new x10.lang.RuntimeException();
                    }finally {{
                         
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var78)));
                     }}
                    }
                {
                    
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.ensureNotInAtomic();
                    
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.FinishState x10$__var79 =
                      x10.lang.Runtime.startFinish();
                    
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {try {{
                        {
                            
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.array.Array.<x10.core.Float>asyncCopy__0$1x10$array$Array$$T$2__2$1x10$array$Array$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(remote)),
                                                                                                                                                                                                                               (int)(0),
                                                                                                                                                                                                                               ((x10.array.Array)(recv)),
                                                                                                                                                                                                                               (int)(0),
                                                                                                                                                                                                                               (int)(64));
                        }
                    }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__61__) {
                        
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__61__)));
                        
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
throw new x10.lang.RuntimeException();
                    }finally {{
                         
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var79)));
                     }}
                    }
                
//#line 83 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
boolean success =
                  true;
                
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
int i168725 =
                  0;
                
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
for (;
                                                                                                                            true;
                                                                                                                            ) {
                    
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168726 =
                      i168725;
                    
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168727 =
                      ((t168726) < (((int)(64))));
                    
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (!(t168727)) {
                        
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
break;
                    }
                    
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168705 =
                      i168725;
                    
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168706 =
                      ((t168705) % (((int)(64))));
                    
//#line 85 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int oracle168707 =
                      ((63) - (((int)(t168706))));
                    
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168708 =
                      ((float)(int)(((int)(oracle168707))));
                    
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168709 =
                      i168725;
                    
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168710 =
                      x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)recv).$apply$G((int)(t168709)));
                    
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168711 =
                      ((t168708) - (((float)(t168710))));
                    
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168712 =
                      x10.lang.Math.abs$O((float)(t168711));
                    
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168713 =
                      ((t168712) > (((float)(1.0E-6F))));
                    
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (t168713) {
                        
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.io.Printer t168714 =
                          ((x10.io.Printer)(x10.io.Console.ERR));
                        
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168715 =
                          i168725;
                        
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168716 =
                          (("recv(") + ((x10.core.Int.$box(t168715))));
                        
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168717 =
                          ((t168716) + ("): "));
                        
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168718 =
                          i168725;
                        
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168719 =
                          x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)recv).$apply$G((int)(t168718)));
                        
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168720 =
                          ((t168717) + ((x10.core.Float.$box(t168719))));
                        
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168721 =
                          ((t168720) + (" not "));
                        
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168722 =
                          ((t168721) + ((x10.core.Int.$box(oracle168707))));
                        
//#line 87 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168714.println(((java.lang.String)(t168722)));
                        
//#line 88 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
success = false;
                    }
                    
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168723 =
                      i168725;
                    
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168724 =
                      ((t168723) + (((int)(1))));
                    
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
i168725 = t168724;
                }
                
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.io.Printer t168511 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168507 =
                  success;
                
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
java.lang.String t168508 =
                   null;
                
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (t168507) {
                    
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168508 = "SUCCESS";
                } else {
                    
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168508 = "FAIL";
                }
                
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168509 =
                  t168508;
                
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168510 =
                  ((t168509) + (" at "));
                
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168512 =
                  ((t168510) + (p));
                
//#line 91 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168511.println(((java.lang.String)(t168512)));
                
//#line 93 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.util.CUDAUtilities.<x10.core.Float>deleteRemoteArray__0$1x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(remote)));
                }
                
                
//#line 96 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
public static void
                                                                                                                         doTest3(
                                                                                                                         final x10.lang.Place p){
                    
//#line 98 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int blocks =
                      30;
                    
//#line 99 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int threads =
                      64;
                    
//#line 100 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int tids =
                      1920;
                    
//#line 102 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t168513 =
                      ((x10.core.fun.Fun_0_1)(new CUDAKernelTest.$Closure$97()));
                    
//#line 102 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.Array<x10.core.Float> recv =
                      ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((int)(tids)),
                                                                                                                                   ((x10.core.fun.Fun_0_1)(t168513)),(java.lang.Class<?>[][][][]) null)));
                    
//#line 104 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t168515 =
                      ((x10.core.fun.Fun_0_1)(new CUDAKernelTest.$Closure$98()));
                    
//#line 104 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.RemoteArray<x10.core.Float> remote =
                      ((x10.array.RemoteArray)(x10.util.CUDAUtilities.<x10.core.Float>makeRemoteArray__2$1x10$lang$Int$3x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.lang.Place)(p)),
                                                                                                                                                    (int)(tids),
                                                                                                                                                    ((x10.core.fun.Fun_0_1)(t168515)))));
                    
//#line 106 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.util.Random rnd =
                      ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).$init()));
                    
//#line 107 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t168517 =
                      ((x10.core.fun.Fun_0_1)(new CUDAKernelTest.$Closure$99(rnd)));
                    
//#line 107 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.Array<x10.core.Float> arr1 =
                      ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((int)(threads)),
                                                                                                                                   ((x10.core.fun.Fun_0_1)(t168517)),(java.lang.Class<?>[][][][]) null)));
                    {
                        
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.ensureNotInAtomic();
                        
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.FinishState x10$__var84 =
                          x10.lang.Runtime.startFinish();
                        
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {try {{
                            {
                                
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.runAsync(((x10.lang.Place)(p)),
                                                                                                                                                                  ((x10.core.fun.VoidFun_0_0)(new CUDAKernelTest.$Closure$102(arr1,
                                                                                                                                                                                                                              blocks,
                                                                                                                                                                                                                              threads,
                                                                                                                                                                                                                              remote,(java.lang.Class<?>) null))));
                            }
                        }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__64__) {
                            
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__64__)));
                            
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
throw new x10.lang.RuntimeException();
                        }finally {{
                             
//#line 109 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var84)));
                         }}
                        }
                    {
                        
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.ensureNotInAtomic();
                        
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.FinishState x10$__var85 =
                          x10.lang.Runtime.startFinish();
                        
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {try {{
                            {
                                
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168531 =
                                  ((x10.array.Array<x10.core.Float>)recv).
                                    size;
                                
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.array.Array.<x10.core.Float>asyncCopy__0$1x10$array$Array$$T$2__2$1x10$array$Array$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(remote)),
                                                                                                                                                                                                                                    (int)(0),
                                                                                                                                                                                                                                    ((x10.array.Array)(recv)),
                                                                                                                                                                                                                                    (int)(0),
                                                                                                                                                                                                                                    (int)(t168531));
                            }
                        }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__65__) {
                            
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__65__)));
                            
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
throw new x10.lang.RuntimeException();
                        }finally {{
                             
//#line 118 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var85)));
                         }}
                        }
                    
//#line 121 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
boolean success =
                      true;
                    
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.Region p168764 =
                      ((x10.array.Region)(((x10.array.Array<x10.core.Float>)recv).
                                            region));
                    
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168338min168765 =
                      p168764.min$O((int)(0));
                    
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168338max168766 =
                      p168764.max$O((int)(0));
                    
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
int i168761 =
                      i168338min168765;
                    
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
for (;
                                                                                                                                 true;
                                                                                                                                 ) {
                        
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168762 =
                          i168761;
                        
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168763 =
                          ((t168762) <= (((int)(i168338max168766))));
                        
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (!(t168763)) {
                            
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
break;
                        }
                        
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168758 =
                          i168761;
                        
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168745 =
                          ((i168758) % (((int)(threads))));
                        
//#line 123 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float oracle168746 =
                          x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)arr1).$apply$G((int)(t168745)));
                        
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168747 =
                          x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)recv).$apply$G((int)(i168758)));
                        
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168748 =
                          ((oracle168746) - (((float)(t168747))));
                        
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168749 =
                          x10.lang.Math.abs$O((float)(t168748));
                        
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168750 =
                          ((t168749) > (((float)(1.0E-6F))));
                        
//#line 124 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (t168750) {
                            
//#line 125 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.io.Printer t168751 =
                              ((x10.io.Printer)(x10.io.Console.ERR));
                            
//#line 125 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168752 =
                              (("recv(") + ((x10.core.Int.$box(i168758))));
                            
//#line 125 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168753 =
                              ((t168752) + ("): "));
                            
//#line 125 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168754 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)recv).$apply$G((int)(i168758)));
                            
//#line 125 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168755 =
                              ((t168753) + ((x10.core.Float.$box(t168754))));
                            
//#line 125 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168756 =
                              ((t168755) + (" not "));
                            
//#line 125 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168757 =
                              ((t168756) + ((x10.core.Float.$box(oracle168746))));
                            
//#line 125 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168751.println(((java.lang.String)(t168757)));
                            
//#line 126 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
success = false;
                        }
                        
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168759 =
                          i168761;
                        
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168760 =
                          ((t168759) + (((int)(1))));
                        
//#line 122 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
i168761 = t168760;
                    }
                    
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.io.Printer t168553 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168549 =
                      success;
                    
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
java.lang.String t168550 =
                       null;
                    
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (t168549) {
                        
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168550 = "SUCCESS";
                    } else {
                        
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168550 = "FAIL";
                    }
                    
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168551 =
                      t168550;
                    
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168552 =
                      ((t168551) + (" at "));
                    
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168554 =
                      ((t168552) + (p));
                    
//#line 129 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168553.println(((java.lang.String)(t168554)));
                    
//#line 131 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.util.CUDAUtilities.<x10.core.Float>deleteRemoteArray__0$1x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(remote)));
                    }
                    
                    
//#line 134 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
public static int
                                                                                                                              function$O(
                                                                                                                              final int x){
                        
//#line 134 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168555 =
                          ((x) * (((int)(x))));
                        
//#line 134 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168556 =
                          ((t168555) - (((int)(22))));
                        
//#line 134 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
return t168556;
                    }
                    
                    
//#line 136 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
public static void
                                                                                                                              doTest4(
                                                                                                                              final x10.lang.Place p){
                        
//#line 138 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int blocks =
                          30;
                        
//#line 139 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int threads =
                          64;
                        
//#line 140 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int tids =
                          1920;
                        
//#line 142 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t168557 =
                          ((x10.core.fun.Fun_0_1)(new CUDAKernelTest.$Closure$103()));
                        
//#line 142 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.Array<x10.core.Float> recv =
                          ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((int)(tids)),
                                                                                                                                       ((x10.core.fun.Fun_0_1)(t168557)),(java.lang.Class<?>[][][][]) null)));
                        
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t168559 =
                          ((x10.core.fun.Fun_0_1)(new CUDAKernelTest.$Closure$104()));
                        
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.RemoteArray<x10.core.Float> remote =
                          ((x10.array.RemoteArray)(x10.util.CUDAUtilities.<x10.core.Float>makeRemoteArray__2$1x10$lang$Int$3x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.lang.Place)(p)),
                                                                                                                                                        (int)(tids),
                                                                                                                                                        ((x10.core.fun.Fun_0_1)(t168559)))));
                        {
                            
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.ensureNotInAtomic();
                            
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.FinishState x10$__var90 =
                              x10.lang.Runtime.startFinish();
                            
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {try {{
                                {
                                    
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.runAsync(((x10.lang.Place)(p)),
                                                                                                                                                                      ((x10.core.fun.VoidFun_0_0)(new CUDAKernelTest.$Closure$107(blocks,
                                                                                                                                                                                                                                  threads,
                                                                                                                                                                                                                                  remote,(java.lang.Class<?>) null))));
                                }
                            }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__68__) {
                                
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__68__)));
                                
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
throw new x10.lang.RuntimeException();
                            }finally {{
                                 
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var90)));
                             }}
                            }
                        {
                            
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.ensureNotInAtomic();
                            
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.FinishState x10$__var91 =
                              x10.lang.Runtime.startFinish();
                            
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {try {{
                                {
                                    
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168573 =
                                      ((x10.array.Array<x10.core.Float>)recv).
                                        size;
                                    
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.array.Array.<x10.core.Float>asyncCopy__0$1x10$array$Array$$T$2__2$1x10$array$Array$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(remote)),
                                                                                                                                                                                                                                        (int)(0),
                                                                                                                                                                                                                                        ((x10.array.Array)(recv)),
                                                                                                                                                                                                                                        (int)(0),
                                                                                                                                                                                                                                        (int)(t168573));
                                }
                            }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__69__) {
                                
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__69__)));
                                
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
throw new x10.lang.RuntimeException();
                            }finally {{
                                 
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var91)));
                             }}
                            }
                        
//#line 158 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
boolean success =
                          true;
                        
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.Region p168804 =
                          ((x10.array.Region)(((x10.array.Array<x10.core.Float>)recv).
                                                region));
                        
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168389min168805 =
                          p168804.min$O((int)(0));
                        
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168389max168806 =
                          p168804.max$O((int)(0));
                        
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
int i168801 =
                          i168389min168805;
                        
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
for (;
                                                                                                                                     true;
                                                                                                                                     ) {
                            
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168802 =
                              i168801;
                            
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168803 =
                              ((t168802) <= (((int)(i168389max168806))));
                            
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (!(t168803)) {
                                
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
break;
                            }
                            
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168798 =
                              i168801;
                            
//#line 160 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int oracle168785 =
                              3;
                            
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168786 =
                              ((float)(int)(((int)(oracle168785))));
                            
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168787 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)recv).$apply$G((int)(i168798)));
                            
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168788 =
                              ((t168786) - (((float)(t168787))));
                            
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168789 =
                              x10.lang.Math.abs$O((float)(t168788));
                            
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168790 =
                              ((t168789) > (((float)(1.0E-6F))));
                            
//#line 161 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (t168790) {
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.io.Printer t168791 =
                                  ((x10.io.Printer)(x10.io.Console.ERR));
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168792 =
                                  (("recv(") + ((x10.core.Int.$box(i168798))));
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168793 =
                                  ((t168792) + ("): "));
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168794 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)recv).$apply$G((int)(i168798)));
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168795 =
                                  ((t168793) + ((x10.core.Float.$box(t168794))));
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168796 =
                                  ((t168795) + (" not "));
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168797 =
                                  ((t168796) + ((x10.core.Int.$box(oracle168785))));
                                
//#line 162 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168791.println(((java.lang.String)(t168797)));
                                
//#line 163 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
success = false;
                            }
                            
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168799 =
                              i168801;
                            
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168800 =
                              ((t168799) + (((int)(1))));
                            
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
i168801 = t168800;
                        }
                        
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.io.Printer t168595 =
                          ((x10.io.Printer)(x10.io.Console.OUT));
                        
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168591 =
                          success;
                        
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
java.lang.String t168592 =
                           null;
                        
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (t168591) {
                            
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168592 = "SUCCESS";
                        } else {
                            
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168592 = "FAIL";
                        }
                        
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168593 =
                          t168592;
                        
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168594 =
                          ((t168593) + (" at "));
                        
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168596 =
                          ((t168594) + (p));
                        
//#line 166 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168595.println(((java.lang.String)(t168596)));
                        
//#line 168 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.util.CUDAUtilities.<x10.core.Float>deleteRemoteArray__0$1x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(remote)));
                        }
                        
                        
//#line 172 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
                        private static final long serialVersionUID = 1L;
                        public static void main(java.lang.String[] args) {
                        // start native runtime
                        new $Main().start(args);
                        }
                        
                        // called by native runtime inside main x10 thread
                        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
                        // call the original app-main method
                        CUDAKernelTest.main(args);
                        }
                        }
                        
                        // the original app-main method
                        public static void main(final x10.array.Array<java.lang.String> args) {
                            
//#line 173 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168597 =
                              ((x10.array.Array<java.lang.String>)args).
                                size;
                            
//#line 173 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168599 =
                              ((int) t168597) ==
                            ((int) 1);
                            
//#line 173 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
int t168600 =
                               0;
                            
//#line 173 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (t168599) {
                                
//#line 173 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168598 =
                                  ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
                                
//#line 173 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168600 = java.lang.Integer.parseInt(t168598);
                            } else {
                                
//#line 173 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168600 = 1000;
                            }
                            
//#line 173 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int len =
                              t168600;
                            
//#line 175 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.Sequence<x10.lang.Place> t168830 =
                              x10.lang.Place.places();
                            
//#line 175 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.Iterator<x10.lang.Place> host168831 =
                              ((x10.lang.Iterator<x10.lang.Place>)
                                ((x10.lang.Iterable<x10.lang.Place>)t168830).iterator());
                            
//#line 175 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
for (;
                                                                                                                                         true;
                                                                                                                                         ) {
                                
//#line 175 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168832 =
                                  ((x10.lang.Iterator<x10.lang.Place>)host168831).hasNext$O();
                                
//#line 175 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (!(t168832)) {
                                    
//#line 175 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
break;
                                }
                                
//#line 175 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.Place host168815 =
                                  ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)host168831).next$G()));
                                
//#line 175 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.runAt(((x10.lang.Place)(host168815)),
                                                                                                                                                               ((x10.core.fun.VoidFun_0_0)(new CUDAKernelTest.$Closure$110(len))));
                            }
                        }
                        
                        
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final public CUDAKernelTest
                                                                                                                                 CUDAKernelTest$$CUDAKernelTest$this(
                                                                                                                                 ){
                            
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
return CUDAKernelTest.this;
                        }
                        
                        
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
// creation method for java code
                        public static CUDAKernelTest $make(){return new CUDAKernelTest((java.lang.System[]) null).$init();}
                        
                        // constructor for non-virtual call
                        final public CUDAKernelTest CUDAKernelTest$$init$S() { {
                                                                                      
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"

                                                                                      
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"

                                                                                  }
                                                                                  return this;
                                                                                  }
                        
                        // constructor
                        public CUDAKernelTest $init(){return CUDAKernelTest$$init$S();}
                        
                        
                        public static class $Closure$86 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                        {
                            private static final long serialVersionUID = 1L;
                            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$86.class);
                            
                            public static final x10.rtt.RuntimeType<$Closure$86> $RTT = new x10.rtt.StaticFunType<$Closure$86>(
                            /* base class */$Closure$86.class
                            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                            );
                            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                            
                            
                            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$86 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                            
                                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$86.class + " calling"); } 
                                return $_obj;
                                
                            }
                            
                            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                            
                                $Closure$86 $_obj = new $Closure$86((java.lang.System[]) null);
                                $deserializer.record_reference($_obj);
                                return $_deserialize_body($_obj, $deserializer);
                                
                            }
                            
                            public short $_get_serialization_id() {
                            
                                 return $_serialization_id;
                                
                            }
                            
                            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                            
                                
                            }
                            
                            // constructor just for allocation
                            public $Closure$86(final java.lang.System[] $dummy) { 
                            super($dummy);
                            }
                            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                            return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                            }
                            
                                
                                public float
                                  $apply$O(
                                  final int id$148350){
                                    
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168410 =
                                      ((float)(double)(((double)(0.0))));
                                    
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
return t168410;
                                }
                                
                                // creation method for java code
                                public static CUDAKernelTest.$Closure$86 $make(){return new $Closure$86();}
                                public $Closure$86() { {
                                                              
                                                          }}
                                
                            }
                            
                        public static class $Closure$87 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                        {
                            private static final long serialVersionUID = 1L;
                            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$87.class);
                            
                            public static final x10.rtt.RuntimeType<$Closure$87> $RTT = new x10.rtt.StaticVoidFunType<$Closure$87>(
                            /* base class */$Closure$87.class
                            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                            );
                            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                            
                            
                            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$87 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                            
                                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$87.class + " calling"); } 
                                $_obj.block168640 = $deserializer.readInt();
                                $_obj.thread168632 = $deserializer.readInt();
                                $_obj.len = $deserializer.readInt();
                                x10.array.Array init = (x10.array.Array) $deserializer.readRef();
                                $_obj.init = init;
                                x10.array.RemoteArray remote = (x10.array.RemoteArray) $deserializer.readRef();
                                $_obj.remote = remote;
                                return $_obj;
                                
                            }
                            
                            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                            
                                $Closure$87 $_obj = new $Closure$87((java.lang.System[]) null);
                                $deserializer.record_reference($_obj);
                                return $_deserialize_body($_obj, $deserializer);
                                
                            }
                            
                            public short $_get_serialization_id() {
                            
                                 return $_serialization_id;
                                
                            }
                            
                            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                            
                                $serializer.write(this.block168640);
                                $serializer.write(this.thread168632);
                                $serializer.write(this.len);
                                if (init instanceof x10.x10rt.X10JavaSerializable) {
                                $serializer.write( (x10.x10rt.X10JavaSerializable) this.init);
                                } else {
                                $serializer.write(this.init);
                                }
                                if (remote instanceof x10.x10rt.X10JavaSerializable) {
                                $serializer.write( (x10.x10rt.X10JavaSerializable) this.remote);
                                } else {
                                $serializer.write(this.remote);
                                }
                                
                            }
                            
                            // constructor just for allocation
                            public $Closure$87(final java.lang.System[] $dummy) { 
                            super($dummy);
                            }
                            
                                
                                public void
                                  $apply(
                                  ){
                                    
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168629 =
                                      ((this.
                                          block168640) * (((int)(64))));
                                    
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int tid168630 =
                                      ((t168629) + (((int)(this.
                                                             thread168632))));
                                    
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int tids168631 =
                                      512;
                                    
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
int i168626 =
                                      tid168630;
                                    
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
for (;
                                                                                                                                                true;
                                                                                                                                                ) {
                                        
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168627 =
                                          i168626;
                                        
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168628 =
                                          ((t168627) < (((int)(this.
                                                                 len))));
                                        
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (!(t168628)) {
                                            
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
break;
                                        }
                                        
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168620 =
                                          i168626;
                                        
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168621 =
                                          i168626;
                                        
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168622 =
                                          x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                                    init).$apply$G((int)(t168621)));
                                        
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168623 =
                                          (float)java.lang.Math.sqrt(((float)(t168622)));
                                        
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                                                                                                         remote).$set__1x10$array$RemoteArray$$T$G((int)(t168620),
                                                                                                                                                                                                                                   x10.core.Float.$box(t168623));
                                        
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168624 =
                                          i168626;
                                        
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168625 =
                                          ((t168624) + (((int)(tids168631))));
                                        
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
i168626 = t168625;
                                    }
                                }
                                
                                public int block168640;
                                public int thread168632;
                                public int len;
                                public x10.array.Array<x10.core.Float> init;
                                public x10.array.RemoteArray<x10.core.Float> remote;
                                
                                // creation method for java code
                                public static CUDAKernelTest.$Closure$87 $make(final int block168640,
                                                                               final int thread168632,
                                                                               final int len,
                                                                               final x10.array.Array<x10.core.Float> init,
                                                                               final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0){return new $Closure$87(block168640,thread168632,len,init,remote,(java.lang.Class<?>) null);}
                                public $Closure$87(final int block168640,
                                                   final int thread168632,
                                                   final int len,
                                                   final x10.array.Array<x10.core.Float> init,
                                                   final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0) { {
                                                                                                                                           this.block168640 = block168640;
                                                                                                                                           this.thread168632 = thread168632;
                                                                                                                                           this.len = len;
                                                                                                                                           this.init = ((x10.array.Array)(init));
                                                                                                                                           this.remote = ((x10.array.RemoteArray)(remote));
                                                                                                                                       }}
                                
                            }
                            
                        public static class $Closure$88 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                        {
                            private static final long serialVersionUID = 1L;
                            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$88.class);
                            
                            public static final x10.rtt.RuntimeType<$Closure$88> $RTT = new x10.rtt.StaticVoidFunType<$Closure$88>(
                            /* base class */$Closure$88.class
                            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                            );
                            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                            
                            
                            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$88 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                            
                                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$88.class + " calling"); } 
                                $_obj.block168640 = $deserializer.readInt();
                                $_obj.len = $deserializer.readInt();
                                x10.array.Array init = (x10.array.Array) $deserializer.readRef();
                                $_obj.init = init;
                                x10.array.RemoteArray remote = (x10.array.RemoteArray) $deserializer.readRef();
                                $_obj.remote = remote;
                                return $_obj;
                                
                            }
                            
                            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                            
                                $Closure$88 $_obj = new $Closure$88((java.lang.System[]) null);
                                $deserializer.record_reference($_obj);
                                return $_deserialize_body($_obj, $deserializer);
                                
                            }
                            
                            public short $_get_serialization_id() {
                            
                                 return $_serialization_id;
                                
                            }
                            
                            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                            
                                $serializer.write(this.block168640);
                                $serializer.write(this.len);
                                if (init instanceof x10.x10rt.X10JavaSerializable) {
                                $serializer.write( (x10.x10rt.X10JavaSerializable) this.init);
                                } else {
                                $serializer.write(this.init);
                                }
                                if (remote instanceof x10.x10rt.X10JavaSerializable) {
                                $serializer.write( (x10.x10rt.X10JavaSerializable) this.remote);
                                } else {
                                $serializer.write(this.remote);
                                }
                                
                            }
                            
                            // constructor just for allocation
                            public $Closure$88(final java.lang.System[] $dummy) { 
                            super($dummy);
                            }
                            
                                
                                public void
                                  $apply(
                                  ){
                                    {
                                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Clock x10$__var69 =
                                          null;
                                        {
                                            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.ensureNotInAtomic();
                                            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.FinishState x10$__var70 =
                                              x10.lang.Runtime.startFinish();
                                            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {try {{
                                                {
                                                    
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {{
                                                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.Clock x10$__var68 =
                                                          x10.lang.Clock.make();
                                                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10$__var69 = x10$__var68;
                                                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168233min168638 =
                                                          0;
                                                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168233max168639 =
                                                          63;
                                                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
int i168635 =
                                                          i168233min168638;
                                                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
for (;
                                                                                                                                                                    true;
                                                                                                                                                                    ) {
                                                            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168636 =
                                                              i168635;
                                                            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168637 =
                                                              ((t168636) <= (((int)(i168233max168639))));
                                                            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (!(t168637)) {
                                                                
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
break;
                                                            }
                                                            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int thread168632 =
                                                              i168635;
                                                            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.runAsync__0$1x10$lang$Clock$2(((x10.array.Array)(x10.core.ArrayFactory.<x10.lang.Clock> makeArrayFromJavaArray(x10.lang.Clock.$RTT, new x10.lang.Clock[] {x10$__var68}))),
                                                                                                                                                                                                                  ((x10.core.fun.VoidFun_0_0)(new CUDAKernelTest.$Closure$87(((int)(this.
                                                                                                                                                                                                                                                                                      block168640)),
                                                                                                                                                                                                                                                                             thread168632,
                                                                                                                                                                                                                                                                             ((int)(this.
                                                                                                                                                                                                                                                                                      len)),
                                                                                                                                                                                                                                                                             ((x10.array.Array)(this.
                                                                                                                                                                                                                                                                                                  init)),
                                                                                                                                                                                                                                                                             ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                                                        remote)),(java.lang.Class<?>) null))));
                                                            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168633 =
                                                              i168635;
                                                            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168634 =
                                                              ((t168633) + (((int)(1))));
                                                            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
i168635 = t168634;
                                                        }
                                                    }}finally {{
                                                          
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (((x10$__var69) != (null))) {
                                                              
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10$__var69.drop();
                                                          }
                                                      }}
                                                    }
                                                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__54__) {
                                                    
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__54__)));
                                                    
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
throw new x10.lang.RuntimeException();
                                                }finally {{
                                                     
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var70)));
                                                 }}
                                            }
                                        }
                                    }
                                    
                                    public int block168640;
                                    public int len;
                                    public x10.array.Array<x10.core.Float> init;
                                    public x10.array.RemoteArray<x10.core.Float> remote;
                                    
                                    // creation method for java code
                                    public static CUDAKernelTest.$Closure$88 $make(final int block168640,
                                                                                   final int len,
                                                                                   final x10.array.Array<x10.core.Float> init,
                                                                                   final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0){return new $Closure$88(block168640,len,init,remote,(java.lang.Class<?>) null);}
                                    public $Closure$88(final int block168640,
                                                       final int len,
                                                       final x10.array.Array<x10.core.Float> init,
                                                       final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0) { {
                                                                                                                                               this.block168640 = block168640;
                                                                                                                                               this.len = len;
                                                                                                                                               this.init = ((x10.array.Array)(init));
                                                                                                                                               this.remote = ((x10.array.RemoteArray)(remote));
                                                                                                                                           }}
                                    
                                }
                                
                                public static class $Closure$89 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                                {
                                    private static final long serialVersionUID = 1L;
                                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$89.class);
                                    
                                    public static final x10.rtt.RuntimeType<$Closure$89> $RTT = new x10.rtt.StaticVoidFunType<$Closure$89>(
                                    /* base class */$Closure$89.class
                                    , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                                    );
                                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                    
                                    
                                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$89 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                    
                                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$89.class + " calling"); } 
                                        $_obj.len = $deserializer.readInt();
                                        x10.array.Array init = (x10.array.Array) $deserializer.readRef();
                                        $_obj.init = init;
                                        x10.array.RemoteArray remote = (x10.array.RemoteArray) $deserializer.readRef();
                                        $_obj.remote = remote;
                                        return $_obj;
                                        
                                    }
                                    
                                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                    
                                        $Closure$89 $_obj = new $Closure$89((java.lang.System[]) null);
                                        $deserializer.record_reference($_obj);
                                        return $_deserialize_body($_obj, $deserializer);
                                        
                                    }
                                    
                                    public short $_get_serialization_id() {
                                    
                                         return $_serialization_id;
                                        
                                    }
                                    
                                    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                    
                                        $serializer.write(this.len);
                                        if (init instanceof x10.x10rt.X10JavaSerializable) {
                                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.init);
                                        } else {
                                        $serializer.write(this.init);
                                        }
                                        if (remote instanceof x10.x10rt.X10JavaSerializable) {
                                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.remote);
                                        } else {
                                        $serializer.write(this.remote);
                                        }
                                        
                                    }
                                    
                                    // constructor just for allocation
                                    public $Closure$89(final java.lang.System[] $dummy) { 
                                    super($dummy);
                                    }
                                    
                                        
                                        public void
                                          $apply(
                                          ){
                                            {
                                                
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.ensureNotInAtomic();
                                                
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.FinishState x10$__var71 =
                                                  x10.lang.Runtime.startFinish();
                                                
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {try {{
                                                    {
                                                        
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168249min168250 =
                                                          0;
                                                        
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168249max168251 =
                                                          7;
                                                        
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
int i168643 =
                                                          i168249min168250;
                                                        
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
for (;
                                                                                                                                                                    true;
                                                                                                                                                                    ) {
                                                            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168644 =
                                                              i168643;
                                                            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168645 =
                                                              ((t168644) <= (((int)(i168249max168251))));
                                                            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (!(t168645)) {
                                                                
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
break;
                                                            }
                                                            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int block168640 =
                                                              i168643;
                                                            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new CUDAKernelTest.$Closure$88(block168640,
                                                                                                                                                                                                                                                        ((int)(this.
                                                                                                                                                                                                                                                                 len)),
                                                                                                                                                                                                                                                        ((x10.array.Array)(this.
                                                                                                                                                                                                                                                                             init)),
                                                                                                                                                                                                                                                        ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                                   remote)),(java.lang.Class<?>) null))));
                                                            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168641 =
                                                              i168643;
                                                            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168642 =
                                                              ((t168641) + (((int)(1))));
                                                            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
i168643 = t168642;
                                                        }
                                                    }
                                                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__55__) {
                                                    
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__55__)));
                                                    
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
throw new x10.lang.RuntimeException();
                                                }finally {{
                                                     
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var71)));
                                                 }}
                                                }
                                            }
                                        
                                        public int len;
                                        public x10.array.Array<x10.core.Float> init;
                                        public x10.array.RemoteArray<x10.core.Float> remote;
                                        
                                        // creation method for java code
                                        public static CUDAKernelTest.$Closure$89 $make(final int len,
                                                                                       final x10.array.Array<x10.core.Float> init,
                                                                                       final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0){return new $Closure$89(len,init,remote,(java.lang.Class<?>) null);}
                                        public $Closure$89(final int len,
                                                           final x10.array.Array<x10.core.Float> init,
                                                           final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0) { {
                                                                                                                                                   this.len = len;
                                                                                                                                                   this.init = ((x10.array.Array)(init));
                                                                                                                                                   this.remote = ((x10.array.RemoteArray)(remote));
                                                                                                                                               }}
                                        
                                        }
                                        
                                    public static class $Closure$90 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                                    {
                                        private static final long serialVersionUID = 1L;
                                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$90.class);
                                        
                                        public static final x10.rtt.RuntimeType<$Closure$90> $RTT = new x10.rtt.StaticFunType<$Closure$90>(
                                        /* base class */$Closure$90.class
                                        , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                                        );
                                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                        
                                        
                                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$90 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                        
                                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$90.class + " calling"); } 
                                            return $_obj;
                                            
                                        }
                                        
                                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                        
                                            $Closure$90 $_obj = new $Closure$90((java.lang.System[]) null);
                                            $deserializer.record_reference($_obj);
                                            return $_deserialize_body($_obj, $deserializer);
                                            
                                        }
                                        
                                        public short $_get_serialization_id() {
                                        
                                             return $_serialization_id;
                                            
                                        }
                                        
                                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                        
                                            
                                        }
                                        
                                        // constructor just for allocation
                                        public $Closure$90(final java.lang.System[] $dummy) { 
                                        super($dummy);
                                        }
                                        // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                                        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                                        return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                                        }
                                        
                                            
                                            public float
                                              $apply$O(
                                              final int i){
                                                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
return 0.0F;
                                            }
                                            
                                            // creation method for java code
                                            public static CUDAKernelTest.$Closure$90 $make(){return new $Closure$90();}
                                            public $Closure$90() { {
                                                                          
                                                                      }}
                                            
                                        }
                                        
                                    public static class $Closure$91 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                                    {
                                        private static final long serialVersionUID = 1L;
                                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$91.class);
                                        
                                        public static final x10.rtt.RuntimeType<$Closure$91> $RTT = new x10.rtt.StaticFunType<$Closure$91>(
                                        /* base class */$Closure$91.class
                                        , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                                        );
                                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                        
                                        
                                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$91 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                        
                                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$91.class + " calling"); } 
                                            return $_obj;
                                            
                                        }
                                        
                                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                        
                                            $Closure$91 $_obj = new $Closure$91((java.lang.System[]) null);
                                            $deserializer.record_reference($_obj);
                                            return $_deserialize_body($_obj, $deserializer);
                                            
                                        }
                                        
                                        public short $_get_serialization_id() {
                                        
                                             return $_serialization_id;
                                            
                                        }
                                        
                                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                        
                                            
                                        }
                                        
                                        // constructor just for allocation
                                        public $Closure$91(final java.lang.System[] $dummy) { 
                                        super($dummy);
                                        }
                                        // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                                        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                                        return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                                        }
                                        
                                            
                                            public float
                                              $apply$O(
                                              final int id$148352){
                                                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
return 0.0F;
                                            }
                                            
                                            // creation method for java code
                                            public static CUDAKernelTest.$Closure$91 $make(){return new $Closure$91();}
                                            public $Closure$91() { {
                                                                          
                                                                      }}
                                            
                                        }
                                        
                                    public static class $Closure$92 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                                    {
                                        private static final long serialVersionUID = 1L;
                                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$92.class);
                                        
                                        public static final x10.rtt.RuntimeType<$Closure$92> $RTT = new x10.rtt.StaticFunType<$Closure$92>(
                                        /* base class */$Closure$92.class
                                        , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.INT), x10.rtt.Types.OBJECT}
                                        );
                                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                        
                                        
                                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$92 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                        
                                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$92.class + " calling"); } 
                                            return $_obj;
                                            
                                        }
                                        
                                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                        
                                            $Closure$92 $_obj = new $Closure$92((java.lang.System[]) null);
                                            $deserializer.record_reference($_obj);
                                            return $_deserialize_body($_obj, $deserializer);
                                            
                                        }
                                        
                                        public short $_get_serialization_id() {
                                        
                                             return $_serialization_id;
                                            
                                        }
                                        
                                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                        
                                            
                                        }
                                        
                                        // constructor just for allocation
                                        public $Closure$92(final java.lang.System[] $dummy) { 
                                        super($dummy);
                                        }
                                        // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                                        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                                        return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1)));
                                        }
                                        
                                            
                                            public int
                                              $apply$O(
                                              final int x168690){
                                                
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int tmp168691 =
                                                  ((x168690) + (((int)(10))));
                                                
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
return tmp168691;
                                            }
                                            
                                            // creation method for java code
                                            public static CUDAKernelTest.$Closure$92 $make(){return new $Closure$92();}
                                            public $Closure$92() { {
                                                                          
                                                                      }}
                                            
                                        }
                                        
                                    public static class $Closure$93 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                                    {
                                        private static final long serialVersionUID = 1L;
                                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$93.class);
                                        
                                        public static final x10.rtt.RuntimeType<$Closure$93> $RTT = new x10.rtt.StaticFunType<$Closure$93>(
                                        /* base class */$Closure$93.class
                                        , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                                        );
                                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                        
                                        
                                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$93 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                        
                                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$93.class + " calling"); } 
                                            return $_obj;
                                            
                                        }
                                        
                                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                        
                                            $Closure$93 $_obj = new $Closure$93((java.lang.System[]) null);
                                            $deserializer.record_reference($_obj);
                                            return $_deserialize_body($_obj, $deserializer);
                                            
                                        }
                                        
                                        public short $_get_serialization_id() {
                                        
                                             return $_serialization_id;
                                            
                                        }
                                        
                                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                        
                                            
                                        }
                                        
                                        // constructor just for allocation
                                        public $Closure$93(final java.lang.System[] $dummy) { 
                                        super($dummy);
                                        }
                                        // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                                        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                                        return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                                        }
                                        
                                            
                                            public float
                                              $apply$O(
                                              final int id$168695){
                                                
//#line 67 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
return 0.0F;
                                            }
                                            
                                            // creation method for java code
                                            public static CUDAKernelTest.$Closure$93 $make(){return new $Closure$93();}
                                            public $Closure$93() { {
                                                                          
                                                                      }}
                                            
                                        }
                                        
                                    public static class $Closure$94 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                                    {
                                        private static final long serialVersionUID = 1L;
                                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$94.class);
                                        
                                        public static final x10.rtt.RuntimeType<$Closure$94> $RTT = new x10.rtt.StaticVoidFunType<$Closure$94>(
                                        /* base class */$Closure$94.class
                                        , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                                        );
                                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                        
                                        
                                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$94 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                        
                                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$94.class + " calling"); } 
                                            $_obj.thread168682 = $deserializer.readInt();
                                            x10.array.Array shm168688 = (x10.array.Array) $deserializer.readRef();
                                            $_obj.shm168688 = shm168688;
                                            x10.array.Array shm168692 = (x10.array.Array) $deserializer.readRef();
                                            $_obj.shm168692 = shm168692;
                                            x10.array.Array shm168693 = (x10.array.Array) $deserializer.readRef();
                                            $_obj.shm168693 = shm168693;
                                            x10.array.RemoteArray remote = (x10.array.RemoteArray) $deserializer.readRef();
                                            $_obj.remote = remote;
                                            return $_obj;
                                            
                                        }
                                        
                                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                        
                                            $Closure$94 $_obj = new $Closure$94((java.lang.System[]) null);
                                            $deserializer.record_reference($_obj);
                                            return $_deserialize_body($_obj, $deserializer);
                                            
                                        }
                                        
                                        public short $_get_serialization_id() {
                                        
                                             return $_serialization_id;
                                            
                                        }
                                        
                                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                        
                                            $serializer.write(this.thread168682);
                                            if (shm168688 instanceof x10.x10rt.X10JavaSerializable) {
                                            $serializer.write( (x10.x10rt.X10JavaSerializable) this.shm168688);
                                            } else {
                                            $serializer.write(this.shm168688);
                                            }
                                            if (shm168692 instanceof x10.x10rt.X10JavaSerializable) {
                                            $serializer.write( (x10.x10rt.X10JavaSerializable) this.shm168692);
                                            } else {
                                            $serializer.write(this.shm168692);
                                            }
                                            if (shm168693 instanceof x10.x10rt.X10JavaSerializable) {
                                            $serializer.write( (x10.x10rt.X10JavaSerializable) this.shm168693);
                                            } else {
                                            $serializer.write(this.shm168693);
                                            }
                                            if (remote instanceof x10.x10rt.X10JavaSerializable) {
                                            $serializer.write( (x10.x10rt.X10JavaSerializable) this.remote);
                                            } else {
                                            $serializer.write(this.remote);
                                            }
                                            
                                        }
                                        
                                        // constructor just for allocation
                                        public $Closure$94(final java.lang.System[] $dummy) { 
                                        super($dummy);
                                        }
                                        
                                            
                                            public void
                                              $apply(
                                              ){
                                                
//#line 69 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168673 =
                                                  ((float)(int)(((int)(this.
                                                                         thread168682))));
                                                
//#line 69 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
((x10.array.Array<x10.core.Float>)this.
                                                                                                                                                                                           shm168688).$set__1x10$array$Array$$T$G((int)(this.
                                                                                                                                                                                                                                          thread168682),
                                                                                                                                                                                                                                  x10.core.Float.$box(t168673));
                                                
//#line 70 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Clock.advanceAll();
                                                
//#line 71 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168674 =
                                                  ((63) - (((int)(this.
                                                                    thread168682))));
                                                
//#line 71 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168675 =
                                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                                            shm168688).$apply$G((int)(t168674)));
                                                
//#line 71 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168676 =
                                                  ((int)(float)(((float)(t168675))));
                                                
//#line 71 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
((x10.array.Array<x10.core.Int>)this.
                                                                                                                                                                                         shm168692).$set__1x10$array$Array$$T$G((int)(this.
                                                                                                                                                                                                                                        thread168682),
                                                                                                                                                                                                                                x10.core.Int.$box(t168676));
                                                
//#line 72 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Clock.advanceAll();
                                                
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168677 =
                                                  ((63) - (((int)(this.
                                                                    thread168682))));
                                                
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168678 =
                                                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)this.
                                                                                                        shm168692).$apply$G((int)(t168677)));
                                                
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
((x10.array.Array<x10.core.Int>)this.
                                                                                                                                                                                         shm168693).$set__1x10$array$Array$$T$G((int)(this.
                                                                                                                                                                                                                                        thread168682),
                                                                                                                                                                                                                                x10.core.Int.$box(t168678));
                                                
//#line 74 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Clock.advanceAll();
                                                
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168679 =
                                                  ((63) - (((int)(this.
                                                                    thread168682))));
                                                
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168680 =
                                                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)this.
                                                                                                        shm168693).$apply$G((int)(t168679)));
                                                
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168681 =
                                                  ((float)(int)(((int)(t168680))));
                                                
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                                                                                                                 remote).$set__1x10$array$RemoteArray$$T$G((int)(this.
                                                                                                                                                                                                                                                   thread168682),
                                                                                                                                                                                                                                           x10.core.Float.$box(t168681));
                                            }
                                            
                                            public int thread168682;
                                            public x10.array.Array<x10.core.Float> shm168688;
                                            public x10.array.Array<x10.core.Int> shm168692;
                                            public x10.array.Array<x10.core.Int> shm168693;
                                            public x10.array.RemoteArray<x10.core.Float> remote;
                                            
                                            // creation method for java code
                                            public static CUDAKernelTest.$Closure$94 $make(final int thread168682,
                                                                                           final x10.array.Array<x10.core.Float> shm168688,
                                                                                           final x10.array.Array<x10.core.Int> shm168692,
                                                                                           final x10.array.Array<x10.core.Int> shm168693,
                                                                                           final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0){return new $Closure$94(thread168682,shm168688,shm168692,shm168693,remote,(java.lang.Class<?>) null);}
                                            public $Closure$94(final int thread168682,
                                                               final x10.array.Array<x10.core.Float> shm168688,
                                                               final x10.array.Array<x10.core.Int> shm168692,
                                                               final x10.array.Array<x10.core.Int> shm168693,
                                                               final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0) { {
                                                                                                                                                       this.thread168682 = thread168682;
                                                                                                                                                       this.shm168688 = ((x10.array.Array)(shm168688));
                                                                                                                                                       this.shm168692 = ((x10.array.Array)(shm168692));
                                                                                                                                                       this.shm168693 = ((x10.array.Array)(shm168693));
                                                                                                                                                       this.remote = ((x10.array.RemoteArray)(remote));
                                                                                                                                                   }}
                                            
                                        }
                                        
                                    public static class $Closure$95 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                                    {
                                        private static final long serialVersionUID = 1L;
                                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$95.class);
                                        
                                        public static final x10.rtt.RuntimeType<$Closure$95> $RTT = new x10.rtt.StaticVoidFunType<$Closure$95>(
                                        /* base class */$Closure$95.class
                                        , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                                        );
                                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                        
                                        
                                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$95 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                        
                                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$95.class + " calling"); } 
                                            x10.array.Array arr1 = (x10.array.Array) $deserializer.readRef();
                                            $_obj.arr1 = arr1;
                                            x10.array.RemoteArray remote = (x10.array.RemoteArray) $deserializer.readRef();
                                            $_obj.remote = remote;
                                            return $_obj;
                                            
                                        }
                                        
                                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                        
                                            $Closure$95 $_obj = new $Closure$95((java.lang.System[]) null);
                                            $deserializer.record_reference($_obj);
                                            return $_deserialize_body($_obj, $deserializer);
                                            
                                        }
                                        
                                        public short $_get_serialization_id() {
                                        
                                             return $_serialization_id;
                                            
                                        }
                                        
                                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                        
                                            if (arr1 instanceof x10.x10rt.X10JavaSerializable) {
                                            $serializer.write( (x10.x10rt.X10JavaSerializable) this.arr1);
                                            } else {
                                            $serializer.write(this.arr1);
                                            }
                                            if (remote instanceof x10.x10rt.X10JavaSerializable) {
                                            $serializer.write( (x10.x10rt.X10JavaSerializable) this.remote);
                                            } else {
                                            $serializer.write(this.remote);
                                            }
                                            
                                        }
                                        
                                        // constructor just for allocation
                                        public $Closure$95(final java.lang.System[] $dummy) { 
                                        super($dummy);
                                        }
                                        
                                            
                                            public void
                                              $apply(
                                              ){
                                                
//#line 64 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.Array<x10.core.Float> shm168688 =
                                                  ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((x10.array.Array)(this.
                                                                                                                                                                                    arr1)),(java.lang.Class<?>[][][][][][]) null)));
                                                
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> t168689 =
                                                  ((x10.core.fun.Fun_0_1)(new CUDAKernelTest.$Closure$92()));
                                                
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.Array<x10.core.Int> shm168692 =
                                                  ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(64)),
                                                                                                                                                           ((x10.core.fun.Fun_0_1)(t168689)),(java.lang.Class<?>[][][][]) null)));
                                                
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.Array<x10.core.Int> shm168693 =
                                                  ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(64)),
                                                                                                                                                           (x10.core.Int.$box(0)),(java.lang.Class<?>[][][][][]) null)));
                                                
//#line 67 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t168694 =
                                                  ((x10.core.fun.Fun_0_1)(new CUDAKernelTest.$Closure$93()));
                                                
//#line 67 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.Array<x10.core.Float> shm168696 =
                                                  ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((int)(64)),
                                                                                                                                                               ((x10.core.fun.Fun_0_1)(t168694)),(java.lang.Class<?>[][][][]) null)));
                                                {
                                                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Clock x10$__var75 =
                                                      null;
                                                    {
                                                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.ensureNotInAtomic();
                                                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.FinishState x10$__var76 =
                                                          x10.lang.Runtime.startFinish();
                                                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {try {{
                                                            {
                                                                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {{
                                                                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.Clock x10$__var74 =
                                                                      x10.lang.Clock.make();
                                                                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10$__var75 = x10$__var74;
                                                                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168273min168697 =
                                                                      0;
                                                                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168273max168698 =
                                                                      63;
                                                                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
int i168685 =
                                                                      i168273min168697;
                                                                    
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
for (;
                                                                                                                                                                                true;
                                                                                                                                                                                ) {
                                                                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168686 =
                                                                          i168685;
                                                                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168687 =
                                                                          ((t168686) <= (((int)(i168273max168698))));
                                                                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (!(t168687)) {
                                                                            
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
break;
                                                                        }
                                                                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int thread168682 =
                                                                          i168685;
                                                                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.runAsync__0$1x10$lang$Clock$2(((x10.array.Array)(x10.core.ArrayFactory.<x10.lang.Clock> makeArrayFromJavaArray(x10.lang.Clock.$RTT, new x10.lang.Clock[] {x10$__var74}))),
                                                                                                                                                                                                                              ((x10.core.fun.VoidFun_0_0)(new CUDAKernelTest.$Closure$94(thread168682,
                                                                                                                                                                                                                                                                                         shm168688,
                                                                                                                                                                                                                                                                                         shm168692,
                                                                                                                                                                                                                                                                                         shm168693,
                                                                                                                                                                                                                                                                                         ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                                                                    remote)),(java.lang.Class<?>) null))));
                                                                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168683 =
                                                                          i168685;
                                                                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168684 =
                                                                          ((t168683) + (((int)(1))));
                                                                        
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
i168685 = t168684;
                                                                    }
                                                                }}finally {{
                                                                      
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (((x10$__var75) != (null))) {
                                                                          
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10$__var75.drop();
                                                                      }
                                                                  }}
                                                                }
                                                            }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__58__) {
                                                                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__58__)));
                                                                
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
throw new x10.lang.RuntimeException();
                                                            }finally {{
                                                                 
//#line 68 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var76)));
                                                             }}
                                                        }
                                                    }
                                                }
                                                
                                                public x10.array.Array<x10.core.Float> arr1;
                                                public x10.array.RemoteArray<x10.core.Float> remote;
                                                
                                                // creation method for java code
                                                public static CUDAKernelTest.$Closure$95 $make(final x10.array.Array<x10.core.Float> arr1,
                                                                                               final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0){return new $Closure$95(arr1,remote,(java.lang.Class<?>) null);}
                                                public $Closure$95(final x10.array.Array<x10.core.Float> arr1,
                                                                   final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0) { {
                                                                                                                                                           this.arr1 = ((x10.array.Array)(arr1));
                                                                                                                                                           this.remote = ((x10.array.RemoteArray)(remote));
                                                                                                                                                       }}
                                                
                                            }
                                            
                                            public static class $Closure$96 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                                            {
                                                private static final long serialVersionUID = 1L;
                                                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$96.class);
                                                
                                                public static final x10.rtt.RuntimeType<$Closure$96> $RTT = new x10.rtt.StaticVoidFunType<$Closure$96>(
                                                /* base class */$Closure$96.class
                                                , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                                                );
                                                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                                
                                                
                                                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$96 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                
                                                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$96.class + " calling"); } 
                                                    x10.array.Array arr1 = (x10.array.Array) $deserializer.readRef();
                                                    $_obj.arr1 = arr1;
                                                    x10.array.RemoteArray remote = (x10.array.RemoteArray) $deserializer.readRef();
                                                    $_obj.remote = remote;
                                                    return $_obj;
                                                    
                                                }
                                                
                                                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                
                                                    $Closure$96 $_obj = new $Closure$96((java.lang.System[]) null);
                                                    $deserializer.record_reference($_obj);
                                                    return $_deserialize_body($_obj, $deserializer);
                                                    
                                                }
                                                
                                                public short $_get_serialization_id() {
                                                
                                                     return $_serialization_id;
                                                    
                                                }
                                                
                                                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                                
                                                    if (arr1 instanceof x10.x10rt.X10JavaSerializable) {
                                                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.arr1);
                                                    } else {
                                                    $serializer.write(this.arr1);
                                                    }
                                                    if (remote instanceof x10.x10rt.X10JavaSerializable) {
                                                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.remote);
                                                    } else {
                                                    $serializer.write(this.remote);
                                                    }
                                                    
                                                }
                                                
                                                // constructor just for allocation
                                                public $Closure$96(final java.lang.System[] $dummy) { 
                                                super($dummy);
                                                }
                                                
                                                    
                                                    public void
                                                      $apply(
                                                      ){
                                                        {
                                                            
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.ensureNotInAtomic();
                                                            
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.FinishState x10$__var77 =
                                                              x10.lang.Runtime.startFinish();
                                                            
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {try {{
                                                                {
                                                                    
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168289min168290 =
                                                                      0;
                                                                    
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168289max168291 =
                                                                      1;
                                                                    
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
int i168702 =
                                                                      i168289min168290;
                                                                    
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
for (;
                                                                                                                                                                                true;
                                                                                                                                                                                ) {
                                                                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168703 =
                                                                          i168702;
                                                                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168704 =
                                                                          ((t168703) <= (((int)(i168289max168291))));
                                                                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (!(t168704)) {
                                                                            
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
break;
                                                                        }
                                                                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int block168699 =
                                                                          i168702;
                                                                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new CUDAKernelTest.$Closure$95(((x10.array.Array)(this.
                                                                                                                                                                                                                                                                                         arr1)),
                                                                                                                                                                                                                                                                    ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                                               remote)),(java.lang.Class<?>) null))));
                                                                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168700 =
                                                                          i168702;
                                                                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168701 =
                                                                          ((t168700) + (((int)(1))));
                                                                        
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
i168702 = t168701;
                                                                    }
                                                                }
                                                            }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__59__) {
                                                                
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__59__)));
                                                                
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
throw new x10.lang.RuntimeException();
                                                            }finally {{
                                                                 
//#line 63 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var77)));
                                                             }}
                                                            }
                                                        }
                                                    
                                                    public x10.array.Array<x10.core.Float> arr1;
                                                    public x10.array.RemoteArray<x10.core.Float> remote;
                                                    
                                                    // creation method for java code
                                                    public static CUDAKernelTest.$Closure$96 $make(final x10.array.Array<x10.core.Float> arr1,
                                                                                                   final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0){return new $Closure$96(arr1,remote,(java.lang.Class<?>) null);}
                                                    public $Closure$96(final x10.array.Array<x10.core.Float> arr1,
                                                                       final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0) { {
                                                                                                                                                               this.arr1 = ((x10.array.Array)(arr1));
                                                                                                                                                               this.remote = ((x10.array.RemoteArray)(remote));
                                                                                                                                                           }}
                                                    
                                                    }
                                                    
                                                public static class $Closure$97 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                                                {
                                                    private static final long serialVersionUID = 1L;
                                                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$97.class);
                                                    
                                                    public static final x10.rtt.RuntimeType<$Closure$97> $RTT = new x10.rtt.StaticFunType<$Closure$97>(
                                                    /* base class */$Closure$97.class
                                                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                                                    );
                                                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                                    
                                                    
                                                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$97 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                    
                                                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$97.class + " calling"); } 
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
                                                    
                                                        
                                                    }
                                                    
                                                    // constructor just for allocation
                                                    public $Closure$97(final java.lang.System[] $dummy) { 
                                                    super($dummy);
                                                    }
                                                    // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                                                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                                                    return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                                                    }
                                                    
                                                        
                                                        public float
                                                          $apply$O(
                                                          final int i){
                                                            
//#line 102 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
return 0.0F;
                                                        }
                                                        
                                                        // creation method for java code
                                                        public static CUDAKernelTest.$Closure$97 $make(){return new $Closure$97();}
                                                        public $Closure$97() { {
                                                                                      
                                                                                  }}
                                                        
                                                    }
                                                    
                                                public static class $Closure$98 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                                                {
                                                    private static final long serialVersionUID = 1L;
                                                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$98.class);
                                                    
                                                    public static final x10.rtt.RuntimeType<$Closure$98> $RTT = new x10.rtt.StaticFunType<$Closure$98>(
                                                    /* base class */$Closure$98.class
                                                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                                                    );
                                                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                                    
                                                    
                                                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$98 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                    
                                                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$98.class + " calling"); } 
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
                                                    
                                                        
                                                    }
                                                    
                                                    // constructor just for allocation
                                                    public $Closure$98(final java.lang.System[] $dummy) { 
                                                    super($dummy);
                                                    }
                                                    // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                                                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                                                    return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                                                    }
                                                    
                                                        
                                                        public float
                                                          $apply$O(
                                                          final int id$148354){
                                                            
//#line 104 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168514 =
                                                              ((float)(double)(((double)(0.0))));
                                                            
//#line 104 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
return t168514;
                                                        }
                                                        
                                                        // creation method for java code
                                                        public static CUDAKernelTest.$Closure$98 $make(){return new $Closure$98();}
                                                        public $Closure$98() { {
                                                                                      
                                                                                  }}
                                                        
                                                    }
                                                    
                                                public static class $Closure$99 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                                                {
                                                    private static final long serialVersionUID = 1L;
                                                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$99.class);
                                                    
                                                    public static final x10.rtt.RuntimeType<$Closure$99> $RTT = new x10.rtt.StaticFunType<$Closure$99>(
                                                    /* base class */$Closure$99.class
                                                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                                                    );
                                                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                                    
                                                    
                                                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$99 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                    
                                                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$99.class + " calling"); } 
                                                        x10.util.Random rnd = (x10.util.Random) $deserializer.readRef();
                                                        $_obj.rnd = rnd;
                                                        return $_obj;
                                                        
                                                    }
                                                    
                                                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                    
                                                        $Closure$99 $_obj = new $Closure$99((java.lang.System[]) null);
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
                                                    public $Closure$99(final java.lang.System[] $dummy) { 
                                                    super($dummy);
                                                    }
                                                    // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                                                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                                                    return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                                                    }
                                                    
                                                        
                                                        public float
                                                          $apply$O(
                                                          final int i){
                                                            
//#line 107 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168516 =
                                                              this.
                                                                rnd.nextFloat$O();
                                                            
//#line 107 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
return t168516;
                                                        }
                                                        
                                                        public x10.util.Random rnd;
                                                        
                                                        // creation method for java code
                                                        public static CUDAKernelTest.$Closure$99 $make(final x10.util.Random rnd){return new $Closure$99(rnd);}
                                                        public $Closure$99(final x10.util.Random rnd) { {
                                                                                                               this.rnd = ((x10.util.Random)(rnd));
                                                                                                           }}
                                                        
                                                    }
                                                    
                                                public static class $Closure$100 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                                                {
                                                    private static final long serialVersionUID = 1L;
                                                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$100.class);
                                                    
                                                    public static final x10.rtt.RuntimeType<$Closure$100> $RTT = new x10.rtt.StaticVoidFunType<$Closure$100>(
                                                    /* base class */$Closure$100.class
                                                    , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                                                    );
                                                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                                    
                                                    
                                                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$100 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                    
                                                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$100.class + " calling"); } 
                                                        $_obj.threads = $deserializer.readInt();
                                                        $_obj.block168739 = $deserializer.readInt();
                                                        $_obj.thread168731 = $deserializer.readInt();
                                                        x10.lang.Sequence ccache = (x10.lang.Sequence) $deserializer.readRef();
                                                        $_obj.ccache = ccache;
                                                        x10.array.RemoteArray remote = (x10.array.RemoteArray) $deserializer.readRef();
                                                        $_obj.remote = remote;
                                                        return $_obj;
                                                        
                                                    }
                                                    
                                                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                    
                                                        $Closure$100 $_obj = new $Closure$100((java.lang.System[]) null);
                                                        $deserializer.record_reference($_obj);
                                                        return $_deserialize_body($_obj, $deserializer);
                                                        
                                                    }
                                                    
                                                    public short $_get_serialization_id() {
                                                    
                                                         return $_serialization_id;
                                                        
                                                    }
                                                    
                                                    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                                    
                                                        $serializer.write(this.threads);
                                                        $serializer.write(this.block168739);
                                                        $serializer.write(this.thread168731);
                                                        if (ccache instanceof x10.x10rt.X10JavaSerializable) {
                                                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.ccache);
                                                        } else {
                                                        $serializer.write(this.ccache);
                                                        }
                                                        if (remote instanceof x10.x10rt.X10JavaSerializable) {
                                                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.remote);
                                                        } else {
                                                        $serializer.write(this.remote);
                                                        }
                                                        
                                                    }
                                                    
                                                    // constructor just for allocation
                                                    public $Closure$100(final java.lang.System[] $dummy) { 
                                                    super($dummy);
                                                    }
                                                    
                                                        
                                                        public void
                                                          $apply(
                                                          ){
                                                            
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168728 =
                                                              ((this.
                                                                  threads) * (((int)(this.
                                                                                       block168739))));
                                                            
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168729 =
                                                              ((t168728) + (((int)(this.
                                                                                     thread168731))));
                                                            
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168730 =
                                                              x10.core.Float.$unbox(((x10.lang.Sequence<x10.core.Float>)this.
                                                                                                                          ccache).$apply$G((int)(this.
                                                                                                                                                   thread168731)));
                                                            
//#line 113 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                                                                                                                              remote).$set__1x10$array$RemoteArray$$T$G((int)(t168729),
                                                                                                                                                                                                                                                        x10.core.Float.$box(t168730));
                                                        }
                                                        
                                                        public int threads;
                                                        public int block168739;
                                                        public int thread168731;
                                                        public x10.lang.Sequence<x10.core.Float> ccache;
                                                        public x10.array.RemoteArray<x10.core.Float> remote;
                                                        
                                                        // creation method for java code
                                                        public static CUDAKernelTest.$Closure$100 $make(final int threads,
                                                                                                        final int block168739,
                                                                                                        final int thread168731,
                                                                                                        final x10.lang.Sequence<x10.core.Float> ccache,
                                                                                                        final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0){return new $Closure$100(threads,block168739,thread168731,ccache,remote,(java.lang.Class<?>) null);}
                                                        public $Closure$100(final int threads,
                                                                            final int block168739,
                                                                            final int thread168731,
                                                                            final x10.lang.Sequence<x10.core.Float> ccache,
                                                                            final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0) { {
                                                                                                                                                                    this.threads = threads;
                                                                                                                                                                    this.block168739 = block168739;
                                                                                                                                                                    this.thread168731 = thread168731;
                                                                                                                                                                    this.ccache = ((x10.lang.Sequence)(ccache));
                                                                                                                                                                    this.remote = ((x10.array.RemoteArray)(remote));
                                                                                                                                                                }}
                                                        
                                                    }
                                                    
                                                public static class $Closure$101 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                                                {
                                                    private static final long serialVersionUID = 1L;
                                                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$101.class);
                                                    
                                                    public static final x10.rtt.RuntimeType<$Closure$101> $RTT = new x10.rtt.StaticVoidFunType<$Closure$101>(
                                                    /* base class */$Closure$101.class
                                                    , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                                                    );
                                                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                                    
                                                    
                                                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$101 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                    
                                                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$101.class + " calling"); } 
                                                        $_obj.threads = $deserializer.readInt();
                                                        $_obj.block168739 = $deserializer.readInt();
                                                        x10.lang.Sequence ccache = (x10.lang.Sequence) $deserializer.readRef();
                                                        $_obj.ccache = ccache;
                                                        x10.array.RemoteArray remote = (x10.array.RemoteArray) $deserializer.readRef();
                                                        $_obj.remote = remote;
                                                        return $_obj;
                                                        
                                                    }
                                                    
                                                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                    
                                                        $Closure$101 $_obj = new $Closure$101((java.lang.System[]) null);
                                                        $deserializer.record_reference($_obj);
                                                        return $_deserialize_body($_obj, $deserializer);
                                                        
                                                    }
                                                    
                                                    public short $_get_serialization_id() {
                                                    
                                                         return $_serialization_id;
                                                        
                                                    }
                                                    
                                                    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                                    
                                                        $serializer.write(this.threads);
                                                        $serializer.write(this.block168739);
                                                        if (ccache instanceof x10.x10rt.X10JavaSerializable) {
                                                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.ccache);
                                                        } else {
                                                        $serializer.write(this.ccache);
                                                        }
                                                        if (remote instanceof x10.x10rt.X10JavaSerializable) {
                                                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.remote);
                                                        } else {
                                                        $serializer.write(this.remote);
                                                        }
                                                        
                                                    }
                                                    
                                                    // constructor just for allocation
                                                    public $Closure$101(final java.lang.System[] $dummy) { 
                                                    super($dummy);
                                                    }
                                                    
                                                        
                                                        public void
                                                          $apply(
                                                          ){
                                                            {
                                                                
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Clock x10$__var81 =
                                                                  null;
                                                                {
                                                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.ensureNotInAtomic();
                                                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.FinishState x10$__var82 =
                                                                      x10.lang.Runtime.startFinish();
                                                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {try {{
                                                                        {
                                                                            
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {{
                                                                                
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.Clock x10$__var80 =
                                                                                  x10.lang.Clock.make();
                                                                                
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10$__var81 = x10$__var80;
                                                                                
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168305min168737 =
                                                                                  0;
                                                                                
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168305max168738 =
                                                                                  63;
                                                                                
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
int i168734 =
                                                                                  i168305min168737;
                                                                                
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
for (;
                                                                                                                                                                                             true;
                                                                                                                                                                                             ) {
                                                                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168735 =
                                                                                      i168734;
                                                                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168736 =
                                                                                      ((t168735) <= (((int)(i168305max168738))));
                                                                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (!(t168736)) {
                                                                                        
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
break;
                                                                                    }
                                                                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int thread168731 =
                                                                                      i168734;
                                                                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.runAsync__0$1x10$lang$Clock$2(((x10.array.Array)(x10.core.ArrayFactory.<x10.lang.Clock> makeArrayFromJavaArray(x10.lang.Clock.$RTT, new x10.lang.Clock[] {x10$__var80}))),
                                                                                                                                                                                                                                           ((x10.core.fun.VoidFun_0_0)(new CUDAKernelTest.$Closure$100(this.
                                                                                                                                                                                                                                                                                                         threads,
                                                                                                                                                                                                                                                                                                       ((int)(this.
                                                                                                                                                                                                                                                                                                                block168739)),
                                                                                                                                                                                                                                                                                                       thread168731,
                                                                                                                                                                                                                                                                                                       ((x10.lang.Sequence)(this.
                                                                                                                                                                                                                                                                                                                              ccache)),
                                                                                                                                                                                                                                                                                                       ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                                                                                  remote)),(java.lang.Class<?>) null))));
                                                                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168732 =
                                                                                      i168734;
                                                                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168733 =
                                                                                      ((t168732) + (((int)(1))));
                                                                                    
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
i168734 = t168733;
                                                                                }
                                                                            }}finally {{
                                                                                  
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (((x10$__var81) != (null))) {
                                                                                      
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10$__var81.drop();
                                                                                  }
                                                                              }}
                                                                            }
                                                                        }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__62__) {
                                                                            
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__62__)));
                                                                            
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
throw new x10.lang.RuntimeException();
                                                                        }finally {{
                                                                             
//#line 112 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var82)));
                                                                         }}
                                                                    }
                                                                }
                                                            }
                                                            
                                                            public int threads;
                                                            public int block168739;
                                                            public x10.lang.Sequence<x10.core.Float> ccache;
                                                            public x10.array.RemoteArray<x10.core.Float> remote;
                                                            
                                                            // creation method for java code
                                                            public static CUDAKernelTest.$Closure$101 $make(final int threads,
                                                                                                            final int block168739,
                                                                                                            final x10.lang.Sequence<x10.core.Float> ccache,
                                                                                                            final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0){return new $Closure$101(threads,block168739,ccache,remote,(java.lang.Class<?>) null);}
                                                            public $Closure$101(final int threads,
                                                                                final int block168739,
                                                                                final x10.lang.Sequence<x10.core.Float> ccache,
                                                                                final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0) { {
                                                                                                                                                                        this.threads = threads;
                                                                                                                                                                        this.block168739 = block168739;
                                                                                                                                                                        this.ccache = ((x10.lang.Sequence)(ccache));
                                                                                                                                                                        this.remote = ((x10.array.RemoteArray)(remote));
                                                                                                                                                                    }}
                                                            
                                                        }
                                                        
                                                        public static class $Closure$102 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                                                        {
                                                            private static final long serialVersionUID = 1L;
                                                            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$102.class);
                                                            
                                                            public static final x10.rtt.RuntimeType<$Closure$102> $RTT = new x10.rtt.StaticVoidFunType<$Closure$102>(
                                                            /* base class */$Closure$102.class
                                                            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                                                            );
                                                            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                                            
                                                            
                                                            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                                            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$102 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                            
                                                                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$102.class + " calling"); } 
                                                                x10.array.Array arr1 = (x10.array.Array) $deserializer.readRef();
                                                                $_obj.arr1 = arr1;
                                                                $_obj.blocks = $deserializer.readInt();
                                                                $_obj.threads = $deserializer.readInt();
                                                                x10.array.RemoteArray remote = (x10.array.RemoteArray) $deserializer.readRef();
                                                                $_obj.remote = remote;
                                                                return $_obj;
                                                                
                                                            }
                                                            
                                                            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                            
                                                                $Closure$102 $_obj = new $Closure$102((java.lang.System[]) null);
                                                                $deserializer.record_reference($_obj);
                                                                return $_deserialize_body($_obj, $deserializer);
                                                                
                                                            }
                                                            
                                                            public short $_get_serialization_id() {
                                                            
                                                                 return $_serialization_id;
                                                                
                                                            }
                                                            
                                                            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                                            
                                                                if (arr1 instanceof x10.x10rt.X10JavaSerializable) {
                                                                $serializer.write( (x10.x10rt.X10JavaSerializable) this.arr1);
                                                                } else {
                                                                $serializer.write(this.arr1);
                                                                }
                                                                $serializer.write(this.blocks);
                                                                $serializer.write(this.threads);
                                                                if (remote instanceof x10.x10rt.X10JavaSerializable) {
                                                                $serializer.write( (x10.x10rt.X10JavaSerializable) this.remote);
                                                                } else {
                                                                $serializer.write(this.remote);
                                                                }
                                                                
                                                            }
                                                            
                                                            // constructor just for allocation
                                                            public $Closure$102(final java.lang.System[] $dummy) { 
                                                            super($dummy);
                                                            }
                                                            
                                                                
                                                                public void
                                                                  $apply(
                                                                  ){
                                                                    
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.Sequence<x10.core.Float> ccache =
                                                                      ((x10.lang.Sequence<x10.core.Float>)
                                                                        ((x10.array.Array<x10.core.Float>)this.
                                                                                                            arr1).sequence());
                                                                    {
                                                                        
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.ensureNotInAtomic();
                                                                        
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.FinishState x10$__var83 =
                                                                          x10.lang.Runtime.startFinish();
                                                                        
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {try {{
                                                                            {
                                                                                
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168321min168322 =
                                                                                  0;
                                                                                
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168321max168323 =
                                                                                  29;
                                                                                
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
int i168742 =
                                                                                  i168321min168322;
                                                                                
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
for (;
                                                                                                                                                                                             true;
                                                                                                                                                                                             ) {
                                                                                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168743 =
                                                                                      i168742;
                                                                                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168744 =
                                                                                      ((t168743) <= (((int)(i168321max168323))));
                                                                                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (!(t168744)) {
                                                                                        
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
break;
                                                                                    }
                                                                                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int block168739 =
                                                                                      i168742;
                                                                                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new CUDAKernelTest.$Closure$101(this.
                                                                                                                                                                                                                                                                                    threads,
                                                                                                                                                                                                                                                                                  block168739,
                                                                                                                                                                                                                                                                                  ccache,
                                                                                                                                                                                                                                                                                  ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                                                             remote)),(java.lang.Class<?>) null))));
                                                                                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168740 =
                                                                                      i168742;
                                                                                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168741 =
                                                                                      ((t168740) + (((int)(1))));
                                                                                    
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
i168742 = t168741;
                                                                                }
                                                                            }
                                                                        }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__63__) {
                                                                            
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__63__)));
                                                                            
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
throw new x10.lang.RuntimeException();
                                                                        }finally {{
                                                                             
//#line 111 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var83)));
                                                                         }}
                                                                        }
                                                                    }
                                                                
                                                                public x10.array.Array<x10.core.Float> arr1;
                                                                public int blocks;
                                                                public int threads;
                                                                public x10.array.RemoteArray<x10.core.Float> remote;
                                                                
                                                                // creation method for java code
                                                                public static CUDAKernelTest.$Closure$102 $make(final x10.array.Array<x10.core.Float> arr1,
                                                                                                                final int blocks,
                                                                                                                final int threads,
                                                                                                                final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0){return new $Closure$102(arr1,blocks,threads,remote,(java.lang.Class<?>) null);}
                                                                public $Closure$102(final x10.array.Array<x10.core.Float> arr1,
                                                                                    final int blocks,
                                                                                    final int threads,
                                                                                    final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0) { {
                                                                                                                                                                            this.arr1 = ((x10.array.Array)(arr1));
                                                                                                                                                                            this.blocks = blocks;
                                                                                                                                                                            this.threads = threads;
                                                                                                                                                                            this.remote = ((x10.array.RemoteArray)(remote));
                                                                                                                                                                        }}
                                                                
                                                                }
                                                                
                                                            public static class $Closure$103 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                                                            {
                                                                private static final long serialVersionUID = 1L;
                                                                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$103.class);
                                                                
                                                                public static final x10.rtt.RuntimeType<$Closure$103> $RTT = new x10.rtt.StaticFunType<$Closure$103>(
                                                                /* base class */$Closure$103.class
                                                                , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                                                                );
                                                                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                                                
                                                                
                                                                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                                                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$103 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                                
                                                                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$103.class + " calling"); } 
                                                                    return $_obj;
                                                                    
                                                                }
                                                                
                                                                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                                
                                                                    $Closure$103 $_obj = new $Closure$103((java.lang.System[]) null);
                                                                    $deserializer.record_reference($_obj);
                                                                    return $_deserialize_body($_obj, $deserializer);
                                                                    
                                                                }
                                                                
                                                                public short $_get_serialization_id() {
                                                                
                                                                     return $_serialization_id;
                                                                    
                                                                }
                                                                
                                                                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                                                
                                                                    
                                                                }
                                                                
                                                                // constructor just for allocation
                                                                public $Closure$103(final java.lang.System[] $dummy) { 
                                                                super($dummy);
                                                                }
                                                                // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                                                                public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                                                                return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                                                                }
                                                                
                                                                    
                                                                    public float
                                                                      $apply$O(
                                                                      final int i){
                                                                        
//#line 142 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
return 0.0F;
                                                                    }
                                                                    
                                                                    // creation method for java code
                                                                    public static CUDAKernelTest.$Closure$103 $make(){return new $Closure$103();}
                                                                    public $Closure$103() { {
                                                                                                   
                                                                                               }}
                                                                    
                                                                }
                                                                
                                                            public static class $Closure$104 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                                                            {
                                                                private static final long serialVersionUID = 1L;
                                                                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$104.class);
                                                                
                                                                public static final x10.rtt.RuntimeType<$Closure$104> $RTT = new x10.rtt.StaticFunType<$Closure$104>(
                                                                /* base class */$Closure$104.class
                                                                , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                                                                );
                                                                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                                                
                                                                
                                                                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                                                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$104 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                                
                                                                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$104.class + " calling"); } 
                                                                    return $_obj;
                                                                    
                                                                }
                                                                
                                                                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                                
                                                                    $Closure$104 $_obj = new $Closure$104((java.lang.System[]) null);
                                                                    $deserializer.record_reference($_obj);
                                                                    return $_deserialize_body($_obj, $deserializer);
                                                                    
                                                                }
                                                                
                                                                public short $_get_serialization_id() {
                                                                
                                                                     return $_serialization_id;
                                                                    
                                                                }
                                                                
                                                                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                                                
                                                                    
                                                                }
                                                                
                                                                // constructor just for allocation
                                                                public $Closure$104(final java.lang.System[] $dummy) { 
                                                                super($dummy);
                                                                }
                                                                // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                                                                public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                                                                return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                                                                }
                                                                
                                                                    
                                                                    public float
                                                                      $apply$O(
                                                                      final int id$148356){
                                                                        
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168558 =
                                                                          ((float)(double)(((double)(0.0))));
                                                                        
//#line 144 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
return t168558;
                                                                    }
                                                                    
                                                                    // creation method for java code
                                                                    public static CUDAKernelTest.$Closure$104 $make(){return new $Closure$104();}
                                                                    public $Closure$104() { {
                                                                                                   
                                                                                               }}
                                                                    
                                                                }
                                                                
                                                            public static class $Closure$105 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                                                            {
                                                                private static final long serialVersionUID = 1L;
                                                                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$105.class);
                                                                
                                                                public static final x10.rtt.RuntimeType<$Closure$105> $RTT = new x10.rtt.StaticVoidFunType<$Closure$105>(
                                                                /* base class */$Closure$105.class
                                                                , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                                                                );
                                                                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                                                
                                                                
                                                                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                                                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$105 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                                
                                                                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$105.class + " calling"); } 
                                                                    $_obj.threads = $deserializer.readInt();
                                                                    $_obj.block168779 = $deserializer.readInt();
                                                                    $_obj.thread168771 = $deserializer.readInt();
                                                                    x10.array.RemoteArray remote = (x10.array.RemoteArray) $deserializer.readRef();
                                                                    $_obj.remote = remote;
                                                                    return $_obj;
                                                                    
                                                                }
                                                                
                                                                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                                
                                                                    $Closure$105 $_obj = new $Closure$105((java.lang.System[]) null);
                                                                    $deserializer.record_reference($_obj);
                                                                    return $_deserialize_body($_obj, $deserializer);
                                                                    
                                                                }
                                                                
                                                                public short $_get_serialization_id() {
                                                                
                                                                     return $_serialization_id;
                                                                    
                                                                }
                                                                
                                                                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                                                
                                                                    $serializer.write(this.threads);
                                                                    $serializer.write(this.block168779);
                                                                    $serializer.write(this.thread168771);
                                                                    if (remote instanceof x10.x10rt.X10JavaSerializable) {
                                                                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.remote);
                                                                    } else {
                                                                    $serializer.write(this.remote);
                                                                    }
                                                                    
                                                                }
                                                                
                                                                // constructor just for allocation
                                                                public $Closure$105(final java.lang.System[] $dummy) { 
                                                                super($dummy);
                                                                }
                                                                
                                                                    
                                                                    public void
                                                                      $apply(
                                                                      ){
                                                                        
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int r168767 =
                                                                          CUDAKernelTest.function$O((int)(5));
                                                                        
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168768 =
                                                                          ((this.
                                                                              threads) * (((int)(this.
                                                                                                   block168779))));
                                                                        
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168769 =
                                                                          ((t168768) + (((int)(this.
                                                                                                 thread168771))));
                                                                        
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168770 =
                                                                          ((float)(int)(((int)(r168767))));
                                                                        
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                                                                                                                                          remote).$set__1x10$array$RemoteArray$$T$G((int)(t168769),
                                                                                                                                                                                                                                                                    x10.core.Float.$box(t168770));
                                                                    }
                                                                    
                                                                    public int threads;
                                                                    public int block168779;
                                                                    public int thread168771;
                                                                    public x10.array.RemoteArray<x10.core.Float> remote;
                                                                    
                                                                    // creation method for java code
                                                                    public static CUDAKernelTest.$Closure$105 $make(final int threads,
                                                                                                                    final int block168779,
                                                                                                                    final int thread168771,
                                                                                                                    final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0){return new $Closure$105(threads,block168779,thread168771,remote,(java.lang.Class<?>) null);}
                                                                    public $Closure$105(final int threads,
                                                                                        final int block168779,
                                                                                        final int thread168771,
                                                                                        final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0) { {
                                                                                                                                                                                this.threads = threads;
                                                                                                                                                                                this.block168779 = block168779;
                                                                                                                                                                                this.thread168771 = thread168771;
                                                                                                                                                                                this.remote = ((x10.array.RemoteArray)(remote));
                                                                                                                                                                            }}
                                                                    
                                                                }
                                                                
                                                            public static class $Closure$106 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                                                            {
                                                                private static final long serialVersionUID = 1L;
                                                                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$106.class);
                                                                
                                                                public static final x10.rtt.RuntimeType<$Closure$106> $RTT = new x10.rtt.StaticVoidFunType<$Closure$106>(
                                                                /* base class */$Closure$106.class
                                                                , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                                                                );
                                                                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                                                
                                                                
                                                                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                                                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$106 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                                
                                                                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$106.class + " calling"); } 
                                                                    $_obj.threads = $deserializer.readInt();
                                                                    $_obj.block168779 = $deserializer.readInt();
                                                                    x10.array.RemoteArray remote = (x10.array.RemoteArray) $deserializer.readRef();
                                                                    $_obj.remote = remote;
                                                                    return $_obj;
                                                                    
                                                                }
                                                                
                                                                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                                
                                                                    $Closure$106 $_obj = new $Closure$106((java.lang.System[]) null);
                                                                    $deserializer.record_reference($_obj);
                                                                    return $_deserialize_body($_obj, $deserializer);
                                                                    
                                                                }
                                                                
                                                                public short $_get_serialization_id() {
                                                                
                                                                     return $_serialization_id;
                                                                    
                                                                }
                                                                
                                                                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                                                
                                                                    $serializer.write(this.threads);
                                                                    $serializer.write(this.block168779);
                                                                    if (remote instanceof x10.x10rt.X10JavaSerializable) {
                                                                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.remote);
                                                                    } else {
                                                                    $serializer.write(this.remote);
                                                                    }
                                                                    
                                                                }
                                                                
                                                                // constructor just for allocation
                                                                public $Closure$106(final java.lang.System[] $dummy) { 
                                                                super($dummy);
                                                                }
                                                                
                                                                    
                                                                    public void
                                                                      $apply(
                                                                      ){
                                                                        {
                                                                            
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Clock x10$__var87 =
                                                                              null;
                                                                            {
                                                                                
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.ensureNotInAtomic();
                                                                                
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.FinishState x10$__var88 =
                                                                                  x10.lang.Runtime.startFinish();
                                                                                
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {try {{
                                                                                    {
                                                                                        
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {{
                                                                                            
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.Clock x10$__var86 =
                                                                                              x10.lang.Clock.make();
                                                                                            
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10$__var87 = x10$__var86;
                                                                                            
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168356min168777 =
                                                                                              0;
                                                                                            
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168356max168778 =
                                                                                              63;
                                                                                            
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
int i168774 =
                                                                                              i168356min168777;
                                                                                            
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
for (;
                                                                                                                                                                                                         true;
                                                                                                                                                                                                         ) {
                                                                                                
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168775 =
                                                                                                  i168774;
                                                                                                
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168776 =
                                                                                                  ((t168775) <= (((int)(i168356max168778))));
                                                                                                
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (!(t168776)) {
                                                                                                    
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
break;
                                                                                                }
                                                                                                
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int thread168771 =
                                                                                                  i168774;
                                                                                                
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.runAsync__0$1x10$lang$Clock$2(((x10.array.Array)(x10.core.ArrayFactory.<x10.lang.Clock> makeArrayFromJavaArray(x10.lang.Clock.$RTT, new x10.lang.Clock[] {x10$__var86}))),
                                                                                                                                                                                                                                                       ((x10.core.fun.VoidFun_0_0)(new CUDAKernelTest.$Closure$105(this.
                                                                                                                                                                                                                                                                                                                     threads,
                                                                                                                                                                                                                                                                                                                   ((int)(this.
                                                                                                                                                                                                                                                                                                                            block168779)),
                                                                                                                                                                                                                                                                                                                   thread168771,
                                                                                                                                                                                                                                                                                                                   ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                                                                                              remote)),(java.lang.Class<?>) null))));
                                                                                                
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168772 =
                                                                                                  i168774;
                                                                                                
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168773 =
                                                                                                  ((t168772) + (((int)(1))));
                                                                                                
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
i168774 = t168773;
                                                                                            }
                                                                                        }}finally {{
                                                                                              
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (((x10$__var87) != (null))) {
                                                                                                  
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10$__var87.drop();
                                                                                              }
                                                                                          }}
                                                                                        }
                                                                                    }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__66__) {
                                                                                        
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__66__)));
                                                                                        
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
throw new x10.lang.RuntimeException();
                                                                                    }finally {{
                                                                                         
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var88)));
                                                                                     }}
                                                                                }
                                                                            }
                                                                        }
                                                                        
                                                                        public int threads;
                                                                        public int block168779;
                                                                        public x10.array.RemoteArray<x10.core.Float> remote;
                                                                        
                                                                        // creation method for java code
                                                                        public static CUDAKernelTest.$Closure$106 $make(final int threads,
                                                                                                                        final int block168779,
                                                                                                                        final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0){return new $Closure$106(threads,block168779,remote,(java.lang.Class<?>) null);}
                                                                        public $Closure$106(final int threads,
                                                                                            final int block168779,
                                                                                            final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0) { {
                                                                                                                                                                                    this.threads = threads;
                                                                                                                                                                                    this.block168779 = block168779;
                                                                                                                                                                                    this.remote = ((x10.array.RemoteArray)(remote));
                                                                                                                                                                                }}
                                                                        
                                                                    }
                                                                    
                                                                    public static class $Closure$107 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                                                                    {
                                                                        private static final long serialVersionUID = 1L;
                                                                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$107.class);
                                                                        
                                                                        public static final x10.rtt.RuntimeType<$Closure$107> $RTT = new x10.rtt.StaticVoidFunType<$Closure$107>(
                                                                        /* base class */$Closure$107.class
                                                                        , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                                                                        );
                                                                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                                                        
                                                                        
                                                                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                                                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$107 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                                        
                                                                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$107.class + " calling"); } 
                                                                            $_obj.blocks = $deserializer.readInt();
                                                                            $_obj.threads = $deserializer.readInt();
                                                                            x10.array.RemoteArray remote = (x10.array.RemoteArray) $deserializer.readRef();
                                                                            $_obj.remote = remote;
                                                                            return $_obj;
                                                                            
                                                                        }
                                                                        
                                                                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                                        
                                                                            $Closure$107 $_obj = new $Closure$107((java.lang.System[]) null);
                                                                            $deserializer.record_reference($_obj);
                                                                            return $_deserialize_body($_obj, $deserializer);
                                                                            
                                                                        }
                                                                        
                                                                        public short $_get_serialization_id() {
                                                                        
                                                                             return $_serialization_id;
                                                                            
                                                                        }
                                                                        
                                                                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                                                        
                                                                            $serializer.write(this.blocks);
                                                                            $serializer.write(this.threads);
                                                                            if (remote instanceof x10.x10rt.X10JavaSerializable) {
                                                                            $serializer.write( (x10.x10rt.X10JavaSerializable) this.remote);
                                                                            } else {
                                                                            $serializer.write(this.remote);
                                                                            }
                                                                            
                                                                        }
                                                                        
                                                                        // constructor just for allocation
                                                                        public $Closure$107(final java.lang.System[] $dummy) { 
                                                                        super($dummy);
                                                                        }
                                                                        
                                                                            
                                                                            public void
                                                                              $apply(
                                                                              ){
                                                                                {
                                                                                    
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.ensureNotInAtomic();
                                                                                    
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.FinishState x10$__var89 =
                                                                                      x10.lang.Runtime.startFinish();
                                                                                    
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
try {try {{
                                                                                        {
                                                                                            
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168372min168373 =
                                                                                              0;
                                                                                            
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int i168372max168374 =
                                                                                              29;
                                                                                            
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
int i168782 =
                                                                                              i168372min168373;
                                                                                            
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
for (;
                                                                                                                                                                                                         true;
                                                                                                                                                                                                         ) {
                                                                                                
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168783 =
                                                                                                  i168782;
                                                                                                
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168784 =
                                                                                                  ((t168783) <= (((int)(i168372max168374))));
                                                                                                
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (!(t168784)) {
                                                                                                    
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
break;
                                                                                                }
                                                                                                
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int block168779 =
                                                                                                  i168782;
                                                                                                
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new CUDAKernelTest.$Closure$106(this.
                                                                                                                                                                                                                                                                                                threads,
                                                                                                                                                                                                                                                                                              block168779,
                                                                                                                                                                                                                                                                                              ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                                                                         remote)),(java.lang.Class<?>) null))));
                                                                                                
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168780 =
                                                                                                  i168782;
                                                                                                
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final int t168781 =
                                                                                                  ((t168780) + (((int)(1))));
                                                                                                
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
i168782 = t168781;
                                                                                            }
                                                                                        }
                                                                                    }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__67__) {
                                                                                        
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__67__)));
                                                                                        
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
throw new x10.lang.RuntimeException();
                                                                                    }finally {{
                                                                                         
//#line 147 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var89)));
                                                                                     }}
                                                                                    }
                                                                                }
                                                                            
                                                                            public int blocks;
                                                                            public int threads;
                                                                            public x10.array.RemoteArray<x10.core.Float> remote;
                                                                            
                                                                            // creation method for java code
                                                                            public static CUDAKernelTest.$Closure$107 $make(final int blocks,
                                                                                                                            final int threads,
                                                                                                                            final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0){return new $Closure$107(blocks,threads,remote,(java.lang.Class<?>) null);}
                                                                            public $Closure$107(final int blocks,
                                                                                                final int threads,
                                                                                                final x10.array.RemoteArray<x10.core.Float> remote,java.lang.Class<?> $dummy0) { {
                                                                                                                                                                                        this.blocks = blocks;
                                                                                                                                                                                        this.threads = threads;
                                                                                                                                                                                        this.remote = ((x10.array.RemoteArray)(remote));
                                                                                                                                                                                    }}
                                                                            
                                                                            }
                                                                            
                                                                        public static class $Closure$108 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                                                                        {
                                                                            private static final long serialVersionUID = 1L;
                                                                            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$108.class);
                                                                            
                                                                            public static final x10.rtt.RuntimeType<$Closure$108> $RTT = new x10.rtt.StaticFunType<$Closure$108>(
                                                                            /* base class */$Closure$108.class
                                                                            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                                                                            );
                                                                            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                                                            
                                                                            
                                                                            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                                                            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$108 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                                            
                                                                                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$108.class + " calling"); } 
                                                                                return $_obj;
                                                                                
                                                                            }
                                                                            
                                                                            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                                            
                                                                                $Closure$108 $_obj = new $Closure$108((java.lang.System[]) null);
                                                                                $deserializer.record_reference($_obj);
                                                                                return $_deserialize_body($_obj, $deserializer);
                                                                                
                                                                            }
                                                                            
                                                                            public short $_get_serialization_id() {
                                                                            
                                                                                 return $_serialization_id;
                                                                                
                                                                            }
                                                                            
                                                                            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                                                            
                                                                                
                                                                            }
                                                                            
                                                                            // constructor just for allocation
                                                                            public $Closure$108(final java.lang.System[] $dummy) { 
                                                                            super($dummy);
                                                                            }
                                                                            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                                                                            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                                                                            return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                                                                            }
                                                                            
                                                                                
                                                                                public float
                                                                                  $apply$O(
                                                                                  final int i168817){
                                                                                    
//#line 177 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168818 =
                                                                                      ((float)(int)(((int)(i168817))));
                                                                                    
//#line 177 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
return t168818;
                                                                                }
                                                                                
                                                                                // creation method for java code
                                                                                public static CUDAKernelTest.$Closure$108 $make(){return new $Closure$108();}
                                                                                public $Closure$108() { {
                                                                                                               
                                                                                                           }}
                                                                                
                                                                            }
                                                                            
                                                                        public static class $Closure$109 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                                                                        {
                                                                            private static final long serialVersionUID = 1L;
                                                                            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$109.class);
                                                                            
                                                                            public static final x10.rtt.RuntimeType<$Closure$109> $RTT = new x10.rtt.StaticFunType<$Closure$109>(
                                                                            /* base class */$Closure$109.class
                                                                            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                                                                            );
                                                                            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                                                            
                                                                            
                                                                            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                                                            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$109 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                                            
                                                                                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$109.class + " calling"); } 
                                                                                return $_obj;
                                                                                
                                                                            }
                                                                            
                                                                            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                                            
                                                                                $Closure$109 $_obj = new $Closure$109((java.lang.System[]) null);
                                                                                $deserializer.record_reference($_obj);
                                                                                return $_deserialize_body($_obj, $deserializer);
                                                                                
                                                                            }
                                                                            
                                                                            public short $_get_serialization_id() {
                                                                            
                                                                                 return $_serialization_id;
                                                                                
                                                                            }
                                                                            
                                                                            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                                                            
                                                                                
                                                                            }
                                                                            
                                                                            // constructor just for allocation
                                                                            public $Closure$109(final java.lang.System[] $dummy) { 
                                                                            super($dummy);
                                                                            }
                                                                            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                                                                            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                                                                            return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                                                                            }
                                                                            
                                                                                
                                                                                public float
                                                                                  $apply$O(
                                                                                  final int i168821){
                                                                                    
//#line 178 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final float t168822 =
                                                                                      ((float)(double)(((double)(0.0))));
                                                                                    
//#line 178 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
return t168822;
                                                                                }
                                                                                
                                                                                // creation method for java code
                                                                                public static CUDAKernelTest.$Closure$109 $make(){return new $Closure$109();}
                                                                                public $Closure$109() { {
                                                                                                               
                                                                                                           }}
                                                                                
                                                                            }
                                                                            
                                                                        public static class $Closure$110 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                                                                        {
                                                                            private static final long serialVersionUID = 1L;
                                                                            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$110.class);
                                                                            
                                                                            public static final x10.rtt.RuntimeType<$Closure$110> $RTT = new x10.rtt.StaticVoidFunType<$Closure$110>(
                                                                            /* base class */$Closure$110.class
                                                                            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                                                                            );
                                                                            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                                                                            
                                                                            
                                                                            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                                                                            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$110 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                                            
                                                                                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$110.class + " calling"); } 
                                                                                $_obj.len = $deserializer.readInt();
                                                                                return $_obj;
                                                                                
                                                                            }
                                                                            
                                                                            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                                                                            
                                                                                $Closure$110 $_obj = new $Closure$110((java.lang.System[]) null);
                                                                                $deserializer.record_reference($_obj);
                                                                                return $_deserialize_body($_obj, $deserializer);
                                                                                
                                                                            }
                                                                            
                                                                            public short $_get_serialization_id() {
                                                                            
                                                                                 return $_serialization_id;
                                                                                
                                                                            }
                                                                            
                                                                            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                                                                            
                                                                                $serializer.write(this.len);
                                                                                
                                                                            }
                                                                            
                                                                            // constructor just for allocation
                                                                            public $Closure$110(final java.lang.System[] $dummy) { 
                                                                            super($dummy);
                                                                            }
                                                                            
                                                                                
                                                                                public void
                                                                                  $apply(
                                                                                  ){
                                                                                    
//#line 177 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t168816 =
                                                                                      ((x10.core.fun.Fun_0_1)(new CUDAKernelTest.$Closure$108()));
                                                                                    
//#line 177 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.Array<x10.core.Float> init168819 =
                                                                                      ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(this.
                                                                                                                                                                                                     len,
                                                                                                                                                                                                   ((x10.core.fun.Fun_0_1)(t168816)),(java.lang.Class<?>[][][][]) null)));
                                                                                    
//#line 178 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t168820 =
                                                                                      ((x10.core.fun.Fun_0_1)(new CUDAKernelTest.$Closure$109()));
                                                                                    
//#line 178 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.Array<x10.core.Float> recv168823 =
                                                                                      ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(this.
                                                                                                                                                                                                     len,
                                                                                                                                                                                                   ((x10.core.fun.Fun_0_1)(t168820)),(java.lang.Class<?>[][][][]) null)));
                                                                                    
//#line 180 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
boolean done_work168824 =
                                                                                      false;
                                                                                    
//#line 182 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.array.Array<x10.lang.Place> t168811 =
                                                                                      ((x10.array.Array)(x10.lang.Runtime.home().children()));
                                                                                    
//#line 182 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.Iterable<x10.lang.Place> t168812 =
                                                                                      ((x10.lang.Iterable<x10.lang.Place>)
                                                                                        ((x10.array.Array<x10.lang.Place>)t168811).values());
                                                                                    
//#line 182 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.Iterator<x10.lang.Place> gpu168813 =
                                                                                      ((x10.lang.Iterator<x10.lang.Place>)
                                                                                        ((x10.lang.Iterable<x10.lang.Place>)t168812).iterator());
                                                                                    
//#line 182 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
for (;
                                                                                                                                                                                                 true;
                                                                                                                                                                                                 ) {
                                                                                        
//#line 182 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168814 =
                                                                                          ((x10.lang.Iterator<x10.lang.Place>)gpu168813).hasNext$O();
                                                                                        
//#line 182 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (!(t168814)) {
                                                                                            
//#line 182 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
break;
                                                                                        }
                                                                                        
//#line 182 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.lang.Place gpu168807 =
                                                                                          ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)gpu168813).next$G()));
                                                                                        
//#line 182 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168808 =
                                                                                          gpu168807.isCUDA$O();
                                                                                        
//#line 182 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (t168808) {
                                                                                            
//#line 183 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.io.Printer t168809 =
                                                                                              ((x10.io.Printer)(x10.io.Console.OUT));
                                                                                            
//#line 183 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168810 =
                                                                                              (("Running test on GPU called ") + (gpu168807));
                                                                                            
//#line 183 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168809.println(((java.lang.String)(t168810)));
                                                                                            
//#line 184 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
CUDAKernelTest.doTest1__0$1x10$lang$Float$2__1$1x10$lang$Float$2(((x10.array.Array)(init168819)),
                                                                                                                                                                                                                                                                     ((x10.array.Array)(recv168823)),
                                                                                                                                                                                                                                                                     ((x10.lang.Place)(gpu168807)),
                                                                                                                                                                                                                                                                     (int)(this.
                                                                                                                                                                                                                                                                             len));
                                                                                            
//#line 185 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
CUDAKernelTest.doTest2(((x10.lang.Place)(gpu168807)));
                                                                                            
//#line 186 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
CUDAKernelTest.doTest3(((x10.lang.Place)(gpu168807)));
                                                                                            
//#line 187 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
CUDAKernelTest.doTest4(((x10.lang.Place)(gpu168807)));
                                                                                            
//#line 188 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
done_work168824 = true;
                                                                                        }
                                                                                    }
                                                                                    
//#line 191 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168825 =
                                                                                      done_work168824;
                                                                                    
//#line 191 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final boolean t168826 =
                                                                                      !(t168825);
                                                                                    
//#line 191 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
if (t168826) {
                                                                                        
//#line 192 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.io.Printer t168827 =
                                                                                          ((x10.io.Printer)(x10.io.Console.OUT));
                                                                                        
//#line 192 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final java.lang.String t168828 =
                                                                                          (("Running test on CPU called ") + (x10.lang.Runtime.home()));
                                                                                        
//#line 192 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168827.println(((java.lang.String)(t168828)));
                                                                                        
//#line 193 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
final x10.io.Printer t168829 =
                                                                                          ((x10.io.Printer)(x10.io.Console.OUT));
                                                                                        
//#line 193 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
t168829.println(((java.lang.String)("Set X10RT_ACCELS=ALL to use GPUs if you have them.")));
                                                                                        
//#line 194 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
CUDAKernelTest.doTest1__0$1x10$lang$Float$2__1$1x10$lang$Float$2(((x10.array.Array)(init168819)),
                                                                                                                                                                                                                                                                 ((x10.array.Array)(recv168823)),
                                                                                                                                                                                                                                                                 ((x10.lang.Place)(x10.lang.Runtime.home())),
                                                                                                                                                                                                                                                                 (int)(this.
                                                                                                                                                                                                                                                                         len));
                                                                                        
//#line 195 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
CUDAKernelTest.doTest2(((x10.lang.Place)(x10.lang.Runtime.home())));
                                                                                        
//#line 196 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
CUDAKernelTest.doTest3(((x10.lang.Place)(x10.lang.Runtime.home())));
                                                                                        
//#line 197 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDAKernelTest.x10"
CUDAKernelTest.doTest4(((x10.lang.Place)(x10.lang.Runtime.home())));
                                                                                    }
                                                                                }
                                                                                
                                                                                public int len;
                                                                                
                                                                                // creation method for java code
                                                                                public static CUDAKernelTest.$Closure$110 $make(final int len){return new $Closure$110(len);}
                                                                                public $Closure$110(final int len) { {
                                                                                                                            this.len = len;
                                                                                                                        }}
                                                                                
                                                                            }
                                                                            
                                                                        
                                                                        }
                                                                        