public class Board {

    // An array containing the white pieces
    private Piece[][] whitePieces = new Piece[8][8];
    // An array containing the black pieces
    private Piece[][] blackPieces = new Piece[8][8];


    public Board(){
        resetBoard();
    }

    public void resetBoard(){

        // clear all the positions of the board
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                whitePieces[i][j] = null;
                blackPieces[i][j] = null;
            }
        }

        for(int i = 0; i < 8; i++){ // creates the pieces on its inicial position
            // creates a line of white pawns
            whitePieces[1][i] = new Piece(); // new pawn
            // creates a line of black pawns
            blackPieces[6][i] = new Piece(); // new pawn
            if(i == 0 || i == 7){
                // creates a white tower
                whitePieces[0][i] = new Piece(); // new tower
                // creates a black tower
                blackPieces[7][i] = new Piece(); // new tower
            } else if(i == 1 || i == 6){
                // creates a white knight
                whitePieces[0][i] = new Piece(); // new knight
                // creates a black knight
                blackPieces[7][i] = new Piece(); // new knight
            } else if(i == 2 || i == 5){
                // creates a white bishop
                whitePieces[0][i] = new Piece(); // new bishop
                // creates a black bishop
                blackPieces[7][i] = new Piece(); // new bishop
            } else if(i == 3){
                // creates a white queen
                whitePieces[0][i] = new Piece(); // new queen
                // creates a black queen
                blackPieces[7][i] = new Piece(); // new queen
            } else if(i == 4){
                // creates a white queen
                whitePieces[0][i] = new Piece(); // new king
                // creates a black queen
                blackPieces[7][i] = new Piece(); // new king
            }



        }
    }

}
