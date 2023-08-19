package CollectionFrameWork.Collection.QandDq;

import java.util.concurrent.ArrayBlockingQueue;

/*
 * It is a class which implemets the Queue interface where the size of an array is fixed and we have to mention 
 */
public class ArrayBlockingQ {
    public static void main(String[] args) {
       // define capacity of ArrayBlockingQueue
        int capacity = 5;
  
        // create object of ArrayBlockingQueue
        // using ArrayBlockingQueue(int initialCapacity) constructor
        ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<Integer>(capacity);
  
        // add  numbers
        abq.add(1);
        abq.add(2);
        abq.add(4);
        abq.add(5);
        // abq.add(6); gives Exception IllegalState
        // abq.add(7); gives Exception IllegalState

        
        // print queue
        System.out.println("ArrayBlockingQueue:" + abq);   
    }
    
}
