package Java.MasterClass;

// Spot and fix the problem.
//
// Let's take a look at a similar application which also deals with Bank Accounts,
// but in this case, performs transfers form one bank account to another.
//
// This version of the BankAccount class has three methods:
// deposit(), withdraw() and transfer().
// The deposit() and withdraw() methods are similar to what we had before.
// The transfer() method first tries to withdraw the money from the source account.
// If it's successful, it deposits the money into the destination account
// and returns true. If it's not successful, it refunds the source account
// and returns false.
//
// In the main() method, we create two bank accounts and start two threads.
// Each thread will perform a transfer using an instance of the Transfer class.
// The Transfer class's run() method loops until a transfer is successful.
//
// The challenge is to spot what's wrong with this code and to fix it.
// What do we call this particular situation (deadlock, livelock, etc.)?
// Why is it happening? How would we fix it?
// HINT: the quickest way to get an inkling of what's wrong is to type
// of copy/paste this code into a new IntelliJ project, and to run it.

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Challenge7 {

    public static void main(String[] args) {
        NewBankAccount account1 = new NewBankAccount("12345-678", 500.00);
        NewBankAccount account2 = new NewBankAccount("98765-432", 1000.00);

        new Thread(new Transfer(account1, account2, 10.00), "Transfer1").start();
        new Thread(new Transfer(account2, account1, 55.88), "Transfer2").start();
    }
}

class NewBankAccount {
    private double balance;
    private String accountNumber;
    private Lock lock = new ReentrantLock();

    NewBankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (lock.tryLock()) {
            try {
                try {
                    // Simulate database access
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {
                }
                balance -= amount;
                System.out.printf("%s: Withdrew %f\n", Thread.currentThread().getName(), amount);
                return true;
            } finally {
                lock.unlock();
            }
        }
        return false;
    }

    public boolean deposit(double amount) {
        if (lock.tryLock()) {
            try {
                try {
                    // Simulate database access
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                balance += amount;
                System.out.printf("%s: Deposited %f\n", Thread.currentThread().getName(), amount);
                return true;
            } finally {
                lock.unlock();
            }
    }
        return false;
    }

    public boolean transfer(NewBankAccount destinationAccount, double amount) {
        if (withdraw(amount)) {
            if (destinationAccount.deposit(amount)) {
                return true;
            }
            else {
                // The deposit failed. Refund the money back into the account.
                System.out.printf("%s: Destination account busy. Refunding money\n",
                        Thread.currentThread().getName());
                deposit(amount);
            }
        }

        return false;
    }
}

class Transfer implements Runnable {
    private NewBankAccount sourceAccount, destinationAccount;
    private double amount;

    Transfer(NewBankAccount sourceAccount, NewBankAccount destinationAccount, double amount) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
    }

    public void run() {
        while (!sourceAccount.transfer(destinationAccount, amount))
            continue;
        System.out.printf("%s completed\n", Thread.currentThread().getName());
    }
}
