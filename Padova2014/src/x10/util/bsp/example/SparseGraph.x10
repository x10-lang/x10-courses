package x10.util.bsp.example;

import x10.util.bsp.*;


import x10.util.ArrayList;
import x10.util.List;
import x10.util.Random;


public class SparseGraph {
	static type VAgent=Agent[Any,V];
	static type VAgentRef=AgentRef[Any,V];
	static type PLH=PLHJ[Any,V];
	static type VJob=Job[Any,V];
	static type VJobRunner=JobRunner[Any,V];
	static class V(i:Int) extends VAgent {
		val edges = new ArrayList[VAgentRef]();
		public def addEdge(a:VAgentRef) {
			if (edges.contains(a) || a.equals(ref())) return;
			edges.add(a);
		}
		var parent:Any=null;
		public def run(m:List[Any], phase:Int, runner:PLH) {
			//JobRunner.say("Running " + this, phase);
			if (parent == null) parent = m(0);
			else if (phase > 0) return;
			for (edge in edges) edge.accept(ref(), phase, runner);
		}
		public def toString()
		   ="V " + i + "(parent=" + parent + ", " + edges.size() + " edges)";
		public def print() {
			var s:String = "V " + ref() + " (parent=" + parent + ", edges=";
			for (edge in edges) s += edge.toString() + " ";
			Console.OUT.println(s);	
		}
	}
	public static def makeRandom(N:Int) {
		val graph = new SparseGraph(N);
		// now add edges
		val plh = graph.myVertices;
		finish for (p in Place.places()) at(p) async {
			val random = new Random();
			val P = Place.MAX_PLACES as Int;
			for (ar in plh()) {
				for (x in 1..3) {
					ar.addEdge(graph.getRef(random.nextInt(P), random.nextInt(N)));
				}
			}
		}
		return graph;                                          
	}
	/**
	 * Return the AgentRef for the vInt'th vertex at place placeId.
	 */
	def getRef(placeId:Int, vInt:Int) = {
		val plh = this.myVertices;
		at(Place(placeId)) plh()(vInt).ref()
	}
	val myVertices:PlaceLocalHandle[ArrayList[V]];
	def this(N:Int) {
	    myVertices = PlaceLocalHandle.make(PlaceGroup.WORLD,
				()=> {
					val a:ArrayList[V] = new ArrayList[V]();
					for (i in 1n..N) a.add(new V(i));
					a
				});
	}
	public def print() {
		val plh = this.myVertices;
		finish for (p in Place.places()) at(p) async {
			for (ar in plh()) ar.print();
		}
	}
	public static def main(Rail[String]) {
		val g = makeRandom(10n);
		val plh = g.myVertices;
		val job :  VJob = new VJob() {
			public def startAgents() = {
			    if (here.id==0) {
				val r = new ArrayList[V]();
				val start = plh()(0);
				start.parent=start.ref();
				r.add(start);
				return r;
			    }
			    return null;
			}                      
			public def shouldRunAgain(phase:Int)=true;
		    };
		g.print();
		Console.OUT.println("Executing job");
		JobRunner.submit(job);
		g.print();
		
	}
	 
}
