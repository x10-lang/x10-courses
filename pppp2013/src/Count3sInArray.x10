import x10.util.Random;

/**   
 *  Counts 3's in an array.
 */  

public class Count3sInArray {
	static val Meg = 1000n*1000n;
	static val indent = "\t";
	
	val size:Int;
	val pctThrees:Double;
	val numAsyncs:Int;
	var a:Rail[Int]; 
	var count: Int = 0n;
	var expectedCount:Int=0n;
	var countTime: Long=0L;
	var populateTime: Long=0L;
	
	/**   
	 *  Default constructor 
	 */  
	public def this(size:Int, numAsyncs:Int, pctThrees:Double) {
		assert numAsyncs >= 1n;
		this.size=size;
		this.numAsyncs = numAsyncs;
		this.a = new Rail[Int](size, 0n);
		this.pctThrees = pctThrees;
	}
	
	public def run() {
		populate();
		
		// print out array before running
		/*
		 * val a_=this.a;
		 * Console.OUT.print(indent + "[ ");
		 * for ((i) in 0..size-1) {
		 * Console.OUT.print(a_(i) + " ");
		 * }
		 * Console.OUT.println("]");
		 */
		val time = System.nanoTime();
		count = 0n;
		if (numAsyncs == 1n) {
			this.count = count3s();
		} else 
                    finish for (i in 0n..(numAsyncs-1n)) async {
				val mc = count3s(i);
				atomic this.count += mc;
			}
		countTime += (System.nanoTime() - time)/Meg;
	}    
	
	public def runB() {
		populate();
		
		val time = System.nanoTime();
		count = 0n;
		if (numAsyncs == 1n) {
			this.count = count3s();
		} else {
		}
		countTime += (System.nanoTime() - time)/Meg;
	}    
	
	
	public def count3s(id:Int) {
		val chunkSize = size/numAsyncs;
		val start = chunkSize*id;
		// adjust final endpoint to account for size not being a mulitple of numAsyncs.
		val end = (id == numAsyncs-1n) ? size-1n : start + chunkSize - 1n;
		atomic Console.OUT.println(indent + "[task " + id + " counting from " + start + " to " + end + "]");
		var privateCount:Int=0n;
		val a_=this.a;
		for (var i:Int=start; i <=end ; i++)
			if(a_(i) == 3n)
				privateCount++;
		
		return privateCount;
	}
	
	public def count3s():Int {
		val start = 0n;
		val end = size-1n;
		var privateCount:Int=0n;
		val a_=this.a;
		for (var i:Int=start; i <=end ; i++)
			if(a_(i) == 3n)
				privateCount++;
		return privateCount;
	}
	
	public def populate()
	{
		val time = System.nanoTime();
		val r = new Random();
		expectedCount=0n;
		val target = (a.size*pctThrees) as Int;
		Console.OUT.println(indent + "[target="+target+"]");
		// This loop messes up the cache and causes
		// countTime to increase about 40%.
		val a_=this.a;
		for (i in 0n..(a.size-1n)) a_(i)=0n;
		for (var i:Int=1n; i <= target; i++) {
			val index = r.nextInt(a_.size as Int);
			if (a_(index)!= 3n) { // already assigned, skip
				a_(index) = 3n; 
				expectedCount++;
			}
		}
		populateTime += (System.nanoTime() -time)/Meg;
	}
	
	public def validate() {
		Console.OUT.println(indent + "[expectedCount="+expectedCount+"]");
		Console.OUT.println(indent + "[count="+count+"]");
		if (expectedCount != count)
			Console.OUT.println(indent + "Error: expected " + expectedCount + ", obtained " + count + ".");
	}
	public def populateTime()=populateTime;
	public def countTime()=countTime;
	
	public def reset() {
		populateTime=0n;
		countTime=0n;
		count=0n;
		expectedCount=0n;
	}
	/**   
	 *  Main method 
	 */  
	public static def main(args:Rail[String]): void {
		if (args.size < 3n) {
			Console.OUT.println("Usage: Count3sInArray <Nmod4: size is 4*Nmod4> <NumAsync:Int> <PctThrees:Double>");
			return;
		}
		val Nmod4 = Int.parseInt(args(0n));
		val size  = Nmod4 * 4n;
		val numAsyncs = Int.parseInt(args(1n));
		val pctThrees = Double.parseDouble(args(2n));
		Console.OUT.println("[size=" + size + "]");
		Console.OUT.println("[numAsyncs=" + numAsyncs + "]");
		Console.OUT.println("[pctThrees=" + pctThrees + "]");
		val numInvoke = 5n; // number of repetitions
		var createTime:Long= -System.nanoTime();
		val counter = new Count3sInArray(size, numAsyncs, pctThrees);
		createTime += System.nanoTime();
		createTime /= Meg;
		//warmup
		Console.OUT.println("[Warming up]");
		counter.run();
		Console.OUT.println(indent + "[Done, creation time=" + createTime + " time=" + counter.populateTime() + " + " + counter.countTime() + "].");
		counter.validate();
		counter.reset();
		
		// now run the trial
		Console.OUT.println("[Running]");
		for(i in 1n..numInvoke) {
			Console.OUT.println("[Trial #" + i + "]");
			counter.run();
			counter.validate();
		}
		Console.OUT.println("[Done. Over " + numInvoke + " trials, average time" 
				+ " to populate is  " + counter.populateTime()/numInvoke
				+ " and to count is " + counter.countTime()/numInvoke
				+ ".]");
	}
	
}
