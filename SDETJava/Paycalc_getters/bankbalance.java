package Paycalc_getters;

import java.util.Scanner;

public class bankbalance {

	private int emp_sales, Sales = 15;
	static String emp_TYPE;
	private double base_sal = 750.00, Bonus = 250;

	// constructor to accept emp_type

	Scanner scaner = new Scanner(System.in);

	int sales;

	public String Emp_type() {
		System.out.println(" Enter Employee Type ");
		emp_TYPE = scaner.next();
		System.out.println(" Enter Employee Type " + emp_TYPE);
		return emp_TYPE;

	}

	// constructor to accept emp_sales
	public int getEmp_Sales() {
		System.out.println(" Enter Employee Sales /Working hrs  := ");
		emp_sales = scaner.nextInt();
		return emp_sales;
	}

}