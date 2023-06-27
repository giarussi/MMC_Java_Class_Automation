package BookSystem;

import java.util.Scanner;

public class BookSystem {

	static double baserate = 72.50, agvcost = 1.5, sal, tax = 0.12, Emp_name;
	static int scr;
	static String flag = null, key;
	static Scanner scaner = new Scanner(System.in);
	static String title, author, year, ISBN;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			System.out.println(
					" Enter your choice for the book system \n 1.Add Book \n 2.Search Book \n 3.Display book ");
			int choice = scaner.nextInt();
			Book bk1 = new Book();
			switch (choice) {
			case 1:
				System.out.println("You chose to add Book ");
				System.out.println("Enter Book Title \n ");
				title = scaner.next();
				System.out.println("Enter Book author \n");
				author = scaner.next();
				System.out.println("Enter  year \n");
				year = scaner.next();
				System.out.println("Enter  ISBN \n");
				ISBN = scaner.next();
				bk1.addbook(title, author, year, ISBN);
				break;
			case 2:
				System.out.println("Search Book");
				bk1.searchArrayBinarySearch();
				break;
			case 3:
				System.out.println("Display book");
				bk1.Display_array();
				break;
			default:
				System.out.println("Looking for incorrect option");
			}
			System.out.println("Do you want to continue ? (Y/N)");
			flag = scaner.next();
		} while (flag.equalsIgnoreCase("Y"));
	}
}
