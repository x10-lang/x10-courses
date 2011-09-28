
public class HistogramAtomicInteger extends x10.core.Ref implements x10.x10rt.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, HistogramAtomicInteger.class);
    
    public static final x10.rtt.RuntimeType<HistogramAtomicInteger> $RTT = new x10.rtt.NamedType<HistogramAtomicInteger>(
    "HistogramAtomicInteger", /* base class */HistogramAtomicInteger.class
    , /* parents */ new x10.rtt.Type[] {x10.rtt.Types.OBJECT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.x10rt.X10JavaSerializable $_deserialize_body(HistogramAtomicInteger $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + HistogramAtomicInteger.class + " calling"); } 
        x10.array.Array data = (x10.array.Array) $deserializer.readRef();
        $_obj.data = data;
        $_obj.size = $deserializer.readInt();
        $_obj.maxVal = $deserializer.readInt();
        x10.array.Array serialHistogram = (x10.array.Array) $deserializer.readRef();
        $_obj.serialHistogram = serialHistogram;
        x10.array.Array parallelHistogram = (x10.array.Array) $deserializer.readRef();
        $_obj.parallelHistogram = parallelHistogram;
        $_obj.numAsyncs = $deserializer.readInt();
        $_obj.populateTime = $deserializer.readLong();
        $_obj.serialTime = $deserializer.readLong();
        $_obj.parallelTime = $deserializer.readLong();
        return $_obj;
        
    }
    
    public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
    
        HistogramAtomicInteger $_obj = new HistogramAtomicInteger((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public short $_get_serialization_id() {
    
         return $_serialization_id;
        
    }
    
    public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
    
        if (data instanceof x10.x10rt.X10JavaSerializable) {
        $serializer.write( (x10.x10rt.X10JavaSerializable) this.data);
        } else {
        $serializer.write(this.data);
        }
        $serializer.write(this.size);
        $serializer.write(this.maxVal);
        if (serialHistogram instanceof x10.x10rt.X10JavaSerializable) {
        $serializer.write( (x10.x10rt.X10JavaSerializable) this.serialHistogram);
        } else {
        $serializer.write(this.serialHistogram);
        }
        if (parallelHistogram instanceof x10.x10rt.X10JavaSerializable) {
        $serializer.write( (x10.x10rt.X10JavaSerializable) this.parallelHistogram);
        } else {
        $serializer.write(this.parallelHistogram);
        }
        $serializer.write(this.numAsyncs);
        $serializer.write(this.populateTime);
        $serializer.write(this.serialTime);
        $serializer.write(this.parallelTime);
        
    }
    
    // constructor just for allocation
    public HistogramAtomicInteger(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
//#line 6 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public x10.array.Array<x10.core.Int> data;
        
//#line 7 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public int size;
        
//#line 8 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public int maxVal;
        
//#line 11 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public x10.array.Array<x10.core.Int> serialHistogram;
        
//#line 14 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public x10.array.Array<x10.core.concurrent.AtomicInteger> parallelHistogram;
        
//#line 17 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public int numAsyncs;
        
//#line 20 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public long populateTime;
        
//#line 21 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public long serialTime;
        
//#line 22 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public long parallelTime;
        
//#line 23 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final public static int M = 1000000;
        
        
//#line 25 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
// creation method for java code
        public static HistogramAtomicInteger $make(final int size,
                                                   final int maxVal,
                                                   final int numAsyncs){return new HistogramAtomicInteger((java.lang.System[]) null).$init(size,maxVal,numAsyncs);}
        
        // constructor for non-virtual call
        final public HistogramAtomicInteger HistogramAtomicInteger$$init$S(final int size,
                                                                           final int maxVal,
                                                                           final int numAsyncs) { {
                                                                                                         {
                                                                                                             
//#line 25 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"

                                                                                                         }
                                                                                                         {
                                                                                                             {
                                                                                                                 
//#line 25 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"

                                                                                                             }
                                                                                                             
//#line 3 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.__fieldInitializers79849();
                                                                                                         }
                                                                                                         
//#line 26 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
assert ((size) >= (((int)(1))));
                                                                                                         
//#line 27 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
assert ((maxVal) >= (((int)(0))));
                                                                                                         
//#line 28 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
assert ((numAsyncs) >= (((int)(1))));
                                                                                                         
//#line 29 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.size = size;
                                                                                                         
//#line 30 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.maxVal = maxVal;
                                                                                                         
//#line 31 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.numAsyncs = numAsyncs;
                                                                                                         
//#line 32 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Array<x10.core.Int> t80540 =
                                                                                                           ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(size)),
                                                                                                                                                                                                                    (x10.core.Int.$box(0)),(java.lang.Class<?>[][][][][]) null)));
                                                                                                         
//#line 32 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.data = ((x10.array.Array)(t80540));
                                                                                                         
//#line 33 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Array<x10.core.Int> t80541 =
                                                                                                           ((x10.array.Array)(new x10.array.Array<x10.core.Int>((java.lang.System[]) null, x10.rtt.Types.INT).$init(((int)(maxVal)),
                                                                                                                                                                                                                    (x10.core.Int.$box(0)),(java.lang.Class<?>[][][][][]) null)));
                                                                                                         
//#line 33 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.serialHistogram = ((x10.array.Array)(t80541));
                                                                                                         
//#line 34 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.concurrent.AtomicInteger> t80543 =
                                                                                                           ((x10.core.fun.Fun_0_1)(new HistogramAtomicInteger.$Closure$80()));
                                                                                                         
//#line 34 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Array<x10.core.concurrent.AtomicInteger> t80544 =
                                                                                                           ((x10.array.Array)(new x10.array.Array<x10.core.concurrent.AtomicInteger>((java.lang.System[]) null, x10.core.concurrent.AtomicInteger.$RTT).$init(((int)(maxVal)),
                                                                                                                                                                                                                                                              ((x10.core.fun.Fun_0_1)(t80543)),(java.lang.Class<?>[][][][]) null)));
                                                                                                         
//#line 34 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.parallelHistogram = ((x10.array.Array)(t80544));
                                                                                                     }
                                                                                                     return this;
                                                                                                     }
        
        // constructor
        public HistogramAtomicInteger $init(final int size,
                                            final int maxVal,
                                            final int numAsyncs){return HistogramAtomicInteger$$init$S(size,maxVal,numAsyncs);}
        
        
        
//#line 37 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public void
                                                                                  run(
                                                                                  ){
            
//#line 38 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.io.Printer t80545 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 38 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
t80545.println(((java.lang.String)("\t[computing histogram serially]")));
            
//#line 39 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.serialCompute();
            
//#line 40 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.io.Printer t80546 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 40 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
t80546.println(((java.lang.String)("\t[computing histogram in parallel]")));
            
//#line 41 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.parallelCompute();
            
//#line 42 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.io.Printer t80547 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 42 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
t80547.println(((java.lang.String)("\t[checking]")));
            
//#line 43 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.check();
            
//#line 44 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.reset();
        }
        
        
//#line 47 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public void
                                                                                  populate(
                                                                                  ){
            
//#line 48 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long time =
              x10.lang.System.nanoTime$O();
            
//#line 49 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.util.Random r =
              ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null).$init(((long)(time)))));
            
//#line 50 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Array<x10.core.Int> data_ =
              ((x10.array.Array)(this.
                                   data));
            {
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Array<x10.core.Int> t80548 =
                  ((x10.array.Array)(data));
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80549 =
                  ((x10.array.Array<x10.core.Int>)t80548).
                    size;
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80550 =
                  ((t80549) - (((int)(1))));
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.lang.IntRange t80551 =
                  ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(t80550)))));
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Region p80415 =
                  ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t80551)))));
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int i80416min80417 =
                  p80415.min$O((int)(0));
                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int i80416max80418 =
                  p80415.max$O((int)(0));
                {
                    
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
int i80416 =
                      i80416min80417;
                    
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
for (;
                                                                                                 true;
                                                                                                 ) {
                        
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80553 =
                          i80416;
                        
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final boolean t80558 =
                          ((t80553) <= (((int)(i80416max80418))));
                        
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
if (!(t80558)) {
                            
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
break;
                        }
                        {
                            
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int i =
                              i80416;
                            {
                                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80556 =
                                  maxVal;
                                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80557 =
                                  r.nextInt$O((int)(t80556));
                                
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
((x10.array.Array<x10.core.Int>)data_).$set__1x10$array$Array$$T$G((int)(i),
                                                                                                                                                                           x10.core.Int.$box(t80557));
                            }
                        }
                        {
                            
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80554 =
                              i80416;
                            
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80555 =
                              ((t80554) + (((int)(1))));
                            
//#line 51 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
i80416 = t80555;
                        }
                    }
                }
            }
            
//#line 52 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final HistogramAtomicInteger x80528 =
              ((HistogramAtomicInteger)(this));
            
//#line 52 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80559 =
              x10.lang.System.nanoTime$O();
            
//#line 52 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80560 =
              ((t80559) - (((long)(time))));
            
//#line 52 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80561 =
              ((long)(((int)(1000000))));
            
//#line 52 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long y80529 =
              ((t80560) / (((long)(t80561))));
            
//#line 52 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80562 =
              x80528.
                populateTime;
            
//#line 52 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80563 =
              ((t80562) + (((long)(y80529))));
            
//#line 52 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
x80528.populateTime = t80563;
        }
        
        
//#line 55 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public void
                                                                                  serialCompute(
                                                                                  ){
            
//#line 56 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long time =
              x10.lang.System.nanoTime$O();
            {
                
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Array<x10.core.Int> t80564 =
                  ((x10.array.Array)(data));
                
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80565 =
                  ((x10.array.Array<x10.core.Int>)t80564).
                    size;
                
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80566 =
                  ((t80565) - (((int)(1))));
                
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.lang.IntRange t80567 =
                  ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(t80566)))));
                
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Region p80434 =
                  ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t80567)))));
                
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int i80435min80436 =
                  p80434.min$O((int)(0));
                
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int i80435max80437 =
                  p80434.max$O((int)(0));
                {
                    
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
int i80435 =
                      i80435min80436;
                    
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
for (;
                                                                                                 true;
                                                                                                 ) {
                        
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80569 =
                          i80435;
                        
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final boolean t80574 =
                          ((t80569) <= (((int)(i80435max80437))));
                        
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
if (!(t80574)) {
                            
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
break;
                        }
                        {
                            
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int i =
                              i80435;
                            {
                                
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Array<x10.core.Int> x80530 =
                                  ((x10.array.Array)(serialHistogram));
                                
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Array<x10.core.Int> t80572 =
                                  ((x10.array.Array)(data));
                                
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int y80531 =
                                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t80572).$apply$G((int)(i)));
                                
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
;
                                
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
int ret80534 =
                                   0;
                                {
                                    
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80573 =
                                      x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)x80530).$apply$G((int)(y80531)));
                                    
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int r80533 =
                                      ((t80573) + (((int)(1))));
                                    
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
((x10.array.Array<x10.core.Int>)x80530).$set__1x10$array$Array$$T$G((int)(y80531),
                                                                                                                                                                                x10.core.Int.$box(r80533));
                                    
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
ret80534 = r80533;
                                }
                            }
                        }
                        {
                            
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80570 =
                              i80435;
                            
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80571 =
                              ((t80570) + (((int)(1))));
                            
//#line 57 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
i80435 = t80571;
                        }
                    }
                }
            }
            
//#line 58 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final HistogramAtomicInteger x80536 =
              ((HistogramAtomicInteger)(this));
            
//#line 58 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80575 =
              x10.lang.System.nanoTime$O();
            
//#line 58 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80576 =
              ((t80575) - (((long)(time))));
            
//#line 58 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80577 =
              ((long)(((int)(1000000))));
            
//#line 58 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long y80537 =
              ((t80576) / (((long)(t80577))));
            
//#line 58 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80578 =
              x80536.
                serialTime;
            
//#line 58 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80579 =
              ((t80578) + (((long)(y80537))));
            
//#line 58 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
x80536.serialTime = t80579;
        }
        
        
//#line 61 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public void
                                                                                  parallelCompute(
                                                                                  ){
            
//#line 62 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long time =
              x10.lang.System.nanoTime$O();
            {
                
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
x10.lang.Runtime.ensureNotInAtomic();
                
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.lang.FinishState x10$__var31 =
                  x10.lang.Runtime.startFinish();
                
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
try {try {{
                    {
                        
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80580 =
                          numAsyncs;
                        
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80581 =
                          ((t80580) - (((int)(1))));
                        
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.lang.IntRange t80582 =
                          ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(t80581)))));
                        
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Region p80453 =
                          ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t80582)))));
                        
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int i80454min80455 =
                          p80453.min$O((int)(0));
                        
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int i80454max80456 =
                          p80453.max$O((int)(0));
                        {
                            
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
int i80454 =
                              i80454min80455;
                            
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
for (;
                                                                                                         true;
                                                                                                         ) {
                                
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80584 =
                                  i80454;
                                
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final boolean t80587 =
                                  ((t80584) <= (((int)(i80454max80456))));
                                
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
if (!(t80587)) {
                                    
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
break;
                                }
                                {
                                    
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int i =
                                      i80454;
                                    {
                                        
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new HistogramAtomicInteger.$Closure$81(this,
                                                                                                                                                                                                             i))));
                                    }
                                }
                                {
                                    
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80585 =
                                      i80454;
                                    
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80586 =
                                      ((t80585) + (((int)(1))));
                                    
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
i80454 = t80586;
                                }
                            }
                        }
                    }
                }}catch (x10.core.Throwable $exc$) {throw $exc$;}catch (java.lang.Throwable $exc$) {throw x10.core.ThrowableUtilities.convertJavaThrowable($exc$);}}catch (x10.core.X10Throwable __lowerer__var__25__) {
                    
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
x10.lang.Runtime.pushException(((x10.core.X10Throwable)(__lowerer__var__25__)));
                    
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
throw new x10.lang.RuntimeException();
                }finally {{
                     
//#line 63 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var31)));
                 }}
                }
            
//#line 66 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final HistogramAtomicInteger x80538 =
              ((HistogramAtomicInteger)(this));
            
//#line 66 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80588 =
              x10.lang.System.nanoTime$O();
            
//#line 66 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80589 =
              ((t80588) - (((long)(time))));
            
//#line 66 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80590 =
              ((long)(((int)(1000000))));
            
//#line 66 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long y80539 =
              ((t80589) / (((long)(t80590))));
            
//#line 66 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80591 =
              x80538.
                parallelTime;
            
//#line 66 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80592 =
              ((t80591) + (((long)(y80539))));
            
//#line 66 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
x80538.parallelTime = t80592;
            }
        
        
//#line 69 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public void
                                                                                  chunkCompute(
                                                                                  final int id){
            
//#line 70 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80593 =
              size;
            
//#line 70 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80594 =
              numAsyncs;
            
//#line 70 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int chunkSize =
              ((t80593) / (((int)(t80594))));
            
//#line 71 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int start =
              ((chunkSize) * (((int)(id))));
            
//#line 72 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80595 =
              numAsyncs;
            
//#line 72 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80596 =
              ((t80595) - (((int)(1))));
            
//#line 72 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final boolean t80599 =
              ((int) id) ==
            ((int) t80596);
            
//#line 72 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
int t80600 =
               0;
            
//#line 72 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
if (t80599) {
                
//#line 72 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80597 =
                  size;
                
//#line 72 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
t80600 = ((t80597) - (((int)(1))));
            } else {
                
//#line 72 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80598 =
                  ((start) + (((int)(chunkSize))));
                
//#line 72 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
t80600 = ((t80598) - (((int)(1))));
            }
            
//#line 72 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int end =
              t80600;
            
//#line 73 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Array<x10.core.Int> data_ =
              ((x10.array.Array)(this.
                                   data));
            {
                
//#line 74 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
int i =
                  start;
                
//#line 74 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
for (;
                                                                                             true;
                                                                                             ) {
                    
//#line 74 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80602 =
                      i;
                    
//#line 74 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final boolean t80609 =
                      ((t80602) <= (((int)(end))));
                    
//#line 74 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
if (!(t80609)) {
                        
//#line 74 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
break;
                    }
                    {
                        
//#line 75 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Array<x10.core.concurrent.AtomicInteger> t80606 =
                          ((x10.array.Array)(parallelHistogram));
                        
//#line 75 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80605 =
                          i;
                        
//#line 75 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80607 =
                          x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)data_).$apply$G((int)(t80605)));
                        
//#line 75 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.core.concurrent.AtomicInteger t80608 =
                          ((x10.array.Array<x10.core.concurrent.AtomicInteger>)t80606).$apply$G((int)(t80607));
                        
//#line 75 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
x10.runtime.util.Util.eval(t80608.incrementAndGet());
                    }
                    {
                        
//#line 74 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80603 =
                          i;
                        
//#line 74 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80604 =
                          ((t80603) + (((int)(1))));
                        
//#line 74 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
i = t80604;
                    }
                }
            }
        }
        
        
//#line 79 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public void
                                                                                  check(
                                                                                  ){
            
//#line 80 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80610 =
              maxVal;
            
//#line 80 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80611 =
              ((t80610) - (((int)(1))));
            
//#line 80 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.lang.IntRange t80612 =
              ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(t80611)))));
            
//#line 80 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Region p80472 =
              ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t80612)))));
            
//#line 80 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int i80473min80474 =
              p80472.min$O((int)(0));
            
//#line 80 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int i80473max80475 =
              p80472.max$O((int)(0));
            {
                
//#line 80 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
int i80473 =
                  i80473min80474;
                
//#line 80 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
for (;
                                                                                             true;
                                                                                             ) {
                    
//#line 80 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80614 =
                      i80473;
                    
//#line 80 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final boolean t80633 =
                      ((t80614) <= (((int)(i80473max80475))));
                    
//#line 80 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
if (!(t80633)) {
                        
//#line 80 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
break;
                    }
                    {
                        
//#line 80 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int i =
                          i80473;
                        {
                            
//#line 81 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Array<x10.core.concurrent.AtomicInteger> t80617 =
                              ((x10.array.Array)(parallelHistogram));
                            
//#line 81 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.core.concurrent.AtomicInteger t80618 =
                              ((x10.array.Array<x10.core.concurrent.AtomicInteger>)t80617).$apply$G((int)(i));
                            
//#line 81 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80620 =
                              t80618.get();
                            
//#line 81 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Array<x10.core.Int> t80619 =
                              ((x10.array.Array)(serialHistogram));
                            
//#line 81 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80621 =
                              x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t80619).$apply$G((int)(i)));
                            
//#line 81 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final boolean t80632 =
                              ((int) t80620) !=
                            ((int) t80621);
                            
//#line 81 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
if (t80632) {
                                
//#line 82 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.io.Printer t80630 =
                                  ((x10.io.Printer)(x10.io.Console.OUT));
                                
//#line 82 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80622 =
                                  (("Error: Incorrect count of ") + ((x10.core.Int.$box(i))));
                                
//#line 82 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80624 =
                                  ((t80622) + (": expected "));
                                
//#line 83 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Array<x10.core.Int> t80623 =
                                  ((x10.array.Array)(serialHistogram));
                                
//#line 83 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80625 =
                                  x10.core.Int.$unbox(((x10.array.Array<x10.core.Int>)t80623).$apply$G((int)(i)));
                                
//#line 82 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80626 =
                                  ((t80624) + ((x10.core.Int.$box(t80625))));
                                
//#line 82 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80628 =
                                  ((t80626) + (", found "));
                                
//#line 84 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Array<x10.core.concurrent.AtomicInteger> t80627 =
                                  ((x10.array.Array)(parallelHistogram));
                                
//#line 84 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.core.concurrent.AtomicInteger t80629 =
                                  ((x10.array.Array<x10.core.concurrent.AtomicInteger>)t80627).$apply$G((int)(i));
                                
//#line 82 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80631 =
                                  ((t80628) + (t80629));
                                
//#line 82 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
t80630.println(((java.lang.String)(t80631)));
                                
//#line 85 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
assert false;
                            }
                        }
                    }
                    {
                        
//#line 80 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80615 =
                          i80473;
                        
//#line 80 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80616 =
                          ((t80615) + (((int)(1))));
                        
//#line 80 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
i80473 = t80616;
                    }
                }
            }
        }
        
        
//#line 89 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public long
                                                                                  populateTime$O(
                                                                                  ){
            
//#line 89 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80634 =
              populateTime;
            
//#line 89 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
return t80634;
        }
        
        
//#line 91 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public long
                                                                                  serialTime$O(
                                                                                  ){
            
//#line 91 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80635 =
              serialTime;
            
//#line 91 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
return t80635;
        }
        
        
//#line 93 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public long
                                                                                  parallelTime$O(
                                                                                  ){
            
//#line 93 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80636 =
              parallelTime;
            
//#line 93 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
return t80636;
        }
        
        
//#line 95 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public void
                                                                                  timerReset(
                                                                                  ){
            
//#line 96 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80637 =
              ((long)(((int)(0))));
            
//#line 96 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.serialTime = t80637;
            
//#line 97 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80638 =
              ((long)(((int)(0))));
            
//#line 97 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.parallelTime = t80638;
        }
        
        
//#line 100 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public void
                                                                                   reset(
                                                                                   ){
            
//#line 101 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Array<x10.core.Int> t80639 =
              ((x10.array.Array)(serialHistogram));
            
//#line 101 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80640 =
              ((x10.array.Array<x10.core.Int>)t80639).
                size;
            
//#line 101 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80641 =
              ((t80640) - (((int)(1))));
            
//#line 101 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.lang.IntRange t80642 =
              ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(0)), ((int)(t80641)))));
            
//#line 101 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Region p80491 =
              ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t80642)))));
            
//#line 101 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int i80492min80493 =
              p80491.min$O((int)(0));
            
//#line 101 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int i80492max80494 =
              p80491.max$O((int)(0));
            {
                
//#line 101 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
int i80492 =
                  i80492min80493;
                
//#line 101 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
for (;
                                                                                              true;
                                                                                              ) {
                    
//#line 101 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80644 =
                      i80492;
                    
//#line 101 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final boolean t80650 =
                      ((t80644) <= (((int)(i80492max80494))));
                    
//#line 101 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
if (!(t80650)) {
                        
//#line 101 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
break;
                    }
                    {
                        
//#line 101 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int i =
                          i80492;
                        {
                            
//#line 102 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Array<x10.core.Int> t80647 =
                              ((x10.array.Array)(serialHistogram));
                            
//#line 102 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
((x10.array.Array<x10.core.Int>)t80647).$set__1x10$array$Array$$T$G((int)(i),
                                                                                                                                                                         x10.core.Int.$box(0));
                            
//#line 103 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Array<x10.core.concurrent.AtomicInteger> t80648 =
                              ((x10.array.Array)(parallelHistogram));
                            
//#line 103 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.core.concurrent.AtomicInteger t80649 =
                              ((x10.array.Array<x10.core.concurrent.AtomicInteger>)t80648).$apply$G((int)(i));
                            
//#line 103 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
t80649.set(((int)(0)));
                        }
                    }
                    {
                        
//#line 101 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80645 =
                          i80492;
                        
//#line 101 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80646 =
                          ((t80645) + (((int)(1))));
                        
//#line 101 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
i80492 = t80646;
                    }
                }
            }
        }
        
        
//#line 110 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
public static class $Main extends x10.runtime.impl.java.Runtime {
        private static final long serialVersionUID = 1L;
        public static void main(java.lang.String[] args) {
        // start native runtime
        new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.array.Array<java.lang.String> args) {
        // call the original app-main method
        HistogramAtomicInteger.main(args);
        }
        }
        
        // the original app-main method
        public static void main(final x10.array.Array<java.lang.String> args) {
            
//#line 111 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80651 =
              ((x10.array.Array<java.lang.String>)args).
                size;
            
//#line 111 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final boolean t80653 =
              ((t80651) < (((int)(4))));
            
//#line 111 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
if (t80653) {
                
//#line 112 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.io.Printer t80652 =
                  ((x10.io.Printer)(x10.io.Console.OUT));
                
//#line 112 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
t80652.println(((java.lang.String)("Usage: Histogram <size of data rail> <max data value> <number of asyncs> <number of invocations>")));
                
//#line 113 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
return;
            }
            
//#line 115 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80654 =
              ((x10.array.Array<java.lang.String>)args).$apply$G((int)(0));
            
//#line 115 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80657 =
              java.lang.Integer.parseInt(t80654);
            
//#line 116 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80655 =
              ((x10.array.Array<java.lang.String>)args).$apply$G((int)(1));
            
//#line 116 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80658 =
              java.lang.Integer.parseInt(t80655);
            
//#line 117 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80656 =
              ((x10.array.Array<java.lang.String>)args).$apply$G((int)(2));
            
//#line 117 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80659 =
              java.lang.Integer.parseInt(t80656);
            
//#line 115 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final HistogramAtomicInteger histogram =
              ((HistogramAtomicInteger)(new HistogramAtomicInteger((java.lang.System[]) null).$init(t80657,
                                                                                                    t80658,
                                                                                                    t80659)));
            
//#line 120 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.io.Printer t80660 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 120 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
t80660.println(((java.lang.String)("[Warm up run]")));
            
//#line 121 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
histogram.populate();
            
//#line 122 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
histogram.run();
            
//#line 123 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
histogram.timerReset();
            
//#line 126 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80661 =
              ((x10.array.Array<java.lang.String>)args).$apply$G((int)(3));
            
//#line 126 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int numInvoke =
              java.lang.Integer.parseInt(t80661);
            {
                
//#line 127 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.lang.IntRange t80662 =
                  ((x10.lang.IntRange)(x10.lang.IntRange.$make(((int)(1)), ((int)(numInvoke)))));
                
//#line 127 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.array.Region p80510 =
                  ((x10.array.Region)(x10.array.Region.$implicit_convert(((x10.lang.IntRange)(t80662)))));
                
//#line 127 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int i80511min80512 =
                  p80510.min$O((int)(0));
                
//#line 127 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int i80511max80513 =
                  p80510.max$O((int)(0));
                {
                    
//#line 127 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
int i80511 =
                      i80511min80512;
                    
//#line 127 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
for (;
                                                                                                  true;
                                                                                                  ) {
                        
//#line 127 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80664 =
                          i80511;
                        
//#line 127 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final boolean t80670 =
                          ((t80664) <= (((int)(i80511max80513))));
                        
//#line 127 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
if (!(t80670)) {
                            
//#line 127 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
break;
                        }
                        {
                            
//#line 127 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int i =
                              i80511;
                            {
                                
//#line 128 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.io.Printer t80668 =
                                  ((x10.io.Printer)(x10.io.Console.OUT));
                                
//#line 128 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80667 =
                                  (("[Trial #") + ((x10.core.Int.$box(i))));
                                
//#line 128 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80669 =
                                  ((t80667) + ("]"));
                                
//#line 128 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
t80668.println(((java.lang.String)(t80669)));
                                
//#line 129 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
histogram.run();
                            }
                        }
                        {
                            
//#line 127 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80665 =
                              i80511;
                            
//#line 127 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final int t80666 =
                              ((t80665) + (((int)(1))));
                            
//#line 127 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
i80511 = t80666;
                        }
                    }
                }
            }
            
//#line 131 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.io.Printer t80685 =
              ((x10.io.Printer)(x10.io.Console.OUT));
            
//#line 131 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80671 =
              (("[Done.] Over ") + ((x10.core.Int.$box(numInvoke))));
            
//#line 131 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80672 =
              ((t80671) + (" trials, average time"));
            
//#line 131 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80673 =
              ((t80672) + (" to populate is "));
            
//#line 132 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80674 =
              histogram.populateTime$O();
            
//#line 131 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80675 =
              ((t80673) + ((x10.core.Long.$box(t80674))));
            
//#line 131 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80678 =
              ((t80675) + (", to compute serially is "));
            
//#line 133 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80676 =
              histogram.serialTime$O();
            
//#line 133 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80677 =
              ((long)(((int)(numInvoke))));
            
//#line 133 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80679 =
              ((t80676) / (((long)(t80677))));
            
//#line 131 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80680 =
              ((t80678) + ((x10.core.Long.$box(t80679))));
            
//#line 131 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80683 =
              ((t80680) + (", and to compute in parallel is "));
            
//#line 134 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80681 =
              histogram.parallelTime$O();
            
//#line 134 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80682 =
              ((long)(((int)(numInvoke))));
            
//#line 134 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80684 =
              ((t80681) / (((long)(t80682))));
            
//#line 131 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final java.lang.String t80686 =
              ((t80683) + ((x10.core.Long.$box(t80684))));
            
//#line 131 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
t80685.println(((java.lang.String)(t80686)));
        }
        
        
//#line 3 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final public HistogramAtomicInteger
                                                                                 HistogramAtomicInteger$$HistogramAtomicInteger$this(
                                                                                 ){
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
return HistogramAtomicInteger.this;
        }
        
        
//#line 3 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final private void
                                                                                 __fieldInitializers79849(
                                                                                 ){
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.data = null;
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.serialHistogram = null;
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.parallelHistogram = null;
            
//#line 20 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80687 =
              ((long)(((int)(0))));
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.populateTime = t80687;
            
//#line 21 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80688 =
              ((long)(((int)(0))));
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.serialTime = t80688;
            
//#line 22 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final long t80689 =
              ((long)(((int)(0))));
            
//#line 3 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.parallelTime = t80689;
        }
        
        final public static void
          __fieldInitializers79849$P(
          final HistogramAtomicInteger HistogramAtomicInteger){
            HistogramAtomicInteger.__fieldInitializers79849();
        }
        
        public static int
          getInitialized$M(
          ){
            return HistogramAtomicInteger.M;
        }
        
        public static class $Closure$80 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_NOT_ASYNC, $Closure$80.class);
            
            public static final x10.rtt.RuntimeType<$Closure$80> $RTT = new x10.rtt.StaticFunType<$Closure$80>(
            /* base class */$Closure$80.class
            , /* parents */ new x10.rtt.Type[] {new x10.rtt.ParameterizedType(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.core.concurrent.AtomicInteger.$RTT), x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$80 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$80.class + " calling"); } 
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$80 $_obj = new $Closure$80((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
                
            }
            
            public short $_get_serialization_id() {
            
                 return $_serialization_id;
                
            }
            
            public void $_serialize(x10.x10rt.X10JavaSerializer $serializer) throws java.io.IOException {
            
                
            }
            
            // constructor just for allocation
            public $Closure$80(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            // dispatcher for method abstract public (a1:Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Int.$unbox(a1));
            }
            
                
                public x10.core.concurrent.AtomicInteger
                  $apply(
                  final int i){
                    
//#line 34 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
final x10.core.concurrent.AtomicInteger t80542 =
                      ((x10.core.concurrent.AtomicInteger)(new x10.core.concurrent.AtomicInteger(((int)(0)))));
                    
//#line 34 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
return t80542;
                }
                
                // creation method for java code
                public static HistogramAtomicInteger.$Closure$80 $make(){return new $Closure$80();}
                public $Closure$80() { {
                                              
                                          }}
                
            }
            
        public static class $Closure$81 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.x10rt.X10JavaSerializable
        {
            private static final long serialVersionUID = 1L;
            private static final short $_serialization_id = x10.x10rt.DeserializationDispatcher.addDispatcher(x10.x10rt.DeserializationDispatcher.ClosureKind.CLOSURE_KIND_SIMPLE_ASYNC, $Closure$81.class);
            
            public static final x10.rtt.RuntimeType<$Closure$81> $RTT = new x10.rtt.StaticVoidFunType<$Closure$81>(
            /* base class */$Closure$81.class
            , /* parents */ new x10.rtt.Type[] {x10.core.fun.VoidFun_0_0.$RTT, x10.rtt.Types.OBJECT}
            );
            public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
            
            
            private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
            public static x10.x10rt.X10JavaSerializable $_deserialize_body($Closure$81 $_obj , x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("X10JavaSerializable: $_deserialize_body() of " + $Closure$81.class + " calling"); } 
                HistogramAtomicInteger out$$ = (HistogramAtomicInteger) $deserializer.readRef();
                $_obj.out$$ = out$$;
                $_obj.i = $deserializer.readInt();
                return $_obj;
                
            }
            
            public static x10.x10rt.X10JavaSerializable $_deserializer(x10.x10rt.X10JavaDeserializer $deserializer) throws java.io.IOException { 
            
                $Closure$81 $_obj = new $Closure$81((java.lang.System[]) null);
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
            public $Closure$81(final java.lang.System[] $dummy) { 
            super($dummy);
            }
            
                
                public void
                  $apply(
                  ){
                    
//#line 64 "C:/eclipsews/pppp11/pppp11/src/HistogramAtomicInteger.x10"
this.
                                                                                              out$$.chunkCompute((int)(this.
                                                                                                                         i));
                }
                
                public HistogramAtomicInteger out$$;
                public int i;
                
                // creation method for java code
                public static HistogramAtomicInteger.$Closure$81 $make(final HistogramAtomicInteger out$$,
                                                                       final int i){return new $Closure$81(out$$,i);}
                public $Closure$81(final HistogramAtomicInteger out$$,
                                   final int i) { {
                                                         this.out$$ = out$$;
                                                         this.i = i;
                                                     }}
                
            }
            
        
        }
        