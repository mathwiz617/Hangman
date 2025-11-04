import java.util.Arrays;

public class Guess {

	private char[] goal;
	private char letterGuessed = ' ';
	private String wordGuessedString = "";
	private char[] lettersGuessedOld;
	private char[] lettersGuessedNew;
	private int wrong = 0;
	private boolean win = false;
	private boolean loss = false;

	
	public Guess(char[] word) {
		goal = word;
	}
	
	public Guess(char letter) {
		letterGuessed = letter;
	}
	
	public char getLetterGuessed() {
		return letterGuessed;
	}

	public void setLetterGuessed(char letterGuessed) {
		this.letterGuessed = letterGuessed;
	}
	public Guess(String word) {
		wordGuessedString = word;
	}
	
	public String getWordGuessed() {
		return wordGuessedString;
	}

	public void setWordGuessed(String wordGuessedString) {
		this.wordGuessedString = wordGuessedString;
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

	public void start() {
		lettersGuessedOld = new char[goal.length];
		lettersGuessedNew = new char[goal.length];
		
		for (int i = 0; i < goal.length; i++) {
			lettersGuessedOld[i] = '_';
			lettersGuessedNew[i] = '_';
		}
	}
			
	public void letterGuess(char a) {
		for (int i = 0; i < goal.length; i++) {
			if (a == goal[i]) {
				lettersGuessedNew[i] = a;
			}
		}
		if (Arrays.equals(lettersGuessedOld, lettersGuessedNew)) {
			wrong++;
			System.out.println("That letter is not in this word!");
			System.out.println(lettersGuessedOld);
			wrong();
			}
		else {
			System.out.println(lettersGuessedNew);
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
