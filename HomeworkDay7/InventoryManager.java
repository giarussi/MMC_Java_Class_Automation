package HomeworkDay7;

public class InventoryManager {
	private Book[] books;
	private int count;

	public InventoryManager(int capacity) {
		books = new Book[capacity];
		count = 0;
	}

	public void addBook(String title, String author, int yearOfPublication, String isbn) {
		Book book = new Book(title, author, yearOfPublication, isbn);
		books[count] = book;
		count++;
	}

	public Book searchBookByTitle(String title) {
		for (int i = 0; i < count; i++) {
			if (books[i].getTitle().equalsIgnoreCase(title)) {
				return books[i];
			}
		}
		return null; // Book not found
	}

	public void displayAllBooks() {
		if (count == 0) {
			System.out.println("Inventory is empty.");
			return;
		}

		System.out.println("Inventory:");
		for (int i = 0; i < count; i++) {
			System.out.println(books[i]);
		}
	}
}
