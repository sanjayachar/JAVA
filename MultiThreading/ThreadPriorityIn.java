package MultiThreading;
/*When ever threadwas created then it always has some priority assigned to it.
 * Priority can either be given by JVM whle creating the thread or it can be given by the programmer explicitly.
 * 
 * Default priorit(NORM_PRIORITY)-5
 * Minimum prority(MIN_PRIORITY)-1
 * Maximum priority(MAX_PRIORITY)-10
  */
public class ThreadPriorityIn extends Thread{
    public static void main(String[] args) {
        //creating the thread
        Thread t1=new ThreadPriorityIn();
        Thread t2=new ThreadPriorityIn();
        Thread t3=new ThreadPriorityIn();

        System.out.println("Thread t1,t2 and t3 priority "+t1.getPriority()+", "+t2.getPriority()+" and "+t3.getPriority()+"\n");

        //Setting the priority by programmer
        t1.setPriority(2);t2.setPriority(3);t3.setPriority(5);
        System.out.println("Thread t1,t2 and t3 priority to 2, 3 and 5: "+t1.getPriority()+", "+t2.getPriority()+" and "+t3.getPriority()+"\n");

        //Setting priority again
        t1.setPriority(NORM_PRIORITY);t2.setPriority(MIN_PRIORITY);t3.setPriority(MAX_PRIORITY);
        System.out.println("Thread t1,t2 and t3 priority to NORM_PRIORITY, MIN_PRIORITY and MAX_PRIORITY: "+t1.getPriority()+", "+t2.getPriority()+" and "+t3.getPriority()+"\n");

        System.out.println("Setting current thread priority\n--------------------------------------");
        //Setting the current thread to 6
        Thread.currentThread().setPriority(6);
        System.out.println("After setting the priority to 6: "+Thread.currentThread().getPriority());
   

    }
    
}
