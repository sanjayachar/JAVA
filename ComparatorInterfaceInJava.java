/*Comparator interface is used to define custom comparision logic for objects.
 * It is the part of the 'java.util' package and is commonly used for sorting collections or providing
 * custom ordering in data structures like TreeSet or PriorityQueue.
 * The Comparator interface allows you to compare two objects and determine their relative order
 */
import java.util.*;
class Person{
    private String name;
    private int age;
    public String getName(){return name;}
    public int getAge(){return age;}
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
//Below class implements the comparator interface to compare the age and sort
class AgeComparator implements Comparator<Person>{
    @Override
    public int compare(Person p1,Person p2){
        return(p1.getAge()-p2.getAge());
    }
}
public class ComparatorInterfaceInJava {
    public static void main(String[] args) {
        List<Person> psl=new ArrayList<>();
        psl.add(new Person("kjhvkhj",748));
        psl.add(new Person("aafju",242));
        psl.add(new Person("Kakjna",238392));
        System.out.println("Before Sorting");
        for(Person prs:psl){
            System.out.println(prs.getName()+"-"+prs.getAge());
        }
        Collections.sort(psl,new AgeComparator());
        System.out.println("\nAfter Sorting by age:");
        for(Person prs:psl){
            System.out.println(prs.getName()+"-"+prs.getAge());
        }
    }
    
}
