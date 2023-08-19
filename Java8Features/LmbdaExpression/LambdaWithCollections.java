package Java8Features.LmbdaExpression;

import java.util.ArrayList;
import java.util.*;

/*Lambda expression with Collections for sorting the collections like ArrayList,TreeSet,TreeMap etc
 * Sorting Collections with Comparator: we can use Comparator interface to sort, It inly contains one
 * abstract method:-compare()
 * An interface that only contains one abstract method is called Functional Interface.
 * 
 * We can use 2 method to sort the collections:
 * 1)Use of Comparator()
 * 2)Prototype of compare() method
 */
public class LambdaWithCollections {
    public static void main(String[] args) {
        /*Sorting the ArrayList */
        ArrayList<Integer>al=new ArrayList<>();
        al.add(205);
        al.add(102);
        al.add(98);
        al.add(275);
        al.add(203);

        System.out.println("Element of the ArrayList before sorting: "+al);

        /*Using lambda expression in place of comparator object */
        Collections.sort(al,(o1,o2)->(o1<o2)?-1:(o1>o2)?1:0);

        System.out.println("Elements of the ArrayList after sorting: "+al+"\n");

        /*Sorting the TreeSet */
        TreeSet<Integer> set=new TreeSet<>((o1,o2)->(o1<o2)?-1:(o1>o2)?1:0);
        set.add(850);set.add(235);set.add(1080);set.add(15);set.add(5);
        System.out.println("Elements of the TreeSet after sorting are: "+set+"\n");

        /*Sorting the TreeMap */
        TreeMap<Integer,String>map=new TreeMap<>((o1,o2)->(o1<o2)?-1:(o1>o2)?1:0);
        map.put(1, "Sanjay");map.put(4,"Kavi");map.put(5,"Manju");map.put(2,"Guru");map.put(3, "Sandy");

        System.out.println("Elements of the TreeMap after sorting are: "+map);
    }
    
}
