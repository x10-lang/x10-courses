import x10.util.*; 

public class ParallelPrefix {
    val a = DistArray.make[Int](Dist.makeUnique(), (p:Point)=> p(0));
    public def run() { run(0, a.region.max(0));}
    public def run(lo:int, hi:int) {
        if (lo==hi) return;
        if (lo+1 == hi) {
            at (a.dist(lo)) {
                val e = a(lo);
                at (a.dist(hi))
		    a(hi)= e + a(hi);
            }
            return;
        }
        val mid = lo + ((hi-lo+1)/2);
        finish {
            async run(lo, mid-1);
            run(mid, hi);
        }
        at (a.dist(mid-1)) { //expand
            val e = a(mid-1);
            finish for (p in mid..hi)
                async
		    at(a.dist(p))
		    a(p) = e + a(p);
        }
    }
    public def print() {
        for (p in a.region)
            at (a.dist(p))
		Console.OUT.println("a(" + p+ ")= " + a(p));
    }
    public static def main(Rail[String]) {
        val P=Place.MAX_PLACES;
        Console.OUT.println("P=" + P);
        if (! Math.powerOf2(Place.MAX_PLACES) ) {
            Console.OUT.println("Must run in a positive power of 2 places.");
        }
        val s = new ParallelPrefix();
        s.run();
        s.print();
    }
}