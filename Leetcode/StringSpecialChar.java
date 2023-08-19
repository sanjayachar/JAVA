package Leetcode;
import static java.util.Arrays.*;
import java.util.*;
class Base{
    void print(){
        System.out.println("Base class");
    }
}
class Derived extends Base{
    @Override
    void print(){
        System.out.println("Derived class");
    }
}
public class StringSpecialChar {
    public static void main(String[] args) {
        String str1="Sanjay#k!@$%^";int count=0;
        String str2="";
        for(int i=0;i<str1.length();i++){
        if(!Character.isDigit(str1.charAt(i))&&!Character.isWhitespace(str1.charAt(i))&&!Character.isLetter(str1.charAt(i)))
        count++;
        else
        str2+=str1.charAt(i);
        }
        System.out.println(str2);

        float num1= 500,num2= 500;
        System.out.println(num1==num2);

        Base bs1=new Base();
        Base bs2=new Derived();
        Derived bs3=new Derived();
        bs1.print();bs2.print();bs3.print();

        int[]arr={3,30,34,5,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        String str3="CloudComputingTechnologyInYourCarrier",str4="";
        for(int i=0;i<str3.length();i++){
            if(str3.charAt(i)!='c'&&str3.charAt(i)!='C'){
                str4+=str3.charAt(i);
            }
        }
        System.out.println(str4);

        int[]arr2={10,20,30,40,50};
        int[]arr3={10,20,30,50,40,80};
        boolean ans=true;
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr2)+"\n"+Arrays.toString(arr3));
        if(isSame(arr3, arr2))
        System.out.println("arrays are same");
        else
        System.out.println("arrays are not same");

    }
    static boolean isSame(int[]arr1,int[]arr2){
        if(arr1.length!=arr2.length)
        return false;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])
            return false;
        }
        return true;
    }
}
