
import java.util.ArrayList;

public class MobilePhone {

    private String mobilePhoneNumber;
    private  ArrayList<Contact> listOfContacts;

    public MobilePhone(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.listOfContacts = new ArrayList<Contact>();
    }

    public void printContacts() {
        System.out.println("*****");
        for (Contact contact: listOfContacts) {
            System.out.println(contact.getName() + " - " + contact.getPhoneNumber());
        }
        System.out.println("*****\n");
    }

    public boolean addNewContact(Contact newContact) {
        if (findContact(newContact.getName()) >= 0) {
            System.out.println("Contact with this name already exist.");
            return false;
        }

        listOfContacts.add(newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        if (contact != null) {
            listOfContacts.remove(contact);
            return true;
        }

        return false;
    }

    public boolean update(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);

        if (position < 0) {
            return false;
        } else if (findContact(newContact.getName()) >= 0) {
            return false;
        }

        listOfContacts.set(position, newContact);
        return true;
    }

    public Contact searchContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.listOfContacts.get(position);
        }

        return null;
    }

    private int findContact(String name) {
        for (int i = 0; i < listOfContacts.size(); i++) {
            Contact contact = this.listOfContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    private int findContact(Contact contact) {
        return this.listOfContacts.indexOf(contact);
    }
}