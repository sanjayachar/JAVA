package String;
/*Immutable objects are the objects once declared element can't be modified after it
 * A String in Java is specified as immutable because the content stored in a single pool to minimize
 * creating a copy of the same value.
 * String class and all wrapper class are immutable in nature.
 * 
 * Basically when the compiler sees a String literal, it looks for the String in the pool
 * , if  a match found then the reference to the new literal is directed to the existing String and no new String object is created
 * The existing STring simply has one more reference
 */
public class ImmutableString {
    public static void main(String[] args) {
        String str="Sanjay";
        /*here string str is a literal and JVM creates the 
         * object in the SCP
         */
        String str2=str.concat("BN");
        // In this below case new object was created but there is no reference so we can't reach this "BN" data
        str.concat(" BN");
        /*here we are going to concat "BN with the "Sanjay" 
         * So while concatinating JVM will create seperate object in the heap for "Sanjay
         * BN"
         * Rather JVN won't concat "BN" with str 
        */
        System.out.println(str+"\n"+str2);
    }
    
}
