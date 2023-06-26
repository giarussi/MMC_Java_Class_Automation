package payCalculator;

//PayCalculator.java

public class PayCalculator {
 private double hourlyRate;
 private int hoursWorked;
 private double overtimeRate;
 
 public PayCalculator(double hourlyRate, int hoursWorked, double overtimeRate) {
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
     this.overtimeRate = overtimeRate;
 }
 
 /**
  * Calculates the regular pay based on the hourly rate and hours worked.
  * @return the regular pay
  */
 public double calculateRegularPay() {
     return hourlyRate * hoursWorked;
 }
 
 /**
  * Calculates the overtime pay based on the overtime rate and hours worked.
  * Overtime is calculated for hours worked beyond 40 hours.
  * @return the overtime pay
  */
 public double calculateOvertimePay() {
     int overtimeHours = hoursWorked - 40;
     if (overtimeHours > 0) {
         return overtimeHours * overtimeRate;
     } else {
         return 0;
     }
 }
 
 /**
  * Calculates the total pay by adding the regular pay and overtime pay.
  * @return the total pay
  */
 public double calculateTotalPay() {
     double regularPay = calculateRegularPay();
     double overtimePay = calculateOvertimePay();
     return regularPay + overtimePay;
 }
 
 // Getters and setters
 
 public double getHourlyRate() {
     return hourlyRate;
 }

 public void setHourlyRate(double hourlyRate) {
     this.hourlyRate = hourlyRate;
 }

 public int getHoursWorked() {
     return hoursWorked;
 }

 public void setHoursWorked(int hoursWorked) {
     this.hoursWorked = hoursWorked;
 }

 public double getOvertimeRate() {
     return overtimeRate;
 }

 public void setOvertimeRate(double overtimeRate) {
     this.overtimeRate = overtimeRate;
 }
}
