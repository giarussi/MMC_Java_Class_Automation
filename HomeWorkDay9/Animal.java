package HomeWorkDay9;

import java.util.Scanner;

abstract class Animal {
	protected String name;
	protected String species;
	protected int points;

	public Animal(String name, String species) {
		this.name = name;
		this.species = species;
		this.points = 0;
	}

	// Interaction with Animals
	public void feed() {
		System.out.println(name + " is being fed");
		points += 1;
	}

	public void observe() {
		System.out.println(name + " is being observed");
		points += 2;
	}

	public void pet() {
		System.out.println(name + " is being petted");
		points += 3;
	}

	// Allowing user to choose from different interactions
	public void interact() {
		System.out.println("Choose an action: ");
		System.out.println("1. Feed");
		System.out.println("2. Observe");
		System.out.println("3. Pet");
		System.out.println("4. Sound");

		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		// Taking interaction choice from the user
		switch (choice) {
		case 1:
			feed();
			break;
		case 2:
			observe();
			break;
		case 3:
			pet();
			break;
		case 4:
			makeSound();
			break;
		default:
			System.out.println("You have entered an invalid choice!");
		}
	}

	public abstract void makeSound();

	public int getPoints() {
		return points;
	}
}

class Lion extends Animal {
	public Lion(String name) {
		super(name, "Lion");
	}

	@Override
	public void makeSound() {
		points += 2;
		System.out.println(name + " roars");
	}
}

class Dog extends Animal {
	public Dog(String name) {
		super(name, "Dog");
	}

	@Override
	public void makeSound() {
		points += 3;
		System.out.println(name + " barks");
	}
}

class Cat extends Animal {
	public Cat(String name) {
		super(name, "Cat");
	}

	@Override
	public void makeSound() {
		points += 4;
		System.out.println(name + " meow");
	}
}

class Elephant extends Animal {
	public Elephant(String name) {
		super(name, "Elephant");
	}

	@Override
	public void makeSound() {
		points += 3;
		System.out.println(name + " honks");
	}
}

class Monkey extends Animal {
	public Monkey(String name) {
		super(name, "Monkey");
	}

	@Override
	public void makeSound() {
		points += 2;
		System.out.println(name + " screeches");
	}
}