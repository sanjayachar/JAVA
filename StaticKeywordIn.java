/*Static is applicable for 
 * Blocks, Variables, Methods and Classes
 * Characteristics
 * -----------------
 * 1)Static variables and methods are allocated memry space only once during the execution of the program
 * 2)Accessable without object instantiation
 * 3)Cannot access non-static members
 * 4)Can be overloaded but not overrided
 * 
 * Static variable or methods cannot be  refer to this or super in any way
 */

 /*Static Blocks:
  * If we want to do the computauion before class load then we can write that computation thing
  in the static block which execute once when class loads
 
  *Advantages:
  ---------------
  *Memory Efficiency
  *Improve performance
  *Encapsulation
  *Class-level functionality
  */
public class StaticKeywordIn {
    static int a=10;
    static{
        System.out.println("Static block emerges");
        a*=10;
    }
    public static void main(String[] args) {
        System.out.println("Value of a= "+a);
        // Static.MyNestedClass mst=new Static.MyNestedClass();
        // mst.disp();
        Static stk=new Static();
        stk.Hello();
    }
    
}
/*Static class:
 * Basically we cannot declare class as a static instaed of we can declare static 
 * in nested classes
*/
class Static{
    //static nested class
    public static class MyNestedClass{
        int i;
        MyNestedClass(int i){
            this.i=i;
        }
        MyNestedClass(){
            this(10);
        }
        public void disp(){
            System.out.println(i);
        }

    }
    void Hello(){
        MyNestedClass cls=new MyNestedClass();
        cls.disp();
    }
    
}
