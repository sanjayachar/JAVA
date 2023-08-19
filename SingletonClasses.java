/*It is also called private constructors creation using private modifier
 * A class is said to be singleton if it limits the number of objects of that class to one.
 * if we want we can get copy of that object 
 */
class MySingleton{
    //shold be static variable bcz static is independent of obj
    static MySingleton in=null;
    public int x=10;
    //constructor should be private
    //If we make default constructor as a private then we can't create an object
    private MySingleton(){}
        //shold be static method bcz static is independent of obj
    static public MySingleton getInstance(){
        //initially in is null after one object is created then if we want again this method will return same object
        if(in==null)
        in=new MySingleton();
        return in;
    }
}
public class SingletonClasses {
    public static void main(String[] args) {
        MySingleton a=MySingleton.getInstance();
        MySingleton b=MySingleton.getInstance();
        a.x+=10;
        System.out.println(a.x+"\n"+b.x);
    }
}
