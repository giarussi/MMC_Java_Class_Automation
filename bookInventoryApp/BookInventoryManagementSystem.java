package bookInventoryApp;

import java.util.Scanner;

public class BookInventoryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookInventory inventory = new BookInventory(10);   // Create a new BookInventory object with capacity 10

        while (true) {
            System.out.println("\n--- Book Inventory Management System ---");
            System.out.println("1. Add a book");
            System.out.println("2. Search for a book by title");
            System.out.println("3. Display all books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();              // Read the user's choice
            scanner.nextLine();                          // Consume the remaining newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();   // Read the book title from the user
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();  // Read the book author from the user
                    System.out.print("Enter year of publication: ");
                    int year = scanner.nextInt();        // Read the year of publication from the user
                    scanner.nextLine();                   // Consume the remaining newline character
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();     // Read the ISBN from the user

                    Book book = new Book(title, author, year, isbn);   // Create a new Book object
                    inventory.addBook(book);                          // Add the book to the inventory
                    break;
                case 2:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();    // Read the search title from the user
                    Book[] foundBooks = inventory.searchByTitle(searchTitle);   // Search for books by title
                    boolean bookFound = false;   // Flag to check if any book is found
                    for (Book foundBook : foundBooks) {
                        if (foundBook != null) {
                            System.out.println("Title: " + foundBook.getTitle());
                            System.out.println("Author: " + foundBook.getAuthor());
                            System.out.println("Year of Publication: " + foundBook.getYearOfPublication());
                            System.out.println("ISBN: " + foundBook.getISBN());
                            bookFound = true;   // Set the flag to true if a book is found
                        }
                    }
                    if (!bookFound) {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    Book[] allBooks = inventory.getAllBooks();   // Get all books from the inventory
                    if (inventory.getNumBooks() == 0) {
                        System.out.println("No books in the inventory.");
                    } else {
                        for (Book b : allBooks) {
                            if (b != null) {
                                System.out.println("Title: " + b.getTitle());
                                System.out.println("Author: " + b.getAuthor());
                                System.out.println("Year of Publication: " + b.getYearOfPublication());
                                System.out.println("ISBN: " + b.getISBN());
                                System.out.println("----------------------------");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();    // Close the scanner
                    System.exit(0);     // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
