/*Final keyword is basically used to make variable, method and class as a final 
 * so we cannot reinitialize the variable, override the method and inherit the class which
 * is marked as a final
 * 
 * finally is used associated with a try/catch block and guarantees that a section of code will be executed.
 * the finally block will execute whether the try/catch block executes or not
 * 
 * Finalize method:
 * It is the method that the Garbage Collector always calls just before the deletion/destroying of
 * the object which is elegible for Garbage Collection, so as to perform clean-up activity
 * The Object class contains the finalize method, Since it is available for every Java class
 * Since Object class is the superclass of all Java classes
 */
public class FinalVsFinalizeVsFinal {
    public static void main(String[] args) {
        int k=15;
        try{
            System.out.println("In try block");
            int z=k/0;
        }
        catch(NullPointerException e){
            System.out.println("In catch bloack");
        }
        finally{
            System.out.println("It will executes whether try/catch executes or not");
        }
    }
    
}
