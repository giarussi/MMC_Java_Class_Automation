package Homework_CarRentalAgencyApp;

public class Motorcycle extends Vehicle {

	String transmissionType; 
	String gearType;
	
	public Motorcycle (String vehicleName, String fuelType, String Capacity,int maxSpeed,String transmissionType, String gearType) {
		this.name= vehicleName;
		this.fuelType=fuelType;
		this.capacity=capacity;
		this.maxSpeed=maxSpeed;
		this.transmissionType= transmissionType;
		this.gearType=gearType;
	}
	
	
	@Override
	public void getDetails() {
		
		System.out.println("The Vechicle Name is: "+ name);
		System.out.println("The Motorcycle Transmission Type is:" + transmissionType);
		System.out.println("The Motorcycle Gear Type is:" + gearType);
		System.out.println("The Motorcycle Capacity is :" + capacity);
		System.out.println("The Motorcycle Max Speed is :" +maxSpeed);
		System.out.println("The Motorcycle Fuel Type is :" + fuelType);
		
		
	}

}
