package ObjectOrientedProgrammming;
/*Encapsulation is a bundling of data and methods that operate on that data within a single unit(class).
 * 
 */
class Account{
    private long acc_no;
    private String name,email;
    private float amount;
    public long getAcc_no(){
        return acc_no;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public float getAmount(){
        return amount;
    }
    @Override
    public String toString(){
        return "AC No.-"+this.getAcc_no()+"\nName-"+this.getName()+"\nEmail-"+this.getEmail()
        +"\nAmount-"+this.getAmount();
    }
    Account(long acc_no,String name,String email,float amount){
        this.acc_no=acc_no;
        this.name=name;
        this.email=email;
        this.amount=amount;
    }
}
public class EncapsulationInJava {
    public static void main(String[] args) {
        Account ac=new Account(7310805450L, "Sanjay", "sanjayachar2k01@gmail.com", 100000f);
    System.out.println(ac.toString());
    }
}
