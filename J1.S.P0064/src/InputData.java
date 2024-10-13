import java.util.Scanner;

public class InputData {
    private Scanner scanner = new Scanner(System.in);

    public void inputPhone() {
        String phone;
        while (true) {
            System.out.println("Phone number:");
            phone = scanner.nextLine();
            String phoneError = Validate.checkPhone(phone);
            if (!phoneError.isEmpty()) {
                System.out.println(phoneError);
            } else {
                break;
            }
        }
    }

    public void inputEmail() {
        String email;
        while (true) {
            System.out.println("Email:");
            email = scanner.nextLine();
            String emailError = Validate.checkEmail(email);
            if (!emailError.isEmpty()) {
                System.out.println(emailError);
            } else {
                break;
            }
        }
    }

    public void inputDate() {
        String date;
        while (true) {
            System.out.println("Date (dd/MM/yyyy):");
            date = scanner.nextLine();
            String dateError = Validate.checkDate(date);
            if (!dateError.isEmpty()) {
                System.out.println(dateError);
            } else {
                break;
            }
        }
    }

    public void inputAllData() {
        System.out.println("====== Validate Program ======");
        inputPhone();
        inputEmail();
        inputDate();
    }

}
