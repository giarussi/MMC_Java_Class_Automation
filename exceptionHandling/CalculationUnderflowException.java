package exceptionHandling;


//Custom exception for calculation underflow
class CalculationUnderflowException extends Exception {
 /**
  * Generated serialVersionUID to handle serialization.
  */
 private static final long serialVersionUID = 1L;

 // Error message associated with the exception
 private String message;

 // Constructor to create an instance of the exception with a specified error message
 public CalculationUnderflowException(String message) {
     this.message = message;
 }

 // Override the getMessage() method to return the error message
 @Override
 public String getMessage() {
     return message;
 }
}
