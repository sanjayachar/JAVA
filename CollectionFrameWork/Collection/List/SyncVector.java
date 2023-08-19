package CollectionFrameWork.Collection.List;
import java.util.*;

/*In this example, we use Vector class, which is already thread-safe, to store integers.
We create two threads, AddElementsRunnable and RemoveElementsRunnable whcih will add elements and remove elements
from the vector, respectively. The Vector class ensures that the cocurrent modifications to the vector are synchronized and thread-safe
so there won't be any issues with concurrent access.


Point to remember:
----------------------------
The Vector is older class, and in modern Java, it is often recommended to use ArrayList with proper synchronization mechanizm
(e.g., using Collections.synchronizedList)
 * 
 */

class AddElementRunnable implements Runnable{
    private Vector<Integer> vector;

    public AddElementRunnable(Vector<Integer> vector){
        this.vector=vector;
    }
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"added: "+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
class RemoveElementsRunnable implements Runnable{
    private Vector<Integer> vector;

    public RemoveElementsRunnable(Vector<Integer>vector){
        this.vector=vector;
    }

    @Override
    public void run(){
        for(int i=0;i<3;i++){
            if(!vector.isEmpty()){
                int lastIndex=vector.size()-1;
                int removedElement= vector.remove(lastIndex);
                System.out.println(Thread.currentThread().getName()+" removed: "+removedElement);
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }else{
                System.out.println("Vector is empty. Connect remove.");
            }
        }
    }
}
public class SyncVector {
    public static void main(String[] args) {
        //creates a thread safe vector
        Vector<Integer> threadSafeVector=new Vector<>();

        //create and start multiple threads to add remove elements concurrently
        Thread addThread=new Thread(new AddElementRunnable(threadSafeVector));
        Thread removThread=new Thread(new RemoveElementsRunnable(threadSafeVector));

        addThread.start();
        removThread.start();
        try{
            //Wait for both threads to finish
            addThread.join();
            removThread.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Final Vector: "+threadSafeVector);

        System.gc();
    }
    
}
