package Java8Features.LmbdaExpression;
/*Lmbda expression with parameters
 * zero, single and multiple parameter
 * 
 * Using Lambda expression makes it easier to use and support other API's
 * 
 * Java lambda expression/ function can be only used with functional interface
 */
@FunctionalInterface
interface ZeroParm{
    String name1();
}
@FunctionalInterface
interface SingleParm{
    int singleParam(int a);
}
@FunctionalInterface
interface MultipleParam{
    int multipleParam(int a,int b,int c);
}
public class Lambda1 {

    static int sun(MultipleParam mp,Integer p1,Integer p2,Integer p3){
        mp.multipleParam(p1, p2, p3);
        return p1+p2+p3;
    }
    public static void main(String[] args) {
        //lambda expression for zero parameter
        ZeroParm zero=()->"Sanjay";

        //lambda expressoin for single parameter
        SingleParm single=(int a)->a;

        //lambda expression for multiple parameter
        MultipleParam multiple=(int a,int b,int c)->a+b+c;

        System.out.println("Name is: "+zero.name1());
        System.out.println("Age is: "+single.singleParam(22));
        System.out.println("Salary is: "+multiple.multipleParam(10000, 10000, 20000));
        
        System.out.println(sun((p1,p2,p3)->p1+p2+p3,20,30,40));
    }
    
}
