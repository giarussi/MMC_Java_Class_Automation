package HomeworkDay10;

public class CarRentalAgenct {

	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = new Car("Kia", 4, 26, 80, "Diesel", 5);
		vehicles[1] = new Motorcycle("Sport Bike", "Automatic", 800, 70, "Diesel", 2);
		vehicles[2] = new Bicycle("Mountain Bike", 15, "Steel", 90, "Diesel", 10);

		// Iterate over each vehicle in ArrayList
		for (Vehicle vehicle : vehicles) {
			vehicle.displayDetails();

		}
	}
}
