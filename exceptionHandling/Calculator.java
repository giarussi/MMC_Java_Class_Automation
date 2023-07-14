package exceptionHandling;

//Calculator class
class Calculator {
	
 // Method to add two integers
 public int add(int a, int b) throws CalculationOverflowException, CalculationUnderflowException {
     long result = (long) a + (long) b;
     if (result > Integer.MAX_VALUE) {
         throw new CalculationOverflowException("Addition result exceeds the maximum value of an integer.");
     }
     if (result < Integer.MIN_VALUE) {
         throw new CalculationUnderflowException("Addition result is less than the minimum value of an integer.");
     }
     return (int) result;
 }

 // Method to subtract two integers
 public int subtract(int a, int b) throws CalculationOverflowException, CalculationUnderflowException {
     long result = (long) a - (long) b;
     if (result > Integer.MAX_VALUE) {
         throw new CalculationOverflowException("Subtraction result exceeds the maximum value of an integer.");
     }
     if (result < Integer.MIN_VALUE) {
         throw new CalculationUnderflowException("Subtraction result is less than the minimum value of an integer.");
     }
     return (int) result;
 }

 // Method to multiply two integers
 public int multiply(int a, int b) throws CalculationOverflowException, CalculationUnderflowException {
     long result = (long) a * (long) b;
     if (result > Integer.MAX_VALUE) {
         throw new CalculationOverflowException("Multiplication result exceeds the maximum value of an integer.");
     }
     if (result < Integer.MIN_VALUE) {
         throw new CalculationUnderflowException("Multiplication result is less than the minimum value of an integer.");
     }
     return (int) result;
 }

 // Method to divide two integers
 public int divide(int a, int b) throws DivisionByZeroException {
     if (b == 0) {
         throw new DivisionByZeroException("Cannot divide by zero.");
     }
     return a / b;
 }
}