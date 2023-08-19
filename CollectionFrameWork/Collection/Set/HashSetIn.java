package CollectionFrameWork.Collection.Set;
import java.util.*;
/*HashSet is a class implements the Set interface, backed by Hash table whcih actually a HashMap instance 
 * 
 * Characteristics:
 * -----------------
 * Unordered collection:There is no guaranteed order, and values are stored based on their hashcodes
 * No Duplicates:It won't be added if we try to add duplicate element 
 * Efficient Lookup:HashSet provides constant time performance for basic operations such as add, remove, and contains
 * 
 * HashSet vs LinkedHashSet:
 * --------------------------
 * HashSet maintains order but LinkedHashSet doesn't
 * 
 * HashSet vs TreeSet:
 * -------------------
 * HashSet is implemented using hash table, while TreeSet uses a Red-Black tree data structure
 * As a result HasSet provides faster average time complexity for basic operation like add, remove, and contains
 * compare to TreeSet
 * 
 * HashSet vs EnumSet:
 * ---------------------
 * EnumSet is a specialized implementation of Set using enums
 * 
 * HashSet vs ConcurrentSkipListSet:
 * --------------------------------------
 * ConcurrentSkipListSet is implemented based on the skip list and it is thread safe
 * Where as HashSet is not thread safe
*/
public class HashSetIn {
    public static void main(String[] args) {
        Set<Integer>hs1=new HashSet<>();
        //Add element to the set
        hs1.add(10);
        hs1.add(20);
        hs1.add(30);
        hs1.add(40);
        hs1.add(50);

        //Display the set
        System.out.println("HashSet hs1: "+hs1+"\n");

        System.out.println("Size of HashSet: "+hs1.size()+"\n");

        System.out.println("Is the Set is empty?: "+hs1.isEmpty()+"\n");

        System.out.println("does element 30 is in the Set: "+hs1.contains(30)+"\n");

        Set<String>hs2=new HashSet<>();
        hs2.add("Welcome");
        hs2.add("to");
        hs2.add("My");
        hs2.add("Java");
        hs2.add("Collection");
        hs2.add("Set interface");

        System.out.println(hs2.remove(""));

        Set<Integer>hs3=new HashSet<>();
        //Add element to the set
        hs3.add(10);
        hs3.add(40);
        hs3.add(50);

        System.out.println("Is the Set hs1 contains all of the element inside the Ste hs3?: "+hs1.containsAll(hs3)+"\n");

        hs2.remove("to");
        System.out.println("Set after removing the elemet 'to': "+hs2+"\n");

        hs1.removeAll(hs3);
        System.out.println("Set hs1 after removing all the element in Set hs3: "+hs1);

        hs1.clear();
        hs2.clear();
        hs3.clear();
        System.out.println("Sets after clearing the values\n"+"hs1: "+hs1+"\nhs2: "+hs2+"\nhs3: "+hs3);


        
    }
}
