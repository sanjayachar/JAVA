package Java8Features.LmbdaExpression;
/*Variable capturing is a mechanism or ability of a lambda expression to access and use variable from surrounding
 * or enclosing scope
 * 
 * When LE references variables from the enclosing scope, those variables are captured by the LE, and their values are
 * retained when the lambda is executed.
 */
@FunctionalInterface
interface MyFunctionalInterface{
    int calculateSum();
}
public class VariableCapturing {
    public int data=30;
    public static void main(String[] args) {
        int x=10,y=20;

        MyFunctionalInterface sumFunction=()->{
            return x+y;
        };
        System.out.println("Result: "+sumFunction.calculateSum());

        /*Example-2 */
        VariableCapturing vr=new VariableCapturing();
        MyFunctionalInterface sumFun2=()->{
            return vr.data+x+y;
        };
        System.out.println("Result after adding x, y and instance data: "+sumFun2.calculateSum());
    }
}
