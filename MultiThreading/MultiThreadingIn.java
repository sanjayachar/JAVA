package MultiThreading;
/*Multi Threading is a java feature that allow concurrent(existing, happening, or done at the same time) execution 
 * of two or more parts of a program for maximum utilization of CPU.
 * Each part of such process is called thread.
 * So, Threads are light-weight processes within a process.
 * 
 * Thread can be created 
 * Extending the Thread class
 * Implementing the Runnable Interface
 */
/*Thread created using Thread class */
class MyThread1 extends Thread{
    public void run(){
        try{
            System.out.println("Thread"+Thread.currentThread().getId());
        }catch(Exception e){
            System.out.println("Exception caught: "+e.toString());
        }
    }
}
class MyThread2 implements Runnable{
    @Override
    public void run(){
        System.out.println("It's runnable interface: "+Thread.currentThread().getName());
    }
}
class Depricate{
    @Deprecated
    public void depricate(){

    }
}
public class MultiThreadingIn {
    public static void main(String[] args) {
        Thread t1,t2,t3;
        /*or*/
        for(int i=0;i<3;i++){
            t1=new MyThread1();
            t2=new MyThread1();
            t1.start();
            t2.start();
        }
        System.out.println("\nRunnable\n----------------");
        for(int i=0;i<3;i++){
            t3=new Thread(new MyThread2());
            t3.start();
        }
       /* 
       MyThread1 t3=new Thread();
       int i=10.0;
      This will cause CE because type missmatch 
       */
      


      Depricate dp=new Depricate();
      dp.depricate();
    }
    
}
