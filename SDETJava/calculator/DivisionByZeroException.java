package calculator;

public class DivisionByZeroException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 private String message;

	 // Constructor to create an instance of the exception with a specified error message
	 public DivisionByZeroException(String message) {
	     this.message = message;
	 }

	 // Override the getMessage() method to return the error message
	 @Override
	 public String getMessage() {
	     return message;
	 }
}
