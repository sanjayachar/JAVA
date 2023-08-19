package Java8Features.JavaStreams;
import java.util.*;
import java.util.stream.*;
/*Every streams works on three operations
 * 1)Data Souce
 * 2)Intermediate operation
 * 3)Terminal operation
 */
public class OperationStream {
    public static void main(String[] args) {
        /*Data source:Like array,List etc */
        List<String>names=Arrays.asList("Dean849q79","Caste9849e","Robe898q94778q49rt","D38ean","Cas0920983tee","Robe08u3rt","Dea9399n","Cas783tee","Robe73rt");
        System.out.println("List of names: "+names);
        Stream<String>streamOfNames=names.stream();
        System.out.println("List of names using streams: "+streamOfNames);

        /*Intermediate Operation:These are some methods that one can applay on a stream
         * Like filter(), map() methods
         * we can add any number of Intermediate operation like below example 
         * In below example we have 4 intermediate operations 
         * map: is to get the length of the each string 
         * filter:is to list the length should be less than 10
         * distinct: is to no repetation of the length
         * sorted:is to sort the length
         * sorted(Comparator.reverseOrder()):is to sort the length in reverse order
         * and finally
         * terminal operation forEach method
         */System.out.println("Length of the Each strings in the List names: ");
         System.out.println("Below stream is having 4 intermediate operation methods: ");
        names.stream().map(OperationStream::lengthOfString).filter(num->num<10).distinct().sorted().sorted(Comparator.reverseOrder()).forEach(name->System.out.print(name+" "));
        System.out.println();

        /*Terminal operation:Some terminal operations can be used to iterate on the elements of the stream 
         * Like min(), max(), count() forEach(),noneMatch() etc
        */
    }
    static Integer lengthOfString(String str){
        return str.length();
    }
}
