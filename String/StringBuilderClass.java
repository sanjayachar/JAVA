package String;
/*
 * It is a mutable sequence of characters. Since the String class in java creates a immutable 
 * sequence of characters, the StringBuilder class provides alternative to String class.
 * It is same as StringBuffer but it differs with StringBuffer on basis of Synchronization
 * 
 * The StringBuffer is Thread safe which means it is synchronization,
 * but when it comes to StringBuilder it is not thraed safe (no guarentee of synchronization)
 * this class used replacement of StringBuffer and it was being used by a single thread.
 * It is faster execution compare too String and StringBuffer
 * 
 */
public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder bld=new StringBuilder();//this empty constructor  sets initial capacity as 16
        StringBuilder bld2=new StringBuilder(10);//initial capacity 10
        StringBuilder bld3=new StringBuilder("iuhivhus");//constructor which passes the string
        System.out.println(bld+" "+bld2+" "+bld3); 
    }
    
}
