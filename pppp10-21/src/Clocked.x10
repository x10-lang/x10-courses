class Clocked[T] implements ()=>T{
	var v:T;
	val name:String;
	def this(x:T) {
		this(x,"");
	}
	def this(x:T, s:String) { 
		this.v=x; 
		this.name=s;}
	public def apply()=v;
	public def set(x:T) {
		next; // wait for readers to finish, so you are clear to write
		v=x;  // write
		next; // wait for others to write, so u are clear to read
	}
	public def toString() =name;
}