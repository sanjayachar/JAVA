package Java8Features.LmbdaExpression;

import java.io.*;
import java.io.Serializable;

/*
 * Serialization of lambda expressions in java is not directly because lambda expressions are instances of 
 * functional interface, and functional interfaces are not serializable by default.
 * In order to serialize a lambda expression, it needs to be converted into object that implements Serializable
 */
@FunctionalInterface
interface MyLambda extends Serializable{
    void doSomething();
}

class SerializableClass implements Serializable{
    private MyLambda lambda=()->System.out.println("Serialized Lambda");
    public void executeLambda(){
        lambda.doSomething();
    }
}
public class SerializationLambda {
    public static void main(String[] args)throws IOException, ClassNotFoundException{
        SerializableClass scl=new SerializableClass();

        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("lambda.ser"));
        out.writeObject(scl);
        out.close();
        System.out.println("Serialization successful...");

        ObjectInputStream in=new ObjectInputStream(new FileInputStream("lambda.ser"));
        SerializableClass des=(SerializableClass)in.readObject();
        in.close();
        System.out.println("Deserialization successful...");
        des.executeLambda();
    }
    
}
