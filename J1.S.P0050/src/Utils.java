import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static String calculateSuperlativeEquation(float a, float b) {
        if (a == 0) {
            if (b == 0) {
                return "Infinite solutions";
            } else {
                return "No solution";
            }
        }
        float x = -b / a;
        List<Float> numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(x);

        String result = "Solution: x = " + x + "\n" + analyzeNumbers(numbers);
        return result;
    }

    // Giải phương trình bậc hai: ax^2 + bx + c = 0
    public static String calculateQuadraticEquation(float a, float b, float c) {
        float delta = b * b - 4 * a * c;
        if (delta < 0) {
            return "No real solution";
        }

        float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
        float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));

        List<Float> numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(x1);
        numbers.add(x2);

        String result = "Solution: x1 = " + x1 + ", x2 = " + x2 + "\n" + analyzeNumbers(numbers);
        return result;
    }

    // Phân tích số chẵn, lẻ và số chính phương
    public static String analyzeNumbers(List<Float> numbers) {
        StringBuilder oddNumbers = new StringBuilder("Odd numbers: ");
        StringBuilder evenNumbers = new StringBuilder("Even numbers: ");
        StringBuilder perfectSquares = new StringBuilder("Perfect squares: ");

        for (Float number : numbers) {
            if (Validate.isOdd(number)) {
                oddNumbers.append(number).append(" ");
            } else {
                evenNumbers.append(number).append(" ");
            }
            if (Validate.isPerfectSquare(number)) {
                perfectSquares.append(number).append(" ");
            }
        }

        return oddNumbers.toString() + "\n" + evenNumbers.toString() + "\n" + perfectSquares.toString();
    }
}
