package carRental;

public class BiCycle extends carRental {

	int no_of_doors;
	String type_car;
	int fuelCapacity;

	int no_of_tyre;

	public int getNo_of_tyre() {
		return no_of_tyre;
	}

	public void setNo_of_tyre(int no_of_tyre) {
		this.no_of_tyre = no_of_tyre;
	}

	public String getType_car() {
		return type_car;
	}

	public void setType_car(String type_car) {
		this.type_car = type_car;
	}

	public void displayDetails(String name) {

		setType_car("Gear  BiCycle");
		setNo_of_tyre(2);
		System.out.println("You are in BiCycle  Class  ");
		System.out.println("Name of Vehicle is " + name);
		System.out.println("BiCycle type is  " + type_car);
		System.out.println("No of tyre  " + no_of_tyre);
	}

}
