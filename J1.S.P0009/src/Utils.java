public class Utils {
    public static long fibonacci(int i){
        if(i<=1){
            return i;
        }
        return fibonacci(i-1)+fibonacci(i-2);
    }

    public static void printFibonacciSequence(int n){
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i)+ (i<n-1 ? ", " :""));
        }
    }
}
