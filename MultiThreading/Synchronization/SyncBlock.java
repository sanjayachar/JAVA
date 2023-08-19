package MultiThreading.Synchronization;
import java.util.*;
public class SyncBlock {
    String name="";
    static String name2="";
    public int count=0;
    public static int count2=0;
    public void instanceMeth(String name,List<String>list){
        synchronized(this){
            this.name=name;
            count++;
        }
        list.add(name);
    }
    public static void staticMeth(String name,List<String>list){
        synchronized(SyncBlock.class){
            name2=name;
            count2++;
        }
        list.add(name);
    }
    public static void main(String[] args) {
        SyncBlock sk1=new SyncBlock();
        List<String>list=new ArrayList<>();
        sk1.instanceMeth("Sanjay", list);
        System.out.println(sk1.name+" "+sk1.count);

        List<String>lst2=new ArrayList<>();
        staticMeth("Sanjay static ", list);
        System.out.println(name2+" "+count2);

    }
    
}
