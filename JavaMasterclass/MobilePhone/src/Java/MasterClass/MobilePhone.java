package Java.MasterClass;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        int position = findContact(contact);

        if (position == -1) {
            myContacts.add(contact);
            return true;
        }

        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);

        if (position != -1) {
            myContacts.set(position, newContact);
            return true;
        }

        return false;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);

        if (position != -1) {
            myContacts.remove(position);
            return true;
        }

        return false;
    }

    private int findContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(contact.getName())) {
                return i;
            }
        }

        return -1;
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    public Contact queryContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");

        int i = 1;

        for (Contact contact : myContacts) {
            System.out.println(i + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
            i++;
        }
    }
}
