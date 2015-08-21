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
import x10.array.*;
import x10.util.Team;
public class AllReduceTeam {
  static def even ( p:Int):Boolean = p % 2n == 0n;
  public static def allReduce(red:DistArray_Unique[Long], black:DistArray_Unique[Long]) {
    val P = Place.MAX_PLACES;
    val phases = Utils.log2(P as Int);
    finish  {
    	for (p in Place.places())  at(p) async  {
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
			Team.WORLD.barrier();
    		}
    	}
    }
    return (even(phases-1n)) ? red(0n) : black(0n);
  }
  public static def main(Rail[String]) {
    assert Utils.powerOf2(Place.MAX_PLACES as Int)
        : " Must run on power of 2 places.";
      val black = new DistArray_Unique[Long](()=> here.id);
      val red = new DistArray_Unique[Long]();
      val result = allReduce(red, black);
      Console.OUT.println("allReduce = " + result);
      val even = even(Utils.log2(Place.MAX_PLACES as Int)-1n);
      for (p in Place.places()) at(p) 
	    Console.OUT.print(" " + p.id + ":" + (even? red(p.id):black(p.id)));
      Console.OUT.println();
  }
}
