package exceptionHandling;


public class CalculationOverflowException extends Exception {

	private String exceptionMessage; 

	
	public CalculationOverflowException() {
		this.exceptionMessage = "Exception occured!! Multiplication results in number above max int value("
				+ Integer.MAX_VALUE + ")";
	}

	
	public CalculationOverflowException(String message) {
		this.exceptionMessage = message;
	}

	@Override
	public String getMessage() {
		return exceptionMessage;
	}

}
