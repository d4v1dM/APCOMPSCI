package stringExercise;

import java.util.Scanner;

public class StringPractice {

	static Scanner input;
	static String user;
	static int lineCount;
	public static void main(String[] args){
		createAScanner();
		lineCount = 0;
		//demonstrateStringMethods();
		promptName();
		promptInput();
		//talkForever();
	}
	
	private static void promptName() {
		// TODO Auto-generated method stub
		print("Hello, human! I am a board coverd with semi-conductors and other such electronic components. What is your name?");
		user = input.nextLine();
		print("I will call you " + user  + " until you terminate me.");
		
	}
	


	public static void print(String args){
		lineCount++;
		System.out.println("Line #" + lineCount + ": " + args);
	}
	
	public static void talkForever(){
		while(true){
			promptInput();
			
		}
	}

	public static void promptInput() {
		// TODO Auto-generated method stub
		print(user + " ,try inputing a String");
		String userInput = input.nextLine();
		System.out.println("You typed " + userInput);
	}

	public static void createAScanner() {
		input = new Scanner(System.in);
	}
	public static void demonstrateStringMethods(){
		// create text to compare. Compare the first with the second concat with third.
		String text = "Hello World";
		String text2 = "Hello ";
		String text3 = "World";
		
		// == versus .equals, very vital when comparing strings
		if(text.equals(text2 + text3)){
			System.out.println("Strings are equal");
		}
		System.out.println(text);
		System.out.println(text2 + text3);
		
		String word1 = "Aarvark";
		String word2 = "Zyzzyva";
		
		if(word1.compareTo(word2) < 0){
			System.out.println("Word1 is before word2, lexicongraphically");
		}
	}

}
