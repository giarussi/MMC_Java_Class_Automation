package exceptionhandlingcalc;

/**
 * This class tests the functionality of the Calculator class.
 */
public class CalcMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test 1: Addition
        int a = 100;
        int b = 20;
        try {
            int additionResult = calculator.add(a, b);
            System.out.println("Addition: " + additionResult);
        } catch (CalculationOverflowException | CalculationUnderflowException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 2: Subtraction
        a = 50;
        b = 80;
        try {
            int subtractionResult = calculator.subtract(a, b);
            System.out.println("Subtraction: " + subtractionResult);
        } catch (CalculationOverflowException | CalculationUnderflowException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 3: Multiplication
        a = 30;
        b = 10;
        try {
            int multiplicationResult = calculator.multiply(a, b);
            System.out.println("Multiplication: " + multiplicationResult);
        } catch (CalculationOverflowException | CalculationUnderflowException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 4: Division
        a = 100;
        b = 0;
        try {
            int divisionResult = calculator.divide(a, b);
            System.out.println("Division: " + divisionResult);
        } catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
