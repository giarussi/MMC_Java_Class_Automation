package java_Homework.carRentalAgency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * CarRental class to display and add cars
 * 
 * @author U1248069
 *
 */
public class CarRentalAgency {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Class variables
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles = refreshCarList();
		String continueProg;
		int choice;
		System.out.println("Welcome to the Vehicle Rental Agency !");
		do {

			System.out.println("1.Display Details of existing vehicles");
			System.out.println("2. Add Vehicle");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				displayVehicles(vehicles);
				break;
			case 2:
				addVehicle(vehicles);
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("Continue ? (Y/N)");

			continueProg = scan.next();
			System.out.println("continue1:" + continueProg);

		} while (continueProg.equalsIgnoreCase("Y"));

		System.out.println("continue2:" + continueProg);
		// scan.close();

	}

	public static List<Vehicle> refreshCarList() {

		List<Vehicle> vehicles = new ArrayList<Vehicle>();

		vehicles.add(new Car("Santro", 4, 20.23, 156, 35, "Petrol"));
		vehicles.add(new Motorcycle("Bullet", "Manual", "500cc", 110, 13.5));
		vehicles.add(new Bicycle("Summit29", 21, "Aluminium"));

		return vehicles;

	}

	/**
	 * Method to add a vehicle based on user input
	 * 
	 * @param vehicles
	 * @return
	 */
	public static List<Vehicle> addVehicle(List<Vehicle> vehicles) {

		System.out.println("Enter the type of vehicle you wish to add.\n1.Motorcycle\n2.Car\n3.Bicycle");
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			vehicles.add(new Motorcycle());
			System.out.println("Vehicle successfully added !");
			break;
		case 2:
			vehicles.add(new Car());
			System.out.println("Vehicle successfully added !");
			break;
		case 3:
			vehicles.add(new Bicycle());
			System.out.println("Vehicle successfully added !");
			break;
		default:
			System.out.println("Invalid choice");
		}

		return vehicles;

	}

	/**
	 * Method to display all vehicles
	 * 
	 * @param vehicles
	 */
	public static void displayVehicles(List<Vehicle> vehicles) {

		Iterator<Vehicle> i = vehicles.iterator();

		System.out.println("Please find the details of the vehicles available as below\n");

		while (i.hasNext()) {
			i.next().displayDetails();
			System.out.println("=========================\n");

		}

	}

}
