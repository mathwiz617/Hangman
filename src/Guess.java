import java.util.Arrays;

public class Guess {
	//initialize variables used in guessing process
	private char[] goal; //word to guess
	private char letterGuessed = ' '; //letter guessed by user
	private String wordGuessedString = ""; //word guessed by user
	private char[] wordGuessed; //word guessed as an array
	private char[] lettersGuessedOld; // keep track of accurate guesses
	private char[] lettersGuessedNew; // array to compare 
	int wrong = 0; //how many wrong guesses from user

<<<<<<< Updated upstream
	private char[] goal;
	private char letterGuessed = ' ';
	private String wordGuessedString = "";
	private char[] lettersGuessedOld;
	private char[] lettersGuessedNew;
	private int wrong = 0;
	private boolean win = false;
	private boolean loss = false;

	
=======
	//constructor to for hangman word
>>>>>>> Stashed changes
	public Guess(char[] word) {
		goal = word;
	}
	//constructor for letter guessed
	public Guess(char letter) {
		letterGuessed = letter;
	}
	
	//letter guessed getter
	public char getLetterGuessed() {
		return letterGuessed;
	}
	
	//letter guessed setter
	public void setLetterGuessed(char letterGuessed) {
		this.letterGuessed = letterGuessed;
	}
	
	//construuctor for guessing word
	public Guess(String word) {
		wordGuessedString = word;
	}
	
	//get word guessed
	public String getWordGuessed() {
		return wordGuessedString;
	}
	//set word guessed
	public void setWordGuessed(String wordGuessedString) {
		this.wordGuessedString = wordGuessedString;
	}
	
	//get array for the old progress of word
	public char[] getLettersGuessedOld() {
		return lettersGuessedOld;
	}
	//set
	public void setLettersGuessedOld(char[] lettersGuessedOld) {
		this.lettersGuessedOld = lettersGuessedOld;
	}
	//get new progress for letters guessed
	public char[] getLettersGuessedNew() {
		return lettersGuessedNew;
	}
	//set
	public void setLettersGuessedNew(char[] lettersGuessedNew) {
		this.lettersGuessedNew = lettersGuessedNew;
	}
	
<<<<<<< Updated upstream
	public int getWrong() {
		return wrong;
	}
	
	public boolean isWin() {
		return win;
	}

	public void setWin(boolean win) {
		this.win = win;
	}

	public boolean isLoss() {
		return loss;
	}

	public void setLoss(boolean loss) {
		this.loss = loss;
	}

=======
	//method after starting game
>>>>>>> Stashed changes
	public void start() {
		//create the letters guessed displays the size of goal word
		lettersGuessedOld = new char[goal.length];
		lettersGuessedNew = new char[goal.length];
		
		//make the arrays start as blank
		for (int i = 0; i < goal.length; i++) {
			lettersGuessedOld[i] = '_';
			lettersGuessedNew[i] = '_';
		}
	}
			
<<<<<<< Updated upstream
	public void letterGuess(char a) {
		for (int i = 0; i < goal.length; i++) {
			if (a == goal[i]) {
				lettersGuessedNew[i] = a;
			}
		}
		if (Arrays.equals(lettersGuessedOld, lettersGuessedNew)) {
			wrong++;
			System.out.println("That letter is not in this word!");
=======
		//check each index if the letter guessed is in the goal word and replace blank
		for (int i = 0; i < goal.length; i++) {
			if (letterGuessed == goal[i]) {
				lettersGuessedNew[i] = letterGuessed; //array track accurate guesses
			}
		}
		
		//compare arrays to see if they got a guess wrong
		if (lettersGuessedOld.equals(lettersGuessedNew)) {
			wrong++; //track wrong
>>>>>>> Stashed changes
			System.out.println(lettersGuessedOld);
			wrong();
			}
		else { //got it right
			System.out.println(lettersGuessedNew);
			//reset arrays for future guesses
			for (int i = 0; i < goal.length; i++) {
				lettersGuessedOld[i] = lettersGuessedNew[i];
			}
		}
	}
	
	public void wordGuess(String word){
		String goalString = new String(goal);
		/*wordGuessed = new char[wordGuessedString.length()];
		for (int i = 0; i < wordGuessed.length; i++) {
			wordGuessed[i] = wordGuessedString.charAt(i);
		}*/
		if (word.equals(goalString)) {
			System.out.println("You guessed correctly!");
			win = true;
		}
		else {
			wrong++;
			System.out.println("You guessed wrong.");
			System.out.println(lettersGuessedOld);
			wrong();
		}
	}
	
	public void wrong() {
		if (wrong == 0) {
			System.out.println(" +---+\r\n"
					+ "  |   |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "=========");
		}
		else if (wrong == 1) {
			System.out.println("  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "=========");
		}
		else if (wrong == 2) {
			System.out.println("  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ "  |   |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "=========");
		}
		else if (wrong == 3) {
			System.out.println("  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ " /|   |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "=========");
		}
		else if (wrong == 4) {
			System.out.println("  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ " /|\\  |\r\n"
					+ "      |\r\n"
					+ "      |\r\n"
					+ "=========");
		}
		else if (wrong == 5) {
			System.out.println("  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ " /|\\  |\r\n"
					+ " /    |\r\n"
					+ "      |\r\n"
					+ "=========");
		}
		else {
			System.out.println("  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ " /|\\  |\r\n"
					+ " / \\  |\r\n"
					+ "      |\r\n"
					+ "=========");
			
			loss = true;
		}
		
}
}
