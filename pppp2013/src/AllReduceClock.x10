/**
 * An implementation of allReduce for a uniquely distributed array.
 * Uses a helper array of the same distribution.
 * 
 * This program assumes the operation to be performed is associative and 
 * commutative.
 * 
 * The program is safe.
 * 
 * @author vj
 */
import pppp.util.Utils;
import x10.regionarray.*;
public class AllReduceClock {
  static def even ( p:Int):Boolean = p % 2n == 0n;
  public static def allReduce(red:DistArray[int](1), black:DistArray[int](1)) {
    val P = Place.MAX_PLACES;
    val phases = Utils.log2(P as Int);
    clocked finish  {
    	for (p in red.dist.places()) clocked async at(p) {
    		var shift_:Int=1n;
    		for (phase in 0n..(phases-1n)) {
    			val e = even(phase);
    			val destId = (p.id+shift_)% P;
    			if (e) {
    				val elem = black(p.id);
    				at(Place.place(destId)) 
        					red(destId) = elem + black(destId);
    			} else {
    				val elem = red(p.id);
    				at (Place.place(destId)) {
    					black(destId) = elem + red(destId);
    				}
    			}
    			shift_ *=2n;
    			Clock.advanceAll();
    		}
    	}
    }
    return (even(phases-1n)) ? red(0n) : black(0n);
  }
  public static def main(Array[String](1)) {
    assert Utils.powerOf2(Place.MAX_PLACES as Int)
        : " Must run on power of 2 places.";
    val D = Dist.makeUnique();
    val black:DistArray[int](1) = DistArray.make[int](D, (p:Point)=> p(0) as Int);
    val red:DistArray[int](1) = DistArray.make[int](D, (Point)=> 0n);
    val result = allReduce(red, black);
    Console.OUT.println("allReduce = " + result);
  }
}