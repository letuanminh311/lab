import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = InputData.InputInterger(sc, "Enter number of array:");
        int[] arr = Utils.randomArray(size);
        int searchValue = InputData.InputInterger(sc, "Enter search value:");
        Utils.printArray(arr, "Unsorted Array:");
        Utils.BubbleSort(arr);
        Utils.printArray(arr, "Sorted Array:");
        int index = Utils.binarySearch(arr, searchValue);
        if (index != -1) {
            System.out.println("Found " + searchValue + " at index " + index);
        } else {
            System.out.println(searchValue + " not found in the array.");
        }
        sc.close();
    }
}