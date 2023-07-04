package java_Homework.zooGame;

/**
 * Cow child class. Has methods that return points for various Cow actions
 * 
 * @author U1248069
 *
 */
public class Cow extends Animal {
	// Class variable
	protected int playPoint;

	// Constructor to initialise various class and inherited variables
	public Cow() {
		petPoint = 4;
		feedPoint = 5;
		observePoint = 2;
		playPoint = 2;
	}

	// Action methods ahead that return points
	@Override
	public int pet() {

		System.out.println("The Cow is sleeping. You get " + petPoint + " points.");
		return petPoint;
	}

	@Override
	public int feed() {

		System.out.println("The Cow is eating grass. You get " + feedPoint + " points.");
		return feedPoint;
	}

	@Override
	public int observe() {
		System.out.println("The Cow is mooing. You get " + observePoint + " points.");
		return observePoint;
	}

	public int play() {
		System.out.println("The Cow is sitting on you. You get " + playPoint + " points.");
		return playPoint;
	}

}
