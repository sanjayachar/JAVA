package CollectionFrameWork.Collection.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*SortedSet is a sub Interface of the Set interface in the java.util package. 
 * It is designed to represent a set of elements in a sorted order
 * Elements in the SortedSet are arranged based on their natural ordering or a custom Comparator
 * 
 * Set <------(extends) SortedSet<----------(extends) NavigableSet<--------(inmplements) TreeSet
 * 
 * Why SortedSet:
 * ---------------
 * SortedOrder:Unlike a regular Set, SortedSet maintains the sorted ordered element
 * Binary Search operations: A SortedSet provides methods like headSet, tailSet, subSet, first and last
 * 
 * What SortedSet is:
 * -------------------
 * 1)Comparator:If a SortedSet is created with a custom Comparator that comparator defines the order in which elements are sorted.
 * 
 * 2)First and Last:The first() and last() methods return  the first and last elements in the sorted set, respectively
 * 
 * 3)HeadSet, TailSet and SubSet: The Methods headSet(toElement),  tailSet(fromElement) and suSet(fromElement, toElement)
 * returns subsets of the sorted set based on specified boundaries.
 * 
 * Where SortedSet:
 * -----------------
 * If you need a collection that automatically maintains elements elements in a sorted order.
 * If we want efficiently retrieve elements in a specific range or perform binary search operations on the set
 * 
 * All the elements of a SortedSet must implement the Comarable interface and all such elements must be mutually comparable.
 * Mutually comparable simple means that two objects accept each other as the argument to their compareTo method.
 * 
 * Since SortedSet is a interface we can't create an object so the class which implements NavigableSet that implements SortedSet
 * can create object(TreeSet class)
 */

class Helper implements Comparable<Helper>{
    private String name;
    private int age;
    Helper(String name,int age){
        this.name=name;
        this.age=age;
    }Helper(){}
    @Override
    public int compareTo(Helper other){
        return Integer.compare(this.age,other.age);
    }
    @Override
    public String toString(){
        return name+"("+age+")";
    }
}
public class SortedSetIn {
    public static void main(String[] args) {
        SortedSet<String>srt1=new TreeSet<>();
        srt1.add("add1");
        srt1.add("add2");
        srt1.add("srt3");
        srt1.add("srt4");
        srt1.add("srt5");
        System.out.println("The SortedSet using TreeSet object is srt1: "+srt1+"\n");
        System.out.println("Is element srt4 contains in srt1: "+srt1.contains("srt4")+"\n");
        SortedSet<String>srt2=new TreeSet<>();
        srt2.add("add1<srt2>");
        srt2.add("add2<srt2>");
        srt2.add("add3<srt2>");
        srt2.add("add1");
        srt2.add("add2");
        srt2.add("srt3");
        srt2.add("srt4");
        srt2.add("srt5");
        srt2.add("add4<srt2>");
        srt2.add("add4<srt2>");//this won't be added bcz it is duplicate value
        srt2.add("add5<srt2>");
        System.out.println("The SortedSet using TreeSet object is srt2: "+srt2+"\n");
        System.out.println("Is all elements in the srt1 contains in the srt2?: "+srt2.containsAll(srt1));

        /*Below compare method  is used to compare two object to make an order wise elements*/
        SortedSet<Helper>sortedSet=new TreeSet<>();
        sortedSet.add(new Helper("Sanjay", 32));
        sortedSet.add(new Helper("Manju", 23));
        sortedSet.add(new Helper("Kavi", 34));
        System.out.println("Sorted Set natural ordering: "+sortedSet);
        // Collections.sort(sortedSet, new Helper());
        System.out.println("Comparator: "+sortedSet.comparator()+"\n");

        //the first and last methods are used to returns the first and last element
        System.out.println("The first element in the SortedSet srt1 is: "+srt1.first());
        System.out.println("The last element in the SortedSet sortedSetis: "+sortedSet.last());
        System.out.println("Elements previous to the 'add4<srt2>' in the SortedSet srt1 are: "+srt1.headSet("add4<srt2>")+"\n");
        System.out.println("Elements after the 'add1' in the SortedSet srt2 are:\n"+srt2.tailSet("add1"));

        

    }
}
