public class Pawn extends Piece { // models a pawn
    public Pawn(int row, int column){
        super(row, column);
    }


    public boolean isValidMove(int row, int column, boolean whitePlays) {
        int movedRows = row - getRow();
        int movedColumns = Math.abs(column - getColumn());
        if(whitePlays){
            // check if the row movement is ok
            if((movedRows == 2 || movedRows == 1) && row == 1){
                // if the pawn is on initial position and move
                // more than two spaces or fewer than 1 space, not valid
                return false;
            } else if(movedRows != 1){
                // if it is not on initial position, it can only advance 1 row a time
                return false;
            }

            // check if the column movement is ok
            if(movedColumns != 0 && movedColumns != 1){
                // the pawn can't move more than one space in the diagonal move
                return false;
            }

        }
        return true;
    }
}
