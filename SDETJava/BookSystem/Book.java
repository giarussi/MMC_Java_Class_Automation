package BookSystem;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Book {

	String title;
	String author;
	String year;
	String ISBN;
	static String Key = null;
	static int arr_size = 4;
	static String[] book = new String[arr_size];
	static Scanner scaner = new Scanner(System.in);

	// Array to add details for book

	public static String[] addbook(String title, String author, String year, String ISBN) {

		int i;
		System.out.println(" Details of the book are added  ");
		for (int i1 = 0; i1 < arr_size; i1++) {

			book[0] = title;
			book[1] = author;
			book[2] = year;
			book[3] = ISBN;

		}

		return book;
	}

	// Search details for book
	public static boolean searchArrayBinarySearch() {

		System.out.println("Enter the book to search : ");
		Key = scaner.nextLine();
		System.out.println("Book to search : " + Key);

		boolean flag = false;

		for (int j = 0; j < arr_size; j++) {

			if (book[j].equalsIgnoreCase(Key)) {
				System.out.println("Available at index " + j);
				flag = true;
				// return flag;
			} else {
				System.out.println("Not found");
				// return flag;
			}

		}

		return flag;
	}

	// Display Array details for book
	public void Display_array() {

		System.out.println("The Details  of books  are: ");
		for (int i = 0; i < arr_size; i++) {
			// prints the elements of an array
			System.out.print(book[i] + "||");
		}

	}

}
