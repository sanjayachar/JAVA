package Java8Features.FunctionalInterface;
import java.util.function.*;
/*
 * In this interface
 * we have 4 methods
 * 1)R apply(T t)
 * 2)default<V>Function<T,V> andThen(Function<? super R,? extends V> after)
 * 3)default<V>Function<V,R>compose(Function<? super V,? extends T> before)
 * 4)static <T>Function<T,T>identity()
 */
public class FunctionInt {
    public static void main(String[] args) {
        Function<Integer,String>intToString=num->"Number: "+num;
        Function<String,String>addPrefix=str->"Prefix: "+str.substring(2, 5);
        int num=42;
        //Transferm int to string
        System.out.println("After converting int 42 to String: "+intToString.apply(num));

        //Transfeorm string with prefix
        System.out.println("Sub string of 'Hello,World!' is: "+addPrefix.apply("Hello World!"));

        //Chaining functions using andThen
        System.out.println("Composing with andThen to get substring: "+intToString.andThen(addPrefix).apply(num));

        //Identity function
        System.out.println(Function.identity().apply(100));

    }
}
