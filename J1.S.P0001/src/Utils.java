import java.util.Random;

public class Utils {
    public static int[] randomArray(int size){
        Random rand = new Random();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }

    public static void printArray(int[] arr, String message){
        System.out.print(message);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void BubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
