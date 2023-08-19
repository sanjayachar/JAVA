package Java8Features.JavaStreams;
import java.util.*;
import java.util.stream.*;
public class MapMethod {
    public static void main(String[] args) {
        List<Integer>num=Arrays.asList(1,2,3,4,5);
        System.out.println("List num: "+num);

        /*Example 1: Square each number using map 
         * bcz map() method takes Function<T t,U u> functional interface
         * so This interface method takes type T as an parameter and returns type U
        */
        List<Integer>sqNum=num.stream().map(MapMethod::sqNumber).collect(Collectors.toList());
        System.out.println("Square of each element in the List num: "+sqNum);

        /*Example 2: Convert integers to their string representation using map */

        List<String>toStr=num.stream().map(MapMethod::toString).collect(Collectors.toList());
        System.out.println("After converting the List num to string: "+toStr);

        /*Example 3:Convert names to uppercase using map */
        List<String>name=Arrays.asList("Sanjay","Kavi","Manju","Manju","Kavi","Sanjay");
        System.out.println("List name: "+name);
        List<String>upperName=name.stream().map(MapMethod::upperCaseName).collect(Collectors.toList());
        System.out.println("After converting the List name to uppercase: "+upperName);

        /*Example 4:Extract lengths of strings using map */
        List<Integer>lenName=name.stream().map(MapMethod::lenOfName).collect(Collectors.toList());
        System.out.println("After getting each elements length in the List name: "+lenName);
    }
    static Integer sqNumber(Integer i){
        return i*i;
    }
    static String toString(Integer i){
        return i.toString();
    }
    static String upperCaseName(String str){
        return str.toUpperCase();
    }
    static Integer lenOfName(String str){
        return str.length();
    }
}
