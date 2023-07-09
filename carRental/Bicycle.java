package carRental;


class Bicycle extends Vehicle {
    private int numberOfGears;
    private String frameMaterial;

    public Bicycle(String name, int numberOfGears, String frameMaterial) {
        super(name);
        this.numberOfGears = numberOfGears;
        this.frameMaterial = frameMaterial;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public String getFrameMaterial() {
        return frameMaterial;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bicycle: " + getName());
        System.out.println("Number of gears: " + numberOfGears);
        System.out.println("Frame material: " + frameMaterial);
        System.out.println("Availability: " + (isRented() ? "Rented" : "Available"));
        System.out.println();
    }
}
