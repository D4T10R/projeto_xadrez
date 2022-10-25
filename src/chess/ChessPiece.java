package chess;

import boardgame.Piece;
import boardgame.Board;

public class ChessPiece extends Piece {

    // ATRIBUTOS
    private Color color;
    private int moveCount;
    // ATRIBUTOS

    // CONSTRUTORES
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
        this.moveCount = moveCount;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public int getMoveCount() {
        return moveCount;
    }
    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }
    // ENCAPSULAMENTO

    
    
    

}
