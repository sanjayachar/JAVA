package WrapperClassInJava;
/*Character is a class which offers a number of useful class methods for manupulating characters.
 * We can create a Character object with the Constructor 
 * There is only one Character constructor to create char object
 */
public class CharacterClassIn {
    /*Methods in Character Class*/
    public static void main(String[] args) {
        //below method will checks whether passed value is char or not, if char means returns true or else false
        System.out.println("Is char? "+Character.isLetter('A')+"\nIs char? "+Character.isLetter('0'));

        /*Below method returns true if specified char value(ch) is a digit or not */
        System.out.println("Is digit? "+Character.isDigit('A')+"\nIs digit? "+Character.isDigit('9'));

        /*Below method will returns true for whitespace that includes space,tab,or newline */
        System.out.println("Is whitespace? "+Character.isWhitespace('A')+"\nIs whitespace? "+Character.isWhitespace(' ')
        +"\nIs whitespace? "+Character.isWhitespace('\n')+"\nIs whitespace? "+Character.isWhitespace('\t')
        +"\nIs whitespace? (ans: it is whitespace bcz ASCII value of tab means '{\t}') "+Character.isWhitespace(9)+"\nIs whitespace? "+Character.isWhitespace('9'));

        /*Below method returns true if uppercase for uppercase characters isUppercase() method  vice versa*/
        System.out.println("Is uppercase? "+Character.isUpperCase('A')+"\nIs lowercase? "+Character.isLowerCase('a')
        +"\nIs lowercase? "+Character.isLowerCase(97));

        /*Below method returns uppercase for lowercase characters vice versa*/

        System.out.println("Uppercase of 'a' is "+Character.toUpperCase('A')+"\nUppercase of 97 is "+Character.toUpperCase(97)
        +"\nLowercase of 'A' is "+Character.toLowerCase('A')+"\nLowercase of 65 is "+Character.toLowerCase(65));

        /*below method will returns the string object */
        System.out.println("String object "+Character.toString('x'));
    }
    
}
