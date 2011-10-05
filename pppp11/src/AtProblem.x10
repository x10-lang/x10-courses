/**
 * A synthetic program to show how X10RT_RXTX trace 
 * information can be used to triage potential 
 * scalability problems. 
 */
class AtProblem {
	public static def compute(a:Array[int]) {
		for (i in 0..((a.size/2)-1)) {
			if ((a(i) + a(a.size-1-i)) != a.size-1) Console.OUT.println("ERROR! "+here+" "+i+" "+a(i)+" "+a(a.size-1-i));
		}
	}
	
	
	public static def main(args:Array[String]) {
		val bad = args.size>0;
		val a = new Array[Array[int]](Place.MAX_PLACES, (i:int)=>new Array[int](1000, (i:int)=>i));
		if (bad) {
			for (1..20) {
				for (p in Place.places()) {
					async at (p) compute(a(p.id));
				}    
			}
		} else {
			for (1..20) {
				for (p in Place.places()) {
					val myA = a(p.id);
					async at (p) compute(myA);
				}    
			}
		}
	} 
}