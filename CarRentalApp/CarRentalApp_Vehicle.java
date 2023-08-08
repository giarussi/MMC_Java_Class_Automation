package homework;

public abstract class CarRentalApp_Vehicle {

	private String name;

	public CarRentalApp_Vehicle(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void displayDetails() {
		System.out.println("Vechicle:" +name);
	}
}
