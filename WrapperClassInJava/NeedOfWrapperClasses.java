package WrapperClassInJava;
/*Why do we need Wrapper classes in java
 * Bcz it will gives additional features over the primitive datatypes when it comes to usage
 * These methods includes primarily methods like valueOd(), parseInt(), toString() and many more.
 * A wrapper classes wraps(encloses) around a datatypes and gives it an object appearance
 * 
 * Wrapper classes are final and immutable(Like String)
 * 
 * Autoboxing: It is a procedure of converting a primitive value into an object of the
 * corresponding wrapper class
 * 
 * Unboxing: It is a procedure of converting an object of a wrapper type to its
 * corresponding primitive value
 * 
 * Features of Wrapper classes:
 * ------------------------------
 * 1)They converts primitive data types into objects. Objects are needed if we wish to modify the arguments passed into a method
 * 2)The classes in java.util package handles only objects and hence wrapper classes help in this class also.
 * 3)Data structures in the Collection framework, such as ArrayList and Vector, store only
 * objects(reference types) and not primitive types.
 * 4)An object is needed to support synchronization in multithreading.
 * 
 * Three ways we can construct the instance of the Wrapper Classes
 * 
 * !)Using the constructor of wrapper classes
 * 2)Using the valueOf() method provided by the Wrapper classes
 * 3)Using concept of AutoBoxing
 */
public class NeedOfWrapperClasses {
    public static void main(String[] args) {
        /*1) */
        // Integer a1=new Integer(10); Since this was deprecated from version 9
        /*2) */
        Integer a2=Integer.valueOf(10);
        /*3) */
        Integer a3=new Integer(10);
        Integer a4=Integer.valueOf(10);

        /*here .equals() methods compares the value instead of object
         * But when we compare with == then this is the comparision of the objects
         */

         /*When we are creating instance using valueOf method if the value is same
          * then it returns same object or the reference of dplicated value will pointing
          to the same memory location So it is like immutable like String
          Like String Wrapper classes are immutable in nature 
          
          So thats why a2 and a4 are having same value are pointing to the same memory and 
          returns true for a2==a4 statement
          */
        System.out.println(a2.equals(a3)+"\n"+(a2==a3)+"\n"+(a2==a4));

        /*3) Using AutoBoxing */
        Integer num1=15;
        Integer num2=15;
        System.out.println("Creation of Wrapper class instance Using AutoBoxing: "+(num1==num2));
        /*Above num1==num2 will returns true because of immutability nature of Wrapper class */
    }
    
}
