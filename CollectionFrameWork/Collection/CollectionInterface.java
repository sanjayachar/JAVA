package CollectionFrameWork.Collection;
import java.util.*;

/*Collection interface is a part of or member of Collection framework and it is a child interface of iterable interface
 * This interace has three subinterface List, Queue and Set.
 */
public class CollectionInterface {
    public static void main(String[] args) {
        Collection<String>list=new LinkedList<String>();
        list.add("Sanjay");
        list.add("B");
        list.add("N");

        System.out.println("The list is: "+list);

        //checking the content is in the Collection or not if contains it will returns true
        System.out.println(list.contains("Sanjay")); 
        System.out.println(list.containsAll(list));
        //Iterator
        Iterator<String>it=list.iterator();
        while(it.hasNext())
        System.out.println(it.next());

        //removing elements
        list.remove("B");
        System.out.println(list);
        
        //to remove multiple elements
        Collection<String>list2=new LinkedList<String>();
        list2.add("B");
        list2.add("N");
        list.removeAll(list2);
        System.out.println(list);

        
    }
    
}
