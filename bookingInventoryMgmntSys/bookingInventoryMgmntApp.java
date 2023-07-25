package bookingInventoryMgmntSys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class bookingInventoryMgmntApp {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int option = 0;
		String continueProg = null;
		book books[] = new book[3];

		books[0] = new book("White Tiger", "ABC Author", "14/05/2012", "978-9381576052");
		books[1] = new book("God of Small things", "Arundhati roy", "28/08/2015", "978-03434343434");
		books[2] = new book("Midnight's Children", "Modern author", "18/03/2009", "‎882-0552161275");

		System.out.println("Welcome to the Book Management System");

		do {

			System.out.println("Please enter the action number from the below list");
			System.out.println("1. Search for a book");
			System.out.println("2. Add a book");
			System.out.println("3. View all books");

			option = Integer.parseInt(br.readLine());

			switch (option) {

			case 1:
				searchBook(books);
				break;
			case 2:
				books = addBook(books);
				break;
			case 3:
				displayAllBooks(books);
				break;

			default:
				System.out.println("Invalid choice");
			}

			System.out.println("Continue ? (Y/N)");
			continueProg = br.readLine();
		} while (continueProg.equalsIgnoreCase("Y"));
	}

	public static void searchBook(book searchbook[]) throws IOException {

		System.out.println("Enter the title of the book to be searched");
		String title = br.readLine();
		boolean isFound = false;
		for (book book : searchbook) {

			if (book.getTitle().equalsIgnoreCase(title)) {
				isFound = true;
				book.displayBookDetails();
				break;
			}

		}

		if (!isFound) {
			System.out.println("Book not present. Please check the title of the book again.");
		}

	}

	
	public static book[] addBook(book addBook[]) throws IOException {

		book newBookList[] = new book[addBook.length + 1];

		for (int i = 0; i < newBookList.length - 1; i++) {
			newBookList[i] = addBook[i];
		}

		newBookList[addBook.length] = new book();
		System.out.println("Enter the title of the book to be added");
		newBookList[addBook.length].setTitle(br.readLine());

		System.out.println("Enter the author of the book to be added");
		newBookList[addBook.length].setAuthor(br.readLine());

		System.out.println("Enter the date of publication of the book to be added(dd/mm/yyyy)");
		newBookList[addBook.length].setDtPublication(br.readLine());

		System.out.println("Enter the ISBN of the book to be added");
		newBookList[addBook.length].setIsbn(br.readLine());

		// books = newBookList;
		System.out.println("Book added successfully !");

		return newBookList;

	}

	public static void displayAllBooks(book displayBook[]) {
		System.out.println("=========================="); 
		for (book book : displayBook) {

			System.out.println("Title: " + book.getTitle());
			System.out.println("Author: " + book.getAuthor());
			System.out.println("==========================");
		}

	}

}
