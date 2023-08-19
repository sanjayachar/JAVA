package Java8Features.FunctionalInterface;
import java.util.function.*;
/*It is also a functional interface in thepackage java.util.function and having only one method
 * T get();
 * 
 */
class Make{
    Make hello(Object str){
        return (Make)str;
    }
    Make hello2(Object str){
        return (Make)str;
    }
}
public class SupplierInt {
   public static void main(String[] args) {
    Supplier<Double>randVal=()->Math.random();
    System.out.println("Random value using get() function in the Supplier interface: "+randVal.get());

    Make mk1=new Make();
    System.out.println(
    mk1.hello(mk1).hello2(mk1));
   } 
}
