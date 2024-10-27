import Control.EmployeeController;
import ViewModel.InputData;
import ViewModel.ViewEmployee;

public class Main {
    public static void main(String[] args) {
        EmployeeController controller = new EmployeeController();
        ViewEmployee view = new ViewEmployee();
        InputData input = new InputData();

        while (true) {
            view.printMenu();
            int choice = input.inputInteger("Your choice: ", "[1-6]{1}");
            switch (choice) {
                case 1: controller.addEmployee(); break;
                case 2: controller.updateEmployee(); break;
                case 3: controller.deleteEmployee(); break;
                case 4: controller.searchEmployee(); break;
                case 5: controller.displayEmployeesSortedBySalary(); break;
                case 6: System.exit(0);
                default: view.displayMessage("Invalid choice. Please try again.");
            }
        }
    }
}
