package x10.util.mrlite;
import x10.util.HashMap;
import x10.util.GrowableRail;
import x10.util.Pair;
import x10.util.ArrayList;

/**
 * A simple multi-place, main-memory MR engine using one activity per place
 * @author vj
 */
public class Engine[K1,V1,K2,V2,K3,V3](job:Job[K1,V1,K2,V2,K3,V3]) {
	static type MyMap[K2,V2] = HashMap[K2,ArrayList[V2]];
	
	static def insert[K2,V2](a:MyMap[K2,V2], k:K2, v:V2) {
		val gr = a.get(k);
		val gr2 = gr==null? new ArrayList[V2](): gr();
		gr2.add(v);
		a.put(k,gr2);
	}
	static def insert[K2,V2](a:MyMap[K2,V2], k:K2, v:ArrayList[V2]) {
		val gr = a.get(k);
		val gr2 = gr==null? new ArrayList[V2](): gr();
		gr2.addAll(v);
		a.put(k,gr2);
	}
	static def mergeInto[K2,V2](a:MyMap[K2,V2], b:MyMap[K2,V2]):void {
		for (k in b.keySet()) insert(a, k, b(k)());
	}
	static class State[K1,V1,K2,V2,K3,V3](job:Job[K1,V1,K2,V2,K3,V3], 
			incoming:Rail[MyMap[K2,V2]]){}
	
	public def run() {
	
		val plh = PlaceLocalHandle.make(PlaceGroup.WORLD,
				():State[K1,V1,K2,V2,K3,V3]=> new State(job, 
						new Rail[MyMap[K2,V2]](Place.MAX_PLACES, (Long)=>new MyMap[K2,V2]())));
		clocked finish for(p in PlaceGroup.WORLD) at (p) clocked async {
			val P = Place.MAX_PLACES;
			val job = plh().job; // local copy
			val incoming = plh().incoming;
			for (var i:Int=0n; ! job.stop(); i++) {
				
				Clock.advanceAll(); // Wait for everyone to finish the last phase
				val results = new Rail[MyMap[K2,V2]](P, (Long) => new MyMap[K2,V2]());
				val mSink = new MapperSink[K2,V2]() {
					public def accept(k:K2,v:V2):void {
						insert(results(job.partition(k) % P), k, v);
					}
				};
				for (kv in job.source()) job.mapper(kv.first, kv.second, mSink);
			
				for (q in PlaceGroup.WORLD) { // Transmit data to all places
					val v = results(q.id);
					at(q) plh().incoming(p.id)=v;
				}
				Clock.advanceAll();
				
				// Now process all the incoming data.
				var j:Long=0n;
				for (; incoming(j)==null && j < P; j++);
				if (j==P) { // received nothing as input
					job.sink(null); continue;
				} 
				val accumulator = incoming(j);
				incoming(j)=null;
				for (; ++j < P;) {
					mergeInto(accumulator, incoming(j));
					incoming(j)=null;
				}
				val output = new ArrayList[Pair[K3,V3]]();
				for (k in accumulator.keySet()) 
					job.reducer(k,accumulator(k)(), output);
				job.sink(output);
			}
		}
	}
}