package HomeworkDay10;

abstract class Vehicle {
	protected String name;
	protected int speed;
	protected String fuelType;
	protected double capacity;

	public Vehicle(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public abstract void displayDetails();
}