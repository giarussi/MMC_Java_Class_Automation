package carRental;

public class MotorCycle extends carRental {

	int no_of_tyre;

	public int getNo_of_tyre() {
		return no_of_tyre;
	}

	public void setNo_of_tyre(int no_of_tyre) {
		this.no_of_tyre = no_of_tyre;
	}

	String type_car;
	int fuelCapacity;

	public String getType_car() {
		return type_car;
	}

	public void setType_car(String type_car) {
		this.type_car = type_car;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public void displayDetails(String name) {

		setNo_of_tyre(2);
		setFuelCapacity(50);
		setType_car("Petrol bike");

		System.out.println("You are in MotorCycle Class  ");
		System.out.println("Name of Vehicle is " + name);
		System.out.println("MotorCycle type is  " + type_car);
		System.out.println("No of tyre  " + no_of_tyre);
		System.out.println("car fuel capacity  is  " + fuelCapacity);
	}

}
