/**
 * A synthetic program to show how X10RT_RXTX trace 
 * information can be used to triage potential 
 * scalability problems. 
 */
class AtProblem {
	public static def compute(a:Rail[int]) {
		for (i in 0..((a.size/2)-1)) {
			if ((a(i) + a(a.size-1-i)) != a.size-1) 
			    Console.OUT.println("ERROR! "+here+" "+i+" "+a(i)+" "+a(a.size-1-i));
		}
	}
	
	
	public static def main(args:Array[String](1)) {
		val bad = args.size==0;
		val strong = args.size>0 && args(0).equals("s");
		val div = strong ? Place.MAX_PLACES : 1;
		val a = new Rail[Rail[int]](Place.MAX_PLACES, (i:int)=>new Rail[int](1024/div, (i:int)=>i));
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