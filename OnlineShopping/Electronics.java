package OnlineShopping;

public class Electronics extends Product implements Purchasable {
    private String brand;
    private String model;

    public Electronics(String name, double price, String brand, String model, int quantity) {
        super(name, price, quantity);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public double calculateTotalPrice(int quantity) {
        return getPrice() * quantity;
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Electronic: " + getName());
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + getPrice());
    }
}
