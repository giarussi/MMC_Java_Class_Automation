package carRentalApp;

import java.util.ArrayList;

public class CarRentalAgencyApp {
    public static void main(String[] args) {
        // Create an ArrayList of Vehicle objects
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        // Add instances of Car, Motorcycle, and Bicycle to the ArrayList
        vehicles.add(new Car("Toyota Camry", 4, 8.5));
        vehicles.add(new Motorcycle("Honda CBR500R", "Manual", 471.0));
        vehicles.add(new Bicycle("Trek FX 3", 21, "Aluminum"));

        // Iterate over the vehicles and call the displayDetails() method
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
        }
    }
}