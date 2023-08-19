package Annotations;
/*FunctionalInterface is the annotation introduced in java 8
 * If we declare  interface as a FunctionalInterface then that interface can only  use or we must use one method
 * rather we can use any number of default and static method
 */
@FunctionalInterface
interface Functional{
    public int performOp(int a,int b);
    // public int performOP(int a ,int b,int c); if we use another abstract method then we will get CE
    default String performOP(String a,String b){
        return a+" "+b;
    }
    static int performOP(int a,int b,int c){
        return a+b+c;
    }
    static double performOP(double sal1,double sal2){
        return sal1+sal2;
    }
}
public class FunctionalInterfaceAnn implements Functional{
    @Override
    public int performOp(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        FunctionalInterfaceAnn fn=new FunctionalInterfaceAnn();
        System.out.println("The name is: "+fn.performOP("B N", "Sanjay"));
        System.out.println("Age is: "+Functional.performOP(10, 10,2));
        System.out.println("Salary is: "+Functional.performOP(20000f, 20000f));
    }
}
