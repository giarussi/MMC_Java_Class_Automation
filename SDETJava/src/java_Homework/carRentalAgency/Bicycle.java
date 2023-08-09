package java_Homework.carRentalAgency;

import java.util.Scanner;

public class Bicycle extends Vehicle {

	private int numberOfGears;
	private String frameMaterial;

	// Constructor to add vehicle by asking input from user
	public Bicycle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide the details for the Bicycle to be added");
		System.out.print("Name: ");
		name = scan.nextLine();
		System.out.print("Frame Material: ");
		frameMaterial = scan.nextLine();
		System.out.print("Number of Speeds: ");
		numberOfGears = scan.nextInt();
		// scan.close();

	}

	// constructor to add details while creating instance
	public Bicycle(String vehicleName, int numberOfGears, String frameMaterial) {
		name = vehicleName;
		this.numberOfGears = numberOfGears;
		this.frameMaterial = frameMaterial;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub

		System.out.println("Vehicle Type: Bicycle");
		System.out.println("Vehicle name: " + name);
		System.out.println("Number of Speeds: " + numberOfGears);
		System.out.println("Frame Material: " + frameMaterial);

	}

}
