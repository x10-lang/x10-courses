package x10.util.mrlite;

/**
 * A Job provides all the user-supplied code needed by the engine to execute
 * a map shuffle reduce job. 
 * 
 * The Job object will be serialized across all places and used in each place.
 * If it needs to access distributed data-structures it must use PlaceLocalHandle
 * or GlobalRef appropriately to ensure that these data-structures can be accessed
 * from any place.
 * 
 */
public interface Job[K1,V1,K2,V2,K3,V3] extends 
    DataSource[K1,V1], 
    DataSink[K3,V3], 
    Mapper[K1,V1,K2,V2], 
    Reducer[K2,V2,K3,V3]
{
	/**
	 * Return the partition to which the key belongs. 
	 */
	def partition(k:K2):Long;
	
	/**
	 * Return true if the job should terminate. Called after all engines at 
	 * all places have finished the reduce cycle. 
	 */
	def stop():Boolean;
}