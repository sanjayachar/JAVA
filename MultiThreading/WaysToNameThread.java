package MultiThreading;
class MyThread4 extends Thread{
    @Override
    public void run(){
        System.out.println("The name of the thread using Thread interface: "+Thread.currentThread().getName());
    }
    MyThread4(String str){
        super(str);
    }
    MyThread4(){

    }
}
class MyRunnable1 implements Runnable{
    @Override
    public void run(){
        System.out.println("The name of the thread using Runnable interface: "+Thread.currentThread().getName());
    }
}
public class WaysToNameThread {
    public static void main(String[] args) {
        System.out.println("Naming the thread by passing through constructor\n-------------------------------------------");
        MyThread4 t1=new MyThread4("Sanjay's");
        MyRunnable1 r1=new MyRunnable1();
        Thread t2=new Thread(r1,"Runnable's name");
        t1.start();
        t2.start();
        System.out.println();
        
        System.out.println("Naming the thread by using setName method\n-------------------------------------------");
        MyThread4 t3=new MyThread4();
        MyRunnable1 r2=new MyRunnable1();
        Thread t4=new Thread(r2);

        t3.setName("Sanjay's setName method");
        t4.setName("Runnable's setMeth method");
        
        t3.start();
        t4.start();
        

    }
}
