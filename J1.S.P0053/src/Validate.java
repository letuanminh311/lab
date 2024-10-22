
import java.util.Scanner;

public class Validate {

    // Hàm kiểm tra input là số nguyên
    public static int checkIntegerInput() {
        Scanner sc = new Scanner(System.in);
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;  // Trả về -1 nếu nhập không phải số nguyên để yêu cầu nhập lại
        }
    }

    // Hàm kiểm tra input là số nguyên (có thể âm hoặc dương)
    public static int checkInteger(String message) {
        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.print(message);
                number = Integer.parseInt(sc.nextLine().trim());
                return number;  // Cho phép nhập bất kỳ số nguyên nào (bao gồm cả số âm)
            } catch (NumberFormatException e) {
                System.out.println("Please input a valid integer.");
            }
        }
    }
}
