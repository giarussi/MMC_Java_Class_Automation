package carRental;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CarRentalAgency {
    public void runRentalService() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Honda Civic", 4, 25.5));
        vehicles.add(new Motorcycle("Apache RTR", "Manual", 400));
        vehicles.add(new Bicycle("Trek Mountain Bike", 21, "Aluminum"));
        vehicles.add(new Car("Maruti Swift", 4, 28.3));

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            

            switch (choice) {
                case 1:
                    displayAllVehicles(vehicles);
                    break;
                case 2:
                    rentVehicle(vehicles, scanner);
                    break;
                case 3:
                    checkAvailability(vehicles, scanner);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("------ Car Rental Agency Menu ------");
        System.out.println("1. Display all vehicles and their availability");
        System.out.println("2. Rent a vehicle");
        System.out.println("3. Check vehicle availability");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void displayAllVehicles(List<Vehicle> vehicles) {
        System.out.println("------ All Vehicles ------");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
        }
    }

    private static void rentVehicle(List<Vehicle> vehicles, Scanner scanner) {
    	
        System.out.print("Enter the name of the vehicle you want to rent: ");
        
        String vehicleName = scanner.nextLine();

        boolean found = false;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getName().equalsIgnoreCase(vehicleName)) {
                if (vehicle.isRented()) {
                    System.out.println("Sorry, the vehicle is already rented.");
                } else {
                    vehicle.rentVehicle();
                    System.out.println("You have successfully rented the vehicle: " + vehicle.getName());
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Vehicle not found. Please enter a valid vehicle name.");
        }
    }

    private static void checkAvailability(List<Vehicle> vehicles, Scanner scanner) {
        System.out.print("Enter the name of the vehicle you want to check: ");
        
        String vehicleName = scanner.nextLine();

        boolean found = false;

        for (Vehicle vehicle : vehicles) {
        	
            if (vehicle.getName().equalsIgnoreCase(vehicleName)) {
                System.out.println("Availability: " + (vehicle.isRented() ? "Rented" : "Available"));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Vehicle not found. Please enter a valid vehicle name.");
        }
    }
}

