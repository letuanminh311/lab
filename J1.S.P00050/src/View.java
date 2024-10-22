import java.util.Scanner;

public class View {
    public static void displayMenu() {
        System.out.println("========= Equation Program =========");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.println("Please choose one option: ");
    }

    // Nhận giá trị hệ số từ người dùng
    public static float getCoefficient(String name) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter " + name + ": ");
            String input = sc.nextLine();
            if (Validate.isValidNumber(input)) {
                return Float.parseFloat(input);
            } else {
                System.out.println("Please input a number");
            }
        }
    }

    // Hiển thị kết quả
    public static void displayResult(String result) {
        System.out.println("----- Result -----");
        System.out.println(result);
    }

    public static void displayErrorMessage(String message) {
        System.out.println("Error: " + message);
    }
}
