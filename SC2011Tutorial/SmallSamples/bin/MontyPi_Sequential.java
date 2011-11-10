
public class MontyPi_Sequential extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, MontyPi_Sequential.class);
    
    public static final x10.rtt.RuntimeType<MontyPi_Sequential> $RTT = new x10.rtt.NamedType<MontyPi_Sequential>(
    "MontyPi_Sequential", /* base class */MontyPi_Sequential.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(MontyPi_Sequential $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + MontyPi_Sequential.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        MontyPi_Sequential $_obj = new MontyPi_Sequential((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public MontyPi_Sequential(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 23 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        MontyPi_Sequential.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> args) {
            
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final java.lang.String t163988 =
              ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
            
//#line 24 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final int N =
              java.lang.Integer.parseInt(t163988);
            
//#line 25 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final x10.util.Random r =
              ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).$init()));
            
//#line 26 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
double result =
              ((double)(int)(((int)(0))));
            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final int i163973min164021 =
              1;
            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final int i163973max164022 =
              N;
            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
int i164018 =
              i163973min164021;
            
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
for (;
                                                                                                                       true;
                                                                                                                       ) {
                
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final int t164019 =
                  i164018;
                
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final boolean t164020 =
                  ((t164019) <= (((int)(i163973max164022))));
                
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
if (!(t164020)) {
                    
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
break;
                }
                
//#line 28 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final double x164007 =
                  r.nextDouble$O();
                
//#line 29 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final double y164008 =
                  r.nextDouble$O();
                
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final double t164009 =
                  ((x164007) * (((double)(x164007))));
                
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final double t164010 =
                  ((y164008) * (((double)(y164008))));
                
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final double t164011 =
                  ((t164009) + (((double)(t164010))));
                
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final double t164012 =
                  ((double)(int)(((int)(1))));
                
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final boolean t164013 =
                  ((t164011) <= (((double)(t164012))));
                
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
if (t164013) {
                    
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final double t164014 =
                      result;
                    
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final double t164015 =
                      ((t164014) + (((double)(1.0))));
                    
//#line 30 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
result = t164015;
                }
                
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final int t164016 =
                  i164018;
                
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final int t164017 =
                  ((t164016) + (((int)(1))));
                
//#line 27 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
i164018 = t164017;
            }
            
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final double t164001 =
              ((double)(int)(((int)(4))));
            
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final double t164002 =
              result;
            
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final double t164003 =
              ((t164001) * (((double)(t164002))));
            
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final double t164004 =
              ((double)(int)(((int)(N))));
            
//#line 32 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final double pi =
              ((t164003) / (((double)(t164004))));
            
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final x10.io.Printer t164005 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final java.lang.String t164006 =
              (("The value of pi is ") + ((x10.core.Double.$box(pi))));
            
//#line 33 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
t164005.println(((java.lang.String)(t164006)));
        }
        
        
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
final public MontyPi_Sequential
                                                                                                                MontyPi_Sequential$$MontyPi_Sequential$this(
                                                                                                                ){
            
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
return MontyPi_Sequential.this;
        }
        
        
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"
// creation method for java code
        public static MontyPi_Sequential $make(){return new MontyPi_Sequential((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public MontyPi_Sequential MontyPi_Sequential$$init$S() { {
                                                                              
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"

                                                                              
//#line 22 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/MontyPi_Sequential.x10"

                                                                          }
                                                                          return this;
                                                                          }
        
        // constructor
        public MontyPi_Sequential $init(){return MontyPi_Sequential$$init$S();}
        
    
}
