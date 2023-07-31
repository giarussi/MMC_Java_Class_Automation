package WordguessingGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Wordguessinggame {

	public static void main(String[] args) {
		int incorrectchance = 5;
		boolean chance = false;
		String temp = "", flag = null;
		ArrayList<String> words;

		System.out.println("Welcome to the guessing game! Guess one letter " + "at a time. You have " + incorrectchance
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

		string_word game = new string_word(words);
		game.play();

	}
}