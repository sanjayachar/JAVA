package Java8Features.LmbdaExpression;
import java.util.*;
import java.util.stream.Collectors;
/*
 * Lmbda expression in java 8 are powerful feature that allows us to treat functions as first class citizens.
 * They provide a concise and expressive way to represent anonymous function which are functions without a name.
 * 
 * Lambda expressions are used in:
 * --------------------------------
 * Functional interface and Anonymous Inner classes: Functional interface(Having only one method in the interface 
 * like Runnable interface in Threading)
 */
public class LambdaExpression {
    public static void main(String[] args) {
        Runnable rn=()->System.out.println("Running Labmda expression for Runnable interface...");
        Thread trd=new Thread(rn);
        trd.start();

        /*Lambda expressions can be used with streams and collection operations like forEach, filter, map, reduce etc
         * 
         */
        List<Integer>numbers=Arrays.asList(1,2,3,4,5);

        /*Using lambda expression with forEach */
        numbers.forEach(num->System.out.println(num));System.out.println();

        /*Using lambda expressionwith map */
        List<Integer>square=numbers.stream().map(num->num*num).collect(Collectors.toList());
        System.out.println("List of all square numbers in the list numbers: "+square+"\n");

        /*Using lambda expression with filter */
        List<Integer>evenNum=numbers.stream().filter(num->num%2==0).collect(Collectors.toList());
        System.out.println("List of numbers having all even numbers in the list numbers: "+evenNum+"\n");


        /*Labmda expression in the Threads and Concurrency */
        Thread trd2=new Thread(()->System.out.println("Thread is running for run method in the form of lambda expression..."));
        trd2.start();
    }
}
