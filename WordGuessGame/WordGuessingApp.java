package WordGuessGame;

import java.util.List;
import java.util.Scanner;


public class WordGuessingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initializing the Known variables
		String continuePlaying = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the word guessing game \n");
		WordGen word;
		String currentWord = null;
		int incorrectGuess = 0;
		String guessLetter;
		int validIndicator;

		StringBuilder revealString;

		do {
			// Starting a new game
			revealString = new StringBuilder();

			// Generating a new word
			word = new WordGen();
			currentWord = word.selectWordRandomly();
			incorrectGuess = currentWord.length() - 1;

			for (int i = 0; i < currentWord.length(); i++) {
				revealString.append("_");

			}
			System.out.println("============== New word generated ============== ");
			System.out.println("The word to be guessed has total of: " + currentWord.length() + " letters");
			System.out.println("You will have " + incorrectGuess + " guesses");

			do {

				System.out.print("Guess a letter: ");
				guessLetter = scan.nextLine();

				// Validating the guess
				validIndicator = word.validateTheGuess(guessLetter);
				if (validIndicator == 0) {
					System.out.println(
							"Your have already guessed this letter. Chance not counted. Please enter a new letter");
					System.out.println("");
					continue;
				} else if (validIndicator == -1) {
					System.out.println(
							"Your have entered more than 1 letter. Chance not counted. Please enter a new letter");
					System.out.println("");
					continue;
				}

				// checking the guess can have multiple occurrences
				List<Integer> indexesOfGuess = word.isPresent(guessLetter);

				// successful guess
				if (indexesOfGuess.size() > 0) {

					for (int index : indexesOfGuess) {
						revealString.replace(index, index + 1, guessLetter);
					}

					System.out.println("Correct Guess! The word is: " + revealString);
					System.out.println("");

					// Word complete
					if (revealString.indexOf("_") < 0) {
						System.out.println("Congratulations! You won the Game. The word is: " + currentWord);
						break;
					} else {
						continue;
					}
					// Incorrect Guess
				} else {
					incorrectGuess--;
					System.out.println("Incorrect Guess. The word is: " + revealString);
					System.out.println("You have " + incorrectGuess + " more chances");
					System.out.println("");
					if (incorrectGuess == 0) {
						System.out.println("You lost ! The word was: " + currentWord);
					}
				}

			} while (incorrectGuess > 0);

			System.out.println("Do you wan to play again? (y/n)");
			continuePlaying = scan.nextLine();

		} while (continuePlaying.equalsIgnoreCase("Y"));

		scan.close();

	}

}