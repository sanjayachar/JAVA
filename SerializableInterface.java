import java.io.*;
/*Serializable: This interface  has empty method(0 and datas
 * It commonly used for saving objects to disk, sending objects over networks or transfering
 * objects between different JVMs
 * Serialization and deSerialization is automatically handled by the JRE based on the classe's
 * implementation
 * 
 * When object is to serialize then JVN will looks for Serializable interface
 * 
 * This interface is used to indcate that an object's can be converted into a stream of bytes(serialization)
 * vice versa deserialization
*/
public class SerializableInterface implements Serializable {
    private int value;
    private String name;
    public SerializableInterface(int value, String name) {
        this.value = value;
        this.name = name;
    }
    public int getValue() {
        return value;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        SerializableInterface obj = new SerializableInterface(42, "Hello");
        FileOutputStream fileOut = new FileOutputStream("object.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            System.out.println("Object serialized and saved to 'object.ser'");
            FileInputStream fin=new FileInputStream("object.ser");
            ObjectInputStream oin=new ObjectInputStream(fin);
            SerializableInterface newObj=(SerializableInterface)oin.readObject();
            System.out.println("Deserialized object: value = " + newObj.getValue() + ", name = " + newObj.getName());        
    }
}
