package OnlineShopping;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        int choice = 0;
        while (choice != 4) {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Add a product to the cart
                	System.out.print("Enter product category(clothes/electronics): ");
                    String category = scanner.nextLine();
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter product brand: ");
                    String brand = scanner.next();
                    if (category.equalsIgnoreCase("clothes")) {
                    	System.out.print("Enter product size: ");
                        String size = scanner.next();
                        
                    	Product product = new Clothes(name,price, size,brand, quantity);
                        cart.addProduct(product);
                        System.out.println("Product added to the cart.");
                        break;
                    	
                    }
                    else if(category.equalsIgnoreCase("electronics")){
                    	System.out.print("Enter product model: ");
                        String model = scanner.next();
                    	Product product = new Electronics(name,  price,  brand,  model,  quantity);
                        cart.addProduct(product);
                        System.out.println("Product added to the cart.");
                        break;
                    }
                    
                    
                case 2:
                    // Display cart contents
                	cart.displayCart();
                    break;
                    
                    
                case 3:
                    // Calculate total cost
                    double totalCost = cart.calculateTotalCost();
                    System.out.println("Total cost: $" + totalCost);
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Thank you for using the shopping app. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println(); // Print a blank line for better readability
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("----- Shopping App Menu -----");
        System.out.println("1. Add a product to the cart");
        System.out.println("2. Display cart contents");
        System.out.println("3. Calculate total cost");
        System.out.println("4. Exit");
        System.out.println("-----------------------------");
    }
}

