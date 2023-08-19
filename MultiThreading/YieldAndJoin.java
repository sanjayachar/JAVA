package MultiThreading;
/*
 * yield():
 * ----------
 * It is the method that suggest to the thread scheduler that the current thread is willing to yield its current 
 * time slice and allow other threads to execute.
 * 
 * yield is used for cooperative thread scheduling, where the thread voluntarily gives up its time slice
 * potentially allowing other threads of the same or higher priority to run.
 * 
 * join():
 * --------
 * join is a method that allow one thread to wait for the completion of another thread before continuing its own
 * execution.
 * 
 * join is used for synchronization between threads to achive a specific order of execution or to wait for the 
 * completion of certain tasks
 * 
 * So, yield() is used to suggest yielding(like give up) the time slice to the thread for cooperative thread scheduling, 
 * while join() is used to wait for the completion of other threads to achive synchronization
 */
public class YieldAndJoin {
    public static void main(String[] args) throws InterruptedException{
        //below one is anonymous function
        // below thread is used for yield
        /*In below each thread t1 and t2 calls the yield method so each divides it's time for execution so that's why
         * output is:
         * -----------
         * Consuming item: 0
           Producing item: 0
           Consuming item: 1
           Producing item: 1
           Consuming item: 2
           Producing item: 2
           Consuming item: 3
           Producing item: 3
           Consuming item: 4
           Producing item: 4
         */
        Thread t1=new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("Producing item: "+i);
                Thread.yield();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("Consuming item: "+i);
                Thread.yield();
            }
        });
        t1.start();t2.start();
        System.out.println();

        /* 
        In below we have two threads, t3 and t4, and we call join each thread after starting them.
        This ensures that main thread waits for both t1 and t2 complete their execution before printing
        "Both reads have completed"
        
        So, the output is:
        ------------------
        Thread: Thread-3 count is: 0
        Thread: Thread-3 count is: 1
        Thread: Thread-3 count is: 2
        Thread: Thread-3 count is: 3
        Thread: Thread-3 count is: 4
        Thread: Thread-2 count is: 0
        Thread: Thread-2 count is: 1
        Thread: Thread-2 count is: 2
        Thread: Thread-2 count is: 3
        Thread: Thread-2 count is: 4
        Both reads have completed
        */
        Thread t3=new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("Thread: "+Thread.currentThread().getName()+" count is: "+i);
            }
        });
        Thread t4=new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("Thread: "+Thread.currentThread().getName()+" count is: "+i);
            }
        });
        t3.start();t4.start();
        t3.join();t4.join();
        System.out.println("Both reads have completed");

    }
    
}
