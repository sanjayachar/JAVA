package CollectionFrameWork.Collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

/*LinkedHashSet is another class in the java collection framework and also implements the Set interface
 * It is vary similar to HashSet
 * but LinkedHashSet will contains the element in the ordered way whereas HashSet doesn't
 * 
 * Characteristics:
 * Maintains ordered data while inserting
 * No duplicates
 * HashTable with Linked List: It implements the combination of doublly-linked list data structure and hash tables
 * 
 * LinkedHashSet vs TreeSet: LinkedHashSet uses insertion order, while TreeSetuses natural ordering
 * LinkedHashSet vs EnumSet: EnumSet uses only enum but LinkedHashSet uses all type of object
 * LinkedHashSet vs ConcurrentSkipListSet: ConcurrentSkipListSet is thread safe(we can use this Set class in multiple thread
 * ) where as LinkedHashSet is thread unsafe(we can use this in single thread operation)
 */
public class LinkedHashSetIn {
    public static void main(String[] args) {
        // Create a LinkedHashSet to store strings
        Set<String> mySet = new LinkedHashSet<>();

        // Add elements to the set
        mySet.add("apple");
        mySet.add("banana");
        mySet.add("orange");
        mySet.add("grape");
        mySet.add("kiwi");

        // Display the set
        System.out.println("LinkedHashSet: " + mySet);

        // Size of the set
        System.out.println("Size of the Set: " + mySet.size());

        // Check if the set is empty
        System.out.println("Is the Set empty? " + mySet.isEmpty());

        // Check if an element exists in the set
        String searchElement = "orange";
        System.out.println("Does " + searchElement + " exist in the Set? " + mySet.contains(searchElement));

        // Removing an element from the set
        String removeElement = "grape";
        mySet.remove(removeElement);
        System.out.println("Set after removing " + removeElement + ": " + mySet);

        // Iterating over the set
        System.out.println("Iterating over the Set:");
        for (String fruit : mySet) {
            System.out.println(fruit);
        }

        // Clear the entire set
        mySet.clear();
        System.out.println("Set after clearing all elements: " + mySet);
    }
    
}
