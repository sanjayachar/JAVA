package Java8Features.JavaStreams;
import java.util.*;

/*Foreaach performs an action for each element of the stream
 * it may traverse the stream to produce a result or a side-effect
 */
public class JavaForeachStream {
  public static void main(String[] args) {
    // List<Integer>list=Arrays.asList(2,4,6,7,10);
    Arrays.asList(2,4,6,7,10).stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);    

    Arrays.asList("Hello","Hi","How","Are","You").stream().forEach(System.out::println);
  }
  
}
