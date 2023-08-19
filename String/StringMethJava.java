package String;
import java.util.*;
/*In String we have various methods mainly we have 10 methods which is used mostly in 
 * applications
 */
public class StringMethJava {
    /*This method used to find the characters and substring in a string */
    public static void indexOfMethod(String str){
        System.out.println(str.indexOf("y"));//returns the index of the charecter or string
        System.out.println(str.indexOf("n",7));//returns -1 if the character is not is there from the index metioned
    }
    /*This method will form a new char arry  from the String */
    public static void toCharArrayMethod(String str){
        char[]chr=str.toCharArray();
        System.out.println(Arrays.toString(chr));//prints the String into character array format

    }
    public static void charAtMethod(String str){
        System.out.println(str.charAt(4));//returns the character at passed index value

    }
    public static void concatMethod(String str){
        System.out.println(str.concat(" B N"));//concats the string

    }
    public static void replaceMethod(String str){
        System.out.println(str.replace("S", "m"));

    }
    public static void substringMethod(String str){
        System.out.println(str.substring(1, 3));
    }
    public static void splitMeth(String str){
        System.out.println(str.split("|"));

    }
    public static void compareToMeth(String str,String str2){
        System.out.println(str.compareTo(str2));//prints 0 if the strings are equals

    }
    public static void stripMeth(String str){

    }
    public static void valueOfMeth(String str){
        System.out.println(String.valueOf(0));
    }
    public static void main(String[] args) {
        String str="Sanjay";
        String str2="Sajay";
        indexOfMethod(str);  
        toCharArrayMethod(str); 
        charAtMethod(str);
        concatMethod(str);
        replaceMethod(str);
        substringMethod(str);
        splitMeth(str);
        compareToMeth(str,str2);
        valueOfMeth(str2);
    }
    
}
