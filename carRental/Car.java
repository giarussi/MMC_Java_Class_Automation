package carRental;


class Car extends Vehicle {
    private int numberOfDoors;
    private double fuelEfficiency;

    public Car(String name, int numberOfDoors, double fuelEfficiency) {
        super(name);
        this.numberOfDoors = numberOfDoors;
        this.fuelEfficiency = fuelEfficiency;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car: " + getName());
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Fuel efficiency: " + fuelEfficiency);
        System.out.println("Availability: " + (isRented() ? "Rented" : "Available"));
        System.out.println();
    }
}
