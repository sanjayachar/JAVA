package MultiThreading.Synchronization;
/*Static synchronization is the achiving the synchronization in the static method
 * which means the lock is applied on the class not on the object so that only one thread will access 
 * the class at time
 */
public class StaticSynchronization {
    
    private static int balance=1000;
    public static int getBal(){
        return balance;
    }
    public static synchronized void deposit(int amount) {
        balance += amount;
    }

    public static synchronized void withdraw(int amount) {
        balance -= amount;
    }
    public static void main(String[] args) throws InterruptedException{
                // Create multiple threads to simulate concurrent operations
                Thread depositThread = new Thread(() -> {
                    for (int i = 0; i < 3; i++) {
                        StaticSynchronization.deposit(100);
                        System.out.println("Deposited 100. New balance: " + StaticSynchronization.getBal());
                    }
                });
        
                Thread withdrawThread = new Thread(() -> {
                    for (int i = 0; i < 3; i++) {
                        StaticSynchronization.withdraw(50);
                        System.out.println("Withdrawn 50. New balance: " + StaticSynchronization.getBal());
                    }
                });
                depositThread.start();withdrawThread.start();
                depositThread.join();withdrawThread.join();
                System.out.println("Final balance: "+StaticSynchronization.getBal());
    }
}
