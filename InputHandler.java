package payCalculator;

//InputHandler.java

import java.util.Scanner;

public class InputHandler {
 private Scanner scanner;
 
 public InputHandler() {
     scanner = new Scanner(System.in);
 }
 
 /**
  * Prompts the user to enter the hourly rate and returns the input.
  * @return the hourly rate entered by the user
  */
 public double getHourlyRate() {
     System.out.print("Enter hourly rate: ");
     return scanner.nextDouble();
 }
 
 /**
  * Prompts the user to enter the hours worked and returns the input.
  * @return the hours worked entered by the user
  */
 public int getHoursWorked() {
     System.out.print("Enter hours worked: ");
     return scanner.nextInt();
 }
 
 /**
  * Prompts the user to enter the overtime rate and returns the input.
  * @return the overtime rate entered by the user
  */
 public double getOvertimeRate() {
     System.out.print("Enter overtime rate: ");
     return scanner.nextDouble();
 }
 
 /**
  * Closes the scanner.
  */
 public void closeScanner() {
     scanner.close();
 }
}
