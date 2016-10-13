package array6;

public class ArraysMain {

	public static void main(String[] args) {
		String[] someStrings = new String[100];
		populateArray(someStrings);
		printArray(someStrings);
		changeString(someStrings[99]);
		printArray(someStrings);
		long startTime = System.currentTimeMillis();
		arrayIntroMethod();
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " + (endTime - startTime));
		
	}
	
	private static void printArray(String[] str) {
		for(String s: str){
			System.out.println(s);
		}
		
	}

	private static void populateArray(String[] str) {
		for(int index = 0; index < str.length;index++){
			str[index] = "value " + (index+1);
		}
		
	}
	
	private static void changeString(String s){
		s = "This string has changed!";
	}

	public static void arrayIntroMethod(){
//		int[] zeros1 = {0,0,0};
//		int[] zeros2 = new int[3];
		boolean[] booleans = new boolean[3];
		// iterate two ways.
		// you use this for loop when the index of data is important to reference.
		// you need to customize how you iterate.
		// (increase by 2, backwards, etc...)
		for(int i = 0; i < booleans.length; i++){
			System.out.println(i + ") " + booleans[i]);
		}
		
		//second method: for each
		//always goes in order, does not keep track of index
		//easier to type;
		
		for(boolean b: booleans){
			System.out.println("" + b);
		}
		
		//String[] strings = {"","",""};
		String[] strings2 = new String[3];
		
		for(int index = 0; index < strings2.length;index++){
			strings2[index] = "value " + (index+1);
		}
		for(String s: strings2){
			System.out.println("" + s);
		}
	}
	
	

}
