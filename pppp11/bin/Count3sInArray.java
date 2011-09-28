
public class Count3sInArray extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, Count3sInArray.class);
    
    public static final x10.rtt.RuntimeType<Count3sInArray> $RTT = new x10.rtt.NamedType<Count3sInArray>(
    "Count3sInArray", /* base class */Count3sInArray.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(Count3sInArray $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + Count3sInArray.class + " calling"); } 
        $_obj.size = $deserializer.readInt();
        $_obj.pctThrees = $deserializer.readDouble();
        $_obj.numAsyncs = $deserializer.readInt();
        x10.array.Array a = (x10.array.Array) $deserializer.readRef();
        $_obj.a = a;
        $_obj.count = $deserializer.readInt();
        $_obj.expectedCount = $deserializer.readInt();
        $_obj.countTime = $deserializer.readLong();
        $_obj.populateTime = $deserializer.readLong();
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        Count3sInArray $_obj = new Count3sInArray((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        $serializer.write(this.size);
        $serializer.write(this.pctThrees);
        $serializer.write(this.numAsyncs);
        if (a instanceof x10.x10rt.X10JavaSerializable) {
        $serializer.write( (x10.x10rt.X10JavaSerializable) this.a);
        } else {
        $serializer.write(this.a);
        }
        $serializer.write(this.count);
        $serializer.write(this.expectedCount);
        $serializer.write(this.countTime);
        $serializer.write(this.populateTime);
        
    }
    
    // constructor just for allocation
    public Count3sInArray(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
//#line 8 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final public static int Meg = 1000000;
        
//#line 9 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final public static java.lang.String indent = ((java.lang.String)("\t"));
        
//#line 11 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
public int size;
        
//#line 12 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
public double pctThrees;
        
//#line 13 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
public int numAsyncs;
        
//#line 14 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
public x10.array.Array<x10.core.Int> a;
        
//#line 15 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
public int count;
        
//#line 16 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
public int expectedCount;
        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
public long countTime;
        
//#line 18 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
public long populateTime;
        
        
//#line 23 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
// creation method for java code
        public static Count3sInArray $make(final int size,
                                           final int numAsyncs,
                                           final double pctThrees){return new Count3sInArray((java.lang.System[]) null).$init(size,numAsyncs,pctThrees);}
        
        // constructor for non-virtual call
        final public Count3sInArray Count3sInArray$$init$S(final int size,
                                                           final int numAsyncs,
                                                           final double pctThrees) { {
                                                                                            {
                                                                                                
//#line 23 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"

                                                                                            }
                                                                                            {
                                                                                                {
                                                                                                    
//#line 23 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"

                                                                                                }
                                                                                                
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.__fieldInitializers81976();
                                                                                            }
                                                                                            
//#line 24 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
assert ((numAsyncs) >= (((int)(1))));
                                                                                            
//#line 25 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.size = size;
                                                                                            
//#line 26 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.numAsyncs = numAsyncs;
                                                                                            
//#line 27 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.array.Array<x10.core.Int> t83443 =
                                                                                              ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(size)),
                                                                                                                                                                                                       (x10.core.Int.$box(0)),(java.lang.Class<?>[][][][][]) null)));
                                                                                            
//#line 27 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.a = ((x10.array.Array)(t83443));
                                                                                            
//#line 28 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.pctThrees = pctThrees;
                                                                                        }
                                                                                        return this;
                                                                                        }
        
        // constructor
        public Count3sInArray $init(final int size,
                                    final int numAsyncs,
                                    final double pctThrees){return Count3sInArray$$init$S(size,numAsyncs,pctThrees);}
        
        
        
//#line 31 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
public void
                                                                          run(
                                                                          ){
            
//#line 32 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.populate();
            
//#line 43 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long time =
              x10.lang.System.nanoTime$O();
            
//#line 44 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.count = 0;
            
//#line 45 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83444 =
              numAsyncs;
            
//#line 45 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final boolean t83456 =
              ((int) t83444) ==
            ((int) 1);
            
//#line 45 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
if (t83456) {
                
//#line 46 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83445 =
                  this.count3s$O();
                
//#line 46 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.count = t83445;
            } else {
                {
                    
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
x10.lang.Runtime.ensureNotInAtomic();
                    
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.lang.FinishState x10$__var35 =
                      x10.lang.Runtime.startFinish();
                    
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
try {try {{
                        {
                            
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83446 =
                              numAsyncs;
                            
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83447 =
                              ((t83446) - (((int)(1))));
                            
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.lang.IntRange t83448 =
                              ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(t83447)))));
                            
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.array.Region p83377 =
                              ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t83448)))));
                            
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int i83378min83379 =
                              p83377.min$O((int)(0));
                            
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int i83378max83380 =
                              p83377.max$O((int)(0));
                            {
                                
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
int i83378 =
                                  i83378min83379;
                                
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
for (;
                                                                                                     true;
                                                                                                     ) {
                                    
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83450 =
                                      i83378;
                                    
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final boolean t83455 =
                                      ((t83450) <= (((int)(i83378max83380))));
                                    
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
if (!(t83455)) {
                                        
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
break;
                                    }
                                    {
                                        
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int i =
                                          i83378;
                                        {
                                            
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new Count3sInArray.$Closure$92(this,
                                                                                                                                                                                                 i))));
                                        }
                                    }
                                    {
                                        
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83451 =
                                          i83378;
                                        
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83452 =
                                          ((t83451) + (((int)(1))));
                                        
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
i83378 = t83452;
                                    }
                                }
                            }
                        }
                    }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__29__) {
                        
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__29__)));
                        
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
throw new x10.lang.RuntimeException();
                    }finally {{
                         
//#line 48 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var35)));
                     }}
                    }
                }
            
//#line 52 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final Count3sInArray x83435 =
              ((Count3sInArray)(this));
            
//#line 52 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83457 =
              x10.lang.System.nanoTime$O();
            
//#line 52 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83458 =
              ((t83457) - (((long)(time))));
            
//#line 52 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83459 =
              ((long)(((int)(1000000))));
            
//#line 52 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long y83436 =
              ((t83458) / (((long)(t83459))));
            
//#line 52 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83460 =
              x83435.
                countTime;
            
//#line 52 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83461 =
              ((t83460) + (((long)(y83436))));
            
//#line 52 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
x83435.countTime = t83461;
            }
        
        
//#line 55 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
public void
                                                                          runB(
                                                                          ){
            
//#line 56 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.populate();
            
//#line 58 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long time =
              x10.lang.System.nanoTime$O();
            
//#line 59 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.count = 0;
            
//#line 60 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83462 =
              numAsyncs;
            
//#line 60 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final boolean t83464 =
              ((int) t83462) ==
            ((int) 1);
            
//#line 60 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
if (t83464) {
                
//#line 61 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83463 =
                  this.count3s$O();
                
//#line 61 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.count = t83463;
            } else {
                
            }
            
//#line 64 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final Count3sInArray x83437 =
              ((Count3sInArray)(this));
            
//#line 64 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83465 =
              x10.lang.System.nanoTime$O();
            
//#line 64 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83466 =
              ((t83465) - (((long)(time))));
            
//#line 64 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83467 =
              ((long)(((int)(1000000))));
            
//#line 64 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long y83438 =
              ((t83466) / (((long)(t83467))));
            
//#line 64 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83468 =
              x83437.
                countTime;
            
//#line 64 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83469 =
              ((t83468) + (((long)(y83438))));
            
//#line 64 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
x83437.countTime = t83469;
        }
        
        
//#line 68 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
public int
                                                                          count3s$O(
                                                                          final int id){
            
//#line 69 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83470 =
              size;
            
//#line 69 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83471 =
              numAsyncs;
            
//#line 69 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int chunkSize =
              ((t83470) / (((int)(t83471))));
            
//#line 70 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int start =
              ((chunkSize) * (((int)(id))));
            
//#line 72 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83472 =
              numAsyncs;
            
//#line 72 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83473 =
              ((t83472) - (((int)(1))));
            
//#line 72 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final boolean t83476 =
              ((int) id) ==
            ((int) t83473);
            
//#line 72 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
int t83477 =
               0;
            
//#line 72 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
if (t83476) {
                
//#line 72 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83474 =
                  size;
                
//#line 72 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
t83477 = ((t83474) - (((int)(1))));
            } else {
                
//#line 72 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83475 =
                  ((start) + (((int)(chunkSize))));
                
//#line 72 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
t83477 = ((t83475) - (((int)(1))));
            }
            
//#line 72 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int end =
              t83477;
            
//#line 73 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
try {{
                
//#line 73 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
x10.lang.Runtime.enterAtomic();
                {
                    
//#line 73 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.io.Printer t83485 =
                      ((x10.io.Printer)(x10.io.Console.OUT));
                    
//#line 73 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83478 =
                      ((java.lang.String)(Count3sInArray.indent));
                    
//#line 73 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83479 =
                      "\t[task ";
                    
//#line 73 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83480 =
                      ((t83479) + ((x10.core.Int.$box(id))));
                    
//#line 73 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83481 =
                      ((t83480) + (" counting from "));
                    
//#line 73 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83482 =
                      ((t83481) + ((x10.core.Int.$box(start))));
                    
//#line 73 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83483 =
                      ((t83482) + (" to "));
                    
//#line 73 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83484 =
                      ((t83483) + ((x10.core.Int.$box(end))));
                    
//#line 73 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83486 =
                      ((t83484) + ("]"));
                    
//#line 73 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
t83485.println(((java.lang.String)(t83486)));
                }
            }}finally {{
                  
//#line 73 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
x10.lang.Runtime.exitAtomic();
              }}
            
//#line 74 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
int privateCount =
              0;
            
//#line 75 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.array.Array<x10.core.Int> a_ =
              ((x10.array.Array)(this.
                                   a));
            {
                
//#line 76 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
int i =
                  start;
                
//#line 76 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
for (;
                                                                                     true;
                                                                                     ) {
                    
//#line 76 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83488 =
                      i;
                    
//#line 76 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final boolean t83496 =
                      ((t83488) <= (((int)(end))));
                    
//#line 76 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
if (!(t83496)) {
                        
//#line 76 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
break;
                    }
                    {
                        
//#line 77 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83491 =
                          i;
                        
//#line 77 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83492 =
                          x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)a_).$apply$G((int)(t83491)));
                        
//#line 77 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final boolean t83495 =
                          ((int) t83492) ==
                        ((int) 3);
                        
//#line 77 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
if (t83495) {
                            
//#line 78 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83493 =
                              privateCount;
                            
//#line 78 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83494 =
                              ((t83493) + (((int)(1))));
                            
//#line 78 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
privateCount = t83494;
                        }
                    }
                    {
                        
//#line 76 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83489 =
                          i;
                        
//#line 76 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83490 =
                          ((t83489) + (((int)(1))));
                        
//#line 76 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
i = t83490;
                    }
                }
            }
            
//#line 80 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83497 =
              privateCount;
            
//#line 80 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
return t83497;
            }
        
        
//#line 83 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
public int
                                                                          count3s$O(
                                                                          ){
            
//#line 84 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int start =
              0;
            
//#line 85 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83498 =
              size;
            
//#line 85 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int end =
              ((t83498) - (((int)(1))));
            
//#line 86 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
int privateCount =
              0;
            
//#line 87 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.array.Array<x10.core.Int> a_ =
              ((x10.array.Array)(this.
                                   a));
            {
                
//#line 88 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
int i =
                  start;
                
//#line 88 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
for (;
                                                                                     true;
                                                                                     ) {
                    
//#line 88 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83500 =
                      i;
                    
//#line 88 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final boolean t83508 =
                      ((t83500) <= (((int)(end))));
                    
//#line 88 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
if (!(t83508)) {
                        
//#line 88 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
break;
                    }
                    {
                        
//#line 89 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83503 =
                          i;
                        
//#line 89 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83504 =
                          x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)a_).$apply$G((int)(t83503)));
                        
//#line 89 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final boolean t83507 =
                          ((int) t83504) ==
                        ((int) 3);
                        
//#line 89 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
if (t83507) {
                            
//#line 90 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83505 =
                              privateCount;
                            
//#line 90 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83506 =
                              ((t83505) + (((int)(1))));
                            
//#line 90 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
privateCount = t83506;
                        }
                    }
                    {
                        
//#line 88 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83501 =
                          i;
                        
//#line 88 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83502 =
                          ((t83501) + (((int)(1))));
                        
//#line 88 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
i = t83502;
                    }
                }
            }
            
//#line 91 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83509 =
              privateCount;
            
//#line 91 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
return t83509;
        }
        
        
//#line 94 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
public void
                                                                          populate(
                                                                          ){
            
//#line 96 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long time =
              x10.lang.System.nanoTime$O();
            
//#line 97 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.util.Random r =
              ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).$init()));
            
//#line 98 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.expectedCount = 0;
            
//#line 99 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.array.Array<x10.core.Int> t83510 =
              ((x10.array.Array)(a));
            
//#line 99 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83511 =
              ((x10.array.Array<x10.core.Int>)t83510).
                size;
            
//#line 99 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final double t83512 =
              ((double)(int)(((int)(t83511))));
            
//#line 99 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final double t83513 =
              pctThrees;
            
//#line 99 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final double t83514 =
              ((t83512) * (((double)(t83513))));
            
//#line 99 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int target =
              ((int)(double)(((double)(t83514))));
            
//#line 100 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.io.Printer t83518 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 100 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83515 =
              ((java.lang.String)(Count3sInArray.indent));
            
//#line 100 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83516 =
              "\t[target=";
            
//#line 100 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83517 =
              ((t83516) + ((x10.core.Int.$box(target))));
            
//#line 100 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83519 =
              ((t83517) + ("]"));
            
//#line 100 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
t83518.println(((java.lang.String)(t83519)));
            
//#line 103 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.array.Array<x10.core.Int> a_ =
              ((x10.array.Array)(this.
                                   a));
            {
                
//#line 104 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.array.Array<x10.core.Int> t83520 =
                  ((x10.array.Array)(a));
                
//#line 104 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83521 =
                  ((x10.array.Array<x10.core.Int>)t83520).
                    size;
                
//#line 104 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83522 =
                  ((t83521) - (((int)(1))));
                
//#line 104 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.lang.IntRange t83523 =
                  ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(t83522)))));
                
//#line 104 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.array.Region p83396 =
                  ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t83523)))));
                
//#line 104 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int i83397min83398 =
                  p83396.min$O((int)(0));
                
//#line 104 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int i83397max83399 =
                  p83396.max$O((int)(0));
                {
                    
//#line 104 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
int i83397 =
                      i83397min83398;
                    
//#line 104 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
for (;
                                                                                          true;
                                                                                          ) {
                        
//#line 104 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83525 =
                          i83397;
                        
//#line 104 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final boolean t83528 =
                          ((t83525) <= (((int)(i83397max83399))));
                        
//#line 104 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
if (!(t83528)) {
                            
//#line 104 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
break;
                        }
                        {
                            
//#line 104 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int i =
                              i83397;
                            {
                                
//#line 104 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
((x10.array.Array<x10.core.Int>)a_).$set__1x10$array$Array$$T$G((int)(i),
                                                                                                                                                                 x10.core.Int.$box(0));
                            }
                        }
                        {
                            
//#line 104 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83526 =
                              i83397;
                            
//#line 104 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83527 =
                              ((t83526) + (((int)(1))));
                            
//#line 104 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
i83397 = t83527;
                        }
                    }
                }
            }
            {
                
//#line 105 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
int i =
                  1;
                
//#line 105 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
for (;
                                                                                      true;
                                                                                      ) {
                    
//#line 105 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83530 =
                      i;
                    
//#line 105 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final boolean t83538 =
                      ((t83530) <= (((int)(target))));
                    
//#line 105 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
if (!(t83538)) {
                        
//#line 105 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
break;
                    }
                    {
                        
//#line 106 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83533 =
                          ((x10.array.Array<x10.core.Int>)a_).
                            size;
                        
//#line 106 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int index =
                          r.nextInt$O((int)(t83533));
                        
//#line 107 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83534 =
                          x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)a_).$apply$G((int)(index)));
                        
//#line 107 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final boolean t83537 =
                          ((int) t83534) !=
                        ((int) 3);
                        
//#line 107 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
if (t83537) {
                            
//#line 108 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
((x10.array.Array<x10.core.Int>)a_).$set__1x10$array$Array$$T$G((int)(index),
                                                                                                                                                             x10.core.Int.$box(3));
                            
//#line 109 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final Count3sInArray x83439 =
                              ((Count3sInArray)(this));
                            
//#line 109 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
;
                            
//#line 109 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83535 =
                              x83439.
                                expectedCount;
                            
//#line 109 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83536 =
                              ((t83535) + (((int)(1))));
                            
//#line 109 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
x83439.expectedCount = t83536;
                        }
                    }
                    {
                        
//#line 105 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83531 =
                          i;
                        
//#line 105 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83532 =
                          ((t83531) + (((int)(1))));
                        
//#line 105 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
i = t83532;
                    }
                }
            }
            
//#line 112 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final Count3sInArray x83441 =
              ((Count3sInArray)(this));
            
//#line 112 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83539 =
              x10.lang.System.nanoTime$O();
            
//#line 112 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83540 =
              ((t83539) - (((long)(time))));
            
//#line 112 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83541 =
              ((long)(((int)(1000000))));
            
//#line 112 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long y83442 =
              ((t83540) / (((long)(t83541))));
            
//#line 112 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83542 =
              x83441.
                populateTime;
            
//#line 112 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83543 =
              ((t83542) + (((long)(y83442))));
            
//#line 112 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
x83441.populateTime = t83543;
        }
        
        
//#line 115 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
public void
                                                                           validate(
                                                                           ){
            
//#line 116 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.io.Printer t83548 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 116 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83544 =
              ((java.lang.String)(Count3sInArray.indent));
            
//#line 116 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83545 =
              "\t[expectedCount=";
            
//#line 116 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83546 =
              expectedCount;
            
//#line 116 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83547 =
              ((t83545) + ((x10.core.Int.$box(t83546))));
            
//#line 116 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83549 =
              ((t83547) + ("]"));
            
//#line 116 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
t83548.println(((java.lang.String)(t83549)));
            
//#line 117 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.io.Printer t83554 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 117 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83550 =
              ((java.lang.String)(Count3sInArray.indent));
            
//#line 117 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83551 =
              "\t[count=";
            
//#line 117 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83552 =
              count;
            
//#line 117 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83553 =
              ((t83551) + ((x10.core.Int.$box(t83552))));
            
//#line 117 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83555 =
              ((t83553) + ("]"));
            
//#line 117 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
t83554.println(((java.lang.String)(t83555)));
            
//#line 118 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83556 =
              expectedCount;
            
//#line 118 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83557 =
              count;
            
//#line 118 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final boolean t83567 =
              ((int) t83556) !=
            ((int) t83557);
            
//#line 118 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
if (t83567) {
                
//#line 119 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.io.Printer t83565 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 119 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83558 =
                  ((java.lang.String)(Count3sInArray.indent));
                
//#line 119 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83559 =
                  "\tError: expected ";
                
//#line 119 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83560 =
                  expectedCount;
                
//#line 119 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83561 =
                  ((t83559) + ((x10.core.Int.$box(t83560))));
                
//#line 119 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83562 =
                  ((t83561) + (", obtained "));
                
//#line 119 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83563 =
                  count;
                
//#line 119 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83564 =
                  ((t83562) + ((x10.core.Int.$box(t83563))));
                
//#line 119 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83566 =
                  ((t83564) + ("."));
                
//#line 119 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
t83565.println(((java.lang.String)(t83566)));
            }
        }
        
        
//#line 121 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
public long
                                                                           populateTime$O(
                                                                           ){
            
//#line 121 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83568 =
              populateTime;
            
//#line 121 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
return t83568;
        }
        
        
//#line 122 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
public long
                                                                           countTime$O(
                                                                           ){
            
//#line 122 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83569 =
              countTime;
            
//#line 122 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
return t83569;
        }
        
        
//#line 124 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
public void
                                                                           reset(
                                                                           ){
            
//#line 125 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83570 =
              ((long)(((int)(0))));
            
//#line 125 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.populateTime = t83570;
            
//#line 126 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83571 =
              ((long)(((int)(0))));
            
//#line 126 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.countTime = t83571;
            
//#line 127 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.count = 0;
            
//#line 128 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.expectedCount = 0;
        }
        
        
//#line 133 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        Count3sInArray.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> args) {
            
//#line 134 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83572 =
              ((x10.array.Array<java.lang.String>)args).
                size;
            
//#line 134 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final boolean t83574 =
              ((t83572) < (((int)(3))));
            
//#line 134 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
if (t83574) {
                
//#line 135 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.io.Printer t83573 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 135 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
t83573.println(((java.lang.String)("Usage: Count3sInArray <Nmod4: size is 4*Nmod4> <NumAsync:Int> <PctThrees:Double>")));
                
//#line 136 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
return;
            }
            
//#line 138 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83575 =
              ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
            
//#line 138 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int Nmod4 =
              java.lang.Integer.parseInt(t83575);
            
//#line 139 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int size =
              ((Nmod4) * (((int)(4))));
            
//#line 140 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83576 =
              ((x10.array.Array<java.lang.String>)args).$apply$G((int)(1));
            
//#line 140 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int numAsyncs =
              java.lang.Integer.parseInt(t83576);
            
//#line 141 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83577 =
              ((x10.array.Array<java.lang.String>)args).$apply$G((int)(2));
            
//#line 141 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final double pctThrees =
              java.lang.Double.parseDouble(t83577);
            
//#line 142 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.io.Printer t83579 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 142 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83578 =
              (("[size=") + ((x10.core.Int.$box(size))));
            
//#line 142 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83580 =
              ((t83578) + ("]"));
            
//#line 142 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
t83579.println(((java.lang.String)(t83580)));
            
//#line 143 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.io.Printer t83582 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 143 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83581 =
              (("[numAsyncs=") + ((x10.core.Int.$box(numAsyncs))));
            
//#line 143 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83583 =
              ((t83581) + ("]"));
            
//#line 143 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
t83582.println(((java.lang.String)(t83583)));
            
//#line 144 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.io.Printer t83585 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 144 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83584 =
              (("[pctThrees=") + ((x10.core.Double.$box(pctThrees))));
            
//#line 144 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83586 =
              ((t83584) + ("]"));
            
//#line 144 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
t83585.println(((java.lang.String)(t83586)));
            
//#line 145 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int numInvoke =
              5;
            
//#line 146 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83587 =
              x10.lang.System.nanoTime$O();
            
//#line 146 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
long createTime =
              (-(t83587));
            
//#line 147 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final Count3sInArray counter =
              ((Count3sInArray)(new Count3sInArray((java.lang.System[]) null).$init(((int)(size)),
                                                                                    ((int)(numAsyncs)),
                                                                                    ((double)(pctThrees)))));
            
//#line 148 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83588 =
              createTime;
            
//#line 148 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83589 =
              x10.lang.System.nanoTime$O();
            
//#line 148 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83590 =
              ((t83588) + (((long)(t83589))));
            
//#line 148 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
createTime = t83590;
            
//#line 149 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83592 =
              createTime;
            
//#line 149 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83591 =
              Count3sInArray.Meg;
            
//#line 149 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83593 =
              ((long)(((int)(t83591))));
            
//#line 149 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83594 =
              ((t83592) / (((long)(t83593))));
            
//#line 149 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
createTime = t83594;
            
//#line 151 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.io.Printer t83595 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 151 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
t83595.println(((java.lang.String)("[Warming up]")));
            
//#line 152 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
counter.run();
            
//#line 153 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.io.Printer t83606 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 153 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83596 =
              ((java.lang.String)(Count3sInArray.indent));
            
//#line 153 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83597 =
              "\t[Done, creation time=";
            
//#line 153 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83598 =
              createTime;
            
//#line 153 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83599 =
              ((t83597) + ((x10.core.Long.$box(t83598))));
            
//#line 153 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83600 =
              ((t83599) + (" time="));
            
//#line 153 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83601 =
              counter.populateTime$O();
            
//#line 153 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83602 =
              ((t83600) + ((x10.core.Long.$box(t83601))));
            
//#line 153 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83603 =
              ((t83602) + (" + "));
            
//#line 153 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83604 =
              counter.countTime$O();
            
//#line 153 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83605 =
              ((t83603) + ((x10.core.Long.$box(t83604))));
            
//#line 153 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83607 =
              ((t83605) + ("]."));
            
//#line 153 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
t83606.println(((java.lang.String)(t83607)));
            
//#line 154 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
counter.validate();
            
//#line 155 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
counter.reset();
            
//#line 158 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.io.Printer t83608 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 158 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
t83608.println(((java.lang.String)("[Running]")));
            {
                
//#line 159 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.lang.IntRange t83609 =
                  ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(1)), ((int)(numInvoke)))));
                
//#line 159 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.array.Region p83415 =
                  ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t83609)))));
                
//#line 159 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int i83416min83417 =
                  p83415.min$O((int)(0));
                
//#line 159 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int i83416max83418 =
                  p83415.max$O((int)(0));
                {
                    
//#line 159 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
int i83416 =
                      i83416min83417;
                    
//#line 159 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
for (;
                                                                                          true;
                                                                                          ) {
                        
//#line 159 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83611 =
                          i83416;
                        
//#line 159 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final boolean t83617 =
                          ((t83611) <= (((int)(i83416max83418))));
                        
//#line 159 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
if (!(t83617)) {
                            
//#line 159 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
break;
                        }
                        {
                            
//#line 159 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int i =
                              i83416;
                            {
                                
//#line 160 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.io.Printer t83615 =
                                  ((x10.io.Printer)(x10.io.Console.OUT));
                                
//#line 160 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83614 =
                                  (("[Trial #") + ((x10.core.Int.$box(i))));
                                
//#line 160 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83616 =
                                  ((t83614) + ("]"));
                                
//#line 160 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
t83615.println(((java.lang.String)(t83616)));
                                
//#line 161 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
counter.run();
                                
//#line 162 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
counter.validate();
                            }
                        }
                        {
                            
//#line 159 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83612 =
                              i83416;
                            
//#line 159 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83613 =
                              ((t83612) + (((int)(1))));
                            
//#line 159 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
i83416 = t83613;
                        }
                    }
                }
            }
            
//#line 164 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final x10.io.Printer t83630 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 164 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83618 =
              "[Done. Over 5";
            
//#line 164 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83619 =
              "[Done. Over 5 trials, average time";
            
//#line 164 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83622 =
              "[Done. Over 5 trials, average time to populate is  ";
            
//#line 165 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83620 =
              counter.populateTime$O();
            
//#line 165 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83621 =
              ((long)(((int)(numInvoke))));
            
//#line 165 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83623 =
              ((t83620) / (((long)(t83621))));
            
//#line 164 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83624 =
              ((t83622) + ((x10.core.Long.$box(t83623))));
            
//#line 164 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83627 =
              ((t83624) + (" and to count is "));
            
//#line 166 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83625 =
              counter.countTime$O();
            
//#line 166 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83626 =
              ((long)(((int)(numInvoke))));
            
//#line 166 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final long t83628 =
              ((t83625) / (((long)(t83626))));
            
//#line 164 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83629 =
              ((t83627) + ((x10.core.Long.$box(t83628))));
            
//#line 164 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final java.lang.String t83631 =
              ((t83629) + (".]"));
            
//#line 164 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
t83630.println(((java.lang.String)(t83631)));
        }
        
        
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final public Count3sInArray
                                                                         Count3sInArray$$Count3sInArray$this(
                                                                         ){
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
return Count3sInArray.this;
        }
        
        
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final private void
                                                                         __fieldInitializers81976(
                                                                         ){
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.a = null;
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.count = 0;
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.expectedCount = 0;
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.countTime = 0L;
            
//#line 7 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
this.populateTime = 0L;
        }
        
        final public static void
          __fieldInitializers81976$P(
          final Count3sInArray Count3sInArray){
            Count3sInArray.__fieldInitializers81976();
        }
        
        public static int
          getInitialized$Meg(
          ){
            return Count3sInArray.Meg;
        }
        
        public static java.lang.String
          getInitialized$indent(
          ){
            return Count3sInArray.indent;
        }
        
        public static class $Closure$92 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$92.class);
            
            public static final x10.rtt.RuntimeType<$Closure$92> $RTT = new x10.rtt.StaticVoidFunType<$Closure$92>(
            /* base class */$Closure$92.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$92 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$92.class + " calling"); } 
                Count3sInArray out$$ = (Count3sInArray) $deserializer.readRef();
                $_obj.out$$ = out$$;
                $_obj.i = $deserializer.readInt();
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
            
                if (out$$ instanceof x10.x10rt.X10JavaSerializable) {
                $serializer.write( (x10.x10rt.X10JavaSerializable) this.out$$);
                } else {
                $serializer.write(this.out$$);
                }
                $serializer.write(this.i);
                
            }
            
            // constructor just for allocation
            public $Closure$92(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 49 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int mc =
                      this.
                        out$$.count3s$O((int)(this.
                                                i));
                    
//#line 50 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
try {{
                        
//#line 50 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
x10.lang.Runtime.enterAtomic();
                        {
                            
//#line 50 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final Count3sInArray x83433 =
                              ((Count3sInArray)(this.
                                                  out$$));
                            
//#line 50 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int y83434 =
                              mc;
                            
//#line 50 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83453 =
                              x83433.
                                count;
                            
//#line 50 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
final int t83454 =
                              ((t83453) + (((int)(y83434))));
                            
//#line 50 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
x83433.count = t83454;
                        }
                    }}finally {{
                          
//#line 50 "C:/eclipsews/pppp11/pppp11/src/Count3sInArray.x10"
x10.lang.Runtime.exitAtomic();
                      }}
                    }
                
                public Count3sInArray out$$;
                public int i;
                
                // creation method for java code
                public static Count3sInArray.$Closure$92 $make(final Count3sInArray out$$,
                                                               final int i){return new $Closure$92(out$$,i);}
                public $Closure$92(final Count3sInArray out$$,
                                   final int i) { {
                                                         this.out$$ = out$$;
                                                         this.i = i;
                                                     }}
                
                }
                
        
        }
        