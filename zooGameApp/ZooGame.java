package zooGameApp;

import java.util.Scanner;

public class ZooGame {
    public static void main(String[] args) {
        // Instantiate the animals
        Lion lion = new Lion("Simba");
        Giraffe giraffe = new Giraffe("Melman");
        Elephant elephant = new Elephant("Dumbo");
        Penguin penguin = new Penguin("Skipper");
        Monkey monkey = new Monkey("Rafiki");

        Animal[] animals = { lion, giraffe, elephant, penguin, monkey };

        int totalPoints = 0; // Total points earned by the user
        int interactions = 0; // Number of interactions with animals

        System.out.println("Welcome to the Zoo Game!");

        Scanner scanner = new Scanner(System.in);

        // Game loop
        while (interactions < 10) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Feed an animal");
            System.out.println("2. Pet an animal");
            System.out.println("3. Observe an animal");

            int choice = scanner.nextInt();

            // Choose an animal randomly
            int animalIndex = (int) (Math.random() * animals.length);
            Animal chosenAnimal = animals[animalIndex];

            switch (choice) {
                case 1:
                    chosenAnimal.feed();
                    break;
                case 2:
                    chosenAnimal.pet();
                    break;
                case 3:
                    chosenAnimal.observe();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            totalPoints += chosenAnimal.getPoints();
            interactions++;

            System.out.println("Points earned: " + chosenAnimal.getPoints());
        }

        System.out.println("\nGame Over!");
        System.out.println("Total points: " + totalPoints);

        scanner.close();
    }
}
