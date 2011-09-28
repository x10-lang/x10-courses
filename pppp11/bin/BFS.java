
public class BFS extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, BFS.class);
    
    public static final x10.rtt.RuntimeType<BFS> $RTT = new x10.rtt.NamedType<BFS>(
    "BFS", /* base class */BFS.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(BFS $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + BFS.class + " calling"); } 
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        BFS $_obj = new BFS((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        
    }
    
    // constructor just for allocation
    public BFS(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
//#line 4 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
public static class V extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
                                                            {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, V.class);
            
            public static final x10.rtt.RuntimeType<V> $RTT = new x10.rtt.NamedType<V>(
            "BFS.V", /* base class */V.class
            , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body(V $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + V.class + " calling"); } 
                x10.array.Array edges = (x10.array.Array) $deserializer.readRef();
                $_obj.edges = edges;
                $_obj.out = $deserializer.readInt();
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
                $serializer.write(this.out);
                $serializer.write(this.id);
                
            }
            
            // constructor just for allocation
            public V(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
//#line 4 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
public int id;
                
                
//#line 5 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
public x10.array.Array<BFS.V> edges;
                
//#line 6 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
public int out;
                
                
//#line 7 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
// creation method for java code
                public static BFS.V $make(final int id){return new BFS.V((java.lang.System[]) null).$init(id);}
                
                // constructor for non-virtual call
                final public BFS.V BFS$V$$init$S(final int id) { {
                                                                        {
                                                                            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"

                                                                        }
                                                                        {
                                                                            {
                                                                                
//#line 8 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
this.id = id;
                                                                                
                                                                            }
                                                                            
//#line 4 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
this.__fieldInitializers79343();
                                                                        }
                                                                    }
                                                                    return this;
                                                                    }
                
                // constructor
                public BFS.V $init(final int id){return BFS$V$$init$S(id);}
                
                
                
//#line 10 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
public void
                                                                       set__0$1BFS$V$2(
                                                                       final x10.array.Array e){
                    
//#line 11 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
this.edges = ((x10.array.Array)(e));
                }
                
                
//#line 13 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
public void
                                                                       mark(
                                                                       ){
                    
//#line 14 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
this.out = 0;
                    {
                        
//#line 15 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
x10.lang.Runtime.ensureNotInAtomic();
                        
//#line 15 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.lang.FinishState x10$__var30 =
                          x10.lang.Runtime.startFinish();
                        
//#line 15 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
try {try {{
                            {
                                
//#line 15 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new BFS.V.$Closure$76(this))));
                            }
                        }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__24__) {
                            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__24__)));
                            
//#line 15 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
throw new x10.lang.RuntimeException();
                        }finally {{
                             
//#line 15 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var30)));
                         }}
                        }
                    }
                
                
//#line 18 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
public boolean
                                                                       first$O(
                                                                       final BFS.V v){
                    
//#line 19 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
BFS.V prev =
                       null;
                    
//#line 20 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
try {{
                        
//#line 20 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
x10.lang.Runtime.enterAtomic();
                        {
                            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int t79612 =
                              out;
                            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final boolean t79615 =
                              ((t79612) < (((int)(0))));
                            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
if (t79615) {
                                
//#line 22 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int t79613 =
                                  v.
                                    out;
                                
//#line 22 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int t79614 =
                                  ((t79613) + (((int)(1))));
                                
//#line 22 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
this.out = t79614;
                                
//#line 23 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
return true;
                            }
                        }
                    }}finally {{
                          
//#line 20 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
x10.lang.Runtime.exitAtomic();
                      }}
                    
//#line 25 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
return false;
                    }
                
                
//#line 28 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
public void
                                                                       visit(
                                                                       final x10.lang.Clock c){
                    
//#line 29 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.array.Array<BFS.V> t79617 =
                      ((x10.array.Array)(edges));
                    
//#line 29 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.lang.Iterable<BFS.V> t79618 =
                      ((x10.lang.Iterable<BFS.V>)
                        ((x10.array.Array<BFS.V>)t79617).values());
                    
//#line 29 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.lang.Iterator<BFS.V> v79577 =
                      ((x10.lang.Iterator<BFS.V>)
                        ((x10.lang.Iterable<BFS.V>)t79618).iterator());
                    
//#line 29 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
for (;
                                                                              true;
                                                                              ) {
                        
//#line 29 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final boolean t79620 =
                          ((x10.lang.Iterator<BFS.V>)v79577).hasNext$O();
                        
//#line 29 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
if (!(t79620)) {
                            
//#line 29 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
break;
                        }
                        {
                            
//#line 29 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final BFS.V v =
                              ((BFS.V)(((x10.lang.Iterator<BFS.V>)v79577).next$G()));
                            
//#line 30 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final boolean t79619 =
                              v.first$O(((BFS.V)(this)));
                            
//#line 30 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
if (t79619) {
                                
//#line 30 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
x10.lang.Runtime.runAsync__0$1x10$lang$Clock$2(((x10.array.Array)(x10.core.ArrayFactory.<x10.lang.Clock> makeArrayFromJavaArray(x10.lang.Clock.$RTT, new x10.lang.Clock[] {c}))),
                                                                                                                                    ((x10.core.fun.VoidFun_0_0)(new BFS.V.$Closure$77(v,
                                                                                                                                                                                      c))));
                            }
                        }
                        {
                            
                        }
                    }
                }
                
                
//#line 35 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
public java.lang.String
                                                                       edgeString$O(
                                                                       ){
                    
//#line 36 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.array.Array<BFS.V> t79621 =
                      ((x10.array.Array)(edges));
                    
//#line 36 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final boolean t79622 =
                      ((t79621) == (null));
                    
//#line 36 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
if (t79622) {
                        
//#line 36 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
return "";
                    }
                    
//#line 37 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
java.lang.String r =
                      "";
                    {
                        
//#line 38 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.array.Array<BFS.V> t79624 =
                          ((x10.array.Array)(edges));
                        
//#line 38 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.lang.Iterable<BFS.V> t79625 =
                          ((x10.lang.Iterable<BFS.V>)
                            ((x10.array.Array<BFS.V>)t79624).values());
                        
//#line 38 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.lang.Iterator<BFS.V> v79579 =
                          ((x10.lang.Iterator<BFS.V>)
                            ((x10.lang.Iterable<BFS.V>)t79625).iterator());
                        
//#line 38 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
for (;
                                                                                  true;
                                                                                  ) {
                            
//#line 38 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final boolean t79630 =
                              ((x10.lang.Iterator<BFS.V>)v79579).hasNext$O();
                            
//#line 38 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
if (!(t79630)) {
                                
//#line 38 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
break;
                            }
                            {
                                
//#line 38 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final BFS.V v =
                                  ((BFS.V)(((x10.lang.Iterator<BFS.V>)v79579).next$G()));
                                
//#line 39 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final java.lang.String t79627 =
                                  r;
                                
//#line 39 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int t79626 =
                                  v.
                                    id;
                                
//#line 39 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final java.lang.String t79628 =
                                  ((" ") + ((x10.core.Int.$box(t79626))));
                                
//#line 39 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final java.lang.String t79629 =
                                  ((t79627) + (t79628));
                                
//#line 39 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
r = t79629;
                            }
                            {
                                
                            }
                        }
                    }
                    
//#line 40 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final java.lang.String t79631 =
                      r;
                    
//#line 40 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
return t79631;
                }
                
                
//#line 42 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
public java.lang.String
                                                                       toString(
                                                                       ){
                    
//#line 43 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int t79632 =
                      id;
                    
//#line 43 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final java.lang.String t79633 =
                      (("") + ((x10.core.Int.$box(t79632))));
                    
//#line 43 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final java.lang.String t79634 =
                      ((t79633) + (" ("));
                    
//#line 43 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final java.lang.String t79635 =
                      this.edgeString$O();
                    
//#line 43 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final java.lang.String t79636 =
                      ((t79634) + (t79635));
                    
//#line 43 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final java.lang.String t79637 =
                      ((t79636) + (") > "));
                    
//#line 43 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int t79638 =
                      out;
                    
//#line 43 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final java.lang.String t79639 =
                      ((t79637) + ((x10.core.Int.$box(t79638))));
                    
//#line 43 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
return t79639;
                }
                
                
//#line 4 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final public BFS.V
                                                                      BFS$V$$BFS$V$this(
                                                                      ){
                    
//#line 4 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
return BFS.V.this;
                }
                
                
//#line 4 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final private void
                                                                      __fieldInitializers79343(
                                                                      ){
                    
//#line 4 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
this.edges = null;
                    
//#line 4 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
this.out = -1;
                }
                
                final public static void
                  __fieldInitializers79343$P(
                  final BFS.V V){
                    V.__fieldInitializers79343();
                }
                
                public static class $Closure$76 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$76.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$76> $RTT = new x10.rtt.StaticVoidFunType<$Closure$76>(
                    /* base class */$Closure$76.class
                    , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$76 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$76.class + " calling"); } 
                        BFS.V out$$ = (BFS.V) $deserializer.readRef();
                        $_obj.out$$ = out$$;
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$76 $_obj = new $Closure$76((java.lang.System[]) null);
                        $deserializer.record_reference($_obj);
                        return $_deserialize_body($_obj, $deserializer);
                        
                    }
                    
                    public short $_get_serialization_id() {
                    
                         return $_serialization_id;
                        
                    }
                    
                    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
                    
                        if (out$$ instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.out$$);
                        } else {
                        $serializer.write(this.out$$);
                        }
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$76(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    
                        
                        public void
                          $apply(
                          ){
                            
//#line 16 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.lang.Clock t79611 =
                              x10.lang.Clock.make();
                            
//#line 16 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
this.
                                                                                   out$$.visit(((x10.lang.Clock)(t79611)));
                        }
                        
                        public BFS.V out$$;
                        
                        // creation method for java code
                        public static BFS.V.$Closure$76 $make(final BFS.V out$$){return new $Closure$76(out$$);}
                        public $Closure$76(final BFS.V out$$) { {
                                                                       this.out$$ = out$$;
                                                                   }}
                        
                    }
                    
                public static class $Closure$77 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$77.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$77> $RTT = new x10.rtt.StaticVoidFunType<$Closure$77>(
                    /* base class */$Closure$77.class
                    , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$77 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$77.class + " calling"); } 
                        BFS.V v = (BFS.V) $deserializer.readRef();
                        $_obj.v = v;
                        x10.lang.Clock c = (x10.lang.Clock) $deserializer.readRef();
                        $_obj.c = c;
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$77 $_obj = new $Closure$77((java.lang.System[]) null);
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
                        if (c instanceof x10.x10rt.X10JavaSerializable) {
                        $serializer.write( (x10.x10rt.X10JavaSerializable) this.c);
                        } else {
                        $serializer.write(this.c);
                        }
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$77(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    
                        
                        public void
                          $apply(
                          ){
                            
//#line 31 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
x10.lang.Clock.advanceAll();
                            
//#line 32 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
this.
                                                                                   v.visit(((x10.lang.Clock)(this.
                                                                                                               c)));
                        }
                        
                        public BFS.V v;
                        public x10.lang.Clock c;
                        
                        // creation method for java code
                        public static BFS.V.$Closure$77 $make(final BFS.V v,
                                                              final x10.lang.Clock c){return new $Closure$77(v,c);}
                        public $Closure$77(final BFS.V v,
                                           final x10.lang.Clock c) { {
                                                                            this.v = ((BFS.V)(v));
                                                                            this.c = ((x10.lang.Clock)(c));
                                                                        }}
                        
                    }
                    
                
                }
                
                
                
//#line 45 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
                private static final long serialVersionUID = 1L;
                public static void main(java.lang.String[] args) {
                // start native runtime
                new $Main().start(args);
                }
                
                // called by native runtime inside main x10 thread
                public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
                // call the original app-main method
                BFS.main(args);
                }
                }
                
                // the original app-main method
                public static void main(final x10.array.Array<java.lang.String> args) {
                    
//#line 46 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final java.lang.String t79640 =
                      ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
                    
//#line 46 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int N =
                      java.lang.Integer.parseInt(t79640);
                    
//#line 47 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.io.Printer t79641 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 47 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final java.lang.String t79642 =
                      (("N=") + ((x10.core.Int.$box(N))));
                    
//#line 47 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
t79641.println(((java.lang.String)(t79642)));
                    
//#line 48 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,BFS.V> t79644 =
                      ((x10.core.fun.Fun_0_1)(new BFS.$Closure$78()));
                    
//#line 48 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.array.Array<BFS.V> vertices =
                      ((x10.array.Array)(new x10.array.Array<BFS.V>((java.lang.System[]) null, BFS.V.$RTT).$init(((int)(N)),
                                                                                                                 ((x10.core.fun.Fun_0_1)(t79644)),(java.lang.Class<?>[][][][]) null)));
                    
//#line 49 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.util.Random r =
                      ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).$init()));
                    {
                        
//#line 50 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.lang.Iterable<BFS.V> t79646 =
                          ((x10.lang.Iterable<BFS.V>)
                            ((x10.array.Array<BFS.V>)vertices).values());
                        
//#line 50 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.lang.Iterator<BFS.V> v79581 =
                          ((x10.lang.Iterator<BFS.V>)
                            ((x10.lang.Iterable<BFS.V>)t79646).iterator());
                        
//#line 50 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
for (;
                                                                                  true;
                                                                                  ) {
                            
//#line 50 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final boolean t79662 =
                              ((x10.lang.Iterator<BFS.V>)v79581).hasNext$O();
                            
//#line 50 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
if (!(t79662)) {
                                
//#line 50 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
break;
                            }
                            {
                                
//#line 50 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final BFS.V v =
                                  ((BFS.V)(((x10.lang.Iterator<BFS.V>)v79581).next$G()));
                                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int t79647 =
                                  r.nextInt$O((int)(N));
                                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int t79648 =
                                  x10.lang.Math.abs$O((int)(t79647));
                                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int t79649 =
                                  ((t79648) + (((int)(1))));
                                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int N1 =
                                  x10.lang.Math.min$O((int)(t79649),
                                                      (int)(4));
                                
//#line 52 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,BFS.V> t79660 =
                                  ((x10.core.fun.Fun_0_1)(new BFS.$Closure$79(v,
                                                                              N,
                                                                              r,
                                                                              vertices,(java.lang.Class<?>) null)));
                                
//#line 52 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.array.Array<BFS.V> t79661 =
                                  ((x10.array.Array)(new x10.array.Array<BFS.V>((java.lang.System[]) null, BFS.V.$RTT).$init(((int)(N1)),
                                                                                                                             ((x10.core.fun.Fun_0_1)(t79660)),(java.lang.Class<?>[][][][]) null)));
                                
//#line 52 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
v.set__0$1BFS$V$2(((x10.array.Array)(t79661)));
                            }
                            {
                                
                            }
                        }
                    }
                    
//#line 56 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.io.Printer t79663 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 56 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
t79663.println(((java.lang.String)("Starting mark.")));
                    
//#line 57 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final BFS.V t79664 =
                      ((x10.array.Array<BFS.V>)vertices).$apply$G((int)(0));
                    
//#line 57 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
t79664.mark();
                    {
                        
//#line 58 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.array.Region v79583 =
                          ((x10.array.Region)(((x10.array.Array<BFS.V>)vertices).
                                                region));
                        
//#line 58 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.array.Array<x10.core.Int> v79584 =
                          ((x10.array.Array)(x10.core.ArrayFactory.<x10.core.Int> makeArrayFromJavaArray(x10.rtt.Types.INT, new int[] {0})));
                        
//#line 58 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int v79585min79586 =
                          v79583.min$O((int)(0));
                        
//#line 58 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int v79585max79587 =
                          v79583.max$O((int)(0));
                        {
                            
//#line 58 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
int v79585 =
                              v79585min79586;
                            
//#line 58 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
for (;
                                                                                      true;
                                                                                      ) {
                                
//#line 58 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int t79666 =
                                  v79585;
                                
//#line 58 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final boolean t79672 =
                                  ((t79666) <= (((int)(v79585max79587))));
                                
//#line 58 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
if (!(t79672)) {
                                    
//#line 58 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
break;
                                }
                                {
                                    
//#line 58 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int t79669 =
                                      v79585;
                                    
//#line 58 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
((x10.array.Array<x10.core.Int>)v79584).$set__1x10$array$Array$$T$G((int)(0),
                                                                                                                                                             x10.core.Int.$box(t79669));
                                    
//#line 58 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.array.Point v =
                                      ((x10.array.Point)(x10.array.Point.<x10.core.Int>make__0$1x10$array$Point$$T$2(x10.rtt.Types.INT, ((x10.array.Array)(v79584)))));
                                    {
                                        
//#line 59 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final x10.io.Printer t79670 =
                                          ((x10.io.Printer)(x10.io.Console.OUT));
                                        
//#line 59 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final java.lang.String t79671 =
                                          (("") + (v));
                                        
//#line 59 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
t79670.println(((java.lang.String)(t79671)));
                                    }
                                }
                                {
                                    
//#line 58 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int t79667 =
                                      v79585;
                                    
//#line 58 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int t79668 =
                                      ((t79667) + (((int)(1))));
                                    
//#line 58 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
v79585 = t79668;
                                }
                            }
                        }
                    }
                }
                
                
//#line 2 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final public BFS
                                                                      BFS$$BFS$this(
                                                                      ){
                    
//#line 2 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
return BFS.this;
                }
                
                
//#line 2 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
// creation method for java code
                public static BFS $make(){return new BFS((java.lang.System[]) null).$init();}
                
                // constructor for non-virtual call
                final public BFS BFS$$init$S() { {
                                                        {
                                                            
//#line 2 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"

                                                        }
                                                        {
                                                            {
                                                                
//#line 2 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"

                                                            }
                                                            {
                                                                
                                                            }
                                                        }
                                                    }
                                                    return this;
                                                    }
                
                // constructor
                public BFS $init(){return BFS$$init$S();}
                
                
                public static class $Closure$78 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$78.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$78> $RTT = new x10.rtt.StaticFunType<$Closure$78>(
                    /* base class */$Closure$78.class
                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, BFS.V.$RTT), x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$78 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$78.class + " calling"); } 
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
                    
                        
                    }
                    
                    // constructor just for allocation
                    public $Closure$78(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                    return $apply(x10.core.Int.$unbox(a1));
                    }
                    
                        
                        public BFS.V
                          $apply(
                          final int i){
                            
//#line 48 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final BFS.V t79643 =
                              ((BFS.V)(new BFS.V((java.lang.System[]) null).$init(((int)(i)))));
                            
//#line 48 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
return t79643;
                        }
                        
                        // creation method for java code
                        public static BFS.$Closure$78 $make(){return new $Closure$78();}
                        public $Closure$78() { {
                                                      
                                                  }}
                        
                    }
                    
                public static class $Closure$79 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
                {
                    private static final long serialVersionUID = 1L;
                    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$79.class);
                    
                    public static final x10.rtt.RuntimeType<$Closure$79> $RTT = new x10.rtt.StaticFunType<$Closure$79>(
                    /* base class */$Closure$79.class
                    , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, BFS.V.$RTT), x10.rtt.Types.OBJECT}
                    );
                    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
                    
                    
                    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
                    public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$79 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$79.class + " calling"); } 
                        BFS.V v = (BFS.V) $deserializer.readRef();
                        $_obj.v = v;
                        $_obj.N = $deserializer.readInt();
                        x10.util.Random r = (x10.util.Random) $deserializer.readRef();
                        $_obj.r = r;
                        x10.array.Array vertices = (x10.array.Array) $deserializer.readRef();
                        $_obj.vertices = vertices;
                        return $_obj;
                        
                    }
                    
                    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
                    
                        $Closure$79 $_obj = new $Closure$79((java.lang.System[]) null);
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
                    public $Closure$79(final java.lang.System[] $dummy) { 
                    super($dummy);
                    }
                    // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
                    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                    return $apply(x10.core.Int.$unbox(a1));
                    }
                    
                        
                        public BFS.V
                          $apply(
                          final int i){
                            
//#line 53 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final boolean t79656 =
                              ((int) i) ==
                            ((int) 0);
                            
//#line 53 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
int t79657 =
                               0;
                            
//#line 53 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
if (t79656) {
                                
//#line 53 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int t79650 =
                                  this.
                                    v.
                                    id;
                                
//#line 53 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int t79651 =
                                  ((this.
                                      N) - (((int)(1))));
                                
//#line 53 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final boolean t79653 =
                                  ((int) t79650) ==
                                ((int) t79651);
                                
//#line 53 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
int t79654 =
                                   0;
                                
//#line 53 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
if (t79653) {
                                    
//#line 53 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
t79654 = ((this.
                                                                                                      N) - (((int)(1))));
                                } else {
                                    
//#line 53 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int t79652 =
                                      this.
                                        v.
                                        id;
                                    
//#line 53 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
t79654 = ((t79652) + (((int)(1))));
                                }
                                
//#line 53 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
t79657 = t79654;
                            } else {
                                
//#line 54 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int t79655 =
                                  this.
                                    r.nextInt$O((int)(this.
                                                        N));
                                
//#line 53 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
t79657 = x10.lang.Math.abs$O((int)(t79655));
                            }
                            
//#line 53 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final int t79658 =
                              t79657;
                            
//#line 53 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
final BFS.V t79659 =
                              ((x10.array.Array<BFS.V>)this.
                                                         vertices).$apply$G((int)(t79658));
                            
//#line 53 "C:/eclipsews/pppp11/pppp11/src/BFS.x10"
return t79659;
                        }
                        
                        public BFS.V v;
                        public int N;
                        public x10.util.Random r;
                        public x10.array.Array<BFS.V> vertices;
                        
                        // creation method for java code
                        public static BFS.$Closure$79 $make(final BFS.V v,
                                                            final int N,
                                                            final x10.util.Random r,
                                                            final x10.array.Array<BFS.V> vertices,java.lang.Class<?> $dummy0){return new $Closure$79(v,N,r,vertices,(java.lang.Class<?>) null);}
                        public $Closure$79(final BFS.V v,
                                           final int N,
                                           final x10.util.Random r,
                                           final x10.array.Array<BFS.V> vertices,java.lang.Class<?> $dummy0) { {
                                                                                                                      this.v = ((BFS.V)(v));
                                                                                                                      this.N = N;
                                                                                                                      this.r = ((x10.util.Random)(r));
                                                                                                                      this.vertices = ((x10.array.Array)(vertices));
                                                                                                                  }}
                        
                    }
                    
                
                }
                