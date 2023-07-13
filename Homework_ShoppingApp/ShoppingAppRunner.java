package Homework_ShoppingApp;

import java.util.Scanner;

public class ShoppingAppRunner {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the Product Number which you want to Buy");
		System.out.println("1.Topwears    2.Bottomwears     3.Footwears");
		
		int choice=scanner.nextInt();
		if (choice==1) {
			System.out.println("Enter the name of Topwear");
			String top = scanner.next();
			System.out.println("Enter Quantity");
			int quant1 = scanner.nextInt();
			
			Product topwear= new Tops(top,5000,quant1);
			topwear.calculatePrice();
			topwear.displayProductDetails();
			}
		else if (choice==2)
		{
			System.out.println("Enter the name of Bottomwear");
			String bottom = scanner.next();
			System.out.println("Enter Quantity");
			int quant2 = scanner.nextInt();
			
			Product bottomwear =new Bottomwear(bottom,6500,quant2);
			bottomwear.calculatePrice();
			bottomwear.displayProductDetails();
			
		}
		
		else if(choice==3) {
			System.out.println("Enter the name of Footwear");
			String foot = scanner.next();
			System.out.println("Enter Quantity");
			int quant3 = scanner.nextInt();
			
			Product footwear= new Footwear(foot,3500,quant3);
			footwear.calculatePrice();
			footwear.displayProductDetails();
		}
		
		else {
			System.out.println("Sorry, Wrong selection");
		}
	}

}
