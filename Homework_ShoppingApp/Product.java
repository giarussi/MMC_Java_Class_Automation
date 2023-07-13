package Homework_ShoppingApp;

public abstract class Product {

	String prodName;
	double prodPrice;
	int prodQuantity;
	double sum;
	public abstract double calculatePrice();
	public abstract void displayProductDetails();
	
	
	
}
