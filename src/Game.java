import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Game {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner keyboard = new Scanner(System.in);
		Word word = new Word();
		String go = "yes";
		String input;
		int strikes = 0;
		char[] goal;
		
		do{
			System.out.print("Choose a difficulty: easy, medium, or hard: ");
		 	input = keyboard.next();
			
			if(input.equalsIgnoreCase("easy")){				
				word.load("easy.txt");
				word.chooseWord();	
				goal = word.generateGoal();
				System.out.print(goal);
				System.out.println();
			}
			else if(input.equalsIgnoreCase("medium")){				
				word.load("medium.txt");
				word.chooseWord();	
				goal = word.generateGoal();
				System.out.print(goal);
				System.out.println();
			}
			else if(input.equalsIgnoreCase("hard")){				
				word.load("hard.txt");
				word.chooseWord();	
				goal = word.generateGoal();
				System.out.print(goal);
				System.out.println();
			}
			else {
				System.out.println("That's not a valid input!");
			}
			
			System.out.print("Play again? Enter 'yes' to play again: ");
			go = keyboard.next();
			
		}while(go.equalsIgnoreCase("yes"));
		
		keyboard.close();
		System.exit(0);

	}

}
