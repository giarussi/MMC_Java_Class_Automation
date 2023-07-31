package Shopping_app;

import java.util.Scanner;

public class Shopping_cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("You are in clothes  ,chose the items you would like to buy ");
		int chance_clthes;

		Scanner scanner = new Scanner(System.in);
		Clothes_section myClothes_section = new Clothes_section(); 
		
		// Create a Clothes_section object  and pass variables to it

		chance_clthes = scanner.nextInt();
		myClothes_section.displaydetails(chance_clthes);
		double price1 = myClothes_section.calculateprice(chance_clthes);

		// Create a Clothes_section object  and pass variables to it
		System.out.println("You are in Sports , chose the items you would like to buy ");
		String chance = scanner.next();
		Sports_section mySports_section = new Sports_section();

		mySports_section.getshoppingitem(chance);
		double pc = mySports_section.displaydiscount(chance);
		double price2 = mySports_section.calculateprice(pc);
		totalprice(price1, price2);

	}

	//Final price after addition of the product
	static double totalprice(double price1, double price2) {
		double price_total = 0.0;
		System.out.println("\n\t\t You at final billing for your shopping"+ "\n\t\t\t Price for  Product1 "+price1 +"\n\t\t\t Price for Product2 "+price2);  
		price_total = price1 + price2;
		System.out.println("\n\t\t\tTotal Amount (Rs.) " +price_total);
		
		  System.out.println("\n\t\t\t\t\t----------------Thank You for Shopping!!-----------------");  
		return price_total;

	}

}