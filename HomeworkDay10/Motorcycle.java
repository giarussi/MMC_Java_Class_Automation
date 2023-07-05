package HomeworkDay10;

class Motorcycle extends Vehicle {
    private String transmissionType;
    private int engineDisplacement;

    public Motorcycle(String name, String transmissionType, int engineDisplacement,int speed,String fuelType,int capacity) {
        super(name);
        this.transmissionType = transmissionType;
        this.engineDisplacement = engineDisplacement;
        this.speed=speed;
        this.fuelType=fuelType;
        this.capacity=capacity;
    }

    public void displayDetails() {
        System.out.println("Motorcycle Name: " + getName());
        System.out.println("Transmission Type: " + transmissionType);
        System.out.println("Engine Displacement: " + engineDisplacement);
		System.out.println("Vehicle speed: " + speed);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Vehicle capacity" + capacity);
        System.out.println();
    }
}