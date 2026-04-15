public class Board {
    private Piece[][] spaces = new Piece[8][8];

    public Board() {
        //Fill board with starting spaces
    }

    public Piece getPieceAt(int x, int y)  {
        return null;
    }

    public void movePieceAt() {

    }

    public void removePieceAt(int x, int y) {

    }

    public boolean isFilled(int x, int y) {
        return false;
    }

    //Returns 3 if both teams have pieces left
    //Returns 2 if only BLACK has pieces left
    //Returns 1 if only RED has pieces left
    public int hasWon() {
        return 0;
    }
}
