package OnlineShopping;

public class Laptop extends Product implements Purchase {
	//Class variable
	private double memory;
	//constructor to initialise variables
	public Laptop(String laptopName, double price, double memory) {

		this.productType = "Laptop";
		this.productName = laptopName;
		this.price = price;
		this.memory = memory;

	}

	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void displayProductDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("Laptop Details:");
		System.out.println("Name: " + productName);
		System.out.println("Memory(GB): " + memory);

	}

	@Override
	double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}