public class IntegratePar { 
	static epsilon = 1.0e-12;
	val fun:(double)=>double;
	public def this(f:(double)=>double) { fun = f; }
	public def computeArea(left:double, right:double) =
		eval(left, fun(left), right, fun(right), 0);
	
	private def eval(l:double, fl:double, r:double, fr:double, a:double):double {
		val h = (r - l) / 2;
		val hh = h / 2;
		val c = l + h;
		val fc = fun(c);
		val al = (fl + fc) * hh;   
		val ar = (fr + fc) * hh;
		val alr = al + ar;
		
		if (Math.abs(alr - a) < epsilon) {
			return alr;
		} else {
			val expr1:double;
			val expr2:double;
			finish {
				async { expr1 = eval(c, fc, r, fr, ar); }
				expr2 = eval(l, fl, c, fc, al);
			}
			return expr1 + expr2;
		}
	}
	
	public static def main(args:Rail[String]) {
		val obj = new IntegratePar((x:double)=>x*x+x);
		val xMax = args.size > 0 ? Int.parseInt(args(0)) : 10n;
		var start:double = - System.nanoTime();
		val area = obj.computeArea(0, xMax);
		start += System.nanoTime();
		Console.OUT.println("The area of (x*x +1) * x from 0 to "
				+xMax+" is "+area 
				+ " (t=" + (start/(1000*1000) as float) + " ms).");
	}
}
