package Leetcode;

public class StringPalindrome {
    public static void main(String[] args) {
        String str="maidam";
        System.out.println("The string madam is palindrome?: "+isPalindrome(str));

        String str2="   sanjay   ";
                System.out.println("Before removing the whitespace: \n"+str2);
        System.out.println("After removing the whitespace at string str2: \n"+removeWh(str2));
    }
    static boolean isPalindrome(String str){
        String str2="";
        for(int i=str.length()-1;i>=0;i--){
            str2+=str.charAt(i);
        }
        System.out.println(str+"\n"+str2);
        if(str.equals(str2))
        return true;
        return false;
    }
    static String removeWh(String str){
        String str2="";
        for(int i=0;i<str.length();i++){
            if(!Character.isWhitespace(str.charAt(i)))
            str2+=str.charAt(i);
        }
        return str2;
    }
}
