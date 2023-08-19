package Java8Features.JavaStreams;
import java.util.stream.*;
public class ArrayToStream {
    public static void main(String[] args) {
        Integer[]intArray={1,2,3,4,5,6};
        Stream<Integer>intStream=java.util.Arrays.stream(intArray);
        intStream.forEach(System.out::println);
    }
}
