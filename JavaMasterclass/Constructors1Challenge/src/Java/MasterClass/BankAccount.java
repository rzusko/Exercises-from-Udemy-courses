package Java.MasterClass;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        System.out.println("Empty constructor called.");
    }

    public BankAccount(String accountNumber, double balance,
                       String customerName, String email,
                       String phoneNumber) {
        System.out.println("Constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100, customerName, email, phoneNumber);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(double fund) {
        balance += fund;
        System.out.println("Deposit: " + fund);
        System.out.println("New balance = " + balance);
    }

    public void withdraw (double fund) {
        if (fund <= balance) {
            balance -= fund;
            System.out.println("Withdraw: " + fund);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Low account balance.");
        }
    }
}
