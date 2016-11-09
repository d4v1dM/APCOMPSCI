package caveExplorer;

import java.util.Scanner;

public class ConnectFour {
	static Scanner input = new Scanner(System.in);
	static int columnInput;
	static boolean[][] connectFourBoard = new boolean[8][6];

	public static void main(String[] args) {
		while(true){
			placePiece();
		}
		
	}
	public static void getColumn(){
		System.out.println("Pick a column from 0 to " + (connectFourBoard[0].length));
		columnInput = Integer.parseInt(input.nextLine()) - 1;
	}
	
	public static void placePiece(){
		getColumn(); // get  input.
		for(int row = connectFourBoard.length - 1; row > 0; row--){
			for(int col = 0; col < connectFourBoard[row].length;col++){
				if(col == columnInput && connectFourBoard[row][col] == false){
					connectFourBoard[row][col] = true;
					row = 0; // break off other loop.
					break;
				}
			}
		}
		for(int row = 0; row < connectFourBoard.length; row++){
			for(int col = 0; col < connectFourBoard[row].length; col++){
				if(connectFourBoard[row][col]){
					System.out.print("O");
				}
				else System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("Your dropped a piece on column " + columnInput);
	}

	
}

