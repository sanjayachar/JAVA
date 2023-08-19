package Java8Features.JavaStreams;
import java.util.*;
import java.util.stream.*;
/*Intermediate operations are the operations in java streams that transform or modify the data in the 
 * stream.
 * filter--->Predicate<T>(Functional Interface)
 * map--->Function<T,U>(Functional Interface)
 * sorted--->Comparator<T>(Functional Interface)
 * 
 * This means streams are not only for functional interface
 * bcz:
 * ----
 * While FI are often used for dealing with lambda expressions that represents the operations we want to
 * do on stream elements,
 * stream themselvs handle any type of objects or elements
 * streams are higher level abstraction that provides a way to process sequences of data in a more 
 * functional and declarative style,
 * 
 * It only takes the functional interface to process the stream of elements provided by the user
 *  
 */
public class IntermediateOp1 {
    static int doSomthing(int a){
        if(a%2!=0)
        return a;
        return 0;
    }
    public static void main(String[] args) {
        List<Integer>num1=Arrays.asList(3,2,7,4,1,6,5,9,8,10);
        System.out.println("Original List num1: "+num1);
        /*1)Stream<T> filter(Predicate<T>pr);-It is the function inside the java Stream which accepts the Predicate 
         * functional interface and returns the Stream(functional interface)
         * This function allows us to select elements from a stream based on a given condition*/
        List<Integer>evenNum=num1.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("After modifying the list num1 and making new even number's list evenNum: "+evenNum);System.out.println();


        /*map function is allows us to transform each elemnt in the stream into a new value based on a 
         * given function
         * Stream<T> map(Function<T t,U u>);
         * which takes the functional interface as input and returns the Stream(functional interface)
         */
        List<Integer>oddNum=num1.stream().map(IntermediateOp1::doSomthing).collect(Collectors.toList());
        System.out.println(oddNum);System.out.println();

        /*sorted function is sorts the elements of the stream based on a provided comparator or the natural
         * ordering
         * it has parameterized type and non parameterized type
         * Stream<T> sorted();
         * Stream<T> sorted(Comparator<T> comparator);
         */
        List<Integer>sorIntegers=num1.stream().sorted().collect(Collectors.toList());
        System.out.println("After sorting the num1 list using sorted function in the stream: "+sorIntegers);

        List<Integer>sorIntegersComp=num1.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println("After reverse sorting the num1 list using compareTo in the sorted: "+sorIntegersComp);System.out.println();

        /*distinct function filters the duplicate elements from the stream, ensuring that only unique elements
         * remain
         * Stream<T> distinct();
         */
        List<Integer>uniqueNum=oddNum.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique element in the odd number where oddNum list is having too much zero value:\n"+uniqueNum);

        /*limit function in stream restricts the number of elements in the stream to a specified maximum
         * count
         * Stream<T> limit(long maxSize)
         */
        List<Integer>firstThreeInList=num1.stream().limit(3).collect(Collectors.toList());
        System.out.println("First three number in the list num1 is: "+firstThreeInList);

        /*The reduce method is a part of Java Stream API and to perform reduction operation on the elements
         * of a stream
         * It takes a binary operator and returns an Optional
         * Optional<T> reduce(BinaryOperator<T>
         * 
         * we can reduce the stream to single resultant like: maximum num, min num, sum or product etc
         * 
         */
    }
}