package onlineShoppingApp;

public abstract class Product {
    private String name; // Name of the product
    private double price; // Price of the product

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    /**
     * Abstract method to display the details of the product.
     * Each subclass must provide its own implementation of this method.
     */
    public abstract void displayProductDetails();
}
