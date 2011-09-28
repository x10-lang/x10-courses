public class Hello extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, Hello.class);
    
    public static final x10.rtt.RuntimeType<Hello> $RTT = new x10.rtt.NamedType<Hello>(
    "Hello", /* base class */Hello.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(Hello $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + Hello.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        Hello $_obj = new Hello((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public Hello(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 9 "C:/eclipsews/pppp11/pppp11/src/Hello.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        Hello.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> id$68480) {
            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/Hello.x10"
final x10.io.Printer t77675 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 10 "C:/eclipsews/pppp11/pppp11/src/Hello.x10"
t77675.println(((java.lang.String)("Hello, World!")));
        }
        
        
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Hello.x10"
final public Hello
                                                                Hello$$Hello$this(
                                                                ){
            
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Hello.x10"
return Hello.this;
        }
        
        
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Hello.x10"
// creation method for java code
        public static Hello $make(){return new Hello((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public Hello Hello$$init$S() { {
                                                    {
                                                        
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Hello.x10"

                                                    }
                                                    {
                                                        {
                                                            
//#line 4 "C:/eclipsews/pppp11/pppp11/src/Hello.x10"

                                                        }
                                                        {
                                                            
                                                        }
                                                    }
                                                }
                                                return this;
                                                }
        
        // constructor
        public Hello $init(){return Hello$$init$S();}
        
    
}
