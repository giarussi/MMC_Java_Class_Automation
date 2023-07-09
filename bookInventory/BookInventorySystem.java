package bookInventory;

import java.util.Scanner;

public class BookInventorySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookInventory bookInventory = new BookInventory();

        while (true) {
            // Display menu options
            System.out.println("1. Add a book");
            System.out.println("2. Search for a book by title");
            System.out.println("3. Display all books");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            // Read user's choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            

            switch (choice) {
                case 1:
                    // Add a book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter year of publication: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();

                    Book book = new Book(title, author, year, isbn);
                    bookInventory.addBook(book);
                    break;
                case 2:
                    // Search for a book by title
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    bookInventory.searchBookByTitle(searchTitle);
                    break;
                case 3:
                    // Display all books
                    bookInventory.displayAllBooks();
                    break;
                case 4:
                    // Quit the program
                    System.out.println("Exiting...");
                    scanner.close(); // Close the Scanner object
                    System.exit(0);// terminate code without going into loop
                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }
            
        }
        
    }
   
}
        
        