package exceptionHandling;



public class DivisionByZeroException extends Exception {

	private String exceptionMessage;

	 
	public DivisionByZeroException() {
		this.exceptionMessage = "Exception occured!! Number cannot be divided by 0";
	}

	
	public DivisionByZeroException(String message) {
		this.exceptionMessage = message;
	}

	
	@Override
	public String getMessage() {
		return exceptionMessage;
	}
}
