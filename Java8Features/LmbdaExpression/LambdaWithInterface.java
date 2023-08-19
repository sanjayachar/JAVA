package Java8Features.LmbdaExpression;
import java.util.*;
public class LambdaWithInterface {
    public static void main(String[] args) {
        List<Integer>lst=Arrays.asList(234,780,451,639,456,98,75,43);
        System.out.println("Before soring the list lst: "+lst);

        Collections.sort(lst,new Comparator<Integer>() {
            @Override
            public int compare(Integer a1,Integer a2){
                return a1%10>a2%10?1:-1;
            }            
        });
        System.out.println("After sorting the list lst: "+lst);
    }
}
