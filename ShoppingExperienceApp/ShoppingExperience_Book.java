package homework;

public class ShoppingExperience_Book extends ShoppingExperience_Product implements ShoppingExperience_Purchasable  {
private String author;
int quantity;

	
	public ShoppingExperience_Book(String name, double price, String author) {
		super(name, price);
		this.author =author;
	}

	@Override
	public void displayDetails() {
		System.out.println("Book:" + name);
		System.out.println("Author:" + author);
		System.out.println("Price:" + price);
		
	}

	@Override
	public double calculateTotalPrice(int quantity) {
		return price*quantity;
	}

	@Override
	public void displayProductDetails() {
		displayDetails();
		System.out.println("Quantity"+ quantity);
		System.out.println("Total Price:"+ calculateTotalPrice(quantity));
	}

}
