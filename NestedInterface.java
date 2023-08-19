class Develop{
    interface Yes{
        public void show();
    }
}
class Developing implements Develop.Yes{
    @Override
    public void show(){
        System.out.println("show method of Devlop.Yes(interface) method");
    }

}
/*Another way of using nested interface using anonymos inner class */
class Outerclass{
    public interface NeastedInt{
        public void nestMeth();
    }
    public void hello(){
        NeastedInt nst=new NeastedInt() {
            public void nestMeth(){
                System.out.println("internal interface method- nestedMeth()");
            }
        };
        nst.nestMeth();
    }
}
public class NestedInterface {
    public static void main(String[] args) {
        Developing dp=new Developing();
        dp.show();
        Outerclass ost=new Outerclass();
        ost.hello();
    }
}
