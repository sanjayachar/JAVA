package ObjectOrientedProgrammming;
/*Java methods:
 * ------------
 * It is like a function i.e. used to expose the behavior of an object.
 * It is set of codes that perform a particular task.
 * 
 * The main advantage of Method is
 * Code Reusability
 * Code Optimization
 * 
 * Methods call are implemented through a stack
 * Whenever a method is called a stack frame is created within the stack area and after that 
 * the arguments passed local variables and values to be retured by this called method 
 * are stored in this stack frame and when execution of this called method is over the 
 * allocated stack frame would be deleted
 * 
*/
public class JavaMethods {
    public static void main(String[] args) {
        Hello();
        Hello2();
    }
    public static void Hello2(){System.out.println("hello2");}//we can write method like this 
    static public void Hello(){//and like this also
        System.out.println("hello");
    }
    /*parameter list- eg: max(int x,int y) */
    
}
