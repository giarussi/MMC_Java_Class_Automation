package carRental;

class Motorcycle extends Vehicle {
    private String transmissionType;
    private int engineDisplacement;

    public Motorcycle(String name, String transmissionType, int engineDisplacement) {
        super(name);
        this.transmissionType = transmissionType;
        this.engineDisplacement = engineDisplacement;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    @Override
    public void displayDetails() {
        System.out.println("Motorcycle: " + getName());
        System.out.println("Transmission type: " + transmissionType);
        System.out.println("Engine displacement: " + engineDisplacement);
        System.out.println("Availability: " + (isRented() ? "Rented" : "Available"));
        System.out.println();
    }
}
