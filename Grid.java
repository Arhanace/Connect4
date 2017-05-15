import java.util.*
public class BoardPrinter{
 public void CreateBoard(){
        for (int w = 0; width > w; w += 1) {
            for (int h = 0; height > h; h += 1) {
                board[w][h] = "*";
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
}
