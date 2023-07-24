package calculator;

public class CalculationOverflowException extends Exception {

	private String message;
	public CalculationOverflowException(String string) {

		  this.message = message;
	}

	 // Override the getMessage() method to return the error message
	 @Override
	 public String getMessage() {
	     return message;
	 }

}
