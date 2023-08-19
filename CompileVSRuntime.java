/*Compile time:Whenever an object is bound with its functionality at the compile time
 * Run time:Whenver an object is bound its functionality at run ti,e
 */
class Test{
    public void meth(int a){
        System.out.println("Runtime polymorphism Test a="+a);
    }
    //method overloading
    public void meth(int a,int b){
        System.out.println("Compile time polymorphism a+b="+(a+b));
    }
}
public class CompileVSRuntime extends Test{
    //method overriding
    @Override
    public void meth(int a){
        System.out.println("Runtime polymorphism CompileVSRuntime a="+a);
    }
    public static void main(String[] args) {
        Test tst=new Test();
        tst.meth(10);
        tst.meth(10,20);
        CompileVSRuntime rn=new CompileVSRuntime(); 
        rn.meth(30);
        rn.meth(40, 50);
    }
    
}
