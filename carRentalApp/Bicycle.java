package carRentalApp;

//Class representing a bicycle, inheriting from Vehicle
class Bicycle extends Vehicle {
 private int numberOfGears;
 private String frameMaterial;

 // Constructor to initialize the bicycle with name, number of gears, and frame material
 public Bicycle(String name, int numberOfGears, String frameMaterial) {
     super(name);
     this.numberOfGears = numberOfGears;
     this.frameMaterial = frameMaterial;
 }

 // Method to display the details of the bicycle
 public void displayDetails() {
     System.out.println("Bicycle: " + getName());
     System.out.println("Number of Gears: " + numberOfGears);
     System.out.println("Frame Material: " + frameMaterial);
     System.out.println();
 }
}