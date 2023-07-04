package homework;

/*The class calculates salary on the basis on employment type -  Sales
 * -- For Sales employee salary is calculated on the basis on number of sales
 * --- Exceeding 15 sales, bonus = 250
 * --- Exceeding 25 sales, bonus = 5000
 * --- Exceeding 40 sales, bonus = 1000 
 * */
public class SalesEmployee {

	private double baseSalary;
	private double additionalBonus1;
	private double additionalBonus2;
	private double additionalBonus3;
	private int salesQouta1;
	private int salesQouta2;
	private int salesQouta3;
	private double salary;
	private int numberOfSales;
	private String bonusType;

	// Constructor to initialise 

	public SalesEmployee() {
		baseSalary = 750;
		additionalBonus1 = 250;
		additionalBonus2 = 500;
		additionalBonus3 = 1000;
		salesQouta1 = 15;
		salesQouta2 = 25;
		salesQouta3 = 40;
		salary = 0;
		numberOfSales = 0;
		bonusType = null;
	}

	// setter and getter for number of sales of employee
	public void setNumberOfSales(int numberOfSales) {
		this.numberOfSales = numberOfSales;
	}

	public int getNumberOfSales() {
		return numberOfSales;
	}

	// setter and getter for base salary of employee
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getSalary() {
		return salary;
	}

	// calculating salary on the basis of number of sales
	public double calculateSalary() {

		if (numberOfSales >= salesQouta3) {
			salary = baseSalary + additionalBonus3;
			System.out.println("Congratulations! You have met your weekly qouta and will receive additional bonus of $"
					+ additionalBonus3);
		} else if (numberOfSales >= salesQouta2) {
			salary = baseSalary + additionalBonus2;
			System.out.println("Congratulations! You have met your weekly qouta and will receive additional bonus of $"
					+ additionalBonus2);
		} else if (numberOfSales >= salesQouta1) {
			salary = baseSalary + additionalBonus1;
			System.out.println("Congratulations! You have met your weekly qouta and will receive additional bonus of $"
					+ additionalBonus1);
		} else {
			int salesDiff = salesQouta1 - numberOfSales;
			salary = baseSalary;
			System.out.println("You missed the minimum sales qouta by " + salesDiff + " sales. Try again next month!");
		}

		return salary;
	}

	// displaying emp details
	public void displayEmpDetails() {
		System.out.println("Employee Salary Details: ");
		System.out.println("Number of sales by employee: " + getNumberOfSales());
		System.out.println("Base Salary for employee: $" + getBaseSalary());
		System.out.println("Salary for Employee: $" + getSalary());
	}
}

