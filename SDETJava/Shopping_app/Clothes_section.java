package Shopping_app;

import java.util.Scanner;

public class Clothes_section implements purchsable {

	String items;

	int cnt = 3;
	Scanner scanner = new Scanner(System.in);

	
	//Seelct clothes and color and display details for same 
	public int displaydetails(int chance) {
		System.out.println("You are in Clothes_section, chose the  clothes you would like to buy ");
		// int chance;
		 
		{
			// TODO Auto-generated method stub
			for (int i = 0; i < chance; i++) {
				System.out.println("Enter product name to buy :=");
				items = scanner.next();
				
				System.out.println("You have  to chose color 1.Red \n 2.Yellow \n 3.Pink 4.Black");
				String items_col = scanner.next();
				
				System.out.println("You chose to buy   " + items + " with  color " + items_col);

			}
			return chance;
		}
	}

	//Calculate price 
	@Override
	public double calculateprice(int itm) {
		// TODO Auto-generated method stub
		double price = 250.0;
		System.out.println("Welcome to the billing  :-");
		price = price * itm;
		System.out.println("***Billing for clothes is   :- " + price);
		return price;
	}

}
