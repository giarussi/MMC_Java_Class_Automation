package java_Homework.RefactoredPayCalc_OOP;

import java.util.Scanner;

/*Main class to calculate pay for
 employee based on employee type*/
public class RefactoredPayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Initialising the type of employee and taking input from the user
		String empType1 = "Regular";
		String empType2 = "Sales";
		boolean continueProg = false;
		RegularEmployee regEmp;
		SalesEmployee salesEmp;
		do {

			continueProg = false;
			System.out.println("Please enter your employment type [" + empType1 + "/" + empType2 + "]");
			String employmentType = scanner.next();

			// Calling the employee class basis the employee type
			if (employmentType.equalsIgnoreCase(empType1)) {

				// Calling Regular Employee type and calculating salary
				regEmp = new RegularEmployee();
				do {
					System.out.println("Enter number of hours worked by employee (min " + regEmp.getMinHoursWorked()
							+ " and max " + regEmp.getMaxHoursWorked() + ")");
					regEmp.setHours(scanner.nextDouble());
					// checkvalidity of hours
				} while (!regEmp.isEmpHoursValid());

				System.out.println("Enter the payrate");
				regEmp.setPayRate(scanner.nextDouble());
				regEmp.calculateSalary();
				regEmp.displayEmpDetails();

			} else if (employmentType.equalsIgnoreCase(empType2)) {

				// Calling Sales Employee type and calculating salary
				salesEmp = new SalesEmployee();

				System.out.println("Enter number of sales done by employee");
				salesEmp.setNumberOfSales(scanner.nextInt());
				salesEmp.calculateSalary();
				salesEmp.displayEmpDetails();

			} else {
				System.out.println("Incorrect employment type entered. Employement type should be either '" + empType1
						+ "' or '" + empType2 + "'. \nSalary could not be calculated. Re-enter the type");
				continueProg = true;
			}
		} while (continueProg);

		scanner.close();

	}

}
