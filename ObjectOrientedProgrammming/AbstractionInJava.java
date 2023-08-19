package ObjectOrientedProgrammming;
/*Java abstraction is achieved by interfaces and abstarct classes,We can achieve 100%
 * abstraction using interfaces
 * Data abstraction may also be defined as the process of identifying only the required characteristics of an object ignoring the irrelevent
 * details
 * Abstract class cannot be instantiated woth the new operator
 * 
 * An Abstract class can have parameterized constructors and the default constructor is always
 * present in an abstract class
 * 
 * Why do we use abstraction
 * --------------------------
 * In java the abstract keyword is used to declare a class or a method as an abstract.
 * An abstract class can't be instantiated means we can't create objects of it, but we can
 * use it as a template for creating other classes that extend it
 * 
 * Encapsuation vs Data Abstraction
 * --------------------------------
 * Encapsulation is data hiding(Information hiding) while Abstraction is detailed hiding(implementation hiding)
  */
  abstract class Ab{
    void hello(){
        System.out.println("Hello abstract");
    }
    abstract void hello(int a);
  }
public class AbstractionInJava extends Ab{
  void hello(int a){
    System.out.println("abstract meth-"+a);
  }
    public static void main(String[] args) {
        Ab b=new AbstractionInJava();
        AbstractionInJava ab=new AbstractionInJava();
        ab.hello();
        b.hello();
        ab.hello(10);
    }
    
}
