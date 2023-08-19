package Java8Features.FunctionalInterface;
import java.util.function.*;
import java.util.*;
/*The Consumer interface is a part of java.util.function package which has been introduced since Java 8, 
 * to implement functional interface in Java.
 * It represents a function which takes in one argument and produces a result.
 * The function inside this interface doesn't return any value
 * This functional interface takes one generic 
 *  T: Denotes the type parameter
 * The Consumer interface consists one method called accept()
 * 
 * void accept(T t);
 */
public class ConsumerInt {
    public static void main(String[] args) {
        Consumer<Integer> display=a->System.out.println("The value of a is: "+a);
        display.accept(20);

        /*Consumer to multiply 2 to every integer of a list */
        Consumer<List<Integer>>modify=list->{
            for(int i=0;i<list.size();i++)
            list.set(i, 2*list.get(i));
        };
        Consumer<List<Integer>>displayList=list->list.stream().forEach(a->System.out.print(a+" "));
        System.out.println();
        List<Integer>list=Arrays.asList(2,1,3);

        modify.accept(list);
        displayList.accept(list);
        System.out.println();

        modify.andThen(displayList).accept(list);
        System.out.println();
    }
}
