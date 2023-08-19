/*The final keyword is applicanle only for variable, methods and class
 * Final variable---->To craete constant variable
 * Final methods----->Prevent method overriding
 * Final classes---->Prevent inheritance
 * 
 *1) When variable is final then we cannot be changed
 *2)When the method is declared as a final then it cannot be overridrn by a subclass
 *
 * If we reassign the final variable then we will get CE
 */

 /*The final keyword is won't allow to create subclasses 
  * And also it allow us to create immutable classes like String and wrapper classes
  */
public class FinalKeywordIn {
    //if we not initialize the final variable then we will get CE
    final int CAPACITY;
    //We can initialize the final variable inside the instance bloack
    {
        CAPACITY=10;
    }
    final static int constant;
    //We can initialize the static final variable inside the static block
    static{
        constant=20;
    }
    public static void main(String[] args) {
        final FinalKeywordIn fn=new FinalKeywordIn();
        System.out.println(fn.getClass().getName());
    }
    
}
