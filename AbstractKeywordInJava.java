
abstract class A{
abstract void m1();
void m2(){
    System.out.println("This is a non abstract method");
}
}
public class AbstractKeywordInJava extends A{
    void m1(){
        System.out.println("A's method");
    }
    public static void main(String[] args) {
        System.out.println("Main method");
        AbstractKeywordInJava a=new AbstractKeywordInJava();
        a.m1();
        a.m2();

    }
}
