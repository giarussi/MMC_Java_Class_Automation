package OnlineShopping;

public class MobilePhone extends Product implements Purchase {
	//Class variable
	private double memory;
	//constructor to initialise variables
	public MobilePhone(String mobileName, double price, double memory) {

		this.productType = "Mobile";
		this.productName = mobileName;
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

		System.out.println("Mobile Phone Details:");
		System.out.println("Name: " + productName);
		System.out.println("Memory(GB): " + memory);

	}

	/*
	 * @Override public boolean employeeDiscount() { // TODO Auto-generated method
	 * stub return false; }
	 */

	@Override
	double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}