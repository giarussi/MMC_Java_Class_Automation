package java_Homework.BookInventoryMgmtSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Class to manage book inventory. Available functionality - View, Search and
 * Add a book
 * 
 * @author U1248069
 *
 */
public class BookInventoryManagementApp {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int option = 0;
		String continueProg = null;
		Book books[] = new Book[3];

		books[0] = new Book("Asura", "Anand Neelakantan", "14/05/2012", "978-9381576052");
		books[1] = new Book("The Devotion of Suspect X", "Keigo Higashino", "28/08/2005", "978-0349123745");
		books[2] = new Book("The Da Vinci Code", "Dan Brown", "18/03/2003", "‎978-0552161275");

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

	public static void searchBook(Book searchbook[]) throws IOException {

		System.out.println("Enter the title of the book to be searched");
		String title = br.readLine();
		boolean isFound = false;
		for (Book book : searchbook) {

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

	/**
	 * Adds a new book to the list
	 * 
	 * @param addBook
	 * @return
	 * @throws IOException
	 */
	public static Book[] addBook(Book addBook[]) throws IOException {

		Book newBookList[] = new Book[addBook.length + 1];

		for (int i = 0; i < newBookList.length - 1; i++) {
			newBookList[i] = addBook[i];
		}

		newBookList[addBook.length] = new Book();
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

	public static void displayAllBooks(Book displayBook[]) {
		System.out.println("==========================");
		for (Book book : displayBook) {

			System.out.println("Title: " + book.getTitle());
			System.out.println("Author: " + book.getAuthor());
			System.out.println("==========================");
		}

	}

}
