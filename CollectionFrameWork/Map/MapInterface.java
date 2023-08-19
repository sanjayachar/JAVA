package CollectionFrameWork.Map;
import java.util.*;

/*Map interface is sub interface of Collections
 * Maps are perfect to use for key-value association mapping such as dictionaries
 * It represents the collection of key-value pairs and is designed to store, retrive, and manipulate data
 * based on keys.
 * 
 * Why:
 * -----
 * Map is useful when you need to store and retrieve data based on unique keys
 * Common use cases for Map:
 * 
 * Dictionary: You can use Map to implement a dictionary, where the words are stored as keys, and their
 * meanings or definitions are stored as values.
 * 
 * Caching: Maps can be used for caching frequently accessed data, where the key represents the input or contex,
 * and the value rpresents the result or compuyed data.
 * 
 * Counting occurences:  We can use the Map to count occurrences of elements in a collection
 * with element as a key and count as a values
 * 
 * Data organization: When we need to organize data based on some unique identifier, Map provides a convenient way
 * to do so.
 * What:
 * -----------
 * Storing the key-value pair of elements
 * 
 * Where to use:
 * ---------------
 * Dictionary, Caching, Counting occurences, Data organization
 * And we are using this map concept in data base to store the key(primary key, unique key, foreign key) and value(attributes)
 * 
 * Characteristics of a Map interface
 * -----------------------------------
 * 1)Map can't contain duplicate keys and each key can map to at most one value. Some implementaion allow nul key and null
 * values like the HashMap and LinkedHashMap, but some do not like the TreeMap
 * 2)The order of a map depends on the specific implementatons TreeMap and LinkedHashMap have predectable orders, while 
 * HashMap doesn't
 */
public class MapInterface {
    public static void main(String[] args) {
        Map<Integer,String>mp1=new HashMap<Integer,String>();
        //to insert the data we use put method
        mp1.put(10, "Sanjay");
        mp1.put(10, "manju");//It will print 10=manju bcz key was updated and map won't take the duplicate value
        mp1.put(20, "Kavi");
        mp1.put(30, "Guru");
        mp1.put(40, "Sandy");
        System.out.println("Map mp1 having duplicate key: "+mp1);

        Map<Integer,String>mp2=new HashMap<Integer,String>();
        mp2.put(10, "Kavi");
        mp2.put(20, "Guru");
        mp2.put(30, "Sandy");
        mp2.put(40, "Sandy");//Value may change it will print both 30 and 40 key's value Sandy
        System.out.println("Map mp2 having duplicate value: "+mp2+"\n");

        //ContainsKey  ContainsValuereturns true if passed key or value is present
        System.out.println("Is key 10 present in Map mp2: "+mp2.containsKey(10)+"\nIs value Sandy present in Map m2: "+mp2.containsValue("Sandy")+"\n");
        
        /*entrySet method is used to create a set out of the same elements contained in the map
         * It basically returns a set view of the map or we can create new set and store the map elements into them
         */
        Set st=mp2.entrySet();
        System.out.println("Set st after converting map to set: "+st);
        System.out.println("Retriving the Map into Set using entryMap method: "+mp1.entrySet()+"\n");
        
        /*keySet is used to return a Set view of keys */
        Set<Integer>st2=mp1.keySet();
        System.out.println("Set st2 after converting the map key value to set: "+st2+"\n");

        /*putAll method is used to copy all the elements from on map to another */
        Map<Integer,String>mp3=new HashMap<>();
        mp3.put(50, "Kavi");
        mp3.put(60, "Guru");
        mp3.put(70, "Sandy");
        mp3.put(80, "Sandy");
        mp3.putAll(mp2);
        System.out.println("After copying all element in the mp2 to mp3, mp3 will become: \n"+mp3);




    }
    
}
