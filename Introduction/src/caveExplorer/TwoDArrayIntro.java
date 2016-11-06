package caveExplorer;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayIntro {
	public static String[][] arr2D;
	public static String[][] pic;
	public static int i;
	public static int j;
	public static Scanner in;

	public static void main(String[] args) {
//		boolean[][] mines = new boolean[6][6];
//		createMines(mines,10);
//		String[][] field = new String[mines.length][mines[0].length];
//		matchValues(field,mines);
//		printPic(field);
		
//		arr2D = new String[5][4];
//		pic = new String[5][4];
//		intro(arr2D);
//		
//		i = 2;
//		j = 3;
//		in = new Scanner(System.in);
//		startExploring();
		createGrid(5,5);
	}
	private static void createGrid(int row, int col) {
		row *= 3; // we'll need more space for the '|' in the rows.
		col *= 2; // we'll need more space for the '___' in the columns.
		System.out.print(" "); // make space for '|' in the next line so it looks neat!
		int y = 0, x = 0; // since i'm using two loops and they'll be using the same variable -> lets extend their scope.
		for(; y < 1; ++y){ // lets create the header first, or the first row.
			for(; x < col; ++x){ // traverse through the columns.
				if(x % 2 != 0) System.out.print("___ "); // in every other column, we'll add the top/bottom border.
			}
			System.out.println(""); // row is finished -> goto next line.
		}
		for(; y <= row; ++y){ // this is the real loop for the body -> traverse through the rows.
			for(x = 0; x <= col; ++x){ // traverse through the columns.
				if(y % 3 == 0){ // for every 3rd row:
					if(x % 2 != 0) System.out.print("___"); // if it's an odd column -> we'll add the top/bottom border.
					else System.out.print("|"); // if it's an even column -> we'll add the left/right border.
				}
				else if(x % 2 == 0) System.out.print("|   "); // for every other row && the column is even -> add the left/right border.
			}
			System.out.println(""); // row is finished -> goto next line.
		}
		
	}
	public static void startExploring(){
		while(true){
			showX(pic,i,j);
			System.out.println("You are in room " + arr2D[i][j]);
			System.out.println("What do you want to do?");
			
			String input = in.nextLine();
			while(!isValid(input)){
				System.out.println("Please enter " + "w, a, s, or d.");
				input = in.nextLine();
			}
			interpretInput(input);
		}
	}

	private static void interpretInput(String input) {
		// TODO Auto-generated method stub
		if(input.equals("w") && i > 0) --i;
		else if(input.equals("a") && j > 0) --j;
		else if(input.equals("s") && i < arr2D.length - 1) ++i;
		else if(input.equals("d") && j < arr2D[i].length - 1) ++j;
		
	}
	private static boolean isValid(String input) {
		// TODO Auto-generated method stub
		String lc = input.toLowerCase();
		String[] keys = {"w","a","s","d"};
		for(String key:keys){
			if(key.equals(lc)) return true;
		}
		return false;
	}
	private static void matchValues(String[][] field, boolean[][] mines) {
		// TODO Auto-generated method stub
		for(int row = 0; row < field.length; ++row){
			for(int col = 0; col < field[row].length; ++col){
				if(mines[row][col]) field[row][col] = "X";
				else{
					field[row][col] = countAdajcent(mines,row, col);
				}
			}
		}
		
	}

	private static String countAdajcent(boolean[][] mines, int r, int c) {
		// TODO Auto-generated method stub
//		for(int row = r - 1; row <= (r + 1); ++row){
//			for(int col =  c - 1; col <= (c + 1); ++col){
//				if(row != r && col != c){
//					if(row >= 0 && row < mines.length && col >= mines[row].length){
//						
//					}
//				}
//			}
//		}
		
		// this method only checks elements in the [][]
		// so it is not necessary to verify they are valid.
		int count = 0;
		
//		for(int row = 0; row < mines.length; ++row){
//			for(int col = 0; col < mines[row].length; ++col){
//				if(Math.abs(row - r) + Math.abs(col - c) == 1 && mines[row][col]){
//					++count;
//				}
//			}
//		}
		
		
		return null;
	}

	private static void createMines(boolean[][] mines, int numberOfMines) {
		// TODO Auto-generated method stub
		while(numberOfMines > 0){
			int row = (int) (Math.random() * mines.length);
			int col = (int) (Math.random() * mines[0].length);
			
			if(!mines[row][col]){
				mines[row][col] = true;
				--numberOfMines;
			}
		}
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
	public static void picDrawing(){
		// TODO Auto-generated method stub

				//int[] arr = {0,1,2,3,4,5,6,7};
				//System.out.println(Arrays.toString(arr));
				
				// rows, columns -> (y,x)
				String[][] pic = new String[10][12];
				
//				//iterate row by row
//				for(int row = 0; row < arr2D.length; ++row){
//					for(int col = 0; col < arr2D[row].length; ++col){
//						arr2D[row][col] = "(" + row + "," + col + ")";
//					}
//				}
//				// print each row
//				for(String[] row: arr2D){
//					System.out.println(Arrays.toString(row));
//				}
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
				
				pic[4][3] = "_";
				pic[4][4] = "_";
				pic[4][5] = "_";
				pic[4][6] = "_";
				pic[5][3] = "|";
				pic[6][3] = "|";
				pic[5][6] = "|";
				pic[6][6] = "|";
				
				pic[4][1] = "|";
				pic[5][1] = "|";
				pic[6][1] = "|";
				pic[7][1] = "|";
				pic[8][1] = "|";
				
				pic[4][8] = "|";
				pic[5][8] = "|";
				pic[6][8] = "|";
				pic[7][8] = "|";
				pic[8][8] = "|";
				
				pic[3][2] = "_";
				pic[3][3] = "_";
				pic[3][4] = "_";
				pic[3][5] = "_";
				pic[3][6] = "_";
				pic[3][7] = "_";
				pic[6][4] = "+";

				
				for(int row = 7; row < pic.length; ++row){
					for(int col = 0; col < pic[row].length; ++col){
						pic[row][col] = "M";
					}
				}
				
				for(int col = 1; col < pic[0].length - 1; ++col){
					pic[0][col] = "_";
					pic[pic.length - 1][col] = "_";
				}
				
				for(int row = 1; row < pic.length; ++row){
					pic[row][0] = "|";
					pic[row][pic[0].length - 1] = "|";
				}
				
				printPic(pic);
	}
	public static void intro(String[][] args){
		for(int row = 0; row < args.length; ++row){
			for(int col = 0; col < args[row].length; ++col){
				args[row][col] = "(" + row + ", " + col + ")"; 
			}
		}
	}
	public static void showX(String[][] pic, int row, int col){
		for(int y = 0; y < pic.length; ++y){
			for(int x = 0; x < pic[y].length; ++x){
				pic[y][x] = " ";
			}
		}
		pic[row][col] = "X";
		printPic(pic);
	}


}
