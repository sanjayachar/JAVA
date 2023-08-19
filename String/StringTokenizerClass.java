package String;

import java.util.*;

/*StrijngTokenizer class in java is used to break a sting into tokens 
 * A token is returned by taking a substring of the stiring that was used to create the StringTokenizer object
 * This class allow an application to break strings into tokens.
 * for eg:-
 *          "Hello Sanjay How Are You" is the string
 *          tokens divides into 5 substrings
*/
public class StringTokenizerClass {
    public static void main(String[] args) {
        /*constructor 1
         * in this constructor we pass string to make tokens
        */
        StringTokenizer strtk=new StringTokenizer("This is constructor 1"," ");
        while(strtk.hasMoreTokens())//hasMoreTokens method returns true untill the end of the token
        System.out.println(strtk.nextToken());//nextToken method returns the token

        /*constructor 2
         * in this constructor we pass strings and delimiters like +,*,-,/ etc
         */
        StringTokenizer strtk2=new StringTokenizer("1+2-3*4/5&6^7%8#9@0!","=-+*&^%$#@!/");
        while(strtk2.hasMoreTokens())
        System.out.println(strtk2.nextToken());

        /*constructor 3
         * in this constructor we pass String boolean flag to seperate the delimiter
         * 
         */
        StringTokenizer strtk3=new StringTokenizer("This : is : constructor : 2",":",true);
        while(strtk3.hasMoreTokens())
        System.out.println(strtk3.nextToken());
    }
    
}
