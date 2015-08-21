import x10.util.Random;
public class BFS {
	
	static class V(id:Int) {
		var edges:Rail[V]=null;
		var out:Int=-1n;
	    def this(id:Int) {
	    	property(id);
	    }
	    def set(e:Rail[V]) {
	    	edges=e;
	    }
	    public def mark() {
	    	out=0n;
	    	finish async 
	    		visit(Clock.make());
	    }
	    def first(v:V) {
	    	var prev:V;
	    	atomic 
	    	if (out < 0) {
	    		out = v.out+1n;
	    		return true;
	    	}
	    	return false;
	    }
	    
	    public def visit(c:Clock) {
	    	for (v in edges)  
	    		if (v.first(this))  async clocked(c) {
	    			Clock.advanceAll();
	    			v.visit(c);
	    		}	
	    }
	    def edgeString() {
	    	if (edges==null) return "";
	    	var r:String = "";
	    	for (v in edges)
	    		r += " " + v.id;
	    	return r;
	    }
	    public def toString() = 
	    	"" + id + " (" + edgeString() + ") > " + out;
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
		vertices(0).mark();
		for (v in vertices) {
			Console.OUT.println(""+v);
		}
	}
}