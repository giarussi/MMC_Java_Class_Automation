package java_Homework.ExceptionHandling;

/**
 * Exception class which occurs when number goes beyond capacity of integer
 * value
 * 
 * @author U1234713
 *
 */
public class CalculationOverflowException extends Exception {

	private String exceptionMessage;

	/**
	 * Constructor thats sets default exception message
	 */
	public CalculationOverflowException() {
		this.exceptionMessage = "Exception occured!! Multiplication results in number above max int value("
				+ Integer.MAX_VALUE + ")";
	}

	/**
	 * Constructor that accepts exception message from user
	 * 
	 * @param message
	 */
	public CalculationOverflowException(String message) {
		this.exceptionMessage = message;
	}

	/**
	 * Returns exception message
	 */
	@Override
	public String getMessage() {
		return exceptionMessage;
	}

}
