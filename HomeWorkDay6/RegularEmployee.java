package HomeWorkDay6;

public class RegularEmployee extends Employee {
	private double payRate;

	public RegularEmployee(int hoursWorked, double payRate) {
		super("regular", hoursWorked);
		this.payRate = payRate;
	}

	public double getPayRate() {
		return payRate;
	}

	@Override
	public double calculateSalary() {
		return hoursWorked * payRate;
	}
}