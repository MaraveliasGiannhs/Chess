public class Board {

    //Board board = new Board();
    boolean switchColor;
    static String[][] map = new String[8][8];
    public Board(){
        for(int i=0;i<=7;i++){
            for (int j=0;j<=7;j++){
                if (switchColor)
                    this.map[i][j]="⬛";
                else this.map[i][j]="⬜";
                switchColor=!switchColor;
            }
            switchColor=!switchColor;
        }
    }











}
