public class Board {

    // An array containing the white pieces
    private Piece[][] whitePieces = new Piece[8][8];
    // An array containing the black pieces
    private Piece[][] blackPieces = new Piece[8][8];
    // Controls who plays next
    private boolean whitePlays;

    private boolean playing;

    public Board(){
        playing = true;
        resetBoard();
    }

    public void resetBoard(){

        // white starts the game
        whitePlays = true;

        // clear all the positions of the board
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                whitePieces[i][j] = null;
                blackPieces[i][j] = null;
            }
        }

        for(int i = 0; i < 8; i++){ // creates the pieces on its initial position
            // creates a line of white pawns
            whitePieces[1][i] = new Piece(1, i); // new pawn
            // creates a line of black pawns
            blackPieces[6][i] = new Piece(6, i); // new pawn
            if(i == 0 || i == 7){
                // creates a white tower
                whitePieces[0][i] = new Piece(0, i); // new tower
                // creates a black tower
                blackPieces[7][i] = new Piece(7, i); // new tower
            } else if(i == 1 || i == 6){
                // creates a white knight
                whitePieces[0][i] = new Piece(0, i); // new knight
                // creates a black knight
                blackPieces[7][i] = new Piece(7, i); // new knight
            } else if(i == 2 || i == 5){
                // creates a white bishop
                whitePieces[0][i] = new Piece(0, i); // new bishop
                // creates a black bishop
                blackPieces[7][i] = new Piece(7, i); // new bishop
            } else if(i == 3){
                // creates a white queen
                whitePieces[0][i] = new Piece(0, i); // new queen
                // creates a black queen
                blackPieces[7][i] = new Piece(7, i); // new queen
            } else if(i == 4){
                // creates a white queen
                whitePieces[0][i] = new Piece(0, i); // new king
                // creates a black queen
                blackPieces[7][i] = new Piece(7, i); // new king
            }

        }
    }

    public boolean move(int row, int column, Piece piece){
        // checks if that's a legal move
        if(!inTheBoard(row, column)){
            return false; // I would throw my piece out of the board!
        }
        if(!freePosition(row, column)){
            return false; // I have a piece there!
        }

        // create a method that checks if there is any piece
        // on the way of my movement (except I am a horse)

        // create a method that checks if my king won't be
        // on check after my play

        // create a Piece method that check if my piece can
        // move to that position, considering which of the pieces is moving

        // create a method that checks if have I captured
        // an enemy's piece
        // if so, just delete the enemy's piece

        // move the given piece to the given position
        piece.move(row, column);


       return true;
    }


    public boolean freePosition(int row, int column){
        // checks if there is any piece of the same color there
        if(!whitePlays && blackPieces[row][column] != null)
            return false; // black plays and there is a black piece there
        if(whitePlays && whitePieces[row][column] != null)
            return false; // white plays and there is a white piece there
        return true; // there is no piece of the same color of the current player
    }

    public boolean inTheBoard(int row, int column){
        // checks if the piece is not being moved
        // to out of the board
        if(row < 0 || row > 7){
            return false; // out of the board!
        }
        if(column < 0 || column > 7){
            return false; // out of the board!
        }
        return true;
    }

}
