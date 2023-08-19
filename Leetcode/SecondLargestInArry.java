package Leetcode;
import java.util.*;
public class SecondLargestInArry {
    public static void main(String[] args) {
        int[]arr={20,10,40,15,40,50};
        int high=Integer.MIN_VALUE,secHigh=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>high){
                secHigh=high;
                high=i;
            }else if(i>secHigh){
                secHigh=i;
            }
        }
        System.out.println(secHigh);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
