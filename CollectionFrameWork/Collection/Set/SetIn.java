package CollectionFrameWork.Collection.Set;
import java.util.HashSet;
import java.util.Set;
/*The Set is an interface which is subinterface of Collections 
 * 
 * Key characteristics:
 * ---------------------
 * No duplicates elements:If we want to add duplicate value then set will remians unchange means it won't add
 * Unorderd Collection:A set does not maintain the order of elements in whcih they were inserted
 * 
 * Set vs List:
 * -------------------
 * The main difference is that Set doesn't allow duplicate value while a List does
 * A List maintains the order of elements, while Set doesn't have a specific order
 * 
 * Set vs Map:
 * --------------
 * A Set is a collection of unique elements, whereas a Map is a collection of key value pair
 * 
 * Set vs Queue:
 * ------------------
 * A Set doesn't maintain  specific order but Queue follows the FIFO(First In First Out)
 */
public class SetIn {
    public static void main(String[] args) {
          Set<Integer> mySet = new HashSet<>();

        // Adding elements to the set
        mySet.add(10);
        mySet.add(20);
        mySet.add(30);
        mySet.add(40);
        mySet.add(50);
        mySet.add(60);

        System.out.println("Initial Set: " + mySet+"\n");

        // Size of the set
        System.out.println("Size of the Set: " + mySet.size()+"\n");

         // Check if the set is empty
         System.out.println("Is the Set empty? " + mySet.isEmpty()+"\n");

         // Check if an element exists in the set
         int searchElement = 30;
         System.out.println("Does " + searchElement + " exist in the Set? " + mySet.contains(searchElement)+"\n");
 
         // Removing an element from the set
         int removeElement = 40;
         mySet.remove(removeElement);
         System.out.println("Set after removing " + removeElement + ": " + mySet+"\n");
 
         // Clear the entire set
         mySet.clear();
         System.out.println("Set after clearing all elements: " + mySet+"\n");
    }
}
