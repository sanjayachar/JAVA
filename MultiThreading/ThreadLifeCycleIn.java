package MultiThreading;
/*
 * There will be a 5 states in the Thread life cycle
 * 1)New State(When new Thread is created)
 * 
 * 2)Runnable State(when thread that is ready to run is moved to a runnable state)
 * 
 * 3)Blocked/Waiting State(When thread is temporarily inactive)
 * 
 * 4)Timed Waiting(Thread lies in timed waiting state)
 * 
 * 5)Terminated State(Thread terminates bcz it exits normally or there occured some unusual erroneous event like exception)
 */
public class ThreadLifeCycleIn implements Runnable{
    public static Thread t1;
    public static ThreadLifeCycleIn t2;
    public static void main(String[] args) {
        t2=new ThreadLifeCycleIn();
        t1=new Thread(t2);
        /*Now the t1 created and entered into the new state*/
        System.out.println("State of thread t1 after creating it- "+t1.getState());
        t1.start();
        /*t1 moved to Runnable state*/
        System.out.println("State of thread t1 after calling .start() method on it- "+t1.getState());
    }
    @Override
    public void run(){
        MyThread3 myT=new MyThread3();
        Thread myT2=new Thread(myT);
        /*Thread created and is currently in the new state*/
        System.out.println("State of thread myT2 after creating it- "+myT2.getState());
        myT2.start();
        /*myT2 moved to Runnable state*/
        System.out.println("State of thread myT2 after calling .start() method on it- "+myT2.getState());

        /*moving thread myT2 to timed waiting state*/
        try{
            Thread.sleep(200);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("State of thread myT2 when it has finished it's execution- "+myT2.getState());
    }
    
}
class MyThread3 extends Thread{
    @Override
    public void run(){
        try{
            Thread.sleep(1500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("State of thread while it called join() method on thread2- "+ThreadLifeCycleIn.t1.getState());
        try{
            Thread.sleep(200);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
