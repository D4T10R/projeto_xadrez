package chess;

import boardgame.Board;

public class ChessMatch {
    
    // ATRIBUTOS
    private Board board;
    // ATRIBUTOS

    // CONSTRUTORES
    public ChessMatch() {
        board = new Board(8, 8);
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    // ENCAPSULAMENTO

    // METODOS
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i =0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
    // METODOS

}
