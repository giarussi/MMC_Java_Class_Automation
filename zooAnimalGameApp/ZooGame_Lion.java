package homework;

public class ZooGame_Lion extends ZooGame_Animal {

	@Override
	public int feed() {
		System.out.println("Lion is being fed");
		return 4;
	}
	
	@Override
	public int makeSound() {
		System.out.println( "Lion makes a sound");
		return 5;
	}
	
	public int hunt() {
		System.out.println("Lion Hunts");
		return 6;
	}
}
