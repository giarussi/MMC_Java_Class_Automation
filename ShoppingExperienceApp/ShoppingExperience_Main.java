package homework;

public class ShoppingExperience_Main {

	public static void main(String[] args) {
		// Creating Book Object
		ShoppingExperience_Book book = new ShoppingExperience_Book ("SDET", 200.50, "Gwen");
		book.displayProductDetails();
		System.out.println("--------------------------------");
		
		ShoppingExperience_Mobile mobile = new ShoppingExperience_Mobile("Samsung", 20000);
		mobile.displayProductDetails();
		

	}

}
