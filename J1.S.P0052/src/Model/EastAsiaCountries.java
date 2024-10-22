package Model;

public class EastAsiaCountries extends Country {
    private String countryTerrain;

    // Constructor có tham số, sử dụng từ khóa super để gọi constructor lớp cha
    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    // Getter và Setter cho thuộc tính terrain
    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    // Override phương thức hiển thị
    @Override
    public void display() {
        super.display();
        System.out.printf("%-20s\n", countryTerrain);
    }
}
