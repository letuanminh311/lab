import java.util.Scanner;

public class InputData {
    public static int InputInterge(Scanner sc) {
        int n;
        while(true) {
            System.out.println("Enter number of array: ");
            if(sc.hasNextInt()) {
                n = sc.nextInt();
                if(n>0){
                    break;
                }
                else {
                    System.out.println("Please enter a positive integer.");
                }
            }
            else {
                System.out.println("Please enter a number");
            }
        }
        return n;
    }
}
