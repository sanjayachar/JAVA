/*Buffer reader
 * It is a class used to take input from the user  and it executes fastly, which is faster than Scanner
 * BufferReader class can throw checked Exception
 * If we want to read integer, float numbers we have to parse
 * BufferReader is preferred Aas it is synchronized, while dealing with multiple threads
 * In JDK 1.0 this was introduced which wrapping up the System.in objects in an InputStreamReader 
 * which is wrapped in a BufferReader
 * Basically it is a best to take input in the java.io package which inherited the abstract class
 * called Reader
 * 
 * Scanner 
 * It is an advanced version of BufferReader which was added in later versions of java
 * In order to create object of Scanner class we have to pass predefined object System.in
 * 
 * Console
 * It has been becoming a preferred for taking user input from command line. In addition 
 * , it can be used for reading password-like input without echoing the characters entered by user
 * 
 * Using Command Line Argument
 * The Command line argument are stored in the String format. Basically parseInt,oarseFloat etc methods
 * are converts string argument into Integer,Float etc.
 * 
 * System.out.println()
 * it is used to print argument that is passed to it
 * System: it is a final class defined in the java.lang package
 * out: is an instance of PrintStream type, which is public and static member of the SYstem class
 * println(): All instanec PrintStream class have public method println()
 * 
 * System.in: This is the standard input stream that is used to read the user input
 * System.err:This is standard error stream is used to output all the error datasudo 
 */
import java.io.*;
import java.util.*;
public class IOJava1{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine());//here the readLine() is themethod in BufferReader class
        //parsing to integer
        System.out.println(Integer.parseInt(br.readLine()));
        //parsing to float
        System.out.println(Float.parseFloat(br.readLine()));
        //paring to byte
        System.out.println(Byte.parseByte(br.readLine()));

        Scanner sc=new Scanner(System.in);
        System.out.println(sc.next());//here the next() is method in the Scanner class
        //Console
        System.out.println(System.console().readLine());


        //Command LIne Argument
        for(String val:args)
        System.out.println(val+"~~~~");
        System.err.println("Error");
        sc.close();
        br.close();

    }
}