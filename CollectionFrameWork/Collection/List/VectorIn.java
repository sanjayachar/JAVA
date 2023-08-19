package CollectionFrameWork.Collection.List;
import java.io.Serializable;
import java.util.*;
/*The Vector class implements the dynamically growable array of objects which implements List interface
 * This class is very similar to ArrayList, but Vector is synchronized and has some legacy methods that collection framework doesn't contain
 * 
 * As mentioned vector is synchronizatio means it is best for multi threaded environment
 * 
 * Why: It is similar to the ArrayList but provides additional synchronization to make thread-
 * safe. However , this can reduces the performance compared to ArrayList.
 * 
 * What: It's dynamic array with similar functionalities to ArrayList, but the methods in the 
 * Vector are synchronized.
 * 
 * Where: In most of cases, ArrayList is preferred over Vector due to better performaance,
 * If we need a synchronized list for multi-thread environments, Vector can be used.
 */
/*We can use Serializable anywhere if we want an object's in the streame of byte format by implementing */
public class VectorIn implements Serializable{
   public static void main(String[] args) {
    Vector<Integer>v1=new Vector<>();//creates empty collections
    v1.add(10);
    v1.add(20);
    v1.add(30);
    System.out.println("Vector v1: "+v1);
    Vector<Integer>v2=new Vector<>(v1);
    v2.add(40);
    v2.add(50);
    v2.add(60);
    System.out.println("Vector v2: "+v2);
    Vector<Integer>v3=new Vector<>(10);//vector with initial capacity
    v3.add(15);v3.add(25);v3.add(35);v3.add(45);
    System.out.println("Vector v3 with initial capacity 10: "+v3);

    Vector<Integer>v4=new Vector<>(10,4);//this constructor initializes by 10 and the size  increse it in to 4

    v3.set(2,36);
    System.out.println("After updating the vector v3: "+v3);

    Class<?> cls=VectorIn.class;
    System.out.println("Is this class urs truly implements the Serailizable interface?: "+Serializable.class.isAssignableFrom(cls));
   } 
}
