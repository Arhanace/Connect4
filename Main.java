import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardPrinter g = new BoardPrinter();
		Game s = new Game();
		WinLose w = new WinLose();
		Scanner reader = new Scanner(System.in);
		
		String Player1, Player2;
		System.out.println("Enter Player One's Name");
		Player1 = reader.nextLine();
		System.out.println("Enter Player Two's Name");
		Player2 = reader.nextLine();
		
		g.CreateBoard();
		g.PrintBoard();
	
		for (int count =0; count <43; count ++){
			s.Player1();
			s.sendboard();
			if (w.Winner() == true){
				System.out.println(Player1 + " wins");
				break;
			}
			
			s.Player2();
			s.sendboard();
			if (w.Winner() == true){
				System.out.println(Player2 + " wins");
				break;
			}
			
		}
	}

}