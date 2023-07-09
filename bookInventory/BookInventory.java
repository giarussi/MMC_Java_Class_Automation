package bookInventory;

import java.util.ArrayList;

public class BookInventory {
    private ArrayList<Book> books;
    
    public BookInventory() {
        books = new ArrayList<>();
    }

    //Method to add book in our inventory
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }
    
    /**
     * method to search for book in our inventory and returns result if book present in inventory
     * @param title
     */
    public void searchBookByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                displayBookDetails(book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found in the inventory.");
        }
    }
    
    //Method to check if book is present in inventory if yes call method displayBookDetails
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the inventory.");
        } else {
            for (Book book : books) {
                displayBookDetails(book);
            }
        }
    }
    
    //method to display all Book Details
    private void displayBookDetails(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year of Publication: " + book.getYearOfPublication());
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("-------------------------------");
    }
}
