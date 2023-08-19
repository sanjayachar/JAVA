package Java8Features.JavaStreams;

import java.util.*;
import java.util.Set;
import java.util.stream.Stream;

public class ListToStream {
    public static void main(String[] args) {
        List<Integer>intList=Arrays.asList(1,2,3);
        Stream<Integer>intStream=intList.stream();
        intStream.forEach(System.out::println);
    }
}
