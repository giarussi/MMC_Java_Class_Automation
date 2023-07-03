package HomeWorkDay6;

public abstract class Employee {
	protected String type;
	protected int hoursWorked;

	public Employee(String type, int hoursWorked) {
		this.type = type;
		this.hoursWorked = hoursWorked;
	}

	public String getType() {
		return type;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public abstract double calculateSalary();
}
