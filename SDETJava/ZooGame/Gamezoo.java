package ZooGame;

import java.util.Scanner;

public class Gamezoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Guesses = 10, PLAYFULNESS = 10, hunt = 15, Elph_col = 20, mnky_col = 70;
		int choice, chose, count = 0, sound = 5, final_cnt = 0, max_scr = 420, min_scr = 100;
		String color;
		System.out.println("You  have entered in Game ");
		String flag = null, flag2 = null;
		int playtime = 10;
// Game logic
		do {

			System.out.println(
					"Welcome to the Zoo  game! Chose  one Animal  1.Dog \n 2.Lion \n 3.Fish \n 4.Elephant \n 5.Monkey"
							+ "one at a time. You have " + Guesses + " " + "guesses remaining.");
			Scanner scaner = new Scanner(System.in);
			int guess = scaner.nextInt();
			boolean correctGuess = false;
			animal Animal = new animal();
			Monkey mnky = new Monkey();
			Dog dog = new Dog();
			Lion lion = new Lion();
			fish fish = new fish("Orange", "Golden Fish ");
			Elephant elep = new Elephant();
			switch (guess) {
			case 1:
				System.out.println("You Chose  Dog  ");
				System.out.println("How you want to play 1.Make Sound \n  2.Special Attributes  3.id");
				chose = scaner.nextInt();
				switch (chose) {
				case 1:
					System.out.println("You chose to 1.Make Sound \n ");
					dog.dog_details();
					count = count + sound;
					System.out.println("You chose to Make Sound with score  " + count);
					break;
				case 2:
					dog.special_attribute("Snowy");
					count = count + sound;
					System.out.println("You chose to Special Attributes with score  " + count);
					break;
				case 3:
					System.out.println("Enter id of dog ");
					String nm = scaner.next();
					elep.setAnimalid(nm);
					count = count + hunt;
					System.out.println("Your score  " + count);
				}
				break;

			case 2:
				System.out.println("You Chose  Lion ");

				System.out.println("How you want to play 1.Make Sound \n 2.Habitat \n 3.Age ");
				chose = scaner.nextInt();
				switch (chose) {
				case 1:
					System.out.println("You chose to  1.Make Sound ");
					lion.dog_details();
					count = count + sound;
					System.out.println("You chose to lion  with score  " + count);
					break;
				case 2:
					System.out.println("You chose to  2.Habitat \n ");
					lion.hunting_details();
					count = count + hunt;
					System.out.println("You chose to lion  with score  " + count);
					break;
				case 3:
					System.out.println("You Chose lion  age");
					System.out.println("Enter age");
					color = scaner.next();
					lion.setAge(color);
					count = count + hunt + sound;

				}
				break;

			case 3:
				System.out.println("You Chose Fish");
				System.out.println("How you want to play 1.Ask food  \n 2.Fish Details  \n 3.Fish color");
				chose = scaner.nextInt();
				switch (chose) {
				case 3:
					System.out.println("Enter your Fish color");
					color = scaner.next();
					count = count + (fish.fish_color(color));
					System.out.println("Your score  " + count);
					break;
				case 2:
					System.out.println("Fish Details");
					fish.dog_details();
					count = count + hunt;
					System.out.println("Your score  " + count);
					break;
				case 1:
					System.out.println("Fish Details");
					fish.setHunting_exp("Water ,Aquatic plants");
					count = count + hunt + sound;
					System.out.println("Your score  " + count);

				}
				break;

			case 4:
				System.out.println("You Chose  Elephant");
				System.out.println("How you want to play 1.Ask food  \n 2.Elephant Details  \n 3.Id of Elephant");
				chose = scaner.nextInt();
				switch (chose) {
				case 1:
					elep.Elephant_details();
					count = count + Elph_col;
					System.out.println("Your score  " + count);
					break;
				case 2:
					elep.dog_details();
					count = count + sound;
					System.out.println("Your score  " + count);
					break;
				case 3:
					System.out.println("Enter id of Elephant ");
					String nm = scaner.next();
					elep.setAnimalid(nm);
					count = count + hunt;
					System.out.println("Your score  " + count);
				}
				break;

			case 5:
				System.out.println("You Chose  Monkey");
				System.out.println("How you want to play 1.Ask food  \n 2.Give name to monkey  \n 3.Id of Monkey");
				chose = scaner.nextInt();
				switch (chose) {
				case 1:
					mnky.getAnimaltype();
					count = count + mnky_col;
					System.out.println("Your score  " + count);
					break;
				case 2:
					System.out.println("Enter name of Monkey ");
					String nm = scaner.next();
					mnky.getname(nm);
					count = count + mnky_col;
					System.out.println("Your score  " + count);
					break;
				case 3:
					System.out.println("Enter id of Monkey ");
					String nmid = scaner.next();
					mnky.setAnimalid(nmid);
					count = count + mnky_col;
					System.out.println("Your score  " + count);
				}
				break;
			}
			// final_cnt=final_cnt+count;
			Guesses--;
			System.out.println("Your  final score is   " + count);
			System.out.println("Do you want to continue ? (Y/N)");
			flag = scaner.next();

		} while (flag.equalsIgnoreCase("Y") && Guesses > 0);
//Scoring logic
		if (count > max_scr) {
			System.out.println("Your have reached near Max score .  " + count);
		} else if (count <= min_scr) {
			System.out.println("Your have reached Min score.Better luck next time  " + count);
		} else {
			System.out.println("Your have reached  Max score .  " + count);
		}

	}
}
