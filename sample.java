public class sample{
    static Integer i=830;
    public static void main(String[] args) {
        int i=10;
        // sample s=new sample();
        System.out.println(i);
        hell();
        {
            int a=10;
            System.out.println(a);
        }
        {
            int a=20;
            System.out.println(a);
        }
        hell2();
        System.out.println("hell2-"+i);
        hell3();
        System.out.println("hell3-"+i);
        
    }
    /*-----------------------------
     * here when ever we are going to change the instanvce variable it will only reflects on that brackets only
    */
    public static void hell2(){
        i=78584;
        System.out.println("hell2-"+i);
    }
    public static void hell3(){
        i=78584;
    }
    public static void hell(){
        System.out.println(i);
    }
    //------------------------------//
    static{
        System.out.println("khihi");
    }
    {
        System.out.println("kjbjvkv");
    }
}
