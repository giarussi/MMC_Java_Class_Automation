package Homework_BookInventory;

public class Book {

    private String title;                // Title of the book
    private String author;               // Author of the book
    private int yearOfPublication;       // Year of publication of the book
    private String ISBN;                 // ISBN (International Standard Book Number) of the book

    // Constructor to initialize the Book object with the provided values
    public Book(String title, String author, int yearOfPublication, String ISBN) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.ISBN = ISBN;
    }

    // Getter method to retrieve the title of the book
    public String getTitle() {
        return title;
    }

    // Getter method to retrieve the author of the book
    public String getAuthor() {
        return author;
    }

    // Getter method to retrieve the year of publication of the book
    public int getYearOfPublication() {
        return yearOfPublication;
    }

    // Getter method to retrieve the ISBN of the book
    public String getISBN() {
        return ISBN;
    }

}
