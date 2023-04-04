public class Piece {
    public enum chessPiece {
        BLACK_KING("♚"),
        BLACK_QUEEN("♛"),
        BLACK_ROOK("♜"),
        BLACK_KNIGHT("♞"),
        BLACK_BISHOP("♝"),
        BLACK_PAWN("♟"),
        WHITE_KING("♔"),
        WHITE_QUEEN("♕"),
        WHITE_ROOK("♖"),
        WHITE_KNIGHT("♘"),
        WHITE_BISHOP("♗"),
        WHITE_PAWN("♙");
        final String type;
        chessPiece(String pieceType) {
            this.type = pieceType;
        }
    }
    String name;
    int points, x, y,checkColor;  //0 white, 1 black
    Piece.chessPiece emoji;   //enum type
    Boolean isOnBoard;

    public Piece(String name, int points, Piece.chessPiece emoji,boolean isOnBoard ) {
        this.name = name;
        this.points = points;
        this.emoji = emoji;
        this.isOnBoard = isOnBoard;
    }
    public void destroyThisPiece(){

    }


}

class WKing extends Piece {
    public WKing() {
        super("White King", 10,chessPiece.valueOf(chessPiece.WHITE_KING.type),true);
    }
}
class BKing extends Piece {
    public BKing() {
        super("Black King", 10,chessPiece.BLACK_KING,true);
    }
}

class WQueen extends Piece {
    public WQueen() {
        super("White Queen", 9, chessPiece.WHITE_QUEEN,true);
    }
}
class BQueen extends Piece {
    public BQueen() {
        super("Black Queen", 9, chessPiece.BLACK_QUEEN,true);
    }
}

class WRook extends Piece {
    public WRook() {
        super("White Rook", 5, chessPiece.WHITE_ROOK,true);
    }
}
class BRook extends Piece {
    public BRook() {
        super("Black Rook", 5, chessPiece.BLACK_ROOK,true);
    }
}

class WBishop extends Piece {
    public WBishop() {
        super("White Bishop", 3, chessPiece.WHITE_BISHOP,true);
    }
}
class BBishop extends Piece {
    public BBishop() {
        super("White Bishop", 3, chessPiece.BLACK_BISHOP,true);
    }
}

class WKnight extends Piece {
    public WKnight() {
        super("White Knight", 3, chessPiece.WHITE_KNIGHT,true);
    }
}
class BKnight extends Piece {
    public BKnight() {
        super("Black Knight", 3, chessPiece.BLACK_KNIGHT,true);
    }
}

class WPawn extends Piece {
    public WPawn() {
        super("White Pawn", 1, chessPiece.WHITE_PAWN,true);
    }
}
class BPawn extends Piece {
    public BPawn() {
        super("Black Pawn", 1, chessPiece.BLACK_PAWN,true);
    }
}




