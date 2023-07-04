package homework;

/*The class calculates salary on the basis on employment type - Regular
 * -- For Regular employees salary should be the product of number of hours and payrate
 * */

public class RegularEmployee {

	private double hours;
	private double payRate;
	private double salary;
	private double maxHoursWorked;
	private double minHoursWorked;

	// Initialising
	public RegularEmployee() {
		hours = 0;
		payRate = 0;
		salary = 0;
		minHoursWorked = 0.25;
		maxHoursWorked = 40;
	}

	// calculating salary basis hours and payRate
	public double calculateSalary() {
		salary = hours * payRate;
		return salary;
	}

	// setter and getter
	public double getSalary() {
		return salary;
	}

	// Checking if hours entered is valid
	public boolean isEmpHoursValid() {
		if (hours > maxHoursWorked || hours < minHoursWorked) {
			System.out.println("You have entered invalid employee hours. Hours should be between (" + minHoursWorked
					+ " - " + maxHoursWorked + ").");
			return false;
		} else {

			return true;
		}
	}

	// Display emp details
	public void displayEmpDetails() {
		System.out.println("Employee Salary Details: ");
		System.out.println("Hours worked: " + getHours());
		System.out.println("Pay Rate: $" + getPayRate());
		System.out.println("Salary: $" + getSalary());
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public double getHours() {
		return hours;
	}

	public double getPayRate() {
		return payRate;
	}

	public double getMaxHoursWorked() {
		return maxHoursWorked;
	}

	public double getMinHoursWorked() {
		return minHoursWorked;
	}
}

