package onlineShoppingApp;

public class Clothing extends Product implements Purchasable {
    private String size; // Size of the clothing

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Clothing: " + getName()); // Display the name of the clothing product
        System.out.println("Size: " + size); // Display the size of the clothing product
        System.out.println("Price: $" + getPrice()); // Display the price of the clothing product
    }

    @Override
    public double calculateTotalPrice(int quantity) {
        return getPrice() * quantity; // Calculate the total price of the clothing products based on the quantity
    }
}
