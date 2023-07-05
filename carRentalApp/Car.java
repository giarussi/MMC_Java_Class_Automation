package carRentalApp;

//Class representing a car, inheriting from Vehicle
class Car extends Vehicle {
 private int numberOfDoors;
 private double fuelEfficiency;

 // Constructor to initialize the car with name, number of doors, and fuel efficiency
 public Car(String name, int numberOfDoors, double fuelEfficiency) {
     super(name);
     this.numberOfDoors = numberOfDoors;
     this.fuelEfficiency = fuelEfficiency;
 }

 // Method to display the details of the car
 public void displayDetails() {
     System.out.println("Car: " + getName());
     System.out.println("Number of Doors: " + numberOfDoors);
     System.out.println("Fuel Efficiency: " + fuelEfficiency);
     System.out.println();
 }
}

