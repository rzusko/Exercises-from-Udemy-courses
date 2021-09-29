import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer>  customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public static Branch createBranch(String name){
        return new Branch(name);
    }

    public boolean addNewCustomer(String name, double initialTransactionAmount) {
        Customer existingCustomer = findCustomer(name);

        if (existingCustomer == null) {
            Customer newCustomer = Customer.createCustomer(name, initialTransactionAmount);

            if (newCustomer == null) {
                return false;
            }

            this.customers.add(newCustomer);
            return true;
        }

        return false;
    }

    public boolean addNewTransaction(String name, double amount) {
        Customer existingCustomer = findCustomer(name);

        if (existingCustomer == null) {
            return false;
        } else if (existingCustomer.addTransaction(amount)) {
            return true;
        }

        return false;
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(name)) {
                return customer;
            }
        }

        return null;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
