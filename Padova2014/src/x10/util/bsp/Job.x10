package x10.util.bsp;
import x10.util.List;


/**
 * A specification of a BSP job. A Job is submitted to the JobRunner
 * through JobRunner.submit(Job). This will cause the Job object to be 
 * copied to each place in the system. The methods below will be called
 * by a JobRunner object at place P on the copy of the Job object at place
 * P. The user should implement a Job so that it uses GlobalRef's or 
 * PlaceLocalHandle's to ensure that the responses of all these Job
 * objects are consistent.
 * 
 * @author vj
 */

public interface Job[S, T]{T <: Agent[S, T]} {
	
	/**
	 * The list of active agents at each place. The list returned by 
	 * the Job object copy at place P should contain only Agents at place
	 * p. Hence any implementation of Job should typically use a GlobalRef
	 * or a PlaceLocalHandle to access state local to place P.
	 */
	def startAgents():List[T];
	
	/**
	 * The ensemble of JobRunner's will terminate if globally no
	 * active agents are left, or if the job object's shouldRunAgain()
	 * returns false. It is the user's responsibility to ensure that 
	 * invocations of shouldRunAgain() should return the same value
	 * at all places (for the same phase). 
	 * @param phase -- should the engine run this phase?
	 */
	def shouldRunAgain(phase:Int):Boolean;
}