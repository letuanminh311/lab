import java.util.Scanner;

public class Validate {
    // Kiểm tra input có phải là số hay không
    public static boolean isValidNumber(String input) {
        try {
            Float.parseFloat(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
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

    // Kiểm tra số chẵn
    public static boolean isEven(float number) {
        return number % 2 == 0;
    }
}
