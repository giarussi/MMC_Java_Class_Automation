package zooGameApp;

abstract class Animal {
    protected String name; // Name of the animal
    protected String species; // Species of the animal
    protected int points; // Points earned by the animal

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
        this.points = 0;
    }

    public abstract void feed(); // Abstract method for feeding the animal

    public abstract void pet(); // Abstract method for petting the animal

    public abstract void observe(); // Abstract method for observing the animal

    public int getPoints() {
        return points; // Get the points earned by the animal
    }
}

class Lion extends Animal {
    private String sound; // Sound made by the lion

    public Lion(String name) {
        super(name, "Lion"); // Call the superclass constructor and set the species to "Lion"
        sound = "Roar"; // Set the sound of the lion
    }

    @Override
    public void feed() {
        System.out.println(name + " settles in to eat his rare steak."); // Feed the lion and print the output
        points += 10; // Increase the points by 10
    }

    @Override
    public void pet() {
        System.out.println(name + " purrs contentedly."); // Pet the lion and print the output
        points += 5; // Increase the points by 5
    }

    @Override
    public void observe() {
        System.out.println(name + " roams around his territory."); // Observe the lion and print the output
        points += 2; // Increase the points by 2
    }

    public void makeSound() {
        System.out.println(sound); // Make the lion sound (roar) and print the output
    }
}

class Giraffe extends Animal {
    private int neckLength; // Length of the giraffe's neck

    public Giraffe(String name) {
        super(name, "Giraffe"); // Call the superclass constructor and set the species to "Giraffe"
        neckLength = 5; // Set the length of the giraffe's neck
    }

    @Override
    public void feed() {
        System.out.println(name + " stretches its " + neckLength + "-foot-long neck to reach the leaves."); // Feed the giraffe and print the output
        points += 8; // Increase the points by 8
    }

    @Override
    public void pet() {
        System.out.println(name + " nuzzles your hand with its long tongue."); // Pet the giraffe and print the output
        points += 3; // Increase the points by 3
    }

    @Override
    public void observe() {
        System.out.println(name + " gracefully walks around."); // Observe the giraffe and print the output
        points += 2; // Increase the points by 2
    }
}

class Elephant extends Animal {
    private double trunkLength; // Length of the elephant's trunk

    public Elephant(String name) {
        super(name, "Elephant"); // Call the superclass constructor and set the species to "Elephant"
        trunkLength = 2.5; // Set the length of the elephant's trunk
    }

    @Override
    public void feed() {
        System.out.println(name + " uses its " + trunkLength + "-meter-long trunk to grab the bananas."); // Feed the elephant and print the output
        points += 6; // Increase the points by 6
    }

    @Override
    public void pet() {
        System.out.println(name + " playfully sprays water with its trunk."); // Pet the elephant and print the output
        points += 4; // Increase the points by 4
    }

    @Override
    public void observe() {
        System.out.println(name + " splashes around in the water."); // Observe the elephant and print the output
        points += 2; // Increase the points by 2
    }
}

class Penguin extends Animal {
    private String sound; // Sound made by the penguin

    public Penguin(String name) {
        super(name, "Penguin"); // Call the superclass constructor and set the species to "Penguin"
        sound = "Honk"; // Set the sound of the penguin
    }

    @Override
    public void feed() {
        System.out.println(name + " slides on its belly to catch the fish."); // Feed the penguin and print the output
        points += 5; // Increase the points by 5
    }

    @Override
    public void pet() {
        System.out.println(name + " waddles over and rubs against your leg."); // Pet the penguin and print the output
        points += 2; // Increase the points by 2
    }

    @Override
    public void observe() {
        System.out.println(name + " dives into the water and swims gracefully."); // Observe the penguin and print the output
        points += 1; // Increase the points by 1
    }

    public void makeSound() {
        System.out.println(sound); // Make the penguin sound (honk) and print the output
    }
}

class Monkey extends Animal {
    private String favoriteFood; // Favorite food of the monkey

    public Monkey(String name) {
        super(name, "Monkey"); // Call the superclass constructor and set the species to "Monkey"
        favoriteFood = "bananas"; // Set the favorite food of the monkey
    }

    @Override
    public void feed() {
        System.out.println(name + " opens a " + favoriteFood + " with its hands and eats it."); // Feed the monkey and print the output
        points += 4; // Increase the points by 4
    }

    @Override
    public void pet() {
        System.out.println(name + " jumps on your shoulder and clings to you."); // Pet the monkey and print the output
        points += 3; // Increase the points by 3
    }

    @Override
    public void observe() {
        System.out.println(name + " swings from branch to branch in the trees."); // Observe the monkey and print the output
        points += 2; // Increase the points by 2
    }
}

