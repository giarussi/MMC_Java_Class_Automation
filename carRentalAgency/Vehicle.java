package carRentalAgency;

public abstract class Vehicle {
	//class variables
	String name, fuelType;;
	double maxSpeed, capacity;

	public String getName() {

		return name;
	}
	//abstract method
	abstract public void displayDetails();
}