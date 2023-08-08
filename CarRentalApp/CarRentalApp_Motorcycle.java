package homework;

public class CarRentalApp_Motorcycle extends CarRentalApp_Vehicle{
	private boolean hasSideCar;

	public CarRentalApp_Motorcycle(String name, boolean hasSideCar) {
		super(name);
		this.hasSideCar = hasSideCar;
	}
	
	public boolean hasSideCar() {
		return hasSideCar;
	}
	
	public void displayDetails() {
		System.out.println("Motorcycle: "+  getName());
		System.out.println("Has sidecar: " + hasSideCar());
		System.out.println("--------------------------");
	}

}
