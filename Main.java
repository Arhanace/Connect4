import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardPrinter g = new BoardPrinter();
		Game s = new Game();
		WinLose w = new WinLose();
		g.CreateBoard();
		g.PrintBoard();
	
		for (int count =0; count <100000; count ++){
		s.Player1();
		if (w.Winner?() = true){
		w.PrintWinner();
		break;
		break;
		}
		s.Player2();
		if (w.Winner() = true){
			w.PrintWinner();
			break;
			break;
			}
		g.Reprint();
		}
	}

}