import java.util.Scanner;

public class InputData {
    private Scanner scanner;

    public InputData() {
        scanner = new Scanner(System.in);
    }

    public double getDoubleInput(String prompt) {
        double input = -1;
        while (true) {
            try {
                System.out.print(prompt);
                input = Double.parseDouble(scanner.nextLine());
                if (input > 0) {
                    break; // Exit loop if input is valid
                } else {
                    System.out.println("Error: The input must be a number greater than 0. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid number.");
            }
        }
        return input;
    }
}
