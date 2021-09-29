// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone("11559977");

    public static void main(String[] args) {
        boolean quit = false;
        showOptions();

        while (!quit) {
            System.out.print("Please choose one of the options (press '0' to show options): ");
            int option = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (option) {
                case 0:
                    showOptions();
                    break;
                case 1:
                    myPhone.printContacts();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void showOptions() {
        System.out.println("Available options: ");
        System.out.println("\t0 - Show options");
        System.out.println("\t1 - Print list of contacts");
        System.out.println("\t2 - Add new contact");
        System.out.println("\t3 - Update existing contact");
        System.out.println("\t4 - Remove contact");
        System.out.println("\t5 - Search/find contact");
        System.out.println("\t6 - Quit");
        System.out.println();
    }

    private static void add() {
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(name, phoneNumber);

        if (myPhone.addNewContact(newContact)) {
            System.out.println("New contact added to list.\n");
        } else {
            System.out.println("Impossible to add new contact with name " + name
                    + " and phone number " + phoneNumber);
        }

    }

    private static void remove() {
        System.out.print("Enter the name of contact you want to remove: ");
        String name = scanner.nextLine();

        Contact contact = myPhone.searchContact(name);
        if (myPhone.removeContact(contact)) {
            System.out.println("Contact with the name " + name + " removed.\n");
        } else {
            System.out.println("Unable to remove contact.\n");
        }
    }

    private static void update() {
        System.out.print("Enter the name of contact you want to update: ");
        String name = scanner.nextLine();

        Contact contact = myPhone.searchContact(name);
        if (contact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new phone number: ");
        String newPhoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhoneNumber);
        if (myPhone.update(contact, newContact)) {
            System.out.println("Contact successfully updated.");
        } else {
            System.out.println("Error updating contact.");
        }

    }


    public static void search() {
        System.out.print("Please enter the name to search: ");
        String name = scanner.nextLine();

        Contact existingContact = myPhone.searchContact(name);

        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContact.getName() +
                " phone number is " + existingContact.getPhoneNumber());
    }
}
