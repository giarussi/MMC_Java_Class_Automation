package HomeworkDay7;

public class Book {
	private String title;
	private String author;
	private int yearOfPublication;
	private String isbn;

	public Book(String title, String author, int yearOfPublication, String isbn) {
		this.title = title;
		this.author = author;
		this.yearOfPublication = yearOfPublication;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public String getISBN() {
		return isbn;
	}

	@Override
	public String toString() {
		return "Title: " + title + ", Author: " + author + ", Year of Publication: " + yearOfPublication + ", ISBN: "
				+ isbn;
	}
}