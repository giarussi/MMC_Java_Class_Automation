package Homework_CarRentalAgencyApp;

public abstract class Vehicle {
	
	
	String name;
	String capacity;
	int maxSpeed;
	String fuelType;
	
	public String getName() {
		return name;
	}
	
	public abstract void getDetails();

}
