package MultiThreading.Synchronization;

import java.util.concurrent.*;

public class CollectionsWaitNotifyAll {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer>q=new ArrayBlockingQueue<>(5);

        Thread producer=new Thread(()->{
            for(int i=0;i<=10;i++){
                try {
                    q.put(i);
                    System.out.println("Produced: "+i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread consumer=new Thread(()->{
            try{
            for(int i=0;i<=10;i++){
                int item=q.take();
                System.out.println("Consumed: "+item);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        });
        producer.start();consumer.start();
        producer.join();consumer.join();
    }
}
