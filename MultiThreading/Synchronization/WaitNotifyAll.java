package MultiThreading.Synchronization;
/*
 * wait(), notify() and notifyAll() are a methods used to implement inter thread communication and coordination
 * 
 * wait():
 * -------
 * The wait() method is called on an object within a synchronized block to make the current thread wait
 * until another calls notify() or notifyAll() on the same object
 * 
 * When a thread calls wait() it releases the lock on the object and enters into the waiting state until it is notified.
 * 
 * notify or notifyAll:
 * -------------------
 * notify and notifyAll methods are called on an object within a synchronized block to wake up one or all the threads 
 * waiting on that object 
 * After the thread/s are notified, they willcompete to acquire the lock again before resuming execution. 
 */
class SharedResource{
    private boolean condition=false;
    
    synchronized public void waitCondition()throws InterruptedException{
        while(!condition){
            wait();
        }
        System.out.println("Condidtion is met! Continue with the task.");
    }
    public synchronized void setCondition(){
        condition=true;
        notifyAll();
    }
}
public class WaitNotifyAll {
    public static void main(String[] args) throws InterruptedException {
        SharedResource sr=new SharedResource();
        
        Thread waiTh=new Thread(()->{
            try {
                sr.waitCondition();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread notifyTh=new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sr.setCondition();
        });
        waiTh.start();notifyTh.start();
        waiTh.join();notifyTh.join();
        System.out.println("Execution completed.");
    }
    
}
