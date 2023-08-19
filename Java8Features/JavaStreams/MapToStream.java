package Java8Features.JavaStreams;
import java.util.*;
import java.util.stream.*;
public class MapToStream {
    public static void main(String[] args) {
        /*1)Using Map.entrySet() method we can convert Map to Stream
         * Map.entrySet() method returns a Set view of the mapping contained in this map.
         * 1)Get the Map<Key,Value>.
         * 2)Convert Map<Key,Value>into Set<Key>using Map.entrySet() method.
         * 3)convert the obtained Set into Stream using Set.stream()
         * 4)Return/Print the Stream of Map.
         */
        Map<Integer,String>map=new HashMap<>();
        map.put(1, "Sanjay");map.put(2,"Manju");map.put(3, "Kavi");
        System.out.println("Map: "+map);

       /*Converting Map to Stream of Map.Entry */
        Stream<Map.Entry<Integer,String>>entryStream=map.entrySet().stream();

        /*After converting to Stream we can perform various operation */
        entryStream.forEach(entry->System.out.println(entry.getKey()+": "+entry.getValue()));

        /*Converting only value */
        Stream<String>valueStream=map.values().stream();
        System.out.println("Only value Stream in the Map: "+Arrays.toString(valueStream.toArray()));

        /*Converting only keys */
        Stream<Integer>keyStream=map.keySet().stream();
        System.out.println("Only key stream in the Map: "+Arrays.toString(keyStream.toArray()));

    }
}
