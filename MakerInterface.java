import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Cloneable;
/*Maker interfaces are the interfaces which having no field or methods
 * Examples of maker interface are Serializable, Cloneable and Remote interface. All these interfaces
 * are empty interfaces
 */
/*Clonable interface:It is present in java.lang package. 
 * The clone() method is inside the object class
 * java.lang.Cloneable interface must be implemented by the class whose object clone we want to create.
*/
class A implements Cloneable{
    int i;
    String s;
    public A(int i,String s){
        this.i=i;
        this.s=s;
    }
    @Override
    protected Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
/*Serializable interface is present in java.io package. 
 * This interface will makes the object eligible for saving its state into a file
 * The serialization means allows us to convert an object to stream that we can send over the 
 * network or save it as file or store in DB for later usage
 * This means we can convert the objects into stream of object and store in file or in DB.
*/
class B implements Serializable{
    int i;
    String s;
    public B(int i,String s){
        this.i=i;
        this.s=s;
    }
}
public class MakerInterface {
    public static void main(String[] args) throws CloneNotSupportedException,IOException,ClassNotFoundException {
        // A a=new A(20,"Sanjay");
        // A b=(A)a.clone();
        // System.out.println(b.i+" \n"+b.s);

        //Seriealizing 'a'
        A a= new A(10,"Sanjay");
        FileOutputStream fos=new FileOutputStream("hello.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a);

        // De-serializing 'a'
        FileInputStream fis=new FileInputStream("hello.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        A b=(A)ois.readObject();

        System.out.println(b.i+" "+b.s);
    }
    
}
