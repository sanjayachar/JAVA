package Leetcode;

public class RemoveOccurence {
    public static void main(String[] args) {
        String str="kajfkjahakkqwuakejfbfkbkauaikfbaaioakhjeiuehliaarblaijb";
        System.out.println(str);
        System.out.println(str.replace("a", ""));
        System.out.println(str.replace("k", ""));

        String str1="Sanjay";
        String str2="Sanjay";
        String str3=new String("Sanjay");
        String str4=new String("Sanjay");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
        try{
        System.out.println(1/0);
        }catch(ArithmeticException e){
            System.out.println("1 can't be devided by zero");
        }finally{
            System.out.println("Remember it....!");
        }
        String str5=null;
        try{
        System.out.println(str5.charAt(2));
        }catch(NullPointerException e){
            System.out.println("The String str5 is null so we should remember that at runtime NullPointerException will understand");
        }finally{
            System.out.println("Remember it.....!");
        }
    }
}
