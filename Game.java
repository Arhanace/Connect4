import java.util.*;

	public class Game {
		public boolean[][] array = new boolean[7][6]; // array of type boolean: Red
											// Disks are true, yellow
														// are false
		public boolean Red, Yellow;
		public int player1drop; // column chosen by player1
		public int player2drop; // column chosen by player2
		int x, y; // dummy variable used to loop or not loop do loop
		Scanner reader = new Scanner(System.in); // Creates scanner so player's
													// column can be read in
		BoardPrinter b = new BoardPrinter();

		public Game() {
			Red = true; // disks of player 1 are true/red
			Yellow = false; // disks of player 2 are false/yellow
		}

		public void Player1(){
			do {
				System.out.println("Pick a column to drop a disk");
				player1drop = reader.nextInt(); //Player1 picks a column
				
					if(player1drop>7 || player1drop<1){ //Makes sure that column chosen is between 1 and 7
						x=-1;
						System.out.println("Invalid Entry");
					}
			
					else if (array[player1drop][0] !=  || array[player1drop][1] != null || array[player1drop][2] != null || array[player1drop][3] != null || array[player1drop][4] != null || array[player1drop][5] != null){ //checks to see if the column are filled
					x=-1;
					System.out.println("Column is full");
					}
					
					else {
					x=0;//sets dummy variable to 0 so that loop can end
					}
			
				} while (x!=-1);
			
			for (int counter =6; counter<0; counter--){
				if (array[player1drop][counter] != true && array[player1drop][counter] != false){ 
					array[player1drop][counter] = true; //places a disk in the lowest possible spot in the chosen column
					break;
				}
			}
		
		}

		public void Player2(){
			do {
				System.out.println("Pick a column to drop a disk");
				player2drop = reader.nextInt(); //Player2 picks a column
				
					if(player2drop>7 || player2drop<1){ //Makes sure that column chosen is between 1 and 7
						y=-1;
						System.out.println("Invalid Entry");
					}
			
					else if (array[player2drop][0] != null || array[player2drop][1] != null || array[player2drop][2] != null || array[player2drop][3] != null || array[player2drop][4] != null || array[player2drop][5] != null){ //checks to see if the column is filled
						y=-1;
						System.out.println("Column is full");
					}
					
					else 
						y=0;
						
				} while (y!=-1);
			
		}
		public void sendboard(){
			b.Reprint(array);
		}
	}
