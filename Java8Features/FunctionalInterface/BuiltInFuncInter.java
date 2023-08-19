package Java8Features.FunctionalInterface;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.*;
/*In Java 1.8 there are many Functional Interfaces there are:
 * ---------------------------------------------------------
 * 1)Runnable->This interface only contains the run() method.
 * 2)Comparable->This interface only contains the compareTo() method.
 * 3)ActionListener->This interface only contains the actionPerformed() method.
 * 4)Callable->This interface only contains the call() method.
 * 
 * In java SE 8 included four kinds of functional interfaces
 * 1)Consumer
 * 2)Predicate
 * 3)Function
 * 4)Supplier
 */
public class BuiltInFuncInter {
    public static void main(String[] args) {
        /*Consumer:
         * -----------
         * It is the Functional Interface that takes an argument of a specific type and returns void
         * @FunctionalInterface
         * public interface Consumer<T>{
         *      void accept(T t);
         * }
         * we can use lambda expression for this consumer interface
         */
        Consumer<String>print=(str)->System.out.println(str);
        print.accept("Hello, world!");

        /*Predicate(Predicate<T>):
         * -------------
         * This functional interface is having only one method called test which returns the boolean 
         */
        List<Integer>num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer>isEven=(number)->number%2==0;

        System.out.println("List: "+num);
        List<Integer>evenNum=num.stream().filter(isEven).collect(Collectors.toList());
        System.out.println("Even numbers in the list is: "+evenNum);

        /*Function(Function<R,T>):
         * -----------
         * This interface has a single abstract method 'R apply(T t)' where T is the type of input argument
         * which takes input and R is also a type which returns 
         */
        Function<String,Integer>strToInt=str->Integer.parseInt(str);
        System.out.println(strToInt.apply("42")+"\n");

        /*Supplier:
         * ------------
         * It is also a Functional Interface the method in this interface won't takes the parameter 
         * but it will returns the Type parameter
         * Supplier<T>
         * T get();
         */
        Supplier<Integer> randNum=()->new Random().nextInt();
        System.out.println("Random number using Supplier Functional interface: "+randNum.get());
    }
    
}
