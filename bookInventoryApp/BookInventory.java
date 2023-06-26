package bookInventoryApp;

class BookInventory {
    private Book[] books;       // Array to store the books in the inventory
    private int numBooks;       // Number of books currently in the inventory

    // Constructor to initialize the BookInventory object with the given capacity
    public BookInventory(int capacity) {
        books = new Book[capacity];   // Create a new array to hold books with the specified capacity
        numBooks = 0;                 // Initially, there are no books in the inventory
    }

    // Method to add a book to the inventory
    public void addBook(Book book) {
        if (numBooks < books.length) {    // Check if there is space in the inventory
            books[numBooks] = book;      // Add the book to the next available position in the array
            numBooks++;                  // Increment the count of books in the inventory
            System.out.println("Book added successfully.");
        } else {
            System.out.println("The inventory is full. Cannot add more books.");
        }
    }

    // Method to search for books by title and return an array of matching books
    public Book[] searchByTitle(String title) {
        Book[] foundBooks = new Book[numBooks];   // Create a new array to store the found books
        int foundCount = 0;                       // Counter for the number of found books

        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {   // Check if the book title matches the search title
                foundBooks[foundCount] = books[i];                // Add the matching book to the foundBooks array
                foundCount++;                                    // Increment the counter
            }
        }
        return foundBooks;   // Return the array of found books
    }

    // Method to get all books in the inventory
    public Book[] getAllBooks() {
        Book[] allBooks = new Book[numBooks];   // Create a new array to store all books in the inventory

        for (int i = 0; i < numBooks; i++) {
            allBooks[i] = books[i];   // Copy each book reference from the inventory array to the allBooks array
        }
        return allBooks;   // Return the array of all books
    }

    // Method to get the number of books in the inventory
    public int getNumBooks() {
        return numBooks;   // Return the count of books in the inventory
    }
}
