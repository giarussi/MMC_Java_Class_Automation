package Homework_ShoppingApp;

public class Bottomwear extends Product implements Purchasable {

	public Bottomwear(String prodName,double prodPrice,int prodQuantity) {
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
		System.out.println("The Bottom wear  Name is: "+ prodName);
		System.out.println("The one bottom wear price is:" + prodPrice);
		System.out.println("The total product price is:" + sum);

	}

}
