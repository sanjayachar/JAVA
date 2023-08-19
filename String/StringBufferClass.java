package String;
/*
 * StringBuffer is a class in java that represents a mutable sequence of characters.
 * It provides alternative to the immutable String class, allow us to modify the existing contents without 
 * creating a new objects at every time.
 * 
 * Features:-
 * 1.StringBuffer object are mutable, means that you can change the contents of the 
 * buffer without creating a new object.
 * 2.The initial capacity of a STringBuffer can be specified when it is created, or it can 
 * be set later with the ensureCapacity() method.
 * 3.The append method used to add char,Strings, or other objects to the end of the buffer.
 * 4.The insert method is used to insert char, Strings, ro other objects at a specified position in the buffer.
 * 5.The delete method is used to remove char and reverse method is used to reverse the order of the char in the buffer.
 * 6.The StringBuffer is thread safe means that it uses synchronization.
 * 
 * _
 */
public class StringBufferClass {
    public static void main(String[] args) {
        String str= "hello";
        StringBuffer strbf=new StringBuffer(str);//StringBuffer with having intial capacity as specified string
        StringBuffer strbf2=new StringBuffer(20);//String buffer with initial capacity
        StringBuffer strbf3=new StringBuffer();//empty string with inbuilt capacity as 16
        System.out.println(strbf+" "+strbf2+" "+strbf3);
    }
    
}
