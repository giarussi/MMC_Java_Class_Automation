package exceptionhandlingcalc;

/**
 * Custom exception for division by zero.
 */
class DivisionByZeroException extends Exception {
	// Generated serialVersionUID to maintain serialization compatibility
	private static final long serialVersionUID = 1L;

	public DivisionByZeroException() {
        super("Division by zero is not allowed.");
    }
}