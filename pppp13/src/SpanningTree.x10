import x10.util.Random;
public class SpanningTree {
	
	static class V(id:Int) {
		var edges:Rail[V]=null;
		var out:V=null;
	    def this(id:Int) {
	    	property(id);
	    }
	    def set(e:Rail[V]) {
	    	edges=e;
	    }
	    public def mark() {
	    	out=this;
	    	finish visit();
	    }
	    def first(v:V) {
	    	var prev:V;
	    	atomic {
	    		prev=out;
	    		out=out==null || out.id > v.id ? v : out;
	    	}
	    	return prev==null;
	    }
	    public def visit() {
	    	for (v in edges)  
	    		if (v.first(this)) async
	    			v.visit();
	    		
	    }
	    def edgeString() {
	    	if (edges==null) return "";
	    	var r:String = "";
	    	for (v in edges)
	    		r += " " + v.id;
	    	return r;
	    }
	    public def toString() = 
	    	"" + id + " (" + edgeString() + ") > " + (out==null ? "null" : "" + out.id);
	}
	public static def main(args:Rail[String]) {
		val N = Int.parseInt(args(0));
		Console.OUT.println("N=" + N);
		val vertices = new Rail[V](N, (i:Long)=> new V(i as Int));
		val r = new Random();
		for (v in vertices) {
			val N1 = Math.min(Math.abs(r.nextInt(N))+1n, 4n);
			v.set(new Rail[V](N1, (i:Long)=> 
				vertices(i==0? (v.id == N-1n? N-1n : v.id+1n)
						: Math.abs(r.nextInt(N)))));
		}
		Console.OUT.println("Starting mark.");
		val time = System.nanoTime();
		vertices(0).mark();
		Console.OUT.println("Time: " + (System.nanoTime()-time)*1.0/(1000*1000*1000) + " s");
		for (v in vertices) {
			Console.OUT.println(""+v);
		}
	}
}