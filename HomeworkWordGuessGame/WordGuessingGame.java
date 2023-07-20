package HomeworkWordGuessGame;

import java.util.List;
import java.util.Scanner;

public class WordGuessingGame {

	//initialize
	private List<String> wordList;
	private String wordToGuess;
	private StringBuilder guessedWord;
	private int attempts;
	boolean condition = true;

	 
// constructor 

	public WordGuessingGame(List<String> wordList) {
	    this.wordList = wordList;
	    this.wordToGuess = selectRandomWord();
	    this.guessedWord = new StringBuilder();
	    this.attempts = 0;
	    initializeGuessesWord();
	}
//method to select random word
	private String selectRandomWord() {
	    int randomIndex = (int) (Math.random()*wordList.size());
	    return wordList.get(randomIndex);
	}

	 

	private void initializeGuessesWord() {
	    int wordLength = wordToGuess.length();
	    if(guessedWord.length()>0) {
	        guessedWord.setLength(0);
	    }
	    for (int i = 0; i < wordLength; i++) {
	        guessedWord.append('_');
	        }
	    }

	 

	 


	private boolean checkLetter(char letter) {
	    boolean letterGuessed = false;
	    for (int i = 0; i < wordToGuess.length(); i++) {
	        if(wordToGuess.charAt(i)==letter) {
	            guessedWord.setCharAt(i, letter);
	            letterGuessed = true;
	        }
	    }
	    return letterGuessed;
	}

	 

	public void playGame() {
	    Scanner scanner = new Scanner (System.in);
	    boolean wordGuessed = false;



	    System.out.println("Welcome to the word guessing Game. :-)");
	    System.out.println("Guess the word by entering one letter at a time");
	    System.out.println("Start guessing the Animal");
	    System.out.println("The word has "+ wordToGuess.length()+ " letters. Start guessing!");

	    while(!wordGuessed) {
	        System.out.println("Current word:"+guessedWord);
	        System.out.println("Enter a letter.");
	        char guessedLetter = scanner.next().charAt(0);
	        boolean letterGuessed = checkLetter(guessedLetter);
	        if(letterGuessed) {
	            System.out.println("Correct Guess");
	        }else {
	            System.out.println("Wrong Guess");
	            attempts++;
	        }
	        if(guessedWord.toString().equals(wordToGuess)) {
	            wordGuessed =true;
	            System.out.println("Congratulations! You guessed the word" +" "+ wordToGuess + " "+ "in"+" "+attempts+" wrong attempts.");
	            System.out.println("Do you want to play again ?  Yes/No ");
	            String ans = scanner.next();
	            if(ans.equalsIgnoreCase("Yes")) {
	                System.out.println("!!--You Selected Yes--!!");
	                attempts=0;
	                wordGuessed = false;
	                this.wordToGuess = selectRandomWord();
	                initializeGuessesWord();
	                condition = true;
	                playGame();
	            }else {
	                condition = false;
	                System.out.println("Thanks for playing !");
	                wordGuessed =true;
	            }
	        }    
	    }    
	}
}
