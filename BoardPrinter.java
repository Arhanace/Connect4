import java.util.*;
public class BoardPrinter {

	public char board[][] = new char[7][6]; // creates an array of characters
	public int width, height;
	public int Red, Yellow;

	public BoardPrinter() {
		width = 7;
		height = 6;
		Red = 0; // red disk represented by a 0
		Yellow = 1; // yellow disk represented by a 1
	}

	public void CreateBoard() {// initializes board by setting each value as a *

		for (int count = 0; count < width; count++) {
			for (int count2 = 0; count2 < height; count2++) {
				board[count][count2] = '*';

			}
		}
	}

	public void PrintBoard() {// prints out board for the first time
		// prints the board
		for (int h = 0; h < height; h++) {
			for (int w = 0; w < width; w++) {
				System.out.print(board[w][h] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void Reprint(int[][] array) {// reprints the board after each turn

		for (int count = 0; count < 7; count++) {// changes * to either X or O
													// based on player selection

			for (int count2 = 0; count2 < 6; count2++) {// checks for yellows
														// then changes * to 0
				if (array[count][count2] == Red) {
					board[count][count2] = 'X';
				} else if (array[count][count2] == Yellow) {// checks for
															// yellows then
															// changes * to 1
					board[count][count2] = 'O';
				} else
					board[count][count2] = '*';
			}
		}
		for (int h = 0; h < height; h++) {// prints out board with revised grid
			for (int w = 0; w < width; w++) {
				System.out.print(board[w][h] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	public boolean checkwinnerPlayer1() {
		if (checkhoriz1()==true || checkdiagfwd1()==false || checkvert1()==true || checkdiagback1()==false)
			return true;
		else 
			return false;
	}
	public boolean checkwinnerPlayer2() {
		if (checkhoriz2()==true || checkdiagfwd2()==false || checkvert2()==true || checkdiagback2()==false)
			return true;
		else 
			return false;
	}
	
	public boolean checkhoriz1(){
	
    boolean flag = false;//creates boolean to act as flag

    int counter = 0;//creates counter
    while(flag){//goes through board horizontally

      for(int w = 0; 7 > w; w += 1){
        for(int h = 0; 6 > h; h += 1){
          if(board[w][h] == 'X'){ //if it finds an X, add 1 to counter
            counter += 1;
          }
          else{
            counter = 0; // if next piece is not an X, set counter to 0
          }
          if(counter >= 4){
            flag = true;
          }
        }
      }
      break;
    }
    return flag;
	}
	public boolean checkvert1(){

    boolean flag = false;//creates boolean to act as flag

    int counter = 0;//creates counter
    while(flag){

      //goes through board vertically
      for(int h = 0; 7 > h; h += 1){
        for(int w = 0; 6 > w; w += 1){
          if(board[w][h] == 'X'){ //if it finds an X, add 1 to counter
            counter += 1;
          }else{
            counter = 0; // if next piece is not an X, set counter to 0
          }
          if(counter >= 4){
            flag = true;
          }
        }
      }
      break;
    }
    return flag;
	}
	public boolean checkdiagfwd1(){
		 //flag
    boolean flag = true;

    //counter
    int counter = 0;

    //check boolean
    Boolean check = false;

    //checkers
    int checkColumn = 1;
    int checkRow = 1;

    while(flag){ //goes through until an X is found
      for(int w = 0; 7 > w; w += 1){
        for(int h = 0; 6 > h; h += 1){
          if(board[w][h] == 'X'){ //if X is found, add one to counter and go into loop
            counter += 1;
            check = true;
            while(check){ //goes through diagonally looking for Xs
              if(checkColumn + w <= 7 - 1&& checkRow + h <= 6 - 1){
                if(board[w + checkColumn][h + checkRow] == 'X'){ //if X is found, add 1 to counter
                  counter += 1;
                }
              }

              //adds 1 to checkers
              checkColumn += 1;
              checkRow += 1;

              if(checkColumn == 7 -1 || checkRow == 6 -1){ //if outside of board, break
                check = false;
                break;
              }

              if(counter >= 4){
                check = false;
                flag = false;
                break;
              }
            }
          }
          if(counter >= 4){
            flag = false;
            break;
          }

          //resets counter and checkers
          counter = 0;
          checkColumn = 1;
          checkRow = 1;
        }
      }
      break;
    }
    return flag;
	}
	public boolean checkdiagback1(){

		//flag
    boolean flag = true;

    //counter
    int counter = 0;

    //check boolean
    Boolean check = false;

    //checkers
    int checkColumn = 1;
    int checkRow = 1;

    while(flag){ //goes through until an X is found
      for(int w = 0; 7 > w; w += 1){
        for(int h = 0; 6 > h; h += 1){
          if(board[w][h] == 'X'){ //if X is found, add one to counter and go into loop
            counter += 1;
            check = true;
            while(check){ //goes through diagonally looking for Xs
              if(w - checkColumn >= 0 && h - checkRow >= 0){
                if(board[w - checkColumn][h - checkRow] == 'X'){
                  counter += 1; //if X is found, add 1 to counter
                }
              }

              //adds 1 to checkers
              checkColumn += 1;
              checkRow += 1;

              if(checkColumn == 0 || checkRow == 6 -1){ //if outside of board, break
                check = false;
                break;
              }

              if(counter >= 4){
                check = false;
                flag = false;
                break;
              }
            }
          }
          if(counter >= 4){
            flag = false;
            break;
          }

          //resets counter and checkers
          counter = 0;
          checkColumn = 1;
          checkRow = 1;
        }
      }
      break;
    }
    return flag;
		
	}
	public boolean checkhoriz2(){

		
		boolean flag = false;//creates boolean to act as flag

	        int counter = 0;//creates counter
	        while(flag){//goes through board horizontally

	            for(int w = 0; 7 > w; w += 1){
	                for(int h = 0; 6 > h; h += 1){
	                    if(board[w][h] == 'O'){ //if it finds an X, add 1 to counter
	                        counter += 1;
	                    }
	                    else{
	                        counter = 0; // if next piece is not an X, set counter to 0
	                    }
	                    if(counter >= 4){
	                        flag = true;
	                    }
	                }
	            }
	            break;
	        }
	        return flag;
		
	}
	public boolean checkvert2(){
		  boolean flag = false;//creates boolean to act as flag

	        int counter = 0;//creates counter
	        while(flag){

	            //goes through board vertically
	            for(int h = 0; 7 > h; h += 1){
	                for(int w = 0; 6 > w; w += 1){
	                    if(board[w][h] == 'O'){ //if it finds an X, add 1 to counter
	                        counter += 1;
	                    }else{
	                        counter = 0; // if next piece is not an X, set counter to 0
	                    }
	                    if(counter >= 4){
	                        flag = true;
	                    }
	                }
	            }
	            break;
	        }
	        return flag;
	}
	public boolean checkdiagfwd2(){
		 //flag
    boolean flag = true;

    //counter
    int counter = 0;

    //check boolean
    Boolean check = false;

    //checkers
    int checkColumn = 1;
    int checkRow = 1;

    while(flag){ //goes through until an X is found
      for(int w = 0; 7 > w; w += 1){
        for(int h = 0; 6 > h; h += 1){
          if(board[w][h] == 'O'){ //if X is found, add one to counter and go into loop
            counter += 1;
            check = true;
            while(check){ //goes through diagonally looking for Xs
              if(checkColumn + w <= 7 - 1&& checkRow + h <= 6 - 1){
                if(board[w + checkColumn][h + checkRow] == 'O'){ //if X is found, add 1 to counter
                  counter += 1;
                }
              }

              //adds 1 to checkers
              checkColumn += 1;
              checkRow += 1;

              if(checkColumn == 7 -1 || checkRow == 6 -1){ //if outside of board, break
                check = false;
                break;
              }

              if(counter >= 4){
                check = false;
                flag = false;
                break;
              }
            }
          }
          if(counter >= 4){
            flag = false;
            break;
          }

          //resets counter and checkers
          counter = 0;
          checkColumn = 1;
          checkRow = 1;
        }
      }
      break;
    }
    return flag;
	}
	public boolean checkdiagback2(){
		//flag
    boolean flag = true;

    //counter
    int counter = 0;

    //check boolean
    Boolean check = false;

    //checkers
    int checkColumn = 1;
    int checkRow = 1;

    while(flag){ //goes through until an X is found
      for(int w = 0; 7 > w; w += 1){
        for(int h = 0; 6 > h; h += 1){
          if(board[w][h] == 'O'){ //if X is found, add one to counter and go into loop
            counter += 1;
            check = true;
            while(check){ //goes through diagonally looking for Xs
              if(w - checkColumn >= 0 && h - checkRow >= 0){
                if(board[w - checkColumn][h - checkRow] == 'O'){
                  counter += 1; //if X is found, add 1 to counter
                }
              }

              //adds 1 to checkers
              checkColumn += 1;
              checkRow += 1;

              if(checkColumn == 0 || checkRow == 6 -1){ //if outside of board, break
                check = false;
                break;
              }

              if(counter >= 4){
                check = false;
                flag = false;
                break;
              }
            }
          }
          if(counter >= 4){
            flag = false;
            break;
          }

          //resets counter and checkers
          counter = 0;
          checkColumn = 1;
          checkRow = 1;
        }
      }
      break;
    }
    return flag;
	}
	
}

