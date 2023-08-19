package Java8Features;
import java.util.*;
import java.util.function.*;
/*In java 8 method references provide a shorthand notation to refer to methods or constructors of classes or objects.
 * They are often used in functional programming and work well with lambda expressions
 * 
 * Method references allow us to pass method references as arguments to functinal interfaces that expect
 * compatible functional types.
 * 
 */
public class MethodReferences {
   public static void main(String[] args) {
    String[]names={"Alice","Bob","Charlie"};
    /*Reference to a static method:
     * Syntax: ClassName::staticMethodName
     * In this type of method reference, we refer to a static method of a class.
     * The method references signature should match the signature of the functional interfaces abstract method.
     */
    /*Printing the array values using lambda expression */
    Arrays.stream(names).forEach(name->System.out.println(name));System.out.println();
    /*Printing the array values using method reference */
    Arrays.stream(names).forEach(System.out::println);System.out.println();

    /*Reference to an instance method of an Object:
     * Syntax: object::instanceMethodName
     * In this type of method reference, we refer to an instance method of a specific object.
     * The method refrences signature should match the signature of the functional interfaces abstract method
     */
    //Using a lambda reference to check if the string is empty
    Predicate<String>isEmpty=str->str.isEmpty();

    //Using method reference to check if the string is empty or not
    Predicate<String>isEmtyRef=String::isEmpty;

    System.out.println("Is string empty?: "+isEmpty.test("Hello"));System.out.println();
    System.out.println("Is string empty?: "+isEmtyRef.test(""));System.out.println();

    /*Reference to an instance method of a class:
     * syntax: ClassName::instanceMethodName
     * In this typr of method reference, we refer to an instance method of a specific class.
     * The method references signature should match the signature of the
     * functional interface abstract method, and the method takes an extra parameter, which becomes the input to
     * the method reference.
     */
    /*Using a lambda expression to concatenate two strings */
    BiFunction<String,String,String>concatLambda=(s1,s2)->s1.concat(s2);

    /*Using method reference to concate two strings */
    BiFunction<String,String,String>concateRef=String::concat;

    System.out.println("Concatination using lambda expression: "+concatLambda.apply("Hello, ", "World!"));
    System.out.println("Concatination of string using method reference: "+concateRef.apply("Hello, ", "World!"));

    /*Reference to a Constructor:
     * Syntax:ClassName::new
     * In this type of method reference, we refer to a constructor of a class.
     * The method reference signature should match the signature  should match the signature of the functional 
     * interface abstract method
     */
    /*Using a lambda expression to create a new instance of StringBuilder */
    Supplier<StringBuilder>newStrBuildLambda=()->new StringBuilder();
    /*Using method reference to create a new instance of StringBuilder */
    Supplier<StringBuilder>newStrBuildRef=StringBuilder::new;

    System.out.println(newStrBuildLambda.get());//output: ""
    System.out.println(newStrBuildRef.get());//output: ""
   } 
}
