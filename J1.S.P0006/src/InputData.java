import java.util.Scanner;

public class InputData {
    public static int InputInterger(Scanner sc, String message ) {
        int n;
        while(true) {
            System.out.println(message);
            if(sc.hasNextInt()) {
                n = sc.nextInt();
                if(n>0){
                    break;
                }
                else {
                    System.out.println("Please input a positive integer");
                }
            }
            else {
                System.out.println("Please input a number");
            }
        }
        return n;
    }
}
