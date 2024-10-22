import Control.ManageEastAsiaCountries;
import ViewModel.InputData;
import ViewModel.ViewCountry;

public class Main {
    public static void main(String[] args) {
        ManageEastAsiaCountries manager = new ManageEastAsiaCountries();
        ViewCountry view = new ViewCountry();
        InputData inp = new InputData();

        while (true) {
            // Hiển thị menu
            view.printMenu();

            // Lựa chọn từ người dùng
            int choice = inp.inputInt("Enter your choice: ", "[1-5]{1}");

            switch (choice) {
                case 1:
                    // Nhập thông tin quốc gia
                    manager.addCountry();
                    break;
                case 2:
                    // Hiển thị quốc gia vừa nhập
                    manager.displayLastEnteredCountry();
                    break;
                case 3:
                    // Tìm kiếm thông tin quốc gia theo tên
                    manager.searchCountryByName();
                    break;
                case 4:
                    // Sắp xếp quốc gia theo tên và hiển thị
                    manager.sortCountriesByName();
                    break;
                case 5:
                    // Thoát chương trình
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    view.displayMessage("Invalid choice. Please try again.");
            }
        }
    }
}
