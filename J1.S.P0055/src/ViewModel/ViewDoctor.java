package ViewModel;

public class ViewDoctor {
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void printMenu() {
        System.out.println("========= Doctor Management ==========");
        System.out.println("1. Add Doctor");
        System.out.println("2. Update Doctor");
        System.out.println("3. Delete Doctor");
        System.out.println("4. Search Doctor");
        System.out.println("5. Exit");
        System.out.println("======================================");
    }

    public void displayDoctorListHeader() {
        System.out.printf("%5s  %20s  %20s  %5s\n", "Code", "Name", "Specialization", "Avail");
    }

}
