public class Utils extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, Utils.class);
    
    public static final x10.rtt.RuntimeType<Utils> $RTT = new x10.rtt.NamedType<Utils>(
    "Utils", /* base class */Utils.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(Utils $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + Utils.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        Utils $_obj = new Utils((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public Utils(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 2 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
public static int
                                                                max$O(
                                                                final int a,
                                                                final int b){
            
//#line 2 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final boolean t83785 =
              ((a) > (((int)(b))));
            
//#line 2 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
int t83786 =
               0;
            
//#line 2 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
if (t83785) {
                
//#line 2 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
t83786 = a;
            } else {
                
//#line 2 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
t83786 = b;
            }
            
//#line 2 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final int t83787 =
              t83786;
            
//#line 2 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
return t83787;
        }
        
        
//#line 3 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
public static int
                                                                min$O(
                                                                final int a,
                                                                final int b){
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final boolean t83788 =
              ((a) > (((int)(b))));
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
int t83789 =
               0;
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
if (t83788) {
                
//#line 3 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
t83789 = b;
            } else {
                
//#line 3 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
t83789 = a;
            }
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final int t83790 =
              t83789;
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
return t83790;
        }
        
        
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
public static double
                                                                max$O(
                                                                final double a,
                                                                final double b){
            
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final boolean t83791 =
              ((a) > (((double)(b))));
            
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
double t83792 =
               0;
            
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
if (t83791) {
                
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
t83792 = a;
            } else {
                
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
t83792 = b;
            }
            
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final double t83793 =
              t83792;
            
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
return t83793;
        }
        
        
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
public static double
                                                                min$O(
                                                                final double a,
                                                                final double b){
            
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final boolean t83794 =
              ((a) > (((double)(b))));
            
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
double t83795 =
               0;
            
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
if (t83794) {
                
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
t83795 = b;
            } else {
                
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
t83795 = a;
            }
            
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final double t83796 =
              t83795;
            
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
return t83796;
        }
        
        
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
public static double
                                                                fabs$O(
                                                                final double v){
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final boolean t83797 =
              ((v) >= (((double)(0.0))));
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
double t83798 =
               0;
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
if (t83797) {
                
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
t83798 = v;
            } else {
                
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
t83798 = (-(v));
            }
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final double t83799 =
              t83798;
            
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
return t83799;
        }
        
        
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
public static double
                                                                FFT_Flops$O(
                                                                final int n){
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final double t83800 =
              ((double)(int)(((int)(n))));
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final double t83801 =
              ((4.0) * (((double)(t83800))));
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final double t83802 =
              ((t83801) - (((double)(3.0))));
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final double t83803 =
              ((double)(int)(((int)(n))));
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final double t83804 =
              ((t83802) * (((double)(t83803))));
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final double t83805 =
              ((t83804) - (((double)(1.0))));
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final double t83806 =
              ((double)(int)(((int)(n))));
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final double t83807 =
              ((t83805) * (((double)(t83806))));
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final double t83808 =
              ((t83807) / (((double)(6.0))));
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
return t83808;
        }
        
        
//#line 8 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
public static boolean
                                                                powerOf2$O(
                                                                int p){
            
//#line 9 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final int t83809 =
              p;
            
//#line 9 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final boolean t83810 =
              ((t83809) <= (((int)(0))));
            
//#line 9 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
if (t83810) {
                
//#line 9 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
return false;
            }
            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final int t83811 =
              p;
            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final boolean t83812 =
              ((int) t83811) ==
            ((int) 1);
            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
if (t83812) {
                
//#line 10 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
return true;
            }
            
//#line 11 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
while (true) {
                
//#line 12 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final int t83813 =
                  p;
                
//#line 12 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final int t83814 =
                  ((t83813) % (((int)(2))));
                
//#line 12 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final boolean t83815 =
                  ((int) t83814) ==
                ((int) 1);
                
//#line 12 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
if (t83815) {
                    
//#line 12 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
return false;
                }
                
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final int t83816 =
                  p;
                
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final int t83817 =
                  ((t83816) / (((int)(2))));
                
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
p = t83817;
                
//#line 14 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final int t83818 =
                  p;
                
//#line 14 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final boolean t83819 =
                  ((int) t83818) ==
                ((int) 1);
                
//#line 14 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
if (t83819) {
                    
//#line 14 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
return true;
                }
            }
        }
        
        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
public static int
                                                                 log2$O(
                                                                 int p){
            
//#line 18 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
assert Utils.powerOf2$O((int)(p)): (((("p=") + ((x10.core.Int.$box(p))))) + (" is not a power of 2"));
            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final int t83820 =
              p;
            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final boolean t83821 =
              ((int) t83820) ==
            ((int) 1);
            
//#line 19 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
if (t83821) {
                
//#line 19 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
return 0;
            }
            
//#line 20 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
int i =
              0;
            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
while (true) {
                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final int t83822 =
                  p;
                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final boolean t83827 =
                  ((t83822) > (((int)(1))));
                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
if (!(t83827)) {
                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
break;
                }
                {
                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final int t83823 =
                      p;
                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final int t83824 =
                      ((t83823) / (((int)(2))));
                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
p = t83824;
                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final int t83825 =
                      i;
                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final int t83826 =
                      ((t83825) + (((int)(1))));
                    
//#line 21 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
i = t83826;
                }
            }
            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final int t83828 =
              i;
            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
return t83828;
        }
        
        
//#line 1 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
final public Utils
                                                                Utils$$Utils$this(
                                                                ){
            
//#line 1 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
return Utils.this;
        }
        
        
//#line 1 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"
// creation method for java code
        public static Utils $make(){return new Utils((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public Utils Utils$$init$S() { {
                                                    {
                                                        
//#line 1 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"

                                                    }
                                                    {
                                                        {
                                                            
//#line 1 "C:/eclipsews/pppp11/pppp11/src/Utils.x10"

                                                        }
                                                        {
                                                            
                                                        }
                                                    }
                                                }
                                                return this;
                                                }
        
        // constructor
        public Utils $init(){return Utils$$init$S();}
        
    
}
