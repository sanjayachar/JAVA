
//super keyword to access variable,method and constructor of super class
class person{
    public int i;
    public String str;
    person(int i,String str){
        this.i=i;
        this.str=str;
    }
    String message(){
        return "super message method\n";
    }
}
public class Super extends person{
    Super(int i,String str){
        super(i,str);
    }
    @Override
    public String toString(){
        return "super i variable= "+super.i+"\nsuper str variable= "+super.str+"\nThis will calls the super class message method= "+super.message();
    }
    public static void main(String[] args) {
        Super spr=new Super(10,"Sanjay");
        System.out.println(spr.toString());
    }
}
