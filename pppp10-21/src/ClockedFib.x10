import x10.util.Box;

public class ClockedFib {
	static  class ClockedInt implements ()=>Int{
		var v:Int=0;
		val name:String;
		def this(x:Int, s:String) { 
			this.v=x; 
			this.name=s;}
		public def apply()=v;
		public def set(x:Int) {
			next; // wait for readers to finish, so you are clear to write
			v=x;  // write
			next; // wait for others to write, so u are clear to read
		}
		public def addIn(x:Int) {
			set(x+v);
		}
		public def toString() =name;
	}
	public static def main(Array[String]) {
		clocked finish {
			val x = new ClockedInt(1, "x");
			val y = new ClockedInt(1, "y");
			clocked async 
			   while ((y()) < 100) 
				  x.addIn(y());
			clocked async 
			   while ((x()) < 100) {
				   y.set(x());
				   Console.OUT.print(" " + x());
			   }
			y.set(Int.MAX_VALUE);
		}
	}
}