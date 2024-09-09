import Control.DoctorController;
import Control.DoctorHash;
import ViewModel.InputData;
import ViewModel.ViewDoctor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ViewDoctor view = new ViewDoctor();
        DoctorHash doctorHash = new DoctorHash();
        InputData inp = new InputData();
        DoctorController controller = new DoctorController(doctorHash, view, inp);

        int choice;
        while (true) {
            view.printMenu();
            choice = inp.inputInteger("Your choice: ", "[1-5]{1}");
            switch (choice) {
                case 1 -> controller.addDoctor();
                case 2 -> controller.updateDoctor();
                case 3 -> controller.searchDoctor();
                case 4 -> controller.deleteDoctor();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}