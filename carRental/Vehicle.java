package carRental;

abstract class Vehicle {
    private String name;
    private boolean isRented;

    public Vehicle(String name) {
        this.name = name;
        this.isRented = false;
    }

    public String getName() {
        return name;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rentVehicle() {
        isRented = true;
    }

    public abstract void displayDetails();
}

