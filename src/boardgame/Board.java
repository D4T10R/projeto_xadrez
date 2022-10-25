package boardgame;

public class Board {
    
    // ATRIBUTOS
    private int rows;
    private int columns;
    private Piece[][] pieces;
    // ATRIBUTOS

    // CONSTRUTORES
    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[rows][columns];
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
    //ENCAPSULAMENTO

    // METODOS
    public Piece piece(int row, int column) {
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }
    
    
    

}
