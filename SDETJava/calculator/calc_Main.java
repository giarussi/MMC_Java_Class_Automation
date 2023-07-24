package calculator;

//Java program for simple calculator
import java.io.*;
import java.lang.*;
import java.util.Scanner;
import calculator.calc_Exception;
//Driver class
public class calc_Main {
	// main function
	public static void main(String[] args) throws CalculationOverflowException
	{
		// Stores two numbers
		double num1, num2;
		String flag=null;
		Scanner scanner = new Scanner(System.in);
		// Take input from the user
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("Enter the numbers:");

			// Take the inputs
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();

			System.out.println("Enter the operator (+,-,*,/):");

			char op = sc.next().charAt(0);
			double o = 0.0;
			try {
				switch (op) {
				// case to add two numbers
				case '+':
					o=calc_Exception.add(num1 , num2);

					break;

					// case to subtract two numbers
				case '-':
					o=calc_Exception.sub(num1 , num2);

					break;

					// case to multiply two numbers
				case '*':
					o=calc_Exception.mult(num1 , num2);

					break;

					// case to divide two numbers
				case '/':
					o = calc_Exception.divide(num1, num2);
					break;

				default:
					System.out.println("You enter wrong input");
				} }catch (ArithmeticException | DivisionByZeroException |CalculationOverflowException e)
			{System.out.print(e);
			}  

			System.out.println("The final result:");


			// print the final result
			System.out.println(num1 + " " + op + " " + num2
					+ " = " + o);

			// To continue performing calculations
			System.out.print("Do you want to perform another calculation? (Y/N): ");
			flag = scanner.next();



		}while( flag.equalsIgnoreCase("Y"));
		scanner.close();

	}
}
