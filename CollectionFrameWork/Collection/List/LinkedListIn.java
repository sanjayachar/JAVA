package CollectionFrameWork.Collection.List;
import java.util.*;
/*Linked list is a part of collection framework and present in the java.util package
 * It is subclass of List interface
 * This is an linked list data structure which is not contains contiguous memory locations and every element is a seperate
 * object with a data and address part the elements are linked using pointers and addreses. Each element is known as node
 * 
 * Why: LinkedList is implemented as a doubly-linked-list. It provides efficient insertion and
 * deletion order at both(head and tail) end.
 * 
 * What:It contains the node where each node contains the element and references to the next
 * and previous nodes in the list.
 * 
 * Where: Use when you frequently perform insertions or deletions at the beginning or end of the list.
 * 
 * 
 * 
 */
public class LinkedListIn {
    public static void main(String[] args) {
        LinkedList<Integer>l1=new LinkedList<>();//This constructor creates empty linked list
        l1.add(10);
        l1.add(20);
        System.out.println("List l1: "+l1);
        LinkedList<Integer>l2=new LinkedList<>(l1);//this will copy the collection l1
        l2.add(30);
        l2.add(40);
        l2.add(2,25);

        System.out.println("List l2: "+l2);
        l2.set(3,35);
        System.out.println("After updating the list l2: "+l2);

        //removing

        l2.remove(2);
        System.out.println("Removing the element at the index 2: "+l2);

        LinkedList<String>l3=new LinkedList<>();
        l3.add("Sanjay");
        l3.add("B");
        l3.add("N");
        System.out.println("Original List l3: "+l3);
        l3.remove("N");
        System.out.println("Removing the element 35: "+l3);

        //LinkedList to array
        System.out.println("After converting Linked list into Array: "+Arrays.toString(l2.toArray()));

        l2.removeFirst();
        System.out.println("After removing the first element: "+l2);

        LinkedList<Integer>l4=(LinkedList<Integer>) l2.clone();//this will creates a copy of l2
        System.out.println("The clone of list l2 is l4 which is having the elements: "+l4);
    }
    
}
