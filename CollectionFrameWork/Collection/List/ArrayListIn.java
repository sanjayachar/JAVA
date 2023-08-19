package CollectionFrameWork.Collection.List;
import java.util.*;
/*ArrayList is the class which implements the List interface and it is one of the subclass of List interface
 * It provides dynamic array in java
 * It may be slow as compared to standard array but helpfull for lots of array manipulation
 * The main advantage in java ArrayList is we need not be initialize the size like standard array
 * 
 * Important features:
 * ----------------------
 * 1)ArrayList inherits AbstractList class and implements the List interface
 * 2)ArraysList is initialized by size. The size increases automatically and decreses if object are removed
 * 3)Java ArrayList allows us to randomly access the list
 * 4)It usess Wrapper classe rather it won't use primitive type data
 * 5)ArrayList in java can be seen as a Vector in c++
 * 6)ArrayList is not Synchronized(thread unsafe:). The synchronized(thread safe) class in java is Vector
 * 
 * ArrayList(Asynchronization):This means it is not-thread safe, and multiple threads can modify it concurrently
 * without any restrictions 
 * This will provides better performance in single thread scenarios
 * Vector(Synchronization):It is Designed to be thread-safe. It provides synchronization for all of its methods,
 * means multiple threads can't modify it simultaniously.When a thread wants to access or modify a Vector, it must acquire the
 * lock on the object, and other threads will have to wait untill the lock is released before performing their own operations on the Vector
 * 
 * Use ArrayList: When you are working in a single-threaded environment or when you are handling synchronization(external sync-block)
 * Use Vector: When you need a thread-safe implementation and don't want to handle sync explicitly
 * 
 * 
 * Why:This class is implemented as a resizable array. It provides fast random access and is 
 * suitable for the situations where elements are frequently accessed by their index.
 * 
 * What: It's dynamic array that can grow and shrinks in size as needed. It allows duplicates
 * and maintains the insertion of elements.
 * 
 * Where: Use when we need fast access to elements by index, and the list's size may change dynamically.
 * (Becuase the elements are stored in contigeous way so we can access quickly as possible)
 * And if we want single thread operation use ArrayList(It is thread unsafe).
 * 
 * How ever We can achive synchronization using Collections.synchronizedList() method
 */
public class ArrayListIn {
    public static void main(String[] args) {
        //Constructor used in the ArrayList
        ArrayList<Integer>arr1=new ArrayList<>();//this constructor is used to build empty array lust
        arr1.add(10);
        arr1.add(20);
        System.out.println("ArrayList arr1: "+arr1);
        ArrayList<Integer>arr2=new ArrayList<>(arr1);//this constructor first copy the collection arr1 and adds 30, 40
        arr2.add(30);
        arr2.add(40);
        System.out.println("ArrayList arr2: "+arr2);

        ArrayList<Integer>arr3=new ArrayList<>(5);//Using this constructor we can intialize the capacity

        arr1.set(0, 300);//changing the element
        System.out.println("After changing the list arr1: "+arr1);
        arr2.remove(1);
        System.out.println("After removing the element in list arr2: "+arr2);

        //iterating

        Iterator<Integer> it=arr2.iterator();
        for (Integer integer : arr3) {
            System.out.println(it.next());
        }

        System.out.println("at index 1 in the list arr2: "+arr2.get(1));

        Collections.sort(arr1);

        System.out.println("After sorting the arr1: "+arr1);

    }
    
}
