package Homework_PayCalculator;

public abstract class Employee {

    
    	private String employeeType;

        public Employee(String employeeType) {
            this.employeeType = employeeType;
        }

        public abstract double calculateSalary(double... args);

        public String getEmployeeType() {
            return employeeType;
        }

        public void setEmployeeType(String employeeType) {
            this.employeeType = employeeType;
        }

}