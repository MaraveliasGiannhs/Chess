import java.util.Scanner;

public class ChessController {
    Scanner input = new Scanner(System.in);
    static ChessController chessController = new ChessController();

    public void pickColor() {
        int yourColor=9;
        Player player1 = new Player();
        Player player2 = new Player();

        while (yourColor!=0 && yourColor!=1){
            yourColor = input.nextInt();
            if (yourColor == 0) {
                player1.playFirstMove = true;
                player2.playFirstMove = false;
            } else if (yourColor == 1) {
                player1.playFirstMove = false;
                player2.playFirstMove = true;
            } else System.out.println("Try again");
        }
    }


}
