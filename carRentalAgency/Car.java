package carRentalAgency;

import java.util.Scanner;

public class Car extends Vehicle {

	private int numberOfDoors;
	private double fuelEfficiency;

	// Constructor to add vehicle by asking input from user
	public Car() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide the details for the car to be added");
		System.out.print("Name: ");
		name = scan.nextLine();
		System.out.print("Number of Doors: ");
		numberOfDoors = scan.nextInt();
		System.out.print("Fuel Efficiency(kmpl): ");
		fuelEfficiency = scan.nextDouble();
		System.out.print("Maximum Speed(kmph): ");
		maxSpeed = scan.nextDouble();
		System.out.print("Fuel Type: ");
		fuelType = scan.next();
		System.out.print("Capacity(litres): ");
		capacity = scan.nextDouble();
		// scan.close();

	}

	// constructor to add details while creating instance
	public Car(String vehicleName, int numberOfDoors, double fuelEfficiency, double maxSpeed, double capacity,
			String fuelType) {

		name = vehicleName;
		this.maxSpeed = maxSpeed;
		this.capacity = capacity;
		this.fuelType = fuelType;
		this.numberOfDoors = numberOfDoors;
		this.fuelEfficiency = fuelEfficiency;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Type: Car");
		System.out.println("Vehicle name: " + name);
		System.out.println("Number of Doors: " + numberOfDoors);
		System.out.println("Fuel Efficiency: " + fuelEfficiency + " kmpl");
		System.out.println("Maximum Speed: " + maxSpeed + " kmph");
		System.out.println("Capacity: " + capacity + " litres");
		System.out.println("Fuel Type: " + fuelEfficiency);
	}

}