package onlineShoppingApp;

public class Book extends Product implements Purchasable {
    private String author; // Author of the book

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Book: " + getName()); // Display the name of the book
        System.out.println("Author: " + author); // Display the author of the book
        System.out.println("Price: $" + getPrice()); // Display the price of the book
    }

    @Override
    public double calculateTotalPrice(int quantity) {
        return getPrice() * quantity; // Calculate the total price of the books based on the quantity
    }
}
