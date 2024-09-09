import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = InputData.InputInterge(sc);
        int[] arr = Utils.randomArray(size);
        Utils.printArray(arr, "Unsorted array: ");
        Utils.BubbleSort(arr);
        Utils.printArray(arr, "Sorted array: ");
        sc.close();
    }
}