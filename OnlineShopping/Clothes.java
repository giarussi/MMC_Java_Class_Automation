package OnlineShopping;

public class Clothes extends Product implements Purchasable {
	private String size;
	private String brand;

    public Clothes(String name, double price, String size, String brand, int quantity) {
        super(name, price, quantity);
        this.size = size;
        this.brand = brand;
    }

    @Override
    public double calculateTotalPrice(int quantity) {
        return getPrice() * quantity;
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size);
        System.out.println("Price: $" + getPrice());
    }
}


