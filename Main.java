
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardPrinter g = new BoardPrinter();
		Game s = new Game();
		WinLose w = new WinLose();
		Scanner reader = new Scanner(System.in);

		String Player1, Player2;// stores the names of each player
		System.out.println("Enter Player One's Name");
		Player1 = reader.nextLine();
		System.out.println("Enter Player Two's Name");
		Player2 = reader.nextLine();

		int x = 0;// dummy variable used for checking for tie

		g.CreateBoard();// creates board
		g.PrintBoard();// prints board

		for (int count = 0; count < 43; count++) {// runs through all possible
													// turns unless there is a
													// winner
			s.Player1();
			s.sendboard();
			if (w.checkwinnerPlayer1() == true) {// checks for winner
				System.out.println(Player1 + " wins");
				x = 1;
				break;// breaks loop if there is a winner
			}

			s.Player2();
			s.sendboard();
			if (w.checkwinnerPlayer2() == true) {// checks for winner
				System.out.println(Player2 + " wins");
				x = 1;
				break; // breaks loop if there is a winner
			}
		}
		if (x == 0)
			System.out.println("It is a tie");
	}
}