package homework;

public class ShoppingExperience_Mobile extends ShoppingExperience_Product implements ShoppingExperience_Purchasable {
 private String brand;
	
	public ShoppingExperience_Mobile(String name, double price) {
		super(name, price);
		this.brand =brand;
	}

	@Override
	public double calculateTotalPrice(int quantity) {
		// TODO Auto-generated method stub
		return price * quantity;
	}

	@Override
	public void displayProductDetails() {
		displayDetails();
		//System.out.println("Quantity: "+ quantity);
		//System.out.println("Total Price: "+ calculateTotalPrice(quantity) );
		
	}

	@Override
	public void displayDetails() {
		System.out.println("Mobile: "+ name);
		System.out.println("Brand: "+ brand);
		System.out.println("Price: "+price);
		
	}

}
