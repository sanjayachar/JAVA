package Java8Features.JavaStreams;
import java.util.*;
import java.util.stream.Collectors;

/*The Stream API is used to process collections of objects.

 * A stream is a sequence of objects that supports various methods which can be pipelined to 
 * produce the desired result.
 * 
 * Collection vs Stream.
 * ~ If we want to represent a group of objects as a single entity then we should go for collection.
 * ~ But if we want to process objects from the collection then we should go for streams.
 * 
 * stream()- It is a method in the java.util.stream package,
 * It is basically fundamental method provided by Java programming language.
 *  Stream s=c.stream(); c reffers to collection
 * 
 * Stream is available as an interface
 * 
 * Features of Java stream:
 * -------------------------
 * A stream is not a data structure it takes  input from the Collections, Arrays, or I/O channels.
 * Streams don't change the original data structure, they only provide the result as per the pipelined methods
 * 
 * How Stream work internally:
 * ---------------------------
 * ~ To filter out from the objects we do have a function named filter()
 * ~ To impose a condition we do have a logic of predicate which is nothing but a functional interface.
 * ~ To collect element we will be using Collectors.toList() to collect all the required elements.
 * ~ Lastly, we will store these elements in a List and display the outputs on the consol.
 * 
 * There are braodly 3 types of operations that are carried over streams namely
 * ------------------------------------------------------------------------------
 * 1)Intermediate operations
 * 2)Terminal operations
 * 3)Short-circute operations
 */

public class StreamEx1 {
    public static void main(String[] args) {
        List<Integer>al=Arrays.asList(2,3,9,4,20);
        System.out.println("List al: "+al);  
        
        /*Stream operation:
         * ----------------
         * 1) Getting the stream from this collection
         * 2) Filtering out only event elements
         * 3) Collectiong the required elements to List
         */

         List<Integer>ls=al.stream().filter(i->i%2==0).collect(Collectors.toList());
         System.out.println("List of even numbers is: "+ls);
    }

}
