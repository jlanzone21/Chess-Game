public class Board {
    private Piece[][] board = new Piece[8][8];

    /**
     * Board is the class that holds all the Pieces and moves them around
     */
    public Board() {
        board[0][0] = new Rook(2);
        board[0][1] = new Knight(2);
        board[0][2] = new Bishop(2);
        board[0][3] = new Queen(2);
        board[0][4] = new King(2);
        board[0][5] = new Bishop(2);
        board[0][6] = new Knight(2);
        board[0][7] = new Rook(2);
        for (int i = 0; i < board.length; i++)
            board[1][i] = new Pawn(2);
        board[7][0] = new Rook(1);
        board[7][1] = new Knight(1);
        board[7][2] = new Bishop(1);
        board[7][3] = new Queen(1);
        board[7][4] = new King(1);
        board[7][5] = new Bishop(1);
        board[7][6] = new Knight(1);
        board[7][7] = new Rook(1);
        for (int i = 0; i < board.length; i++)
            board[6][i] = new Pawn(1);
    }

    public Board(Board other) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (other.getPieceAt(i,j) != null) {
                    board[i][j] = other.getPieceAt(i,j).makeCopy();
                }
            }
        }
    }
    /**
     * Method to get a Piece object at a certain index of the board
     * @param y the y-position of the piece
     * @param x the x-position of the piece
     * @return the Piece object at the specified index
     */
    public Piece getPieceAt(int y, int x)  {
        return board[y][x];
    }

    /**
     * Recieves chunks of info from a classic chess move call like 'kb3'
     * Checks all relevant Piece object's validMoves and then moves the corresponding piece to the desired location
     * @param letter to sort through all relevant pieces that could move to a space
     * @param color to determine whether a space if filled and unavailable or if taking a piece
     * @param nY the y-location of the desired move
     * @param nX the x-location of the desired move
     */
    public void movePiece(char letter, int color, int nY, int nX) throws Exception {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                // Checks if the color and letter of an object on the board match
                if (board[i][j] != null && spaceColor(i,j) == color
                        && board[i][j].getLetter() == letter) {
                    // Checks if the piece trying to move is the same team as the specified location
                    if (!(spaceColor(nY,nX) == color)) {
                        // Checks if the piece can move to the specified location
                        if (board[i][j].validMove(i, j, nY, nX, new Board(this))) {
                            //Actually move the piece
                            board[nY][nX] = board[i][j];
                            board[i][j] = null;
                        }
                    }
                }
            }
        }
        throw new Exception("Not a valid move");
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
    public int spaceColor(int y, int x) {
        if (board[y][x] == null)
            return 0;
        else
            return board[y][x].getColor();
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

    public String displayBoard() {
        StringBuilder sb = new StringBuilder();
        sb.append("   a  b  c  d  e  f  g  h  \n");
        for (int i = 0; i < board.length; i++) {
            sb.append(i+1).append("  ");
            for (int j = 0; j < board.length; j++) {
                if (this.getPieceAt(i,j) != null) {
                    sb.append(this.getPieceAt(i, j).getLetter()).append("  ");
                } else {
                    sb.append("□  ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
