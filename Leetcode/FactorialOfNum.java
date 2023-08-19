package Leetcode;

import java.util.*;

public class FactorialOfNum {
    public static void main(String[] args) {
        int num1=1,num2=10,fact=1;
        for(int i=1;i<=num2;i++){
            fact*=i;
        }
        System.out.println(fact);
        LinkedList<Integer>lst=new LinkedList<>();
        lst.add(10);lst.add(20);lst.add(30);lst.add(40);
        System.out.println("Before reversing the List: "+lst);
        LinkedList<Integer>lst2=new LinkedList<>();
        for(int i=lst.size()-1;i>=0;i--){
            lst2.add(lst.get(i));
        }
        System.out.println("After reversing the list: "+lst2);
    
        int arr1[]={10,20,30,40};int arr2[]={10,30,20,40};boolean bool=true;
        System.out.println(Arrays.toString(arr1)+"\n"+Arrays.toString(arr2));
        Arrays.sort(arr1);Arrays.sort(arr2);
                System.out.println(Arrays.toString(arr1)+"\n"+Arrays.toString(arr2));
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                bool=false;
            }
        }
        System.out.println(bool);
        int catchVal=0;
        for(int i=1;i<=arr1.length-1;i++)
        arr1[0]+=arr1[i];
        System.out.println(arr1[0]);

    }
    
}
