package Homework_ShoppingApp;

public class Tops extends Product implements Purchasable {

	public Tops(String prodName,double prodPrice,int prodQuantity) {
		this.prodName=prodName;
		this.prodPrice= prodPrice;
		this.prodQuantity=prodQuantity;
	}
	
	@Override
	public double calculatePrice() {
		 sum=prodPrice*prodQuantity;
			return sum;
	}

	@Override
	public void displayProductDetails() {
		System.out.println("The topwear name is: "+ prodName);
		System.out.println("The one topwear price is:" + prodPrice);
		System.out.println("The total product price is:" + sum);
	}

}
