// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank MyBank = new Bank("My Bank");


    public static void main(String[] args) {
        System.out.println("WELCOME IN OUR BANK APP.\n");
        boolean quit = false;
        showOptions();

        while (!quit) {
            System.out.print("Please choose one of the options (press '0' to show list): ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    showOptions();
                    break;

                case 1:
                    addBranch();
                    break;

                case 2:
                    addCustomer();
                    break;

                case 3:
                    addTransaction();
                    break;

                case 4:
                    showListOfCustomers();
                    break;

                case 5:
                    quit = true;
                    break;
            }
        }

    }

    private static void showOptions() {
        System.out.println("**********");
        System.out.println("Available options:");
        System.out.println("\t0 - Show available options");
        System.out.println("\t1 - Create new branch");
        System.out.println("\t2 - Add customer to branch");
        System.out.println("\t3 - Add transaction");
        System.out.println("\t4 - Show list of customers");
        System.out.println("\t5 - Exit");
        System.out.println("**********");
        System.out.println();
    }

    private static void addBranch() {
        System.out.print("\nEnter the name of branch you want to create: ");
        String branchName = scanner.nextLine();

        if (MyBank.addNewBranch(branchName)) {
            System.out.println("New branch successfully created.");
        } else {
            System.out.println("Problem occurred while creating new branch");
        }
    }

    private static void addCustomer() {
        System.out.print("\nEnter the name of branch which you want to add customer in: ");
        String branchName = scanner.nextLine();

        System.out.print("Enter the name of the customer: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter initial transaction amount: ");
        double initialTransactionAmount = scanner.nextDouble();
        scanner.nextLine();

        if (MyBank.addNewCustomer(branchName, customerName, initialTransactionAmount)) {
            System.out.println("Customer " + customerName +
                    " successfully added to branch " + branchName);
        } else {
            System.out.println("Some problem occurred while adding customer.");
        }
    }

    private static void addTransaction() {
        System.out.print("\nEnter branch name: ");
        String branchName = scanner.nextLine();

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter transaction amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        if (MyBank.addTransaction(branchName, customerName, amount)) {
            System.out.println("Transaction successfully added.");
        } else {
            System.out.println("Some problem occurred while adding transaction.");
        }
    }

    private static void showListOfCustomers() {
        System.out.print("\nEnter branch name: ");
        String branchName = scanner.nextLine();

        ArrayList<Customer> customers = MyBank.showCustomersList(branchName);

        if (customers == null) {
            System.out.println("Some problem occurred while showing the list of customers.");
            return;
        }

        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println("Customer " + (i+1) + ": " + customer.getName());
        }

        System.out.print("For showing transactions press customer number, else press '0'");
        int position = scanner.nextInt() - 1;
        scanner.nextLine();

        if ((position >= 0) && (position < customers.size())) {
            ArrayList<Double> transactions = customers.get(position).getTransactions();

            for (int i = 0; i < transactions.size(); i++) {
                System.out.println(transactions.get(i).doubleValue());
            }
        }
    }
}
