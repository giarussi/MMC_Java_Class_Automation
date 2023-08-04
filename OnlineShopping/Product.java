package OnlineShopping;

public abstract class Product {

	protected String productType, productName;
	protected double price;

	abstract double getPrice();

	abstract void displayProductDetails();
}