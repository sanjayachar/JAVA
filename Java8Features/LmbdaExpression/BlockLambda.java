package Java8Features.LmbdaExpression;
/*Block lambda expression is a type of lambda expression that contains of multiple statment or a block of code
 * enclosed within curly braces{}
 * Block Lambda expressions are used when the lambda logic requiresn more than one expression or when we need to 
 * perform multiple operations within the lambda 
 */
@FunctionalInterface
interface MathOp{
    int performOp(int a, int b);
}
public class BlockLambda {
    public static void main(String[] args) {
        MathOp op=(a,b)->{
            for(int i=0;i<=b;i++){
                a+=i;
                b+=i;
                System.out.print(a+", "+b+"\n");
            }
            return a+b;
        };
        System.out.println("Sum: "+op.performOp(10, 20));
    }
    
}
