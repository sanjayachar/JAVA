package MultiThreading;
/*The start() method is a method defined in the Thread class. When you call start() it does the following:
 * 1)Registring the thread in Thread Scheduler
 * 2)execution of all other low level resources
 * 3)calling the run method
 * 
 * The purpose of start() method is to create a seperate call stack for th thread
 * A seperate call stack is created by it and then run() is called by JVM
 * 
 * we can't call more than one start method for one thread or one object
 */
public class CreatingThreadStart {
    public static void main(String[] args) {
        Runnable r1=new Runnable() {
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getId());
            }
        };

        System.out.println("when we call start method thread will be created and each time id will changes when object was creates");
        for(int i=0;i<5;i++){
        Thread t1=new Thread(r1);
        t1.start();
        /*t1.start();If we call another start method for the same object then we will get IllegalThreadStateException 
            at runtime*/    
    }
        System.out.println("Wen we call run method thread won't be created and each time id remains same when object was cretaed");
        for(int i=0;i<5;i++){
        Thread t1=new Thread(r1);
        t1.run();
        t1.run();//But we can call run method for single thread or one object multiple time
        }
    }
    
}
