package CollectionFrameWork.Collection.QandDq;
import java.util.*;
/*The Queue interface is present in java.util package and extends Collection interface
 * is used to hold the element is FIFO(First In First Out) manner
 * 
 * The common classes which extends the Queue interface is priorityQueue and LinkedList neither or these implementation is thread-safe
 * 
 * PriorityBlockQueue is the alernative one which gives the thread safe implementation
 */
public class Qin {
    public static void main(String[] args) {
        Queue<String> q1=new LinkedList<>();

        //Adding
        q1.add("Elem-1");
        q1.add("Elem-2");
        q1.add("Elem-3");
        q1.add("Elem-4");
        q1.add("Elem-5");
        q1.add("Elem-6");
        q1.add("Elem-7");
        q1.add("Elem-8");

        System.out.println("Q q1: "+q1+"\n");
        //Peak or head of the q
        System.out.println("Head of the Q: "+q1.peek());
        System.out.println("Removed Head of the Q element: "+q1.remove());
        System.out.println("Removed Elem-3 element: "+q1.remove("Elem-3"));
        System.out.println("Removed Head of the Q element:"+q1.poll());
        System.out.println(q1);
    }
    
}
