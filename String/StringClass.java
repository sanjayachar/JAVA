package String;
/* String is basically stream of charachters and in java string is also called as immutable whcih 
means a constant and cannot be changed once crated.
If we are going to change it will lead to creation of another object
*/ 

public class StringClass {
    public static void main(String[] args) {
        String s="Sanjay";//String object was created in the SCP area using s literal

        System.out.println(s.length());//prints the length of the string
        System.out.println(s.charAt(2));//prints the charecter at 2nd index of string
        System.out.println("Sanjay".equals(s));
        System.out.println("Sanjay".compareTo("Achar"));
    }
    
}
