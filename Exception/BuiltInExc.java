/*Arithmetic exception*/
package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class BuiltInExc{
    public static void main(String[] args) {
        arithmetic(30);
        nullPointer(null);
        stringOutOfBound("hello bro");
        fileNotFound();
        numFormExc();
        arrayIndex();
        ioException();
        noSuchFile();
        // illegleArgumentExcep(5);
        illegleStateExc();
        exception();
    }
    static public void arithmetic(int c){
        System.out.println("Can 0 divides c?");
        try{
            System.out.println(c/0);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception 0 cant divide c: "+e.toString()+"\n");
        }
    }
    static public void nullPointer(String a){
        System.out.println("Can we retrieve char 10 in the string s?");
        try{
            System.out.println(a.charAt(10));
        }catch(NullPointerException n){
            System.out.println("Null pointer exception for the string a, which is having null value: "+n.toString()+"\n");
        }
    }
    static public void stringOutOfBound(String str){
        System.out.println("Can we retrieve char 50 in the string s?");
        try{
            System.out.println(str.charAt(50));
        }catch(StringIndexOutOfBoundsException s){
            System.out.println("String out of bound exception: "+s.toString()+"\n");
        }
    }
    static public void fileNotFound(){
        try{
            File file=new File("abc.txt");
            FileReader fr=new FileReader(file);
        }catch(FileNotFoundException e){
            System.out.println("Will the file abc.txt exist?: "+e.toString()+"\n");
        }
    }
    static public void numFormExc(){
        try{
            int num=Integer.parseInt("null");
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("Is 'null' is a  Number?:"+e.toString()+"\n");
        }
    }
    static public void arrayIndex(){
     try{
         int a[]=new int[5];
         a[6]=9;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception: "+e.toString()+"\n");
        }
    }
    static public void ioException(){
        Scanner sc=new Scanner("Hello Geek!");
        System.out.println(""+sc.nextLine());
        System.out.println("Exception OutPut: "+sc.ioException());
        sc.close();
    }
    static public void noSuchFile(){
        try {
            Set ex=new HashSet<>();
            Hashtable hex=new Hashtable<>();
            ex.iterator().next();
            hex.elements().nextElement();
        } catch (Exception e) {
            System.out.println("is elements() method inside the Hashtable class?: "+e.toString());
        }
    }
    static public void illegleArgumentExcep(int a){
        if(a>=18)
        System.out.println("Eligible for voting");
        else{
            throw new IllegalArgumentException("Not eligible for voting"+Integer.toString(a));
        }
        
    }
    public static void illegleStateExc(){
        int n1=10,n2=-4;
        try{
            if(n1>=0 && n2>=0){
                n1+=n2;
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public static void exception(){
        try{
            System.out.println(1/0);
        }catch(ArithmeticException e2){
        }finally{
            System.out.println("leave it bro");
        }
    }
    
}