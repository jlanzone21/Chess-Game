public class Bishop extends Piece {

    // Bishops move diagonally as far as they want
    public Bishop(int color) {
        super(color);
    }

    public Bishop(Bishop other) {
        super(other.getColor());
    }

    @Override
    public char getLetter() {
        return 'B';
    }

    @Override
    public Bishop makeCopy() {
        return new Bishop(this);
    }

    /**Returns true if a Bishop is allowed to move to a space
    * ie. if it is diagonal from the Bishop
    * And unblocked and in bounds */
    @Override
    public boolean validMove(int x, int y, int nY, int nX, Board currentBoard) {
        return false;
    }
}
