package Exception;
public class CustomEx1 extends ArithmeticException{
    CustomEx1(String str){
        /*Calling the parent constructor(Exception constructor) */
        super(str);
    }
    public static void main(String[] args) {
        try{
            throw new CustomEx1("This is Custom made exception\n");
        }
        catch(CustomEx1 c){
            System.out.println("This is custom made Arithmetic exception: "+c.toString());
            // throw new CustomEx1("This is custom made exception");
        }
    }
}
