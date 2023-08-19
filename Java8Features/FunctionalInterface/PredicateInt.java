package Java8Features.FunctionalInterface;
import java.util.function.*;
/*This is also a functional interface in the package java.util.function 
 * This interface is having methods:
 * 
 * static method: static <T>Predicate<T>isEqual(Object targetRef); This method returns a Predicate
 * 
 * default method: default Predicate<T>negate(): This method returns the predicate that represents the logical
 * (NOT) of current predicate
 * 
 * default Predicate<T> or(Predicate<? super T> other): This will returns a composed predicate that represents a logical OR 
 * operation bw current and other predicate
 *  
 * default Predicate<T> and(Predicate<? super T> other): This will returns a composed predicate that represents a logical AND 
 * operation bw current and other predicate 
 * 
 * boolean test(T t): this is single abstract method returns boolean and takes type T parameter
 */
public class PredicateInt {
    public static void main(String[] args) {
        Predicate<Integer> isEven=num->num%2==0;
        Predicate<Integer>isPositive=num->num>0;
        int num=-10;
        System.out.println(num+" is even?: "+isEven.test(num)+"\n");
        System.out.println(num+" is positive?: "+isPositive.test(num)+"\n");
        System.out.println(num+" is even and positive?: "+isEven.and(isPositive).test(num)+"\n");
        System.out.println(num+" is even or positive?: "+isEven.or(isPositive).test(num)+"\n");
        System.out.println(num+" is not even?: "+isEven.negate().test(num)+"\n");


    }
}
