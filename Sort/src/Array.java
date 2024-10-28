import java.util.Random;
import java.util.Arrays;

public class    Array {
    private int[] arr;

    // Constructor để khởi tạo mảng với độ dài cho trước
    public Array(int length) {
        arr = new int[length];
        initialize(); // Khởi tạo các giá trị ngẫu nhiên cho mảng
    }

    // Phương thức initialize để khởi tạo mảng với các giá trị ngẫu nhiên từ 0 đến length
    private void initialize() {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(arr.length + 1); // Các số ngẫu nhiên từ 0 đến length
        }
    }

    // Phương thức public để thực hiện sắp xếp mảng
    public void doSort() {
        quickSort(0, arr.length-1); // Gọi hàm private bubbleSort để sắp xếp mảng
    }

    // Hàm private bubbleSort sử dụng thuật toán Bubble Sort
    private void bubbleSort() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi nếu phần tử hiện tại lớn hơn phần tử kế tiếp
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    private void selectionSort() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    private void insertionSort() {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    private void quickSort(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quickSort(low, pivotIndex - 1);
            quickSort(pivotIndex + 1, high);
        }
    }

    private int partition(int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Phương thức toString để in ra mảng dưới dạng chuỗi trong ngoặc vuông
    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
