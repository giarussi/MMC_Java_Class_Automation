package onlineShoppingApp;

public class Electronics extends Product implements Purchasable {
    private String brand; // Brand of the electronics product

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Electronics: " + getName()); // Display the name of the electronics product
        System.out.println("Brand: " + brand); // Display the brand of the electronics product
        System.out.println("Price: $" + getPrice()); // Display the price of the electronics product
    }

    @Override
    public double calculateTotalPrice(int quantity) {
        return getPrice() * quantity; // Calculate the total price of the electronics products based on the quantity
    }
}
