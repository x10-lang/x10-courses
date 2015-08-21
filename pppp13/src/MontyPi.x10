import x10.util.Random;
import x10.io.Console;
import x10.regionarray.DistArray;
import x10.regionarray.Dist;
public class MontyPi {
    public static  def main(s: Rail[String]) {
    	assert s.size >= 1n : "Usage: MontyPi [<number of points per place:Int>]";
    	val N = s.size > 0n ? int.parseInt(s(0n)) : 10000n;
    	var start:double = - System.nanoTime();
    	val initializer = (i:Point) => {
    		val r = new Random();
    		var result:double=0.0D;
    		for(j in 1n..N) {
    			val x = r.nextDouble(), y=r.nextDouble();
    			if (x*x +y*y <= 1.0) result++;
    		}
    		result
    	};
    	val result = DistArray.make[Double](Dist.makeUnique(), initializer);
    	val pi = 4n*result.reduce((x:Double,y:Double)=>x+y, 0.0D)/(N*Place.MAX_PLACES);
    	start += System.nanoTime();
        Console.OUT.println("The value of pi is " + pi + " (t=" + (start/(1000n*1000n)) + " ms).");
    }
}
