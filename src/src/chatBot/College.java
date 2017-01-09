package chatBot;

import java.util.Scanner;

public class College implements Topic {
	
	//private String favoriteCollege, worstCollege;
	private int[] SAT = new int[3];
	private int[] ACT;
	
	public College(){
		
	}
	@Override
	public void talk() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ask("Which College Test did you take? The SAT or ACT?");
		if(in.next().toLowerCase().equals("sat")){
			askSAT();
		}
		
		in.close();
	}

	@Override
	public boolean isTriggered(String userInput) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	public void ask(String question){
		System.out.println(question);
	}
	
	public void askSAT(){
		Scanner input = new Scanner(System.in);
		ask("What are your scores for the SAT?");
		//
		ask("For the Math section: ");
		this.SAT[0] = input.nextInt();
		ask("For the Reading section: ");
		this.SAT[1] = input.nextInt();
		ask("For Writing: ");
		this.SAT[2] = input.nextInt();
		
		input.close();
	}
	
	public void askACT(){
		Scanner input = new Scanner(System.in);
		ask("What are your scores for the ACT?");
		
		ask("For the Math section: ");
		this.ACT[0] = input.nextInt();
		ask("For the Reading section: ");
		this.ACT[1] = input.nextInt();
		ask("For English: ");
		this.ACT[2] = input.nextInt();
		ask("For Science: ");
		this.ACT[3] = input.nextInt();
		ask("Composite score: ");
		this.ACT[4] = input.nextInt();
		
		input.close();
	}

}
