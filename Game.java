import java.util.*;

	public class Game {
		public int[][] array = new int[7][6]; // array of type boolean: Red
		int Red, Yellow; //represent each disk
		
		public int player1drop; // column chosen by player1
		public int player2drop; // column chosen by player2
		int x, y; // dummy variable used to loop or not loop do loop
		
		Scanner reader = new Scanner(System.in); // Creates scanner so player's column can be read in											
		BoardPrinter b = new BoardPrinter();

		public Game() {
			Red = 0; //red disk represented by a 0
			Yellow = 1; //yellow disk represented by a 1
			
			for (int count = 0; count < 7; count++) {
				for (int count2 = 0; count2 < 6; count2++) {
					array[count][count2] = 2; //no disk represented by a 2
					
				}
			}
		}

		public void Player1(){
			do {
				System.out.println("Player 1 Pick a column to drop a disk");
				player1drop = reader.nextInt(); //Player1 picks a column
				
					if(player1drop>7 || player1drop<1){ //Makes sure that column chosen is between 1 and 7
						x=0;
						System.out.println("Invalid Entry");
					}
					else if ((array[player1drop-1][0] == Red || array[player1drop-1][0] == Yellow) && 
							(array[player1drop-1][1] == Red || array[player1drop-1][1] == Yellow) && 
							(array[player1drop-1][2] == Red || array[player1drop-1][2] == Yellow) &&
							(array[player1drop-1][3] == Red || array[player1drop-1][3] == Yellow) &&
							(array[player1drop-1][4] == Red || array[player1drop-1][4] == Yellow) &&
							(array[player1drop-1][5] == Red || array[player1drop-1][5] == Yellow) 
							){ //checks to see if the column are filled
					x=0;
					System.out.println("Column is full");
					}
					
					else {
					x=-1;//sets dummy variable to 0 so that loop can end
					}
			
				} while (x!=-1);
			
			for (int counter =5; counter>=0; counter--){
				if (array[player1drop-1][counter] != Red && array[player1drop-1][counter] != Yellow){ 
					array[player1drop-1][counter] = Red; //places a disk in the lowest possible spot in the chosen column
					break;
				}
			}
		
		}

		public void Player2() {
			do {
				System.out.println("Player 2 Pick a column to drop a disk");
				player2drop = reader.nextInt(); // Player2 picks a column

				if (player2drop > 7 || player2drop < 1) { // Makes sure that column
															// chosen is between 1
															// and 7
					y = 0;
					System.out.println("Invalid Entry");
				}

				else if ((array[player1drop-1][0] == Red || array[player1drop-1][0] == Yellow) && 
						(array[player1drop-1][1] == Red || array[player1drop-1][1] == Yellow) && 
						(array[player1drop-1][2] == Red || array[player1drop-1][2] == Yellow) &&
						(array[player1drop-1][3] == Red || array[player1drop-1][3] == Yellow) &&
						(array[player1drop-1][4] == Red || array[player1drop-1][4] == Yellow) &&
						(array[player1drop-1][5] == Red || array[player1drop-1][5] == Yellow) 
						){ //checks to see if the column are filled
											
					y = 0;
					System.out.println("Column is full");
				}

				else
					y = -1;

			} while (y != -1);
			
			for (int counter =5; counter>=0; counter--){
				if (array[player2drop-1][counter] != Red && array[player2drop-1][counter] != Yellow){ 
					array[player2drop-1][counter] = Yellow; //places a disk in the lowest possible spot in the chosen column
					break;
				}
			}

		}

		public void sendboard() {//sends array to reprint method
			b.Reprint(array);
		}
	}
