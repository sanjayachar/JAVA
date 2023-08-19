package Exception;

public class NullPointer {
    public static void main(String[] args) {
        String ptr=null;
        /*In below case we are calling equals method on the literals object and comparing with an object reference
         * so in this case if object reference got null it will not throw NullPointer exception
         */
        try{
            if("Sanjay".equals(ptr)){
                System.out.println("Equals");
            }else{
                System.out.println("literals 'Sanjay' can equals with object reference ptr ?");
            }
        }catch(NullPointerException n){
            System.out.println("Null pointer exception is caught: "+n.toString());
        }
/*In below case we are calling equals method on the object reference and comparing with an literal object
         * so in this case if object reference got null it will throw NullPointer exception
         */
        try{
            if(ptr.equals("Sanjay")){
                System.out.println("Equals");
            }else{
                System.out.println("object reference ptr can equals with literals 'Sanjay'?:  ");
            }
        }catch(NullPointerException n){
            System.out.println("object reference ptr can equals with literals 'Sanjay'?: "+n.toString());
        }


        try{
            if("Sanjay"==ptr){
                System.out.println("Equals 2");
            }
            System.out.println("Not equals 2");
        }catch(NullPointerException n){
            System.out.println(n.toString());
        }
        
    }
}
