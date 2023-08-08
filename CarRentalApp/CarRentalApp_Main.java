package homework;

import java.util.ArrayList;

public class CarRentalApp_Main {

	public static void main(String[] args) {
		/*
		 * CarRentalApp_Vehicle vehicle = new CarRentalApp_Vehicle("Vechicle");
		 * CarRentalApp_Car car = new CarRentalApp_Car("Xylo", 4); car.displayDetails();
		 * CarRentalApp_Motorcycle motorCycle = new CarRentalApp_Motorcycle("Pulsar",
		 * true); motorCycle.displayDetails(); CarRentalApp_Bicycle bicycle = new
		 * CarRentalApp_Bicycle("FireFox", 5); bicycle.displayDetails();
		 */
		
		ArrayList<CarRentalApp_Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new CarRentalApp_Car("Xylo", 5));
		vehicles.add(new CarRentalApp_Motorcycle("Pulsar", false));
		vehicles.add(new CarRentalApp_Bicycle("FireFox",24));
		
		for (CarRentalApp_Vehicle carRentalApp_Vehicle : vehicles) {
			carRentalApp_Vehicle.displayDetails();
		}
		

	}

}
