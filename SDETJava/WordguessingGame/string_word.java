package WordguessingGame;

import java.util.List;
import java.util.Scanner;

public class string_word {

	// initialize
	private List<String> word;
	private String guess;
	private StringBuilder guessed_Word;
	private int Chance;
	boolean flag = true;

	public string_word(List<String> word) {
		this.word = word;
		this.guess = selectRandomsize();
		this.guessed_Word = new StringBuilder();
		this.Chance = 0;
		createword();
	}

	private String selectRandomsize() {
		int randomIndex = (int) (Math.random() * word.size());
		return word.get(randomIndex);
	}

	private void createword() {
		int wordLength = guess.length();
		if (guessed_Word.length() > 0) {
			guessed_Word.setLength(0);
		}
		for (int i = 0; i < wordLength; i++) {
			guessed_Word.append('_');
		}
	}

	private boolean checkchar(char letter) {
		boolean letterguessed = false;
		for (int i = 0; i < guess.length(); i++) {
			if (guess.charAt(i) == (letter)) {
				guessed_Word.setCharAt(i, letter);
				letterguessed = true;
			}
		}
		return letterguessed;
	}

	public void play() {
		Scanner scanner = new Scanner(System.in);
		boolean wordguessed = false;
		System.out.println("Welcome to the word guessing Game. :-)");
		System.out.println("Start guessing the Movie");
		System.out.println("The word has " + guess.length() + " letters. Start guessing!");

		while (!wordguessed && guess.length() > 0) {
			System.out.println("Current word:" + guessed_Word);
			System.out.println("Enter a letter.");
			char guessedLetter = scanner.next().charAt(0);
			boolean letterguessed = checkchar(guessedLetter);
			if (letterguessed) {
				System.out.println("Correct guess");
			} else {
				System.out.println("Wrong guess");
				Chance++;
			}
			if (guessed_Word.toString().equals(guess)) {
				wordguessed = true;
				System.out.println("Congratulations! You guessed the word" + " " + guess + " ");

			}
		}
	}
}
