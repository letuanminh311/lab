import java.util.Scanner;

public class InputHandler {
    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your content: ");
        String userInput = scanner.nextLine();
        scanner.close();
        return userInput;
    }
}
