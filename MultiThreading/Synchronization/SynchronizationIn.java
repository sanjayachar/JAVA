package MultiThreading.Synchronization;
/*
 * Synchronization is a mechanism in java threading when multiple thread is going to access single object
 * synchronization lead to allow only one thread at time by aquiring lock on that particular object
 * 
 * It helps to prevent data inconsistancy and race condition when threads are trying 
 * to modify shared resources concurrently.
 */
class BankAccountSync{
    private int balance;
    public BankAccountSync(int initBal){
        this.balance=initBal;
    }
    public int getBal(){
        return balance;
    }
    public void deposite(int ammount){
        balance+=ammount;
    }
    public void withdraw(int ammount){
        balance+=ammount;
    }
}
public class SynchronizationIn {
    public static void main(String[] args) throws InterruptedException{
           /*creating the multiple threads
         * In below we are creating three threads deTh1, withTh1 and depTh2
         * 
         * So each thread holds single BalanceAccountSync object
         * 
         * when each threads starts then synchronized block will aquires the lock to complete that current thread
         * execution
         * 
         * After completion of depTh1 only withTh1 allowed to aquire the lock if that thread is synchronized
        */
        syncMeth();
/*creating the multiple threads
         * In below we are creating three threads deTh1, withTh1 and depTh2
         * 
         * So each thread holds single BalanceAccountSync object
         * 
         * and multiple threads can access and modify the balance field concurrently
         * when we run the code we might observe inconsistent and inaccurate final balance due to race conditions,
         * where multiple threads interfer with each other's operations.
         * 
        */
        asyncMeth();
    }
    //below method is for synchronized 
    public static void syncMeth()throws InterruptedException{
        BankAccountSync acc1=new BankAccountSync(1000);
     
        Thread depTh1=new Thread(()->{
            synchronized(acc1){
                acc1.deposite(200);
                System.out.println("Deposited 200. New Balance: "+acc1.getBal());
            }
        });
        Thread withTh1=new Thread(()->{
            synchronized(acc1){
                acc1.withdraw(300);
                System.out.println("Withdraw 300. New balance: "+acc1.getBal());
            }
        });
        Thread depTh2=new Thread(()->{
            synchronized(acc1){
                acc1.deposite(100);
                System.out.println("Deposited 100. New balance: "+acc1.getBal());
            }
        });
        //start the thread
        depTh1.start();withTh1.start();depTh2.start();
        depTh1.join();withTh1.join();depTh2.join();
        System.out.println("Final balance: "+acc1.getBal()+"\n");
    }

    //below static method is for asynchronization(not synchronized) 
    public static void asyncMeth()throws InterruptedException{
        BankAccountSync acc1=new BankAccountSync(1000);
        Thread depTh1=new Thread(()->{
                acc1.deposite(200);
                System.out.println("Deposited 200. New Balance: "+acc1.getBal());
        });
        Thread withTh1=new Thread(()->{
                acc1.withdraw(300);
                System.out.println("Withdraw 300. New balance: "+acc1.getBal());
        });
        Thread depTh2=new Thread(()->{
                acc1.deposite(100);
                System.out.println("Deposited 100. New balance: "+acc1.getBal());//some times this output will gives 1500 or 1600
        });
        //start the thread
        depTh1.start();withTh1.start();depTh2.start();
        depTh1.join();withTh1.join();depTh2.join();
        System.out.println("Final balance: "+acc1.getBal()+"\n");//some times this output will gives 1500 or 1600
    }
    
}
