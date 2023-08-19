package Leetcode;

public class Reverese {
    public static String withoutThird(int a,int b){
        a+=b;
        // System.out.println(a);
        b=a-b;
        a-=b;
        return "After swapping a= "+a+"\nAfter swapping b= "+b;
    }
    public static String reverse(String in){
        String out="";
        for(int i=in.length()-1;i>=0;i--){
            out+=in.charAt(i);
        }
        return out;
    }
    public static void main(String[] args) {
        String str="123";
        int a=10,b=20;
        System.out.println(reverse(str));
        System.out.println(str.length());
        System.out.println("Initial a= "+a+"\nIntial b= "+b);
        System.out.println(withoutThird(a, b));
    }
}
