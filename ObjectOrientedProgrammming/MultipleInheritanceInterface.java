package ObjectOrientedProgrammming;
/*default methods is used in interface to implement the method inside the interface
 * this feature is added from Java 8 onwards
 */
interface A{
    default void show(){
        System.out.println("Default A");
    }
}
interface B{
    default void show(){
        System.out.println("Default B");
    }
}
public class MultipleInheritanceInterface implements A,B{
    @Override
    public void show(){
        A.super.show();
        B.super.show();
    }
    public void showA(){
        A.super.show();
    }
    public void showB(){
        B.super.show();
    }
    public static void main(String[] args) {
        MultipleInheritanceInterface ml=new MultipleInheritanceInterface();
        ml.show();
        ml.showA();
        ml.showB();
    }
    
}
