package java_Homework.zooGame;

/**
 * Cat child class. Has methods that return points for various cat actions
 * 
 * @author U1248069
 *
 */
public class Cat extends Animal {
	// Class variable
	protected int playPoint;

	// Constructor to initialise various class and inherited variables
	public Cat() {
		petPoint = 3;
		feedPoint = 5;
		observePoint = 2;
		playPoint = -1;
	}

	// Action methods ahead that return points
	@Override
	public int pet() {

		System.out.println("The Cat is yawning. You get " + petPoint + " points.");
		return petPoint;
	}

	@Override
	public int feed() {

		System.out.println("The Cat is eating fish. You get " + feedPoint + " points.");
		return feedPoint;
	}

	@Override
	public int observe() {
		System.out.println("The Cat is purring. You get " + observePoint + " points.");
		return observePoint;
	}

	public int play() {
		System.out.println("The Cat is slapping you. You get " + playPoint + " points.");
		return playPoint;
	}

}
