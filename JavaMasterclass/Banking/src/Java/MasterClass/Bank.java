package Java.MasterClass;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            this.branches.add(new Branch(name));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            if (branch.newCustomer(customerName, initialTransaction)) {
                return true;
            }
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            if (branch.addCustomerTransaction(customerName, transaction)) {
                return true;
            }
        }

        return false;
    }

    private Branch findBranch(String name) {
        for (Branch branch : branches) {
            if (branch.getName().equals(name)) {
                return branch;
            }
        }

        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            int i = 1;
            for (Customer customer : branch.getCustomers()) {
                System.out.println("Customer: " + customer.getName() + "[" + i++ + "]");

                if (printTransaction) {
                    System.out.println("Transactions");
                    int j = 1;
                    for (double transaction : customer.getTransactions()) {
                        System.out.println("[" + j++ + "]  Amount " + transaction);
                    }
                }
            }
            return true;
        }

        return false;
    }
}
