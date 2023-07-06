package HomeworkDay11;

public class Product2 extends Product implements Purchaseable {
	private double weight;

	public Product2(String name, double price, double weight) {
		super(name, price);
		this.weight = weight;
	}

	@Override
	public double calculateTotalPrice(int quantity) {

		// shipping fee based on weight of the product
		double totalPrice = price * quantity;
		
		// Assuming shipping fee is $1.5 per unit weight
		double shippingFee = weight * 1.5; 
		return totalPrice + shippingFee;
	}

	@Override
	public void displayProductDetails() {
		System.out.println("Product: " + name);
		System.out.println("Weight: " + weight + " kg");
		System.out.println("Price: $" + price);
	}
}