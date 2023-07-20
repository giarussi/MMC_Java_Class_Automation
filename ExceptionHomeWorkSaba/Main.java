package ExceptionHomeWorkSaba;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // Take user inputs for addition
        System.out.print("Enter the first number for addition: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number for addition: ");
        int num2 = scanner.nextInt();
        // Test addition
        try {
            int result = calculator.add(num1, num2);
            System.out.println("Addition result: " + result);
        } catch (CalculationOverflowException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (CalculationUnderflowException e) {
            System.out.println("Error: " + e.getMessage());
        }
     // Take user inputs for subtraction
        System.out.print("Enter the first number for subtraction: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number for subtraction: ");
        num2 = scanner.nextInt();
     // Test subtraction
        try {
            int result = calculator.subtract(num1, num2);
            System.out.println("Subtraction result: " + result);
        } catch (CalculationOverflowException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (CalculationUnderflowException e) {
            System.out.println("Error: " + e.getMessage());
        }
     // Take user inputs for multiplication
        System.out.print("Enter the first number for multiplication: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number for multiplication: ");
        num2 = scanner.nextInt();

     // Test multiplication
        try {
            int result = calculator.multiply(num1, num2);
            System.out.println("Multiplication result: " + result);
        } catch (CalculationOverflowException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (CalculationUnderflowException e) {
            System.out.println("Error: " + e.getMessage());
        }
     // Take user inputs for division
        System.out.print("Enter the dividend for division: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the divisor for division: ");
        num2 = scanner.nextInt();
        // Test division
        try {
            int result = calculator.divide(num1, num2);
            System.out.println("Division result: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }








}

