package OnlineShopping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;


public class ShoppingSite {
	// Class variables
	static Scanner scan = new Scanner(System.in);
	static HashMap<Product, Integer> cart;
	static List<Product> inventory;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialising the variables
		inventory = new ArrayList<Product>();
		System.out.println("Welcome to the Online Shopping Site!");
		// adding products to inventory
		refreshInventory();
		int continueProg;
		int choice;
		cart = new HashMap<Product, Integer>();
		// Starting the experience
		do {

			System.out.println("\n1. View all products details\n2. Add Product to cart");
			System.out.print("Please enter your choice for the above actions: ");
			choice = scan.nextInt();
			// Switch on choice of exit
			switch (choice) {

			case 1:
				System.out.println("\nProduct List: ");
				int i = 1;
				for (Product p : inventory) {

					System.out.println("Product: " + i);
					p.displayProductDetails();
					System.out.println("===========================");
					i++;

				}
				break;
			case 2:
				addProduct();
				break;

			default:
				System.out.println("Invalid choice.");

			}

			System.out.println("\nEnter (1) to Proceed to Checkout/Exit\nEnter (2) to Continue");
			System.out.print("Choice: ");
			continueProg = scan.nextInt();

		} while (continueProg == 2);

		checkout();
		scan.close();

	}

	public static void addProduct() {

		int i = 1, prodChoice;
		String ans;
		for (Product p : inventory) {

			System.out.println("Product: " + i);
			System.out.println("Product Name: " + p.productName);
			System.out.println("================================");
			i++;

		}

		System.out.print("Enter the product that you wish to buy: ");
		prodChoice = scan.nextInt();
		// check if product is already in cart
		if (isPresentInCart(inventory.get(prodChoice - 1).productName)) {

			System.out.print(
					"Item is already present in cart. Do you still wish to go ahead and increase the quantity (y/n): ");
			ans = scan.next();
			// increase the quantity
			if (ans.equalsIgnoreCase("y")) {
				cart.put(inventory.get(prodChoice - 1), cart.get(inventory.get(prodChoice - 1)) + 1);
				System.out.println("\nProduct added !!");
			} else {
				System.out.println("\nProduct not added");
			}
		} else {
			// product added for first time
			cart.put(inventory.get(prodChoice - 1), 1);
			System.out.println("\nProduct added !!");
		}

	}

	
	public static void checkout() {
		double totalPrice = 0, discount = 0;
		String isEmp;
		if (cart.isEmpty()) {
			System.out.println("No Products bought. Thanks for visiting.");
		} else {

			System.out.print("\nAre you an employee (y/n):");
			isEmp = scan.next();

			if (isEmp.equalsIgnoreCase("Y")) {

				System.out.println("You get an additional disocunt of 10% !");

			}
			System.out.println();
			System.out.printf("---------------------------------------------------%n");
			System.out.printf("|%-49s|%n", " Itemised Bill");
			System.out.printf("---------------------------------------------------%n");
			System.out.printf("| %-15s | %-7s | %-9s | %-7s |%n", "Product", "Rate", "Quantity", "Total");
			System.out.printf("---------------------------------------------------%n");

			for (Product p : cart.keySet()) {

				System.out.printf("| %-15s | %-7s | %9s | %-7s |%n", p.productName, String.format("%.2f", p.price),
						cart.get(p), String.format("%.2f", p.price * cart.get(p)));

				totalPrice = totalPrice + (p.price * cart.get(p));

			}
			System.out.printf("---------------------------------------------------%n");
			;
			if (isEmp.equalsIgnoreCase("Y")) {

				discount = ((totalPrice * 10) / 100);
				System.out.printf("|%-49s|%n", "Total Bill Before Discount: $" + String.format("%.2f", totalPrice));
				totalPrice = totalPrice - discount;
				System.out.printf("|%-49s|%n", "Employee Discount: $" + String.format("%.2f", discount));

			}
			System.out.printf("|%-49s|%n", "Final Bill: $" + String.format("%.2f", totalPrice));
			System.out.printf("---------------------------------------------------%n");
			System.out.println("Please proceed to cash payment. Thank you for shopping with us.");
		}

	}

	
	public static void refreshInventory() {

		inventory.add(new MobilePhone("OnePlus 11", 1000.23, 120));
		inventory.add(new MobilePhone("OnePlus 12", 1010.23, 110));
		inventory.add(new MobilePhone("iPhone 14", 999.00, 110));
		inventory.add(new Laptop("Dell Inspiron", 1100.11, 1024));
	}


	public static boolean isPresentInCart(String productName) {

		for (Product p : cart.keySet()) {

			if (p.productName.equals(productName)) {

				return true;
			}

		}
		return false;

	}

}