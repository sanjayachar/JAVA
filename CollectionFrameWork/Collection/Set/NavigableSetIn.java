package CollectionFrameWork.Collection.Set;

import java.util.NavigableSet;
import java.util.TreeSet;
import java.io.Serializable;
import java.util.Iterator;
/*It is an interface which extends the SortedSet interface in the java collection framework.
 * It behaves like SortedSet with that we have navigation methods available in addition to the sorting mechanisms of the
 * SortedSet
 * 
 * For example, the NavigableSet interface can navigate the set in reverse order compared to the order defined in SortedSet
 * 
 * The classes that implements this interface are, TreeSet and ConcurrentSkipListSet.
 */
public class NavigableSetIn implements Serializable{
    public static void main(String[] args) {
        NavigableSet<Double>nb1=new TreeSet<>();
        nb1.add(10.2);
        nb1.add(20.3);
        nb1.add(30.4);
        nb1.add(40.6);
        nb1.add(50.8);

        /*ceiling method will return the least element in this set greater than or equal the given element, or null
         * if there is no such element
        */
        System.out.println("The least number greater than or equal to 50.0 is?: "+nb1.ceiling(50.0));//output is 50.8

        /*Decending iterator method is used to retusn the elements in decending order */
        Iterator<Double> itr=nb1.descendingIterator();
        System.out.println(itr);
        System.out.println("Values ofter calling descendingIterator method is: ");
        while(itr.hasNext())
            System.out.println("Value: "+itr.next());
        
    /*descendingSet method is used to reverse the SortedSet and
     * If any changes happens to the original set then it will reflects to the descendingSet collections
    */
    NavigableSet<Double>nb2=nb1.descendingSet();
    System.out.println("Original nb1: "+nb1);
    System.out.println("Reverse of nb1 is nb2 using descendingSet methd: "+nb2+"\n");
    nb1.remove(30.4);
    nb1.add(60.9);
    System.out.println("Updating the nb1 set: "+nb1);
    System.out.println("Updation of the set nb1 reflects to the set nb2: "+nb2+"\n");

    /*floor method is same as ceiling which returns the value greater than or equal */
    System.out.println("Greatest element less than or equal to the 50.9 value is: "+nb1.floor(50.9)+"\n");

    //headerSet method is used to return the portion of the elements are less than mentioned one

    System.out.println("The values previous to the 10.9(20.3) or equals are: "+nb1.headSet(10.9));
    System.out.println("The values after to the 40.7(50.8) or equals are: "+nb1.tailSet(40.7)+"\n");

    //higher and lowe methods are used to returns the strictly higher or lower elements
    System.out.println("The element higher than 20.2 in the set is: "+nb1.higher(20.2));
    System.out.println("The element lower than 50.7 in the set is: "+nb1.lower(50.7)+"\n");

    Iterator<Double>itr3=nb2.iterator();
    while(itr3.hasNext())
        System.out.println("after calling Iterator iterator()method: "+itr3.next());
    System.out.println();

    //pollFirst method removes the first elemnt in the set vice versa for the pollLast
    nb2.pollFirst();
    System.out.println("When we remove the first element using pollFirst method in the set: "+nb2);
    nb2.pollLast();
    System.out.println("When we remove the last element using pollLast methof in the set: "+nb2+"\n");
    System.out.println("The subset from 20.2 to 60.8 value of the nb1: "+nb1.subSet(20.2, 60.8));

    }
    
}
