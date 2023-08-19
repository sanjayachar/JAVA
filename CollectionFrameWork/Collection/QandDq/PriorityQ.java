package CollectionFrameWork.Collection.QandDq;

import java.util.PriorityQueue;

/*PriorityQ is the class which implements the Queue interface which provides us a way to process the objects
 * based on the priority
 * It is known that a q follows FIFO algo, but some time it is required to be processed according to the priority
 * that's why PriorityQueue is used
 * 
 */
public class PriorityQ {
    public static void main(String[] args) {
        /*Elemets may enter randomly without priority but it will store in a random way */
        PriorityQueue<Integer>pq1=new PriorityQueue<>();
        pq1.add(10);
        pq1.add(9);
        pq1.add(20);
        pq1.add(15);
        pq1.add(12);
        pq1.add(13);
        System.out.println("The PriorityQueue collections based on the elements priority: "+pq1);
    }
}
