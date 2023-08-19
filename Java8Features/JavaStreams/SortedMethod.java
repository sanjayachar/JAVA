package Java8Features.JavaStreams;
import java.util.*;
import java.util.stream.*;
public class SortedMethod {
    public static void main(String[] args) {
        /*Example 1: Sort numbers in natural order 
         * bcz sorted map uses soetimes Comparator  functional interface
         * the Comparator funvtional interface takes type T as a parameter and returns the void/won't
         * return anything 
        */
        List<Integer>num=Arrays.asList(10,5,9,4,8,3,7,2,6,1);
        System.out.println("List num: "+num);
        List<Integer>sortedNum=num.stream().sorted().collect(Collectors.toList());
        System.out.println("After sorting the List num: "+sortedNum);

        /*Example 2:Sort numbers in descending order */
        List<Integer>descSortedNum=num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Reverse order sorting of List num: "+descSortedNum);

        /*Example 3:Sort strings in alphabetic order */
        List<String>words=Arrays.asList("Kivi","apple","banana","almond","Sanajy","Manju","Kavi");
        System.out.println("List words: "+words);
        List<String>sortedStr=words.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorting the List words: "+sortedStr);
        System.out.println("Sorting reverse order: "+words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        System.out.println("Sorted by length: "+words.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList()));
    }
}
