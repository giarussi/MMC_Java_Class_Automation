package exceptionhandlingcalc;

/**
 * Custom exception for underflow during calculation.
 */
class CalculationUnderflowException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CalculationUnderflowException() {
        super("Calculation resulted in an underflow.");
    }
}
