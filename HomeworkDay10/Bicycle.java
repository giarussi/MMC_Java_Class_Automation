package HomeworkDay10;

class Bicycle extends Vehicle {
	private int numberOfGears;
	private String frameMaterial;

	public Bicycle(String name, int numberOfGears, String frameMaterial, int speed, String fuelType, int capacity) {
		super(name);
		this.numberOfGears = numberOfGears;
		this.frameMaterial = frameMaterial;
		this.speed = speed;
		this.fuelType = fuelType;
		this.capacity = capacity;
	}

	public void displayDetails() {
		System.out.println("Bicycle Name: " + getName());
		System.out.println("Number of Gears: " + numberOfGears);
		System.out.println("Frame Material: " + frameMaterial);
		System.out.println("Vehicle speed: " + speed);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Vehicle capacity" + capacity);
		System.out.println();
	}
}
