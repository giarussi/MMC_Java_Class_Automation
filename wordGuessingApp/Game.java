package wordGuessingApp;

import java.util.List;
import java.util.Scanner;

class Game {
    private static final int MAX_ATTEMPTS = 6;

    private WordSelector wordSelector;
    private GameState gameState;
    Scanner scanner = new Scanner(System.in);
    public Game() {
        wordSelector = new WordSelector();
    }

    public void play() {
        initializeGame();
        boolean gameOver = false;

        while (!gameOver) {
            displayGameState();
            char guessedLetter = getValidGuess();
            updateGameState(guessedLetter);

            if (gameState.hasWon()) {
                displayGameState();
                System.out.println("Congratulations! You won!");
                gameOver = true;
            } else if (gameState.hasLost(MAX_ATTEMPTS)) {
                displayGameState();
                System.out.println("Sorry, you lost! The secret word was: " + gameState.getSecretWord());
                gameOver = true;
            }
        }

        if (playAgain()) {
            play();
        } else {
            System.out.println("Thank you for playing!");
        }
    }

    private void initializeGame() {
    	// Select a new secret word
        String secretWord = wordSelector.selectWord();
        // Create a new game state with the selected secret word
        gameState = new GameState(secretWord);
    }

    private void displayGameState() {
    	// Display the masked secret word, guessed letters, and number of incorrect guesses
        String maskedWord = getMaskedWord();
        List<Character> guessedLetters = gameState.getGuessedLetters();
        int incorrectGuesses = gameState.getIncorrectGuesses();

        System.out.println("Welcome to the Word Guessing Game!");
        System.out.println("The secret word has " + maskedWord.length() + " Letters");
        System.out.println("Secret word: " + maskedWord);
        System.out.println("Guessed letters: " + guessedLetters);
        System.out.println("Incorrect guesses: " + incorrectGuesses + "/" + MAX_ATTEMPTS);
    }

    private String getMaskedWord() {
    	// Create a masked version of the secret word, where unguessed letters are replaced with asterisks
        StringBuilder maskedWord = new StringBuilder();

        String secretWord = gameState.getSecretWord();
        List<Character> guessedLetters = gameState.getGuessedLetters();

        for (int i = 0; i < secretWord.length(); i++) {
            char letter = secretWord.charAt(i);
            if (guessedLetters.contains(letter)) {
                maskedWord.append(letter);
            } else {
                maskedWord.append("*");
            }
        }

        return maskedWord.toString();
    }

    private char getValidGuess() {
    	// Prompt the player to enter a valid guess and validate the input
        
        char guessedLetter;

        while (true) {
            System.out.print("Guess a letter: ");
            String input = scanner.nextLine();

            if (input.length() != 1) {
                System.out.println("Please enter a single letter!");
                continue;
            }

            guessedLetter = Character.toLowerCase(input.charAt(0));

            if (!Character.isLetter(guessedLetter)) {
                System.out.println("Please enter a valid letter!");
                continue;
            }

            List<Character> guessedLetters = gameState.getGuessedLetters();
            if (guessedLetters.contains(guessedLetter)) {
                System.out.println("You have already guessed that letter!");
                continue;
            }

            break;
        }

        return guessedLetter;
    }

    private void updateGameState(char guessedLetter) {
    	// Update the game state with the guessed letter and check if it is correct or incorrect
        gameState.addGuessedLetter(guessedLetter);

        String secretWord = gameState.getSecretWord();
        if (!secretWord.contains(String.valueOf(guessedLetter))) {
            gameState.incrementIncorrectGuesses();
        }
    }

    private boolean playAgain() {
    	// Prompt the player if they want to play again and return the player's choice
        System.out.print("Do you want to play again? (yes/no): ");
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("yes");
    }
}

