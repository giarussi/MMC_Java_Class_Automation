package carRentalApp;

//Class representing a motorcycle, inheriting from Vehicle
class Motorcycle extends Vehicle {
 private String transmissionType;
 private double engineDisplacement;

 // Constructor to initialize the motorcycle with name, transmission type, and engine displacement
 public Motorcycle(String name, String transmissionType, double engineDisplacement) {
     super(name);
     this.transmissionType = transmissionType;
     this.engineDisplacement = engineDisplacement;
 }

 // Method to display the details of the motorcycle
 public void displayDetails() {
     System.out.println("Motorcycle: " + getName());
     System.out.println("Transmission Type: " + transmissionType);
     System.out.println("Engine Displacement: " + engineDisplacement);
     System.out.println();
 }
}