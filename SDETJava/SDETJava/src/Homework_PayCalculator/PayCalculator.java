package Homework_PayCalculator;

import java.util.Scanner;

public class PayCalculator {
    private Employee employee;

    public void runPayCalculator() {
        boolean continueProgram = false;
        Scanner scanner = new Scanner(System.in);
        do {
            setEmployeeType(getEmployeeTypeFromUser(scanner));
            if (getEmployeeType().equalsIgnoreCase("sales")) {
                employee = new SalesEmployee();
                calculateSalesEmployeePay(scanner);
            } else if (getEmployeeType().equalsIgnoreCase("regular")) {
                employee = new RegularEmployee();
                calculateRegularEmployeePay(scanner);
            } else {
                System.out.println("Invalid employee type. Please try again.");
                continue;
            }

            continueProgram = askToContinue(scanner);
        } while (continueProgram);

        scanner.close();
        System.out.println("Have a great day!");
    }

    private String getEmployeeTypeFromUser(Scanner scanner) {
        System.out.print("Enter employee type (regular/sales): ");
        return scanner.next();
    }

    private void calculateSalesEmployeePay(Scanner scanner) {
        System.out.print("Enter the sales of the sales employee: ");
        int sales = scanner.nextInt();
        scanner.nextLine();

        double totalSalary = employee.calculateSalary(sales);
        System.out.println("Total Weekly pay: " + totalSalary);
    }

    private void calculateRegularEmployeePay(Scanner scanner) {
        System.out.print("Enter employee regular hourly pay rate: ");
        double regularEmpHourlyPayRate = scanner.nextDouble();


        System.out.print("Enter hours worked by employee: ");
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > 40 || hoursWorked < 0.25) {
            System.out.println("Invalid employee hours. Please re-enter hours for this week (0.25-40 hours): ");
            hoursWorked = scanner.nextDouble();
        }

        double totalSalary = employee.calculateSalary(regularEmpHourlyPayRate, hoursWorked);
        System.out.println("Total pay: " + totalSalary);
    }

    private boolean askToContinue(Scanner scanner) {
        System.out.print("Do you want to calculate pay for another employee? (yes/no): ");
        String response = scanner.next();
        return response.equalsIgnoreCase("yes");
    }

    public String getEmployeeType() {
        return employee.getEmployeeType();
    }

    public void setEmployeeType(String employeeType) {
        if (employeeType.equalsIgnoreCase("sales")) {
            this.employee = new SalesEmployee();
        } else if (employeeType.equalsIgnoreCase("regular")) {
            this.employee = new RegularEmployee();
        }
    }
}

