package Java8Features.FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.*;

/*It is same as Consumer interface but it will take two type parameter input
 * void accept(T t, U u);
 */
public class BiConsumerInt {
    public static void main(String[] args) {
        List<Integer>lst1=Arrays.asList(1,2,3,4,5);
        List<Integer>lst2=Arrays.asList(6,7,8,9,10);
        BiConsumer<List<Integer>,List<Integer>>equals=(list1,list2)->{
            if(list1.size()!=list2.size())
                System.out.println("Not equals");
            else{
                for(int i=0;i<list1.size();i++)
                    if(list1.get(i)!=list2.get(i)){
                        System.out.println("Not equals");
                        return;
                    }
                    System.out.println("Equals");
                }
        };
        equals.accept(lst1, lst2);

        BiConsumer<List<Integer>,List<Integer>>disp=(list1,list2)->{
            list1.stream().forEach(a->System.out.print(a+" "));
            list2.stream().forEach(a->System.out.println(a+" "));
        };
        equals.andThen(disp).accept(lst1, lst2);
    }
}
