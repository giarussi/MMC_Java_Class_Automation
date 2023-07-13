package onlineShoppingApp;

public interface Purchasable {
    /**
     * Calculates the total price of the product based on the given quantity.
     *
     * @param quantity the quantity of the product to be purchased
     * @return the total price of the product
     */
    double calculateTotalPrice(int quantity);

    /**
     * Displays the details of the product.
     * Each implementing class must provide its own implementation of this method.
     */
    void displayProductDetails();
}
