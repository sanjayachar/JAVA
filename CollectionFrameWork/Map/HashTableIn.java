package CollectionFrameWork.Map;
/*HashTable is a class which implementations of a hash table data structure which allow us to manage key-value pair values
 * 
 * Why:
 * -------------
 * The main purpose of the HashTable is to provide data structure that maps keys to their corresponding
 * values, allowing for fast retrieval and storage of data
 * It is commonly used when we need a thread-safe collection that enforces unique keys and don't want to allow null keys or values
 * 
 * HashTable vs HashMap:
 * ----------------------
 * 1)Thread safe: HashTable is synchronized and is considered thread-safe and it used in multi threaded envi
 * Whereas HashMap isn't thread safe to do that we need external synchronization
 * 
 * 2)Null values/keys: HashTable doesn't allow null value if we do so it will rise NullPointerException
 * whereas HashMap allows
 * 
 * 3)Performance: Due to synchronization HashTable might have lower performance in multithreaded envi
 * however HashMap is single threaded envi the performance is negligible.
 * 
 * Where:
 * ------------------
 * We need when the multi threaded environment  and if we don't want to handle external synchronization for thread safe
 * If we need to ensure neither keys nor values can be null
 * 
 * since it is older one for current HashMap(external synchronization) and ConcurrentHashMap commonly used in multiThreaded environment
 */
public class HashTableIn {
    
}
