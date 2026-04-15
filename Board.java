public class Board {
    private Piece[][] board = new Piece[8][8];

    /**
     * Board is the class that holds all the Pieces and moves them around
     */
    public Board() {
        board[0][0] = new Rook(false);
        board[0][1] = new Knight(false);
        board[0][2] = new Bishop(false);
        board[0][3] = new Queen(false);
        board[0][4] = new King(false);
        board[0][5] = new Bishop(false);
        board[0][6] = new Knight(false);
        board[0][7] = new Rook(false);
    }

    /**
     * Method to get a Piece object at a certain index of the board
     * @param y the y-position of the piece
     * @param x the x-position of the piece
     * @return the Piece object at the specified index
     */
    public Piece getPieceAt(int y, int x)  {
        return null;
    }

    /**
     * Checks the Piece object's validMove and the moves the piece to the desired location
     * @param y  the current y-position of the piece
     * @param x  the current x-position of the piece
     * @param nY the y-location of the desired move
     * @param nX the x-location of the desired move
     */
    public void movePieceAt(int y, int x, int nY, int nX) {

    }

    /**
     * Removes the Piece object at Coordinates [y][x] from the board array
     * Represents taking a piece
     * @param y the y-position of the piece
     * @param x the x-position of the piece
     */
    public void removePieceAt(int y, int x) {

    }

    /**
     * Returns 0 if empty, 1 if it has WHITE, 2 if it has BLACK
     * @param y the y-position to look at
     * @param x the x-position to look at
     * @return int
     */
    public int isFilled(int y, int x) {
        return 0;
    }

    /**
     * If one team is in check and has no validMove, then they are in Checkmate and the other team wins
     * @return 1 for WHITE and 2 for BLACK wins, 0 if no win, and -1 if stalemate
     */
    public int hasWon() {
        return 0;
    }

    /**
     * Returns true if any opposing piece has a validMove on your King
     * @return boolean
     */
    public boolean inCheck() {
       // if Object on board is not my color and has validMove at my King's location, I am in check
        return false;
    }
}
