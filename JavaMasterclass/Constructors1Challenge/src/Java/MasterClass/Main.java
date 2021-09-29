// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.


package Java.MasterClass;

public class Main {

    public static void main(String[] args) {
//        BankAccount account1 = new BankAccount();
//        account1.setAccountNumber("159357354954/5555");
//        account1.setBalance(1524.34);
//        account1.setCustomerName("John Smith");
//        account1.setEmail("jonh.smith@xyz.com");
//        account1.setPhoneNumber("55577799966");
//        account1.deposit(568.66);
//        account1.withdraw(352.98);
//        System.out.println(account1.getAccountNumber());
//        System.out.println(account1.getBalance());
//        System.out.println(account1.getCustomerName());
//        System.out.println(account1.getEmail());
//        System.out.println(account1.getPhoneNumber());
//
//        BankAccount account2 = new BankAccount("Tim Harris", "tim@harris.com", "3557556");

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.

        VipCustomer defaultCustomer = new VipCustomer();
        VipCustomer john = new VipCustomer("John Smith", "john@smith.com");
        VipCustomer thomas = new VipCustomer("Thomas Young", 2500.0, "thomas@young.com");

        System.out.println(defaultCustomer.getCreditLimit());
        System.out.println(john.getEmail());
        System.out.println(thomas.getName());
    }
}
