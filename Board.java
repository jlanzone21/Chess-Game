import java.util.Scanner;

public class Board {
    private Piece[][] board = new Piece[8][8];

    /**
     * Board is the class that holds all the Pieces and moves them around
     */
    public Board() {
        board[0][0] = new Rook(1);
        board[0][1] = new Knight(1);
        board[0][2] = new Bishop(1);
        board[0][3] = new Queen(1);
        board[0][4] = new King(1);
        board[0][5] = new Bishop(1);
        board[0][6] = new Knight(1);
        board[0][7] = new Rook(1);
        for (int i = 0; i < board.length; i++)
            board[1][i] = new Pawn(1);
        board[7][0] = new Rook(-1);
        board[7][1] = new Knight(-1);
        board[7][2] = new Bishop(-1);
        board[7][3] = new Queen(-1);
        board[7][4] = new King(-1);
        board[7][5] = new Bishop(-1);
        board[7][6] = new Knight(-1);
        board[7][7] = new Rook(-1);
        for (int i = 0; i < board.length; i++)
            board[6][i] = new Pawn(-1);
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
                            if((letter =='p'|| letter =='P') && ((nY == 0 && color == -1) || (nY == 7 && color == 1))){
                                Scanner sc = new Scanner(System.in);
                                System.out.print("Promote to (ex. Q):");
                                char c = sc.next().trim().charAt(0);
                                if(Character.toLowerCase(c)=='q'){
                                    board[i][j] = new Queen(color);
                                } else if (Character.toLowerCase(c)=='n') {
                                    board[i][j] = new Knight(color);
                                } else if (Character.toLowerCase(c)=='r') {
                                    board[i][j] = new Rook(color);
                                } else if (Character.toLowerCase(c)=='b') {
                                    board[i][j] = new Bishop(color);
                                } else if (Character.toLowerCase(c)=='p') {
                                    board[i][j] = new Pawn(color);
                                } else {
                                    System.out.println("Character not recognized. ");
                                }
                            }
                            //Actually move the piece
                            board[nY][nX] = board[i][j];
                            board[i][j] = null;
                            return;
                        }
                    }
                }
            }
        }
        throw new Exception("Not a valid move");
    }

    public void kingSideCastle(int turn) throws Exception {
        if(turn == 1){
            if(getPieceAt(0,4).getLetter() == 'K' && getPieceAt(0,7).getLetter() == 'R'){
                King k = (King) getPieceAt(0,4);
                Rook r = (Rook) getPieceAt(0,7);
                if(!k.getHasMoved() && this.spaceColor(0,5) == 0 && this.spaceColor(0,6) == 0 && !r.getHasMoved()) {
                    board[0][6] = board[0][4];
                    board[0][5] = board[0][7];
                    board[0][4] = null;
                    board[0][7] = null;
                    k.hasMoved();
                    r.hasMoved();
                }
                else { throw new Exception("Castle Failed");}
            }
            else { throw new Exception("Castle Failed");}
        }
        else if (turn == -1) {
            if(board[7][4].getLetter() == 'k' && board[7][7].getLetter() == 'r'){
                King k = (King) getPieceAt(7,4);
                Rook r = (Rook) getPieceAt(7,7);
                if(!k.getHasMoved() && this.spaceColor(7,5) == 0 && this.spaceColor(7,6) == 0 && !r.getHasMoved()){
                    board[7][5] = board[7][7];
                    board[7][6] = board[7][4];
                    board[7][7] = null;
                    board[7][4] = null;
                    k.hasMoved();
                    r.hasMoved();
                }
                else { throw new Exception("Castle Failed");}
            }
            else { throw new Exception("Castle Failed");}
        }
    }



    public void queenSideCastle( int turn) throws Exception {
        if(turn == 1){
            if(getPieceAt(0,4).getLetter() == 'K' && getPieceAt(0,0).getLetter() == 'R'){
                King k = (King) getPieceAt(0,4);
                Rook r = (Rook) getPieceAt(0,0);
                if(!k.getHasMoved() && this.spaceColor(0,3) == 0 && this.spaceColor(0,2) == 0 && this.spaceColor(0,1) == 0 && !r.getHasMoved()) {
                    board[0][2] = board[0][4];
                    board[0][3] = board[0][0];
                    board[0][4] = null;
                    board[0][0] = null;
                    k.hasMoved();
                    r.hasMoved();
                }
                else { throw new Exception("Castle Failed");}
            }
            else { throw new Exception("Castle Failed");}
        }
        else if (turn == -1) {
            if(getPieceAt(7,4).getLetter() == 'k' && getPieceAt(7,0).getLetter() == 'r'){
                King k = (King) getPieceAt(7,4);
                Rook r = (Rook) getPieceAt(7,0);
                if(!k.getHasMoved() && this.spaceColor(7,3) == 0 && this.spaceColor(7,2) == 0 && this.spaceColor(7,1) == 0 && !r.getHasMoved()){
                    board[7][3] = board[7][0];
                    board[7][2] = board[7][4];
                    board[7][0] = null;
                    board[7][4] = null;
                    k.hasMoved();
                    r.hasMoved();
                }
                else { throw new Exception("Castle Failed");}
            }
            else { throw new Exception("Castle Failed");
            }
        }

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
     * Returns 0 if empty, 1 if it has WHITE, -1 if it has BLACK
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
     * Checks if a king can move to a new square without being in check
     * @param nY the y-position to look at
     * @param nX the x-position to look at
     * @param color the color of the king
     * @return "yx" the x-position and y-position of the king smooshed into a parseable String
     */
    public boolean isSafeKingMove(int nY, int nX, int color) {
        Board copy = new Board(this);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                }
            }
        return false;
    }

    /**
     * Looks for the king and returns its position
     * @param color the y-position to look at
     * @return "yx" the x-position and y-position of the king smooshed into a parseable String
     */
    public String whereTheHuzzAt(int color) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (getPieceAt(i, j).getColor() == color) {
                    if (getPieceAt(i, j).getLetter() == 'k' || getPieceAt(i, j).getLetter() == 'K')
                        return i + "" + j;
                }
            }
        }
        return null;
    }

    /**
     * If one team is in check and has no validMove, then they are in Checkmate and the other team wins
     * @return 1 for WHITE and 2 for BLACK wins, 0 if no win, and -1 if stalemate
     */
    public int hasWon(int activePlayerColor) {
        int oppositePlayerColor = activePlayerColor *-1;
        if (inCheck(oppositePlayerColor)) {
            // checks whether the king can move to a new spot
                        // TODO : check whether the oppositePlayer has any valid moves
        }
        return 0;
    }

    /**
     * Returns true if any piece of the OPPOSITE color has a validMove on your King
     * @return boolean
     */
    public boolean inCheck(int activePlayerColor) {
       // if Object on board is not my color and has validMove at my King's location, I am in check
        int oppositePlayerColor = activePlayerColor *-1;
        int kingY = whereTheHuzzAt(activePlayerColor).charAt(0)-'0';
        int kingX = whereTheHuzzAt(activePlayerColor).charAt(1)-'0';
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j ++) {
                if (getPieceAt(i,j).getColor() == oppositePlayerColor &&
                        getPieceAt(i,j).validMove(i, j, kingY, kingX, this)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String displayBoard() {
        StringBuilder sb = new StringBuilder();
        // TODO : Change this back
        sb.append("\n");
        //sb.append("\n   a  b  c  d  e  f  g  h  ");
        //sb.append("x->0  1  2  3  4  5  6  7  \n");
        for (int i = 7; i >= 0; i--) {
            // TODO : Change this back
            //sb.append(i).append("  ");
            sb.append(i + 1).append("  ");
            for (int j = 0; j < board.length; j++) {
                if (this.getPieceAt(i,j) != null) {
                    sb.append(this.getPieceAt(i, j).getLetter()).append("  ");
                } else {
                    sb.append("□  ");
                }
            }
            sb.append("\n");
        }
        sb.append("   a  b  c  d  e  f  g  h  \n");
        return sb.toString();
    }
}
