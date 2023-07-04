package homework;

public class ZooGame_Elephant extends ZooGame_Animal {
	
	@Override
	public int feed() {
		System.out.println("Elephant is being fed");
		return 7;
	}

	@Override
	public int makeSound() {
		System.out.println("Elephant makes a sound");
		return 8;
	}
	
	public int sprinklesWater() {
		System.out.println("Elephant sprinkles water on the guests");
		return 9;
	}
}
