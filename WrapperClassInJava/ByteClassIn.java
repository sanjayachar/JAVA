package WrapperClassInJava;
/*Byte class is a wrapper class which converts primitive bytes into object vice versa
 * There are two constructor in Byte class
 * Like below there are same will be there for short, int, long, float and double
 * valueOf() returns the relevent object and parseXXX() will returns the relevent primitive type
 */
public class ByteClassIn {
    public static void main(String[] args) {
        Byte bt1=new Byte("45");//String constructor
        Byte bt2=new Byte((byte) 55);//byte constructor
        Byte bt3=Byte.valueOf((byte) 55);
        Byte bt4=Byte.valueOf((byte)55);//valueOf function will returns the Byte object
        Byte bt5=Byte.valueOf("55");//this overloaded function takes string object
        System.out.println("toString= "+Byte.toString(bt1)+"\nbt3 Byte valuesOf= "+Byte.toString(bt3));
        System.out.println(bt4==bt3);//bcz it shows immutable nature
        System.out.println(bt4==bt5);
        byte bt6=Byte.parseByte("55");//returns the byte object
        System.out.println(bt5==bt6);

        //decode() below decode function will returns the byte object
        String decimal="45",octal="005",hex="0x0f";
        Byte dec=Byte.decode(decimal);
        System.out.println("decode(45)= "+dec);
        dec=Byte.decode(octal);
        System.out.println("decode(005)= "+dec);
        dec=Byte.decode(hex);
        System.out.println("decode(0x0f)= "+dec);

        System.out.println("Returns byte obj= "+bt1.byteValue()+"\nReturns int obj= "+bt1.intValue()
        +"\nReturns float obj= "+bt1.floatValue()+"\netc");
    }
    
}
