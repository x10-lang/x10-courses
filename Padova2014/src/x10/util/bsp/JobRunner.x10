package x10.util.bsp;

import x10.util.ArrayList;
import x10.util.Team;
import x10.util.List;

/**
   The execution engine for a Job[S,T].
   
 */
public class JobRunner[S,T](job:Job[S,T]){T <: Agent[S, T]} {
    val activeAgents  = [new ArrayList[T]() as List[T], new ArrayList[T]()];
    public def activate(a:T, phase:Int) {activeAgents((phase+1)%2).add(a);}
    public def hasNoActiveAgents(phase:Int):Boolean = activeAgents(phase%2).isEmpty();
    static val AND = new Reducible[Boolean]() {
        public def zero()=true;
        public operator this(a:Boolean, b:Boolean)=a&&b;
    };
    
    public static def say(s:String, phase:Int){
    	Console.OUT.println("[" + here + "," + phase + "]" + s);
    }
    /**
     * Run the supplied job until globally there are no active agents, or 
     * job.shouldRunAgain(phase) returns false. The initial set of active
     * agents is taken from job.startAgents().
     * 
     */
    public static def submit[S,T](job:Job[S,T]){T<: Agent[S,T]} {
        val jobRunners = PlaceLocalHandle.make[JobRunner[S,T]](PlaceGroup.WORLD, 
        		()=>new JobRunner[S, T](job));
        finish
            for (p in PlaceGroup.WORLD)
                at (p) async {
                    val this_ = jobRunners(); // the local JobRunner
                    var phase:Int=0n;
                    var agents:List[T] = this_.job.startAgents();
                    do {
                    	//say("Running " + agents, phase);
                    	if (agents != null)
                    		for (agent in agents) agent.run(phase, jobRunners);
                        agents.clear();
                        Team.WORLD.barrier();
                        phase++;
                        val thisPhase = phase;
                        // could also reduce a dist array in a global operation,
                        // with a single global evaluation and broadcast. 
                        // This is simpler to write.
                        val noActive:Boolean = finish (AND) {
                            for (place in Place.places()) 
                                at (place) 
                                    async 
                                    offer jobRunners().hasNoActiveAgents(thisPhase);
                        };
                        if (noActive) break; // Globally, no agents are active.
                        agents = this_.activeAgents(phase%2);
                    } while (this_.job.shouldRunAgain(phase));
                } // async, at, for, finish
    }
}
