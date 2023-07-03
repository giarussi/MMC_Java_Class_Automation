package HomeWorkDay9;

import java.util.Scanner;

public class ZooGame {
	public static void main(String[] args) {
		Lion lion = new Lion("Simba");
		Dog dog = new Dog("Max");
		Cat cat = new Cat("Kitty");
		Elephant elephant = new Elephant("Bambi");
		Monkey monkey = new Monkey("Gorilla");

		Animal[] animals = { lion, dog, cat, elephant, monkey };

		int totalScore = 0;
		int interactions = 0;

		Scanner scanner = new Scanner(System.in);

		while (interactions < 10) {
			System.out.println("\nChoose an animal to interact with: ");
			System.out.println("1. Lion");
			System.out.println("2. Dog");
			System.out.println("3. Cat");
			System.out.println("4. Elephant");
			System.out.println("5. Monkey");
			System.out.println("Enter your choice: ");

			int choice = scanner.nextInt();

			if (choice < 1 || choice > 5) {
				System.out.println("Invalid choice!");
				continue;
			}
			Animal selectedAnimal = animals[choice - 1];
			selectedAnimal.interact();

			totalScore += selectedAnimal.getPoints();
			interactions++;

			System.out.println("Total Score: " + totalScore);
		}

		System.out.println("Game Over!");
		System.out.println("Final Score: " + totalScore);
	}

}