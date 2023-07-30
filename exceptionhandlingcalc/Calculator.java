package exceptionhandlingcalc;

/**
 * Simple calculator class that performs basic arithmetic operations.
 */
public class Calculator {

    /**
     * Method to add two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of the two integers.
     * @throws CalculationOverflowException 
     * @throws CalculationUnderflowException 
     */
    public int add(int a, int b) throws CalculationOverflowException, CalculationUnderflowException {
        long result = (long) a + b;
        if (result > Integer.MAX_VALUE) {
            throw new CalculationOverflowException();
        } else if (result < Integer.MIN_VALUE) {
            throw new CalculationUnderflowException();
        }
        return (int) result;
    }

    /**
     * Method to subtract two integers.
     *
     * @param a The first integer (minuend).
     * @param b The second integer (subtrahend).
     * @return The difference between the two integers.
     */
    public int subtract(int a, int b) throws CalculationOverflowException, CalculationUnderflowException {
        long result = (long) a - b;
        if (result > Integer.MAX_VALUE) {
            throw new CalculationOverflowException();
        } else if (result < Integer.MIN_VALUE) {
            throw new CalculationUnderflowException();
        }
        return (int) result;
    }

    /**
     * Method to multiply two integers.
     *
     * @param a The first integer (multiplicand).
     * @param b The second integer (multiplier).
     * @return The product of the two integers.
     */
    public int multiply(int a, int b) throws CalculationOverflowException, CalculationUnderflowException {
        long result = (long) a * b;
        if (result > Integer.MAX_VALUE) {
            throw new CalculationOverflowException();
        } else if (result < Integer.MIN_VALUE) {
            throw new CalculationUnderflowException();
        }
        return (int) result;
    }

    /**
     * Method to divide two integers.
     *
     * @param a The numerator (dividend).
     * @param b The denominator (divisor).
     * @return The result of the division.
     * @throws DivisionByZeroException if the divisor is zero.
     */
    public int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }
}

