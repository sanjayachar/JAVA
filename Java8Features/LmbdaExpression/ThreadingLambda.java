package Java8Features.LmbdaExpression;

public class ThreadingLambda {
    public static void main(String[] args) {
        Runnable myThread=()->System.out.println("The current thread name is: "+Thread.currentThread().getName());
        Thread run=new Thread(myThread);
        run.start();
        
        Thread run2=new Thread(()->System.out.println("The current Thread name is: "+Thread.currentThread().getName()));
        run2.start();
    }
}
