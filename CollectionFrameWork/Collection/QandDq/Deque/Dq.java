package CollectionFrameWork.Collection.QandDq.Deque;

import java.util.ArrayDeque;

/*Dqueue interface is present in the java.util package and  it uses both data structures queue(FIFO) and stack(LIFO) 
 * It is the subinterface of the Queue interface and having ArrayDeque and LinkedList subclasses.
 * 
*/
/*And ArrayDeque:
 * ----------------
 * It provides way to apply resizable array an in addition Dequeue implementation
 * means array with adding and removing element from both the end
*/
public class Dq {
  public static void main(String[] args) {
    ArrayDeque<Integer>ad1=new ArrayDeque<>();
    ad1.add(10);ad1.add(20);ad1.add(30);ad1.add(40);ad1.add(50);ad1.add(60);ad1.add(70);ad1.add(80);ad1.add(90);ad1.add(100);
    System.out.println("Array Dequeu ad1: "+ad1+"\n");

    //to add first and last
    ad1.addFirst(1);ad1.addLast(2);
    System.out.println("After adding element first and last dequeue becomes: "+ad1);

    //to remove first and last
    ad1.removeFirst();ad1.removeLast();
    System.out.println("After removeing element first and last dequeue becomes: "+ad1+"\n");

    //returning or getting element first and last
    System.out.println("First element: "+ad1.getFirst()+"\nLast element: "+ad1.getLast()+"\n");

    //poll first and last method is used to remove and returns the first and last element
    System.out.println("Polling first element: "+ad1.pollFirst()+"\nPolling last element: "+ad1.pollLast());
    System.out.println("After polling first and last elements in the array dequeue: "+ad1);






  }  
}
