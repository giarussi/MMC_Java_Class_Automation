package Homework_CarRentalAgencyApp;

public class Bicycle extends Vehicle {

	public Bicycle (String name,int maxSpeed) {
		this.name= name;
		this.maxSpeed=maxSpeed;
	}
	@Override
	public void getDetails() {
		System.out.println("The Vechicle Name is: "+ name);
		System.out.println("The Bicycle Max Speed is :" +maxSpeed);
		
	}

}
