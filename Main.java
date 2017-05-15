import java.util.*;
class Main{
	public static void main(String[] args) {
		BoardPrinter g = new BoardPrinter();
		Game s = new Game();
		g.CreateBoard();
		g.PrintBoard();
		
		s.Player1();
		s.Player2();
	}
}
