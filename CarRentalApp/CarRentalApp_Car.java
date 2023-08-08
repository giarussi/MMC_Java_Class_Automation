package homework;

public class CarRentalApp_Car extends CarRentalApp_Vehicle {
private int numberOfDoors;
	
	public CarRentalApp_Car(String name, int numberOfDoors ) {
		super(name);
		this.numberOfDoors = numberOfDoors;
		
	}
	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	
	public void displayDetails() {
		System.out.println("Car:" + getName());
		System.out.println("Number of doors:"+numberOfDoors);
		System.out.println("--------------------------");
	}

}
