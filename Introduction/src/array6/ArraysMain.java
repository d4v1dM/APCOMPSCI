package array6;

public class ArraysMain {

	public static void main(String[] args) {
		
		// construct 2 integer arrays
		// these two methods do the same thing.
		//primitive type arrays fill with ZEROS.
		int[] zeros1 = {0,0,0};
		int[] zeros2 = new int[3];
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
		
		String[] strings = {"","",""};
		String[] strings2 = new String[3];
	}

}
