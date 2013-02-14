/**
 * An implementatin of bounded buffers using atomic blocks.
 * @author vj
 */
class Buffer[T] {
	val data:Rail[T];
	var slots:Int;
	var r:Int=0, w:Int=0;
	val size:Int;
	def this(n:Int, init:T){
		slots=n;
		data = new Rail[T](n, (int)=>init);
		size=n;
	}
	/**
	 * Put the given element in the buffer, waiting until there is an empty slot.
	 */
	def put(t:T):void {
		when (slots > 0) {
			slots--;
			data(w)=t;
			w++;
			if (w==size) w=0;
		}
	}
	/**
	 * Get the next element in the buffer, waiting until there is an element.
	 */
	def get():T {
		var result:T;
		when (slots < size) {
			slots++;
			result=data(r);
			r++;
			if (r==size) r=0;
		}
		return result;
	}
}