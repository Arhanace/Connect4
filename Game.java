import java.util.*;
public class Game {
	public boolean [][] array = new boolean [6][6]; //array of type boolean: Red Disks are true, yellow are false
	public boolean Red, Yellow;
	public int player1drop;
	public int player2drop;
	int x,y;
	
	public Game(){
		Red = true;
		Yellow = false;
	}
	
	public char[][]Player1{
		do {
			System.out.println("Pick a column to drop a disk");
			player1drop = reader.nextInt(); //Player1 picks a column
			
		if(player1drop>7 || player1drop<1){ //Makes sure that column chosen is between 1 and 7
			x=-1;
			System.out.println("Invalid Entry");
		}
		
		else if (array[player1drop][0] != null || array[player1drop][1] != null || array[player1drop][2] != null || array[player1drop][3] != null || 						 array[player1drop][4] != null || array[player1drop][5] != null){ //checks to see if the column is filled
			x=-1
			System.out.println("Column is full");
		}
		else 
			x=0;
		
		} while (x!=-1)
		for (boolean s : array[player1drop][]){
			if 
		}
		
	}
	
	public char[][]Player2{
		do {
			System.out.println("Pick a column to drop a disk");
			player2drop = reader.nextInt(); //Player2 picks a column
			
		if(player2drop>7 || player2drop<1){ //Makes sure that column chosen is between 1 and 7
			y=-1;
			System.out.println("Invalid Entry");
		}
		
		else if (array[player2drop][0] != null || array[player2drop][1] != null || array[player2drop][2] != null || array[player2drop][3] != null || 						 array[player2drop][4] != null || array[player2drop][5] != null){ //checks to see if the column is filled
			y=-1
			System.out.println("Column is full");
		}
		else 
			y=0;
		
		} while (y!=-1)
		
	}
	
}