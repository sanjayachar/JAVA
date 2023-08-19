/*1) Nested Inner Class: The class Inside the class
 * 2)Method Local Inner Classes
 * 3)Static Nested Classes
 * 4)Anonymous Inner Classes: These class are declared without any name at all
 * 
 * * We cannot make method inside the inner class as a static becuase an inner class is implicitly
 * associated with an object of its outer class so it cannot define any static method for itself.
 */
class Demo{
    void show(){
        System.out.println("It's a super class");
    }
}
public class InnerClassIn {
    private static void outerMethod(){
        System.out.println("this is outer method");
    }
    static class InsideClass{
        public static void hello(){
            System.out.println("inside inner class method");
            outerMethod();
        }
    }
    static Demo d=new Demo(){
        void show(){
        super.show();
        System.out.println("It's Anonymouse inner class");
        }
    };
    public static void main(String[] args) {
        InnerClassIn.InsideClass.hello();

        d.show();
        
    }
}
