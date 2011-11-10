
public class HelloWholeWorld extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, HelloWholeWorld.class);
    
    public static final x10.rtt.RuntimeType<HelloWholeWorld> $RTT = new x10.rtt.NamedType<HelloWholeWorld>(
    "HelloWholeWorld", /* base class */HelloWholeWorld.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(HelloWholeWorld $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + HelloWholeWorld.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        HelloWholeWorld $_obj = new HelloWholeWorld((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public HelloWholeWorld(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
        
//#line 18 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        HelloWholeWorld.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> id$148345) {
            {
                
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
x10.lang.Runtime.ensureNotInAtomic();
                
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
final x10.lang.FinishState x10$__var60 =
                  x10.lang.Runtime.startFinish();
                
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
try {try {{
                    {
                        
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
final x10.lang.Sequence<x10.lang.Place> t164297 =
                          x10.lang.Place.places();
                        
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
final x10.lang.Iterator<x10.lang.Place> p164295 =
                          ((x10.lang.Iterator<x10.lang.Place>)
                            ((x10.lang.Iterable<x10.lang.Place>)t164297).iterator());
                        
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
for (;
                                                                                                                                true;
                                                                                                                                ) {
                            
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
final boolean t164301 =
                              ((x10.lang.Iterator<x10.lang.Place>)p164295).hasNext$O();
                            
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
if (!(t164301)) {
                                
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
break;
                            }
                            
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
final x10.lang.Place p164302 =
                              ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p164295).next$G()));
                            
//#line 20 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
x10.lang.Runtime.runAsync(((x10.lang.Place)(p164302)),
                                                                                                                                                         ((x10.core.fun.VoidFun_0_0)(new HelloWholeWorld.$Closure$78(p164302))));
                        }
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__46__) {
                    
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__46__)));
                    
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
throw new x10.lang.RuntimeException();
                }finally {{
                     
//#line 19 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var60)));
                 }}
                }
            }
        
        
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
final public HelloWholeWorld
                                                                                                             HelloWholeWorld$$HelloWholeWorld$this(
                                                                                                             ){
            
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
return HelloWholeWorld.this;
        }
        
        
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
// creation method for java code
        public static HelloWholeWorld $make(){return new HelloWholeWorld((java.lang.System[]) null).$init();}
        
        // constructor for non-virtual call
        final public HelloWholeWorld HelloWholeWorld$$init$S() { {
                                                                        
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"

                                                                        
//#line 17 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"

                                                                    }
                                                                    return this;
                                                                    }
        
        // constructor
        public HelloWholeWorld $init(){return HelloWholeWorld$$init$S();}
        
        
        public static class $Closure$78 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$78.class);
            
            public static final x10.rtt.RuntimeType<$Closure$78> $RTT = new x10.rtt.StaticVoidFunType<$Closure$78>(
            /* base class */$Closure$78.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$78 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$78.class + " calling"); } 
                x10.lang.Place p164302 = (x10.lang.Place) $deserializer.readRef();
                $_obj.p164302 = p164302;
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$78 $_obj = new $Closure$78((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (p164302 instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.p164302);
                } else {
                $serializer.write(this.p164302);
                }
                
            }
            
            // constructor just for allocation
            public $Closure$78(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 20 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
final x10.io.Printer t164303 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 20 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
final int t164304 =
                      this.
                        p164302.
                        id;
                    
//#line 20 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
final java.lang.String t164305 =
                      (("Hello World from place ") + ((x10.core.Int.$box(t164304))));
                    
//#line 20 "/home/dgrove/scratch/x10dt-2-2-1-SC11/workspace/SmallSamples/src/HelloWholeWorld.x10"
t164303.println(((java.lang.String)(t164305)));
                }
                
                public x10.lang.Place p164302;
                
                // creation method for java code
                public static HelloWholeWorld.$Closure$78 $make(final x10.lang.Place p164302){return new $Closure$78(p164302);}
                public $Closure$78(final x10.lang.Place p164302) { {
                                                                          this.p164302 = ((x10.lang.Place)(p164302));
                                                                      }}
                
            }
            
        
        }
        