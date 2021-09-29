package Java.MasterClass;

import java.awt.image.BandCombineOp;

public class Main {

    public static void main(String[] args) {
        final BankAccount account = new BankAccount("12345-678", 1000.00);

        // Challenge #1:
        // We could have two people using a joint bank account at the same time.
        // Create and start two threads that use the same BankAccount instance
        // and an initial balance of $1000.00.
        // One will deposit $300.00 into the bank account, and then withdraw $50.00.
        // The other will deposit $203.75 and the withdraw $100.00.

        new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(300.00);
                account.withdraw(50.00);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(203.75);
                account.withdraw(100.00);
            }
        }).start();

        // Challenge #2:
        // I hope you can see that there's going to be thread interference
        // when two threads are accessing the same BankAccount instance at the same time.
        // We have to make the BankAccount class threadsafe, and that's our next challenge.
        // Use the synchronized keyword to make the BankAccount class threadsafe.

        // Challenge #3:
        // Make the BankAccount class threadsafe again using the synchronized keyword
        //
        // We've added two new methods. Update the code so that the BankAccount class is threadsafe.
        // Use synchronized keyword wherever necessary.
        //
        // Solution:
        // This was a bit of a trick challenge. We don't have to make any changes to the code.
        // Because both threads only read the account number, thread interference isn't an issue.
        // It would be a mistake to synchronize the getAccountNumber() and printAccountNumber() methods.
        // We'd be over-synchronizing the code, and in applications with a large number of threads,
        // this can have a noticeable negative impact on performance.

        // Challenge #4:
        // Use ReentrantLock
        // Instead of using the synchronized keyword,
        // make the BankAccount class threadsafe using the ReentrandLock class.

        // Challenge #5:
        // Use tryLock with a timeout value
        // Instead of using lock(), use tryLock() with a timeout value of 1 second.
        // If the waiting period times out, print the message,
        // "Could not get the lock" to the console.
        //
        // HINT: Use the form of the tryLock() method that accepts two parameters
        // - the first parameter is the timeout value,
        // and the second parameter is the time unit of the first parameter.
        // Use TimeUnit.MILLISECONDS for the second parameter

        // Challenge #6:
        // Update the code so that the status variable is thread safe.
        // Use whatever method you like: the synchronized keyword or the lock object.
        //
        // Another trick challenge. Since the status variable is a local variable,
        // it's already threadsafe. Local variables are stored on the thread stack,
        // so each thread will have its own copy.
        // Threads won't interfere with each other
        // when it comes to setting and getting the status value.

        // Challenge #7:
        //
    }
}
