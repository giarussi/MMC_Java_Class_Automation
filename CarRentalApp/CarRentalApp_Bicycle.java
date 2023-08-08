package homework;

public class CarRentalApp_Bicycle extends CarRentalApp_Vehicle {
	private int numberOfGears;
	
	public CarRentalApp_Bicycle(String name, int numberOfGears ) {
		super(name);
		this.numberOfGears = numberOfGears;
	}
	
	public int getNumberOfGears() {
		return numberOfGears;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Bike: "+getName());
		System.out.println("Number of gears: "+ numberOfGears);
		System.out.println("--------------------------");
	}

}
