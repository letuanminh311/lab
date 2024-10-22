public class Main {
    public static void main(String[] args) {
        while (true) {
            int choice = View.displayMenu();
            switch (choice) {
                case 1:
                    Calculator.normalCalculator();
                    break;
                case 2:
                    Calculator.BMICalculator();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
            }
        }
    }
}
