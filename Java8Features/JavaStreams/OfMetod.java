package Java8Features.JavaStreams;
import java.util.*;
/*of methods isn't a method associated with streams, but rather it's used in certain classes
 * to create instances of classes with a more concise syntax
 * It's commonly used in collection classes like instances of classes with more concise
 * syntax
 */
public class OfMetod {
  public static void main(String[] args) {
    List<String>fruits=List.of("Apple","Banana", "Orange");
    Set<Integer>num=Set.of(1, 2, 3, 4,5,6);
    Map<String,Integer>ages=Map.of("Alice", 30, "Bob", 25, "Charlie", 40);
    System.out.println(fruits);System.out.println(num);System.out.println(ages);
  }
}
