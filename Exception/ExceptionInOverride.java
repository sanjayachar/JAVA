package Exception;

import java.io.IOException;

class Base{
    public void hello0()throws IOException{
        System.out.println("Base hello0");
    }
    public void hello(){
        System.out.println("Base class hello");
    }
}
public class ExceptionInOverride extends Base{
    @Override
    public void hello()throws NullPointerException{
        System.out.println("Throws null pointer exception in SubClass hello");
    }
    @Override
    public void hello0()throws IOException{
        System.out.println("subclass hello0");
    }
    public static void main(String[] args) throws IOException{
        ExceptionInOverride ex1=new ExceptionInOverride();
        /*It is not required for main method to add throes  for ArithmetiException in main method bcz it is unchecked exception*/
        ex1.hello();
        /*In main method we should add throws for IOException bcz it is checked exception and it will gives CE*/
        ex1.hello0();
    }
}
