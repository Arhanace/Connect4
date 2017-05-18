public class WinLose {
	public boolean checkwinner(char player){

		// horizontalCheck 
		for (int j = 0; j<3 ; j++ ){
			for (int i = 0; i<7; i++){
				if (BoardPrinter.board[i][j] ==player && BoardPrinter.board[i][j+1]==player && BoardPrinter.board[i][j+2]==player && BoardPrinter.board[i][j+3]==player){
					return true;
				}           
			}
		}
		
		// verticalCheck
		for (int i = 0; i<4 ; i++ ){
			for (int j = 0; j<6; j++){
				if (BoardPrinter.board[i][j] == player && BoardPrinter.board[i+1][j] == player && BoardPrinter.board[i+2][j] == player && BoardPrinter.board[i+3][j] == player){
					return true;
				}           
			}
		}
		
		// ascendingDiagonalCheck 
		for (int i=3; i<7; i++){
			for (int j=0; j<3; j++){
				if (BoardPrinter.board[i][j] == player && BoardPrinter.board[i-1][j+1] ==player && BoardPrinter.board[i-2][j+2] == player && BoardPrinter.board[i-3][j+3] == player)
					return true;
			}
		}
		
		// descendingDiagonalCheck
		for (int i=3; i<7; i++){
			for (int j=3; j<6; j++){
				if (BoardPrinter.board[i][j] == player && BoardPrinter.board[i-1][j-1] == player && BoardPrinter.board[i-2][j-2] == player && BoardPrinter.board[i-3][j-3] == player)
					return true;
			}
		}
		return false;
	}
}
