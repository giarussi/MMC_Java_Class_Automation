package exceptionhandlingcalc;

/**
 * Custom exception for overflow during calculation.
 */
class CalculationOverflowException extends Exception {
	// Generated serialVersionUID to maintain serialization compatibility
	private static final long serialVersionUID = 1L;

	public CalculationOverflowException() {
        super("Calculation resulted in an overflow.");
    }
}
