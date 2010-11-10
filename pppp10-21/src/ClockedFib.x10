public class ClockedFib {
	public static def main(Array[String]) {
		clocked finish {
			val x = new Clocked[Int](1, "x");
			val y = new Clocked[Int](1, "y");
			clocked async 
			   while ((y()) < 100) 
				  x.set(x()+y());
			clocked async 
			   while ((x()) < 100) {
				   y.set(x());
				   Console.OUT.print(" " + x());
			   }
			y.set(Int.MAX_VALUE);
		}
	}
}