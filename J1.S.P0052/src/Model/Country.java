package Model;

public class Country {
    protected String countryCode;
    protected String countryName;
    protected float totalArea;

    // Constructor không tham số
    public Country() {}

    // Constructor có tham số
    public Country(String countryCode, String countryName, float totalArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
    }

    // Getter và Setter cho các thuộc tính
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    // Phương thức hiển thị thông tin
    public void display() {
        System.out.printf("%-10s %-20s %-15.2f", countryCode, countryName, totalArea);
    }
}
