package carRentalApp;

// Abstract class representing a vehicle
abstract class Vehicle {
    private String name;

    // Constructor to initialize the name of the vehicle
    public Vehicle(String name) {
        this.name = name;
    }

    // Getter method for retrieving the name of the vehicle
    public String getName() {
        return name;
    }

    // Abstract method to display the details of the vehicle
    public abstract void displayDetails();
}