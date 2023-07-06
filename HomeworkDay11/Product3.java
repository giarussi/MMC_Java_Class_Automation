package HomeworkDay11;

public class Product3 extends Product implements Purchaseable{

	private String type;

	public Product3(String name, double price,String type) {
		super(name, price);
		this.type = type;
	}

	@Override
	public double calculateTotalPrice(int quantity) {
		return price * quantity;
	}

	@Override
	public void displayProductDetails() {
		System.out.println("Product: " + name);
		System.out.println("Color: " + type);
		System.out.println("Price: $" + price);
	}
	

}
