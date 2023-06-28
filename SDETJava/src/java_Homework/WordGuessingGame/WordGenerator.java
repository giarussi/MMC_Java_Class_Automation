package java_Homework.WordGuessingGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author U1248069 Class to generate a new word and validate and check the
 *         guesses
 *
 */
public class WordGenerator {

	private ArrayList<String> words;
	private String newWord = null;
	private StringBuilder wordsGuessed;

	// Constructor to initialise the list of words
	public WordGenerator() {

		words = new ArrayList<String>(Arrays.asList("orange", "red", "green", "yellow", "blue", "white", "black",
				"kiwi", "apple", "lion", "dog", "cat", "fish"));

		wordsGuessed = new StringBuilder();
	}

	/**
	 * 
	 * @return Returns a randomly selected word
	 */
	public String selectWordRandomly() {

		Random num = new Random();
		newWord = words.get(num.nextInt(words.size()));
		return newWord;
	}

	/**
	 * 
	 * @param guessLetter
	 * @return Validates if the guess format is correct
	 */
	public int validateTheGuess(String guessLetter) {

		if (guessLetter.length() == 1) {
			if (wordsGuessed.indexOf(guessLetter) < 0) {
				wordsGuessed.append(guessLetter);
				return 1;
			} else {
				return 0;
			}

		} else {
			return -1;
		}

	}

	/**
	 * 
	 * @param guessLetter
	 * @return Checks if the guess is present in the word Returns empty list if not
	 *         present
	 * 
	 */
	public List<Integer> isPresent(String guessLetter) {
		guessLetter = guessLetter.toLowerCase();
		List<Integer> indexes = new ArrayList<Integer>();
		int index = 0;
		while (index != -1) {
			index = newWord.indexOf(guessLetter, index);
			if (index != -1) {
				indexes.add(index);
				index++;
			}
		}
		return indexes;

	}

}
