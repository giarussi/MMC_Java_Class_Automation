package java_Homework.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class to provide menu of basic functionality while handling different
 * exceptions
 * 
 * @author U1234713
 *
 */
public class MainClass {
	// Class variables
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int fNumber, sNumber;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Calculator calc = new Calculator();
		int choice;
		System.out.println("Welcome to integer calculations!");
		do {
			// Menu
			System.out.println("\n1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Exit");
			System.out.print("Please chose the operation to be done: ");

			choice = Integer.parseInt(br.readLine());
			try {
				// switch case for different operations
				switch (choice) {
				case 1:
					acceptNumbers();
					System.out.println("Answer: " + calc.add(fNumber, sNumber));
					break;
				case 2:
					acceptNumbers();
					System.out.println("Answer: " + calc.subtract(fNumber, sNumber));
					break;
				case 3:
					acceptNumbers();
					System.out.println("Answer: " + calc.multiple(fNumber, sNumber));
					break;
				case 4:
					acceptNumbers();
					System.out.println("Answer: " + calc.division(fNumber, sNumber));
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Invalid choice !");

				}
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
			}

		} while (true);

	}

	/**
	 * Method to accept input from user
	 * 
	 * @throws IOException
	 * @throws WrongArgumentException
	 */
	public static void acceptNumbers() throws IOException, WrongArgumentException {
		try {
			// accepts numbers. Throws Exception if not integer
			System.out.print("\nEnter the first integer number: ");
			fNumber = Integer.parseInt(br.readLine());

			System.out.print("Enter the second intger number: ");
			sNumber = Integer.parseInt(br.readLine());
		} catch (Exception e) {

			throw new WrongArgumentException();

		}

	}

}
