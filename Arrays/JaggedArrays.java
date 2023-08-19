package Arrays;
import java.util.*;
/*It's an array where the member arrays can be different in size
 * Means the size of each column in each row is different         
 */
public class JaggedArrays {
    public static void main(String[] args) {
        //for eg
        final int[][]arr=new int[2][];
        int[][]arr2=new int[4][];
        // arr=arr2; this will give us error bcz we can't assign the final variable to others
        //Making Jagged array we have to assign the size for each column
        arr[0]=new int[3];
        arr[1]=new int[4];
        for(int i=0;i<arr.length;i++)
        for(int j=0;j<arr[i].length;j++)
        arr[i][j]+=i+j;

                Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++)
        System.out.print(arr[i][j]+" ");
        System.out.println(arr2);
        }
    }
    
}
