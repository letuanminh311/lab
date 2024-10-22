import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            View.displayMenu();
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    float a = View.getCoefficient("A");
                    float b = View.getCoefficient("B");
                    String superlativeResult = Utils.calculateSuperlativeEquation(a, b);
                    View.displayResult(superlativeResult);
                    break;
                case "2":
                    a = View.getCoefficient("A");
                    b = View.getCoefficient("B");
                    float c = View.getCoefficient("C");
                    String quadraticResult = Utils.calculateQuadraticEquation(a, b, c);
                    View.displayResult(quadraticResult);
                    break;
                case "3":
                    System.out.println("Exiting program...");
                    return;
                default:
                    View.displayErrorMessage("Invalid option. Please choose again.");
            }
        }
    }
}
