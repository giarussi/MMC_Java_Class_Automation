package wordGuessingApp;

import java.util.ArrayList;
import java.util.List;

class GameState {
    private String secretWord;
    private List<Character> guessedLetters;
    private int incorrectGuesses;

    public GameState(String secretWord) {
    	 // Initialize the game state with the secret word
        this.secretWord = secretWord;
        guessedLetters = new ArrayList<>();
        incorrectGuesses = 0;
    }

    public String getSecretWord() {
        // Get the secret word
        return secretWord;
    }

    public List<Character> getGuessedLetters() {
        // Get the list of guessed letters
        return guessedLetters;
    }

    public int getIncorrectGuesses() {
        // Get the number of incorrect guesses
        return incorrectGuesses;
    }

    public void addGuessedLetter(char letter) {
        // Add a guessed letter to the list
        guessedLetters.add(letter);
    }

    public void incrementIncorrectGuesses() {
        // Increment the number of incorrect guesses
        incorrectGuesses++;
    }
    public boolean hasWon() {
    	// Check if the player has won by guessing all the letters in the secret word
        for (int i = 0; i < secretWord.length(); i++) {
            char letter = secretWord.charAt(i);
            if (!guessedLetters.contains(letter)) {
                return false;
            }
        }

        return true;
    }

    public boolean hasLost(int maxAttempts) {
    	// Check if the player has lost by exceeding the maximum number of incorrect guesses
        return incorrectGuesses >= maxAttempts;
    
    }
}
