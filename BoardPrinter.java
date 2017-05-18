import java.util.*;


public class BoardPrinter {

	public static char board[][] = new char[7][6]; // creates an array of characters
	public int width, height;
	public int Red, Yellow;

	public BoardPrinter() {
		width = 7;
		height = 6;
		Red = 0; // red disk represented by a 0
		Yellow = 1; // yellow disk represented by a 1
	}

	public void CreateBoard() {// initializes board by setting each value as a *

		for (int count = 0; count < width; count++) {
			for (int count2 = 0; count2 < height; count2++) {
				board[count][count2] = '*';

			}
		}
	}

	public void PrintBoard() {// prints out board for the first time
		// prints the board
		for (int h = 0; h < height; h++) {
			for (int w = 0; w < width; w++) {
				System.out.print(board[w][h] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void Reprint(int[][] array) {// reprints the board after each turn

		for (int count = 0; count < 7; count++) {// changes * to either X or O
													// based on player selection

			for (int count2 = 0; count2 < 6; count2++) {// checks for yellows
														// then changes * to 0
				if (array[count][count2] == Red) {
					board[count][count2] = '0';
				} else if (array[count][count2] == Yellow) {// checks for
															// yellows then
															// changes * to 1
					board[count][count2] = 'O';
				} else
					board[count][count2] = '*';
			}
		}
		for (int h = 0; h < height; h++) {// prints out board with revised grid
			for (int w = 0; w < width; w++) {
				if (board[w][h]=='0'){
					System.out.print("\033[31m");
					System.out.print(board[w][h] + "\t");
				}
				else if (board[w][h]=='O'){
					System.out.print("\033[33m");
					System.out.print(board[w][h] + "\t");
				}
				else{
					System.out.print("\033[0m");
					System.out.print(board[w][h] + "\t");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
