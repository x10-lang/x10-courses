	import x10.util.Random;
	
	public class MontyPi2 {
	    public static def main(s: Rail[String]) {
	        assert s.length >= 1 : "Usage: MontyPi <number of points>";
	        val N = int.parseInt(s(0));
	        val result = DistArray.make[Double](Dist.makeUnique(), (Point)=>0.0D);
	        finish  {
	            for(p:Point(1) in result.dist) 
	                async at(result.dist(p))
	            {
	                val r = new Random();
	                var a:double=0.0D;
	                for(j in 1..N) {
	                    val x = r.nextDouble(), y=r.nextDouble();
	                    if (x*x +y*y <= 1.0) a++;
	                }
	                result(p)=a;
	            }
	        }
	        val pi = 4*result.reduce(Double.+,0)/(N*Place.MAX_PLACES);
	        Console.OUT.println("The value of pi is " + pi);
	    }
	}
	
