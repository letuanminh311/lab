import Control.ExpenseController;
import ViewModel.InputData;
import ViewModel.ViewExpense;

public class Main {
    public static void main(String[] args) {
        ExpenseController controller = new ExpenseController();
        ViewExpense view = new ViewExpense();
        InputData inp = new InputData();

        while (true) {
            view.printMenu();
            int choice = inp.inputInteger("Your choice: ", "[1-4]{1}");
            switch (choice) {
                case 1:
                    controller.addExpense();
                    break;
                case 2:
                    controller.displayAllExpenses();
                    break;
                case 3:
                    controller.deleteExpense();
                    break;
                case 4:
                    System.exit(0);
                default:
                    view.displayMessage("Invalid choice. Please try again.");
            }
        }
    }
}
