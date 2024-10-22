public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        while (true) {
            View.printMenu();
            System.out.print("Please choice one option: ");
            int choice = Validate.checkIntegerInput();

            switch (choice) {
                case 1:
                    // Nhập phần tử mảng
                    controller.inputArray();
                    break;
                case 2:
                    // Sắp xếp tăng dần
                    controller.sortArrayAscending();
                    break;
                case 3:
                    // Sắp xếp giảm dần
                    controller.sortArrayDescending();
                    break;
                case 4:
                    // Thoát chương trình
                    controller.exitProgram();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}