public class Piece {
    // stores the piece's position on the board
    private int row;
    private int column;

    public Piece(int row, int column){
        // starts the piece on it's inicial position
        // on the board
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public boolean move(int row, int column){
        // moves the piece to the given position
        this.row = row;
        this.column = column;
        return true;
    }

}
