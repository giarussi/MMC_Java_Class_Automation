package Homework_CarRentalAgencyApp;

public class Car extends Vehicle {

	
	public Car(String name,String capacity,int maxSpeed,String fuelType) {
		this.name= name;
		this.fuelType=fuelType;
		this.capacity=capacity;
		this.maxSpeed=maxSpeed;
	}
	@Override
	public void getDetails() {
		System.out.println("The Vechicle Name is: "+ name);
		System.out.println("The Car Capacity is :" + capacity);
		System.out.println("The Car Max Speed is :" +maxSpeed);
		System.out.println("The Car Fuel Type is :" + fuelType);
		
	}

}
