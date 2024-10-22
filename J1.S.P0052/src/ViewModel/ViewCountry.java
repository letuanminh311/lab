package ViewModel;

import Model.EastAsiaCountries;
import java.util.List;

public class ViewCountry {

    // Hàm hiển thị thông báo
    public void displayMessage(String message) {
        System.out.println(message);
    }

    // Hàm hiển thị menu
    public void printMenu() {
        System.out.println("                                MENU                                      ");
        System.out.println("==========================================================================");
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending order");
        System.out.println("5. Exit");
        System.out.println("==========================================================================");
    }

    // Hàm hiển thị tiêu đề bảng
    public void displayHeader() {
        System.out.printf("%-10s %-20s %-15s %-20s\n", "ID", "Name", "Total Area", "Terrain");
    }

    // Hàm hiển thị danh sách quốc gia
    public void displayCountryList(List<EastAsiaCountries> countries) {
        displayHeader(); // Gọi hàm hiển thị tiêu đề bảng
        for (EastAsiaCountries country : countries) {
            country.display();
        }
    }
}
