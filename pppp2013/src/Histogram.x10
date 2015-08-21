public class Histogram {
	
	public static def run(a:Rail[Int], b:Rail[Int]) {
		finish for (i in a) async {
			val bin = a(i) % b.size;
			atomic b(bin)++;
		}
	}
	public static def main(args:Rail[String]) {
		assert args.size==2 : "Usage: Histogram <M:Long> <N:Long>";
		val M=Long.parseLong(args(0)), N = Long.parseLong(args(1));
		assert M%N == 0 : "Usage: M must be a multiple of N.";
		val a = new Rail[Int](M, (q:Long) => q as Int);
		val b = new Rail[Int](N, 0n);
		run (a,b);
		val v = b(0);
		for (x in b) assert x==v;
		Console.OUT.println("Test ok.");
	}
}