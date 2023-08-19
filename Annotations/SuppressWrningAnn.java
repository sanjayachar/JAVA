package Annotations;
import java.util.*;
/*This Annotation is used to suppress compiler warnings for specific elemnts.
 * It is commonly used when you know that a certain operation might cause a warning, but you are confident
 * that the code is safe and you don't want to see that warning
 */
public class SuppressWrningAnn {
    @SuppressWarnings("unchecked" )
    public static void main(String[] args) {
        List myList=new ArrayList();

        myList.add(3029);
    }
}
