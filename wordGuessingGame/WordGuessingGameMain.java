package homework;

import java.util.ArrayList;
import java.util.List;

public class WordGuessingGameMain {

	public static void main(String[] args) {
		List<String> wordList = new ArrayList<>();
		wordList.add("apple");
		wordList.add("kiwi");
		wordList.add("mango");
		wordList.add("pineapple");
		wordList.add("grape");

		WordGuessingGame game = new WordGuessingGame(wordList);
		game.playGame();
	}

}
