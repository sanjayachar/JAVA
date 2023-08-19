package CollectionFrameWork.Collection.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*Comparator is an interface is a part of the java.util used to define custom comparision logic for sorting elements in a collections
 * It is primarily used with sorting algo like Collections.sort() or Arrays.sort()
 * 
 * Comparator has a single method called compare(T o1, T o2) where T is a type of element being compared
 * compare() method compares the two elements o1 and o2 and returns their relative order.
 * The returned value determines whether o1 should come before, after or equal to o2 in the sorting order
 * o1 should come befor o2(-ve value)
 * o1 should come after o2(+ve value)
 * o1==o2(0)
 * 
 * Comparable is similar to the Comparator interface  which having only one method called compareTo
 * 
 */
class Person2 implements Comparator<Person2>{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    Person2(String name,int age){
        this.name=name;
        this.age=age;
    }
    Person2(){}
    @Override
    public int compare(Person2 p1,Person2 p2){
        return p1.getAge()-p2.getAge();
    }
}
class Person implements Comparable<Person>{

    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
/*compareTo is empty method in the Comparable method so we should implement it for our conveinient */
    @Override
    public int compareTo(Person othPerson){
        return this.age-othPerson.age;
    }
}
public class ComparableAndComparator {
    public static void main(String[] args) {
          List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 40));
        
        // Sorting based on natural ordering (age in this case)
        Collections.sort(people);

        // Print sorted list
        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
        System.out.println();
        //for Comparator
        List<Person2> people2=new ArrayList<>();
        people2.add(new Person2("Alice",30));
        people2.add(new Person2("Bob", 25));
        people2.add(new Person2("Charlie", 40));

        Collections.sort(people2, new Person2());
        for (Person2 person2 : people2) {
            System.out.println(person2.getName()+" - "+person2.getAge());
        }

    }
}
