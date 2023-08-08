package homework;

public abstract class ShoppingExperience_Product {
protected String name;
protected double price;

public ShoppingExperience_Product(String name, double price) {
	this.name = name;
	this.price = price;
}

public abstract void displayDetails();
}
