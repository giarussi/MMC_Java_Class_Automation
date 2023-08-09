package java_Homework.OnlineShoppingExperience;
/**
 * Product adbstract class to act as template for various products
 * @author U1248069
 *
 */
public abstract class Product {

	protected String productType, productName;
	protected double price;

	abstract double getPrice();

	abstract void displayProductDetails();
}
