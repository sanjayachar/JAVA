import java.util.*;
import java.util.stream.Collectors;
/*Streams are a powerful and functional and declarative way to process collections of data
 * They provide a powerful API for performing various operations on data elements, such as filtering, mapping, reducing and more
 * STreams allow developers to write code that is more expressive, readable and maitainable when dealing with large datasets
 * 
 * why:
 * -----
 * Concise and expressive code: Stream allow you to write code in a more functional style and makes easier to understand
 * 
 * Declarative programming: We can decide what we want to achive rather how to achive(eg filter even numbers, find the maximum etc using
 * stream rather using loops and conditions)
 * 
 * parallel processing:Streams can be easily parallelized, leveraginig multi-core processors to improve performance on large datasets
 * 
 * What:
 * -------
 * Streams are not data structures; they are a sequence of elements that support various functional operations.
 * 
 * They don't store data, instead  they provide a pipeline to process data in a lazy and efficient manner
 * 
 * Streams are designed to work with functional interfaces like 'Predicate', 'Function', and 'Consumer'
 * and can be easily used with lambda expressions.
 * 
 * Where to use:
 * ----------------
 * Collections:Streams are created from collections like list, Set and Maps, allow us to process elements efficiently.
 * 
 * Arrays:Streams can be created from arrays, simplifying operations on array elements.
 * 
 * I/O operations:Stream an be used for reading and writing data 
*/
public class streamsIn {
    public static void main(String[] args) {
        List<Integer>num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //Filterring even numbers and collecting them into new list
        List<Integer>evenNum=num.stream().filter(number -> number%2==0).collect(Collectors.toList());
        System.out.println("Even numbers: "+evenNum);

        //Mapping each number to its sqaure
        List<Integer>sqr=num.stream().map(sqnum->sqnum*sqnum).collect(Collectors.toList());
        System.out.println("Square numbers: "+sqr);

        //Summing all numbers
        int sum=num.stream().reduce(0,Integer::sum);
        System.out.println("Sum: "+sum);

        //Finding the maximum number
        Optional<Integer>max=num.stream().max(Integer::compare);
        max.ifPresent(value->System.out.println("Maximum number: "+value));
    }
}
