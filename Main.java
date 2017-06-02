import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoardPrinter g = new BoardPrinter();
		Game s = new Game();
		WinLose w = new WinLose();
		Scanner reader = new Scanner(System.in);
		
		char Player1Sym, Player2Sym; // stores the symbol of each player
		Player1Sym = '0';
		Player2Sym = 'O';

		String Player1, Player2;// stores the names of each player
		System.out.println("\033[31mEnter Player One's Name");
		Player1 = reader.nextLine();
		System.out.println("\033[33mEnter Player Two's Name");
		Player2 = reader.nextLine();

		int x = 0;// dummy variable used for checking for tie

		g.CreateBoard();// creates board
		g.PrintBoard();// prints board

		for (int count = 0; count < 43; count++) {// runs through all possible
													// turns unless there is a
													// winner
			s.Player1();
			for (int z=5000; z>1; z--)System.out.print("\b"); //clears screen
			s.sendboard();
			if (w.checkwinner(Player1Sym) == true) {// checks for winner
				System.out.print("\033[31m");
				System.out.println(Player1 + " wins!");
				x = 1;
				break;// breaks loop if there is a winner
			}

			s.Player2();
			for (int z=5000; z>1; z--)System.out.print("\b"); //clears screen
			s.sendboard();
			if (w.checkwinner(Player2Sym) == true) {// checks for winner
				System.out.print("\033[33m");
				System.out.println(Player2 + " wins!");
				x = 1;
				break; // breaks loop if there is a winner
			}
		}
		if (x == 0)
			System.out.println("It is a tie!");
	}
}