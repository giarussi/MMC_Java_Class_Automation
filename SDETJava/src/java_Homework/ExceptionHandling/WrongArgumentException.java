package java_Homework.ExceptionHandling;

/**
 * Exception class which occurs when input is not an integer
 * 
 * @author U1248069
 *
 */
public class WrongArgumentException extends Exception {

	private String exceptionMessage;
	
	/**
	 * Constructor thats sets default exception message
	 */
	public WrongArgumentException() {
		this.exceptionMessage = "Exception occured!! The value provided is not an Integer.";
	}
	
	/**
	 * Constructor that accepts exception message from user
	 * @param message
	 */
	public WrongArgumentException(String message) {
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
