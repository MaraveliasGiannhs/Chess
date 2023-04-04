//import javax.swing.*;
//import java.awt.*;
//import javax.swing.JPanel;
//import javax.swing.JFrame;
//
//public class Main {
//    public static void main(String[] args){
//
//
//        JFrame frame = new JFrame();
//        frame.setBounds(24,24,600,600);
//        JPanel panel = new JPanel(){
//            public void paint(Graphics graphics){
//
//                boolean white=true;
//
//                for (int x = 0;x<8;x++){
//                    for (int y = 0 ; y<8;y++){
//                        if (white){
//                            graphics.setColor(Color.white);
//                        }else graphics.setColor(Color.BLACK);
//                        graphics.fillRect(x*64,y*64,64,64);
//                        white=!white;
//                    }
//                    white=!white;
//                }
//            }
//        };
//        frame.add(panel);
//        frame.setDefaultCloseOperation(3);
//        frame.setVisible(true);
//
//
//
//    }
//} des meta^^^









// Controler: Dexete user input
//Chess_Service: efarmozei logikh twn praksewn.
public class View {
    public static void main(String[] args){



        Board board = new Board();
        String[] letters = {"A","B","C","D","E","F","G","H"};
        System.out.println(Piece.chessPiece.WHITE_BISHOP.type);
        System.out.println("   1 2 3 4  5 6 7 8");
        for(int i=0;i<=7;i++){
            System.out.printf(letters[i]+" ");
            for (int j=0;j<=7;j++){
                System.out.printf(board.map[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Choose your color (0 for White, 1 for Black) :  ");
        ChessController.chessController.pickColor();












    }
}





























