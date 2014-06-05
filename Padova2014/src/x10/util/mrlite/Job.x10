package x10.util.mrlite;
public interface Job[K1,V1,K2,V2,K3,V3] extends 
    DataSource[K1,V1], 
    DataSink[K3,V3], 
    Mapper[K1,V1,K2,V2], 
    Reducer[K2,V2,K3,V3]
{
	/**
	 * Return the partition to which the key belongs
	 */
	def partition(k:K2):Long;
	/**
	 * Return true if the job should terminate.
	 */
	def stop():Boolean;
}