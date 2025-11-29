import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Word{
	//class fields
	private	ArrayList<String> wordList; 
	private String word;
	private	char[] goal;
	
	//noargs constructor
	public Word(){
		wordList = new ArrayList<>();
		word = "";
	}
	
	//getters and setters
	public char[] getGoal(){
		return goal;
	}
	
	public void setGoal(char[] letters){
		goal = letters;
		return;
	}
	
	public String getWord(){
		return word;
	}
	
	public void setWord(String string){
		word = string;
		return;
	}
	
	public ArrayList<String> buildList(){
		return wordList;
	}
	
	public void setList(ArrayList<String> list){
		wordList = list;
		return;
	}
	
	//this function loads the list of strings from the specified file
	public void load(String file) throws FileNotFoundException{
		String fileName = file;
		File loadFrom = new File(fileName);
		Scanner inputFile = new Scanner(loadFrom);
		
		while(inputFile.hasNext()){
			String nextWord = inputFile.nextLine();
			wordList.add(nextWord.trim());
		}
		//close input file
		inputFile.close();
		return;
	}
	
	//this function picks a word from the list
	public void chooseWord(){
		int size = wordList.size();
		int index;
		Random rand = new Random();
		index = rand.nextInt(size);
		word = wordList.get(index);
		return;
	}
	
	//this function generates the goal char array from the word picked
	public char[] generateGoal(){
		word = word.toLowerCase();
		goal = word.toCharArray();
		return goal;
	}
	
	//this is used to clear the word list after a word is picked
	public void clearList() {
		wordList.clear();
		return;
	}
}
