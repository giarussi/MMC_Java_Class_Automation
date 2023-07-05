package WordguessingGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Wordguessinggame {

	public static void main(String[] args) {
		int incorrectGuesses = 5;
		boolean chance = false;
		String temp = "", flag = null;
		ArrayList<String> words;

		System.out.println("Welcome to the guessing game! Guess one letter " + "at a time. You have " + incorrectGuesses
				+ " incorrect " + "guesses remaining.");

		Scanner scaner = new Scanner(System.in);
		// Create array list for the searchhing
		words = new ArrayList<String>();
		words.add("Titanic");
		words.add("Avengers");
		words.add("Batman");
		words.add("Spiderman");
		words.add("Antman");
		words.add("Godfather");

		words.forEach((n) -> System.out.println(n));

		// Word to be guessed
		String word = "Titanic";
		StringBuilder str = new StringBuilder();

		// Logic for searching the prgram
		do {
			System.out.print("Your Guess: ");
			String guess = scaner.nextLine();
			boolean correctGuess = false;

			for (int i = 0; i < word.length(); i++) {
				if (guess.equalsIgnoreCase(Character.toString(word.charAt(i)))) {
					correctGuess = true;
					if (!chance)
						temp += str.toString();
					else {
						String holder = Character.toString(temp.charAt(i)).replace("-", guess);
						temp = temp.substring(0, i) + holder + temp.substring(i + 1, temp.length());
					}
				} else {
					if (!chance) {
						temp += "-";
					}
				}
			}
			chance = true;

			if (correctGuess) {
				System.out.println("The word contains the letter " + guess + ".");
			} else {
				System.out.println("The word does not contain the letter " + guess + ".");
				incorrectGuesses--;
				System.out.println("You have " + incorrectGuesses + " incorrect guesses remaining.");
			}

			System.out.println(temp);
			if (temp.equalsIgnoreCase(word)) {
				System.out.println("You guessed correctly!");
				break;
			}

		} while (incorrectGuesses > 0);

		if (incorrectGuesses <= 0) {
			System.out.println("Sorry, you didn't guess the secret word \"" + word + "\".");
		}

	}

	// Word creation logic after guessing
	private static String createWord(String word) {
		String output = "";
		for (int i = 0; i < word.length(); i++) {
			output += "-";
		}
		return output;
	}

}
