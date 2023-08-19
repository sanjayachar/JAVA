package CollectionFrameWork.Collection.Set;
import java.util.TreeSet;
/*TreeSet is the most important class which implements the NavigableSet interface  which is uses the Tree for storage 
 * 
 * Why TreeSet:
 * --------------------
 * 1)Sorted order
 * 2)Unique Elements
 * 3)Efficient operations
 * 
 * What is TreeSet:
 * -----------------
 * TreeSet is a implemenation of the NavigableSet interface.
 * And it is a balanced binary search tree each elements are arranged based on their natural ordering or the order
 * using custom Comparator.
 * 
 Where TreeSet:
 ----------------
 Used when we want the elements based on their natural ordering or a custom Comparator
 If we want efficient operation to maintain the sorted order
 If we don't require constant time access by index(unlike ArrayList or LinkedList)
*/
public class TreeSetIn {

    public static void main(String[] args) {
        // Create a TreeSet to store integers in natural order
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(10);

        // Print the TreeSet (elements will be in ascending order)
        System.out.println("TreeSet (Natural Ordering): " + treeSet);

        // Create a TreeSet with a custom Comparator (in reverse order)
        TreeSet<Integer> treeSetWithComparator = new TreeSet<>((a, b) -> b - a);

        // Add elements to the TreeSet with custom Comparator
        treeSetWithComparator.add(5);
        treeSetWithComparator.add(2);
        treeSetWithComparator.add(8);
        treeSetWithComparator.add(1);
        treeSetWithComparator.add(10);

        // Print the TreeSet with custom Comparator (elements will be in descending order)
        System.out.println("TreeSet (Custom Comparator): " + treeSetWithComparator);
    }
}
