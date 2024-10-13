import Control.DoctorController;
import ViewModel.InputData;
import ViewModel.ViewDoctor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoctorController controller = new DoctorController();  // Khởi tạo DoctorController
        ViewDoctor view = new ViewDoctor();  // Khởi tạo ViewDoctor để hiển thị
        InputData inp = new InputData();  // Khởi tạo InputData để nhận dữ liệu từ người dùng

        // Chạy vòng lặp chương trình cho đến khi người dùng chọn 'Exit'
        while (true) {
            view.printMenu();  // Hiển thị menu chức năng
            int choice = inp.inputInteger("Choose an option: ", "[1-5]{1}");  // Người dùng chọn thao tác
            switch (choice) {
                case 1:
                    controller.addDoctor();  // Thực hiện thao tác thêm bác sĩ
                    break;
                case 2:
                    controller.updateDoctor();  // Thực hiện thao tác cập nhật bác sĩ
                    break;
                case 3:
                    controller.deleteDoctor();  // Thực hiện thao tác xóa bác sĩ
                    break;
                case 4:
                    controller.searchDoctor();  // Thực hiện thao tác tìm kiếm bác sĩ
                    break;
                case 5:
                    System.exit(0);  // Thoát chương trình nếu chọn 5
                    break;
                default:
                    view.displayMessage("Invalid choice. Please try again.");  // Hiển thị lỗi nếu nhập sai
            }
        }
    }
}