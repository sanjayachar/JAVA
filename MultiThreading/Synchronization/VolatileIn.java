package MultiThreading.Synchronization;
/*
 * Volatile(volatile): It is a keyword used as a modifier for the variables to indicate that the variable's value
 * may be modified by multiple threads and should always be read from and written to the main memory
 * 
 * volatile is like similar to the synchronized keyword but main difference is:
 * -----------------------------------------------------------------------------
 * 
 * volatile used for variable synchronized used for blocks and methods
 * 
 * volatile is suitable for simple shared variables requiring visibility guarantees to the multiple thread where as
 * 
 * synchronization is more versatile and provides both visibility and atomicity guarantees for multiple thread
 */
class SharedData{
    private volatile int counter=0;
    // private int counter=0;


    public void increment(){
        counter++;
    }
    public int getCounter(){
        return counter;
    }
}
public class VolatileIn {
    public static void main(String[] args) throws InterruptedException{
        SharedData sd1=new SharedData();
        
        Runnable r1=()->{
            for(int i=0;i<10000;i++){
                sd1.increment();
            }
        };
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r1);
        t1.start();t2.start();
        t1.join();t2.join();
        System.out.println("Final counter value: "+sd1.getCounter());
    }
}
