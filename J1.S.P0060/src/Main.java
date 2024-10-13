import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of bills with validation
        int numOfBills = Validate.checkInt("Input number of bills:", scanner);

        int[] bills = new int[numOfBills];

        // Input values of bills with validation
        for (int i = 0; i < numOfBills; i++) {
            bills[i] = Validate.checkInt("Input value of bill " + (i + 1) + ":", scanner);
        }

        // Input value of wallet with validation
        int walletAmount = Validate.checkInt("Input value of wallet:", scanner);

        // Create Bill and Person objects
        Bill bill = new Bill(bills);
        Person person = new Person(walletAmount);

        // Calculate and pay bills
        System.out.println("This is total of bills: " + bill.calcTotal());
        person.payBills(bill);

        scanner.close();
    }
}