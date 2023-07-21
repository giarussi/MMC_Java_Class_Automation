package homeworkDay13Exceptions;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) throws DivisionByZeroException {
		if (b == 0) {
			throw new DivisionByZeroException("Division by zero is not allowed.");
		}
		return a / b;
	}
}

// DivisionByZeroException
class DivisionByZeroException extends Exception {
	public DivisionByZeroException(String message) {
		super(message);
	}
}
