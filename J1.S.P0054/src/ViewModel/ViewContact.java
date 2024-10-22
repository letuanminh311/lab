package ViewModel;

import Model.Contact;
import java.util.List;

public class ViewContact {
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void printMenu() {
        System.out.println("========= Contact program =========");
        System.out.println("1. Add a Contact");
        System.out.println("2. Display all Contact");
        System.out.println("3. Delete a Contact");
        System.out.println("4. Exit");
    }

    public void displayPhoneFormat() {
        System.out.println("Please input Phone in one of the following formats:");
        System.out.println("• 1234567890");
        System.out.println("• 123-456-7890");
        System.out.println("• 123-456-7890 x1234");
        System.out.println("• 123-456-7890 ext1234");
        System.out.println("• (123)-456-7890");
        System.out.println("• 123.456.7890");
        System.out.println("• 123 456 7890");
    }

    public void displayContactList(List<Contact> contacts) {
        System.out.println("---------Display all Contact------------");
        // Định dạng hàng tiêu đề
        System.out.printf("%-5s %-20s %-15s %-15s %-10s %-20s %-15s\n", "ID", "Full Name", "First Name", "Last Name", "Group", "Address", "Phone");

        // Định dạng từng hàng của danh bạ
        for (Contact contact : contacts) {
            System.out.printf("%-5d %-20s %-15s %-15s %-10s %-20s %-15s\n",
                    contact.getId(),
                    contact.getFullname(),
                    contact.getFirstName(),
                    contact.getLastName(),
                    contact.getGroup(),
                    contact.getAddress(),
                    contact.getPhone());
        }
    }
}
