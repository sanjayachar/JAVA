package Java8Features.LmbdaExpression;

import java.util.*;

public class ArrayListToHashMap {
    public static void main(String[] args) {
        List<String> al=Arrays.asList("Apple","Banana","Orange","Mango");
        Map<Integer,String>hmap=new HashMap<>();
        int[]count={0};
        al.forEach(item->hmap.put(count[0]++,item));
        System.out.println("After converting ArrayList to HashMap: "+hmap);
    }
}
