package exceptionHandling;


public class WrongArgumentException extends Exception {

	private String exceptionMessage;
	
	
	public WrongArgumentException() {
		this.exceptionMessage = "Exception occured!! The value provided is not an Integer.";
	}
	
	 
	public WrongArgumentException(String message) {
		this.exceptionMessage = message;
	}
	
	@Override
	public String getMessage() {
		return exceptionMessage;
	}

}
