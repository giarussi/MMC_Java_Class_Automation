package OnlineShopping;

public abstract class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity ) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract void displayProductDetails();

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
}