package HomeworkDay11;

public class shoppingApp {

	public static void main(String[] args) {
		Product1 product1 = new Product1("Shoes", 1000, "White");
		Product2 product2 = new Product2("Book", 8000, 0.5);
		Product3 product3 = new Product3("Mobile", 80000,"iOS");

		int quantity = 3;

		// Calculate and display the total price and details of product1
		double totalPrice1 = product1.calculateTotalPrice(quantity);
		System.out.println("Total price of product1 (quantity = " + quantity + "): $" + totalPrice1);
		product1.displayProductDetails();

		System.out.println();

		// Calculate and display the total price and details of product2
		double totalPrice2 = product2.calculateTotalPrice(quantity);
		System.out.println("Total price of product2 (quantity = " + quantity + "): $" + totalPrice2);
		product2.displayProductDetails();
		
		System.out.println();

		// Calculate and display the total price and details of product3
		double totalPrice3 = product3.calculateTotalPrice(quantity);
		System.out.println("Total price of product3 (quantity = " + quantity + "): $" + totalPrice3);
		product3.displayProductDetails();
	}

}
