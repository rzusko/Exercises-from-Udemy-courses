import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addNewBranch(String name) {
        Branch existingBranch = findBranch(name);

        if (existingBranch == null) {
            Branch newBranch = Branch.createBranch(name);
            this.branches.add(newBranch);
            return true;
        }

        return false;
    }

    public boolean addNewCustomer(String branchName, String customerName, double initialTransactionAmount) {
        Branch existingBranch = findBranch(branchName);

        if (existingBranch != null) {
            return existingBranch.addNewCustomer(customerName, initialTransactionAmount);
        }

        return false;
    }

    public boolean addTransaction(String branchName, String customerName, double amount) {
        Branch existingBranch = findBranch(branchName);

        if (existingBranch != null) {
            return existingBranch.addNewTransaction(customerName, amount);
        }

        return false;
    }

    public ArrayList<Customer> showCustomersList(String branchName) {
        Branch existingBranch = findBranch(branchName);

        if (existingBranch != null) {
            return existingBranch.getCustomers();
        }

        return null;
    }

    private Branch findBranch(String name) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch existingBranch = this.branches.get(i);

            if (existingBranch.getBranchName().equals(name)) {
                return existingBranch;
            }
        }

        return null;
    }

}
