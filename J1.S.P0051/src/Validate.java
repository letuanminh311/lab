import java.util.Scanner;

public class Validate {
    private static final Scanner in = new Scanner(System.in);

    // Kiểm tra đầu vào số nguyên trong khoảng giới hạn
    public static int checkInputIntLimit(int min, int max, String prompt) {
        int result;
        while (true) {
            System.out.print(prompt);
            try {
                result = Integer.parseInt(in.nextLine().trim());
                if (result >= min && result <= max) {
                    return result;
                }
                System.out.println("Please input number in range [" + min + ", " + max + "]");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    // Kiểm tra đầu vào số thực
    public static double checkInputDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(in.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    // Kiểm tra toán tử hợp lệ
    public static String checkInputOperator() {
        while (true) {
            System.out.print("Enter operator: ");
            String result = in.nextLine().trim();
            if (result.matches("[+\\-*/^=]")) {
                return result;
            }
            System.out.println("Invalid operator. Please input one of (+, -, *, /, ^, =).");
        }
    }
}
