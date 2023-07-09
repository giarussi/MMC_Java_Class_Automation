package zooGame;

import java.util.Scanner;
import java.util.Random;


public class ZooGame {
    private static final int MAX_INTERACTIONS = 10;
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Lion lion = new Lion("Leo", 5, "Golden");
        Giraffe giraffe = new Giraffe("Gerry", 3, 7);
        Elephant elephant = new Elephant("Ellie", 10, 3);
        Penguin penguin = new Penguin("Penny", 2, false);
        Monkey monkey = new Monkey("Tim", 8, true);

        Animal[] animals = {lion, giraffe, elephant, penguin, monkey};

        int playerTotalScore = 0;
        int computerTotalScore = 0;

        System.out.println("Welcome to the Zoo Game!");
        System.out.println("You have " + MAX_INTERACTIONS + " interactions. Choose an animal and an interaction for each interaction and earn points!");

        for (int i = 0; i < MAX_INTERACTIONS; i++) {
            System.out.println("\nInteraction " + (i + 1) + ":");
            System.out.println("Choose an animal:");
            for (int j = 0; j < animals.length; j++) {
                System.out.println((j + 1) + ". " + animals[j].getName());
            }
            int animalChoice = scanner.nextInt();
            Animal selectedAnimal = animals[animalChoice - 1];

            System.out.println("You selected " + selectedAnimal.getName() + "!");
            System.out.println("Choose an interaction:");
            System.out.println("1. Make Sound");
            System.out.println("2. Eat");
            System.out.println("3. Play");
            int interactionChoice = scanner.nextInt();

            switch (interactionChoice) {
                case 1:
                    selectedAnimal.makeSound();
                    selectedAnimal.addToScore(3);
                    break;
                case 2:
                	System.out.println("Choose a food item: ");
                    System.out.println("1. Steak");
                    System.out.println("2. Fish");
                    System.out.println("3. Leaves");
                    System.out.println("4. Hay");
                    System.out.println("5. Banana");
                    int foodChoice = scanner.nextInt();

                    if (foodChoice == 1) {
                        selectedAnimal.eat("steak");
                        selectedAnimal.addToScore(5);
                    } else if (foodChoice == 2) {
                        selectedAnimal.eat("fish");
                        selectedAnimal.addToScore(5);
                    } else if (foodChoice == 3) {
                        selectedAnimal.eat("Leaves");
                        selectedAnimal.addToScore(5);
                    }else if (foodChoice == 4) {
                        selectedAnimal.eat("Hay");
                        selectedAnimal.addToScore(5);
                    }else if (foodChoice == 5) {
                        selectedAnimal.eat("banana");
                        selectedAnimal.addToScore(5);
                    }else {
                        System.out.println("Invalid food choice.");
                    }
                    
                    
                    selectedAnimal.addToScore(5);
                    break;
                case 3:
                    selectedAnimal.play();
                    selectedAnimal.addToScore(2);
                    break;
                default:
                    System.out.println("Invalid interaction choice.");
            }

            int interactionScore = selectedAnimal.getScore();
            playerTotalScore += interactionScore;

            System.out.println(selectedAnimal.getName() + "'s score: " + interactionScore);
            System.out.println("Your total score: " + playerTotalScore);

            // Simulating the computer player
            Animal computerSelectedAnimal = animals[random.nextInt(animals.length)];
            int computerInteractionChoice = random.nextInt(3) + 1;

            switch (computerInteractionChoice) {
                case 1:
                    computerSelectedAnimal.makeSound();
                    computerSelectedAnimal.addToScore(3);
                    break;
                case 2:
                    computerSelectedAnimal.eat("steak");
                    computerSelectedAnimal.addToScore(5);
                    break;
                case 3:
                    computerSelectedAnimal.play();
                    computerSelectedAnimal.addToScore(2);
                    break;
            }

            int computerInteractionScore = computerSelectedAnimal.getScore();
            computerTotalScore += computerInteractionScore;

            System.out.println("Computer selected " + computerSelectedAnimal.getName() + ".");
            System.out.println(computerSelectedAnimal.getName() + "'s score: " + computerInteractionScore);
            System.out.println("Computer's total score: " + computerTotalScore);
        }

        

        System.out.println("\nGame Over!");
        System.out.println("Your final score: " + playerTotalScore);
        System.out.println("Computer's final score: " + computerTotalScore);

        if (playerTotalScore > computerTotalScore) {
            System.out.println("Congratulations! You win!");
        } else if (playerTotalScore < computerTotalScore) {
            System.out.println("You lose! Better luck next time.");
        } else {
            System.out.println("It's a tie! Good game.");
        }scanner.close();
    }
}
