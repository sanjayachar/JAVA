/*In java 8 a lambda expression is a different way to represent an anonymous fuction
 * A function that doesn't have a name and can be treated as an object
 * It also allows you to encapsulate a block of code and pass it arround as if it where a variable
 * Lambda expressions are a key feature of functional programming in java, enabling developers to erite more expressive and 
 * compact code.
 * 
 * Lambda expressions used functional interfaces which are interfaces with a single abstract method
 */
interface Inter{
    public String getName(String str);
}
public class LambdaExpr {
    public static void main(String[] args) {
        Runnable rn=()->System.out.println("this is lambda expression and works for Runnable interface...!");
        rn.run();

        Inter it=(String str)->{
            return str;
        };
        System.out.println(it.getName("Sanjay"));
        
        
    }
    
}
