/*Basically methods are stored in the run-time stack area(which is the part of heap space) 
 * Instance methods are belongs to the object of the class not to the class
 * Static methods are the methods in java that can be called without an object creation 
 * they are referenced by the class name itself
 * 
 * When to use static method:
 * When we want the code can be shared across the all instance in the same class
 * they are basically used to static feilds of the class
 * 
 * abstract method illegal combinantion:
 * ------------------------------------
 * 1)final
 * 2)abstract native
 * 3)abstract synchronized
 * 4)abstract static
 * 5)abstract private
 * 6)abstract strictfp
 * 
 * we can create abstract methods inside the interface
*/
interface A{
    public abstract int hello();
}
public class MethodsIn {
    // static public int i;
    int Prod(int a,int b){return 0;}
    double Prod(double a,int b){return 0.0;}
    public static int hello(){
        int i=0;//this is not a non static bcz the variables inside static method are considered as a static
        return i;
    }
    public void hello2(){
        // static int i=0; gives error bcz we cannot create static variable inside the instance method
    }
    public static void main(String[] args) {
        System.out.println(hello());
        // static MethodsIn mt=new MethodsIn(); this will give us CE bcz only final modifier is used 
    }
}
