package onlineShoppingApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> shoppingCart = new ArrayList<>(); // Create an empty shopping cart

        System.out.println("Select a product type:");
        System.out.println("1. Book");
        System.out.println("2. Electronics");
        System.out.println("3. Clothing");

        int choice = scanner.nextInt(); // Get the user's choice of product type
        scanner.nextLine(); // Consume the remaining newline character

        // Continue adding products until an invalid choice is made
        while (choice >= 1 && choice <= 3) {
            String productName;

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    productName = scanner.nextLine();
                    double bookPrice = 10.99;
                    Book book = new Book(productName, bookPrice, "Author"); // Create a new book product
                    shoppingCart.add(book); // Add the book to the shopping cart
                    break;

                case 2:
                    System.out.print("Enter electronics name: ");
                    productName = scanner.nextLine();
                    double electronicsPrice = 499.99;
                    Electronics electronics = new Electronics(productName, electronicsPrice, "Brand"); // Create a new electronics product
                    shoppingCart.add(electronics); // Add the electronics to the shopping cart
                    break;

                case 3:
                    System.out.print("Enter clothing name: ");
                    productName = scanner.nextLine();
                    double clothingPrice = 29.99;
                    Clothing clothing = new Clothing(productName, clothingPrice, "Size"); // Create a new clothing product
                    shoppingCart.add(clothing); // Add the clothing to the shopping cart
                    break;

                default:
                    System.out.println("Invalid choice!");
                    scanner.close();
                    return;
            }

            System.out.println("Product added to the shopping cart!");

            System.out.println("Select another product type or enter any other number to finish:");
            System.out.println("1. Book");
            System.out.println("2. Electronics");
            System.out.println("3. Clothing");
            choice = scanner.nextInt(); // Get the user's next choice of product type
            scanner.nextLine(); // Consume the remaining newline character
        }

        // Display the contents of the shopping cart and calculate the total price
        if (shoppingCart.isEmpty()) {
            System.out.println("No products added to the shopping cart.");
        } else {
            System.out.println("Shopping Cart:");
            double totalPrice = 0.0;
            for (Product product : shoppingCart) {
                product.displayProductDetails(); // Display the details of each product in the shopping cart
                totalPrice += product.getPrice(); // Accumulate the total price of all products
                System.out.println("-----------------------");
            }
            System.out.println("Total Price: $" + totalPrice); // Display the total price of all products in the shopping cart
        }

        scanner.close(); // Close the scanner
    }
}
