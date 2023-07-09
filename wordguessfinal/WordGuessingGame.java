package wordguessfinal;

import java.util.*;

public class WordGuessingGame {
    private List<String> categories;
    private List<List<String>> wordLists;
    private List<String> usedWords;
    private String secretWord;
    private StringBuilder guessedLetters;
    private List<Character> incorrectGuesses;

    public WordGuessingGame() {
        categories = new ArrayList<>();
        wordLists = new ArrayList<>();
        usedWords = new ArrayList<>();
        secretWord = "";
        guessedLetters = new StringBuilder();
        incorrectGuesses = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        WordGuessingGame game = new WordGuessingGame();
        Scanner scanner = new Scanner(System.in);
        String playAgain;
        int  attempt=1;

        do {
            game.playGame(attempt);
            

            System.out.println("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

            if (playAgain.equals("yes")) {
                game.usedWords.clear();
                attempt+=1;
            }
            else if (playAgain.equals("no")) {
            	System.out.println("Thanks for playing!");
            	scanner.close();
				
			}
            else {
            	System.out.println("Enter a valid response exiting for now!");
            	scanner.close();
            }
            	
        } while (playAgain.equals("yes"));
    }
    
    
    /**
     * Starts and plays the word guessing game.
     */
    private void playGame(int attempt) {
    	if (attempt==1) {
    	
        populateWordCategories();
    	}

        if (categories.isEmpty()) {
            System.out.println("No categories entered. Exiting the game.");
            return;
        }

        int selectedCategoryIndex = promptCategorySelection();
        secretWord = selectSecretWord(selectedCategoryIndex);

        if (secretWord.isEmpty()) {
            System.out.println("No words remaining in the selected category. Exiting the game.");
            return;
        }

        guessedLetters = new StringBuilder(secretWord.replaceAll("[a-z]", "_"));
        incorrectGuesses.clear();

        System.out.println("Mystery word has " + secretWord.length() + " letters.");

        while (!isGameWon() && !isGameOver()) {
            System.out.println("Secret Word: " + guessedLetters.toString());
            char guess = promptPlayer();
            checkGuess(guess);
            System.out.println("Incorrect Guesses: " + incorrectGuesses.size());
        }

        if (isGameWon()) {
            System.out.println("Congratulations! You won. The secret word is: " + secretWord);
        } else {
            System.out.println("Game Over! You lost. The secret word was: " + secretWord);
        }

        resetGameState();
    }

    /**
     * Populates the word categories and their corresponding word lists by taking user input.
     */
    private void populateWordCategories() {
        Scanner scanner = new Scanner(System.in);

        String category;
        while (true) {
            System.out.println("Enter a category (or enter 'done' to finish): ");
            category = scanner.nextLine().trim().toLowerCase();

            if (category.equalsIgnoreCase("done")) {
                break;
            }

            categories.add(category);

            List<String> words = new ArrayList<>();
            String word;

            while (true) {
                System.out.println("Enter a word for the category '" + category + "' (or enter 'done' to finish): ");
                word = scanner.nextLine().trim().toLowerCase();

                if (word.equalsIgnoreCase("done")) {
                    break;
                }

                words.add(word);
            }

            wordLists.add(words);
        }
    }
    
    
    /**
     * Prompts the player to select a category.
     *
     * @return The index of the selected category.
     */
    private int promptCategorySelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a category:");

        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + ". " + categories.get(i));
        }

        int selection = scanner.nextInt();
        while (selection < 1 || selection > categories.size()) {
            System.out.println("Invalid category. Please enter a valid category number: ");
            selection = scanner.nextInt();
        }

        return selection - 1;
    }

    /**
     * Selects a random secret word from the remaining unused words in the specified category.
     *
     * @param categoryIndex The index of the selected category.
     * @return The selected secret word.
     */
    private String selectSecretWord(int categoryIndex) {
        List<String> words = wordLists.get(categoryIndex);
        List<String> remainingWords = new ArrayList<>(words);
        remainingWords.removeAll(usedWords);

        if (!remainingWords.isEmpty()) {
            Random random = new Random();
            int index = random.nextInt(remainingWords.size());
            String selectedWord = remainingWords.get(index);
            usedWords.add(selectedWord);
            return selectedWord;
        }

        return "";
    }

    

    /**
     * Prompts the player to guess a letter.
     *
     * @return The guessed letter.
     */
    private char promptPlayer() {
        System.out.println("Guess a letter: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        while (!input.matches("[a-z]") || guessedLetters.toString().contains(input) || incorrectGuesses.contains(input.charAt(0))) {
            System.out.println("Invalid guess. Please enter a valid letter: ");
            input = scanner.nextLine().toLowerCase();
        }

        return input.charAt(0);
    }

    /**
     * Checks if the guessed letter is present in the secret word and updates the game state accordingly.
     *
     * @param guess The guessed letter.
     */
    private void checkGuess(char guess) {
        boolean correctGuess = false;
        StringBuilder positions = new StringBuilder();

        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guess) {
                guessedLetters.setCharAt(i, guess);
                correctGuess = true;
                positions.append((i + 1)).append(" ");
            }
        }

        if (correctGuess) {
            System.out.println("Correct guess! The letter '" + guess + "' is at position(s): " + positions);
        } else {
            System.out.println("Incorrect guess!");
            incorrectGuesses.add(guess);
        }
    }

    /**
     * Checks if the game is won.
     *
     * @return True if the game is won, false otherwise.
     */
    private boolean isGameWon() {
        return !guessedLetters.toString().contains("_");
    }

    /**
     * Checks if the game is over.
     *
     * @return True if the game is over, false otherwise.
     */
    private boolean isGameOver() {
        return incorrectGuesses.size() >= secretWord.length();
    }

    /**
     * Resets the game state for a new round.
     */
    private void resetGameState() {
        secretWord = "";
        guessedLetters = new StringBuilder();
        incorrectGuesses.clear();
    }

    

    
}
