public class Main {
    public static void main(String[] args) {
        // Nhập độ dài mảng từ người dùng với kiểm tra hợp lệ
        int length = Validate.checkInt("Enter length of array: ", 1);

        // Tạo đối tượng Array với độ dài mảng đã nhập
        Array array = new Array(length);

        // In ra mảng chưa sắp xếp
        System.out.println("Unsorted array: " + array);

        // Gọi hàm sắp xếp
        array.doSort();

        // In ra mảng đã sắp xếp
        System.out.println("Sorted array: " + array);
    }
}
