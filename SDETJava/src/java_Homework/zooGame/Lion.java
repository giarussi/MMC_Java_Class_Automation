package java_Homework.zooGame;

/**
 * Lion child class. Has methods that return points for various Lion
 * 
 * @author U1248069
 *
 */
public class Lion extends Animal {
	// Class variable
	protected int playPoint;

	// Constructor to initialise various class and inherited variables
	public Lion() {
		petPoint = 2;
		feedPoint = 5;
		observePoint = 1;
		playPoint = -1;
	}

	// Action methods ahead that return points
	@Override
	public int pet() {

		System.out.println("The Lion is yawning. You get " + petPoint + " points.");
		return petPoint;
	}

	@Override
	public int feed() {

		System.out.println("The Lion is eating steak. You get " + feedPoint + " points.");
		return feedPoint;
	}

	@Override
	public int observe() {
		System.out.println("The Lion is roaring. You get " + observePoint + " points.");
		return observePoint;
	}

	public int play() {
		System.out.println("The Lion is attacking you. You get " + playPoint + " points.");
		return playPoint;
	}

}
