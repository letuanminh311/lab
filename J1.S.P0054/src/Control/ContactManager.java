package Control;

import Model.Contact;
import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contactList;
    private int nextId;

    public ContactManager() {
        contactList = new ArrayList<>();
        nextId = 1;
    }

    public boolean addContact(String fullname, String group, String address, String phone) {
        contactList.add(new Contact(nextId++, fullname, group, address, phone));
        return true;
    }

    public List<Contact> getAllContacts() {
        return contactList;
    }

    public boolean deleteContact(int id) {
        for (Contact contact : contactList) {
            if (contact.getId() == id) {
                contactList.remove(contact);
                return true;
            }
        }
        return false;
    }
}
