package zooGame;


public class Elephant extends Animal {
	// Class variable
	protected int playPoint;

	// Constructor to initialise various class and inherited variables
	public Elephant() {
		petPoint = 4;
		feedPoint = 5;
		observePoint = 2;
		playPoint = 2;
	}

	// Action methods ahead that return points
	@Override
	public int pet() {

		System.out.println("The Elephant is happy. You get " + petPoint + " points.");
		return petPoint;
	}

	@Override
	public int feed() {

		System.out.println("The Elephant is eating bananas. You get " + feedPoint + " points.");
		return feedPoint;
	}

	@Override
	public int observe() {
		System.out.println("The Elephant is trumpeting. You get " + observePoint + " points.");
		return observePoint;
	}

	public int play() {
		System.out.println("The Elephant is picking you up. You get " + playPoint + " points.");
		return playPoint;
	}

}