package datatypes;

import java.util.Random;

public class MathRandom {

	public static void main(String[] args){
		int[] results = new int[6];
		for(int index = 0; index < 10; index++){
			System.out.println("Roll #" + (index + 1) + " Die is " + rollFairDie());
			
		}
		for(int i = 0; i < 6;i++){
			System.out.println( (i + 1) + " was rolled " + results[i] + " this many times " + results[i]);
		}
	}
	public static int rollFairDie(){
//		Random gen = new Random();
//		return gen.nextInt(6) + 1;
		
		double rand = Math.random();
		int roll = (int) (rand * 6); // [0,5] what above code does.
		return roll + 1;
	}
	public static int rollUnfairDie(){
		int rand = rollFairDie();
		if(rand % 2 == 0 && rand < 6){
			return rand + 1;
		}else{
			if(rand > 0){
				return rand -1;
			}
		}
		if(rand == 1){
			return 1;
		}
		return rand;
		
	}
        public static String getRandCard(){
                String[] suites = {"Hearts","Spades"};
                String[] vals = {"1","2","3"};
                return suites[0] + vals[0];
        }

}
