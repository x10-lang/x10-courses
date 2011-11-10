
public class CUDA3DFD extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, CUDA3DFD.class);
    
    public static final x10.rtt.RuntimeType<CUDA3DFD> $RTT = new x10.rtt.NamedType<CUDA3DFD>(
    "CUDA3DFD", /* base class */CUDA3DFD.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(CUDA3DFD $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + CUDA3DFD.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        CUDA3DFD $_obj = new CUDA3DFD((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public CUDA3DFD(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 10 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
public static void
                                                                                                           init_data__0$1x10$lang$Float$2(
                                                                                                           final x10.array.Array<x10.core.Float> data,
                                                                                                           final int dimx,
                                                                                                           final int dimy,
                                                                                                           final int dimz){
            
//#line 12 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int off =
              0;
            
//#line 13 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int iz166897 =
              0;
            
//#line 13 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
for (;
                                                                                                                  true;
                                                                                                                  ) {
                
//#line 13 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166898 =
                  iz166897;
                
//#line 13 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166899 =
                  ((t166898) < (((int)(dimz))));
                
//#line 13 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (!(t166899)) {
                    
//#line 13 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
break;
                }
                
//#line 14 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int iy166892 =
                  0;
                
//#line 14 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
for (;
                                                                                                                      true;
                                                                                                                      ) {
                    
//#line 14 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166893 =
                      iy166892;
                    
//#line 14 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166894 =
                      ((t166893) < (((int)(dimy))));
                    
//#line 14 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (!(t166894)) {
                        
//#line 14 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
break;
                    }
                    
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int ix166887 =
                      0;
                    
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                        
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166888 =
                          ix166887;
                        
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166889 =
                          ((t166888) < (((int)(dimx))));
                        
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (!(t166889)) {
                            
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
break;
                        }
                        
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166879 =
                          off;
                        
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166880 =
                          ((t166879) + (((int)(1))));
                        
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166881 =
                          off = t166880;
                        
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166882 =
                          ((t166881) - (((int)(1))));
                        
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166883 =
                          iz166897;
                        
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166884 =
                          ((float)(int)(((int)(t166883))));
                        
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
((x10.array.Array<x10.core.Float>)data).$set__1x10$array$Array$$T$G((int)(t166882),
                                                                                                                                                                                             x10.core.Float.$box(t166884));
                        
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166885 =
                          ix166887;
                        
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166886 =
                          ((t166885) + (((int)(1))));
                        
//#line 15 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
ix166887 = t166886;
                    }
                    
//#line 14 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166890 =
                      iy166892;
                    
//#line 14 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166891 =
                      ((t166890) + (((int)(1))));
                    
//#line 14 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
iy166892 = t166891;
                }
                
//#line 13 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166895 =
                  iz166897;
                
//#line 13 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166896 =
                  ((t166895) + (((int)(1))));
                
//#line 13 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
iz166897 = t166896;
            }
        }
        
        
//#line 21 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
public static void
                                                                                                           random_data__0$1x10$lang$Float$2(
                                                                                                           final x10.array.Array<x10.core.Float> data,
                                                                                                           final int dimx,
                                                                                                           final int dimy,
                                                                                                           final int dimz,
                                                                                                           final int lower_bound,
                                                                                                           final int upper_bound){
            
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final long t166435 =
              ((long)(((int)(0))));
            
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.util.Random rnd =
              ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).$init(t166435)));
            
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int off =
              0;
            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int iz166918 =
              0;
            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
for (;
                                                                                                                  true;
                                                                                                                  ) {
                
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166919 =
                  iz166918;
                
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166920 =
                  ((t166919) < (((int)(dimz))));
                
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (!(t166920)) {
                    
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
break;
                }
                
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int iy166913 =
                  0;
                
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
for (;
                                                                                                                      true;
                                                                                                                      ) {
                    
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166914 =
                      iy166913;
                    
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166915 =
                      ((t166914) < (((int)(dimy))));
                    
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (!(t166915)) {
                        
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
break;
                    }
                    
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int ix166908 =
                      0;
                    
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                        
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166909 =
                          ix166908;
                        
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166910 =
                          ((t166909) < (((int)(dimx))));
                        
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (!(t166910)) {
                            
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
break;
                        }
                        
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166900 =
                          off;
                        
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166901 =
                          ((t166900) + (((int)(1))));
                        
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166902 =
                          off = t166901;
                        
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166903 =
                          ((t166902) - (((int)(1))));
                        
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166904 =
                          iz166918;
                        
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166905 =
                          ((float)(int)(((int)(t166904))));
                        
//#line 31 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
((x10.array.Array<x10.core.Float>)data).$set__1x10$array$Array$$T$G((int)(t166903),
                                                                                                                                                                                             x10.core.Float.$box(t166905));
                        
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166906 =
                          ix166908;
                        
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166907 =
                          ((t166906) + (((int)(1))));
                        
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
ix166908 = t166907;
                    }
                    
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166911 =
                      iy166913;
                    
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166912 =
                      ((t166911) + (((int)(1))));
                    
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
iy166913 = t166912;
                }
                
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166916 =
                  iz166918;
                
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166917 =
                  ((t166916) + (((int)(1))));
                
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
iz166918 = t166917;
            }
        }
        
        
//#line 36 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
public static void
                                                                                                           reference_3D__0$1x10$lang$Float$2__1$1x10$lang$Float$2__2$1x10$lang$Float$2(
                                                                                                           final x10.array.Array<x10.core.Float> output,
                                                                                                           final x10.array.Array<x10.core.Float> input,
                                                                                                           final x10.array.Array<x10.core.Float> coeff,
                                                                                                           final int dimx,
                                                                                                           final int dimy,
                                                                                                           final int dimz){
            
//#line 37 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
CUDA3DFD.reference_3D__0$1x10$lang$Float$2__1$1x10$lang$Float$2__2$1x10$lang$Float$2(((x10.array.Array)(output)),
                                                                                                                                                                                                  ((x10.array.Array)(input)),
                                                                                                                                                                                                  ((x10.array.Array)(coeff)),
                                                                                                                                                                                                  (int)(dimx),
                                                                                                                                                                                                  (int)(dimy),
                                                                                                                                                                                                  (int)(dimz),
                                                                                                                                                                                                  (int)(4));
        }
        
        
//#line 39 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
public static void
                                                                                                           reference_3D__0$1x10$lang$Float$2__1$1x10$lang$Float$2__2$1x10$lang$Float$2(
                                                                                                           final x10.array.Array<x10.core.Float> output,
                                                                                                           final x10.array.Array<x10.core.Float> input,
                                                                                                           final x10.array.Array<x10.core.Float> coeff,
                                                                                                           final int dimx,
                                                                                                           final int dimy,
                                                                                                           final int dimz,
                                                                                                           final int radius){
            
//#line 41 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int dimxy =
              ((dimx) * (((int)(dimy))));
            
//#line 43 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int output_off =
              0;
            
//#line 44 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int input_off =
              0;
            
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int iz167009 =
              0;
            
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
for (;
                                                                                                                  true;
                                                                                                                  ) {
                
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167010 =
                  iz167009;
                
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t167011 =
                  ((t167010) < (((int)(dimz))));
                
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (!(t167011)) {
                    
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
break;
                }
                
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int iy167004 =
                  0;
                
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
for (;
                                                                                                                      true;
                                                                                                                      ) {
                    
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167005 =
                      iy167004;
                    
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t167006 =
                      ((t167005) < (((int)(dimy))));
                    
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (!(t167006)) {
                        
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
break;
                    }
                    
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int ix166999 =
                      0;
                    
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                        
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167000 =
                          ix166999;
                        
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t167001 =
                          ((t167000) < (((int)(dimx))));
                        
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (!(t167001)) {
                            
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
break;
                        }
                        
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166972 =
                          ix166999;
                        
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
boolean t166973 =
                          ((t166972) >= (((int)(radius))));
                        
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t166973) {
                            
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166974 =
                              ix166999;
                            
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166975 =
                              ((dimx) - (((int)(radius))));
                            
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t166973 = ((t166974) < (((int)(t166975))));
                        }
                        
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
boolean t166976 =
                          t166973;
                        
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t166976) {
                            
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166977 =
                              iy167004;
                            
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t166976 = ((t166977) >= (((int)(radius))));
                        }
                        
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
boolean t166978 =
                          t166976;
                        
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t166978) {
                            
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166979 =
                              iy167004;
                            
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166980 =
                              ((dimy) - (((int)(radius))));
                            
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t166978 = ((t166979) < (((int)(t166980))));
                        }
                        
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
boolean t166981 =
                          t166978;
                        
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t166981) {
                            
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166982 =
                              iz167009;
                            
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t166981 = ((t166982) >= (((int)(radius))));
                        }
                        
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
boolean t166983 =
                          t166981;
                        
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t166983) {
                            
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166984 =
                              iz167009;
                            
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166985 =
                              ((dimz) - (((int)(radius))));
                            
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t166983 = ((t166984) < (((int)(t166985))));
                        }
                        
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166986 =
                          t166983;
                        
//#line 51 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t166986) {
                            
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166987 =
                              input_off;
                            
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166988 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)input).$apply$G((int)(t166987)));
                            
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166989 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)coeff).$apply$G((int)(0)));
                            
//#line 53 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
float valu166990 =
                              ((t166988) * (((float)(t166989))));
                            
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int ir166969 =
                              1;
                            
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
for (;
                                                                                                                                  true;
                                                                                                                                  ) {
                                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166970 =
                                  ir166969;
                                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166971 =
                                  ((t166970) <= (((int)(radius))));
                                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (!(t166971)) {
                                    
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
break;
                                }
                                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166921 =
                                  valu166990;
                                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166922 =
                                  ir166969;
                                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166923 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)coeff).$apply$G((int)(t166922)));
                                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166924 =
                                  input_off;
                                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166925 =
                                  ir166969;
                                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166926 =
                                  ((t166924) + (((int)(t166925))));
                                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166927 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)input).$apply$G((int)(t166926)));
                                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166928 =
                                  input_off;
                                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166929 =
                                  ir166969;
                                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166930 =
                                  ((t166928) - (((int)(t166929))));
                                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166931 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)input).$apply$G((int)(t166930)));
                                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166932 =
                                  ((t166927) + (((float)(t166931))));
                                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166933 =
                                  ((t166923) * (((float)(t166932))));
                                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166934 =
                                  ((t166921) + (((float)(t166933))));
                                
//#line 57 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
valu166990 = t166934;
                                
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166935 =
                                  valu166990;
                                
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166936 =
                                  ir166969;
                                
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166937 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)coeff).$apply$G((int)(t166936)));
                                
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166938 =
                                  input_off;
                                
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166939 =
                                  ir166969;
                                
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166940 =
                                  ((t166939) * (((int)(dimx))));
                                
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166941 =
                                  ((t166938) + (((int)(t166940))));
                                
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166942 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)input).$apply$G((int)(t166941)));
                                
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166943 =
                                  input_off;
                                
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166944 =
                                  ir166969;
                                
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166945 =
                                  ((t166944) * (((int)(dimx))));
                                
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166946 =
                                  ((t166943) - (((int)(t166945))));
                                
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166947 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)input).$apply$G((int)(t166946)));
                                
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166948 =
                                  ((t166942) + (((float)(t166947))));
                                
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166949 =
                                  ((t166937) * (((float)(t166948))));
                                
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166950 =
                                  ((t166935) + (((float)(t166949))));
                                
//#line 58 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
valu166990 = t166950;
                                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166951 =
                                  valu166990;
                                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166952 =
                                  ir166969;
                                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166953 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)coeff).$apply$G((int)(t166952)));
                                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166954 =
                                  input_off;
                                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166955 =
                                  ir166969;
                                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166956 =
                                  ((t166955) * (((int)(dimxy))));
                                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166957 =
                                  ((t166954) + (((int)(t166956))));
                                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166958 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)input).$apply$G((int)(t166957)));
                                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166959 =
                                  input_off;
                                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166960 =
                                  ir166969;
                                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166961 =
                                  ((t166960) * (((int)(dimxy))));
                                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166962 =
                                  ((t166959) - (((int)(t166961))));
                                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166963 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)input).$apply$G((int)(t166962)));
                                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166964 =
                                  ((t166958) + (((float)(t166963))));
                                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166965 =
                                  ((t166953) * (((float)(t166964))));
                                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166966 =
                                  ((t166951) + (((float)(t166965))));
                                
//#line 59 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
valu166990 = t166966;
                                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166967 =
                                  ir166969;
                                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166968 =
                                  ((t166967) + (((int)(1))));
                                
//#line 55 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
ir166969 = t166968;
                            }
                            
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166991 =
                              output_off;
                            
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166992 =
                              valu166990;
                            
//#line 62 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
((x10.array.Array<x10.core.Float>)output).$set__1x10$array$Array$$T$G((int)(t166991),
                                                                                                                                                                                                   x10.core.Float.$box(t166992));
                        }
                        
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166993 =
                          output_off;
                        
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166994 =
                          ((t166993) + (((int)(1))));
                        
//#line 65 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
output_off = t166994;
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166995 =
                          input_off;
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166996 =
                          ((t166995) + (((int)(1))));
                        
//#line 66 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
input_off = t166996;
                        
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166997 =
                          ix166999;
                        
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166998 =
                          ((t166997) + (((int)(1))));
                        
//#line 49 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
ix166999 = t166998;
                    }
                    
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167002 =
                      iy167004;
                    
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167003 =
                      ((t167002) + (((int)(1))));
                    
//#line 47 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
iy167004 = t167003;
                }
                
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167007 =
                  iz167009;
                
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167008 =
                  ((t167007) + (((int)(1))));
                
//#line 45 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
iz167009 = t167008;
            }
        }
        
        
//#line 72 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
public static boolean
                                                                                                           within_epsilon__0$1x10$lang$Float$2__1$1x10$lang$Float$2$O(
                                                                                                           final x10.array.Array<x10.core.Float> output,
                                                                                                           final x10.array.Array<x10.core.Float> reference,
                                                                                                           final int dimx,
                                                                                                           final int dimy,
                                                                                                           final int dimz){
            
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166547 =
              CUDA3DFD.within_epsilon__0$1x10$lang$Float$2__1$1x10$lang$Float$2$O(((x10.array.Array)(output)),
                                                                                  ((x10.array.Array)(reference)),
                                                                                  (int)(dimx),
                                                                                  (int)(dimy),
                                                                                  (int)(dimz),
                                                                                  (int)(4));
            
//#line 73 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
return t166547;
        }
        
        
//#line 74 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
public static boolean
                                                                                                           within_epsilon__0$1x10$lang$Float$2__1$1x10$lang$Float$2$O(
                                                                                                           final x10.array.Array<x10.core.Float> output,
                                                                                                           final x10.array.Array<x10.core.Float> reference,
                                                                                                           final int dimx,
                                                                                                           final int dimy,
                                                                                                           final int dimz,
                                                                                                           final int radius){
            
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166548 =
              CUDA3DFD.within_epsilon__0$1x10$lang$Float$2__1$1x10$lang$Float$2$O(((x10.array.Array)(output)),
                                                                                  ((x10.array.Array)(reference)),
                                                                                  (int)(dimx),
                                                                                  (int)(dimy),
                                                                                  (int)(dimz),
                                                                                  (int)(radius),
                                                                                  (int)(-1));
            
//#line 75 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
return t166548;
        }
        
        
//#line 76 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
public static boolean
                                                                                                           within_epsilon__0$1x10$lang$Float$2__1$1x10$lang$Float$2$O(
                                                                                                           final x10.array.Array<x10.core.Float> output,
                                                                                                           final x10.array.Array<x10.core.Float> reference,
                                                                                                           final int dimx,
                                                                                                           final int dimy,
                                                                                                           final int dimz,
                                                                                                           final int radius,
                                                                                                           final int zadjust){
            
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166549 =
              CUDA3DFD.within_epsilon__0$1x10$lang$Float$2__1$1x10$lang$Float$2$O(((x10.array.Array)(output)),
                                                                                  ((x10.array.Array)(reference)),
                                                                                  (int)(dimx),
                                                                                  (int)(dimy),
                                                                                  (int)(dimz),
                                                                                  (int)(radius),
                                                                                  (int)(zadjust),
                                                                                  (float)(1.0E-4F));
            
//#line 77 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
return t166549;
        }
        
        
//#line 78 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
public static boolean
                                                                                                           within_epsilon__0$1x10$lang$Float$2__1$1x10$lang$Float$2$O(
                                                                                                           final x10.array.Array<x10.core.Float> output,
                                                                                                           final x10.array.Array<x10.core.Float> reference,
                                                                                                           final int dimx,
                                                                                                           final int dimy,
                                                                                                           final int dimz,
                                                                                                           final int radius,
                                                                                                           final int zadjust,
                                                                                                           final float delta){
            
//#line 80 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
boolean retval =
              true;
            
//#line 82 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int output_off =
              0;
            
//#line 83 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int ref_off =
              0;
            
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int iz167061 =
              0;
            
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
for (;
                                                                                                                  true;
                                                                                                                  ) {
                
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167062 =
                  iz167061;
                
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t167063 =
                  ((t167062) < (((int)(dimz))));
                
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (!(t167063)) {
                    
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
break;
                }
                
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int iy167056 =
                  0;
                
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
for (;
                                                                                                                      true;
                                                                                                                      ) {
                    
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167057 =
                      iy167056;
                    
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t167058 =
                      ((t167057) < (((int)(dimy))));
                    
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (!(t167058)) {
                        
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
break;
                    }
                    
//#line 88 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int ix167051 =
                      0;
                    
//#line 88 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
for (;
                                                                                                                          true;
                                                                                                                          ) {
                        
//#line 88 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167052 =
                          ix167051;
                        
//#line 88 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t167053 =
                          ((t167052) < (((int)(dimx))));
                        
//#line 88 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (!(t167053)) {
                            
//#line 88 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
break;
                        }
                        
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167012 =
                          ix167051;
                        
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
boolean t167013 =
                          ((t167012) >= (((int)(radius))));
                        
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t167013) {
                            
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167014 =
                              ix167051;
                            
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167015 =
                              ((dimx) - (((int)(radius))));
                            
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t167013 = ((t167014) < (((int)(t167015))));
                        }
                        
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
boolean t167016 =
                          t167013;
                        
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t167016) {
                            
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167017 =
                              iy167056;
                            
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t167016 = ((t167017) >= (((int)(radius))));
                        }
                        
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
boolean t167018 =
                          t167016;
                        
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t167018) {
                            
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167019 =
                              iy167056;
                            
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167020 =
                              ((dimy) - (((int)(radius))));
                            
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t167018 = ((t167019) < (((int)(t167020))));
                        }
                        
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
boolean t167021 =
                          t167018;
                        
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t167021) {
                            
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167022 =
                              iz167061;
                            
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t167021 = ((t167022) >= (((int)(radius))));
                        }
                        
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
boolean t167023 =
                          t167021;
                        
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t167023) {
                            
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167024 =
                              iz167061;
                            
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167025 =
                              ((dimz) - (((int)(radius))));
                            
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167026 =
                              ((t167025) + (((int)(zadjust))));
                            
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t167023 = ((t167024) < (((int)(t167026))));
                        }
                        
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t167027 =
                          t167023;
                        
//#line 90 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t167027) {
                            
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167028 =
                              ref_off;
                            
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167029 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)reference).$apply$G((int)(t167028)));
                            
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167030 =
                              output_off;
                            
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167031 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)output).$apply$G((int)(t167030)));
                            
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167032 =
                              ((t167029) - (((float)(t167031))));
                            
//#line 92 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float difference167033 =
                              x10.lang.Math.abs$O((float)(t167032));
                            
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t167034 =
                              ((difference167033) > (((float)(delta))));
                            
//#line 94 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t167034) {
                                
//#line 96 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
retval = false;
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.io.Printer t167035 =
                                  ((x10.io.Printer)(x10.io.Console.OUT));
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167036 =
                                  ix167051;
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167037 =
                                  iy167056;
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167038 =
                                  iz167061;
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167039 =
                                  output_off;
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167040 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)output).$apply$G((int)(t167039)));
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167041 =
                                  ref_off;
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167042 =
                                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)reference).$apply$G((int)(t167041)));
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.array.Array<java.lang.Object> t167043 =
                                  ((x10.array.Array)(x10.core.ArrayFactory.<java.lang.Object> makeArrayFromJavaArray(x10.rtt.Types.ANY, new java.lang.Object[] {t167036, t167037, t167038, t167040, t167042})));
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final java.lang.String t167044 =
                                  x10.core.String.format(" ERROR: (%d,%d,%d)\t%.2f instead of %.2f",(Object[]) (t167043).raw().value);
                                
//#line 97 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t167035.println(((java.lang.String)(t167044)));
                                
//#line 99 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
return false;
                            }
                        }
                        
//#line 104 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167045 =
                          output_off;
                        
//#line 104 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167046 =
                          ((t167045) + (((int)(1))));
                        
//#line 104 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
output_off = t167046;
                        
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167047 =
                          ref_off;
                        
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167048 =
                          ((t167047) + (((int)(1))));
                        
//#line 105 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
ref_off = t167048;
                        
//#line 88 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167049 =
                          ix167051;
                        
//#line 88 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167050 =
                          ((t167049) + (((int)(1))));
                        
//#line 88 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
ix167051 = t167050;
                    }
                    
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167054 =
                      iy167056;
                    
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167055 =
                      ((t167054) + (((int)(1))));
                    
//#line 86 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
iy167056 = t167055;
                }
                
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167059 =
                  iz167061;
                
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167060 =
                  ((t167059) + (((int)(1))));
                
//#line 84 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
iz167061 = t167060;
            }
            
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166601 =
              retval;
            
//#line 110 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
return t166601;
        }
        
        
//#line 114 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        CUDA3DFD.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> args) {
            
//#line 130 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int nreps =
              1;
            
//#line 131 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
boolean check_correctness =
              true;
            
//#line 134 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int pad =
              0;
            
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166602 =
              pad;
            
//#line 135 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int dimx_ =
              ((480) + (((int)(t166602))));
            
//#line 136 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int dimy_ =
              480;
            
//#line 137 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int dimz_ =
              400;
            
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166603 =
              ((x10.array.Array<java.lang.String>)args).
                size;
            
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166610 =
              ((t166603) >= (((int)(3))));
            
//#line 146 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t166610) {
                
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final java.lang.String t166604 =
                  ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
                
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166605 =
                  java.lang.Integer.parseInt(t166604);
                
//#line 148 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
dimx_ = t166605;
                
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final java.lang.String t166606 =
                  ((x10.array.Array<java.lang.String>)args).$apply$G((int)(1));
                
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166607 =
                  java.lang.Integer.parseInt(t166606);
                
//#line 149 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
dimy_ = t166607;
                
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final java.lang.String t166608 =
                  ((x10.array.Array<java.lang.String>)args).$apply$G((int)(2));
                
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166609 =
                  java.lang.Integer.parseInt(t166608);
                
//#line 150 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
dimz_ = t166609;
            }
            
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166611 =
              ((x10.array.Array<java.lang.String>)args).
                size;
            
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166614 =
              ((t166611) >= (((int)(4))));
            
//#line 152 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t166614) {
                
//#line 153 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final java.lang.String t166612 =
                  ((x10.array.Array<java.lang.String>)args).$apply$G((int)(3));
                
//#line 153 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166613 =
                  java.lang.Integer.parseInt(t166612);
                
//#line 153 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
nreps = t166613;
            }
            
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166615 =
              ((x10.array.Array<java.lang.String>)args).
                size;
            
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166618 =
              ((t166615) >= (((int)(5))));
            
//#line 154 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t166618) {
                
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final java.lang.String t166616 =
                  ((x10.array.Array<java.lang.String>)args).$apply$G((int)(4));
                
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166617 =
                  java.lang.Boolean.parseBoolean(t166616);
                
//#line 155 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
check_correctness = t166617;
            }
            
//#line 156 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int dimx =
              dimx_;
            
//#line 156 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int dimy =
              dimy_;
            
//#line 156 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int dimz =
              dimz_;
            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166619 =
              ((dimx) * (((int)(dimy))));
            
//#line 157 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int nelements =
              ((t166619) * (((int)(dimz))));
            
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.io.Printer t166622 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final java.lang.Object t166620 =
              ((java.lang.Object)
                x10.core.Int.$box(dimx));
            
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.array.Array<java.lang.Object> t166621 =
              ((x10.array.Array)(x10.core.ArrayFactory.<java.lang.Object> makeArrayFromJavaArray(x10.rtt.Types.ANY, new java.lang.Object[] {t166620, dimy, dimz})));
            
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final java.lang.String t166623 =
              x10.core.String.format("%dx%dx%d",(Object[]) (t166621).raw().value);
            
//#line 159 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t166622.println(((java.lang.String)(t166623)));
            
//#line 167 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.array.Array<x10.core.Float> h_data =
              ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((int)(nelements)))));
            
//#line 168 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.array.Array<x10.core.Float> h_reference =
              ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(((int)(nelements)))));
            
//#line 169 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
CUDA3DFD.random_data__0$1x10$lang$Float$2(((x10.array.Array)(h_data)),
                                                                                                                                                        (int)(dimx),
                                                                                                                                                        (int)(dimy),
                                                                                                                                                        (int)(dimz),
                                                                                                                                                        (int)(1),
                                                                                                                                                        (int)(5));
            
//#line 172 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.array.Array<x10.lang.Place> t166624 =
              ((x10.array.Array)(x10.lang.Runtime.home().children()));
            
//#line 172 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166625 =
              ((x10.array.Array<x10.lang.Place>)t166624).
                size;
            
//#line 172 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166626 =
              ((int) t166625) ==
            ((int) 0);
            
//#line 172 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Place t166627 =
               null;
            
//#line 172 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t166626) {
                
//#line 172 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t166627 = x10.lang.Runtime.home();
            } else {
                
//#line 172 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t166627 = x10.lang.Runtime.home().child((int)(0));
            }
            
//#line 172 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.lang.Place gpu =
              t166627;
            
//#line 174 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.array.RemoteArray<x10.core.Float> d_input =
              ((x10.array.RemoteArray)(x10.util.CUDAUtilities.<x10.core.Float>makeRemoteArray__2$1x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.lang.Place)(gpu)),
                                                                                                                              (int)(nelements),
                                                                                                                              ((x10.array.Array)(h_data)))));
            
//#line 175 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Float> t166629 =
              ((x10.core.fun.Fun_0_1)(new CUDA3DFD.$Closure$82()));
            
//#line 175 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.array.RemoteArray<x10.core.Float> d_output =
              ((x10.array.RemoteArray)(x10.util.CUDAUtilities.<x10.core.Float>makeRemoteArray__2$1x10$lang$Int$3x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.lang.Place)(gpu)),
                                                                                                                                            (int)(nelements),
                                                                                                                                            ((x10.core.fun.Fun_0_1)(t166629)))));
            
//#line 177 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.io.Printer t166638 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 177 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166630 =
              ((float)(int)(((int)(nelements))));
            
//#line 177 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166631 =
              ((2.0F) * (((float)(t166630))));
            
//#line 177 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166632 =
              ((float)(int)(((int)(4))));
            
//#line 177 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166633 =
              ((t166631) * (((float)(t166632))));
            
//#line 177 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166634 =
              1048576.0F;
            
//#line 177 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166635 =
              ((t166633) / (((float)(t166634))));
            
//#line 177 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final java.lang.Object t166636 =
              ((java.lang.Object)
                x10.core.Float.$box(t166635));
            
//#line 177 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.array.Array<java.lang.Object> t166637 =
              ((x10.array.Array)(x10.core.ArrayFactory.<java.lang.Object> makeArrayFromJavaArray(x10.rtt.Types.ANY, new java.lang.Object[] {t166636})));
            
//#line 177 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final java.lang.String t166639 =
              x10.core.String.format("allocated %.6f MB on device",(Object[]) (t166637).raw().value);
            
//#line 177 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t166638.println(((java.lang.String)(t166639)));
            
//#line 179 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int RADIUS =
              4;
            
//#line 182 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166640 =
              5;
            
//#line 182 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166641 =
              ((float)(int)(((int)(1))));
            
//#line 182 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.array.Array<x10.core.Float> h_coeff_symmetric =
              ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(t166640,
                                                                                                                           x10.core.Float.$box(t166641),(java.lang.Class<?>[][][][][]) null)));
            
//#line 189 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
long start_time =
              x10.lang.System.currentTimeMillis$O();
            
//#line 190 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int i167316 =
              0;
            
//#line 190 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
for (;
                                                                                                                   true;
                                                                                                                   ) {
                
//#line 190 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167317 =
                  i167316;
                
//#line 190 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167318 =
                  nreps;
                
//#line 190 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t167319 =
                  ((t167317) < (((int)(t167318))));
                
//#line 190 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (!(t167319)) {
                    
//#line 190 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
break;
                }
                
//#line 191 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int BLOCK_DIMX167303 =
                  16;
                
//#line 192 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int BLOCK_DIMY167304 =
                  BLOCK_DIMX167303;
                
//#line 193 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int THREADS167305 =
                  256;
                
//#line 194 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int BLOCKS_X167306 =
                  ((dimx) / (((int)(BLOCK_DIMX167303))));
                
//#line 195 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int BLOCKS_Y167307 =
                  ((dimy) / (((int)(BLOCK_DIMY167304))));
                
//#line 196 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167308 =
                  8;
                
//#line 196 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int S_DATA_STRIDE167309 =
                  24;
                {
                    
//#line 197 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Runtime.ensureNotInAtomic();
                    
//#line 197 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.lang.FinishState x10$__var66 =
                      x10.lang.Runtime.startFinish();
                    
//#line 197 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
try {try {{
                        {
                            
//#line 197 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Runtime.runAsync(((x10.lang.Place)(gpu)),
                                                                                                                                                        ((x10.core.fun.VoidFun_0_0)(new CUDA3DFD.$Closure$85(h_coeff_symmetric,
                                                                                                                                                                                                             BLOCKS_X167306,
                                                                                                                                                                                                             BLOCKS_Y167307,
                                                                                                                                                                                                             RADIUS,
                                                                                                                                                                                                             BLOCK_DIMY167304,
                                                                                                                                                                                                             S_DATA_STRIDE167309,
                                                                                                                                                                                                             THREADS167305,
                                                                                                                                                                                                             BLOCK_DIMX167303,
                                                                                                                                                                                                             dimx,
                                                                                                                                                                                                             dimy,
                                                                                                                                                                                                             d_input,
                                                                                                                                                                                                             dimz,
                                                                                                                                                                                                             d_output,(java.lang.Class<?>) null))));
                        }
                    }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__52__) {
                        
//#line 197 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__52__)));
                        
//#line 197 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
throw new x10.lang.RuntimeException();
                    }finally {{
                         
//#line 197 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var66)));
                     }}
                    }
                
//#line 190 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167314 =
                  i167316;
                
//#line 190 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167315 =
                  ((t167314) + (((int)(1))));
                
//#line 190 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
i167316 = t167315;
                }
            
//#line 297 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final long t166847 =
              x10.lang.System.currentTimeMillis$O();
            
//#line 297 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final long t166848 =
              start_time;
            
//#line 297 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
long elapsed_time_ms =
              ((t166847) - (((long)(t166848))));
            
//#line 299 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final long t166850 =
              elapsed_time_ms;
            
//#line 299 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166849 =
              nreps;
            
//#line 299 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final long t166851 =
              ((long)(((int)(t166849))));
            
//#line 299 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final long t166852 =
              ((t166850) / (((long)(t166851))));
            
//#line 299 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
elapsed_time_ms = t166852;
            
//#line 300 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166854 =
              ((dimx) * (((int)(dimy))));
            
//#line 300 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166853 =
              8;
            
//#line 300 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166855 =
              ((dimz) - (((int)(t166853))));
            
//#line 300 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166856 =
              ((t166854) * (((int)(t166855))));
            
//#line 300 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166859 =
              ((float)(int)(((int)(t166856))));
            
//#line 300 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final long t166857 =
              elapsed_time_ms;
            
//#line 300 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166858 =
              ((float)(long)(((long)(t166857))));
            
//#line 300 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166860 =
              ((t166858) * (((float)(1000.0F))));
            
//#line 300 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float throughput_mpoints =
              ((t166859) / (((float)(t166860))));
            
//#line 302 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.io.Printer t166861 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 302 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t166861.println(((java.lang.String)("-------------------------------")));
            
//#line 303 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.io.Printer t166864 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 303 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final long t166862 =
              elapsed_time_ms;
            
//#line 303 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final java.lang.String t166863 =
              (("time:       ") + ((x10.core.Long.$box(t166862))));
            
//#line 303 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final java.lang.String t166865 =
              ((t166863) + (" ms"));
            
//#line 303 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t166864.println(((java.lang.String)(t166865)));
            
//#line 304 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.io.Printer t166867 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 304 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final java.lang.String t166866 =
              (("throughput: ") + ((x10.core.Float.$box(throughput_mpoints))));
            
//#line 304 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final java.lang.String t166868 =
              ((t166866) + (" MPoints/s"));
            
//#line 304 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t166867.println(((java.lang.String)(t166868)));
            
//#line 311 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166878 =
              check_correctness;
            
//#line 311 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t166878) {
                
//#line 313 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.io.Printer t166869 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 313 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t166869.println(((java.lang.String)("-------------------------------\n")));
                
//#line 314 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.io.Printer t166870 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 314 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t166870.println(((java.lang.String)("comparing to CPU result...\n")));
                
//#line 315 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
CUDA3DFD.reference_3D__0$1x10$lang$Float$2__1$1x10$lang$Float$2__2$1x10$lang$Float$2(((x10.array.Array)(h_reference)),
                                                                                                                                                                                                       ((x10.array.Array)(h_data)),
                                                                                                                                                                                                       ((x10.array.Array)(h_coeff_symmetric)),
                                                                                                                                                                                                       (int)(dimx),
                                                                                                                                                                                                       (int)(dimy),
                                                                                                                                                                                                       (int)(dimz),
                                                                                                                                                                                                       (int)(RADIUS));
                {
                    
//#line 316 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Runtime.ensureNotInAtomic();
                    
//#line 316 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.lang.FinishState x10$__var67 =
                      x10.lang.Runtime.startFinish();
                    
//#line 316 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
try {try {{
                        {
                            
//#line 316 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.array.Array.<x10.core.Float>asyncCopy__0$1x10$array$Array$$T$2__2$1x10$array$Array$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(d_output)),
                                                                                                                                                                                                                          (int)(0),
                                                                                                                                                                                                                          ((x10.array.Array)(h_data)),
                                                                                                                                                                                                                          (int)(0),
                                                                                                                                                                                                                          (int)(nelements));
                        }
                    }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__53__) {
                        
//#line 316 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__53__)));
                        
//#line 316 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
throw new x10.lang.RuntimeException();
                    }finally {{
                         
//#line 316 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var67)));
                     }}
                    }
                
//#line 317 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166871 =
                  nreps;
                
//#line 317 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t166872 =
                  ((RADIUS) * (((int)(t166871))));
                
//#line 317 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t166877 =
                  CUDA3DFD.within_epsilon__0$1x10$lang$Float$2__1$1x10$lang$Float$2$O(((x10.array.Array)(h_data)),
                                                                                      ((x10.array.Array)(h_reference)),
                                                                                      (int)(dimx),
                                                                                      (int)(dimy),
                                                                                      (int)(dimz),
                                                                                      (int)(t166872),
                                                                                      (int)(0));
                
//#line 317 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t166877) {
                    
//#line 319 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.io.Printer t166873 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 319 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t166873.println(((java.lang.String)("  Result within epsilon\n")));
                    
//#line 320 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.io.Printer t166874 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 320 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t166874.println(((java.lang.String)("  TEST PASSED!\n")));
                } else {
                    
//#line 324 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.io.Printer t166875 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 324 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t166875.println(((java.lang.String)("  Incorrect result\n")));
                    
//#line 325 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.io.Printer t166876 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 325 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
t166876.println(((java.lang.String)("  TEST FAILED!\n")));
                }
                }
            
//#line 329 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.util.CUDAUtilities.<x10.core.Float>deleteRemoteArray__0$1x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(d_input)));
            
//#line 330 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.util.CUDAUtilities.<x10.core.Float>deleteRemoteArray__0$1x10$util$CUDAUtilities$$T$2(x10.rtt.Types.FLOAT, ((x10.array.RemoteArray)(d_output)));
            }
            
            
//#line 9 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final public CUDA3DFD
                                                                                                              CUDA3DFD$$CUDA3DFD$this(
                                                                                                              ){
                
//#line 9 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
return CUDA3DFD.this;
            }
            
            
//#line 9 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
// creation method for java code
            public static CUDA3DFD $make(){return new CUDA3DFD((java.lang.System[]) null).$init();}
            
            // constructor for non-virtual call
            final public CUDA3DFD CUDA3DFD$$init$S() { {
                                                              
//#line 9 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"

                                                              
//#line 9 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"

                                                          }
                                                          return this;
                                                          }
            
            // constructor
            public CUDA3DFD $init(){return CUDA3DFD$$init$S();}
            
            
            public static class $Closure$82 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$82.class);
                
                public static final x10.rtt.RuntimeType<$Closure$82> $RTT = new x10.rtt.StaticFunType<$Closure$82>(
                /* base class */$Closure$82.class
                , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.FLOAT), x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$82 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$82.class + " calling"); } 
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$82 $_obj = new $Closure$82((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    
                }
                
                // constructor just for allocation
                public $Closure$82(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                return x10.core.Float.$box($apply$O(x10.core.Int.$unbox(a1)));
                }
                
                    
                    public float
                      $apply$O(
                      final int id$148349){
                        
//#line 175 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t166628 =
                          ((float)(double)(((double)(0.0))));
                        
//#line 175 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
return t166628;
                    }
                    
                    // creation method for java code
                    public static CUDA3DFD.$Closure$82 $make(){return new $Closure$82();}
                    public $Closure$82() { {
                                                  
                                              }}
                    
                }
                
            public static class $Closure$83 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$83.class);
                
                public static final x10.rtt.RuntimeType<$Closure$83> $RTT = new x10.rtt.StaticVoidFunType<$Closure$83>(
                /* base class */$Closure$83.class
                , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$83 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$83.class + " calling"); } 
                    $_obj.block167297 = $deserializer.readInt();
                    $_obj.BLOCKS_X167306 = $deserializer.readInt();
                    $_obj.thread167284 = $deserializer.readInt();
                    $_obj.BLOCK_DIMX167303 = $deserializer.readInt();
                    $_obj.BLOCK_DIMY167304 = $deserializer.readInt();
                    $_obj.dimx = $deserializer.readInt();
                    $_obj.dimy = $deserializer.readInt();
                    $_obj.RADIUS = $deserializer.readInt();
                    x10.array.RemoteArray d_input = (x10.array.RemoteArray) $deserializer.readRef();
                    $_obj.d_input = d_input;
                    $_obj.dimz = $deserializer.readInt();
                    $_obj.S_DATA_STRIDE167309 = $deserializer.readInt();
                    x10.array.Array s_data167294 = (x10.array.Array) $deserializer.readRef();
                    $_obj.s_data167294 = s_data167294;
                    x10.lang.Sequence c_coeff167310 = (x10.lang.Sequence) $deserializer.readRef();
                    $_obj.c_coeff167310 = c_coeff167310;
                    x10.array.RemoteArray d_output = (x10.array.RemoteArray) $deserializer.readRef();
                    $_obj.d_output = d_output;
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$83 $_obj = new $Closure$83((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    $serializer.write(this.block167297);
                    $serializer.write(this.BLOCKS_X167306);
                    $serializer.write(this.thread167284);
                    $serializer.write(this.BLOCK_DIMX167303);
                    $serializer.write(this.BLOCK_DIMY167304);
                    $serializer.write(this.dimx);
                    $serializer.write(this.dimy);
                    $serializer.write(this.RADIUS);
                    if (d_input instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.d_input);
                    } else {
                    $serializer.write(this.d_input);
                    }
                    $serializer.write(this.dimz);
                    $serializer.write(this.S_DATA_STRIDE167309);
                    if (s_data167294 instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.s_data167294);
                    } else {
                    $serializer.write(this.s_data167294);
                    }
                    if (c_coeff167310 instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.c_coeff167310);
                    } else {
                    $serializer.write(this.c_coeff167310);
                    }
                    if (d_output instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.d_output);
                    } else {
                    $serializer.write(this.d_output);
                    }
                    
                }
                
                // constructor just for allocation
                public $Closure$83(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                
                    
                    public void
                      $apply(
                      ){
                        
//#line 202 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int blockidx167228 =
                          ((this.
                              block167297) % (((int)(this.
                                                       BLOCKS_X167306))));
                        
//#line 203 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int blockidy167229 =
                          ((this.
                              block167297) / (((int)(this.
                                                       BLOCKS_X167306))));
                        
//#line 204 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int threadidx167230 =
                          ((this.
                              thread167284) % (((int)(this.
                                                        BLOCK_DIMX167303))));
                        
//#line 205 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int threadidy167231 =
                          ((this.
                              thread167284) / (((int)(this.
                                                        BLOCK_DIMX167303))));
                        
//#line 206 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167232 =
                          ((blockidx167228) * (((int)(this.
                                                        BLOCK_DIMX167303))));
                        
//#line 206 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int ix167233 =
                          ((t167232) + (((int)(threadidx167230))));
                        
//#line 207 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167234 =
                          ((blockidy167229) * (((int)(this.
                                                        BLOCK_DIMY167304))));
                        
//#line 207 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int iy167235 =
                          ((t167234) + (((int)(threadidy167231))));
                        
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167236 =
                          ((iy167235) * (((int)(this.
                                                  dimx))));
                        
//#line 208 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int in_idx167237 =
                          ((t167236) + (((int)(ix167233))));
                        
//#line 209 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int out_idx167238 =
                          0;
                        
//#line 210 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int stride167239 =
                          ((this.
                              dimx) * (((int)(this.
                                                dimy))));
                        
//#line 212 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
float infront167240 =
                           0;
                        
//#line 212 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
float infront167241 =
                           0;
                        
//#line 212 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
float infront167242 =
                           0;
                        
//#line 212 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
float infront167243 =
                           0;
                        
//#line 213 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
float behind167244 =
                           0;
                        
//#line 213 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
float behind167245 =
                           0;
                        
//#line 213 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
float behind167246 =
                           0;
                        
//#line 213 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
float behind167247 =
                           0;
                        
//#line 214 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
float current167248 =
                           0;
                        
//#line 216 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int tx167249 =
                          ((threadidx167230) + (((int)(this.
                                                         RADIUS))));
                        
//#line 217 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int ty167250 =
                          ((threadidy167231) + (((int)(this.
                                                         RADIUS))));
                        
//#line 220 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167251 =
                          in_idx167237;
                        
//#line 220 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167252 =
                          x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                          d_input).$apply$G((int)(t167251)));
                        
//#line 220 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
behind167246 = t167252;
                        
//#line 220 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167253 =
                          in_idx167237;
                        
//#line 220 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167254 =
                          ((t167253) + (((int)(stride167239))));
                        
//#line 220 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
in_idx167237 = t167254;
                        
//#line 221 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167255 =
                          in_idx167237;
                        
//#line 221 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167256 =
                          x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                          d_input).$apply$G((int)(t167255)));
                        
//#line 221 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
behind167245 = t167256;
                        
//#line 221 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167257 =
                          in_idx167237;
                        
//#line 221 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167258 =
                          ((t167257) + (((int)(stride167239))));
                        
//#line 221 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
in_idx167237 = t167258;
                        
//#line 222 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167259 =
                          in_idx167237;
                        
//#line 222 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167260 =
                          x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                          d_input).$apply$G((int)(t167259)));
                        
//#line 222 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
behind167244 = t167260;
                        
//#line 222 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167261 =
                          in_idx167237;
                        
//#line 222 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167262 =
                          ((t167261) + (((int)(stride167239))));
                        
//#line 222 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
in_idx167237 = t167262;
                        
//#line 224 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167263 =
                          in_idx167237;
                        
//#line 224 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167264 =
                          x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                          d_input).$apply$G((int)(t167263)));
                        
//#line 224 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
current167248 = t167264;
                        
//#line 224 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167265 =
                          in_idx167237;
                        
//#line 224 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
out_idx167238 = t167265;
                        
//#line 224 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167266 =
                          in_idx167237;
                        
//#line 224 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167267 =
                          ((t167266) + (((int)(stride167239))));
                        
//#line 224 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
in_idx167237 = t167267;
                        
//#line 226 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167268 =
                          in_idx167237;
                        
//#line 226 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167269 =
                          x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                          d_input).$apply$G((int)(t167268)));
                        
//#line 226 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
infront167240 = t167269;
                        
//#line 226 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167270 =
                          in_idx167237;
                        
//#line 226 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167271 =
                          ((t167270) + (((int)(stride167239))));
                        
//#line 226 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
in_idx167237 = t167271;
                        
//#line 227 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167272 =
                          in_idx167237;
                        
//#line 227 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167273 =
                          x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                          d_input).$apply$G((int)(t167272)));
                        
//#line 227 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
infront167241 = t167273;
                        
//#line 227 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167274 =
                          in_idx167237;
                        
//#line 227 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167275 =
                          ((t167274) + (((int)(stride167239))));
                        
//#line 227 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
in_idx167237 = t167275;
                        
//#line 228 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167276 =
                          in_idx167237;
                        
//#line 228 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167277 =
                          x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                          d_input).$apply$G((int)(t167276)));
                        
//#line 228 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
infront167242 = t167277;
                        
//#line 228 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167278 =
                          in_idx167237;
                        
//#line 228 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167279 =
                          ((t167278) + (((int)(stride167239))));
                        
//#line 228 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
in_idx167237 = t167279;
                        
//#line 229 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167280 =
                          in_idx167237;
                        
//#line 229 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167281 =
                          x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                          d_input).$apply$G((int)(t167280)));
                        
//#line 229 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
infront167243 = t167281;
                        
//#line 229 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167282 =
                          in_idx167237;
                        
//#line 229 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167283 =
                          ((t167282) + (((int)(stride167239))));
                        
//#line 229 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
in_idx167237 = t167283;
                        
//#line 231 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int j167224 =
                          this.
                            RADIUS;
                        
//#line 231 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
for (;
                                                                                                                               true;
                                                                                                                               ) {
                            
//#line 231 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167225 =
                              j167224;
                            
//#line 231 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167226 =
                              ((this.
                                  dimz) - (((int)(this.
                                                    RADIUS))));
                            
//#line 231 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t167227 =
                              ((t167225) < (((int)(t167226))));
                            
//#line 231 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (!(t167227)) {
                                
//#line 231 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
break;
                            }
                            
//#line 235 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167064 =
                              behind167246;
                            
//#line 235 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
behind167247 = t167064;
                            
//#line 236 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167065 =
                              behind167245;
                            
//#line 236 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
behind167246 = t167065;
                            
//#line 237 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167066 =
                              behind167244;
                            
//#line 237 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
behind167245 = t167066;
                            
//#line 238 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167067 =
                              current167248;
                            
//#line 238 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
behind167244 = t167067;
                            
//#line 239 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167068 =
                              infront167240;
                            
//#line 239 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
current167248 = t167068;
                            
//#line 240 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167069 =
                              infront167241;
                            
//#line 240 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
infront167240 = t167069;
                            
//#line 241 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167070 =
                              infront167242;
                            
//#line 241 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
infront167241 = t167070;
                            
//#line 242 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167071 =
                              infront167243;
                            
//#line 242 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
infront167242 = t167071;
                            
//#line 243 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167072 =
                              in_idx167237;
                            
//#line 243 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167073 =
                              x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                              d_input).$apply$G((int)(t167072)));
                            
//#line 243 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
infront167243 = t167073;
                            
//#line 245 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167074 =
                              in_idx167237;
                            
//#line 245 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167075 =
                              ((t167074) + (((int)(stride167239))));
                            
//#line 245 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
in_idx167237 = t167075;
                            
//#line 246 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167076 =
                              out_idx167238;
                            
//#line 246 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167077 =
                              ((t167076) + (((int)(stride167239))));
                            
//#line 246 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
out_idx167238 = t167077;
                            
//#line 247 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Clock.advanceAll();
                            
//#line 252 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t167078 =
                              ((threadidy167231) < (((int)(this.
                                                             RADIUS))));
                            
//#line 252 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t167078) {
                                
//#line 254 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167079 =
                                  ((threadidy167231) * (((int)(this.
                                                                 S_DATA_STRIDE167309))));
                                
//#line 254 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167080 =
                                  ((t167079) + (((int)(tx167249))));
                                
//#line 254 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167081 =
                                  out_idx167238;
                                
//#line 254 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167082 =
                                  ((this.
                                      RADIUS) * (((int)(this.
                                                          dimx))));
                                
//#line 254 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167083 =
                                  ((t167081) - (((int)(t167082))));
                                
//#line 254 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167084 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  d_input).$apply$G((int)(t167083)));
                                
//#line 254 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
((x10.array.Array<x10.core.Float>)this.
                                                                                                                                                                      s_data167294).$set__1x10$array$Array$$T$G((int)(t167080),
                                                                                                                                                                                                                x10.core.Float.$box(t167084));
                                
//#line 255 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167085 =
                                  ((threadidy167231) + (((int)(this.
                                                                 BLOCK_DIMY167304))));
                                
//#line 255 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167086 =
                                  ((t167085) + (((int)(this.
                                                         RADIUS))));
                                
//#line 255 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167087 =
                                  ((t167086) * (((int)(this.
                                                         S_DATA_STRIDE167309))));
                                
//#line 255 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167088 =
                                  ((t167087) + (((int)(tx167249))));
                                
//#line 255 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167089 =
                                  out_idx167238;
                                
//#line 255 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167090 =
                                  ((this.
                                      BLOCK_DIMY167304) * (((int)(this.
                                                                    dimx))));
                                
//#line 255 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167091 =
                                  ((t167089) + (((int)(t167090))));
                                
//#line 255 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167092 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  d_input).$apply$G((int)(t167091)));
                                
//#line 255 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
((x10.array.Array<x10.core.Float>)this.
                                                                                                                                                                      s_data167294).$set__1x10$array$Array$$T$G((int)(t167088),
                                                                                                                                                                                                                x10.core.Float.$box(t167092));
                            }
                            
//#line 258 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t167093 =
                              ((threadidx167230) < (((int)(this.
                                                             RADIUS))));
                            
//#line 258 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (t167093) {
                                
//#line 260 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167094 =
                                  ((ty167250) * (((int)(this.
                                                          S_DATA_STRIDE167309))));
                                
//#line 260 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167095 =
                                  ((t167094) + (((int)(threadidx167230))));
                                
//#line 260 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167096 =
                                  out_idx167238;
                                
//#line 260 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167097 =
                                  ((t167096) - (((int)(this.
                                                         RADIUS))));
                                
//#line 260 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167098 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  d_input).$apply$G((int)(t167097)));
                                
//#line 260 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
((x10.array.Array<x10.core.Float>)this.
                                                                                                                                                                      s_data167294).$set__1x10$array$Array$$T$G((int)(t167095),
                                                                                                                                                                                                                x10.core.Float.$box(t167098));
                                
//#line 261 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167099 =
                                  ((ty167250) * (((int)(this.
                                                          S_DATA_STRIDE167309))));
                                
//#line 261 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167100 =
                                  ((t167099) + (((int)(threadidx167230))));
                                
//#line 261 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167101 =
                                  ((t167100) + (((int)(this.
                                                         BLOCK_DIMX167303))));
                                
//#line 261 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167102 =
                                  ((t167101) + (((int)(this.
                                                         RADIUS))));
                                
//#line 261 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167103 =
                                  out_idx167238;
                                
//#line 261 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167104 =
                                  ((t167103) + (((int)(this.
                                                         BLOCK_DIMX167303))));
                                
//#line 261 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167105 =
                                  x10.core.Float.$unbox(((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                  d_input).$apply$G((int)(t167104)));
                                
//#line 261 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
((x10.array.Array<x10.core.Float>)this.
                                                                                                                                                                      s_data167294).$set__1x10$array$Array$$T$G((int)(t167102),
                                                                                                                                                                                                                x10.core.Float.$box(t167105));
                            }
                            
//#line 265 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167106 =
                              ((ty167250) * (((int)(this.
                                                      S_DATA_STRIDE167309))));
                            
//#line 265 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167107 =
                              ((t167106) + (((int)(tx167249))));
                            
//#line 265 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167108 =
                              current167248;
                            
//#line 265 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
((x10.array.Array<x10.core.Float>)this.
                                                                                                                                                                  s_data167294).$set__1x10$array$Array$$T$G((int)(t167107),
                                                                                                                                                                                                            x10.core.Float.$box(t167108));
                            
//#line 266 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Clock.advanceAll();
                            
//#line 270 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167109 =
                              x10.core.Float.$unbox(((x10.lang.Sequence<x10.core.Float>)this.
                                                                                          c_coeff167310).$apply$G((int)(0)));
                            
//#line 270 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167110 =
                              current167248;
                            
//#line 270 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
float valu167111 =
                              ((t167109) * (((float)(t167110))));
                            
//#line 271 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167112 =
                              ((ty167250) - (((int)(1))));
                            
//#line 271 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167113 =
                              ((t167112) * (((int)(this.
                                                     S_DATA_STRIDE167309))));
                            
//#line 271 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167114 =
                              ((t167113) + (((int)(tx167249))));
                            
//#line 271 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float sd1a167115 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                        s_data167294).$apply$G((int)(t167114)));
                            
//#line 272 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167116 =
                              ((ty167250) + (((int)(1))));
                            
//#line 272 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167117 =
                              ((t167116) * (((int)(this.
                                                     S_DATA_STRIDE167309))));
                            
//#line 272 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167118 =
                              ((t167117) + (((int)(tx167249))));
                            
//#line 272 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float sd1b167119 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                        s_data167294).$apply$G((int)(t167118)));
                            
//#line 273 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167120 =
                              ((ty167250) * (((int)(this.
                                                      S_DATA_STRIDE167309))));
                            
//#line 273 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167121 =
                              ((t167120) + (((int)(tx167249))));
                            
//#line 273 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167122 =
                              ((t167121) - (((int)(1))));
                            
//#line 273 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float sd1c167123 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                        s_data167294).$apply$G((int)(t167122)));
                            
//#line 274 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167124 =
                              ((ty167250) * (((int)(this.
                                                      S_DATA_STRIDE167309))));
                            
//#line 274 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167125 =
                              ((t167124) + (((int)(tx167249))));
                            
//#line 274 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167126 =
                              ((t167125) + (((int)(1))));
                            
//#line 274 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float sd1d167127 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                        s_data167294).$apply$G((int)(t167126)));
                            
//#line 275 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167128 =
                              ((ty167250) - (((int)(2))));
                            
//#line 275 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167129 =
                              ((t167128) * (((int)(this.
                                                     S_DATA_STRIDE167309))));
                            
//#line 275 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167130 =
                              ((t167129) + (((int)(tx167249))));
                            
//#line 275 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float sd2a167131 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                        s_data167294).$apply$G((int)(t167130)));
                            
//#line 276 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167132 =
                              ((ty167250) + (((int)(2))));
                            
//#line 276 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167133 =
                              ((t167132) * (((int)(this.
                                                     S_DATA_STRIDE167309))));
                            
//#line 276 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167134 =
                              ((t167133) + (((int)(tx167249))));
                            
//#line 276 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float sd2b167135 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                        s_data167294).$apply$G((int)(t167134)));
                            
//#line 277 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167136 =
                              ((ty167250) * (((int)(this.
                                                      S_DATA_STRIDE167309))));
                            
//#line 277 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167137 =
                              ((t167136) + (((int)(tx167249))));
                            
//#line 277 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167138 =
                              ((t167137) - (((int)(2))));
                            
//#line 277 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float sd2c167139 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                        s_data167294).$apply$G((int)(t167138)));
                            
//#line 278 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167140 =
                              ((ty167250) * (((int)(this.
                                                      S_DATA_STRIDE167309))));
                            
//#line 278 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167141 =
                              ((t167140) + (((int)(tx167249))));
                            
//#line 278 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167142 =
                              ((t167141) + (((int)(2))));
                            
//#line 278 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float sd2d167143 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                        s_data167294).$apply$G((int)(t167142)));
                            
//#line 279 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167144 =
                              ((ty167250) - (((int)(3))));
                            
//#line 279 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167145 =
                              ((t167144) * (((int)(this.
                                                     S_DATA_STRIDE167309))));
                            
//#line 279 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167146 =
                              ((t167145) + (((int)(tx167249))));
                            
//#line 279 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float sd3a167147 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                        s_data167294).$apply$G((int)(t167146)));
                            
//#line 280 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167148 =
                              ((ty167250) + (((int)(3))));
                            
//#line 280 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167149 =
                              ((t167148) * (((int)(this.
                                                     S_DATA_STRIDE167309))));
                            
//#line 280 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167150 =
                              ((t167149) + (((int)(tx167249))));
                            
//#line 280 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float sd3b167151 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                        s_data167294).$apply$G((int)(t167150)));
                            
//#line 281 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167152 =
                              ((ty167250) * (((int)(this.
                                                      S_DATA_STRIDE167309))));
                            
//#line 281 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167153 =
                              ((t167152) + (((int)(tx167249))));
                            
//#line 281 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167154 =
                              ((t167153) - (((int)(3))));
                            
//#line 281 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float sd3c167155 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                        s_data167294).$apply$G((int)(t167154)));
                            
//#line 282 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167156 =
                              ((ty167250) * (((int)(this.
                                                      S_DATA_STRIDE167309))));
                            
//#line 282 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167157 =
                              ((t167156) + (((int)(tx167249))));
                            
//#line 282 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167158 =
                              ((t167157) + (((int)(3))));
                            
//#line 282 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float sd3d167159 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                        s_data167294).$apply$G((int)(t167158)));
                            
//#line 283 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167160 =
                              ((ty167250) - (((int)(4))));
                            
//#line 283 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167161 =
                              ((t167160) * (((int)(this.
                                                     S_DATA_STRIDE167309))));
                            
//#line 283 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167162 =
                              ((t167161) + (((int)(tx167249))));
                            
//#line 283 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float sd4a167163 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                        s_data167294).$apply$G((int)(t167162)));
                            
//#line 284 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167164 =
                              ((ty167250) + (((int)(4))));
                            
//#line 284 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167165 =
                              ((t167164) * (((int)(this.
                                                     S_DATA_STRIDE167309))));
                            
//#line 284 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167166 =
                              ((t167165) + (((int)(tx167249))));
                            
//#line 284 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float sd4b167167 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                        s_data167294).$apply$G((int)(t167166)));
                            
//#line 285 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167168 =
                              ((ty167250) * (((int)(this.
                                                      S_DATA_STRIDE167309))));
                            
//#line 285 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167169 =
                              ((t167168) + (((int)(tx167249))));
                            
//#line 285 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167170 =
                              ((t167169) - (((int)(4))));
                            
//#line 285 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float sd4c167171 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                        s_data167294).$apply$G((int)(t167170)));
                            
//#line 286 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167172 =
                              ((ty167250) * (((int)(this.
                                                      S_DATA_STRIDE167309))));
                            
//#line 286 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167173 =
                              ((t167172) + (((int)(tx167249))));
                            
//#line 286 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167174 =
                              ((t167173) + (((int)(4))));
                            
//#line 286 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float sd4d167175 =
                              x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)this.
                                                                                        s_data167294).$apply$G((int)(t167174)));
                            
//#line 287 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167176 =
                              valu167111;
                            
//#line 287 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167177 =
                              x10.core.Float.$unbox(((x10.lang.Sequence<x10.core.Float>)this.
                                                                                          c_coeff167310).$apply$G((int)(1)));
                            
//#line 287 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167178 =
                              infront167240;
                            
//#line 287 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167179 =
                              behind167244;
                            
//#line 287 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167180 =
                              ((t167178) + (((float)(t167179))));
                            
//#line 287 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167181 =
                              ((t167180) + (((float)(sd1a167115))));
                            
//#line 287 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167182 =
                              ((t167181) + (((float)(sd1b167119))));
                            
//#line 287 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167183 =
                              ((t167182) + (((float)(sd1c167123))));
                            
//#line 287 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167184 =
                              ((t167183) + (((float)(sd1d167127))));
                            
//#line 287 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167185 =
                              ((t167177) * (((float)(t167184))));
                            
//#line 287 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167186 =
                              ((t167176) + (((float)(t167185))));
                            
//#line 287 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
valu167111 = t167186;
                            
//#line 288 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167187 =
                              valu167111;
                            
//#line 288 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167188 =
                              x10.core.Float.$unbox(((x10.lang.Sequence<x10.core.Float>)this.
                                                                                          c_coeff167310).$apply$G((int)(2)));
                            
//#line 288 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167189 =
                              infront167241;
                            
//#line 288 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167190 =
                              behind167245;
                            
//#line 288 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167191 =
                              ((t167189) + (((float)(t167190))));
                            
//#line 288 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167192 =
                              ((t167191) + (((float)(sd2a167131))));
                            
//#line 288 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167193 =
                              ((t167192) + (((float)(sd2b167135))));
                            
//#line 288 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167194 =
                              ((t167193) + (((float)(sd2c167139))));
                            
//#line 288 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167195 =
                              ((t167194) + (((float)(sd2d167143))));
                            
//#line 288 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167196 =
                              ((t167188) * (((float)(t167195))));
                            
//#line 288 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167197 =
                              ((t167187) + (((float)(t167196))));
                            
//#line 288 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
valu167111 = t167197;
                            
//#line 289 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167198 =
                              valu167111;
                            
//#line 289 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167199 =
                              x10.core.Float.$unbox(((x10.lang.Sequence<x10.core.Float>)this.
                                                                                          c_coeff167310).$apply$G((int)(3)));
                            
//#line 289 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167200 =
                              infront167242;
                            
//#line 289 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167201 =
                              behind167246;
                            
//#line 289 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167202 =
                              ((t167200) + (((float)(t167201))));
                            
//#line 289 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167203 =
                              ((t167202) + (((float)(sd3a167147))));
                            
//#line 289 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167204 =
                              ((t167203) + (((float)(sd3b167151))));
                            
//#line 289 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167205 =
                              ((t167204) + (((float)(sd3c167155))));
                            
//#line 289 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167206 =
                              ((t167205) + (((float)(sd3d167159))));
                            
//#line 289 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167207 =
                              ((t167199) * (((float)(t167206))));
                            
//#line 289 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167208 =
                              ((t167198) + (((float)(t167207))));
                            
//#line 289 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
valu167111 = t167208;
                            
//#line 290 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167209 =
                              valu167111;
                            
//#line 290 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167210 =
                              x10.core.Float.$unbox(((x10.lang.Sequence<x10.core.Float>)this.
                                                                                          c_coeff167310).$apply$G((int)(4)));
                            
//#line 290 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167211 =
                              infront167243;
                            
//#line 290 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167212 =
                              behind167247;
                            
//#line 290 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167213 =
                              ((t167211) + (((float)(t167212))));
                            
//#line 290 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167214 =
                              ((t167213) + (((float)(sd4a167163))));
                            
//#line 290 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167215 =
                              ((t167214) + (((float)(sd4b167167))));
                            
//#line 290 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167216 =
                              ((t167215) + (((float)(sd4c167171))));
                            
//#line 290 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167217 =
                              ((t167216) + (((float)(sd4d167175))));
                            
//#line 290 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167218 =
                              ((t167210) * (((float)(t167217))));
                            
//#line 290 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167219 =
                              ((t167209) + (((float)(t167218))));
                            
//#line 290 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
valu167111 = t167219;
                            
//#line 291 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167220 =
                              out_idx167238;
                            
//#line 291 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167221 =
                              valu167111;
                            
//#line 291 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
((x10.array.RemoteArray<x10.core.Float>)this.
                                                                                                                                                                        d_output).$set__1x10$array$RemoteArray$$T$G((int)(t167220),
                                                                                                                                                                                                                    x10.core.Float.$box(t167221));
                            
//#line 231 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167222 =
                              j167224;
                            
//#line 231 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167223 =
                              ((t167222) + (((int)(1))));
                            
//#line 231 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
j167224 = t167223;
                        }
                    }
                    
                    public int block167297;
                    public int BLOCKS_X167306;
                    public int thread167284;
                    public int BLOCK_DIMX167303;
                    public int BLOCK_DIMY167304;
                    public int dimx;
                    public int dimy;
                    public int RADIUS;
                    public x10.array.RemoteArray<x10.core.Float> d_input;
                    public int dimz;
                    public int S_DATA_STRIDE167309;
                    public x10.array.Array<x10.core.Float> s_data167294;
                    public x10.lang.Sequence<x10.core.Float> c_coeff167310;
                    public x10.array.RemoteArray<x10.core.Float> d_output;
                    
                    // creation method for java code
                    public static CUDA3DFD.$Closure$83 $make(final int block167297,
                                                             final int BLOCKS_X167306,
                                                             final int thread167284,
                                                             final int BLOCK_DIMX167303,
                                                             final int BLOCK_DIMY167304,
                                                             final int dimx,
                                                             final int dimy,
                                                             final int RADIUS,
                                                             final x10.array.RemoteArray<x10.core.Float> d_input,
                                                             final int dimz,
                                                             final int S_DATA_STRIDE167309,
                                                             final x10.array.Array<x10.core.Float> s_data167294,
                                                             final x10.lang.Sequence<x10.core.Float> c_coeff167310,
                                                             final x10.array.RemoteArray<x10.core.Float> d_output,java.lang.Class<?> $dummy0){return new $Closure$83(block167297,BLOCKS_X167306,thread167284,BLOCK_DIMX167303,BLOCK_DIMY167304,dimx,dimy,RADIUS,d_input,dimz,S_DATA_STRIDE167309,s_data167294,c_coeff167310,d_output,(java.lang.Class<?>) null);}
                    public $Closure$83(final int block167297,
                                       final int BLOCKS_X167306,
                                       final int thread167284,
                                       final int BLOCK_DIMX167303,
                                       final int BLOCK_DIMY167304,
                                       final int dimx,
                                       final int dimy,
                                       final int RADIUS,
                                       final x10.array.RemoteArray<x10.core.Float> d_input,
                                       final int dimz,
                                       final int S_DATA_STRIDE167309,
                                       final x10.array.Array<x10.core.Float> s_data167294,
                                       final x10.lang.Sequence<x10.core.Float> c_coeff167310,
                                       final x10.array.RemoteArray<x10.core.Float> d_output,java.lang.Class<?> $dummy0) { {
                                                                                                                                 this.block167297 = block167297;
                                                                                                                                 this.BLOCKS_X167306 = BLOCKS_X167306;
                                                                                                                                 this.thread167284 = thread167284;
                                                                                                                                 this.BLOCK_DIMX167303 = BLOCK_DIMX167303;
                                                                                                                                 this.BLOCK_DIMY167304 = BLOCK_DIMY167304;
                                                                                                                                 this.dimx = dimx;
                                                                                                                                 this.dimy = dimy;
                                                                                                                                 this.RADIUS = RADIUS;
                                                                                                                                 this.d_input = ((x10.array.RemoteArray)(d_input));
                                                                                                                                 this.dimz = dimz;
                                                                                                                                 this.S_DATA_STRIDE167309 = S_DATA_STRIDE167309;
                                                                                                                                 this.s_data167294 = ((x10.array.Array)(s_data167294));
                                                                                                                                 this.c_coeff167310 = ((x10.lang.Sequence)(c_coeff167310));
                                                                                                                                 this.d_output = ((x10.array.RemoteArray)(d_output));
                                                                                                                             }}
                    
                }
                
            public static class $Closure$84 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
            {
                private static final long serialVersionUID = 1L;
                private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$84.class);
                
                public static final x10.rtt.RuntimeType<$Closure$84> $RTT = new x10.rtt.StaticVoidFunType<$Closure$84>(
                /* base class */$Closure$84.class
                , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                );
                public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                
                
                private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$84 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$84.class + " calling"); } 
                    $_obj.RADIUS = $deserializer.readInt();
                    $_obj.BLOCK_DIMY167304 = $deserializer.readInt();
                    $_obj.S_DATA_STRIDE167309 = $deserializer.readInt();
                    $_obj.THREADS167305 = $deserializer.readInt();
                    $_obj.block167297 = $deserializer.readInt();
                    $_obj.BLOCKS_X167306 = $deserializer.readInt();
                    $_obj.BLOCK_DIMX167303 = $deserializer.readInt();
                    $_obj.dimx = $deserializer.readInt();
                    $_obj.dimy = $deserializer.readInt();
                    x10.array.RemoteArray d_input = (x10.array.RemoteArray) $deserializer.readRef();
                    $_obj.d_input = d_input;
                    $_obj.dimz = $deserializer.readInt();
                    x10.lang.Sequence c_coeff167310 = (x10.lang.Sequence) $deserializer.readRef();
                    $_obj.c_coeff167310 = c_coeff167310;
                    x10.array.RemoteArray d_output = (x10.array.RemoteArray) $deserializer.readRef();
                    $_obj.d_output = d_output;
                    return $_obj;
                    
                }
                
                public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                
                    $Closure$84 $_obj = new $Closure$84((java.lang.System[]) null);
                    $deserializer.record_reference($_obj);
                    return $_deserialize_body($_obj, $deserializer);
                    
                }
                
                public short $_get_serialization_id() {
                
                     return $_serialization_id;
                    
                }
                
                public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                
                    $serializer.write(this.RADIUS);
                    $serializer.write(this.BLOCK_DIMY167304);
                    $serializer.write(this.S_DATA_STRIDE167309);
                    $serializer.write(this.THREADS167305);
                    $serializer.write(this.block167297);
                    $serializer.write(this.BLOCKS_X167306);
                    $serializer.write(this.BLOCK_DIMX167303);
                    $serializer.write(this.dimx);
                    $serializer.write(this.dimy);
                    if (d_input instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.d_input);
                    } else {
                    $serializer.write(this.d_input);
                    }
                    $serializer.write(this.dimz);
                    if (c_coeff167310 instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.c_coeff167310);
                    } else {
                    $serializer.write(this.c_coeff167310);
                    }
                    if (d_output instanceof x10.x10rt.X10JavaSerializable) {
                    $serializer.write( (x10.x10rt.X10JavaSerializable) this.d_output);
                    } else {
                    $serializer.write(this.d_output);
                    }
                    
                }
                
                // constructor just for allocation
                public $Closure$84(final java.lang.System[] $dummy) { 
                super($dummy);
                }
                
                    
                    public void
                      $apply(
                      ){
                        
//#line 200 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167290 =
                          8;
                        
//#line 200 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167291 =
                          24;
                        
//#line 200 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167292 =
                          576;
                        
//#line 200 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final float t167293 =
                          ((float)(int)(((int)(0))));
                        
//#line 200 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.array.Array<x10.core.Float> s_data167294 =
                          ((x10.array.Array)(new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).$init(t167292,
                                                                                                                                       x10.core.Float.$box(t167293),(java.lang.Class<?>[][][][][]) null)));
                        {
                            
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Clock x10$__var63 =
                              null;
                            {
                                
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Runtime.ensureNotInAtomic();
                                
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.lang.FinishState x10$__var64 =
                                  x10.lang.Runtime.startFinish();
                                
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
try {try {{
                                    {
                                        
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
try {{
                                            
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.lang.Clock x10$__var62 =
                                              x10.lang.Clock.make();
                                            
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10$__var63 = x10$__var62;
                                            
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int i166383min167295 =
                                              0;
                                            
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int i166383max167296 =
                                              255;
                                            
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int i167287 =
                                              i166383min167295;
                                            
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
for (;
                                                                                                                                                   true;
                                                                                                                                                   ) {
                                                
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167288 =
                                                  i167287;
                                                
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t167289 =
                                                  ((t167288) <= (((int)(i166383max167296))));
                                                
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (!(t167289)) {
                                                    
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
break;
                                                }
                                                
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int thread167284 =
                                                  i167287;
                                                
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Runtime.runAsync__0$1x10$lang$Clock$2(((x10.array.Array)(x10.core.ArrayFactory.<x10.lang.Clock> makeArrayFromJavaArray(x10.lang.Clock.$RTT, new x10.lang.Clock[] {x10$__var62}))),
                                                                                                                                                                                                 ((x10.core.fun.VoidFun_0_0)(new CUDA3DFD.$Closure$83(((int)(this.
                                                                                                                                                                                                                                                               block167297)),
                                                                                                                                                                                                                                                      ((int)(this.
                                                                                                                                                                                                                                                               BLOCKS_X167306)),
                                                                                                                                                                                                                                                      thread167284,
                                                                                                                                                                                                                                                      this.
                                                                                                                                                                                                                                                        BLOCK_DIMX167303,
                                                                                                                                                                                                                                                      this.
                                                                                                                                                                                                                                                        BLOCK_DIMY167304,
                                                                                                                                                                                                                                                      ((int)(this.
                                                                                                                                                                                                                                                               dimx)),
                                                                                                                                                                                                                                                      ((int)(this.
                                                                                                                                                                                                                                                               dimy)),
                                                                                                                                                                                                                                                      this.
                                                                                                                                                                                                                                                        RADIUS,
                                                                                                                                                                                                                                                      ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                                 d_input)),
                                                                                                                                                                                                                                                      ((int)(this.
                                                                                                                                                                                                                                                               dimz)),
                                                                                                                                                                                                                                                      ((int)(this.
                                                                                                                                                                                                                                                               S_DATA_STRIDE167309)),
                                                                                                                                                                                                                                                      s_data167294,
                                                                                                                                                                                                                                                      ((x10.lang.Sequence)(this.
                                                                                                                                                                                                                                                                             c_coeff167310)),
                                                                                                                                                                                                                                                      ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                                                 d_output)),(java.lang.Class<?>) null))));
                                                
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167285 =
                                                  i167287;
                                                
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167286 =
                                                  ((t167285) + (((int)(1))));
                                                
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
i167287 = t167286;
                                            }
                                        }}finally {{
                                              
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (((x10$__var63) != (null))) {
                                                  
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10$__var63.drop();
                                              }
                                          }}
                                        }
                                    }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__50__) {
                                        
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__50__)));
                                        
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
throw new x10.lang.RuntimeException();
                                    }finally {{
                                         
//#line 201 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var64)));
                                     }}
                                }
                            }
                        }
                        
                        public int RADIUS;
                        public int BLOCK_DIMY167304;
                        public int S_DATA_STRIDE167309;
                        public int THREADS167305;
                        public int block167297;
                        public int BLOCKS_X167306;
                        public int BLOCK_DIMX167303;
                        public int dimx;
                        public int dimy;
                        public x10.array.RemoteArray<x10.core.Float> d_input;
                        public int dimz;
                        public x10.lang.Sequence<x10.core.Float> c_coeff167310;
                        public x10.array.RemoteArray<x10.core.Float> d_output;
                        
                        // creation method for java code
                        public static CUDA3DFD.$Closure$84 $make(final int RADIUS,
                                                                 final int BLOCK_DIMY167304,
                                                                 final int S_DATA_STRIDE167309,
                                                                 final int THREADS167305,
                                                                 final int block167297,
                                                                 final int BLOCKS_X167306,
                                                                 final int BLOCK_DIMX167303,
                                                                 final int dimx,
                                                                 final int dimy,
                                                                 final x10.array.RemoteArray<x10.core.Float> d_input,
                                                                 final int dimz,
                                                                 final x10.lang.Sequence<x10.core.Float> c_coeff167310,
                                                                 final x10.array.RemoteArray<x10.core.Float> d_output,java.lang.Class<?> $dummy0){return new $Closure$84(RADIUS,BLOCK_DIMY167304,S_DATA_STRIDE167309,THREADS167305,block167297,BLOCKS_X167306,BLOCK_DIMX167303,dimx,dimy,d_input,dimz,c_coeff167310,d_output,(java.lang.Class<?>) null);}
                        public $Closure$84(final int RADIUS,
                                           final int BLOCK_DIMY167304,
                                           final int S_DATA_STRIDE167309,
                                           final int THREADS167305,
                                           final int block167297,
                                           final int BLOCKS_X167306,
                                           final int BLOCK_DIMX167303,
                                           final int dimx,
                                           final int dimy,
                                           final x10.array.RemoteArray<x10.core.Float> d_input,
                                           final int dimz,
                                           final x10.lang.Sequence<x10.core.Float> c_coeff167310,
                                           final x10.array.RemoteArray<x10.core.Float> d_output,java.lang.Class<?> $dummy0) { {
                                                                                                                                     this.RADIUS = RADIUS;
                                                                                                                                     this.BLOCK_DIMY167304 = BLOCK_DIMY167304;
                                                                                                                                     this.S_DATA_STRIDE167309 = S_DATA_STRIDE167309;
                                                                                                                                     this.THREADS167305 = THREADS167305;
                                                                                                                                     this.block167297 = block167297;
                                                                                                                                     this.BLOCKS_X167306 = BLOCKS_X167306;
                                                                                                                                     this.BLOCK_DIMX167303 = BLOCK_DIMX167303;
                                                                                                                                     this.dimx = dimx;
                                                                                                                                     this.dimy = dimy;
                                                                                                                                     this.d_input = ((x10.array.RemoteArray)(d_input));
                                                                                                                                     this.dimz = dimz;
                                                                                                                                     this.c_coeff167310 = ((x10.lang.Sequence)(c_coeff167310));
                                                                                                                                     this.d_output = ((x10.array.RemoteArray)(d_output));
                                                                                                                                 }}
                        
                    }
                    
                    public static class $Closure$85 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                    {
                        private static final long serialVersionUID = 1L;
                        private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$85.class);
                        
                        public static final x10.rtt.RuntimeType<$Closure$85> $RTT = new x10.rtt.StaticVoidFunType<$Closure$85>(
                        /* base class */$Closure$85.class
                        , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                        );
                        public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                        
                        
                        private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                        public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$85 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$85.class + " calling"); } 
                            x10.array.Array h_coeff_symmetric = (x10.array.Array) $deserializer.readRef();
                            $_obj.h_coeff_symmetric = h_coeff_symmetric;
                            $_obj.BLOCKS_X167306 = $deserializer.readInt();
                            $_obj.BLOCKS_Y167307 = $deserializer.readInt();
                            $_obj.RADIUS = $deserializer.readInt();
                            $_obj.BLOCK_DIMY167304 = $deserializer.readInt();
                            $_obj.S_DATA_STRIDE167309 = $deserializer.readInt();
                            $_obj.THREADS167305 = $deserializer.readInt();
                            $_obj.BLOCK_DIMX167303 = $deserializer.readInt();
                            $_obj.dimx = $deserializer.readInt();
                            $_obj.dimy = $deserializer.readInt();
                            x10.array.RemoteArray d_input = (x10.array.RemoteArray) $deserializer.readRef();
                            $_obj.d_input = d_input;
                            $_obj.dimz = $deserializer.readInt();
                            x10.array.RemoteArray d_output = (x10.array.RemoteArray) $deserializer.readRef();
                            $_obj.d_output = d_output;
                            return $_obj;
                            
                        }
                        
                        public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                        
                            $Closure$85 $_obj = new $Closure$85((java.lang.System[]) null);
                            $deserializer.record_reference($_obj);
                            return $_deserialize_body($_obj, $deserializer);
                            
                        }
                        
                        public short $_get_serialization_id() {
                        
                             return $_serialization_id;
                            
                        }
                        
                        public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                        
                            if (h_coeff_symmetric instanceof x10.x10rt.X10JavaSerializable) {
                            $serializer.write( (x10.x10rt.X10JavaSerializable) this.h_coeff_symmetric);
                            } else {
                            $serializer.write(this.h_coeff_symmetric);
                            }
                            $serializer.write(this.BLOCKS_X167306);
                            $serializer.write(this.BLOCKS_Y167307);
                            $serializer.write(this.RADIUS);
                            $serializer.write(this.BLOCK_DIMY167304);
                            $serializer.write(this.S_DATA_STRIDE167309);
                            $serializer.write(this.THREADS167305);
                            $serializer.write(this.BLOCK_DIMX167303);
                            $serializer.write(this.dimx);
                            $serializer.write(this.dimy);
                            if (d_input instanceof x10.x10rt.X10JavaSerializable) {
                            $serializer.write( (x10.x10rt.X10JavaSerializable) this.d_input);
                            } else {
                            $serializer.write(this.d_input);
                            }
                            $serializer.write(this.dimz);
                            if (d_output instanceof x10.x10rt.X10JavaSerializable) {
                            $serializer.write( (x10.x10rt.X10JavaSerializable) this.d_output);
                            } else {
                            $serializer.write(this.d_output);
                            }
                            
                        }
                        
                        // constructor just for allocation
                        public $Closure$85(final java.lang.System[] $dummy) { 
                        super($dummy);
                        }
                        
                            
                            public void
                              $apply(
                              ){
                                
//#line 198 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.lang.Sequence<x10.core.Float> c_coeff167310 =
                                  ((x10.lang.Sequence<x10.core.Float>)
                                    ((x10.array.Array<x10.core.Float>)this.
                                                                        h_coeff_symmetric).sequence());
                                {
                                    
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Runtime.ensureNotInAtomic();
                                    
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final x10.lang.FinishState x10$__var65 =
                                      x10.lang.Runtime.startFinish();
                                    
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
try {try {{
                                        {
                                            
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int i166399min167311 =
                                              0;
                                            
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167312 =
                                              ((this.
                                                  BLOCKS_X167306) * (((int)(this.
                                                                              BLOCKS_Y167307))));
                                            
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int i166399max167313 =
                                              ((t167312) - (((int)(1))));
                                            
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
int i167300 =
                                              i166399min167311;
                                            
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
for (;
                                                                                                                                                   true;
                                                                                                                                                   ) {
                                                
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167301 =
                                                  i167300;
                                                
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final boolean t167302 =
                                                  ((t167301) <= (((int)(i166399max167313))));
                                                
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
if (!(t167302)) {
                                                    
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
break;
                                                }
                                                
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int block167297 =
                                                  i167300;
                                                
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new CUDA3DFD.$Closure$84(this.
                                                                                                                                                                                                                                   RADIUS,
                                                                                                                                                                                                                                 this.
                                                                                                                                                                                                                                   BLOCK_DIMY167304,
                                                                                                                                                                                                                                 ((int)(this.
                                                                                                                                                                                                                                          S_DATA_STRIDE167309)),
                                                                                                                                                                                                                                 ((int)(this.
                                                                                                                                                                                                                                          THREADS167305)),
                                                                                                                                                                                                                                 block167297,
                                                                                                                                                                                                                                 ((int)(this.
                                                                                                                                                                                                                                          BLOCKS_X167306)),
                                                                                                                                                                                                                                 this.
                                                                                                                                                                                                                                   BLOCK_DIMX167303,
                                                                                                                                                                                                                                 ((int)(this.
                                                                                                                                                                                                                                          dimx)),
                                                                                                                                                                                                                                 ((int)(this.
                                                                                                                                                                                                                                          dimy)),
                                                                                                                                                                                                                                 ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                            d_input)),
                                                                                                                                                                                                                                 ((int)(this.
                                                                                                                                                                                                                                          dimz)),
                                                                                                                                                                                                                                 c_coeff167310,
                                                                                                                                                                                                                                 ((x10.array.RemoteArray<x10.core.Float>)(this.
                                                                                                                                                                                                                                                                            d_output)),(java.lang.Class<?>) null))));
                                                
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167298 =
                                                  i167300;
                                                
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
final int t167299 =
                                                  ((t167298) + (((int)(1))));
                                                
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
i167300 = t167299;
                                            }
                                        }
                                    }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__51__) {
                                        
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__51__)));
                                        
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
throw new x10.lang.RuntimeException();
                                    }finally {{
                                         
//#line 199 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src-CUDA/CUDA3DFD.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var65)));
                                     }}
                                    }
                                }
                            
                            public x10.array.Array<x10.core.Float> h_coeff_symmetric;
                            public int BLOCKS_X167306;
                            public int BLOCKS_Y167307;
                            public int RADIUS;
                            public int BLOCK_DIMY167304;
                            public int S_DATA_STRIDE167309;
                            public int THREADS167305;
                            public int BLOCK_DIMX167303;
                            public int dimx;
                            public int dimy;
                            public x10.array.RemoteArray<x10.core.Float> d_input;
                            public int dimz;
                            public x10.array.RemoteArray<x10.core.Float> d_output;
                            
                            // creation method for java code
                            public static CUDA3DFD.$Closure$85 $make(final x10.array.Array<x10.core.Float> h_coeff_symmetric,
                                                                     final int BLOCKS_X167306,
                                                                     final int BLOCKS_Y167307,
                                                                     final int RADIUS,
                                                                     final int BLOCK_DIMY167304,
                                                                     final int S_DATA_STRIDE167309,
                                                                     final int THREADS167305,
                                                                     final int BLOCK_DIMX167303,
                                                                     final int dimx,
                                                                     final int dimy,
                                                                     final x10.array.RemoteArray<x10.core.Float> d_input,
                                                                     final int dimz,
                                                                     final x10.array.RemoteArray<x10.core.Float> d_output,java.lang.Class<?> $dummy0){return new $Closure$85(h_coeff_symmetric,BLOCKS_X167306,BLOCKS_Y167307,RADIUS,BLOCK_DIMY167304,S_DATA_STRIDE167309,THREADS167305,BLOCK_DIMX167303,dimx,dimy,d_input,dimz,d_output,(java.lang.Class<?>) null);}
                            public $Closure$85(final x10.array.Array<x10.core.Float> h_coeff_symmetric,
                                               final int BLOCKS_X167306,
                                               final int BLOCKS_Y167307,
                                               final int RADIUS,
                                               final int BLOCK_DIMY167304,
                                               final int S_DATA_STRIDE167309,
                                               final int THREADS167305,
                                               final int BLOCK_DIMX167303,
                                               final int dimx,
                                               final int dimy,
                                               final x10.array.RemoteArray<x10.core.Float> d_input,
                                               final int dimz,
                                               final x10.array.RemoteArray<x10.core.Float> d_output,java.lang.Class<?> $dummy0) { {
                                                                                                                                         this.h_coeff_symmetric = ((x10.array.Array)(h_coeff_symmetric));
                                                                                                                                         this.BLOCKS_X167306 = BLOCKS_X167306;
                                                                                                                                         this.BLOCKS_Y167307 = BLOCKS_Y167307;
                                                                                                                                         this.RADIUS = RADIUS;
                                                                                                                                         this.BLOCK_DIMY167304 = BLOCK_DIMY167304;
                                                                                                                                         this.S_DATA_STRIDE167309 = S_DATA_STRIDE167309;
                                                                                                                                         this.THREADS167305 = THREADS167305;
                                                                                                                                         this.BLOCK_DIMX167303 = BLOCK_DIMX167303;
                                                                                                                                         this.dimx = dimx;
                                                                                                                                         this.dimy = dimy;
                                                                                                                                         this.d_input = ((x10.array.RemoteArray)(d_input));
                                                                                                                                         this.dimz = dimz;
                                                                                                                                         this.d_output = ((x10.array.RemoteArray)(d_output));
                                                                                                                                     }}
                            
                            }
                            
                    
                    }
                    