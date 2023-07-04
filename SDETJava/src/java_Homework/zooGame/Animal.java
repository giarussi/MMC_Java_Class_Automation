package java_Homework.zooGame;

/**
 * Parent class Animal. 3 Public methods
 * 
 * @author U1248069
 *
 */
public class Animal {
	// Class variables for points
	protected int petPoint=0;
	protected int feedPoint=0;
	protected int observePoint=0;

	public int pet() {

		System.out.println("The animal is happy");
		return petPoint;
	}

	public int feed() {
		System.out.println("The animal is eating food");
		return feedPoint;
	}

	public int observe() {
		System.out.println("The animal is dancing");
		return observePoint;
	}
}
