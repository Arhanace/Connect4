import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardPrinter g = new BoardPrinter();
		Game s = new Game();
		g.CreateBoard();
		g.PrintBoard();
		
		s.Player1();
		s.Player2();

	}

}
