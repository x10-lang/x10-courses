package x10.util.mrlite.example;
import x10.util.mrlite.Job;
import x10.util.Pair;
import x10.util.ArrayList;
import x10.util.mrlite.Engine;
import x10.util.mrlite.MapperSink;

public class Histogram(plh:PlaceLocalHandle[Rail[Long]]) 
   implements Job[Long,Long,Long,Long,Long,Long] {
	var i:Long=0;
	public def stop():Boolean=i++ > 0;
	
	public def source()= new Iterable[Pair[Long,Long]]() {
		public def iterator() = new Iterator[Pair[Long,Long]]() {
			val data = plh();
			var i:Long=0;
			public def hasNext() = i < data.size;
			public def next() = Pair[Long,Long](0,data(i++));
		};
	};
	public def partition(k:Long)=k % Place.MAX_PLACES;
	
	public def sink(s:Iterable[Pair[Long, Long]]):
		void {
		for (kv in s) Console.OUT.println(here + ":" + kv);
	}
	
	public def mapper(k:Long, v:Long, s:MapperSink[Long,Long]):void {
		s.accept(v,1);
	}

	public def reducer(a:Long, b:Iterable[Long], sink:ArrayList[Pair[Long, Long]]):
		void {
		var sum:Long=0L; for (x in b) sum += x;
		sink.add(Pair(a as Long, sum));
	}
	
	public static def main(Rail[String]) {
		val h=new Histogram(PlaceLocalHandle.make(PlaceGroup.WORLD, 
				():Rail[Long] => new Rail[Long](10, (i:Long)=> i)));
		new Engine(h).run();
		Console.OUT.println("...done.");
	}

}