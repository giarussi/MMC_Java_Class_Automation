package calculator;

public class calc_Exception {

	
	// Method to add two integers
	 public static double add(double a, double b) throws CalculationOverflowException {
	     long result = (long) a + (long) b;
	     if (result > Integer.MAX_VALUE) {
	         throw new CalculationOverflowException("Addition result exceeds the maximum value of an integer.");
	     }
	     return (double) result;
	 }



//Method to subtract two integers
	 public static double sub(double a, double b) throws CalculationOverflowException {
	     long result = (long) a - (long) b;
	     if (result > Integer.MAX_VALUE) {
	         throw new CalculationOverflowException("subtraction  result is in exception");
	     }
	     return (double) result;
	 }





	//Method to mult  two integers
		 public static double mult(double a, double b) throws CalculationOverflowException {
		     long result = (long) a * (long) b;
		     if (result > Integer.MAX_VALUE) {
		         throw new CalculationOverflowException(" maximum value of an integer.");
		     }
		     return (double) result;
		 }


		//Method to divide  two integers
		 public static double divide(double a, double b) throws DivisionByZeroException, CalculationOverflowException {
		     long result = (long) a / (long) b;
		     if (a == 0 ||b == 0) {
		         throw new DivisionByZeroException("DivisionByZeroException occured");
		     }
		     return (double) result;
		 }



}
