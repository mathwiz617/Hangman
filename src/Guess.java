import java.util.Arrays;

public class Guess {
	//initialize variables used in guessing process
	private char[] goal;
	private char letterGuessed = ' ';
	private String wordGuessedString = "";
	private char[] lettersGuessedOld;
	private char[] lettersGuessedNew;
	private int wrong = 0; //how many wrong guesses from user
	private boolean win = false;
	private boolean loss = false;

	//noargs constructor
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
	
	//constructor for guessing word
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
	//setter, should never be used, but here just in case
	public void setLettersGuessedOld(char[] lettersGuessedOld) {
		this.lettersGuessedOld = lettersGuessedOld;
	}
	//get new progress for letters guessed
	public char[] getLettersGuessedNew() {
		return lettersGuessedNew;
	}
	//setter, should never be used, but here just in case
	public void setLettersGuessedNew(char[] lettersGuessedNew) {
		this.lettersGuessedNew = lettersGuessedNew;
	}
	
	//getter, should never be used, but here just in case
	public int getWrong() {
		return wrong;
	}
	
	//win condition check
	public boolean isWin() {
		return win;
	}

	//setter, should never be used, but here just in case
	public void setWin(boolean win) {
		this.win = win;
	}

	//loss condition check
	public boolean isLoss() {
		return loss;
	}

	//setter, should never be used, but here just in case
	public void setLoss(boolean loss) {
		this.loss = loss;
	}
	
	//method to start game
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
			
	public void letterGuess(char a) {
		//check array for accurate guesses and place them in guessed array
		for (int i = 0; i < goal.length; i++) {
			if (a == goal[i]) {
				lettersGuessedNew[i] = a;
			}
		}
		//check if the new updated array has a correct guess that the old doesn't
		if (Arrays.equals(lettersGuessedOld, lettersGuessedNew)) {
			wrong++; //add to wrong guess
			System.out.println("That letter is not in this word!");
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

	//method for guessing a word
	public void wordGuess(String word){
		String goalString = new String(goal); //create array for guessed word
		
		if (word.equals(goalString)) { //check for guessed word and win
			System.out.println("You guessed correctly!");
			win = true;
		}
		else { //wrong word, add to wrong guesses
			wrong++;
			System.out.println("You guessed wrong.");
			System.out.println(lettersGuessedOld);
			wrong();
		}
	}
	
	public void wrong() { //wrong method for wrong answers
		//track wrongs and display progress
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
		//loss
		else {
			System.out.println("  +---+\r\n"
					+ "  |   |\r\n"
					+ "  O   |\r\n"
					+ " /|\\  |\r\n"
					+ " / \\  |\r\n"
					+ "      |\r\n"
					+ "=========");
			System.out.println("You lose...");
			
			loss = true;
		}
		
}
}
