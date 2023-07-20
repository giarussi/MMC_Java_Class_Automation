package HomeworkWordGuessGame;

import java.util.ArrayList;
import java.util.List;

public class PlayWordGuessingGame {

	public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("hippo");
        wordList.add("panda");
        wordList.add("tiger");
        wordList.add("elephant");
        wordList.add("zebra");

 

        WordGuessingGame game = new WordGuessingGame(wordList);
        game.playGame();
    }

 
}
