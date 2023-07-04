package java_Homework.zooGame;
/**
 * Dog child class. Has methods that return points for various Dog actions
 * @author U1248069
 *
 */
public class Dog extends Animal {
	// Class variable
	protected int playPoint;
	// Constructor to initialise various class and inherited variables
	public Dog() {
		petPoint = 4;
		feedPoint = 5;
		observePoint = 1;
		playPoint = 3;
	}
	// Action methods ahead that return points
	@Override
	public int pet() {

		System.out.println("The Dog is wagging its tail. You get " + petPoint + " points.");
		return petPoint;
	}

	@Override
	public int feed() {

		System.out.println("The Dog is eating bone. You get " + feedPoint + " points.");
		return feedPoint;
	}

	@Override
	public int observe() {
		System.out.println("The Dog is barking. You get " + observePoint + " points.");
		return observePoint;
	}

	public int play() {
		System.out.println("The Dog is licking you. You get " + playPoint + " points.");
		return playPoint;
	}

}
