import java.util.Scanner;

public class Validate {
    public static int checkInt(String message, Scanner scanner) {
        int number = 0;
        while (true) {
            try {
                System.out.println(message);
                number = Integer.parseInt(scanner.nextLine());
                if (number <= 0) {
                    throw new NumberFormatException();
                }
                break; // Input is valid, exit loop
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a positive integer.");
            }
        }
        return number;
    }
}
