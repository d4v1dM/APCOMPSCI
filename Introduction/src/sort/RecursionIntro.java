package sort;

public class RecursionIntro {

	public static void main(String[] args){
		// with a regular for loop
		System.out.println("Using a for loop...");
		for(int i = 0; i < 5; ++i){
			System.out.println("Hello everyone!");
		}
		System.out.println("Using recursion...");
		int numberOfTimes = 5;
		forLoop(numberOfTimes, new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				System.out.println("Hello everyone!");
			}
		});
	}
	public static void hanoi(int numberOfTimes, String from, String mid, String to){
	
	}

	private static void forLoop(int numberOfTimes, Action action) {
		// TODO Auto-generated method stub
		if(numberOfTimes < 2){
			action.act();
		}
		else{
			action.act();
			forLoop(numberOfTimes - 1, action);
		}
	}
}
