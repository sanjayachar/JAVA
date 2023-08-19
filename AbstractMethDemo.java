abstract class A{
    abstract void m1();
    void m2(){
        System.out.println("this is concrete method");
    }
}
class B extends A{
    @Override
    void m1(){
        System.out.println("m1 super class method has been implemented");
    }
}
public class AbstractMethDemo{
    public static void main(String[] args) {
        B b=new B();
        b.m1();
        b.m2();
    }

}