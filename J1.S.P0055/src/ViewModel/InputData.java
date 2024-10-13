package ViewModel;

import java.util.Scanner;

public class InputData {
    public String inputString(String message, String regex) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while (true) {
            String input = sc.nextLine().trim();
            // Cho phép chuỗi trống để hiển thị toàn bộ danh sách
            if (input.isEmpty() || input.matches(regex)) {
                return input;
            } else {
                System.out.println("Invalid input. Please follow the format: " + regex);
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
                System.out.println("Invalid input. Please enter a valid integer: " + regex);
            }
        }
    }
}
