package CollectionFrameWork.Map;
import java.util.*;
/* This interface extends the Map interface and provides the ordering of the elements
 * The class that implements this interface is TreeMap
 * This interface provides the ordering of its elements, based on the natural order of its keys.
 * 
 * The main difference between a SortedMap and a regular Map is that the elements in a SortedMap are stored in a sorted order,
 * whereas in a Map the elements are stored in an arbitrary order
*/
public class SortedMapIn {
    public static void main(String[] args) {
        SortedMap<String,Integer>smp1=new TreeMap<>();
        smp1.put("Hello", 1);
        smp1.put("Sanjay", 2);
        smp1.put("Here", 3);
        smp1.put("Excuse me", 4);
        System.out.println("The elements sorted according to the key(String) in the SortedMap smp1 is:\n"+smp1);

        System.out.println("This method used to return the map which is higher(Sorted oeder) than passed element:\n"+smp1.tailMap("Here"));
        System.out.println("This method used to return the map which is lower(Sorted oeder) than passed one:\n"+smp1.headMap("Here"));
        System.out.println("This method returns the first key in the SortedMap: "+smp1.firstKey()+"\nThis method returns last key in the SortedMap: "+smp1.lastKey());
        System.out.println("Thsi method returns the Set elemets which is converted Map's key into Set: "+smp1.keySet());
        System.out.println(smp1.entrySet());
    }
    
}
