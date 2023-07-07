
package carRental;

import java.util.*;

public class Driver_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		MotorCycle motorCycle = new MotorCycle();
		BiCycle biCycle = new BiCycle();

		int n = 3;
		System.out.println("You are in Main Class  ");
		ArrayList<String> list = new ArrayList<String>();
		list.add("Car");// Adding object in arraylist
		list.add("Motorcycle");
		list.add("Bicycle");

		for (int i = 0; i < list.size(); i++) {
			// Printing the arraylist object
			System.out.println("You are at position " + i);

			// System.out.println(list.get(i));

			switch (i) {
			case 0:
				System.out.println("*******************************************");
				System.out.println("You can rent car with below details ");
				car.displayDetails("KIA");
				break;
			case 1:
				System.out.println("*******************************************");
				System.out.println("You can rent Motorcycle with below details ");
				motorCycle.displayDetails("Pulsar");
				break;
			case 2:
				System.out.println("*******************************************");
				System.out.println("You can rent Bicycle with below details ");
				biCycle.displayDetails("Hero Cycles");
				break;
			}
		}

	}
}
