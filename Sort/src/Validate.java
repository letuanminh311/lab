import java.util.Scanner;

public class Validate {
    private static Scanner sc = new Scanner(System.in);

    // Phương thức checkInt để kiểm tra nhập liệu có hợp lệ không
    public static int checkInt(String message, int minValue) {
        int number;
        while (true) {
            System.out.print(message);
            try {
                number = Integer.parseInt(sc.nextLine().trim());
                if (number >= minValue) {
                    return number; // Trả về nếu nhập hợp lệ và >= minValue
                } else {
                    System.out.println("Number must be greater than or equal to " + minValue);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please input a number.");
            }
        }
    }
}
