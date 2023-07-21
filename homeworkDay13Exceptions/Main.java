package homeworkDay13Exceptions;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		try {
			//Add functionality
			int result1 = calculator.add(5, 3);
			System.out.println("Addition Result: " + result1);

			//Subtract functionality
			int result2 = calculator.subtract(10, 4);
			System.out.println("Subtraction Result: " + result2);

			//Multiplication functionality
			int result3 = calculator.multiply(6, 7);
			System.out.println("Multiplication Result: " + result3);

			// This will throw DivisionByZeroException
			int result4 = calculator.divide(15, 0);
			System.out.println("Division Result: " + result4);
		} catch (DivisionByZeroException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero occurred.");
		}
	}
}
