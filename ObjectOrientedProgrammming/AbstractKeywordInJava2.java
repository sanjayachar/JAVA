package ObjectOrientedProgrammming;
/*Characteristics of java abstract keyword
 * ---------------------------------------------
 * 1)Abstract classes can't be instantiated:An abstract class is a class can't be instatiated directly.
 * Instead, it is extended by other cclasses, which can provide concrete implementions of its abstract method
 * 
 * 2)Abstract methods do not have body
 * 
 * 3)Abstract classes have both abstract and concrete method:Concrete method is implemented in the abstract class only , we can access
 * by abstract class and it's sub classes.
 * 
 * 4)Abstract classes can have constructors:Abstract classes can have constructors, which
 * which are used to initialize instance variables and performs other initialization tasks.
 * 
 * Why abstract classes have constructor:Bcz The main purpose of the constructor is to initialize the newly created object
 * In abstract class we have an instance variable, abstract and non-abstract methods.
 * We need to initialize the non-abstract methods and instance variables
 * 
 * 5)Abstract classes can contain instance variables:The instance variable created can accessed
 * by both abstract class and subclasses.
 * 
 * 6)Abstract classes can implement interfaces.
 */
abstract class A{
    // abstract static void hello(int a);abstract can't be static, bcz overriding isn't possible with static
    // abstract final void hello(int a);abstract can't be final, bcz it must be override
    // abstract synchronized void hello(int a);abstract can't be synchronized bcz when you synchronize method that implies that synchronizing code in it, i.e. when one thread is accessing the code so it doesn't make any sense in abstract method 
    public abstract void hello(int a);
    // abstract public void hello(int a,int b);
    
    /*To access and initialize below instance variable and non-abstract method we need 
     * constructor so for this abstract classes have constructor
     */
    int a;
    // A(int a){
    //     this.a=a;
    // }
    void helli(int a,int b,int c){
        System.out.println("This is non-abstract method"+(a+b+c));
    }
}
class B extends A{

    // @Override
    public void hello(int a) {
        System.out.println(a);
    }

    // @Override
    public void hello(int a, int b) {
        System.out.println(a+b);
    }
}
public class AbstractKeywordInJava2{
    public static void main(String[] args) {
        B a=new B();
        a.hello(10);//abstract method
        // a.hello(10,20);//abstract method
        a.helli(10,20,30);//non-abstract method
    }
}
