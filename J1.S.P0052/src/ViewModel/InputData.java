package ViewModel;

import java.util.Scanner;

public class InputData {
    Scanner sc = new Scanner(System.in);

    public String inputString(String message, String regex) {
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

    public float inputFloat(String message, String regex) {
        System.out.print(message);
        while (true) {
            String input = sc.nextLine().trim();
            try {
                float value = Float.parseFloat(input);
                if (String.valueOf(value).matches(regex)) {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please follow the format: " + regex);
            }
        }
    }
    public int inputInt(String message, String regex) {
        System.out.print(message);
        while (true) {
            String input = sc.nextLine().trim();
            try {
                int value = Integer.parseInt(input);
                if (String.valueOf(value).matches(regex)) {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please follow the format: " + regex);
            }
        }
    }
}
