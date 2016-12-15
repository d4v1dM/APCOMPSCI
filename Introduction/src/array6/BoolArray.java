package array6;

public class BoolArray {
	private static boolean[][] grid;

	public static void main(String[] args){
		grid = new boolean[5][5];
		printArr(grid);
		buttonClicked(3,3);
	}
	public static void switchRow(boolean[] row, int x){
		
	}
	public static void switchColumn(boolean[][] grid, int r, int c){
		
	}
	public static void buttonClicked(int r, int c) {
		// TODO Auto-generated method stub
		if(r >= 0 && r < grid.length){
			switchRow(grid[r], c);
		}
		switchColumn(grid, r, c);
		// check if any lights are on.
		boolean win = true;
		for(int i = 0; i < grid.length; ++i){
			for(int j = 0; j < grid[i].length; ++j){
				if(grid[i][j]){
					win = false;
					break;
				}
			}
		}
		if(win) System.out.println("You have won.");
	}
	public static void printArr(boolean[][] arr){
		for(boolean[] a: arr){
			for(boolean itm: a){
				if(itm) System.out.print("O");
				else System.out.print("X");
			}
			System.out.println("");
		}
		System.out.println("-----");
	}
}