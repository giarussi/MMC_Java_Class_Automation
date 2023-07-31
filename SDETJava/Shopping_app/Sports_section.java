package Shopping_app;

import java.util.Scanner;

public class Sports_section extends product_abstract {

	double price = 350.0;

	
	@Override
	String getshoppingitem(String product) {
		// TODO Auto-generated method stub

		System.out.println("You are in Sports_section, You would like to buy " + product);

		return items;
	}


	//Calculate price after discount
	public double calculateprice(double discount) {
		// TODO Auto-generated method stub

		price = price - discount;
		System.out.println("You are in Sports_section, Your bill is " + price);
		return price;

	}

	//Calculate  discount
	public double displaydiscount(String Items) {
		// TODO Auto-generated method stub
		double discount = 0.0;
		System.out.println("You are in Sports discount section  ");
		if (Items.equalsIgnoreCase("Shoes")) {
			double perc = 0.2;
			discount = perc * price;
			System.out.println("You are in Sports_section, Your  discount will be  " + discount);
			return discount;
		} else {
			System.out.println("You are in Sports_section, No discount  " + discount);
			return discount;
		}

	}

}
