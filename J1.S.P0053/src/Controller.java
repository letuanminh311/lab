public class Controller {

    private int[] array;

    // Case 1: Nhập mảng với giao diện đúng định dạng
    public void inputArray() {
        System.out.println("----- Input Element -----");

        // Nhập số lượng phần tử của mảng (phải là số nguyên dương > 0)
        int length;
        while (true) {
            System.out.print("Input Length Of Array\nEnter Number: ");
            length = Validate.checkIntegerInput();
            if (length > 0) {
                break;
            } else {
                System.out.println("Please input number and number is greater than zero");
            }
        }

        // Nhập các phần tử của mảng (có thể là số âm hoặc dương)
        array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = Validate.checkInteger("Enter Number " + (i + 1) + ": ");
        }

        // Hiển thị mảng đã nhập
        View.displayArray("Array has been input:", array);
    }

    // Case 2: Sắp xếp tăng dần
    public void sortArrayAscending() {
        if (array != null) {
            int[] sortedArrayAsc = Utils.sortAscending(array.clone());
            View.displayArray("----- Ascending -----", sortedArrayAsc);
        } else {
            System.out.println("You need to input the array first.");
        }
    }

    // Case 3: Sắp xếp giảm dần
    public void sortArrayDescending() {
        if (array != null) {
            int[] sortedArrayDesc = Utils.sortDescending(array.clone());
            View.displayArray("----- Descending -----", sortedArrayDesc);
        } else {
            System.out.println("You need to input the array first.");
        }
    }

    // Case 4: Thoát chương trình
    public void exitProgram() {
        System.out.println("Exiting program.");
        System.exit(0);
    }
}