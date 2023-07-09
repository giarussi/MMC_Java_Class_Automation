package OnlineShopping;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
    public void displayCart() {
        System.out.println("Shopping Cart Contents:");
        for (Product product : products) {
        	System.out.println("=============================");
            product.displayProductDetails();
            System.out.println("=============================");
            System.out.println(); // Print a blank line for better readability
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (Product product : products) {
            totalCost += ((Purchasable) product).calculateTotalPrice(product.getQuantity());
            
            
        }
        return totalCost-calculateDiscount(totalCost);
    }
    
    public double calculateDiscount(double totalCost) {
    	double discount=0.0;
    	// Apply discounts based on total cost thresholds
        if (totalCost > 40000 ) {
            discount = totalCost * 0.2; // Apply 20% discount
            System.out.println("Congratulations! you got a 20% discount amounting to: "+discount);
        } else if (totalCost > 10000) {
        	discount = totalCost * 0.1; // Apply 10% discount
        	System.out.println("Congratulations! you got a 10% discount amounting to: "+discount);
        }
    	return discount;
    }
}
