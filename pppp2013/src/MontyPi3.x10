import x10.util.Random;
	

import x10.regionarray.DistArray;
import x10.regionarray.Dist;
public class MontyPi3 {
    static val summer = new Reducible[Double]() {
        public def zero()=0.0D;
        public operator this(i:Double, j:Double)=i+j;
    };
    public static def main(s: Rail[String]) {
        assert s.size >= 1 : "Usage: MontyPi [<number of points per place:Int>]";
        val N = s.size > 0 ? int.parseInt(s(0)) : 10000n;
        var start:double = - System.nanoTime();
        val sum = finish (summer)  {
            for(p in Place.places()) 
                async at(p) {
                    val r = new Random();
                    var a:double=0.0D;
                    for(1..N) {
                        val x = r.nextDouble(), y=r.nextDouble();
                        if (x*x +y*y <= 1.0) a++;
                    }
                    offer a;
                }
        };
        val pi = 4n*sum/(N*Place.MAX_PLACES);
        start += System.nanoTime();
        Console.OUT.println("The value of pi is " + pi + " (t=" + (start/(1000n*1000n)) + " ms).");
    }
}
	
