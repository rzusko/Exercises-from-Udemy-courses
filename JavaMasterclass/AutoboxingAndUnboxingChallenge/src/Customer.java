import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public static Customer createCustomer(String name, double initialTransactionAmount) {
        Customer customer = new Customer(name);
        if (customer.addTransaction(initialTransactionAmount)) {
            return customer;
        }

        return null;
    }

    public boolean addTransaction(double amount) {
        if ((this.accountValue() + amount) >= 0.0) {
            this.transactions.add(amount);
            return true;
        }

        return false;
    }

    private double accountValue() {
        double accountValue = 0.0;
        for (int i = 0; i < this.transactions.size(); i++) {
            accountValue += this.transactions.get(i);
        }

        return accountValue;
    }
}
