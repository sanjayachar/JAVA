package ObjectOrientedProgrammming;
/*Class:-
---------------
It is a blueprint or prototype from which objects are created 
 * it represents the set of properties or methods that are common to all objects of one type
 * 
 * Class declarations can includes below components:
 * --------------------------------------------------
 * 1)Modifiers: A class can be public or have default access
 * 2)Class name:Initial latter should be capital
 * 3)Superclass(if any):The name of the parant class should be mention after extends keyword
 * 4)Interfaces(if any)
 * 5)Body:{}
 * 
 * Objects:-
 * ------------------
 * It's a basic unit of OOP that represents the real world entity.
 * It is defined as instance of class
 * 
 * An object mainly consists of:
 * ------------------------------
 * 1)State:It reflects the properties of an object.
 * 2)Behavior:It is represented by the methods of an object, It also reflects the responnse of an object to other  objects.
 * 3)Identity:It is a unique name given to an object that enables it to interact with other objects
 * 4)Method is a collection of statements that performs some specific task and return the result to the caller
 *  
 */
 /* 
 * 4 pillers of OOP's:
 * ---------------------*/
 abstract class Abstract{
     /*Abstraction
     * 1)Abstraction:It is the property which only shows the essential details to the user
     * In,, java abstraction is achieved by interfaces and abstract classes
     * we can achieve 100% abstraction using interfaces*/
        abstract void add();
        abstract void mul();
        abstract void div();
}
/*2)Encapsulation
 * It is defined as the wrapping up of data under a single unit
 * Another way to think about encapsulation is that it it a protective shield that prevents that
 * prvents the data from being accessed by the code outside this sheild.
 * It can be achieved by declaring all the variables in a class as private and writing public
 * methods in the class to set and get the values of the variables.
 */
public class OopBasic {
    private int empId;
    private String name;
    OopBasic(int empId,String name){
        this.empId=empId;
        this.name=name;
    }
    public int getEmpId(){
        return empId;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        OopBasic bsc=new OopBasic(93, "Sanjay");
        System.out.println(bsc.getEmpId()+"-"+bsc.getName());

        Sum sm =new Sum();
        System.out.println(sm.toString());
    }
}
/*3)Inheritance:
 * It is a machanisme in java by which one class id alloewd to inherit the features of another class
 * We are achieving inheritance by using extends keyword and also it known as "is-a" relationship
 * 
 * Superclass:The class whose feature are inherited is known as superclass(parent class)
 * SUbclass:The class which inherits the superclass is known as subclass(child class)
 * Reusability:When we want to create a new class and there is already a class that includes some of the code that we want
 * to create a new class from the existing class. By doing this we can achieve reusability
 *  
 */
class A{void meth1(){}void meth2(){}}
class B extends A{void meth3(){}void meth4(){}}

/*4)Polymorphism:
 * It refers to the OOp language to differentiate between entities with the same
 * name efficiently
 * This is done by java with help of the signature and declaration of these entities
 * 
 * eg:
 *      sleeo(1000)millis
 *      sleep(1000,2000)millis,nanos
 */
class Sum{
    public int sum(int x,int y){
        return x+y;
    }
    public int sum(int x,int y,int z){
        return x+y*z;
    }
    @Override
    public String toString(){
        return sum(10, 20)+" Compile time polymorphism "+sum(30, 40, 50);
    }
}