package exceptionHandling;

/**
 * Class to perform basic calculations
 * 
 * @author U1248069
 *
 */
public class Calculator {

	/**
	 * Addition method that returns sum of 2 numbers
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @throws CalculationOverflowException
	 */
	public int add(int a, int b) throws CalculationOverflowException {
		if (Math.abs(a + b) > Integer.MAX_VALUE) {

			throw new CalculationOverflowException();

		} else {
			return (int) (a + b);
		}
	}

	/**
	 * Subtraction method that returns difference of 2 numbers
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @throws CalculationOverflowException 
	 */
	public int subtract(int a, int b) throws CalculationOverflowException {
		if (Math.abs(a - b) > Integer.MAX_VALUE) {

			throw new CalculationOverflowException();

		} else {
			return (int) (a - b);
		}
	}

	/**
	 * Multiplication method that returns product of 2 numbers
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @throws CalculationOverflowException
	 */
	public int multiple(long a, long b) throws CalculationOverflowException {
		if (Math.abs(a * b) > Integer.MAX_VALUE) {

			throw new CalculationOverflowException();

		} else {
			return (int) (a * b);
		}

	}

	/**
	 * Division method that returns qoutient of 2 numbers
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @throws DivisionByZeroException
	 */
	public int division(int a, int b) throws DivisionByZeroException {

		if (b == 0) {
			throw new DivisionByZeroException("A number cannot be divided by zero !");
		} else {
			return a / b;
		}
	}
}
