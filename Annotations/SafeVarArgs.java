package Annotations;
import java.util.*;

/*This annotation is used to suppress unchecked warnings that can occur when using varargs with generics */
public class SafeVarArgs {
    @SafeVarargs
    public final<T>List<T> asList(T... elements){
        return Arrays.asList(elements);
    }
    public static void main(String[] args) {
        SafeVarArgs sf=new SafeVarArgs();
        sf.asList("Sanjay");
        sf.asList(22);
        sf.asList(true);
        sf.asList('M');
        System.out.println();
    }
}
