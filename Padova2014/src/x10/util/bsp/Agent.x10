package x10.util.bsp;
import x10.util.List;
import x10.util.ArrayList;
/**
 * A computation consists of one or more Agents, scattered across multiple
 * places. Agents use global references to reference each other, hence any 
 * Agent is capable of referencing any other Agent in any place.
 * 
 * <p> Agents are executed by a JobRunner. There is an instance of JobRunner in
 * each place. The JobRunners work together in phases, starting with phase 0.
 * Computation is initiated by calling JobRunner.submit(job) at place 0.
 * A JobRunner takes a Job as input -- this specifies the initial
 * list of active agents at each place, and a method that will tell the engine
 * when the iteration should stop.
 * 
 * An Agent may receive zero or more messages in a phase. If an Agent a receives
 * one or more messages in a phase, the engine will call a.run(m,phase) in the 
 * next phase, with m the list of all messages received in the previous phase. 
 * 
 * <p> Users should subclass to add additional state (fields) and to override 
 * run(List[Any],Int). The body of this method will typically update the state 
 * of this agent and send zero or more messages to other Agents whose 
 * references it contains in its local state.
 * 
 * <p> An agent is located at a place, and the set of agents is scattered across
 * all places in the computation. However, this is transparent to user code
 * which simply calls r.accept(m,p) to 
 * <p> An agent is permitted to create new agents, and send its ref in messages
 * to other agents (at this or any other place).
 * 
 * <p> S is the type of messages accepted by the agent, and T is the type of
 * the Agent (that accepts messages of type S).
 * @author vj
 */
public class Agent[S, T]{T <: Agent[S, T]} {
	
    var ref:AgentRef[S, T]=null;
    /**
     * The global ref for this agent.
     */
    public def ref():AgentRef[S, T] {
    	if (ref == null) ref = new AgentRef[S, T](GlobalRef(this as T));
    	return ref;
    }
    
	protected val messages =[new ArrayList[S](), new ArrayList[S]()];
	private var activate:Boolean=true;
	
	/**
	 * Accept a message in given phase. Will be processed in the next phase.
	 * TODO: Accept messages to be processed in phase now+k, for k >= 1.
	 */
	public final def accept(m:S, phase:Int, runner:PLHJ[S,T]):Unit {
		messages((phase+1)%2).add(m); // add in the next phase
		if (activate) {
			runner().activate(this as T, phase);
			activate=false;
		}
		return Unit();
	}
	
	/**
	 * Run this agent in this phase. Called by the engine precisely on those
	 * agents which received a message in the last phase.
	 */
	public final def run(phase:Int, runner:PLHJ[S, T]) {
		activate=true;
		val m = messages(phase%2);
		run(m, phase, runner);
		m.clear();
	}
	/**
	 * Workhorse for the agent. Specifies the code that should run
	 * given all incoming messages for this phase.
	 * Typicaly this agent will have AgentRef's for other agents, and  
	 * in the body of this method it may call r.accept(message,phase) on 
	 * some of those refs r.
	 * Note: the phase passed into the accept call must be the phase
	 * passed into this method.
	 */
	protected def run(m:List[S], phase:Int, runner:PLHJ[S, T]) {
		// default is to do nothing.
	}
}