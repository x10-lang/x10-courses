public class Fib extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, Fib.class);
    
    public static final x10.rtt.RuntimeType<Fib> $RTT = new x10.rtt.NamedType<Fib>(
    "Fib", /* base class */Fib.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(Fib $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + Fib.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        Fib $_obj = new Fib((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public Fib(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 2 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
// creation method for java code
        public static Fib $make(){return new Fib((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public Fib Fib$$init$S() { {
                                                {
                                                    
//#line 2 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"

                                                }
                                                {
                                                    {
                                                        
//#line 2 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"

                                                    }
                                                    {
                                                        
                                                    }
                                                }
                                            }
                                            return this;
                                            }
        
        // constructor
        public Fib $init(){return Fib$$init$S();}
        
        
        
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
public int
                                                              fibo$O(
                                                              final int n){
            
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
int x =
              0;
            
//#line 5 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
int y =
              1;
            {
                
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
int i =
                  2;
                
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
for (;
                                                                         true;
                                                                         ) {
                    
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79808 =
                      i;
                    
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final boolean t79814 =
                      ((t79808) <= (((int)(n))));
                    
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
if (!(t79814)) {
                        
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
break;
                    }
                    {
                        
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79811 =
                          x;
                        
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79812 =
                          y;
                        
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t =
                          ((t79811) + (((int)(t79812))));
                        
//#line 8 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79813 =
                          y;
                        
//#line 8 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
x = t79813;
                        
//#line 9 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
y = t;
                    }
                    {
                        
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79809 =
                          i;
                        
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79810 =
                          ((t79809) + (((int)(1))));
                        
//#line 6 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
i = t79810;
                    }
                }
            }
            
//#line 11 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79815 =
              y;
            
//#line 11 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
return t79815;
        }
        
        
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
public int
                                                               fib$O(
                                                               final int n){
            
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final boolean t79820 =
              ((n) < (((int)(2))));
            
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
int t79821 =
               0;
            
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
if (t79820) {
                
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
t79821 = n;
            } else {
                
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79816 =
                  ((n) - (((int)(1))));
                
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79818 =
                  this.fib$O((int)(t79816));
                
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79817 =
                  ((n) - (((int)(2))));
                
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79819 =
                  this.fib$O((int)(t79817));
                
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
t79821 = ((t79818) + (((int)(t79819))));
            }
            
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79822 =
              t79821;
            
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
return t79822;
        }
        
        
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
public long
                                                               fact$O(
                                                               final long n){
            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final boolean t79826 =
              ((n) < (((long)(2L))));
            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
long t79827 =
               0;
            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
if (t79826) {
                
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
t79827 = 1L;
            } else {
                
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final long t79823 =
                  ((long)(((int)(1))));
                
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final long t79824 =
                  ((n) - (((long)(t79823))));
                
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final long t79825 =
                  this.fact$O((long)(t79824));
                
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
t79827 = ((n) * (((long)(t79825))));
            }
            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final long t79828 =
              t79827;
            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
return t79828;
        }
        
        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        Fib.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> args) {
            
//#line 18 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79829 =
              ((x10.array.Array<java.lang.String>)args).
                size;
            
//#line 18 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final boolean t79831 =
              ((int) t79829) ==
            ((int) 0);
            
//#line 18 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
if (t79831) {
                
//#line 19 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final x10.io.Printer t79830 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 19 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
t79830.println(((java.lang.String)("Sorry. Run fib <n:int>")));
                
//#line 20 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
return;
            }
            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final java.lang.String t79832 =
              ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int n =
              java.lang.Integer.parseInt(t79832);
            
//#line 23 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final Fib f =
              ((Fib)(new Fib((java.lang.System[]) null).$init()));
            {
                
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
int i =
                  2;
                
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
for (;
                                                                          true;
                                                                          ) {
                    
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79834 =
                      i;
                    
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final boolean t79848 =
                      ((t79834) <= (((int)(n))));
                    
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
if (!(t79848)) {
                        
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
break;
                    }
                    {
                        
//#line 26 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79837 =
                          i;
                        
//#line 26 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int fib =
                          f.fib$O((int)(t79837));
                        
//#line 27 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79838 =
                          i;
                        
//#line 27 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int fibo =
                          f.fibo$O((int)(t79838));
                        
//#line 28 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final x10.io.Printer t79842 =
                          ((x10.io.Printer)(x10.io.Console.OUT));
                        
//#line 28 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79839 =
                          i;
                        
//#line 28 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final java.lang.String t79840 =
                          (("fib(") + ((x10.core.Int.$box(t79839))));
                        
//#line 28 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final java.lang.String t79841 =
                          ((t79840) + (")= "));
                        
//#line 28 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final java.lang.String t79843 =
                          ((t79841) + ((x10.core.Int.$box(fib))));
                        
//#line 28 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
t79842.print(((java.lang.String)(t79843)));
                        
//#line 29 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final x10.io.Printer t79846 =
                          ((x10.io.Printer)(x10.io.Console.OUT));
                        
//#line 29 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final boolean t79844 =
                          ((int) fib) ==
                        ((int) fibo);
                        
//#line 29 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
java.lang.String t79845 =
                           null;
                        
//#line 29 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
if (t79844) {
                            
//#line 29 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
t79845 = "(ok)";
                        } else {
                            
//#line 29 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
t79845 = ((" fibo = ") + ((x10.core.Int.$box(fibo))));
                        }
                        
//#line 29 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final java.lang.String t79847 =
                          t79845;
                        
//#line 29 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
t79846.println(((java.lang.String)(t79847)));
                    }
                    {
                        
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79835 =
                          i;
                        
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final int t79836 =
                          ((t79835) + (((int)(1))));
                        
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
i = t79836;
                    }
                }
            }
        }
        
        
//#line 1 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
final public Fib
                                                              Fib$$Fib$this(
                                                              ){
            
//#line 1 "C:/eclipsews/pppp11/pppp11/src/Fib.x10"
return Fib.this;
        }
    
}
