package java_Homework.carRentalAgency;
/**
 * Parent Class Vehicle
 * @author U1248069
 *
 */
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
