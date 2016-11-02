package caveExplorer;

import java.util.Arrays;

public class TwoDArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr = {0,1,2,3,4,5,6,7};
		//System.out.println(Arrays.toString(arr));
		
		// rows, columns -> (y,x)
		String[][] pic = new String[10][12];
		
//		//iterate row by row
//		for(int row = 0; row < arr2D.length; ++row){
//			for(int col = 0; col < arr2D[row].length; ++col){
//				arr2D[row][col] = "(" + row + "," + col + ")";
//			}
//		}
//		// print each row
//		for(String[] row: arr2D){
//			System.out.println(Arrays.toString(row));
//		}
		for(int row = 0; row < pic.length; ++row){
			for(int col = 0; col < pic[row].length; ++col){
				pic[row][col] = " ";
			}
		}
		pic[1][2] = "O";
		pic[0][2] = "|";
		pic[2][2] = "|";
		pic[1][1] = "-";
		pic[1][3] = "-";
		pic[0][1] = "\\";
		pic[2][3] = "\\";
		pic[0][3] = "/";
		pic[2][1] = "/";
		
		for(int row = 7; row < pic.length; ++row){
			for(int col = 0; col < pic[row].length; ++col){
				pic[row][col] = "M";
			}
		}
		
		printPic(pic);
	}

	public static void printPic(String[][] arr){
		for(String[] strArr: arr){
			for(String str: strArr){
				System.out.print(str);
			}
			System.out.println();
		}
	}
	public static void setArray(String[][] arr){
		for(int row = 0; row < arr.length; ++row){
			for(int col = 0; col < arr[col].length; ++col){
				arr[row][col] = ".";
			}
		}
	}


}

