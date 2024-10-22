public class Calculator {

    // Máy tính cơ bản
    public static void normalCalculator() {
        double memory = Validate.checkInputDouble("Enter number: ");
        while (true) {
            String operator = Validate.checkInputOperator();
            if (operator.equals("=")) {
                System.out.println("Result: " + memory);
                return;
            }
            double number = Validate.checkInputDouble("Enter number: ");
            try {
                switch (operator) {
                    case "+":
                        memory += number;
                        break;
                    case "-":
                        memory -= number;
                        break;
                    case "*":
                        memory *= number;
                        break;
                    case "/":
                        if (number == 0) {
                            throw new ArithmeticException("Cannot divide by zero.");
                        }
                        memory /= number;
                        break;
                    case "^":
                        memory = Math.pow(memory, number);
                        break;
                }
                System.out.println("Memory: " + memory);
            } catch (ArithmeticException e) {
                System.err.println(e.getMessage());
                System.exit(1); // Thoát chương trình khi chia cho 0
            }
        }
    }

    // Tính toán chỉ số BMI
    public static void BMICalculator() {
        double weight = Validate.checkInputDouble("Enter Weight (kg): ");
        double height = Validate.checkInputDouble("Enter Height (cm): ");
        double bmi = calculateBMI(weight, height);
        String status = BMIStatus(bmi);
        View.displayBMIResult(bmi, status);
    }

    // Phương thức tính chỉ số BMI
    private static double calculateBMI(double weight, double height) {
        return weight * 10000 / (height * height);
    }

    // Xác định trạng thái BMI
    private static String BMIStatus(double bmi) {
        if (bmi < 19) {
            return "Under-standard.";
        } else if (bmi >= 19 && bmi < 25) {
            return "Standard.";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight.";
        } else if (bmi >= 30 && bmi < 40) {
            return "Fat - should lose weight.";
        } else {
            return "Very fat - should lose weight immediately.";
        }
    }
}
