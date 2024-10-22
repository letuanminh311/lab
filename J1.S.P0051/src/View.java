public class View {

    // Hiển thị menu và trả về lựa chọn của người dùng
    public static int displayMenu() {
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
        return Validate.checkInputIntLimit(1, 3, "Enter your choice: ");
    }

    // Hiển thị kết quả và trạng thái của BMI
    public static void displayBMIResult(double bmi, String status) {
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + status);
    }
}
