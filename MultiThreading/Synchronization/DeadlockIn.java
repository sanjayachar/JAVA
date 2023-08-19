package MultiThreading.Synchronization;
/*
 * Deadlock in java threading occurs when two or more threads are waiting for each other to relese the locks on
 * shared resources, leading to a situation where none of the thread can proceed, adn the program becomes
 * unresponsive.
 */
public class DeadlockIn {
    private static final Object r1=new Object(),r2=new Object();

    public static void main(String[] args) throws InterruptedException{
        Thread t1=new Thread(()->{
            synchronized(r1){
                System.out.println("Thread 1: is Holding resource r1......");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(("Thread 1: is Waiting for resource r2....."));
                synchronized(r2){
                    System.out.println("Thread 1: is Holding resource1 and resource r2.....");
                }
            }
        });
        Thread t2=new Thread(()->{
            synchronized(r2){
                System.out.println("Thread 2: is Holding for resource r2.....");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: is Waiting for resource r1...");
                synchronized(r1){
                    System.out.println("Thread 2:  is Holding resource r2 and resource r1...");
                }
            }
        });
        t1.start();t2.start();
        t1.join();t2.join();
        System.out.println("Execution completed");
    }
    
}
