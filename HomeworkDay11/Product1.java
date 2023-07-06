package HomeworkDay11;

public class Product1 extends Product implements Purchaseable {
	private String color;

	public Product1(String name, double price, String color) {
		super(name, price);
		this.color = color;
	}

	@Override
	public double calculateTotalPrice(int quantity) {
		return price * quantity;
	}

	@Override
	public void displayProductDetails() {
		System.out.println("Product: " + name);
		System.out.println("Color: " + color);
		System.out.println("Price: $" + price);
	}
}