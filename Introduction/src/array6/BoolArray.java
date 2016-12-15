package array6;

public class BoolArray {

	public static void main(String[] args){
		boolean[][] arr;
		arr = new boolean[5][5];
		printArr(arr);
	}
	public static void printArray(boolean[] arr){
		
	}
	public static void printArr(boolean[][] arr){
		for(boolean[] a: arr){
			for(boolean itm: a){
				if(itm) System.out.print("O");
				else System.out.print("X");
			}
			System.out.println("");
		}
	}
}
