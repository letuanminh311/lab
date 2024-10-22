import java.util.Scanner;

public class Validate {
    public static float getValidNumber(String input) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
                input = sc.nextLine();
            }
        }
    }

    // Kiểm tra số lẻ
    public static boolean isOdd(float number) {
        return number % 2 != 0;
    }

    // Kiểm tra số chính phương
    public static boolean isPerfectSquare(float number) {
        double sqrt = Math.sqrt(number);
        return (sqrt == Math.floor(sqrt));
    }
}
