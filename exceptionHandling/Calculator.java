package exceptionHandling;


public class Calculator { 
 
	
	public int add(int a, int b) throws CalculationOverflowException {
		if (Math.abs(a + b) > Integer.MAX_VALUE) {

			throw new CalculationOverflowException();

		} else {
			return (int) (a + b);
		}
	}

	
	public int subtract(int a, int b) throws CalculationOverflowException {
		if (Math.abs(a - b) > Integer.MAX_VALUE) {

			throw new CalculationOverflowException();

		} else {
			return (int) (a - b);
		}
	}

	
	public int multiple(long a, long b) throws CalculationOverflowException {
		if (Math.abs(a * b) > Integer.MAX_VALUE) {

			throw new CalculationOverflowException();

		} else {
			return (int) (a * b);
		}

	}

	
	public int division(int a, int b) throws DivisionByZeroException {

		if (b == 0) {
			throw new DivisionByZeroException("A number cannot be divided by zero !");
		} else {
			return a / b;
		}
	}
}
