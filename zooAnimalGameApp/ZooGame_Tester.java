package homework;

import java.util.Scanner;


public class ZooGame_Tester {
	static Scanner scanner = new Scanner(System.in);
	static int totalPoints = 0;
	public static void main(String[] args) {
		ZooGame_Animal animal = new ZooGame_Animal();
		int attempts =10;
		while(attempts >0 ) {
			System.out.println("Select an animal:");
			System.out.println("1. Lion| 2. Elephant | 3. Deer | 4. Penguin | 5. Snake");
			System.out.println("Enter your choice");
			int choiceOfAnimal = scanner.nextInt();
			logic(choiceOfAnimal);
			attempts--;
			System.out.println("Number of Attempts left with you: "+attempts);			
		}
		System.out.println("Hurray ! Your Total Score:" +totalPoints);

	}
	
	public static void logic(int choice) {
		int action; 
		if(choice==1) {
			ZooGame_Lion lion = new ZooGame_Lion();
			System.out.println("Select an action you want to perform");
			System.out.println("1. Sleep | 2. Feed | 3. Make Sound | 4. Hunt");
			 action = scanner.nextInt();
			if(action==1) {
				totalPoints += lion.sleep();
			}else if(action==2) {
				totalPoints += lion.feed();
			}else if(action==3) {
				totalPoints += lion.makeSound();
			}else if(action==4) {
				totalPoints += lion.hunt();
			}else {
				System.out.println("Invalid action Selected");
			}
		}else if(choice==2) {
			ZooGame_Elephant elephant = new ZooGame_Elephant();
			System.out.println("Select an action you want to perform");
			System.out.println("1. Sleep | 2. Feed | 3. Make Sound | 4. Sprinkle Water");
			action = scanner.nextInt();
			if(action==1) {
				totalPoints += elephant.sleep();
			}else if(action==2) {
				totalPoints += elephant.feed();
			}else if(action==3) {
				totalPoints += elephant.makeSound();
			}else if(action==4) {
				totalPoints += elephant.sprinklesWater();
			}else {
				System.out.println("Invalid action Selected");
			}
		}else if(choice==3) {
			ZooGame_Deer deer = new ZooGame_Deer();
			System.out.println("Select an action you want to perform");
			System.out.println("1. Sleep | 2. Feed | 3. Make Sound | 4. Dances");
			action = scanner.nextInt();
			if(action==1) {
				totalPoints += deer.sleep();
			}else if(action==2) {
				totalPoints += deer.feed();
			}else if(action==3) {
				totalPoints += deer.makeSound();
			}else if(action==4) {
				totalPoints += deer.dances();
			}else {
				System.out.println("Invalid action Selected");
			}
		}else if(choice==4) {
			ZooGame_Penguin penguin = new ZooGame_Penguin();
			System.out.println("Select an action you want to perform");
			System.out.println("1. Sleep | 2. Feed | 3. Make Sound | 4. Walks");
			action = scanner.nextInt();
			if(action==1) {
				totalPoints += penguin.sleep();
			}else if(action==2) {
				totalPoints += penguin.feed();
			}else if(action==3) {
				totalPoints += penguin.makeSound();
			}else if(action==4) {
				totalPoints += penguin.walks();
			}else {
				System.out.println("Invalid action Selected");
			}
		}else if(choice==5) {
			ZooGame_Snake snake = new ZooGame_Snake();
			System.out.println("Select an action you want to perform");
			System.out.println("1. Sleep | 2. Feed | 3. Make Sound | 4. Hangs");
			action = scanner.nextInt();
			if(action==1) {
				totalPoints += snake.sleep();
			}else if(action==2) {
				totalPoints += snake.feed();
			}else if(action==3) {
				totalPoints += snake.makeSound();
			}else if(action==4) {
				totalPoints += snake.hangs();
			}else {
				System.out.println("Invalid action Selected");
			}
		}else {
			System.out.println("Invalid action Selected");
		}
	}


}
