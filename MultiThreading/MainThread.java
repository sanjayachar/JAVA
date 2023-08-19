package MultiThreading;
/*Whan java program starts up, one thread begins running immediately. This thread is called main thread
 * Basically main thread is created by JVM
 * 
 * Main thread vs Main method
 * ---------------------------
 * Main Thread: The main thread is a default and initial thread that gets created when java application starts running
 * It is the thread in which main method of the application is executed.
 * The main thread is responsible for the execution of the main method and any other statements that follow 
 * in the main method.
 * 
 * Main Method: The main method is special method in a Java class that serves the entry point for the Java application.
 * It is also used to initialize other thread if necessary.
*/
public class MainThread {
    /*Deadlock with use of main thread(only single thread) */
    public static void main(String[] args) {
        /*The statement Thread.currentThread().join() will tell Main thread to wait for this thread(i.e. wait for itself) 
        to die. Thus Main thread wait for intself to die, which is nothing but a deadlock. */
        try{
            System.out.println("Entering to the DeadLock");
            Thread.currentThread().join();
            System.out.println("This statement will never executed");
        }catch(InterruptedException e){
            System.out.println(e.toString());
        }
        
    }
    
}
