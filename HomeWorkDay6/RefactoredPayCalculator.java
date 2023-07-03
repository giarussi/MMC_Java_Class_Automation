package HomeWorkDay6;

import java.util.Scanner;

public class RefactoredPayCalculator {

	public static void main(String[] args) {
		boolean continueProgram;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("What is the type of Employee (Regular/Sales)");
			String employeeType = sc.next();

			if (employeeType.equalsIgnoreCase("sales")) {
				System.out.println("How many hours did the employee work this week?");
				int sales = sc.nextInt();

				SalesEmployee salesEmployee = new SalesEmployee(sales, sales);
				double salary = salesEmployee.calculateSalary();
				System.out.println("Employee pay amount: " + salary);

			} else if (employeeType.equalsIgnoreCase("regular")) {
				System.out.println("Enter the number of hours the employee worked");
				int hours = sc.nextInt();

				System.out.println("Enter the hourly pay rate of the employee");
				double payRate = sc.nextDouble();

				RegularEmployee regularEmployee = new RegularEmployee(hours, payRate);
				double salary = regularEmployee.calculateSalary();
				System.out.println("Employee pay amount: " + salary);

			} else {
				System.out.println("Invalid Employee type");
				break;
			}

			System.out.println("Do you want to calculate pay for another employee? (yes/no)");
			String response = sc.next();

			if (response.equalsIgnoreCase("Yes")) {
				continueProgram = true;
			} else {
				continueProgram = false;
				System.out.println("Have a great day!");
				sc.close();
			}

		} while (continueProgram);
	}
}
