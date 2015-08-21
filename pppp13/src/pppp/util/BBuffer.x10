package pppp.util;
import x10.compiler.NonEscaping;
import pppp.util.Logger;
public class BBuffer[T](N:Int) {
	protected val data:Rail[T];
	protected var nextVal:Int=0n;
	protected var size:Int=0n;
	protected val monitor = new Monitor();
	protected var name:String;
	
	public def this(N:Int){T haszero}{
		this(N,Zero.get[T]());
	}
	public def this(N:Int, t:T) {
		property(N);
		data = new Rail[T](N, t);
	}
	/**
	 * This is the condition for adding an element. May be overridden in subclasses.
	 */
	protected def hasSpace():Boolean = size < N;
	/**
	 * This is the action for adding an element. May be overridden in subclasses.
	*/
	protected def add(t:T):Unit {
		Logger.debug("Bbuffer: " + this + " assigning at " + nextVal + " size= " + size);
		var nextSlot:Int = nextVal+size;
		if (nextSlot >= N) nextSlot %=N;
		data(nextSlot)=t;
		size++;
		Logger.debug(()=>"BBuffer: " + this + " exiting put. ");
		return Unit();
	}
	@NonEscaping
	final public def setName(s:String) { name=s; }
	public operator this()=(t:T):void{
		Logger.log(()=> t + " ==> " + this);
		monitor.on[Unit](()=> hasSpace(),()=>add(t));
	}
	/**
	 * This is the condition for getting an element. May be overridden in subclasses.
	 */
	protected def hasValue():Boolean = size > 0;
	/**
	 * This is the action for getting an element. May be overridden in subclasses.
	 */
	protected def get():T {
		val result = data(nextVal);
		if (++nextVal >= N) nextVal %= N;
		size--;
		return result;
	}
	public operator this():T = { 
		val t = monitor.on(()=> hasValue(), ()=>get());
		Logger.log(()=> this + " ==> " + t);
		t
	}
	
	protected def awaken() { monitor.awaken(); }
	
	public def toString()="<" +(name == null? typeName() + " #"+hashCode() : name) + " " + size + ">";
}