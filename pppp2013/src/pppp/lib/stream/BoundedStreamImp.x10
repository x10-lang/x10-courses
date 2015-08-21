package pppp.lib.stream;

import pppp.util.BBuffer;
import pppp.util.Logger;
import pppp.util.Unit;

/**
 * A stream that uses a bounded buffer implementation. 
 */
public class BoundedStreamImp[T] extends BBuffer[T] implements Spring[T]{
	public static val DEFAULT_SIZE=200n;
	protected var closed:Boolean=false;
	public def this(){T haszero}{ this(null, DEFAULT_SIZE,Zero.get[T]());}
	public def this(s:String){T haszero}{ 
		this(s, DEFAULT_SIZE,Zero.get[T]());
	}
	public def this(s:String, N:Int, zero:T) { 
		super(N,zero);
		this.setName(s);
	}
	
	/**
	 * Close this stream,. No further puts will be permitted. Values
	 * currently in the stream will be permitted to be drained.
	 */
	public def close():void { 
		Logger.log(()=> "closing " + this);
		// schedule an atomic block so this action is ordered
		// with other actions on this Spring.
		monitor.atomicBlock(()=>{closed=true; Unit()});
	}
	
	public def isOpen():Boolean = ! (closed && size==0n);

	protected def hasSpace():Boolean {
		// override to check if the stream is closed.
		if (closed) throw new StreamClosedException(this); 
		return super.hasSpace();
	}
	protected def hasValue():Boolean {
		// override to check if the stream is closed.
		if (! isOpen()) throw new StreamClosedException(this);
		return super.hasValue();
	}
	
}