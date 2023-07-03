package HomeworkDay8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordGuessingGame {
	private static final List<String> WORDS = Arrays.asList("panda", "lion", "tiger", "kiwi", "orange", "apple",
			"india", "japan", "germany");
	private static final int MAX_ATTEMPTS = 6;

	private String secretWord;
	private List<Character> guessedLetters;
	private int incorrectGuesses;

	public WordGuessingGame() {
		secretWord = selectSecretWord();
		guessedLetters = new ArrayList<>();
		incorrectGuesses = 0;
	}

	private String selectSecretWord() {
		Random random = new Random();
		int index = random.nextInt(WORDS.size());
		return WORDS.get(index);
	}

	public void play() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Word Guessing Game!");
		System.out.println("Guess the letters in the secret word.");

		while (true) {
			System.out.println("Secret Word: " + getMaskedWord());
			System.out.println("Incorrect Guesses: " + incorrectGuesses + "/" + MAX_ATTEMPTS);
			System.out.print("Enter your guess: ");
			char guess = scanner.nextLine().toLowerCase().charAt(0);

			if (!isValidGuess(guess)) {
				System.out.println("Invalid guess. Please enter a single letter that hasn't been guessed before.");
				continue;
			}

			guessedLetters.add(guess);

			if (isCorrectGuess(guess)) {
				System.out.println("Correct guess!");
			} else {
				System.out.println("Incorrect guess!");
				incorrectGuesses++;
			}

			if (isGameOver()) {
				System.out.println("Secret Word: " + secretWord);
				if (isGameWon()) {
					System.out.println("Congratulations! You won!");
				} else {
					System.out.println("Game over! You lost!");
				}
				break;
			}
		}

		System.out.println("Do you want to play again? (yes/no)");
		String playAgain = scanner.nextLine();
		if (playAgain.equalsIgnoreCase("yes")) {
			resetGame();
			play();
		} else {
			System.out.println("Thank you for playing! Goodbye!");
		}

		scanner.close();
	}

	private boolean isValidGuess(char guess) {
		return Character.isLetter(guess) && !guessedLetters.contains(guess);
	}

	private boolean isCorrectGuess(char guess) {
		return secretWord.contains(Character.toString(guess));
	}

	private boolean isGameOver() {
		return isGameWon() || incorrectGuesses >= MAX_ATTEMPTS;
	}

	private boolean isGameWon() {
		for (char c : secretWord.toCharArray()) {
			if (!guessedLetters.contains(c)) {
				return false;
			}
		}
		return true;
	}

	private String getMaskedWord() {
		StringBuilder maskedWord = new StringBuilder();
		for (char c : secretWord.toCharArray()) {
			if (guessedLetters.contains(c)) {
				maskedWord.append(c);
			} else {
				maskedWord.append("_");
			}
			maskedWord.append(" ");
		}
		return maskedWord.toString().trim();
	}

	private void resetGame() {
		secretWord = selectSecretWord();
		guessedLetters.clear();
		incorrectGuesses = 0;
	}

	public static void main(String[] args) {
		WordGuessingGame game = new WordGuessingGame();
		game.play();
	}
}