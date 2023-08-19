package ObjectOrientedProgrammming;
/*Polymorphism:
 * We can define polymorphism as the ability of a message to be displayed in more then one form
 * It allows us to perform a single action in different ways.
 * The word "poly" means many and "morphs" means forms, So it means many forms.
 * Two types of java polymorphysm:
 * Compile-time polymorphism
 * Runtime Polymorphism
 * 
 */
class Parent{
    public  void hello(int a){
        System.out.println("parent method");
    }
}
public class PolymorphismInJava extends Parent{
    //static/Compile time polymorphism
    @Override
    // public void ello(int a){}this will show CE bcz we are overriding hello method with proper method signature and return type
    // public int hello(int a){} this also gives CE bcz parent hello method return type is void
    public void hello(int a){System.out.println("overrided method");}
    public void hello(int a,int b){}
    
}
