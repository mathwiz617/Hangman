import java.util.Scanner;
import java.io.*;

public class Game {

	public static void main(String[] args) throws FileNotFoundException{
		//declare variables, initialize those that need it
		Scanner keyboard = new Scanner(System.in);
		Word word = new Word();
		String go = "yes";
		String input = "y";
		Guess guess;
		boolean error = false;
		
		char[] goal;
		
		//main loop
		do{
			//pick difficulty loop
			while(input.equalsIgnoreCase("y")) {
				System.out.print("Choose a difficulty: easy, medium, or hard: ");
				input = keyboard.next();
			
				//load based on input
				switch(input) {
				case "easy":
					word.load("easy.txt");
					word.chooseWord();	
					break;
				case "medium":
					word.load("medium.txt");
					word.chooseWord();	
					break;
				case "hard":
					word.load("hard.txt");
					word.chooseWord();	
					break;
				default:
					//error message
					System.out.println("That's not a valid input!");
					error = true;
				 	break;
				}
				//if invalid input, skip game, ask for play again immediately
				if(error == true) continue;
				
				//once difficulty is picked, generate the goal
				goal = word.generateGoal();
				
				//un-comment the line below to print the goal word, for testing only
				//System.out.print(goal);
				
				System.out.println();
				
				//instantiate a Guess object
				guess = new Guess(goal);
				
				//start the game
				guess.start();
				
				//gameplay loop
				do {
					System.out.println("Enter your guess, or ! to guess the word: ");
					char letter = keyboard.next().charAt(0);
					keyboard.nextLine();
					//enter ! to guess the word entirely
					if (letter == '!') {
						System.out.print("Enter your guess: ");
						String wordGuessed = keyboard.nextLine();
						guess.wordGuess(wordGuessed);
					}
					else {
						guess.letterGuess(letter);
					}
					//loop as long as the game is not won or lost
				}while(!guess.isLoss() && !guess.isWin());
			}
			
			//clear word list before running loop again
			word.clearList();

			//reset sentinel value
			input = "y";
			
			//reset error value
			error = false;
			
			//reset game option
			System.out.print("Play again? Enter 'yes' to play again: ");
			go = keyboard.next();
			
		}while(go.equalsIgnoreCase("yes"));
		
		//close scanner, exit program
		keyboard.close();
		System.exit(0);

	}

}
