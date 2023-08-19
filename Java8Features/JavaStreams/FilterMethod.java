package Java8Features.JavaStreams;
import java.util.*;
import java.util.stream.*;
public class FilterMethod {
    public static void main(String[] args) {
        List<Integer>num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        /*Even list and odd list */
        System.out.println("The even numbers in the list using filter and method reference: "+num.stream().filter(FilterMethod::evenNum).collect(Collectors.toList()));
        System.out.println("The even numbers in the list using filter and method reference: "+num.stream().filter(FilterMethod::oddNum).collect(Collectors.toList()));

        /*filter number greater than 5*/
        System.out.println("The list which is greater than number 5: "+num.stream().filter(FilterMethod::greaterThan5).collect(Collectors.toList()));

        /*string with a specific length */
        List<String>words=Arrays.asList("apple","banana","graps","pineapple","manjunath","Kavikumar");
        System.out.println(words.stream().filter(FilterMethod::wordsLength).collect(Collectors.toList()));
        System.out.println("The List of String words: "+words);
        /*list of elements that start with a specific letter */
        System.out.println(words.stream().filter(FilterMethod::specificLetter).collect(Collectors.toList()));
        
    }
    static boolean evenNum(Integer n){return n%2==0;}
    static boolean oddNum(Integer n){return n%2!=0;}
    static boolean greaterThan5(Integer n){return n>5;}
    static boolean wordsLength(String str){return str.length()>=5&&str.length()==6;}
    static boolean specificLetter(String str){return str.charAt(0)=='K';}

}
