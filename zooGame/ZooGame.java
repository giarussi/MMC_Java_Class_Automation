package zooGame;

import java.util.Scanner;


public class ZooGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Initialising class variables
		int points = 0;
		int animal;
		int action;
		int numberOfActions = 10;
		Lion lion;
		Elephant elephant;
		Dog dog;
		Cat cat;
		Cow cow;

		System.out.println("==========The Zoo Game ===========");
		// Looping through number of chances
		do {
			System.out.println("Enter the choice of animal");
			System.out.println("1. Lion\n2. Dog\n3. Cat\n4. Elephant\n5. Cow");
			animal = scan.nextInt();
			// Switch on choice of animal and nested switch on choice of action
			switch (animal) {

			case 1:
				lion = new Lion();
				System.out.println("Enter the choice of action");
				System.out.println("1. Pet\n2. Feed\n3. Observe\n4. Play");
				action = scan.nextInt();
				switch (action) {

				case 1:
					points = points + lion.pet();
					break;
				case 2:
					points = points + lion.feed();
					break;
				case 3:
					points = points + lion.observe();
					break;
				case 4:
					points = points + lion.play();
					break;
				default:
					System.out.println("Invalid choice. Chance wasted.");
				}
				break;
			case 2:
				dog = new Dog();
				System.out.println("Enter the choice of action");
				System.out.println("1. Pet\n2. Feed\n3. Observe\n4. Play");
				action = scan.nextInt();
				switch (action) {

				case 1:
					points = points + dog.pet();
					break;
				case 2:
					points = points + dog.feed();
					break;
				case 3:
					points = points + dog.observe();
					break;
				case 4:
					points = points + dog.play();
					break;
				default:
					System.out.println("Invalid choice. Chance wasted.");
				}
				break;
			case 3:
				cat = new Cat();
				System.out.println("Enter the choice of action");
				System.out.println("1. Pet\n2. Feed\n3. Observe\n4. Play");
				action = scan.nextInt();
				switch (action) {

				case 1:
					points = points + cat.pet();
					break;
				case 2:
					points = points + cat.feed();
					break;
				case 3:
					points = points + cat.observe();
					break;
				case 4:
					points = points + cat.play();
					break;
				default:
					System.out.println("Invalid choice. Chance wasted.");
				}
				break;

			case 4:
				elephant = new Elephant();
				System.out.println("Enter the choice of action");
				System.out.println("1. Pet\n2. Feed\n3. Observe\n4. Play");
				action = scan.nextInt();
				switch (action) {

				case 1:
					points = points + elephant.pet();
					break;
				case 2:
					points = points + elephant.feed();
					break;
				case 3:
					points = points + elephant.observe();
					break;
				case 4:
					points = points + elephant.play();
					break;
				default:
					System.out.println("Invalid choice. Chance wasted.");
				}
				break;

			case 5:
				cow = new Cow();
				System.out.println("Enter the choice of action");
				System.out.println("1. Pet\n2. Feed\n3. Observe\n4. Play");
				action = scan.nextInt();
				switch (action) {

				case 1:
					points = points + cow.pet();
					break;
				case 2:
					points = points + cow.feed();
					break;
				case 3:
					points = points + cow.observe();
					break;
				case 4:
					points = points + cow.play();
					break;
				default:
					System.out.println("Invalid choice. Chance wasted.");
				}
				break;

			default:
				System.out.println("Invalid choice. CHance wated");

			}
			numberOfActions--;

		} while (numberOfActions > 0);

		System.out.println("\nGame completed. You have collected " + points + " points.");
		scan.close();

	}

}