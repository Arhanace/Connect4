import java.util.*;
public class BoardPrinter{
  public boolean [][] array = new boolean [6][6];
  public String board[][] = new String[6][6];
  public boolean Red, Yellow;
  public int width=5;
  public int height=5;
  
  public BoardPrinter(){
    Red = true;
    Yellow = false;
    width= 6;
    height= 6;
  }
		
	
	public void CreateBoard(){
      for (int count=0; count<width; count++){
    	 for (int count2=0; count2<height; count++){
    		 board[count][count2] = "*";
    	 }
      }
    }
    public void PrintBoard(){
        //prints the board
        for (int w = 0; width > w; w++) {
            for (int h = 0; height > h; h++) {
                System.out.print(board[w][h] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}

