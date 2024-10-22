import Control.ContactController;
import ViewModel.InputData;
import ViewModel.ViewContact;

public class Main {
    public static void main(String[] args) {
        ContactController controller = new ContactController();
        ViewContact view = new ViewContact();
        InputData inp = new InputData();

        while (true) {
            view.printMenu();
            int choice = inp.inputInteger("Your choice: ", "[1-4]{1}");
            switch (choice) {
                case 1:
                    controller.addContact();
                    break;
                case 2:
                    controller.displayAllContacts();
                    break;
                case 3:
                    controller.deleteContact();
                    break;
                case 4:
                    System.exit(0);
                default:
                    view.displayMessage("Invalid choice. Please try again.");
            }
        }
    }
}
