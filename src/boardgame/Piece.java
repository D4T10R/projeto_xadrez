package boardgame;

public class Piece {
    
    // ATRIBUTOS
    protected Position position;
    private Board board;
    // ATRIBUTOS

    // CONSTRUTORES
    public Piece(Board board) {
        this.board = board;
        position = null;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    protected Board getBoard() {
        return board;
    }
    // ENCAPSULAMENTO

    // METODOS
    // METODOS

}
