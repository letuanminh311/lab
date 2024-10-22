package Control;

import Model.EastAsiaCountries;
import ViewModel.InputData;
import ViewModel.ViewCountry;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ManageEastAsiaCountries {
    private List<EastAsiaCountries> countryList = new ArrayList<>();
    private final InputData inputData = new InputData();
    private final ViewCountry viewCountry = new ViewCountry();

    // Thêm thông tin quốc gia
    public void addCountry() {
        viewCountry.displayMessage("-------- Add a Country --------");

        if (countryList.size() >= 11) {
            viewCountry.displayMessage("You have already entered 11 countries.");
            return;
        }

        // Nhập thông tin quốc gia
        String code = inputData.inputString("Enter Country Code: ", Common.Constant.REGCODE);
        String name = inputData.inputString("Enter Country Name: ", Common.Constant.REGNAME);
        float area = inputData.inputFloat("Enter Total Area: ", Common.Constant.REGTOTALAREA);
        String terrain = inputData.inputString("Enter Country Terrain: ", Common.Constant.REGNAME);

        // Kiểm tra totalArea phải lớn hơn 0
        if (area <= 0) {
            viewCountry.displayMessage("Total area must be greater than 0.");
            return;
        }

        // Thêm quốc gia vào danh sách
        countryList.add(new EastAsiaCountries(code, name, area, terrain));
        viewCountry.displayMessage("Country added successfully.");
    }

    // Hiển thị quốc gia vừa nhập
    public void displayLastEnteredCountry() {
        if (countryList.isEmpty()) {
            viewCountry.displayMessage("No countries have been entered yet.");
        } else {
            // Hiển thị quốc gia cuối cùng vừa nhập
            viewCountry.displayMessage("Displaying the most recently entered country:");
            viewCountry.displayHeader();
            EastAsiaCountries lastCountry = countryList.get(countryList.size() - 1);
            lastCountry.display();
        }

    }

    // Tìm kiếm quốc gia theo tên
    public void searchCountryByName() {
        // Nhập chuỗi tìm kiếm và chuẩn hóa (loại bỏ khoảng trắng thừa và chuyển về chữ thường)
        String searchName = inputData.inputString("Enter the name you want to search for: ", Common.Constant.REGNAME).trim().toLowerCase();
        List<EastAsiaCountries> results = new ArrayList<>();

        // Tìm kiếm quốc gia theo tên sử dụng contains
        for (EastAsiaCountries country : countryList) {
            String countryNameNormalized = country.getCountryName().trim().toLowerCase(); // Chuẩn hóa tên quốc gia
            if (countryNameNormalized.contains(searchName)) { // Dùng contains để tìm kiếm
                results.add(country);
            }
        }

        // Hiển thị kết quả
        if (results.isEmpty()) {
            viewCountry.displayMessage("Country not found.");
        } else {
            viewCountry.displayCountryList(results);
        }
    }


    // Sắp xếp và hiển thị theo thứ tự tên quốc gia tăng dần
    public void sortCountriesByName() {
        countryList.sort(Comparator.comparing(EastAsiaCountries::getCountryName));
        viewCountry.displayCountryList(countryList);
    }
}
