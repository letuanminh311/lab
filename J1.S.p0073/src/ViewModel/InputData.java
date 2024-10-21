package ViewModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class InputData {

    // Nhập chuỗi và kiểm tra theo regex đã cho
    public String inputString(String message, String regex) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while (true) {
            String input = sc.nextLine().trim();  // Loại bỏ khoảng trắng đầu và cuối
            if (input.matches(regex)) {  // Kiểm tra regex
                return input;  // Trả về giá trị đã được chuẩn hóa
            } else {
                System.out.println("Invalid input. Please follow the format: " + regex);
            }
        }
    }

    // Nhập số thực và kiểm tra theo regex đã cho
    public double inputDouble(String message, String regex) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while (true) {
            String input = sc.nextLine().trim();  // Chuẩn hóa đầu vào
            if (input.matches(regex)) {  // Kiểm tra regex cho số
                return Double.parseDouble(input);  // Chuyển đổi sang kiểu double
            } else {
                System.out.println("Invalid input. Please enter a valid amount: " + regex);
            }
        }
    }

    // Nhập số nguyên và kiểm tra theo regex đã cho
    public int inputInteger(String message, String regex) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while (true) {
            String input = sc.nextLine().trim();  // Chuẩn hóa đầu vào
            if (input.matches(regex)) {  // Kiểm tra regex cho số nguyên
                return Integer.parseInt(input);  // Chuyển đổi sang kiểu int
            } else {
                System.out.println("Invalid input. Please enter a valid number: " + regex);
            }
        }
    }

    // Nhập ngày và kiểm tra định dạng dd-MMM-yyyy
    public String inputDate(String message) {
        Scanner sc = new Scanner(System.in);
        String dateFormat = "dd-MMM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);  // Không tự động điều chỉnh các giá trị ngày tháng không hợp lệ

        while (true) {
            System.out.print(message);
            String inputDate = sc.nextLine().trim();
            // Kiểm tra theo regex cho định dạng ngày
            if (inputDate.matches("\\d{2}-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)-\\d{4}")) {
                try {
                    sdf.parse(inputDate);  // Kiểm tra tính hợp lệ của ngày
                    return inputDate;
                } catch (ParseException e) {
                    System.out.println("Invalid date. Please enter a valid date.");
                }
            } else {
                System.out.println("Invalid input. Please use the format dd-MMM-yyyy (e.g., 21-Oct-2023).");
            }
        }
    }
}
