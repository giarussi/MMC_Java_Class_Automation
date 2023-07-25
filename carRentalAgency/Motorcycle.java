package carRentalAgency;

import java.util.Scanner;

public class Motorcycle extends Vehicle {

	private String transmissionType, engineDisplacement;
	
	//Constructor to add vehicle by asking input from user
	public Motorcycle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide the details for the motorcycel to be added");
		System.out.print("Name: ");
		name = scan.nextLine();
		System.out.print("Type of Transmission: ");
		transmissionType = scan.nextLine();
		System.out.print("Engine Displacement(in CC): ");
		engineDisplacement = scan.nextLine();
		System.out.print("Maximum Speed(in kmph): ");
		maxSpeed = scan.nextDouble();
		System.out.print("Capacity(litres): ");
		capacity = scan.nextDouble();
		//scan.close();
	}
	
	//constructor to add details while creating instance
	public Motorcycle(String vehicelName, String transmissionType, String engineDisplacement, double maxSpeed,
			double capacity) {
		name = vehicelName;
		this.maxSpeed = maxSpeed;
		this.capacity = capacity;
		this.transmissionType = transmissionType;
		this.engineDisplacement = engineDisplacement;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Type : Motorcycle");
		System.out.println("Vehicle Name: " + name);
		System.out.println("Type of Transmission: " + transmissionType);
		System.out.println("Engine Displacement: " + engineDisplacement);
		System.out.println("Maximum Spped: " + maxSpeed + " kmph");
		System.out.println("Capacity: " + capacity + " litres");
	}

}