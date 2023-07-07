package carRental;

public abstract class carRental {

	String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public void displayDetails(String name) {
		System.out.println("You are in Vehicle Class  ");
		System.out.println("Name of Vehicle is " + name);
	}

	public int getNo_of_doors() {
		// TODO Auto-generated method stub
		return 0;
	}

}
