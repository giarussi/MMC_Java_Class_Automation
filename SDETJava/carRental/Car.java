package carRental;

public class Car extends carRental {

	int no_of_doors;
	String type_car;
	int fuelCapacity;

	public int getNo_of_doors() {
		return no_of_doors;
	}

	public void setNo_of_doors(int no_of_doors) {
		this.no_of_doors = no_of_doors;
	}

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

		setNo_of_doors(4);
		setFuelCapacity(50);
		setType_car("Seltos");
		System.out.println("You are in car Class  ");
		System.out.println("Name of Vehicle is " + name);
		System.out.println("No of doors are " + no_of_doors);
		System.out.println("car type is  " + type_car);
		System.out.println("car fuel capacity  is  " + fuelCapacity);
	}

}
