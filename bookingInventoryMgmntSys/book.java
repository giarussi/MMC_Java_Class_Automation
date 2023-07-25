package bookingInventoryMgmntSys;



/**
 * class book *
 */
public class book {

	
	private String dtPublication;
	private String isbn;
	private String title;
	private String author;
	

	
	public book() {

	}

	
	public book(String title, String author, String dtPublication, String isbn) {
		this.title = title;
		this.author = author;
		this.dtPublication = dtPublication;
		this.isbn = isbn;

	}

	
	public void displayBookDetails() {
		System.out.println("Book Details:");
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Date of Publication: " + dtPublication);
		System.out.println("ISBN: " + isbn);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) { 
		this.title = title;
	}

	public String getDtPublication() {
		return dtPublication;
	}

	public void setDtPublication(String dtPublication) {
		this.dtPublication = dtPublication;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
