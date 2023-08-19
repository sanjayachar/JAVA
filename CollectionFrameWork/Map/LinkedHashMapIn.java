package CollectionFrameWork.Map;

import java.util.LinkedHashMap;

/*LinkedHashMap is just like HashMap, and it is also extends the HashMap class
 * and maintains a predictable iteration order based on the order of insertion
 * 
 * HashMap class doesn't guarantee any specific order(Unorder)
 * But LinkedHashMap provide collection of ordered key-value pair
 */
public class LinkedHashMapIn {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>lmp=new LinkedHashMap<>();
        lmp.put(1, "Apple");
        lmp.put(2, "Banana");
        lmp.put(3, "Orange");
        lmp.put(4, "Grapes");
        System.out.println(lmp);
    }
}
