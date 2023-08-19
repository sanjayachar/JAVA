package Arrays;
import java.util.*;
public class ProgramFor2DArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalTestCases=sc.nextInt(),eachTestCase;
        int[][]arrMain=new int[totalTestCases][];

        for(int i=0;i<arrMain.length;i++){
            arrMain[i]=new int[eachTestCase=sc.nextInt()];
            for(int j=0;j<arrMain[i].length;j++)
                arrMain[i][j]=sc.nextInt();
        }
        for (int[] is : arrMain) {
            // int Even=0,Odd=0;
            for (int[] is2 : arrMain) {
                System.out.println(Arrays.toString(is)+" "+Arrays.toString(is2));
            }
        }
    }
}
