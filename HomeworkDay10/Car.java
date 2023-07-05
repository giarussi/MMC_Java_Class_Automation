package HomeworkDay10;

class Car extends Vehicle {
	private int numberOfDoors;
	private double fuelEfficiency;

	public Car(String name, int numberOfDoors, double fuelEfficiency, int speed, String fuelType, int capacity) {
		super(name);
		this.numberOfDoors = numberOfDoors;
		this.fuelEfficiency = fuelEfficiency;
		this.speed = speed;
		this.fuelType = fuelType;
		this.capacity = capacity;

	}
	
	public void displayDetails() {
		System.out.println("Car Name: " + getName());
		System.out.println("Number of Doors: " + numberOfDoors);
		System.out.println("Fuel Efficiency: " + fuelEfficiency);
		System.out.println("Vehicle speed: " + speed);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Vehicle capacity" + capacity);
		System.out.println();
	}
}