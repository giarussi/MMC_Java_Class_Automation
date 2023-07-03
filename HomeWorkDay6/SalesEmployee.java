package HomeWorkDay6;

public class SalesEmployee extends Employee {
	private static final int BASE_SALARY = 750;
	private static final int BONUS = 250;
	private static final int BONUS2 = 500;
	private static final int BONUS3 = 1000;
	private static final int SALES_QUOTA = 15;
	private static final int SALES_QUOTA2 = 25;
	private static final int SALES_QUOTA3 = 40;

	private int sales;

	public SalesEmployee(int hoursWorked, int sales) {
		super("sales", hoursWorked);
		this.sales = sales;
	}

	public int getSales() {
		return sales;
	}

	@Override
	public double calculateSalary() {
		if (sales >= SALES_QUOTA && sales < SALES_QUOTA2) {
			return BASE_SALARY + BONUS;
		} else if (sales >= SALES_QUOTA2 && sales < SALES_QUOTA3) {
			return BASE_SALARY + BONUS2;
		} else if (sales >= SALES_QUOTA3) {
			return BASE_SALARY + BONUS3;
		} else {
			int quotaDifference = SALES_QUOTA - sales;
			System.out.println("Sorry!!! You didn't meet the minimum sales quota. You were short by " + quotaDifference
					+ " sales.");
			return 0;
		}
	}
}