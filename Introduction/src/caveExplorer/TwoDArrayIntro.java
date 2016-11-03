package caveExplorer;

import java.util.Arrays;

public class TwoDArrayIntro {

	public static void main(String[] args) {
		boolean[][] mines = new boolean[6][6];
		createMines(mines,10);
		String[][] field = new String[mines.length][mines[0].length];
		matchValues(field,mines);
		printPic(field);
		
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
		for(int row = r - 1; row <= (r + 1); ++row){
			for(int col =  c - 1; col <= (c + 1); ++col){
				if(row != r && col != c){
					if(row >= 0 && row < mines.length && col >=)
				}
			}
		}
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


}

