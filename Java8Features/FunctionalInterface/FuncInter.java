package Java8Features.FunctionalInterface;
/*A Functional Interface is additionally as Single Abstract Method Interface
 * However, they can include any quantity of default and static methods.
 * 
 * Functional interfaces are included in Java SE 8 with Lambda Expressions and Method references
 *  in order to make code readable, clean, and straightforward
 */

 /*This is the functional interface which is having only one abstract method called calculate */
@FunctionalInterface
interface Square{
    int calculate(int x);
}
public class FuncInter {
    public static void main(String[] args) {
        /*Before Java 8, we had to create anonymous inner class object or implement these interfaces */
        /*Create anonymous inner class object*/
        new Thread(new Runnable(){
            @Override public void run(){
                System.out.println("New Thread created using anonymous inner class object\n");
            }
        }).start();

        /*Java 8 onwards, we can assign lambda expression to its functional interface object like this */
        new Thread(()->System.out.println("New thread was created using lambda expression without creating\n" 
        +"the anonymous class object for Runnable interface\n")).start();

        Square sq=(int x)->x*x;
        System.out.println("Square of 234 is; "+sq.calculate(234));
    }
    
}
