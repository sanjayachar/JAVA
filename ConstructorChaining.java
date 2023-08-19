/*Constructor chaining occurs through inheritance: A subclass constructor task is to call
 * super class's constructor first
 * This ensures that creation of sub classe's object starts with the initialization of the
 * dat members of the superclass.
 * There could be any number of classes in the inheritance chain. Every constructor calls up the chain till the class at the top is reached.
 * 
 * Why do we need this: bcz when we want to perform multiple tasks in a single constructor rather than creating a code for each task in a
 * single constructor we create a seperate constructor for each task and make their chain which makes the program more readable.
 * 
 */
class A{
    int a;
    A(){
        this(10);
        System.out.println("Super class constructor");
    }
    A(int a){
        this.a=a;
    }
}
public class ConstructorChaining extends A{
    ConstructorChaining(){
        System.out.println("No args constructor");
    }
    ConstructorChaining(int a){
        super(a);
        System.out.println("Subclass Constructor-");
    }
    public static void main(String[] args) {
        ConstructorChaining ch1=new ConstructorChaining(10);
    }
    
}
