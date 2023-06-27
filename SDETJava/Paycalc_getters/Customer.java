package Paycalc_getters;

public class Customer {

	// private String emp_TYPE;
	static int sales, sale_Week = 15, max_hrs = 40, min_hrs = 0;

	static double salary = 0.0, Base_pay = 750, Bonus = 250;

	private String emp_TYPE;

	private String emp_sales;

	static String emp_type1 = "Regular", emp_type2 = "sales";

	// Logic for pay calculation for both regular or sales employee

	public double base_salary(String emp_TYPE, int sales) {

		System.out.println(" Emp type is  " + " " + emp_TYPE);
		System.out.println(" Sale/Working hrs" + " " + sales);

		if (emp_TYPE.equalsIgnoreCase(emp_type2)) {
			if (sales > sale_Week) {
				salary = Base_pay + Bonus;
				// System.out.println(" Congratss on your Salary with Bonus " +" " +salary);
				return salary;

			} else if (sale_Week > sales) {
				int diff_sales = sales - sale_Week;

				salary = Base_pay;
				return salary;
			} else {
				System.out.println("  Your Pay in week is  ");// +salary +" Your sales were short by " );
				return Base_pay;
			}
		}

		if (emp_TYPE.equalsIgnoreCase(emp_type1)) {

			if (min_hrs < sales && sales >= max_hrs) {
				salary = sales * Base_pay;
				System.out.println("Salary =" + salary);
				return salary;
			} else {
				System.out.println("Hrs not matching the criteria");
				return salary;
			}
		}
		return salary;

	}

	// Display salary

	public void Display_Salary() {

		System.out.println(" Your salary is  := " + salary);

	}

}
