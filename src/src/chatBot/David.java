package chatBot;

import java.util.Scanner;

public class David {

	static Scanner input;
	static String user;
	static boolean inLoop;
	static String response;
	static Topic school;
	static Topic like;
	static Topic hello;
	static Topic college;
	//
	static int lineCount;
	public static void main(String[] args){
		createTopics();
		lineCount = 0;
		//demonstrateStringMethods();
		//promptName();
		//promptInput();
		//talkForever();
		
		college.talk();
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
			if(findKeyword(response,"good",0) >= 0){
				cleanPrint("I'm so happy you are happy");
			}
			else if(findKeyword(response,"school",0) >= 0){
				inLoop = false;
				school.talk();
				}
			else{
				cleanPrint("I'm sorry I dont understand you.");
			}
			
		}
	}

	public static int findKeyword(String searchString, String key, int startIndex) {
		// delete white space at the beginning and at the end
		String phrase = searchString.trim(); //trim is a method included in the string api
		//set all letters to lowercase; gets rid of case sensitive
		phrase = phrase.toLowerCase();
		key = key.toLowerCase();
		
//		System.out.println("The phrase is " + phrase);
//		System.out.println("The key is " + key);
		
		//find position of key
		int psn = phrase.indexOf(key);
		
//		System.out.println("The position found is " + psn);
		
		// keep looking for the word until you find the right context; isolated word
		while(psn >= 0){
			String before = " ";
			String after = " ";
			// if the phrase does not end with this word
			if(psn + key.length() < phrase.length()){
				after = phrase.substring(psn + key.length(), psn + key.length() + 1).toLowerCase();
//				System.out.println("The character after " + key+ " is " + after);
			}
			// if the phrase does not being with this word
			if(psn > 0){
				before = phrase.substring(psn - 1, psn).toLowerCase();
//				System.out.println("The character before " + key + " is " + before);
			}
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0){
//				System.out.println(key + " was found at " + psn);
				if(noNegations(phrase, psn)){
					return psn;
				}
			}
			//incase the keyword was not found yet, check the rest of the string
			psn = phrase.indexOf(key, psn +1); //takes position and add 1
//			System.out.println(key + " was not found. Checking " + psn);
		}
		return -1; // return if cant find any key words
	}

	private static boolean noNegations(String phrase, int index){
		// check for word "NO" (3 characters)
		// check to see if there is space for the word
		// "NO " to be in front of the index
		
		if(index - 3 >= 0 && phrase.substring(index - 3, index).equals("no ")){
			return false;
		}
		
		// check for "NOT"
		if(index - 4 >= 0 && phrase.substring(index - 4,index).equals("not ")){
			return false;
		}
		
		// check for "NEVER"
		if(index - 6 >= 0 && phrase.substring(index - 6,index).equals("never ")){
			return false;
		}
		
		// check for "n't "
		if(index - 4 >= 0 && phrase.substring(index - 4, index).equals("n't ")){
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
		like = new DavidsLike();
		hello = new DavidHello();//S
		college = new College();
	}

}
