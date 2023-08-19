package CollectionFrameWork.Collection.List;
import java.util.*;

class AddElementsRunnable2 implements Runnable{
    private List<Integer>list;

    public AddElementsRunnable2(List<Integer>list){
        this.list=list;
    }
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            list.add(i);
            System.out.println(Thread.currentThread().getName()+" added: "+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class RemoveElementsRunnable2 implements Runnable{
    private List<Integer>list;

    public RemoveElementsRunnable2(List<Integer>list){
        this.list=list;
    }

    @Override
    public void run(){
        for(int i=0;i<3;i++){
            synchronized(list){//Synchronize on the list before performing the operation
                if(!list.isEmpty()){
                    int lastIndex=list.size()-1;
                    int removedElement=list.remove(lastIndex);
                    System.out.println(Thread.currentThread().getName()+" removed: "+removedElement);
                    try{
                        Thread.sleep(500);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("List is empty. Can't remove.");
                }
            }
        }
    }
}
public class SyncArrayList {
    public static void main(String[] args) {
        List<Integer> arrList=new ArrayList<>();

        //creating a synchronized wrapper around the ArrayList
        List<Integer> syncList=Collections.synchronizedList(arrList);

        //create and start multiple threads to add and remove elements concurrently
        Thread addThread=new Thread(new AddElementsRunnable2(syncList));
        Thread removThread=new Thread(new RemoveElementsRunnable2(syncList));

        addThread.start();
        removThread.start();

        try{
            //Wait for both thread to finish
            addThread.join();
            removThread.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Finish Synchronized List: "+syncList);
    }
}

