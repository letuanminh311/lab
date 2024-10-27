package ViewModel;

import java.util.Scanner;

public class InputData {

    public String inputString(String message, String regex) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while (true) {
            String input = sc.nextLine().trim();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("Invalid input. Please follow the format: " + regex);
            }
        }
    }

    public double inputDouble(String message, String regex) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while (true) {
            String input = sc.nextLine().trim();
            if (input.matches(regex)) {
                return Double.parseDouble(input);
            } else {
                System.out.println("Invalid input. Please enter a valid amount: " + regex);
            }
        }
    }

    public int inputInteger(String message, String regex) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while (true) {
            String input = sc.nextLine().trim();
            if (input.matches(regex)) {
                return Integer.parseInt(input);
            } else {
                System.out.println("Invalid input. Please enter a valid number: " + regex);
            }
        }
    }
    public String inputPhone(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextLine().trim();
    }
}
