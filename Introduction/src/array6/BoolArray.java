package array6;

public class BoolArray {

	public static void main(String[] args){
		boolean[] arr = {true, false, true, true, false};
		printArr(arr);
	}
	public static void printArr(boolean[] arr){
		for(boolean a: arr){
			if(a) System.out.println("O");
			else System.out.println("X");
		}
	}
}
