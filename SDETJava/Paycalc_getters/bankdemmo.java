package Paycalc_getters;

import java.util.Scanner;

public class bankdemmo {

	// Driver class

	private static int sales;
	private static String emp_TYPE;

	public static void main(String[] args) {
		bankbalance cust = new bankbalance();
		Customer person = new Customer();
		person.base_salary(cust.Emp_type(), cust.getEmp_Sales());
		person.Display_Salary();

	}
}
