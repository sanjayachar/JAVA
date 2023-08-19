package Java8Features.JavaStreams;
import java.util.*;
import java.util.stream.*;
public class SetToStream {
    public static void main(String[] args) {
        Set<Integer>intSet=new HashSet<>();
        intSet.add(1);intSet.add(2);intSet.add(3);
        Stream<Integer>intStream=intSet.stream();
        intStream.forEach(System.out::println);
    }
}
