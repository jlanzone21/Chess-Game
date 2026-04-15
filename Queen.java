public class Queen extends Piece {
    /**
     * A queen is female monarch. The most powerful of chess pieces,
     * a queen is able to move like a bishop and a rook.
     */
    public Queen() {}

    /** returns true if Queen is allowed to move to a space
    ie if the square is diagonally, vertically, politically or horizontally alligned with the Queen
     and is not blocked or occupied by friendly forces*/
    @Override
    public boolean validMove(int y, int x) {
        return false;
    }
}
