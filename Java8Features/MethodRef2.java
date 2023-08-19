package Java8Features;
import java.util.*;
import java.util.function.*;
public class MethodRef2 {
    //reference to a static method
    public static void print(String s){
        System.out.println(s);
    }
    public boolean isEven(int num){
        return num%2==0;
    }
    public static void main(String[] args) {
        String[]names={"Alice","Sanjay","Manju"};
        
        Arrays.stream(names).forEach(MethodRef2::print);

        MethodRef2 mt1=new MethodRef2();
        Predicate<Integer>isEvenRef=mt1::isEven;System.out.println(isEvenRef.test(20));

        
    }
    
}
