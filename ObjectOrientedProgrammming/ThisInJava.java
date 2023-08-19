package ObjectOrientedProgrammming;
/*In java 'this' variable refers to current object instance/object
 * It is used to call the  current class methods and fields, to pass an instance of the 
 * current class as a parameter, and to differentiate b/w the local and instance variables
 * Methods to use 'this' in java
 * 
 * We can use 'this' keyword to refer to current class instance variables
 * -------------------------------------------------------------------------
 * 1)this() is to invoke the current class constructor
 * 2)'this' keyword is to return the current class instance
 * 3)'this' keyword is used as a method parameter
 * 4)'this' keyword is to invoke the current class method
 * 5)'this' keyword used as an argument in the constructor
 */
public class ThisInJava {
    public int a,b;
    B obj;
    //1)
    ThisInJava(int a,int b){
        this.a=a;
        this.b=b;
    }
    //2)
    ThisInJava(){
        this(10, 20);
        System.out.println("Inside default constructor");
    }
    //3)
    ThisInJava get(){
        return this;
    }
    void display(ThisInJava obj){
        System.out.println("a="+obj.a+"\nb="+obj.b);
    }
    //4)
    void show(){
        this.display(get());
    }
    //5)
    ThisInJava(B obj){
        this.obj=obj;
        obj.display();
    }
    public static void main(String[] args) {
        ThisInJava th=new ThisInJava();
        th.show();
        B b=new B();
        ThisInJava th2=new ThisInJava(b);
        System.out.println(th2);
    }
    
}
class B{
    B(){
        ThisInJava obj=new ThisInJava(this);
        System.out.println(obj);
    }
    void display(){
        System.out.println("B class constructor");
    }
}
