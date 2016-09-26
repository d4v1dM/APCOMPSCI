package chatBot;

import java.util.Scanner;

public class David {

	static Scanner input;
	static String user;
	static boolean inLoop;
	static String response;
	static Topic school;
	
	static int lineCount;
	public static void main(String[] args){
		createTopics();
		lineCount = 0;
		//demonstrateStringMethods();
		promptName();
		//promptInput();
		talkForever();
	}
	
	private static void promptName() {
		// TODO Auto-generated method stub
		cleanPrint("Hello, human! I am a board coverd with semi-conductors and other such electronic components. What is your name?");
		user = input.nextLine();
		cleanPrint("I will call you " + user  + " until you terminate me.");
		
	}
	
	public static String getInput(){
		return input.nextLine();
	}

	public static void print(String args){
		lineCount++;
		System.out.println("Line #" + lineCount + ": " + args);
	}
	
	public static void cleanPrint(String args){
		// create multi-line String
		String printString = "";
		int cutOff = 35;
		// check if there are words to add.
		// is the len of args is > 0;
		
		while(args.length() > 0){
			String currentLine = "";
			String nextWord = "";
			// while the currentLine and the next word are less then cutoff do the following loop.
			// first thing, add the next word.
			while(currentLine.length() + nextWord.length() <= cutOff && args.length() > 0){
				currentLine += nextWord;
				// then remove that word.
				args = args.substring(nextWord.length());
				// get the following word.
				int endOfWord = args.indexOf(" ");
				if(endOfWord == -1){
					endOfWord = args.length() - 1;
				}
				nextWord = args.substring(0,endOfWord + 1);
			}
			printString += currentLine + "\n";
			
		}
		
		System.out.println(printString);
		
	}
	
	public static void talkForever(){
		inLoop = true;
		while(inLoop){
			cleanPrint("Greetings, " + user + " , how are you?");
			response = getInput();
			if(findKeyword(response,"good",0)){
				cleanPrint("I'm so happy you are happy");
			}else if(response.indexOf("school") >= 0){
				inLoop = false;
				school.talk();
				}else{
			
				cleanPrint("I'm sorry I dont understand you.");
			}
			
		}
	}

	public static boolean findKeyword(String searchString, String key, int startIndex) {
		// TODO Auto-generated method stub
		
		// delete whitespace
		String phrase = searchString.trim();
		
		//set all letters to lower case
		phrase = phrase.toLowerCase();
		key = key.toLowerCase();
		
		// find position of key
		int psn = phrase.indexOf(key);
		
		// keep looking for the word until you find the correct context
		while(psn >= 0){
			
			String before = " ";
			String after = " ";
			
			// check to see if the phrase does not end with this word 
			if(psn + key.length() < phrase.length()){
				after = phrase.substring(psn + key.length(), psn + key.length() + 1);
				
				// if the phrase does not begin with this word
				if(psn > 0){
					before = phrase.substring(psn - 1,psn).toLowerCase();
				}
				
				if(before.compareTo("a") < 0 && after.compareTo("a") < 0){
					return true;
				}
				
				// in case the keyword was not found yet, check the rest of the string
				psn = phrase.indexOf(key,psn + 1);
			}
			return false;
		}
				
		return true;
	}

	public static void promptInput() {
		// TODO Auto-generated method stub
		print(user + " ,try inputing a String");
		String userInput = input.nextLine();
		System.out.println("You typed " + userInput);
	}

	public static void createTopics() {
		input = new Scanner(System.in);
		school = new School();
	}

}
