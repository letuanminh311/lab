
import java.util.Arrays;

public class View {

    // Hiển thị menu
    public static void printMenu() {
        System.out.println("========= Bubble Sort program =========");
        System.out.println("1. Input Element");
        System.out.println("2. Sort Ascending");
        System.out.println("3. Sort Descending");
        System.out.println("4. Exit");
    }

    // Hiển thị mảng
    public static void displayArray(String message, int[] array) {
        System.out.println(message);
        System.out.println(Arrays.toString(array));
    }
}
