
public class SpanningTree extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, SpanningTree.class);
    
    public static final x10.rtt.RuntimeType<SpanningTree> $RTT = new x10.rtt.NamedType<SpanningTree>(
    "SpanningTree", /* base class */SpanningTree.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(SpanningTree $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + SpanningTree.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        SpanningTree $_obj = new SpanningTree((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public SpanningTree(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
//#line 4 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
public static class V extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
                                                                     {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, V.class);
            
            public static final x10.rtt.RuntimeType<V> $RTT = new x10.rtt.NamedType<V>(
            "SpanningTree.V", /* base class */V.class
            , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body(V $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + V.class + " calling"); } 
                x10.array.Array edges = (x10.array.Array) $deserializer.readRef();
                $_obj.edges = edges;
                SpanningTree.V out = (SpanningTree.V) $deserializer.readRef();
                $_obj.out = out;
                $_obj.id = $deserializer.readInt();
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                V $_obj = new V((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                if (edges instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.edges);
                } else {
                $serializer.write(this.edges);
                }
                if (out instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.out);
                } else {
                $serializer.write(this.out);
                }
                $serializer.write(this.id);
                
            }
            
            // constructor just for allocation
            public V(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
//#line 4 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
public int id;
                
                
//#line 5 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
public x10.array.Array<SpanningTree.V> edges;
                
//#line 6 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
public SpanningTree.V out;
                
                
//#line 7 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
// creation method for java code
                public static SpanningTree.V $make(final int id){return new SpanningTree.V((java.lang.System[]) null).$init(id);}
                
                // constructor for non-virtual call
                final public SpanningTree.V SpanningTree$V$$init$S(final int id) { {
                                                                                          {
                                                                                              
//#line 7 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"

                                                                                          }
                                                                                          {
                                                                                              {
                                                                                                  
//#line 8 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
this.id = id;
                                                                                                  
                                                                                              }
                                                                                              
//#line 4 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
this.__fieldInitializers81181();
                                                                                          }
                                                                                      }
                                                                                      return this;
                                                                                      }
                
                // constructor
                public SpanningTree.V $init(final int id){return SpanningTree$V$$init$S(id);}
                
                
                
//#line 10 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
public void
                                                                                set__0$1SpanningTree$V$2(
                                                                                final x10.array.Array e){
                    
//#line 11 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
this.edges = ((x10.array.Array)(e));
                }
                
                
//#line 13 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
public void
                                                                                mark(
                                                                                ){
                    
//#line 14 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
this.out = ((SpanningTree.V)(this));
                    {
                        
//#line 15 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
x10.lang.Runtime.ensureNotInAtomic();
                        
//#line 15 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.lang.FinishState x10$__var33 =
                          x10.lang.Runtime.startFinish();
                        
//#line 15 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
try {try {{
                            {
                                
//#line 15 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
this.visit();
                            }
                        }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__27__) {
                            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__27__)));
                            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
throw new x10.lang.RuntimeException();
                        }finally {{
                             
//#line 15 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var33)));
                         }}
                        }
                    }
                
                
//#line 17 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
public boolean
                                                                                first$O(
                                                                                final SpanningTree.V v){
                    
//#line 18 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
SpanningTree.V prev =
                       null;
                    
//#line 19 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
try {{
                        
//#line 19 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
x10.lang.Runtime.enterAtomic();
                        {
                            
//#line 20 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final SpanningTree.V t81558 =
                              ((SpanningTree.V)(out));
                            
//#line 20 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
prev = t81558;
                            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final SpanningTree.V t81559 =
                              ((SpanningTree.V)(out));
                            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
boolean t81563 =
                              ((t81559) == (null));
                            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
if (!(t81563)) {
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final SpanningTree.V t81560 =
                                  ((SpanningTree.V)(out));
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81561 =
                                  t81560.
                                    id;
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81562 =
                                  v.
                                    id;
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
t81563 = ((t81561) > (((int)(t81562))));
                            }
                            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final boolean t81564 =
                              t81563;
                            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
SpanningTree.V t81565 =
                               null;
                            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
if (t81564) {
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
t81565 = ((SpanningTree.V)(v));
                            } else {
                                
//#line 21 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
t81565 = ((SpanningTree.V)(out));
                            }
                            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final SpanningTree.V t81566 =
                              ((SpanningTree.V)(t81565));
                            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
this.out = ((SpanningTree.V)(t81566));
                        }
                    }}finally {{
                          
//#line 19 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
x10.lang.Runtime.exitAtomic();
                      }}
                    
//#line 23 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final SpanningTree.V t81567 =
                      prev;
                    
//#line 23 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final boolean t81568 =
                      ((t81567) == (null));
                    
//#line 23 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
return t81568;
                    }
                
                
//#line 25 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
public void
                                                                                visit(
                                                                                ){
                    
//#line 26 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.array.Array<SpanningTree.V> t81570 =
                      ((x10.array.Array)(edges));
                    
//#line 26 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.lang.Iterable<SpanningTree.V> t81571 =
                      ((x10.lang.Iterable<SpanningTree.V>)
                        ((x10.array.Array<SpanningTree.V>)t81570).values());
                    
//#line 26 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.lang.Iterator<SpanningTree.V> v81528 =
                      ((x10.lang.Iterator<SpanningTree.V>)
                        ((x10.lang.Iterable<SpanningTree.V>)t81571).iterator());
                    
//#line 26 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
for (;
                                                                                       true;
                                                                                       ) {
                        
//#line 26 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final boolean t81573 =
                          ((x10.lang.Iterator<SpanningTree.V>)v81528).hasNext$O();
                        
//#line 26 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
if (!(t81573)) {
                            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
break;
                        }
                        {
                            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final SpanningTree.V v =
                              ((SpanningTree.V)(((x10.lang.Iterator<SpanningTree.V>)v81528).next$G()));
                            
//#line 27 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final boolean t81572 =
                              v.first$O(((SpanningTree.V)(this)));
                            
//#line 27 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
if (t81572) {
                                
//#line 27 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new SpanningTree.V.$Closure$86(v))));
                            }
                        }
                        {
                            
                        }
                    }
                }
                
                
//#line 31 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
public java.lang.String
                                                                                edgeString$O(
                                                                                ){
                    
//#line 32 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.array.Array<SpanningTree.V> t81574 =
                      ((x10.array.Array)(edges));
                    
//#line 32 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final boolean t81575 =
                      ((t81574) == (null));
                    
//#line 32 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
if (t81575) {
                        
//#line 32 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
return "";
                    }
                    
//#line 33 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
java.lang.String r =
                      "";
                    {
                        
//#line 34 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.array.Array<SpanningTree.V> t81577 =
                          ((x10.array.Array)(edges));
                        
//#line 34 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.lang.Iterable<SpanningTree.V> t81578 =
                          ((x10.lang.Iterable<SpanningTree.V>)
                            ((x10.array.Array<SpanningTree.V>)t81577).values());
                        
//#line 34 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.lang.Iterator<SpanningTree.V> v81530 =
                          ((x10.lang.Iterator<SpanningTree.V>)
                            ((x10.lang.Iterable<SpanningTree.V>)t81578).iterator());
                        
//#line 34 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
for (;
                                                                                           true;
                                                                                           ) {
                            
//#line 34 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final boolean t81583 =
                              ((x10.lang.Iterator<SpanningTree.V>)v81530).hasNext$O();
                            
//#line 34 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
if (!(t81583)) {
                                
//#line 34 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
break;
                            }
                            {
                                
//#line 34 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final SpanningTree.V v =
                                  ((SpanningTree.V)(((x10.lang.Iterator<SpanningTree.V>)v81530).next$G()));
                                
//#line 35 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final java.lang.String t81580 =
                                  r;
                                
//#line 35 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81579 =
                                  v.
                                    id;
                                
//#line 35 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final java.lang.String t81581 =
                                  ((" ") + ((x10.core.Int.$box(t81579))));
                                
//#line 35 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final java.lang.String t81582 =
                                  ((t81580) + (t81581));
                                
//#line 35 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
r = t81582;
                            }
                            {
                                
                            }
                        }
                    }
                    
//#line 36 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final java.lang.String t81584 =
                      r;
                    
//#line 36 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
return t81584;
                }
                
                
//#line 38 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
public java.lang.String
                                                                                toString(
                                                                                ){
                    
//#line 39 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81585 =
                      id;
                    
//#line 39 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final java.lang.String t81586 =
                      (("") + ((x10.core.Int.$box(t81585))));
                    
//#line 39 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final java.lang.String t81587 =
                      ((t81586) + (" ("));
                    
//#line 39 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final java.lang.String t81588 =
                      this.edgeString$O();
                    
//#line 39 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final java.lang.String t81589 =
                      ((t81587) + (t81588));
                    
//#line 39 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final java.lang.String t81595 =
                      ((t81589) + (") > "));
                    
//#line 39 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final SpanningTree.V t81590 =
                      ((SpanningTree.V)(out));
                    
//#line 39 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final boolean t81593 =
                      ((t81590) == (null));
                    
//#line 39 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
java.lang.String t81594 =
                       null;
                    
//#line 39 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
if (t81593) {
                        
//#line 39 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
t81594 = "null";
                    } else {
                        
//#line 39 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final SpanningTree.V t81591 =
                          ((SpanningTree.V)(out));
                        
//#line 39 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81592 =
                          t81591.
                            id;
                        
//#line 39 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
t81594 = (("") + ((x10.core.Int.$box(t81592))));
                    }
                    
//#line 39 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final java.lang.String t81596 =
                      t81594;
                    
//#line 39 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final java.lang.String t81597 =
                      ((t81595) + (t81596));
                    
//#line 39 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
return t81597;
                }
                
                
//#line 4 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final public SpanningTree.V
                                                                               SpanningTree$V$$SpanningTree$V$this(
                                                                               ){
                    
//#line 4 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
return SpanningTree.V.this;
                }
                
                
//#line 4 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final private void
                                                                               __fieldInitializers81181(
                                                                               ){
                    
//#line 4 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
this.edges = null;
                    
//#line 4 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
this.out = null;
                }
                
                final public static void
                  __fieldInitializers81181$P(
                  final SpanningTree.V V){
                    V.__fieldInitializers81181();
                }
                
                public static class $Closure$86 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$86.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$86> $RTT = new x10.rtt.StaticVoidFunType<$Closure$86>(
                    /* base class */$Closure$86.class
                    , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$86 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$86.class + " calling"); } 
                        SpanningTree.V v = (SpanningTree.V) $deserializer.readRef();
                        $_obj.v = v;
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
                    
                        if (v instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.v);
                        } else {
                        $serializer.write(this.v);
                        }
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$86(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    
                        
                        public void
                          $apply(
                          ){
                            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
this.
                                                                                            v.visit();
                        }
                        
                        public SpanningTree.V v;
                        
                        // creation method for java code
                        public static SpanningTree.V.$Closure$86 $make(final SpanningTree.V v){return new $Closure$86(v);}
                        public $Closure$86(final SpanningTree.V v) { {
                                                                            this.v = ((SpanningTree.V)(v));
                                                                        }}
                        
                    }
                    
                
                }
                
                
                
//#line 41 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
                private static final long serialVersionUID = 1L;
                public static void main(java.lang.String[] args) {
                // start native runtime
                new $Main().start(args);
                }
                
                // called by native runtime inside main x10 thread
                public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
                // call the original app-main method
                SpanningTree.main(args);
                }
                }
                
                // the original app-main method
                public static void main(final x10.array.Array<java.lang.String> args) {
                    
//#line 42 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final java.lang.String t81598 =
                      ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
                    
//#line 42 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int N =
                      java.lang.Integer.parseInt(t81598);
                    
//#line 43 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.io.Printer t81599 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 43 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final java.lang.String t81600 =
                      (("N=") + ((x10.core.Int.$box(N))));
                    
//#line 43 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
t81599.println(((java.lang.String)(t81600)));
                    
//#line 44 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,SpanningTree.V> t81602 =
                      ((x10.core.fun.Fun_0_1)(new SpanningTree.$Closure$87()));
                    
//#line 44 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.array.Array<SpanningTree.V> vertices =
                      ((x10.array.Array)(new x10.array.Array<SpanningTree.V>((java.lang.System[]) null, SpanningTree.V.$RTT).$init(((int)(N)),
                                                                                                                                   ((x10.core.fun.Fun_0_1)(t81602)),(java.lang.Class<?>[][][][]) null)));
                    
//#line 45 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.util.Random r =
                      ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).$init()));
                    {
                        
//#line 46 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.lang.Iterable<SpanningTree.V> t81604 =
                          ((x10.lang.Iterable<SpanningTree.V>)
                            ((x10.array.Array<SpanningTree.V>)vertices).values());
                        
//#line 46 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.lang.Iterator<SpanningTree.V> v81532 =
                          ((x10.lang.Iterator<SpanningTree.V>)
                            ((x10.lang.Iterable<SpanningTree.V>)t81604).iterator());
                        
//#line 46 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
for (;
                                                                                           true;
                                                                                           ) {
                            
//#line 46 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final boolean t81620 =
                              ((x10.lang.Iterator<SpanningTree.V>)v81532).hasNext$O();
                            
//#line 46 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
if (!(t81620)) {
                                
//#line 46 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
break;
                            }
                            {
                                
//#line 46 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final SpanningTree.V v =
                                  ((SpanningTree.V)(((x10.lang.Iterator<SpanningTree.V>)v81532).next$G()));
                                
//#line 47 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81605 =
                                  r.nextInt$O((int)(N));
                                
//#line 47 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81606 =
                                  x10.lang.Math.abs$O((int)(t81605));
                                
//#line 47 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81607 =
                                  ((t81606) + (((int)(1))));
                                
//#line 47 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int N1 =
                                  x10.lang.Math.min$O((int)(t81607),
                                                      (int)(4));
                                
//#line 48 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,SpanningTree.V> t81618 =
                                  ((x10.core.fun.Fun_0_1)(new SpanningTree.$Closure$88(v,
                                                                                       N,
                                                                                       r,
                                                                                       vertices,(java.lang.Class<?>) null)));
                                
//#line 48 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.array.Array<SpanningTree.V> t81619 =
                                  ((x10.array.Array)(new x10.array.Array<SpanningTree.V>((java.lang.System[]) null, SpanningTree.V.$RTT).$init(((int)(N1)),
                                                                                                                                               ((x10.core.fun.Fun_0_1)(t81618)),(java.lang.Class<?>[][][][]) null)));
                                
//#line 48 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
v.set__0$1SpanningTree$V$2(((x10.array.Array)(t81619)));
                            }
                            {
                                
                            }
                        }
                    }
                    
//#line 52 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.io.Printer t81621 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 52 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
t81621.println(((java.lang.String)("Starting mark.")));
                    
//#line 53 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final long time =
                      x10.lang.System.nanoTime$O();
                    
//#line 54 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final SpanningTree.V t81622 =
                      ((x10.array.Array<SpanningTree.V>)vertices).$apply$G((int)(0));
                    
//#line 54 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
t81622.mark();
                    
//#line 55 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.io.Printer t81632 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 55 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final long t81623 =
                      x10.lang.System.nanoTime$O();
                    
//#line 55 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final long t81624 =
                      ((t81623) - (((long)(time))));
                    
//#line 55 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final double t81625 =
                      ((double)(long)(((long)(t81624))));
                    
//#line 55 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final double t81628 =
                      ((t81625) * (((double)(1.0))));
                    
//#line 55 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81626 =
                      1000000;
                    
//#line 55 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81627 =
                      1000000000;
                    
//#line 55 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final double t81629 =
                      ((double)(int)(((int)(t81627))));
                    
//#line 55 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final double t81630 =
                      ((t81628) / (((double)(t81629))));
                    
//#line 55 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final java.lang.String t81631 =
                      (("Time: ") + ((x10.core.Double.$box(t81630))));
                    
//#line 55 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final java.lang.String t81633 =
                      ((t81631) + (" s"));
                    
//#line 55 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
t81632.println(((java.lang.String)(t81633)));
                    {
                        
//#line 56 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.array.Region v81534 =
                          ((x10.array.Region)(((x10.array.Array<SpanningTree.V>)vertices).
                                                region));
                        
//#line 56 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.array.Array<x10.core.Int> v81535 =
                          ((x10.array.Array)(x10.core.ArrayFactory.<x10.core.Int> makeArrayFromJavaArray(x10.rtt.Types.INT, new int[] {0})));
                        
//#line 56 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int v81536min81537 =
                          v81534.min$O((int)(0));
                        
//#line 56 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int v81536max81538 =
                          v81534.max$O((int)(0));
                        {
                            
//#line 56 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
int v81536 =
                              v81536min81537;
                            
//#line 56 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
for (;
                                                                                               true;
                                                                                               ) {
                                
//#line 56 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81635 =
                                  v81536;
                                
//#line 56 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final boolean t81641 =
                                  ((t81635) <= (((int)(v81536max81538))));
                                
//#line 56 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
if (!(t81641)) {
                                    
//#line 56 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
break;
                                }
                                {
                                    
//#line 56 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81638 =
                                      v81536;
                                    
//#line 56 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
((x10.array.Array<x10.core.Int>)v81535).$set__1x10$array$Array$$T$G((int)(0),
                                                                                                                                                                      x10.core.Int.$box(t81638));
                                    
//#line 56 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.array.Point v =
                                      ((x10.array.Point)(x10.array.Point.<x10.core.Int>make__0$1x10$array$Point$$T$2(x10.rtt.Types.INT, ((x10.array.Array)(v81535)))));
                                    {
                                        
//#line 57 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final x10.io.Printer t81639 =
                                          ((x10.io.Printer)(x10.io.Console.OUT));
                                        
//#line 57 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final java.lang.String t81640 =
                                          (("") + (v));
                                        
//#line 57 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
t81639.println(((java.lang.String)(t81640)));
                                    }
                                }
                                {
                                    
//#line 56 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81636 =
                                      v81536;
                                    
//#line 56 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81637 =
                                      ((t81636) + (((int)(1))));
                                    
//#line 56 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
v81536 = t81637;
                                }
                            }
                        }
                    }
                }
                
                
//#line 2 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final public SpanningTree
                                                                               SpanningTree$$SpanningTree$this(
                                                                               ){
                    
//#line 2 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
return SpanningTree.this;
                }
                
                
//#line 2 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
// creation method for java code
                public static SpanningTree $make(){return new SpanningTree((java.lang.System[]) null).$init();}
                
                // constructor for non-virtual call
                final public SpanningTree SpanningTree$$init$S() { {
                                                                          {
                                                                              
//#line 2 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"

                                                                          }
                                                                          {
                                                                              {
                                                                                  
//#line 2 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"

                                                                              }
                                                                              {
                                                                                  
                                                                              }
                                                                          }
                                                                      }
                                                                      return this;
                                                                      }
                
                // constructor
                public SpanningTree $init(){return SpanningTree$$init$S();}
                
                
                public static class $Closure$87 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$87.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$87> $RTT = new x10.rtt.StaticFunType<$Closure$87>(
                    /* base class */$Closure$87.class
                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, SpanningTree.V.$RTT), x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$87 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$87.class + " calling"); } 
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
                    
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$87(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                    return $apply(x10.core.Int.$unbox(a1));
                    }
                    
                        
                        public SpanningTree.V
                          $apply(
                          final int i){
                            
//#line 44 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final SpanningTree.V t81601 =
                              ((SpanningTree.V)(new SpanningTree.V((java.lang.System[]) null).$init(((int)(i)))));
                            
//#line 44 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
return t81601;
                        }
                        
                        // creation method for java code
                        public static SpanningTree.$Closure$87 $make(){return new $Closure$87();}
                        public $Closure$87() { {
                                                      
                                                  }}
                        
                    }
                    
                public static class $Closure$88 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$88.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$88> $RTT = new x10.rtt.StaticFunType<$Closure$88>(
                    /* base class */$Closure$88.class
                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, SpanningTree.V.$RTT), x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$88 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$88.class + " calling"); } 
                        SpanningTree.V v = (SpanningTree.V) $deserializer.readRef();
                        $_obj.v = v;
                        $_obj.N = $deserializer.readInt();
                        x10.util.Random r = (x10.util.Random) $deserializer.readRef();
                        $_obj.r = r;
                        x10.array.Array vertices = (x10.array.Array) $deserializer.readRef();
                        $_obj.vertices = vertices;
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
                    
                        if (v instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.v);
                        } else {
                        $serializer.write(this.v);
                        }
                        $serializer.write(this.N);
                        if (r instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.r);
                        } else {
                        $serializer.write(this.r);
                        }
                        if (vertices instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.vertices);
                        } else {
                        $serializer.write(this.vertices);
                        }
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$88(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                    return $apply(x10.core.Int.$unbox(a1));
                    }
                    
                        
                        public SpanningTree.V
                          $apply(
                          final int i){
                            
//#line 49 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final boolean t81614 =
                              ((int) i) ==
                            ((int) 0);
                            
//#line 49 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
int t81615 =
                               0;
                            
//#line 49 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
if (t81614) {
                                
//#line 49 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81608 =
                                  this.
                                    v.
                                    id;
                                
//#line 49 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81609 =
                                  ((this.
                                      N) - (((int)(1))));
                                
//#line 49 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final boolean t81611 =
                                  ((int) t81608) ==
                                ((int) t81609);
                                
//#line 49 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
int t81612 =
                                   0;
                                
//#line 49 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
if (t81611) {
                                    
//#line 49 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
t81612 = ((this.
                                                                                                               N) - (((int)(1))));
                                } else {
                                    
//#line 49 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81610 =
                                      this.
                                        v.
                                        id;
                                    
//#line 49 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
t81612 = ((t81610) + (((int)(1))));
                                }
                                
//#line 49 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
t81615 = t81612;
                            } else {
                                
//#line 50 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81613 =
                                  this.
                                    r.nextInt$O((int)(this.
                                                        N));
                                
//#line 49 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
t81615 = x10.lang.Math.abs$O((int)(t81613));
                            }
                            
//#line 49 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final int t81616 =
                              t81615;
                            
//#line 49 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
final SpanningTree.V t81617 =
                              ((x10.array.Array<SpanningTree.V>)this.
                                                                  vertices).$apply$G((int)(t81616));
                            
//#line 49 "C:/eclipsews/pppp11/pppp11/src/SpanningTree.x10"
return t81617;
                        }
                        
                        public SpanningTree.V v;
                        public int N;
                        public x10.util.Random r;
                        public x10.array.Array<SpanningTree.V> vertices;
                        
                        // creation method for java code
                        public static SpanningTree.$Closure$88 $make(final SpanningTree.V v,
                                                                     final int N,
                                                                     final x10.util.Random r,
                                                                     final x10.array.Array<SpanningTree.V> vertices,java.lang.Class<?> $dummy0){return new $Closure$88(v,N,r,vertices,(java.lang.Class<?>) null);}
                        public $Closure$88(final SpanningTree.V v,
                                           final int N,
                                           final x10.util.Random r,
                                           final x10.array.Array<SpanningTree.V> vertices,java.lang.Class<?> $dummy0) { {
                                                                                                                               this.v = ((SpanningTree.V)(v));
                                                                                                                               this.N = N;
                                                                                                                               this.r = ((x10.util.Random)(r));
                                                                                                                               this.vertices = ((x10.array.Array)(vertices));
                                                                                                                           }}
                        
                    }
                    
                
                }
                