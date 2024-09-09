package ViewModel;

public class ViewDoctor {
    public void printMenu() {
        System.out.println("""
                -------------MENU---------------
                1. Add new doctor
                2. Update doctor information
                3. Search doctor by ID
                4. Delete doctor
                5. Exit
                -------------------------
                """);
    }

    public void displayMessage(String mess) {
        System.out.println(mess);
    }
}
