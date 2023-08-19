/*Functional interface is an interface that contains exactly one abstract method in java 8
 * Along with one abstract method we can also use default or static methods, but they must have only one abstract method
 * java 8 introduced the @FunctionalInterface annotation to explicitly declare an interface is a functional interface 
 */
@FunctionalInterface
interface FuncInter{
    String doSomething();
    // void hello(); if we use another method compiler rises CE 
    default void hello1(){
        System.out.println("default method");
    }
    static void hello2(){
        System.out.println("static method");
    }
}
public class FunctionaInter {
    public static void main(String[] args) {
        FuncInter ft=()->{
            return "Did na something?";
        };
        System.out.println(ft.doSomething());
        FuncInter.hello2();
    }
}
