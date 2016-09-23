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
		//talkForever();
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
			if(response.indexOf("good") >= 0){
				cleanPrint("I'm so happy you are happy");
			}else if(response.indexOf("school") >= 0){
				inLoop = false;
				school.talk();
				}else{
			
				cleanPrint("I'm sorry I dont understand you.");
			}
			
		}
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
