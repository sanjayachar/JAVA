package Java8Features;
import java.util.function.*;
@FunctionalInterface
interface Example1{
    ExampleMethRef method();
}

@FunctionalInterface
interface Example2{
    int method2(String str);
}
public class ExampleMethRef {
    ExampleMethRef method(){
        return new ExampleMethRef();
    }
    int impliOfMethod2(String str){
        return str.length();
    }
    public static void main(String[] args) {
        Example1 ex1=ExampleMethRef::new;//this is the method reference is to create new instance of ExampleMethRef
        System.out.println(ex1.method().getClass().getName());

        
        Example2 ex2=ex1.method()::impliOfMethod2;//becuase ex1.method() gives the ExampleMethRef object 
        /*or */
        ExampleMethRef ex3=new ExampleMethRef();
        Example2 ex4=ex3::impliOfMethod2;

        System.out.println("Length of the String is: "+ex2.method2("Sanjay"));

        /*Like this for built-in functional interface*/

        /*Predicate:Accepts an argument and returns a boolean */
        Predicate<Integer>isEven=MethRefExample::isEvenNumber;
        System.out.println("Is 10 even?: "+isEven.test(10));
        System.out.println("Is 15 even?: "+isEven.test(15));System.out.println();

        /*Function: accepts a type argument(T t) and returns the type argument(U u) */
        Function<String,Integer>stringToLen=String::length;
        System.out.println("Length of 'Java': "+stringToLen.apply("Java"));System.out.println();

        /*Consumer:takes Type parameter and returns void */
        Consumer<String>printSting=System.out::println;
        printSting.accept("Hello, World!");System.out.println();

        /*Supplier: returns the Type parameter without taking an input */
        Supplier<Double>randNum=Math::random;
        System.out.println("Random double: "+randNum.get());System.out.println();

        /*Some String operation using method reference and functional interface */
        MethRefExample mtRef=new MethRefExample();
        Function<String,String>someRef=mtRef::someOp;
        System.out.println("The string contains only char 'a' in the string 'Sanjay': "+someRef.apply("Sanjay"));
    }
    
}
class MethRefExample{
    public static boolean isEvenNumber(int num){
        return num%2==0;
    }
    public static int squareNum(int num){
        return num*num;
    }
    public String someOp(String str){
        String str2="";
        str.equalsIgnoreCase(str2);
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)=='a')
                str2+=str.charAt(i);
        return str2;
    }
}