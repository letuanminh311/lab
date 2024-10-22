package Control;

import Model.Contact;
import ViewModel.InputData;
import ViewModel.ViewContact;
import java.util.List;

public class ContactController {
    ContactManager contactManager = new ContactManager();
    ViewContact viewContact = new ViewContact();
    InputData inp = new InputData();

    // Thêm một contact
    public void addContact() {
        viewContact.displayMessage("-------- Add a Contact --------");

        // Nhập thông tin
        String fullname = inp.inputString("Enter Name: ", Common.Constant.REGNAME);
        String group = inp.inputString("Enter Group: ", Common.Constant.REGGROUP);
        String address = inp.inputString("Enter Address: ", Common.Constant.REGADDRESS);

        // Hiển thị các định dạng số điện thoại hợp lệ
        viewContact.displayPhoneFormat();

        // Kiểm tra và nhập số điện thoại
        String phone = inp.inputString("Enter Phone: ", Common.Constant.REGPHONE);

        // Thêm contact vào danh sách
        contactManager.addContact(fullname, group, address, phone);
        viewContact.displayMessage("Successful");
    }

    public void displayAllContacts() {
        List<Contact> contacts = contactManager.getAllContacts();
        if (contacts.isEmpty()) {
            viewContact.displayMessage("No contacts available.");
        } else {
            viewContact.displayContactList(contacts);
        }
    }

    public void deleteContact() {
        viewContact.displayMessage("-------- Delete a Contact --------");
        int id = inp.inputInteger("Enter ID: ", "\\d+");

        if (contactManager.deleteContact(id)) {
            viewContact.displayMessage("Contact deleted successfully.");
        } else {
            viewContact.displayMessage("Contact ID not found.");
        }
    }
}
