
public class Guess {

	private char[] goal;
	private char letterGuessed = ' ';
	private char[] lettersGuessedOld;
	private char[] lettersGuessedNew;

	
	public Guess(char[] word) {
		goal = word;
	}
	
	public char getLetterGuessed() {
		return letterGuessed;
	}

	public void setLetterGuessed(char letterGuessed) {
		this.letterGuessed = letterGuessed;
	}

	public char[] getLettersGuessedOld() {
		return lettersGuessedOld;
	}

	public void setLettersGuessedOld(char[] lettersGuessedOld) {
		this.lettersGuessedOld = lettersGuessedOld;
	}

	public char[] getLettersGuessedNew() {
		return lettersGuessedNew;
	}

	public void setLettersGuessedNew(char[] lettersGuessedNew) {
		this.lettersGuessedNew = lettersGuessedNew;
	}
	
	public void start() {
		lettersGuessedOld = new char[goal.length];
		lettersGuessedNew = new char[goal.length];
		
		for (int i = 0; i < goal.length; i++) {
			lettersGuessedOld[i] = '_';
			lettersGuessedNew[i] = '_';
		}
	}
	
	
}
