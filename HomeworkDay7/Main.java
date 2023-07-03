package HomeworkDay7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager(20);

        // Adding books to the inventory
 
        inventoryManager.addBook("Pride and Prejudice", "Jane Austen", 1813, "1234567890");
        inventoryManager.addBook("To Kill a Mockingbird", "Harper Lee", 1960, "9876543210");
        inventoryManager.addBook("The Kite Runner", "Khaled Hosseini", 2003, "0234567898");

        //Displaying all books
        inventoryManager.displayAllBooks();
        
        // Searching for a book by title
        System.out.println("Enter the book name you want to search: ");
        Scanner sc=new Scanner(System.in);
        String searchTitle=sc.nextLine();
        sc.close();
        Book foundBook = inventoryManager.searchBookByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found: " + searchTitle);
        }
}}