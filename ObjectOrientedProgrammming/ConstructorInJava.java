package ObjectOrientedProgrammming;
/*The constructor in java is used to construct something in our programs
 * A constructor is a special method that is used to initialize objects
 * The constructor is called when an object of a class is created
 * It is a clock of instruction or codes similar to the method
 * At the time of calling the constructor, memory for the object is allocated in the memory
 * Every time an object is created using the new() keyword, at least one constructor is called
 */
public class ConstructorInJava {
    //Copy constructor
    private int id;
    private String str;
    ConstructorInJava(int id, String str){
        this.id=id;
        this.str=str;
    }
    ConstructorInJava(ConstructorInJava con){
        this.id=con.id;
        this.str=con.str;
    }
    public static void main(String[] args) {
        ConstructorInJava con1=new ConstructorInJava(10, "Sanjay");
        System.out.println(con1.id+" "+con1.str);
        ConstructorInJava con2=new ConstructorInJava(con1);
        System.out.println(con2.id+"-2-"+con2.str);
    }
    
}
