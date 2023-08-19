package CollectionFrameWork.Collection.QandDq;
import java.util.*;
/*The stack class is a lagacy class and inherits from Vector in java
 * It is thread safe, if we don't want it invloves overhead
 * So it is recommended to use ArrayDequeue for stack implementation as it is more efficient in a single-threaded environment.
 */
public class DequeOverStack {
    public static void main(String[] args) {
        Deque<Character>stack=new ArrayDeque<>();//this Deque also contains the push, pop, remove, and peek like Stack
        stack.push('A');
        stack.add('B');
        stack.add('C');
        //if we add element before pushing then it will store first
        stack.push('D');
        System.out.println("Deque version of Stack stack is: "+stack);//output for this is [D,A,B,C]

        //Onemore reason to use Deque over Stack is Deque has the ebility to use streams convert to list with keeping LIFO concept 
    }
}
