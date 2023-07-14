package exceptionHandling;

import java.util.Scanner;


public class ExceptionHandlingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        boolean continueCalculation = true;

        while (continueCalculation) {
            // Prompt for first number
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            // Prompt for second number
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Prompt for calculation operation
            System.out.println("Select the operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            int result;
            try {
                switch (choice) {
                    case 1:
                        result = calculator.add(num1, num2);
                        System.out.println("Sum: " + result);
                        break;
                    case 2:
                        result = calculator.subtract(num1, num2);
                        System.out.println("Difference: " + result);
                        break;
                    case 3:
                        result = calculator.multiply(num1, num2);
                        System.out.println("Product: " + result);
                        break;
                    case 4:
                        result = calculator.divide(num1, num2);
                        System.out.println("Quotient: " + result);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            } catch (DivisionByZeroException | CalculationOverflowException | CalculationUnderflowException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Ask if the user wants to continue performing calculations
            System.out.print("Do you want to perform another calculation? (Y/N): ");
            String continueChoice = scanner.next();

            continueCalculation = continueChoice.equalsIgnoreCase("Y");
        }

        scanner.close();
    }
}
