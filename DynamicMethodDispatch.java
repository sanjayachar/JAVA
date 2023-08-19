class Dynamic{
    int x=10;
    int hello(int a){
        return a+10;
    }
}
public class DynamicMethodDispatch extends Dynamic{
    int x=20;
    @Override
    int hello(int a){
        return a+20;
    }
    public static void main(String[] args) {
        Dynamic dm=new Dynamic();
        DynamicMethodDispatch dsp=new DynamicMethodDispatch();
        System.out.println("Dynamic-"+
        dm.hello(10)+"and x="+dm.x);
        System.out.println("DynamicMethodDispatch-"+dsp.hello(20)+"and x="+dsp.x);
    }
}
