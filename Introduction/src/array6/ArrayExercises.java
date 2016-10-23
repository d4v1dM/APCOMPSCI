package array6;

public class ArrayExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t = popDiceArray(20);
		for(int i = 0; i < t.length;i++){
			System.out.println(t[i]);
		}
		System.out.println(isRandom(t));
		
	}
	public static int rollFairDie(){
//		Random gen = new Random();
//		return gen.nextInt(6) + 1;
		
		double rand = Math.random();
		int roll = (int) (rand * 6); // [0,5] what above code does.
		return roll + 1;
	}
	public static int[] popDiceArray(int n){
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = (rollFairDie() + rollFairDie());
		}
		return arr;
	}
	public static int[] populateArray(){
		int[] arr = new int[50];
		for(int i = 0; i < 50; i++){
			arr[i] = (i + 1);
		}
		return arr;
	}
	public static int[] popRandArray(int n){
		int[] randArr = new int[n];
		for(int i = 0; i < n;i++){
			randArr[i] = (int) (Math.random() * n);
		}
		return randArr;
	}
	public static boolean isRandom(int[] arr){
		double[] randValues = {0,(1/36),(2/36),(3/36),(4/36),(5/36),(6/36),(5/36),(4/36),(3/36),(2/36),(1/36)};
		int[] arrayCtr = new int[12];
		
		for(int i = 0; i < arr.length;i++){
			arrayCtr[(arr[i] - 1)]++;
		}
		for(int i = 0; i < randValues.length;i++){
			if(!((arrayCtr[i]/arr.length) == randValues[i])){
				return false;
			}
		}
		return true;
	}
	public static int[][] getStdCards(){
		int[][] deck = new int[52][2];
//		int[] suits = new int[4];
//		int[] nums = new int[]
//		for(int i =)
		return deck;
	}

}
