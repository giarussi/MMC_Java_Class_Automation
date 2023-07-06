package Homework_CarRentalAgencyApp;

import java.util.ArrayList;

public class CarRentalAgency {

	public static void main(String[] args) {
		
		ArrayList <Vehicle> vehicles= new ArrayList<Vehicle>();
		
		vehicles.add(new Motorcycle("Jupiter","Petrol","200liters",100,"automatic","Gearless"));
		vehicles.add(new Car("Honda Amaze","500 liters",200,"Petrol"));
		vehicles.add(new Bicycle("TVS",50));
		
		for (Vehicle Vehicle : vehicles) {
		Vehicle.getDetails();
		System.out.println("-----------------------------------------------");
		}
	}

}
