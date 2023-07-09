package bookInventory;


public class Book {
    private String title;
    private String author;
    private int yearOfPublication;
    private String ISBN;

    public Book(String title, String author, int yearOfPublication, String ISBN) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.ISBN = ISBN;
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
        return ISBN;
    }
}