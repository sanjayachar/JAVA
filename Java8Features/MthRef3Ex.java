package Java8Features;
import java.util.*;
class Person{
    private String name;
    private Integer age;
    public Person(String name,Integer age){
        this.name=name;
        this.age=age;
    }
    public Integer getAge(){return age;}
    public String getName(){return name;}
}
public class MthRef3Ex {
    static int compareByName(Person a,Person b){
        return a.getName().compareTo(b.getName());
    }
    static int compareByAge(Person a,Person b){
        return a.getAge().compareTo(b.getAge());
    }
    public static void main(String[] args) {
        List<Person>psl=Arrays.asList(new Person("Sanjay", 22),
        new Person("Poonam", 25),new Person("Sachin", 19));

        Collections.sort(psl, MthRef3Ex::compareByName);
        System.out.println("Sort by name");
        psl.stream().map(x->x.getName()).forEach(System.out::println);

        Collections.sort(psl,MthRef3Ex::compareByAge);
        System.out.println("Sort by age:");
        psl.stream().map(x->x.getAge()).forEach(System.out::println);
    }
}
