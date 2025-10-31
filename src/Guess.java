
public class Guess {

	private char[] goal;
	private char letterGuessed = ' ';
	private char[] lettersGuessedOld;
	private char[] lettersGuessedNew;
	private String[] hangedMan;
	int wrong = 0;

	
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
		for (int i = 0; i < goal.length; i++) {
			if (letterGuessed == goal[i]) {
				lettersGuessedNew[i] = letterGuessed;
			}
		}
		if (lettersGuessedOld.equals(lettersGuessedNew)) {
			wrong++;
			System.out.println(lettersGuessedOld);
			}
		else {
			System.out.println(lettersGuessedNew);
			for (int i = 0; i <= goal.length; i++) {
				lettersGuessedOld[i] = lettersGuessedNew[i];
		}
		}
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
		}
		
}
}
