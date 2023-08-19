public class CopyConstructor {
    private double re,im;
    CopyConstructor(double re,double im){
        this.re=re;
        this.im=im;
    }
    CopyConstructor(CopyConstructor cp){
        System.out.println("Copy constructor");
        re=cp.re;
        im=cp.im;
    }
    @Override
    public String toString(){
        return"("+re+"+"+im+"i)";
    }
    public static void main(String[] args) {
        CopyConstructor c1=new CopyConstructor(10,20);
        CopyConstructor c2=new CopyConstructor(c1);
        CopyConstructor c3=c2;
        System.out.println(c2);
        
    }
}
