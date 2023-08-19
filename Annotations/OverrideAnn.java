package Annotations;
/*As we seen earlier, this annotation is used to indicate that a method from a superclass. 
 * It helps ensure that the method signature matches the overridden method
 */
@FunctionalInterface
interface SuperClass{
    public String printString(String str);
}
public class OverrideAnn implements SuperClass{
    @Override
    public String printString(String str){
        return "The name is: "+str;
    }
    public static void main(String[] args) {
        SuperClass spr=new OverrideAnn();
        System.out.println(spr.printString("B N Sanjay"));
    }
}
