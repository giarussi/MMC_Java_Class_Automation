package java_Homework.ExceptionHandling;

/**
 * Exception class which occurs when division by 0 is attempted
 * 
 * @author U1248069
 *
 */

public class DivisionByZeroException extends Exception {

	private String exceptionMessage;

	/**
	 * Constructor thats sets default exception message
	 */
	public DivisionByZeroException() {
		this.exceptionMessage = "Exception occured!! Number cannot be divided by 0";
	}

	/**
	 * Constructor that accepts exception message from user
	 * 
	 * @param message
	 */
	public DivisionByZeroException(String message) {
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
