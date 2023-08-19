package String;
/*String
 * For example take String="Welcome"
 * in this example JVM will looks the string pool if any "Welcome" obj created or not
 * if it is not created then JVM will creates the object for "Welcome"
 * 
 * String basically is a stream of characters
 * 
 * When the string object is created as a literal, the object will be created in the String Constat pool
 * 
 * The string can also be declared using new operator dynamically allocated in the heap memory
 * If we want to store the object in the String constant pool which is created using new operator
 * we use the intern method
 * 

 */
public class Strings1 {
    public static void main(String[] args) {
        //  We can create the string in two ways 
//           using, 1)String literals:- This is used to make java more memory efficient(It won't creat object if it is exists 
// already in the string constat pool)
          String s="Welcome";
        //   using new keyword:-In this case JVM will create a new string object in normal(non-pool) heap memory and the literal "Welcome
        // "will be placed in the string constat pool
        String s1=new String("Welcome");
        //if we want to create this s1 object which is created using new operator we use intern method
        String sIntern=s1.intern();//now the s1 object will be stored inside the SCP
        System.out.println(sIntern+" "+s);
        
    }
}
