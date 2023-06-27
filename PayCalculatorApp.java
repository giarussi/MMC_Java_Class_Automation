package payCalculator;

public class PayCalculatorApp {

	// Main.java

	
	 public static void main(String[] args) {
	        InputHandler inputHandler = new InputHandler();
	        
	        double hourlyRate = inputHandler.getHourlyRate();
	        int hoursWorked = inputHandler.getHoursWorked();
	        double overtimeRate = inputHandler.getOvertimeRate();
	        
	        PayCalculator payCalculator = new PayCalculator(hourlyRate, hoursWorked, overtimeRate);
	        double totalPay = payCalculator.calculateTotalPay();
	        
	        System.out.println("Total pay: $" + totalPay);
	        
	        inputHandler.closeScanner();
	    }
}