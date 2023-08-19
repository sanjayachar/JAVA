package CollectionFrameWork.Collection.List;
import java.util.*;
/*Stack is a class whcih implements stack data structure. It is based on principle of LIFO(last in first out)
 * in addition to that basic push and pop operations, This class provides more operations like empty, search and peek
 * 
 * This class can also be said to extend Vector and treats the class as a stack with five mentioned functions
 * 
 * Why:Stack  is a subclass of Vector and represents the LIFO data structure.It is typically 
 * used implementing algorithms like recursion, parsing expression, and backtracking.
 * Because of Stack inherits the Vector class so it obtains the synchronization(thread-safe).
 * 
 * What:It also provides extra features like stack data structures (push, pop, peek)
 * 
 * Where: If we want to implement a stack data structure, use the Stack class.
 */
public class StackIn {
    public static void main(String[] args) {
        Stack<Integer>s1=new Stack<>();
        s1.add(10);/*this is because the Stack contains only 5 operation push, pop, peek, search, empty
        these all methods is inherited by Vector class (Stack extends the Vector class)
        */
        s1.push(20);
        System.out.println("Item inside the Stack s1: "+s1);
        s1.push(30);
        s1.push(40);
        System.out.println("Last item in the Stack s1: "+s1.peek());
        s1.pop();
        System.out.println("after poppin the element s1 becomes: "+s1);
    } 
    
}
