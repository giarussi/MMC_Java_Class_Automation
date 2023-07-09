package payCalcOOP;

import java.util.Scanner;

public class RegularEmployee extends Employee {
    private int maxHoursWorked = 40;
    private double minHoursWorked = 0.25;

    public RegularEmployee() {
        super("regular");
    }

    public double calculateSalary(double... args) {
    	double regularEmpHourlyPayRate = args[0];
        double hoursWorked = args[1];

        while (hoursWorked > maxHoursWorked || hoursWorked < minHoursWorked) {
            System.out.println("Invalid employee hours. Please re-enter hours for this week (0.25-40 hours): ");
            hoursWorked = new Scanner(System.in).nextDouble();
        }

        return regularEmpHourlyPayRate * hoursWorked;
    }
}
