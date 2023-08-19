package Java8Features.JavaStreams;
import java.util.*;
/*It is a terminal option peovided by the java stream API
 * It is used to retreive an arbitrary element from the stream
 * Optional<T> findAny()
 * the findAny method returns the Optional object
 */
public class FindAny {
  public static void main(String[] args) {
    List<String>fruits=List.of("Apple","Banana","Orange","Grapes");
    Optional<String>anyFruit=fruits.stream().findAny();
    System.out.println(anyFruit.isPresent()?("Found:"+anyFruit):"No fruit found");
  }
}
