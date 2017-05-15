import java.util.*;
public class BoardPrinter{
  public char board[][] = new char[7][6];
  public int width, height;
  
  public BoardPrinter(){
    Red = true;
    Yellow = false;
    width= 7;
    height= 6;
  }
		
	
	public void CreateBoard(){
      for (int count=0; count<6; count++){
    	 for (int count2=0; count2<5; count++){
    		 board[count][count2] = '*';
    	 }
      }
    }
    public void PrintBoard(){
        //prints the board
        for (int w = 0; width > w; w += 1) {
            for (int h = 0; height > h; h += 1) {
                System.out.print(board[w][h] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}

