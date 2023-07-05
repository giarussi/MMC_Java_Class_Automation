package wordGuessingApp;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

class WordSelector {
    // List of words to choose from
    private static final List<String> WORDS = Arrays.asList("apple", "banana", "cat", "dog", "elephant", "frog", "giraffe", "hippopotamus", "jaguar", "kangaroo");

    // Method to select a random word from the list
    public String selectWord() {
        Random random = new Random();
        return WORDS.get(random.nextInt(WORDS.size()));
    }
}
