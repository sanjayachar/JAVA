package ObjectOrientedProgrammming;
/*A class is a set of objects which shares similar characteristics/behavior and
 * common properties/attributes
 * Class is not a real world entity. It is just a template to create an object
 * Class doesn't occupy memory
 * Class is a group of different variable of datatypes and a group of methods
 * 
 * class contains below:
 * ----------------------
 * Data member
 * method
 * constructor
 * nested class 
 * interface
 * 
 * Objects in java":
 * -------------------
 * It is a basic unit of OOP and represents real-life entities
 * An object consists of:
 * State:It's represented as attribute of an object. It also reflects the properties of an object.
 * Behavior:It is represented by the methods of an object
 * Identity:It gives unique name to an object and enables one object to interact with other objects
 * 
 * eg: dog
 * Identity name of dog
 * State/Attributes:breed, age, color
 * Behaviors:Bark, Sleep, Eat
 * 
 * When object of a class is created, the class is said to be instatiated
 * 
 * when we declare reference variable like int id;
 * the its value will be null untill an object is actually created and assigned to in.
 * Simply declaring a reference variable doesn't create an object
 * 
 * Inintialization of java object:
 * -----------------------------------
 * The new operator instatiates a class by allocating memory for a new object and returning a 
 * The new operator also invokes the class constructor
 * The constructor is used to initialize the state of an object while creation of an objects
 * 
 * Ways to create an object:
 * using new keyword
 * using Class.forName
 *      Test obj=(Test)Class.forName("com.p1.Test").newInstance();
 * using clone() method(creates and returns a copy of the object)
 *       Test t1=new Test();
 *          Test t2=(Test)t1.clone();
 * 
 * 
 */
public class ClassAndObject {
    int id;//data members also instance variable
}
