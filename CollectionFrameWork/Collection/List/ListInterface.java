package CollectionFrameWork.Collection.List;
import java.util.*;
/*List interface is a way to store the ordered collection.
 * It is the child interface of Collection. It is the ordered collection so in which duplicate values can be stored
 * sub classes of List interface is:Stack, Vector, ArrayList, LinkedList
 * The Vector class is Depricated since Java 5.
 * 
 * List represents an ordered collection of elements
 */
class AddMeth{
    static List<Integer> add(){
        List<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        return l;
    }
}
class SetMet{
    static List<Integer> set(){
        List<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        System.out.println("Original list: "+l);
        l.set(0,40);
        return l;
    }
}
class SubList{
    static List<String> subList(){
        List<String>l=new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("c");
        l.add("D");
        l.add("E");
        // System.out.println(l);
        return l.subList(1, 2);
    }
}
class IndexOf{
    static int indexOf(){
        List<Integer>l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        // return l.indexOf(40); this will returns the index 3
        return l.indexOf(3);//this will returns -1
    }
}
class LastIndexOf{
    static Integer lastIndexOf(){
        List<Integer>l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        // return l.lastIndexOf(35); this will returns the -1 bcz there is no 35 exist in the list
        return l.lastIndexOf(40);
    }
}
class Remove{
    static List<String> remove(){
        List<Integer>l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println("Original list: "+l);
        l.remove(2);//tgis will removes the 2nd index value
        System.out.println("After removing the 2nd index value: "+l);
        List<String>l2=new ArrayList<>();
        l2.add("Sanjay");
        l2.add("B");
        l2.add("N");
        System.out.println("Original list of l2: "+l2);
        l2.remove("N");
        return l2;
    }
}
class Get{
    static int get(){
        List<Integer>l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        return l.get(3);
    }
}
class Contains{
    static boolean contains(){
        List<Integer>l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        return l.contains(30);
    }
}
class AddAt{
    static List<Integer>index(){
        List<Integer>l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(40);
        l.add(50);
        System.out.println("The original list is: "+l);
        l.add(2, 30);
        return l;
    }
}
class AddAll{
    static List<Integer>addAll(){
        List<Integer>l1=new ArrayList<>();
        
        List<Integer>l2=new LinkedList<>();//we can use ArrayList also and LinkedList also
        
        l1.add(10);l1.add(20);l1.add(30);
        System.out.println("List l1: "+l1);
        
        l2.add(30);l2.add(40);l2.add(50);
        System.out.println("List l2: "+l2);
        
        l1.addAll(l2);

        return l1;
    }
}
class Size{
    static int size(){
        List<Integer>l=new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        return l.size();
    }
}
class Clear{
    static List<Integer>clear(){
        List<Integer>l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println("Original list: "+l);
        l.clear();
        return l;
    }
}
class Equals{
    static boolean equals(){
        List<Integer>l1=new ArrayList<>();
        List<Integer>l2=new LinkedList<>();
        l1.add(10);l1.add(20);l1.add(30);
        l2.add(10);l2.add(20);l2.add(30);

        return l1.equals(l2);
    }
}
class HashCode{
    static int hashCODE(){
        List<Integer>l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        return l.hashCode();
    }
}
class IsEmpty{
    static boolean isEmpty(){
        List<Integer>l=new ArrayList<>();
        return l.isEmpty();
    }
}
class ContainsAll{
    static boolean containsAll(){
        List<String>l1=new ArrayList<>();
        List<String>l2=new LinkedList<>();
        l1.add("Sanjay");l1.add("Manju");l1.add("Kavi");l1.add("Mr.Nags");
        System.out.println("List l1: "+l1);
        l2.add("Sanjay");l2.add("Manju");
        System.out.println("List l2: "+l2);
        return l1.containsAll(l2);
    }
}
public class ListInterface {
    public static void main(String[] args) {
        //adding the method
        System.out.println("Added list: "+AddMeth.add()+"\n");

        //set method is to update the list
        System.out.println("Updated kist: "+SetMet.set()+"\n");

        //subList() is used return the portion of the list between specified index
        System.out.println("Sub list of list l: "+SubList.subList()+"\n");

        //indexOf() method returns the index if the element is present else it will print -1
        System.out.println("Index of 3(it isn't exist in the list): "+IndexOf.indexOf()+"\n");

        //lastIndexOd method returns the last index if the element is exist otherwise returns -1
        System.out.println("Last index of value 40 is: "+LastIndexOf.lastIndexOf()+"\n");

        //removes the value mentioned or we can pass the index value
        System.out.println("After removing the element 'N' in the list l2: "+Remove.remove()+"\n");

        //get() method will returns the value at the index passed
        System.out.println("The value at the index 3 is: "+Get.get()+"\n");

        //contains method returns true is the value exist inside the list
        System.out.println("Value 30 is exist in the list?: "+Contains.contains()+"\n");

        //add(index,value) will adds the value at mentioned/passed index
        System.out.println("After adding the value 30 at index 2 the list will become: "+AddAt.index()+"\n");

        //addAll method will merges the two lists or adds some value of one list to another list
        System.out.println("After merging l1 with l2: "+AddAll.addAll()+"\n");

        //size will returns the size of the list
        System.out.println("The size of the list: "+Size.size()+"\n");

        //clear method will removes the entire element in the list
        System.out.println("After calling the clear method list will become: "+Clear.clear()+"\n");

        //equals method will checks whether the l1 list is equals to the l2
        System.out.println("List l1 equals to List l2?: "+Equals.equals()+"\n");

        //in java JVM creates each hash code(identity) for an object so we can get that object hashcode by callling hashcode method
        System.out.println("Hash code of list l: "+HashCode.hashCODE()+"\n"); 

        //isEmpty method will returns true if the list is empty otherwise returns false
        System.out.println("List l is empty?: "+IsEmpty.isEmpty()+"\n");

        //contanins all check and returns if the one list contanins all element of another list
        System.out.println("List l1 contains all the elements in List l2?: "+ContainsAll.containsAll()+"\n");


        System.gc();
    }
    
}
