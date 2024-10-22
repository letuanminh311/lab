import java.util.Scanner;

public class View {
    public static void displayMenu() {
        System.out.println("========= Equation Program =========");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
    }

    // Nhận giá trị hệ số từ người dùng
    public static float getCoefficient(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + name + ": ");
        return Validate.getValidNumber(sc.nextLine());
    }

    // Hiển thị kết quả
    public static void displayResult(String result) {
        System.out.println(result);
    }
}
